package com.example.khodary.jamhub;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Signup extends Activity {

    EditText username;
    EditText pass;
    EditText confirmpass;
    EditText email;
    EditText fname;
    EditText lname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username=(EditText) findViewById(R.id.editText);
        pass=(EditText) findViewById(R.id.editText2);
        confirmpass=(EditText) findViewById(R.id.editText3);
        email=(EditText) findViewById(R.id.editText4);
        fname=(EditText) findViewById(R.id.editText5);
        lname=(EditText) findViewById(R.id.editText6);
        Button signin=(Button)findViewById(R.id.button3);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pass.getText().equals(confirmpass.getText())){
                    return;
                }
                else
                {
                    Toast toast=Toast.makeText(getApplicationContext(),"Please check both password and confirm password to be the same",Toast.LENGTH_LONG);
                    toast.show();
                }

                if((username.getText().toString().equals("")) ||(email.getText().toString().equals(""))||(fname.getText().toString().equals(""))||(lname.getText().toString().equals(""))||(pass.getText().toString().equals(""))||(confirmpass.getText().toString().equals(""))){
                    Toast toast=Toast.makeText(getApplicationContext(),"Please fill out all the fields",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_signup, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
