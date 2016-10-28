package com.example.tim.quotecast;

import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tim on 2016-10-14.
 */
public class CustomDialog {

    private WeatherActivity weather;
    private EditText city;

    public CustomDialog(Context context, WeatherActivity weather) {

        this.weather = weather;

        // custom dialog
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setTitle("Info");

        // set the custom dialog components - text, image and button
        city = (EditText) dialog.findViewById(R.id.etCity);

        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                setText();

                dialog.dismiss();
            }
        });

        dialog.show();
    }

    public void setText(){

        weather.setCity(city.getText().toString());

    }
}
