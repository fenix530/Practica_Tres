package mainactivity.diegoorozco.punto3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText NotaQ=(EditText) findViewById(R.id.eQuices);
        final EditText NotaE=(EditText) findViewById(R.id.eExpocision);
        final EditText NotaL=(EditText) findViewById(R.id.eLabs);
        final EditText NotaP=(EditText) findViewById(R.id.ePactica);
        final EditText NotaF=(EditText) findViewById(R.id.eFinal);
        Button Calcular=(Button) findViewById(R.id.Calcular);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Q=0,E=0,L=0,P=0,F=0;
                String dato;
                Q=Double.parseDouble(NotaQ.getText().toString());
                E=Double.parseDouble(NotaE.getText().toString());
                L=Double.parseDouble(NotaL.getText().toString());
                P=Double.parseDouble(NotaP.getText().toString());
                F=Q*0.15+E*0.2+L*0.3+P*0.35;
                dato=String.valueOf(F);
                NotaF.setText(dato);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
