package com.example.indrapro.indra_1202152164_modul2;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import java.util.Calendar;


@SuppressLint("ValidFragment")
class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //mengeset waktu sekarang ke datepicker
        final Calendar c = Calendar.getInstance();

        //membuat object baru untuk timepickerdialog dan mengembalikannya
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute, DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        //mengeset activity ke takeAway activity
        takeaway takeAway = (takeaway) getActivity();
        //memerintahkan takeAway Activity untuk memproses TimePickerDialog() method
        takeAway.processTimePickerResult(hourOfDay, minute);
    }
}
