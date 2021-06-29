package ipvc.pt.ti_20537_sens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Redireciona para a actividade "Info"
    public void onClickInfo(View view) {
        Intent i = new Intent(MainActivity.this, Info.class);
        startActivity(i);
    }

    //Redireciona para a actividade "Ajuda"
    public void onClickAjuda(View view) {
        Intent i = new Intent(MainActivity.this, Ajuda.class);
        startActivity(i);
    }

    public void btIniciar(View view) {
        Intent i = new Intent(MainActivity.this, Ajuda.class);
        startActivity(i);
    }
}