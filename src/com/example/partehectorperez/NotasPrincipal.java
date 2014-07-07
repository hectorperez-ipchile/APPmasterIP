package com.example.partehectorperez;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NotasPrincipal extends Activity {
	
	Spinner Asignaturas;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notasprincipal);
        
        // una lista con las asignaturas 
        Asignaturas = (Spinner) findViewById(R.id.Asignaturas);
        String []opciones={"Programacion","Ingles","Base de datos","Desarrollo de sistema"};        
        ArrayAdapter<String> mostrar = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        Asignaturas.setAdapter(mostrar);  
        
       
        

        
      
    }          
        
        
      
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.notas_principal, menu);
        return true;
    }
    
   
    
    
    
    public void vernotas(View veenaaj){
        //CONDICIONES
        String selec=Asignaturas.getSelectedItem().toString();
        if (selec.equals("Programacion")) {
        	
        	Intent ir = new Intent(this, Programacion.class );
            startActivity(ir);
         
        } else
            if (selec.equals("Ingles")) {
            	
            	Intent ir = new Intent(this, Ingles.class );
                startActivity(ir);  
            }
            else
                if (selec.equals("Base de datos")) {
                	
                	Intent ir = new Intent(this, BaseDeDatos.class );
                    startActivity(ir);

                }
                else
                    if (selec.equals("Desarrollo de sistema")) {
                    	
                    	Intent ir = new Intent(this, DesarolloDeSistema.class );
                        startActivity(ir);
                    }
    }
    	  
    
    
    
    }

