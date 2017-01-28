package com.myfirstapplicaction.miguel.secondboston;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void submit(View view) {
        EditText editText = (EditText) findViewById(R.id.ChooseEmail);
        EditText editPassword = (EditText) findViewById(R.id.ChoosePassword);
        String email = editText.getText().toString();
        String password = editPassword.getText().toString();
        if(AccountManager.accounts.containsKey(email)){
            TextView somethingWrong = (TextView) findViewById(R.id.SomethingWentWrong);
            editText.setText("");
            editPassword.setText("");
            somethingWrong.setText(R.string.Insert_valid_email);
        }else{
            AccountManager.addAccount(email,password);
            finish();
        }
    }
}
