package com.myfirstapplicaction.miguel.secondboston;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LogInRoutine(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        EditText editText = (EditText)findViewById(R.id.InsertEmail);
        EditText editText1 = (EditText)findViewById(R.id.InsertPassword);
        String accountName = editText.getText().toString();
        String password = editText1.getText().toString();
        if(AccountManager.accounts.containsKey(accountName) &&
                AccountManager.accounts.containsValue(password)){
            startActivity(intent);
        }else{
            TextView logInError =(TextView) findViewById(R.id.SomethingWentWrong);
            logInError.setText(R.string.email_pass_wrong);
            editText.setText("");
            editText1.setText("");
        }
    }
    public void register(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}
