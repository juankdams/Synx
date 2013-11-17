import java.util.ArrayList;

public final class cfy extends avC
{
  public cfy(ArrayList paramArrayList)
  {
    super(paramArrayList);
  }

  protected boolean a(cjK paramcjK, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramcjK == null)
      return false;
    if (!(paramcjK instanceof axQ))
      return false;
    dle localdle = paramcjK.axG();
    if (localdle == null)
      return false;
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);

    return localaxQ.aJq() == localdle.getId();
  }

  public Enum gm()
  {
    return Bz.bDm;
  }
}