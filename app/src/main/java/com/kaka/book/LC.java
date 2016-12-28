package com.kaka.book;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * Created by stre6 on 2016-12-28.
 */

public class LC extends AppCompatActivity {

    String res;
    String id, pw, name, gra;
    ArrayList ld = new ArrayList();
    ArrayList lp = new ArrayList();
    ArrayList ln = new ArrayList();
    ArrayList lg = new ArrayList();

    public String getres() {
        return res;
    }

    public void ch(String cid, String cpw, String cname, String cgra) {
        id = cid;
        pw = cpw;
        name = cname;
        gra = cgra;

        class lc extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... params) {
                StringBuilder sb = new StringBuilder();
                try {
                    String link = "http://10.142.47.250:8000/fjscl13/bookidpw.php";
                    URL url = new URL(link);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setDefaultUseCaches(false);
                    connection.setDoInput(true);
                    connection.setDoOutput(true);
                    connection.setConnectTimeout(6000);
                    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String line = null;
                    while ((line = br.readLine()) != null) {
                        sb.append(line);
                        break;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                res = ja(sb.toString());
                return res;
            }

        }
        try {
            res = new lc().execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
}
    String ja(String j) {
        String cid, cpw, cname, cgra;
        String r = "";
        try {
            JSONArray a = new JSONArray(j);
            for (int i = 0; i < a.length(); i++) {
                JSONObject o = a.getJSONObject(i);
                r += String.format("ID : %s, PW : %s, NAME : %s, GRADE : %s\n", o.getString("ida"), o.getString("pa"), o.getString("name"), o.getString("gra"));
                cid = o.getString("ida");
                cpw = o.getString("pa");
                cname = o.getString("name");
                cgra = o.getString("gra");
                Log.e("cid", cid);
                Log.e("cpw", cpw);
                Log.e("cname", cname);
                Log.e("cgra", cgra);
                ld.add(cid);
                lp.add(cpw);
                ln.add(cname);
                lg.add(cgra);
                Log.e("ld", String.valueOf(ld));
                Log.e("lp", String.valueOf(lp));
                Log.e("ln", String.valueOf(ln));
                Log.e("lg", String.valueOf(lg));
            }
            Log.e("r", r);
        } catch (JSONException e) {
        }
        Log.e("zzz", String.valueOf(ld.size()));
        for (int b = 0; b < ld.size(); b++) {
            Log.e("b", String.valueOf(b));
            Log.e("i", ld.get(b).toString());
            Log.e("p", lp.get(b).toString());
            Log.e("n", ln.get(b).toString());
            Log.e("g", lg.get(b).toString());
            if (id.equals(ld.get(b).toString().trim()) && pw.equals(lp.get(b).toString().trim())) {
                res = "SU";
                break;
            } else {
                res = "fail";
            }
        }
        return res;


    }
}

