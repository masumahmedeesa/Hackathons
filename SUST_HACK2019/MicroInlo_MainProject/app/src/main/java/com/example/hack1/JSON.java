package com.example.hack1;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JSON extends Activity {

    String jsonAppear;
    Button get_json, parse_json;
    TextView json_viewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);

        json_viewer=(TextView) json_viewer.findViewById(R.id.json_viewer);
        get_json=(Button) get_json.findViewById(R.id.get_json);
        parse_json=(Button) parse_json.findViewById(R.id.parse_json);


    }

    public void getJson(View view) {
        new BackgroundTask().execute();
    }

    public void parseJson(View view) {
    }

    class BackgroundTask extends AsyncTask< Void,Void,String>
    {
        String jsonUrl;

        @Override
        protected void onPreExecute() {
            jsonUrl="https://microinlo.000webhostapp.com/jsonGetData.php";
        }

        @Override
        protected String doInBackground(Void... voids) {

            try {
                URL url = new URL(jsonUrl);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();

                while ((jsonAppear = bufferedReader.readLine()) != null) {
                    stringBuilder.append(jsonAppear + "\n");
                }

                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();

                return stringBuilder.toString().trim();
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
            json_viewer.setText(result);
        }

    }
}
