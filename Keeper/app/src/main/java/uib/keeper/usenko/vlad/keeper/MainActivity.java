package uib.keeper.usenko.vlad.keeper;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        switch (id){
            case R.id.new_remark:
                Intent intent = new Intent(this,Activity_remark.class);
                startActivity(intent);
                break;
            case R.id.menu_setting:
                Intent intent_setting = new Intent(this,Activity_setting.class);
                startActivity(intent_setting);
                break;
            case R.id.menu_abaut: Toast.makeText(MainActivity.this,"abaut",Toast.LENGTH_LONG).show(); break;

        }


        return super.onOptionsItemSelected(item);
    }
}
