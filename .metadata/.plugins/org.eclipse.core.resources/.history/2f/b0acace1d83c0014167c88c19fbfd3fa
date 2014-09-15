package com.example.simpleui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
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
}
