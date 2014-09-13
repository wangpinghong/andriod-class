package com.example.simpleui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	private Button button , button2 ;
	private EditText edittext;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        edittext=(EditText)findViewById(R.id.editText1);
        button=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        
        button.setText("Clear");
        button2.setText("Show");
        
        button.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ClearText();
			}
		});
        
        button2.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			ShowText();
			ClearText();
			}
		});
        
        setContentView(R.layout.activity_main);
    }


    public void ClearText(){
        edittext.setText("");	
    }
    
    public void ShowText(){
    	
    	String text = edittext.getText().toString();
    	Toast.makeText(this, text, Toast.LENGTH_LONG).show();
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
