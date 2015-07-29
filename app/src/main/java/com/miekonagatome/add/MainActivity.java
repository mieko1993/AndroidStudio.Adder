package com.miekonagatome.add;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText editText_number1, editText_number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_number1=(EditText)findViewById(R.id.editText_number1);
        editText_number2=(EditText) findViewById(R.id.editText_number2);
    }

    //when the button add is clicked
    public void addOnclick(View view){
        int number1= Integer.parseInt(editText_number1.getText().toString());
        int number2= Integer.parseInt(editText_number1.getText().toString());
        //Call activity result
        Intent i= new Intent(this,Result.class);
        i.putExtra("number1",number1);
        i.putExtra("number2",number2);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_delete) {
            editText_number1.setText("");
            editText_number2.setText("");
        }
        if (id == R.id.action_information) {
            Toast.makeText(this, "Create by mieko1993",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
