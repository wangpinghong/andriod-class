package com.example.simpleui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends Activity {

private TextView textView;

protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	textView=(TextView)findViewById(R.id.textView1);
	
	super.onCreate(savedInstanceState);
	
	String text=getIntent().getStringExtra("text");
	textView.setText(text);
}

private void writefile (String text){
	try {
		FileOutputStream fos = openFileOutput("History", Context.MODE_APPEND);
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
}
