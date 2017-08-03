package ramos.leccion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Botones extends AppCompatActivity {

    private static TextView nombres;
    private static TextView pregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        Random rand = new Random();
        final int n = rand.nextInt(5)+1;

        Bundle bundle = getIntent().getExtras();

        String nombres_val = bundle.getString("nombres_val");

        TextView tv_01 = (TextView) findViewById(R.id.txt_user);

        tv_01.setText(nombres_val);

        Button btn_finalizar = (Button) findViewById(R.id.btn_finalizar);

        nombres = (TextView) findViewById(R.id.txt_user);

        pregunta = (TextView) findViewById(R.id.txt_pregunta);

        pregunta.setText("Cual es el # "+ n);


        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Botones.this, Ranking.class);

                intent.putExtra("nombres_val", nombres.getText().toString());

                startActivity(intent);

            }
        });

        Button one = (Button)this.findViewById(R.id.btn_01);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.mousclik);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                if (n == 1){

                    Toast.makeText(getApplicationContext(), "Correcto",Toast.LENGTH_LONG).show();

                }else{

                    Toast.makeText(getApplicationContext(), "Incorrecto",Toast.LENGTH_LONG).show();

                }

                mp.start();

            }
        });

        Button two = (Button)this.findViewById(R.id.btn_02);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.mousclik);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                if (n == 2){

                    Toast.makeText(getApplicationContext(), "Correcto",Toast.LENGTH_LONG).show();

                }else{

                    Toast.makeText(getApplicationContext(), "Incorrecto",Toast.LENGTH_LONG).show();

                }

                mp2.start();
            }
        });

        Button three = (Button)this.findViewById(R.id.btn_03);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.mousclik);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp3.start();
            }
        });

        Button four = (Button)this.findViewById(R.id.btn_04);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.mousclik);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp4.start();
            }
        });

        Button five = (Button)this.findViewById(R.id.btn_05);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.mousclik);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp5.start();
            }
        });

    }
}
