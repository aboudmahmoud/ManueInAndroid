package com.example.coustemadpater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
TextView tve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tve=findViewById(R.id.tv);
        registerForContextMenu(tve);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_manu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.Noftation:
                Toast.makeText(getBaseContext()," u are in niotfication ",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Nof:
                Toast.makeText(getBaseContext()," hi aboud ",Toast.LENGTH_LONG).show();
                return true;
        }

        return false;
    }
    /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_manu,menu);
        return true;
    }*/

  /*  @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.Noftation:
                Toast.makeText(getBaseContext()," u are in niotfication ",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Nof:
                Toast.makeText(getBaseContext()," hi aboud ",Toast.LENGTH_LONG).show();
                return true;
        }

        return false;
    }*/
}