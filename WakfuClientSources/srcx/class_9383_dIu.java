import org.apache.log4j.Logger;

public class dIu
{
  public static final Logger K = Logger.getLogger(dIu.class);
  private final int ia;
  private final int ib;
  private final int lTm;
  private final int lTn;
  private final tb lbh;
  private static final String lTo = "x";

  public dIu(int paramInt1, int paramInt2, int paramInt3, int paramInt4, tb paramtb)
  {
    this.ia = paramInt1;
    this.ib = paramInt2;
    this.lTm = paramInt3;
    this.lTn = paramInt4;
    this.lbh = paramtb;
  }

  public int getWidth() {
    return this.ia;
  }

  public int getHeight() {
    return this.ib;
  }

  public int dih() {
    return this.lTm;
  }

  public int getFrequency()
  {
    return this.lTn;
  }

  public tb dii()
  {
    return this.lbh;
  }

  public String toString()
  {
    return "{Resolution : " + this.ia + 'x' + this.ib + 'x' + this.lTm + ' ' + dzp.capitalize(this.lbh.name()) + ' ' + this.lTn + "Hz}";
  }

  public boolean dij()
  {
    return (this.lbh != tb.bcP) && ((this.ia <= 0) || (this.ib <= 0));
  }

  public boolean equals(Object paramObject) {
    if ((paramObject instanceof dIu))
    {
      dIu localdIu = (dIu)paramObject;
      return (localdIu.ia == this.ia) && (localdIu.ib == this.ib) && (localdIu.lbh == this.lbh) && (localdIu.lTn == this.lTn) && ((localdIu.lTm == this.lTm) || (localdIu.lTm == -1) || (this.lTm == -1));
    }

    return super.equals(paramObject);
  }

  public static dIu rj(String paramString)
  {
    if (paramString == null)
      paramString = "";
    String[] arrayOfString = paramString.split("x");

    int i = a(arrayOfString, 0, 0);
    int j = a(arrayOfString, 1, 0);
    int k = a(arrayOfString, 2, -1);
    int m = a(arrayOfString, 3, 0);
    int n = a(arrayOfString, 4, tb.bcO.ordinal());
    Object localObject = tb.bcO;
    for (tb localtb : tb.values())
      if (localtb.ordinal() == n)
      {
        localObject = localtb;
        break;
      }
    return new dIu(i, j, k, m, (tb)localObject);
  }

  private static int a(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfString == null) || (paramInt1 >= paramArrayOfString.length))
      return paramInt2;
    try {
      return Integer.parseInt(paramArrayOfString[paramInt1]); } catch (NumberFormatException localNumberFormatException) {
    }
    return paramInt2;
  }

  public final String cOK()
  {
    return this.ia + "x" + this.ib + "x" + this.lTm + "x" + this.lTn + "x" + this.lbh.ordinal();
  }
}