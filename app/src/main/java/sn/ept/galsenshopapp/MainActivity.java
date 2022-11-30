package sn.ept.galsenshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button getStartedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStartedBtn = findViewById(R.id.getStarted_button_getStart);
        getStartedBtn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), buttom_navigation.class);
            startActivity(intent);
        });
    }


}