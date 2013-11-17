import java.util.ArrayList;
import java.util.List;

public final class did extends akN
{
  private boolean aMu;
  private static final ArrayList ayr = new ArrayList();

  protected List kM()
  {
    return ayr;
  }

  public did(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    if (i == 0) {
      this.aMu = false;
    } else if (i == 1) {
      String str = ((cic)paramArrayList.get(0)).getValue();
      if (str.equalsIgnoreCase("target"))
        this.aMu = true;
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null) {
      return -1;
    }
    aTa localaTa = localdhJ.cLL();
    if (!(localaTa instanceof dha)) {
      return -1;
    }
    if (((cBn)localaTa).axG() == localdhJ) {
      return 0;
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bAR;
  }

  static
  {
    ayr.add(zT.buX);
    ayr.add(zT.buY);
  }
}