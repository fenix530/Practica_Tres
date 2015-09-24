package mainactivity.diegoorozco.punto4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText lado=(EditText) findViewById(R.id.eLado);
        final EditText base=(EditText) findViewById(R.id.eBase);
        final EditText radio=(EditText) findViewById(R.id.eRadio);
        final EditText altura=(EditText) findViewById(R.id.eAltura);
        final EditText Area=(EditText) findViewById(R.id.eArea);
        Button Calcular=(Button) findViewById(R.id.bCalcular);
        final RadioButton Cuadro=(RadioButton) findViewById(R.id.rCuadro);
        final RadioButton Rectangulo=(RadioButton) findViewById(R.id.rRectangulo);
        final RadioButton Circulo=(RadioButton) findViewById(R.id.rCirculo);
        final RadioButton Triangulo=(RadioButton) findViewById(R.id.rTriangulo);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double AreaC,dato1,dato2;
                if(Cuadro.isChecked())
                {
                    dato1=Double.parseDouble(lado.getText().toString());
                    AreaC=dato1*dato1;
                    Area.setText(String.valueOf(AreaC));
                }
                if(Rectangulo.isChecked())
                {
                    dato1=Double.parseDouble(lado.getText().toString());
                    dato2=Double.parseDouble(base.getText().toString());
                    AreaC=dato1*dato2;
                    Area.setText(String.valueOf(AreaC));
                }
                if(Circulo.isChecked())
                {
                    dato1=Double.parseDouble(radio.getText().toString());
                    AreaC=dato1*dato1*3.141617;
                    Area.setText(String.valueOf(AreaC));
                }
                if(Triangulo.isChecked())
                {
                    dato1=Double.parseDouble(base.getText().toString());
                    dato2=Double.parseDouble(altura.getText().toString());
                    AreaC=dato1*dato2/2;
                    Area.setText(String.valueOf(AreaC));
                }
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

    public void Click(View view) {
        RadioButton Cuadro=(RadioButton) findViewById(R.id.rCuadro);
        RadioButton Rectangulo=(RadioButton) findViewById(R.id.rRectangulo);
        RadioButton Circulo=(RadioButton) findViewById(R.id.rCirculo);
        RadioButton Triangulo=(RadioButton) findViewById(R.id.rTriangulo);
        LinearLayout vLado=(LinearLayout) findViewById(R.id.lLado);
        LinearLayout vBase=(LinearLayout) findViewById(R.id.lBase);
        LinearLayout vRadio=(LinearLayout) findViewById(R.id.lRadio);
        LinearLayout vAltura=(LinearLayout) findViewById(R.id.lAltura);
        if(Cuadro.isChecked())
        {
            vLado.setVisibility(View.VISIBLE);
            vBase.setVisibility(View.GONE);
            vRadio.setVisibility(View.GONE);
            vAltura.setVisibility(View.GONE);
        }
        if(Rectangulo.isChecked())
        {
            vLado.setVisibility(View.VISIBLE);
            vBase.setVisibility(View.VISIBLE);
            vRadio.setVisibility(View.GONE);
            vAltura.setVisibility(View.GONE);
        }
        if(Circulo.isChecked())
        {
            vLado.setVisibility(View.GONE);
            vBase.setVisibility(View.GONE);
            vRadio.setVisibility(View.VISIBLE);
            vAltura.setVisibility(View.GONE);
        }
        if(Triangulo.isChecked())
        {
            vLado.setVisibility(View.GONE);
            vBase.setVisibility(View.VISIBLE);
            vRadio.setVisibility(View.GONE);
            vAltura.setVisibility(View.VISIBLE);
        }
    }
}
