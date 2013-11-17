import java.util.ArrayList;

public final class cv extends bAc
{
  public cv(ArrayList paramArrayList)
  {
    super(paramArrayList);
  }

  protected boolean a(int paramInt1, int paramInt2, cjK paramcjK, dle paramdle) {
    if ((paramcjK.getType() != paramInt1) && (paramcjK.clt() != paramInt2))
      return false;
    if (paramcjK.axG() != paramdle)
      return false;
    return true;
  }

  public Enum gm()
  {
    return Bz.bAK;
  }
}