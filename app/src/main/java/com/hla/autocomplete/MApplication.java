package com.hla.autocomplete;

import android.support.multidex.MultiDexApplication;

import com.teliver.sdk.core.TLog;
import com.teliver.sdk.core.Teliver;

/**
 * Created by gopinath on 28/11/17.
 */

public class MApplication
        extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Teliver.init(this, "f090dc812d7ac369d89d8a7fda7f8331");
        TLog.setVisible(true);
    }
}
