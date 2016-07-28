package apps.roddcastro.com.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.buttonIng);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creacion de varaibles para ingreso

                String usuario = ((EditText)findViewById(R.id.ingresoUsuario)).getText().toString();

                String pass = ((EditText)findViewById(R.id.ingresoPass)).getText().toString();

                if (usuario.equals("Admin") && pass.equals("Admin")){
                    Intent newform = new Intent(MainActivity.this, SecondForm.class);
                    startActivity(newform);



                }
                else {
                    Toast.makeText(getApplicationContext(), "Usuario/Contraseña no validos", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
