public abstract class acS
{
  protected final dRK cTf;
  protected final dRK cTg;
  protected final dRK cTh;
  private final csn cTi;
  final cYk cTj = new cYk();

  public acS(String paramString1, float[] paramArrayOfFloat1, String paramString2, float[] paramArrayOfFloat2, String paramString3, float[] paramArrayOfFloat3, String paramString4, float[] paramArrayOfFloat4, String paramString5, float[] paramArrayOfFloat5)
  {
    if ((paramString1 != null) && (paramArrayOfFloat1 != null)) {
      this.cTf = new dRK(paramString1, paramArrayOfFloat1);
      this.cTf.DP(1);
    } else {
      this.cTf = null;
    }

    if ((paramString3 != null) && (paramArrayOfFloat3 != null)) {
      this.cTh = new dRK(paramString3, paramArrayOfFloat3);
      this.cTh.DP(2);
    } else {
      this.cTh = null;
    }

    if ((paramString4 != null) && (paramArrayOfFloat4 != null)) {
      this.cTg = new dRK(paramString4, paramArrayOfFloat4);
      this.cTg.DP(3);
    } else {
      this.cTg = null;
    }
    dRK localdRK1;
    if ((paramString2 != null) && (paramArrayOfFloat2 != null)) {
      localdRK1 = new dRK(paramString2, paramArrayOfFloat2);
      localdRK1.DP(4);
    } else {
      localdRK1 = null;
    }
    dRK localdRK2;
    if ((paramString5 != null) && (paramArrayOfFloat5 != null)) {
      localdRK2 = new dRK(paramString5, paramArrayOfFloat5);
      localdRK2.DP(5);
    } else {
      localdRK2 = null;
    }

    this.cTi = new csn(localdRK1, localdRK2);
  }

  protected void E(Su paramSu)
  {
    arl localarl = paramSu.aeQ();
    UG localUG = localarl.LB();
    boolean bool = c(localarl);
    apj();

    int i = localUG.getMinX();
    int j = localUG.getMinY();
    int k = localUG.getWidth();
    int m = i + k;
    int n = j + localUG.getHeight();

    for (int i1 = i; i1 < m; i1++)
      for (int i2 = j; i2 < n; i2++)
        if ((!bool) || (localUG.am(i1, i2)))
        {
          if (localUG.aq(i1, i2))
          {
            short s = localUG.aw(i1, i2);
            if (s != -32768)
            {
              this.cTj.ac(i1, i2, s);
              switch (cpA.hYP[a(this.cTj, paramSu).ordinal()]) {
              case 1:
                if (this.cTf != null)
                  this.cTf.Q(i1, i2, s); break;
              case 2:
                if (this.cTh != null)
                  this.cTh.Q(i1, i2, s); break;
              case 3:
                if (this.cTg != null)
                  this.cTg.Q(i1, i2, s); break;
              }
            }
          }
        }
  }

  private boolean c(arl paramarl) {
    aYV localaYV = paramarl.afA();
    if (localaYV == null)
      return false;
    return (localaYV.bnX()) && (localaYV.aeH());
  }

  public void a(Ce paramCe, Su paramSu, cYk paramcYk) {
    this.cTi.b(paramCe, paramSu, paramcYk);
  }

  public void p(cYk paramcYk) {
    this.cTi.p(paramcYk);
  }

  protected void a(String paramString, dn paramdn) {
    this.cTi.a(paramString, paramdn);
  }

  public void apj() {
    apk();
    if (this.cTf != null) {
      this.cTf.clear();
    }
    if (this.cTh != null) {
      this.cTh.clear();
    }
    if (this.cTg != null)
      this.cTg.clear();
  }

  public void apk()
  {
    this.cTi.clear();
  }

  public boolean q(cYk paramcYk) {
    return (this.cTf != null) && (this.cTf.B(paramcYk));
  }

  protected abstract dif a(cYk paramcYk, Su paramSu);
}