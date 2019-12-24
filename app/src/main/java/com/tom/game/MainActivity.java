package com.tom.game;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GameMap gameMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.bup).setOnClickListener(this);
        findViewById(R.id.bright).setOnClickListener(this);
        findViewById(R.id.bdown).setOnClickListener(this);
        findViewById(R.id.bleft).setOnClickListener(this);
        gameMap = findViewById(R.id.gameview);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.bup:
                Log.d("MainActivity","onClick UP");
                gameMap.setPosY(gameMap.getPosY() - 50);
                gameMap.invalidate();
                break;
            case R.id.bright:
                Log.d("MainActivity","onClick RIGHT");
                gameMap.setPosX(gameMap.getPosX() + 50);
                gameMap.invalidate();
                break;
                case R.id.bleft:
                Log.d("MainActivity","onClick LEFT");
                    gameMap.setPosX(gameMap.getPosX() - 50);
                    gameMap.invalidate();
                break;
                case R.id.bdown:
                Log.d("MainActivity","onClick DOWN");
                    gameMap.setPosY(gameMap.getPosY() + 50);
                    gameMap.invalidate();
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
