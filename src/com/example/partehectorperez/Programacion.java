package com.example.partehectorperez;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Programacion extends Activity {

	TextView epe1Progra,Epr1Progra,Epr2Progra,Epe2Progra;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.programacion);
		
		epe1Progra=(TextView)findViewById(R.id.epe1Progra);
		Epr1Progra=(TextView)findViewById(R.id.epr1Progra);
		Epe2Progra=(TextView)findViewById(R.id.Epe2Progra);
		Epr2Progra=(TextView)findViewById(R.id.Epr2Progra);
		
		
		// PONEMOS EN BLANCO LOS TEXTVIEW
		
		epe1Progra.setText("");
		Epr1Progra.setText("");
		Epe2Progra.setText("");
		Epr2Progra.setText("");
		// heredamos de sql
		
		//Hacerquery();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.programacion, menu);
		return true;
	}

	public void volver(View yapo){
		
		Intent ir = new Intent(this,NotasPrincipal.class );
        startActivity(ir); 
        finish();
	}
	
	public void Hacerquery(){
		// heredamos de sql
		AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
				"Administracion", null, 1);
		SQLiteDatabase bd = admin.getWritableDatabase();
		//QUERY 
		Cursor epe1bd = bd.rawQuery(
				"select Epe1,Epr1,Epe2,Epr2 from Asignatura where Asignatura = 1 ", null);
		//MOSTRAMOS LA QUERY
		epe1Progra.setText(epe1bd.getString(2));
		Epr1Progra.setText(epe1bd.getString(3));
		Epe2Progra.setText(epe1bd.getString(4));
		Epr2Progra.setText(epe1bd.getString(5));
	}
}
