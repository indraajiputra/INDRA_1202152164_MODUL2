package com.example.indrapro.indra_1202152164_modul2;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;



@SuppressLint("ValidFragment")
class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //untku menget date system
        final Calendar calender1 = Calendar.getInstance();
        int year = calender1.get(Calendar.YEAR);
        int month = calender1.get(Calendar.MONTH);
        int day = calender1.get(Calendar.DAY_OF_MONTH);


        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        //mengconvert tanggalnya ke string
        //mengeset activity ke takeAwayActivity
        takeaway takeAway = (takeaway) getActivity();
        // takeAway  memproses processDatePickerResult() method
        takeAway.processDatePickerResult(year, month, day);
    }

}
