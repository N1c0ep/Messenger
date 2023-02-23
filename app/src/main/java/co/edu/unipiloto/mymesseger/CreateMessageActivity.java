package co.edu.unipiloto.mymesseger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE2="mesagge2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);


        TextView messageview=findViewById(R.id.mensaje);



        Intent intent=getIntent();
        String messagetext = intent.getStringExtra(EXTRA_MESSAGE2);
        messageview.setText(messagetext);




        Button mi_boton = (Button) findViewById(R.id.enviar);

        mi_boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText mesaggeView = (EditText) findViewById(R.id.message);
                String messageText = mesaggeView.getText().toString();
                Intent intent = new Intent(CreateMessageActivity.this,ReceiveMessageActivity.class);
                intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
                startActivity(intent);

            }
        });

    }

}
