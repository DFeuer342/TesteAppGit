package ipvc.pt.ti_20537_sens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);
    }


    public void btVoltar(View view) {
        Intent i = new Intent(Info.this, MainActivity.class);
        startActivity(i);
    }
}
