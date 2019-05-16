package com.example.asus.pathapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;

import java.util.Calendar;

public class CalendaActivity extends AppCompatActivity {

    int year,month,day;
    DatePicker datePicker;
    String TAG="CalendaActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calenda);

        datePicker = findViewById(R.id.datePicker);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                CalendaActivity.this.year=year;
                CalendaActivity.this.month=monthOfYear;
                CalendaActivity.this.day=dayOfMonth;
                Log.i(TAG, "onDateChanged: "+CalendaActivity.this.year+"-"
                        +(CalendaActivity.this.month+1)+"-"+CalendaActivity.this.day);
            }
        });
    }

}
