package ramos.leccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Botones extends AppCompatActivity {

    private static TextView nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        Bundle bundle = getIntent().getExtras();

        String nombres_val = bundle.getString("nombres_val");

        TextView tv_01 = (TextView) findViewById(R.id.txt_user);

        tv_01.setText(nombres_val);

        Button btn_finalizar = (Button) findViewById(R.id.btn_finalizar);

        nombres = (TextView) findViewById(R.id.txt_user);


        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Botones.this, Ranking.class);

                intent.putExtra("nombres_val", nombres.getText().toString());

                startActivity(intent);

            }
        });

    }
}
