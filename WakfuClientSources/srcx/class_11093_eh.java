import java.util.ArrayList;
import java.util.List;

public final class eh extends akN
{
  private static final ArrayList ayr = new ArrayList();

  public eh(ArrayList paramArrayList)
  {
    u(paramArrayList);
  }

  protected List kM()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (!(paramObject3 instanceof gA))
      return -1;
    if (!(paramObject1 instanceof dhJ)) {
      return -1;
    }
    gA localgA = (gA)paramObject3;
    dhJ localdhJ = (dhJ)paramObject1;

    int i = localgA.ok();
    long l = localgA.oj();
    boolean bool = a(localdhJ, i, l);
    if (bool) {
      return 0;
    }
    bBn localbBn = localgA.oi();
    if (localbBn.acu() == cqG.iau) {
      bool = a(localdhJ, l, localbBn);
    }

    if (bool) {
      return 0;
    }
    return -1;
  }

  private boolean a(dhJ paramdhJ, long paramLong, bBn parambBn) {
    int i = parambBn.bKE();
    dHt localdHt = bSx.hdo.tU(i);
    if (localdHt == null) {
      return false;
    }
    int[] arrayOfInt = localdHt.cCL();
    for (int j = 0; j < arrayOfInt.length; j++) {
      int k = arrayOfInt[j];
      if (a(paramdhJ, k, paramLong))
        return true;
    }
    return false;
  }

  private boolean a(dhJ paramdhJ, int paramInt, long paramLong) {
    boolean bool = false;
    ArrayList localArrayList = paramdhJ.ayJ().hi(paramInt);
    for (gA localgA : localArrayList) {
      if (localgA.oj() != paramLong)
        bool = true;
    }
    return bool;
  }

  public Enum gm()
  {
    return Bz.bDq;
  }

  static
  {
    ayr.add(zT.buX);
  }
}