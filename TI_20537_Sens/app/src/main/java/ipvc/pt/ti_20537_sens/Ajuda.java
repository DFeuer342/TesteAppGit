package ipvc.pt.ti_20537_sens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Ajuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajuda_layout);
    }

    public void btVoltarObj(View view) {
        Intent i = new Intent(Ajuda.this, MainActivity.class);
        startActivity(i);
    }

    public void btIntruObj(View view) {
        Intent i = new Intent(Ajuda.this, Instrucao.class);
        startActivity(i);
    }
}
