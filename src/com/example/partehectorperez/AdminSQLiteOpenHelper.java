package com.example.partehectorperez;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper{
	public AdminSQLiteOpenHelper(Context context, String nombre, CursorFactory factory, int version) {
		super(context, nombre, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		// creamos la base de datos
		db.execSQL("create table Asignatura(Asignatura integer primary key, nombre text, Epe1 float,Epr1 float,Epe2 float,Epr2 float)");
		//Insertamos los registros!! 
		db.execSQL("INSERT INTO Asignatura(Asignatura,nombre,Epe1,Epr1,Epe2,Epr2) VALUES (1,'Programacion',4.5,5,5.3,5.8) ");
		db.execSQL("INSERT INTO Asignatura(Asignatura,nombre,Epe1,Epr1,Epe2,Epr2) VALUES (2,'Base de datos',3.5,2,6.3,6.8) ");
		db.execSQL("INSERT INTO Asignatura(Asignatura,nombre,Epe1,Epr1,Epe2,Epr2) VALUES (3,'Ingles',5.5,7,6.3,6.8) ");
		db.execSQL("INSERT INTO Asignatura(Asignatura,nombre,Epe1,Epr1,Epe2,Epr2) VALUES (4,'Desarrollo de sistemas',3.5,7,5.3,2.8) ");
	
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
		db.execSQL("create table Asignatura(Asignatura integer primary key, nombre text, Epe1 float,Epr1 float,Epe2 float,Epr2 float)");
	}
}
