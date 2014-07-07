package com.example.partehectorperez;

import  com.example.partehectorperez.AdminSQLiteOpenHelper;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class BaseDeDatos extends Activity {

TextView epe1Bdd,epe2Bdd,epr1Bdd,epr2Bdd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basededatos);
		
		epe1Bdd=(TextView)findViewById(R.id.epe1Bdd);
		epe2Bdd=(TextView)findViewById(R.id.epe2Bdd);
		epr1Bdd=(TextView)findViewById(R.id.epr1Bdd);
		epr2Bdd=(TextView)findViewById(R.id.epr2Bdd);
		
		// PONEMOS EN BLANCO LOS TEXTVIEW
		
		epe1Bdd.setText("");
		epe2Bdd.setText("");
		epr1Bdd.setText("");
		epr2Bdd.setText("");
		
		//Hacerquery();
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.base_de_datos, menu);
		return true;
	}
	
public void volver(View yapo){
		
		Intent ir = new Intent(this, NotasPrincipal.class );
        startActivity(ir); 
        finish();
	}
public void Hacerquery(){
	// HACEMOS LA QUERY
	AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
			"Administracion", null, 1);
	SQLiteDatabase bd = admin.getWritableDatabase();
	//QUERY 
	Cursor epe1bd = bd.rawQuery(
			"select Epe1,Epr1,Epe2,Epr2 from Asignatura where Asignatura = 2 ", null);
	//MOSTRAMOS LA QUERY
	epe1Bdd.setText(epe1bd.getInt(2));
epr1Bdd.setText(epe1bd.getInt(3));
	epe2Bdd.setText(epe1bd.getInt(4));
	epr2Bdd.setText(epe1bd.getInt(5));

}

}
