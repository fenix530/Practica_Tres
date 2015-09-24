package com.example.punto_5;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText nombre= (EditText) findViewById(R.id.eNombre);
        final EditText apellido=(EditText) findViewById(R.id.eApellido);
        final EditText identificacion=(EditText) findViewById(R.id.eIdentificacion);
        final RadioButton masculino=(RadioButton) findViewById(R.id.rMasculino);
        final RadioButton femenino=(RadioButton) findViewById(R.id.rFemenino);
        final DatePicker fecha=(DatePicker) findViewById(R.id.dFecha);
        final Spinner ciudad=(Spinner) findViewById(R.id.sCiudad);
        final CheckBox natacion=(CheckBox) findViewById(R.id.Check1);
        final CheckBox videojuegos=(CheckBox) findViewById(R.id.Check2);
        final CheckBox Leer=(CheckBox) findViewById(R.id.Check3);
        final CheckBox Cine=(CheckBox) findViewById(R.id.Check4);
        Button Registro =(Button) findViewById(R.id.bRegistrar);
        final TextView mResultado=(TextView) findViewById(R.id.RESULTADO);

        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mNombre="",mApellido="",mIdentificacion="",mSexo="",mDia="",mMes="",mAño="",mCiudad="",mH1="",mH2="",mH3="",mH4="";
                mNombre=nombre.getText().toString();
                mApellido=apellido.getText().toString();
                mIdentificacion=identificacion.getText().toString();
                if(masculino.isChecked())
                    mSexo=masculino.getText().toString();
                if(femenino.isChecked())
                    mSexo=femenino.getText().toString();
                mDia=String.valueOf(fecha.getDayOfMonth());
                mMes=String.valueOf(fecha.getMonth()+1);
                mAño=String.valueOf(fecha.getYear());
                mCiudad=ciudad.getSelectedItem().toString();
                if(natacion.isChecked())
                    mH1=natacion.getText().toString();
                if(videojuegos.isChecked())
                    mH2=videojuegos.getText().toString();
                if(Leer.isChecked())
                    mH3=Leer.getText().toString();
                if(Cine.isChecked())
                    mH4=Cine.getText().toString();
                mResultado.setText("Sus Datos son: \n \nNombre: "+mNombre+"\nApellido: "+mApellido+"\nIdentificacion: "+mIdentificacion+"\nSexo: "+mSexo+"\nFecha de Nacimiento: "+mDia+"/"+mMes+"/"+mAño+"\nCiudad de Nacimiento: "+mCiudad+"\nHobbies: "+mH1+" "+mH2+" "+mH3+" "+mH4);
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
