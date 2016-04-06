package uib.keeper.usenko.vlad.keeper;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Activity_setting extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_setting);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
