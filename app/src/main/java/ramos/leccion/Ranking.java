package ramos.leccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ranking extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        Bundle bundle = getIntent().getExtras();

        String nombres_val = bundle.getString("nombres_val");

        TextView tv_01 = (TextView) findViewById(R.id.txt_jugador);

        tv_01.setText(nombres_val);


    }
}
