package com.example.saket.sharedprefrences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    EditText txtName,txtContact;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName=(EditText)findViewById(R.id.txtname);
        txtContact=(EditText)findViewById(R.id.txtContact);
        preferences=getSharedPreferences("Contacts",MODE_APPEND);


    }
    public  void addContact(View v)
    {
        try
        {
         SharedPreferences.Editor editor=preferences.edit();
         editor.putString(txtName.getText().toString(),txtContact.getText().toString());
         if(editor.commit()==true)
         {
             Toast.makeText(getBaseContext(),"Success",Toast.LENGTH_LONG).show();
            txtContact.setText("");
            txtName.setText("");
             txtContact.setText("");
            txtName.requestFocus();}
            else{
             Toast.makeText(getBaseContext(),"Failed",Toast.LENGTH_LONG).show();
         }
        }catch(Exception ex)
        {
            Toast.makeText(getBaseContext(),ex.getMessage(),Toast.LENGTH_LONG).show();
        }
        }
    public void showContact(View v)
    {
        Intent intent=new Intent(this,contact.class);
        startActivity(intent);

       /* Map<String,Integer>map=(Map<String,Integer>)preferences.getAll();
        Toast.makeText(getBaseContext(),map.toString(),Toast.LENGTH_LONG).show();*/
    }
}
