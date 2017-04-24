package main.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/4/24.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    /**
     * Province表建表语句，id是自增长主键，province_name表示省名，province_code表示省级代号
     */
    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement,"//id是自增长主键
            + "province_name text,"//表示省名
            + "province_code text)";//表示省级代号


    /**
     * City表建表语句,id是自增长主键,city_name表示城市名,city_code表示市级代号,province_id是City表 关联Province表的外键
     */
    public static final String CREATE_CITY = "create table City ("
            + "id integer primary key autoincrement"
            + "city_name text"
            + "city_code text"
            + "province_id integet)";

    /**
     * County建表语句,id是自增长主键，county_name表示县名,county_code表示县级代号，city_id是County表关联City表的外键。
     */
    public static final String CREATE_COUNTY = "create table County ("
            + "id integer primary key autoincrement"
            + "county_name text,"
            + "county_code text,"
            + "city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
