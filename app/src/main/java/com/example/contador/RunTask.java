package com.example.contador;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;

public class RunTask extends AsyncTask<Integer, Integer, Void> {

    private Button btnCounter;
    private TextView txtCounter;
    private Integer counter = 10;

    public RunTask(Button btnCounter, TextView txtCounter){
        this.btnCounter = btnCounter;
        this.txtCounter = txtCounter;
    }

    @Override
    protected void onPreExecute() {
        btnCounter.setEnabled(false);
        txtCounter.setText("10");

    }

    @Override
    protected void onPostExecute(Void unused) {
        btnCounter.setEnabled(true);

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        txtCounter.setText(counter.toString());
        counter--;

    }

    @Override
    protected Void doInBackground(Integer... integers) {

        for(int i = 10; i >= 0; i--){
            publishProgress(i);
            SystemClock.sleep(1000);
        }
        return null;
    }
}
