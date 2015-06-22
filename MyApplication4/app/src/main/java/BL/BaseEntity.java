package BL;


public class BaseEntity
{
    protected int mID;

    public int getID()
    {
        return mID;
    }

    public void setID(int id)
    {
        this.mID = id;
    }

    public BaseEntity(int id)
    {

        this.mID = id;
    }
}
