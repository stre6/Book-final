package com.kaka.book;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by stre6 on 2016-12-28.
 */

public class Join extends AppCompatActivity {
    EditText id, pa, name, cattle, gra, phone;
    Button btn1, btn2;
    TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);
        id = (EditText) findViewById(R.id.id);
        pa = (EditText) findViewById(R.id.pa);
        name = (EditText) findViewById(R.id.name);
        cattle = (EditText) findViewById(R.id.cattle);
        gra = (EditText) findViewById(R.id.gra);
        phone = (EditText) findViewById(R.id.phone);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        text = (TextView) findViewById(R.id.txt);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id.setText("");
                pa.setText("");
                name.setText("");
                cattle.setText("");
                gra.setText("");
                phone.setText("");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String i = id.getText().toString();
                String p = pa.getText().toString();
                String n = name.getText().toString();
                String c = cattle.getText().toString();
                int g = Integer.parseInt(gra.getText().toString());
                String ph = phone.getText().toString();
                insertToDatabase(i, p, n, c, g, ph);
                Toast.makeText(Join.this, "회원가입 성공", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    private void insertToDatabase(String i, String p, String n, String c, int g, String ph) {
        class InsertData extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... params) {
                try {
                    String i = (String) params[0];
                    String p = (String) params[1];
                    String n = (String) params[2];
                    String c = (String) params[3];
                    String g = (String) params[4];
                    String ph = (String) params[5];
                    String link = "http://10.142.47.250:8000/fjscl13/bookjoin.php";
                    String data = URLEncoder.encode("ida", "UTF-8") + "=" + URLEncoder.encode(i, "UTF-8");
                    data += "&" + URLEncoder.encode("pa", "UTF-8") + "=" + URLEncoder.encode(p, "UTF-8");
                    data += "&" + URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(n, "UTF-8");
                    data += "&" + URLEncoder.encode("gen", "UTF-8") + "=" + URLEncoder.encode(c, "UTF-8");
                    data += "&" + URLEncoder.encode("gra", "UTF-8") + "=" + URLEncoder.encode(g, "UTF-8");
                    data += "&" + URLEncoder.encode("ph", "UTF-8") + "=" + URLEncoder.encode(ph, "UTF-8");
                    URL url = new URL(link);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setDefaultUseCaches(false);
                    conn.setDoOutput(true);
                    conn.setDoInput(true);
                    conn.setConnectTimeout(6000);
                    conn.setRequestMethod("POST");
                    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                    wr.write(data);
                    wr.flush();
                    wr.close();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                    StringBuffer sb = new StringBuffer();
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        sb.append(line);
                        break;
                    }
                    return sb.toString();
                } catch (Exception e) {
                    return new String("Exception: " + e.getMessage());
                }
            }

        }
        InsertData task = new InsertData();
        task.execute(i, p, n, c, String.valueOf(g), ph);
    }

}
