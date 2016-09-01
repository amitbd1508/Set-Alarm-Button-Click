package com.blackflag.com.set_alarm_button_click;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by me on 02/09/16.
 */
public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context k1, Intent k2) {
        // TODO Auto-generated method stub
        Toast.makeText(k1, "Sonet Alarm is started it is not defult alarm youcan add your code here!", Toast.LENGTH_LONG).show();

        //check this class for dow somthing ..this method fire when Alarm is on
    }

}
