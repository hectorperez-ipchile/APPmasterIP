package com.example.partehectorperez;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class DesarolloDeSistema extends Activity {

	TextView Epe1Desarrollo,Epe2Desarrollo,Epr1Desarrollo,Epr2Desarrollo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.desarollosis);
		
		
		Epe1Desarrollo=(TextView)findViewById(R.id.asdasdsda);
		Epe2Desarrollo=(TextView)findViewById(R.id.dedede);
		Epr1Desarrollo=(TextView)findViewById(R.id.dadadad);
		Epr2Desarrollo=(TextView)findViewById(R.id.dada);
		
		// PONEMOS EN BLANCO LOS TEXTVIEW
		
		Epe1Desarrollo.setText("");
		Epe2Desarrollo.setText("");
		Epr1Desarrollo.setText("");
		Epr2Desarrollo.setText("");
		
		//Hacerquery();
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.desarollo_de_sistema, menu);
		return true;
	}

public void volver(View yapo){
		
		Intent ir = new Intent(this, NotasPrincipal.class );
        startActivity(ir); 
        finish();
	}
public void Hacerquery(){
	// HACEMOS LA QUERY
	// HACEMOS LA QUERY
	AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
			"Administracion", null, 1);
	SQLiteDatabase bd = admin.getWritableDatabase();
	//QUERY 
	Cursor epe1bd = bd.rawQuery(
			"select Epe1,Epr1,Epe2,Epr2 from Asignatura where Asignatura = 4", null);
	//MOSTRAMOS LA QUERY
	Epe1Desarrollo.setText(epe1bd.getString(2));
	Epr1Desarrollo.setText(epe1bd.getString(3));
	Epe2Desarrollo.setText(epe1bd.getString(4));
	Epr2Desarrollo.setText(epe1bd.getString(5));
}

}
