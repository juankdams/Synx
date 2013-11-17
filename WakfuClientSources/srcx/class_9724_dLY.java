import java.util.ArrayList;
import java.util.List;

public final class dLY extends cCU
{
  private static ArrayList aAG = new ArrayList();
  private long kTc;

  protected List kM()
  {
    return aAG;
  }

  public dLY(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    this.ivC = true;
    this.bUJ = "caster";
    if (i == 0)
      this.kTc = ((aOw)paramArrayList.get(0)).b(null, null, null, null);
  }

  protected int VB()
  {
    return -1;
  }

  protected boolean c(cjK paramcjK)
  {
    return paramcjK.clt() == this.kTc;
  }

  public Enum gm()
  {
    return Bz.bCX;
  }

  static
  {
    aAG.add(zT.bva);
  }
}