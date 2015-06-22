package BL;

/**
 * Created by aykut on 13.4.2015.
 */
public class KategoriEntity extends BaseEntity
{
    private String mAciklama;

    public KategoriEntity(int id)
    {
        super(id);
    }

    public KategoriEntity(int id, String aciklama)
    {
        super(id);
        mAciklama = aciklama;
    }

    public String getmAciklama()
    {
        return mAciklama;
    }

    public void setmAciklama(String mAciklama)
    {
        this.mAciklama = mAciklama;
    }
}
