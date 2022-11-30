package com.daovietgiao.daovietgiao_bkt3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText User;
    private EditText Password;
    private Button Login;
    private CheckBox cbRemember;

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        sharedPreferences = getSharedPreferences("dataLogin", MODE_PRIVATE);
        User.setText(sharedPreferences.getString("taikhoan",""));
        Password.setText(sharedPreferences.getString("matkhau",""));
        cbRemember.setChecked(sharedPreferences.getBoolean("checked",false));

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = User.getText().toString().trim();
                String password = Password.getText().toString().trim();

                if(username.equals("daovietgiao") && password.equals("123456")){
                    Toast.makeText(MainActivity.this,"Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(MainActivity.this, com.daovietgiao.daovietgiao_bkt3.ListActivity.class);
                    startActivity(intent);
                    if(cbRemember.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan", username);
                        editor.putString("matkhau", password);
                        editor.putBoolean("checked", true);
                        editor.apply();
                    }else{
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("taikhoan");
                        editor.remove("matkhau");
                        editor.remove("checked");
                        editor.apply();
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Lỗi đăng nhập", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void AnhXa(){
        Login = (Button)findViewById(R.id.LoginButton);
        User = (EditText)findViewById(R.id.editTextUser);
        Password = (EditText)findViewById(R.id.editTextPassword);
        cbRemember = (CheckBox) findViewById(R.id.checkBoxRemember);
    }
}