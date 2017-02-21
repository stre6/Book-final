package com.kaka.book;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by stre6 on 2016-12-28.
 */

public class Yayak extends AppCompatActivity {
    Button end;
    DatePicker dp;
    TimePicker tp;
    RadioButton r1, r2, r3, r4, r5, rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15;
    TextView t1, t2, t3, t4, t5, e, grade, sil, ja, sigan, t, d;
    String i = "";
    String ida = null;
    String pa = null;
    String na = null;
    String gr = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yayak);
        setTitle("인평도서관 예약");
        end = (Button) findViewById(R.id.btnend);
        dp = (DatePicker) findViewById(R.id.dp1);
        tp = (TimePicker) findViewById(R.id.tp1);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        r3 = (RadioButton) findViewById(R.id.r3);
        r4 = (RadioButton) findViewById(R.id.r4);
        r5 = (RadioButton) findViewById(R.id.r5);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        rb8 = (RadioButton) findViewById(R.id.rb8);
        rb9 = (RadioButton) findViewById(R.id.rb9);
        rb10 = (RadioButton) findViewById(R.id.rb10);
        rb11 = (RadioButton) findViewById(R.id.rb11);
        rb12 = (RadioButton) findViewById(R.id.rb12);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        rb14 = (RadioButton) findViewById(R.id.rb14);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);
        e = (TextView) findViewById(R.id.e);
        grade = (TextView) findViewById(R.id.grade);
        sil = (TextView) findViewById(R.id.sil);
        ja = (TextView) findViewById(R.id.ja);
        sigan = (TextView) findViewById(R.id.sigan);
        t = (TextView) findViewById(R.id.t);
        d = (TextView) findViewById(R.id.d);
        dp.setVisibility(View.INVISIBLE);
        tp.setVisibility(View.INVISIBLE);
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.INVISIBLE);
        rb4.setVisibility(View.INVISIBLE);
        rb5.setVisibility(View.INVISIBLE);
        rb6.setVisibility(View.INVISIBLE);
        rb7.setVisibility(View.INVISIBLE);
        rb8.setVisibility(View.INVISIBLE);
        rb9.setVisibility(View.INVISIBLE);
        rb10.setVisibility(View.INVISIBLE);
        rb11.setVisibility(View.INVISIBLE);
        rb12.setVisibility(View.INVISIBLE);
        rb13.setVisibility(View.INVISIBLE);
        rb14.setVisibility(View.INVISIBLE);
        rb15.setVisibility(View.INVISIBLE);


        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.setVisibility(View.VISIBLE);
                tp.setVisibility(View.INVISIBLE);
                rb1.setVisibility(View.INVISIBLE);
                rb2.setVisibility(View.INVISIBLE);
                rb3.setVisibility(View.INVISIBLE);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                rb6.setVisibility(View.INVISIBLE);
                rb7.setVisibility(View.INVISIBLE);
                rb8.setVisibility(View.INVISIBLE);
                rb9.setVisibility(View.INVISIBLE);
                rb10.setVisibility(View.INVISIBLE);
                rb11.setVisibility(View.INVISIBLE);
                rb12.setVisibility(View.INVISIBLE);
                rb13.setVisibility(View.INVISIBLE);
                rb14.setVisibility(View.INVISIBLE);
                rb15.setVisibility(View.INVISIBLE);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.setVisibility(View.INVISIBLE);
                rb1.setVisibility(View.INVISIBLE);
                rb2.setVisibility(View.INVISIBLE);
                rb3.setVisibility(View.INVISIBLE);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                rb6.setVisibility(View.INVISIBLE);
                rb7.setVisibility(View.INVISIBLE);
                rb8.setVisibility(View.INVISIBLE);
                rb9.setVisibility(View.INVISIBLE);
                rb10.setVisibility(View.INVISIBLE);
                rb11.setVisibility(View.INVISIBLE);
                rb12.setVisibility(View.INVISIBLE);
                rb13.setVisibility(View.INVISIBLE);
                rb14.setVisibility(View.INVISIBLE);
                rb15.setVisibility(View.INVISIBLE);
                tp.setVisibility(View.VISIBLE);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.setVisibility(View.INVISIBLE);
                tp.setVisibility(View.INVISIBLE);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                rb6.setVisibility(View.INVISIBLE);
                rb7.setVisibility(View.INVISIBLE);
                rb8.setVisibility(View.INVISIBLE);
                rb9.setVisibility(View.INVISIBLE);
                rb10.setVisibility(View.INVISIBLE);
                rb11.setVisibility(View.INVISIBLE);
                rb12.setVisibility(View.INVISIBLE);
                rb13.setVisibility(View.INVISIBLE);
                rb14.setVisibility(View.INVISIBLE);
                rb15.setVisibility(View.INVISIBLE);
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.VISIBLE);
                rb3.setVisibility(View.VISIBLE);
                rb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        i = "1실";
                        rb7.setChecked(false);
                        rb8.setChecked(false);
                        rb9.setChecked(false);
                        rb10.setChecked(false);
                        rb11.setChecked(false);
                        rb12.setChecked(false);
                        sil.setText("1실");
                    }
                });
                rb2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        i = "2실";
                        rb4.setChecked(false);
                        rb5.setChecked(false);
                        rb6.setChecked(false);
                        rb10.setChecked(false);
                        rb11.setChecked(false);
                        rb12.setChecked(false);
                        sil.setText("2실");
                    }
                });
                rb3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        i = "3실";
                        rb4.setChecked(false);
                        rb5.setChecked(false);
                        rb6.setChecked(false);
                        rb7.setChecked(false);
                        rb8.setChecked(false);
                        rb9.setChecked(false);
                        sil.setText("3실");
                    }
                });
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setVisibility(View.INVISIBLE);
                rb2.setVisibility(View.INVISIBLE);
                rb3.setVisibility(View.INVISIBLE);
                dp.setVisibility(View.INVISIBLE);
                tp.setVisibility(View.INVISIBLE);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                rb6.setVisibility(View.INVISIBLE);
                rb7.setVisibility(View.INVISIBLE);
                rb8.setVisibility(View.INVISIBLE);
                rb9.setVisibility(View.INVISIBLE);
                rb10.setVisibility(View.INVISIBLE);
                rb11.setVisibility(View.INVISIBLE);
                rb12.setVisibility(View.INVISIBLE);
                rb13.setVisibility(View.INVISIBLE);
                rb14.setVisibility(View.INVISIBLE);
                rb15.setVisibility(View.INVISIBLE);
                if (i.equals("1실")) {
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.VISIBLE);
                    rb6.setVisibility(View.VISIBLE);
                    rb7.setVisibility(View.INVISIBLE);
                    rb8.setVisibility(View.INVISIBLE);
                    rb9.setVisibility(View.INVISIBLE);
                    rb10.setVisibility(View.INVISIBLE);
                    rb11.setVisibility(View.INVISIBLE);
                    rb12.setVisibility(View.INVISIBLE);
                } else if (i.equals("2실")) {
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    rb6.setVisibility(View.INVISIBLE);
                    rb7.setVisibility(View.VISIBLE);
                    rb8.setVisibility(View.VISIBLE);
                    rb9.setVisibility(View.VISIBLE);
                    rb10.setVisibility(View.INVISIBLE);
                    rb11.setVisibility(View.INVISIBLE);
                    rb12.setVisibility(View.INVISIBLE);
                } else if (i.equals("3실")) {
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    rb6.setVisibility(View.INVISIBLE);
                    rb7.setVisibility(View.INVISIBLE);
                    rb8.setVisibility(View.INVISIBLE);
                    rb9.setVisibility(View.INVISIBLE);
                    rb10.setVisibility(View.VISIBLE);
                    rb11.setVisibility(View.VISIBLE);
                    rb12.setVisibility(View.VISIBLE);
                }
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setVisibility(View.INVISIBLE);
                rb2.setVisibility(View.INVISIBLE);
                rb3.setVisibility(View.INVISIBLE);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                rb6.setVisibility(View.INVISIBLE);
                rb7.setVisibility(View.INVISIBLE);
                rb8.setVisibility(View.INVISIBLE);
                rb9.setVisibility(View.INVISIBLE);
                rb10.setVisibility(View.INVISIBLE);
                rb11.setVisibility(View.INVISIBLE);
                rb12.setVisibility(View.INVISIBLE);
                rb13.setVisibility(View.VISIBLE);
                rb14.setVisibility(View.VISIBLE);
                rb15.setVisibility(View.VISIBLE);
            }
        });
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ja.setText("1-1");
            }
        });
        rb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ja.setText("1-2");
            }
        });
        rb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ja.setText("1-3");
            }
        });
        rb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ja.setText("2-1");
            }
        });
        rb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ja.setText("2-2");
            }
        });
        rb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ja.setText("2-3");
            }
        });
        rb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ja.setText("3-1");
            }
        });
        rb11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ja.setText("3-2");
            }
        });
        rb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ja.setText("3-3");
            }
        });
        rb13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sigan.setText("1시간");
            }
        });
        rb14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sigan.setText("2시간");
            }
        });
        rb15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sigan.setText("3시간");
            }
        });
        dp.init(dp.getYear(), dp.getMonth(), dp.getDayOfMonth(),
                new DatePicker.OnDateChangedListener() {

                    @Override
                    public void onDateChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {

                    }
                });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String year = String.format("%d", dp.getYear());
                String month = String.format("%d", dp.getMonth() + 1);
                String day = String.format("%d", dp.getDayOfMonth());
                t1.setText(year);
                t2.setText(month);
                t3.setText(day);
                t4.setText(String.valueOf(tp.getCurrentHour()));
                t5.setText(String.valueOf(tp.getCurrentMinute()));
                String res = "";
                ida = t.getText().toString();
                pa = d.getText().toString();
                LC lc = new LC();
                lc.ch(ida, pa, na, gr);
                res = lc.getres();
                for (int i = 0; i < lc.ln.size(); i++) {
                    na = lc.ln.get(i).toString();
                    gr = lc.lg.get(i).toString();
                    if (lc.id.equals(lc.ld.get(i).toString().trim()) && lc.pw.equals(lc.lp.get(i).toString().trim())) {
                        res = "SU";
                        break;
                    } else {
                        res = "fail";
                    }
                }
                Log.e("nanana", na);
                Log.e("grgrgr", gr);
                e.setText(na);
                grade.setText(gr);
                String n = e.getText().toString();
                int o = Integer.parseInt(grade.getText().toString());
                String p = sil.getText().toString();
                String a = ja.getText().toString();
                String s = sigan.getText().toString();
                int y = Integer.parseInt(t1.getText().toString());
                int m = Integer.parseInt(t2.getText().toString());
                int d = Integer.parseInt(t3.getText().toString());
                int i = Integer.parseInt(t4.getText().toString());
                int t = Integer.parseInt(t5.getText().toString());
                insertToDatabase(n, o, p, a, s, y, m, d, i, t);
            }
        });
    }

    private void insertToDatabase(String n, int o, String p, String a, String s, int y, int m, int d, int i, int t) {
        class InsertData extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... params) {
                try {
                    String n = (String) params[0];
                    String o = (String) params[1];
                    String p = (String) params[2];
                    String a = (String) params[3];
                    String s = (String) params[4];
                    String y = (String) params[5];
                    String m = (String) params[6];
                    String d = (String) params[7];
                    String i = (String) params[8];
                    String t = (String) params[9];
                    String link = "http://10.142.47.250:8000/fjscl13/bookyeyak.php";
                    String data = URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(n, "UTF-8");
                    data += "&" + URLEncoder.encode("gra", "UTF-8") + "=" + URLEncoder.encode(o, "UTF-8");
                    data += "&" + URLEncoder.encode("sil", "UTF-8") + "=" + URLEncoder.encode(p, "UTF-8");
                    data += "&" + URLEncoder.encode("ja", "UTF-8") + "=" + URLEncoder.encode(a, "UTF-8");
                    data += "&" + URLEncoder.encode("sigan", "UTF-8") + "=" + URLEncoder.encode(s, "UTF-8");
                    data += "&" + URLEncoder.encode("ye", "UTF-8") + "=" + URLEncoder.encode(y, "UTF-8");
                    data += "&" + URLEncoder.encode("mo", "UTF-8") + "=" + URLEncoder.encode(m, "UTF-8");
                    data += "&" + URLEncoder.encode("da", "UTF-8") + "=" + URLEncoder.encode(d, "UTF-8");
                    data += "&" + URLEncoder.encode("ti", "UTF-8") + "=" + URLEncoder.encode(i, "UTF-8");
                    data += "&" + URLEncoder.encode("mi", "UTF-8") + "=" + URLEncoder.encode(t, "UTF-8");
                    URL url = new URL(link);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setDefaultUseCaches(false);
                    connection.setDoInput(true);
                    connection.setDoOutput(true);
                    connection.setConnectTimeout(6000);
                    connection.setRequestMethod("POST");
                    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
                    wr.write(data);
                    wr.flush();
                    wr.close();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
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
        task.execute(n, String.valueOf(o), p, a, s, String.valueOf(y), String.valueOf(m), String.valueOf(d), String.valueOf(i), String.valueOf(t));
    }
}