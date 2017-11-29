package com.hla.autocomplete;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;

//created by gopinath on 28/11/2017

public class login_activity extends AppCompatActivity {
    EditText name, phone_no;
    String my_name, phoneno;
    Button save_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_profile);

        name = (EditText) findViewById(R.id.profile_name);
        phone_no = (EditText) findViewById(R.id.register_phone_number);
        save_profile = (Button) findViewById(R.id.gopinath_register);

        save_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name != null && phone_no != null) {
                    my_name = name.getText().toString();
                    phoneno = phone_no.getText().toString();
                    Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                    Bundle b = new Bundle();
                    b.putString("name", my_name);
                    b.putString("phoneno", phoneno);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });


    }


}
