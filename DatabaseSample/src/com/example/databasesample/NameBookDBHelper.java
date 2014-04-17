package com.example.databasesample;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class NameBookDBHelper extends SQLiteOpenHelper {
	
	public NameBookDBHelper(Context context) {
		// 任意のデータベースファイル名と、バージョンを指定する
		super(context, "sample.db", null, 1);
	}

	public NameBookDBHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		// テーブルを作成。SQLの文法は通常のSQLiteと同様
		db.execSQL(
				"create table name_book_table ("
				+ "_id integer primary key autoincrement not null,"
				+ "name text not null,"
				+ "age integer)" );
		// 必要なら、ここで他のテーブルを作成したり、初期データを挿入したりする
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		// 取りあえず、空実装でよい
	}

}
