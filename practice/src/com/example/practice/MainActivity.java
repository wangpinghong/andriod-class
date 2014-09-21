package com.example.practice;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	private EditText edittext;
	private Button button ,button2;
	private CheckBox checkbox;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		edittext=(EditText)findViewById(R.id.editText1);
		button =(Button)findViewById(R.id.button1);
		button =(Button)findViewById(R.id.button2);
		checkbox=(CheckBox)findViewById(R.id.checkBox1);
		
		button.setText("Send");
		button2.setText("ListView");
		checkbox.setText("Save");
	
		
		setContentView(R.layout.activity_main);
	}

	public void	sendtext(){
		String text = edittext.getText().toString();
		
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
		
		
	}
	public void showlistview(){
		Intent intent =new Intent();
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
