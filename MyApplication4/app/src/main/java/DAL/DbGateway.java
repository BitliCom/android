package DAL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by aykut on 13.4.2015.
 */
public class DbGateway extends SQLiteOpenHelper
{
    private Context context;

    public DbGateway(Context context, String DBName, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, DBName, factory, version);
        this.context = context;
    }

    public DbGateway(Context context)
    {
        this(context, "Ajanda.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("Create Table Kategoriler(No INTEGER PRIMARY KEY, Aciklamasi TEXT)");
        db.execSQL("Create Table Hatirlatmalar(_id INTEGER PRIMARY KEY, Baslik TEXT, Metin TEXT, Tarih TEXT, KategoriNo NUMBER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        // ...
    }

    @Override
    public void onOpen(SQLiteDatabase db)
    {
        super.onOpen(db);
        Log.i("CSD", "Bağlantı açıldı");
    }
}
