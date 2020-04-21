package com.example.hack1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button add_info,view_info;

    TextView textView, textView133, textView134, textView135;

    EditText editText_user, editText_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_info=(Button) findViewById(R.id.add_info);

        view_info=(Button) findViewById(R.id.view_info);

        textView=(TextView) findViewById(R.id.textView);
        textView133=(TextView) findViewById(R.id.textView133);
        textView134=(TextView) findViewById(R.id.textView134);
        textView135=(TextView) findViewById(R.id.textView135);

        editText_user= findViewById(R.id.editText_user);
        editText_password= findViewById(R.id.editText_password);


//        view_info.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view)
//            {
//                Intent intent=new Intent(MainActivity.this,JSON.class);
//                startActivity(intent);
//            }
//        });


        ConnectivityManager connectivityManager=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();

        if(networkInfo!=null && networkInfo.isConnected())
        {
            textView.setVisibility(View.INVISIBLE);
        }
        else
        {
            add_info.setEnabled(false);
            view_info.setEnabled(false);
        }
    }

    public void addInfo(View view)
    {
        startActivity(new Intent(this,Addinfo.class));
    }

    public void viewInfo(View view)
    {
        startActivity(new Intent(this,homeMenu.class));
    }

}
