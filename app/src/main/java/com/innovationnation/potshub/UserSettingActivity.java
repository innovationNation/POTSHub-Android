package com.innovationnation.potshub;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by kisaayano on 20/07/16.
 */
public class UserSettingActivity extends PreferenceActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);

    }
}
