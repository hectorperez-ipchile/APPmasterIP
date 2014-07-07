package com.example.partehectorperez;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Ingles extends Activity {
	
	TextView epr1Ingles,epr2Ingles,epe1Ingles,epe2Ingles;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ingles);
		
	
		
		epr1Ingles=(TextView)findViewById(R.id.epr1Ingles);
		epr2Ingles=(TextView)findViewById(R.id.epr2Ingles);
		epe1Ingles=(TextView)findViewById(R.id.epe1Ingles);
		epe2Ingles=(TextView)findViewById(R.id.epe2Ingles);
		
		// PONEMOS EN BLANCO LOS TEXTVIEW
		
		epr1Ingles.setText("");
		epr2Ingles.setText("");
		epe1Ingles.setText("");
		epe2Ingles.setText("");
		
	//Hacerquery();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ingles, menu);
		return true;
	}

public void volver(View yapo){
		
		Intent ir = new Intent(this, NotasPrincipal.class );
        startActivity(ir); 
	}

public void Hacerquery(){
	// HACEMOS LA QUERY
	AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
			"Consulta", null, 1);
	SQLiteDatabase bd = admin.getWritableDatabase();
	//QUERY 
	Cursor epe1bd = bd.rawQuery(
			"select Epe1,Epr1,Epe2,Epr2 from Asignatura where Asignatura = 3 ", null);
	//MOSTRAMOS LA QUERY
	epe1Ingles.setText(epe1bd.getString(2));
	epr1Ingles.setText(epe1bd.getString(3));
	epe2Ingles.setText(epe1bd.getString(4));
	epr2Ingles.setText(epe1bd.getString(5));
}
}
