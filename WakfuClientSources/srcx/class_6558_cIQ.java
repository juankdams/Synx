import java.util.ArrayList;

public final class cIQ extends cIX
{
  private static final ArrayList ayr = new ArrayList();

  public cIQ(ArrayList paramArrayList)
  {
    J(paramArrayList);
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dbE localdbE = aAw.i(paramObject1, paramObject4);
    if (localdbE == null) {
      return 0L;
    }
    bIC localbIC = localdbE.aDG();
    if (localbIC == null) {
      return 0L;
    }
    long l = localbIC.Bf();

    return l;
  }

  protected ArrayList Vs()
  {
    return ayr;
  }

  public boolean pH()
  {
    return true;
  }

  public Enum gm()
  {
    return Bz.bDz;
  }

  static
  {
    ayr.add(zT.buX);
  }
}