//Esto es solo un menu provicional mas adelante se pule
package com.nor.hugo.tutorgt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.res.*;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;


public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());
        setContentView(R.layout.activity_menu);

        Button bP = (Button)findViewById(R.id.bP);

        bP.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        Intent i =new Intent(Menu.this,Perfil.class);
                        startActivity(i);
                        overridePendingTransition(R.animator.animator,R.anim.animacion);
                    }
        }
        );
    }
    //public void
}
