import org.apache.log4j.Logger;

public class bmd
  implements bPr
{
  private static final Logger K = Logger.getLogger(bmd.class);
  private final int[] fDu;
  private final bPr fDv;

  public bmd(int[] paramArrayOfInt, bPr parambPr)
  {
    this.fDu = paramArrayOfInt;
    this.fDv = parambPr;
  }

  public int a(dno paramdno, gA paramgA) {
    if (!h(paramgA.ol())) {
      return -3;
    }
    return this.fDv.b(paramdno, paramgA);
  }

  public int a(dno paramdno, gA paramgA, short paramShort) {
    if (!h(paramgA.ol())) {
      return -3;
    }
    return this.fDv.a(paramdno, paramgA, paramShort);
  }

  public int a(dno paramdno, gA paramgA1, gA paramgA2) {
    if (!h(paramgA2.ol())) {
      return -3;
    }
    return this.fDv.a(paramdno, paramgA1, paramgA2);
  }

  public int b(dno paramdno, gA paramgA) {
    return this.fDv.a(paramdno, paramgA);
  }

  public boolean a(gA paramgA, dle paramdle, cOE paramcOE) {
    return this.fDv.a(paramgA, paramdle, paramcOE);
  }

  public boolean a(dno paramdno, dle paramdle, cOE paramcOE) {
    return this.fDv.a(paramdno, paramdle, paramcOE);
  }

  private boolean h(ge paramge) {
    if ((this.fDu == null) || (this.fDu.length == 0)) {
      return true;
    }
    do
    {
      if (bPR.c(this.fDu, paramge.nc())) {
        return true;
      }
      paramge = paramge.ne();
    }while (paramge != null);

    return false;
  }
}