package com.example.simpleui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MessageActivity extends Activity {

private ListView listview;

protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	listview=(ListView)findViewById(R.id.listView1);
	
	super.onCreate(savedInstanceState);
	
	String text=getIntent().getStringExtra("text");
	
	writefile(text);
	String data =readfile();
	
	ArrayAdapter <String> adapter= new ArrayAdapter<String>(this, 
			android.R.layout.simple_list_item_1, data.split("\n"));
	
    listview.setAdapter(adapter);
}

private void writefile (String text){
	text+="\n";
	try {
		FileOutputStream fos = openFileOutput("History.txt", Context.MODE_APPEND);
		fos.write(text.getBytes());
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

private String readfile(){
	try {
		FileInputStream fis = openFileInput("History.txt");
		byte[] buffer=new byte[1024];
		fis.read(buffer);
		fis.close();
		return new String(buffer);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return null;
}
}
