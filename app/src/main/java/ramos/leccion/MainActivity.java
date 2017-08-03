package ramos.leccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static EditText nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_enviar = (Button) findViewById(R.id.btn_enviar);

        nombres = (EditText) findViewById(R.id.txt_nombre);


        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Botones.class);

                intent.putExtra("nombres_val", nombres.getText().toString());

                startActivity(intent);

            }
        });

    }
}
