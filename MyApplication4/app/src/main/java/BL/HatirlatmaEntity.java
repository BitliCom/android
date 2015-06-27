package BL;

/**
 * Created by aykut on 13.4.2015.
 */
public class HatirlatmaEntity extends BaseEntity
{
    private String mBaslik, mMetin, mTarih;
    private int mKategoriNo;

    public HatirlatmaEntity(int id)
    {
        super(id);
    }

    public HatirlatmaEntity(int id, String baslik, String metin, String tarih, int kategoriNo)
    {
        super(id);
        mMetin = metin;
        mTarih = tarih;
        mBaslik = baslik;
        mKategoriNo = kategoriNo;
    }

    public String getBaslik()
    {
        return mBaslik;
    }

    public void setBaslik(String baslik)
    {
        this.mBaslik = baslik;
    }

    public String getMetin()
    {
        return mMetin;
    }

    public void setMetin(String metin)
    {
        this.mMetin = metin;
    }

    public String getTarih()
    {
        return mTarih;
    }

    public void setTarih(String tarih)
    {
        this.mTarih = tarih;
    }

    public int getKategoriNo()
    {
        return mKategoriNo;
    }

    public void setKategoriNo(int kategoriNo)
    {
        this.mKategoriNo = kategoriNo;
    }
}
