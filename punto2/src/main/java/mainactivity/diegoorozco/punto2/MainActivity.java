package mainactivity.diegoorozco.punto2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Num1=(EditText) findViewById(R.id.eNum1);
        final EditText Num2=(EditText) findViewById(R.id.eNum2);
        final RadioButton Sum=(RadioButton) findViewById(R.id.rSum);
        final RadioButton Rest=(RadioButton) findViewById(R.id.rRest);
        final RadioButton Mult=(RadioButton) findViewById(R.id.rMulti);
        final RadioButton Div=(RadioButton) findViewById(R.id.rDiv);
        Button Calcu=(Button) findViewById(R.id.bCalcular);
        final EditText Totalr=(EditText) findViewById(R.id.eTotal);


        Calcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Double.parseDouble(Num1.getText().toString());
                double numero2=Double.parseDouble(Num2.getText().toString());
                double Total=0;
                String TotalM;
                if(Sum.isChecked())
                    Total=numero1+numero2;
                if(Rest.isChecked())
                    Total=numero1-numero2;
                if(Mult.isChecked())
                    Total=numero1*numero2;
                if(Div.isChecked())
                    Total=numero1/numero2;
                TotalM =String.valueOf(Total);
                Totalr.setText(TotalM);
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
