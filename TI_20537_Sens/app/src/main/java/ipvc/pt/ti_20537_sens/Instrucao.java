package ipvc.pt.ti_20537_sens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Instrucao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instrucao_layout);
    }

    public void btVoltarInstru(View view) {
        Intent i = new Intent(Instrucao.this, MainActivity.class);
        startActivity(i);
    }

    public void btIntruProxima(View view) {
        Toast.makeText(getApplicationContext(),"Next Invoke",Toast.LENGTH_SHORT).show();
    }
}
