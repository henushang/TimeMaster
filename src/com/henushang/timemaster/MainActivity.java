package com.henushang.timemaster;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListeners();
    }

    public void addListeners(){
        Button btntest = (Button)findViewById(R.id.btntest);
        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv1 = (TextView)findViewById(R.id.tv1);
                tv1.setText(Operation.getTime());
            }
        });
    }
}
