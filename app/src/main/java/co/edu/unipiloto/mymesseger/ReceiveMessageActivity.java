package co.edu.unipiloto.mymesseger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="mesagge";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        TextView messageview=findViewById(R.id.mensaje);


        Intent intent=getIntent();
        String messagetext = intent.getStringExtra(EXTRA_MESSAGE);
        messageview.setText(messagetext);



        Button mi_boton = (Button) findViewById(R.id.enviar);
        mi_boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText mesaggeView = (EditText) findViewById(R.id.message2);
                String messageText = mesaggeView.getText().toString();
                Intent intent = new Intent(ReceiveMessageActivity.this,CreateMessageActivity.class);
                intent.putExtra(CreateMessageActivity.EXTRA_MESSAGE2, messageText);
                startActivity(intent);

            }
        });
    }
}