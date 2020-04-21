package com.example.hack1;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Addinfo extends Activity {

    EditText u_name, u_mothername, u_fathername, u_datebirth, u_nid, u_parmanent, u_blood, u_mobile, u_password;

    Button save_data;

    String user_name, user_motherName, user_fatherName, user_dateBirth, user_nid, user_parmanentAddress, user_bloddGroup, user_mobile, user_password;

    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_info_layout);


        u_name=(EditText) findViewById(R.id.u_name);
        u_mothername=(EditText) findViewById(R.id.u_mothername);
        u_fathername=(EditText) findViewById(R.id.u_fathername);
        u_datebirth=(EditText) findViewById(R.id.u_datebirth);
        u_nid=(EditText) findViewById(R.id.u_nid);
        u_parmanent=(EditText) findViewById(R.id.u_parmanent);
        u_blood=(EditText) findViewById(R.id.u_blood);
        u_mobile=(EditText) findViewById(R.id.u_mobile);
        u_password=(EditText) findViewById(R.id.u_password);

        save_data=(Button) findViewById(R.id.save_data);

        textView1=(TextView) findViewById(R.id.textView1);
//        textView2=(TextView) findViewById(R.id.textView2);
//        textView3=(TextView) findViewById(R.id.textView3);
//        textView4=(TextView) findViewById(R.id.textView4);
//        textView5=(TextView) findViewById(R.id.textView5);
//        textView6=(TextView) findViewById(R.id.textView6);
//        textView7=(TextView) findViewById(R.id.textView7);
//        textView8=(TextView) findViewById(R.id.textView8);
//        textView9=(TextView) findViewById(R.id.textView9);
//        textView10=(TextView) findViewById(R.id.textView10);

    }

    public void saveData(View view)
    {

            user_name=u_name.getText().toString();
            user_motherName=u_mothername.getText().toString();
            user_fatherName=u_fathername.getText().toString();
            user_dateBirth=u_datebirth.getText().toString();
            user_nid=u_nid.getText().toString();
            user_parmanentAddress=u_parmanent.getText().toString();
            user_bloddGroup=u_blood.getText().toString();
            user_mobile=u_mobile.getText().toString();
            user_password=u_password.getText().toString();



            BackgroundTask backgroundTask=new BackgroundTask();
            backgroundTask.execute(user_name, user_motherName, user_fatherName, user_dateBirth, user_nid, user_parmanentAddress, user_bloddGroup, user_mobile, user_password);
            finish();

        startActivity(new Intent(this,homeMenu.class));
    }

    class BackgroundTask extends AsyncTask<String,Void,String>
    {
        String infoUrl;

        @Override
        protected void onPreExecute() {
            infoUrl="https://microinlo.000webhostapp.com/insert.php";
        }

        @Override
        protected String doInBackground(String... args) {
            String user_name, user_motherName, user_fatherName, user_dateBirth, user_nid, user_parmanentAddress, user_bloddGroup, user_mobile, user_password;
            user_name=args[0];
            user_motherName=args[1];
            user_fatherName=args[2];
            user_dateBirth=args[3];
            user_nid=args[4];
            user_parmanentAddress=args[5];
            user_bloddGroup=args[6];
            user_mobile=args[7];
            user_password=args[8];

            try {
                URL url=new URL(infoUrl);
                HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));

                String data_String= URLEncoder.encode("user_name","UTF-8") + "=" + URLEncoder.encode(user_name,"UTF-8")+ "&"+
                        URLEncoder.encode("user_motherName","UTF-8") + "=" + URLEncoder.encode(user_motherName,"UTF-8")+ "&"+
                        URLEncoder.encode("user_fatherName","UTF-8") + "=" + URLEncoder.encode(user_fatherName,"UTF-8")+ "&"+
                        URLEncoder.encode("user_dateBirth","UTF-8") + "=" + URLEncoder.encode(user_dateBirth,"UTF-8")+ "&"+
                        URLEncoder.encode("user_nid","UTF-8") + "=" + URLEncoder.encode(user_nid,"UTF-8")+ "&"+
                        URLEncoder.encode("user_parmanentAddress","UTF-8") + "=" + URLEncoder.encode(user_parmanentAddress,"UTF-8")+ "&"+
                        URLEncoder.encode("user_bloddGroup","UTF-8") + "=" + URLEncoder.encode(user_bloddGroup,"UTF-8")+ "&"+
                        URLEncoder.encode("user_mobile","UTF-8") + "=" + URLEncoder.encode(user_mobile,"UTF-8")+ "&"+
                        URLEncoder.encode("user_password","UTF-8") + "=" + URLEncoder.encode(user_password,"UTF-8");

                bufferedWriter.write(data_String);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();

                InputStream inputStream= httpURLConnection.getInputStream();
                inputStream.close();
                httpURLConnection.disconnect();

                Log.i("vv","hie");
                return "One Row data inserted!";


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
        }

    }
}
