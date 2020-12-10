package com.example.tedws;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenG(View view) {
    }

    public void Openotdelbank(View view) {

       //Intent intent=new Intent(this,Work_bank.class);
        //startActivity(intent);

    }


    public void Opendialog(View view) {
        AlertDialog.Builder dialogalr=new AlertDialog.Builder(this);
        dialogalr
                .setTitle("Авторизация")
                .setMessage("Введите ваш логин и пароль")
                .setPositiveButton("Добавить", null)
                .setNegativeButton("Отмена", null);

        final View dial = getLayoutInflater().inflate(R.layout.dialogalr,null);

        dialogalr.setView(dial);

        dialogalr.create().show();
    }
}