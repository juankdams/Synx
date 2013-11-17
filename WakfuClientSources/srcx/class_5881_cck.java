import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cck extends cGt
{
  private static final Logger K = Logger.getLogger(cck.class);
  private final cGt htI;
  private final int htJ;

  public cck(cGt paramcGt, int paramInt)
  {
    super(new cxX(true, true));
    this.htI = paramcGt;
    this.htJ = paramInt;
  }

  public dmh Kt()
  {
    return dmh.ljU;
  }

  protected void P(int paramInt1, int paramInt2)
  {
    this.hpP.bdh();

    MD localMD = this.hpP.getPatchCoordFromMouse(paramInt1, paramInt2);
    int i = BX.eh(localMD.getX());
    int j = BX.ei(localMD.getY());

    if (c(this.hpP, i, j)) {
      localMD.set(BX.ej(i), BX.ek(j));
      bRc localbRc = this.hpP.a(this.htJ, localMD);

      ie[] arrayOfie = dt(i, j);
      this.aLp = new sy(localbRc, arrayOfie);
    } else {
      this.hpP.setTool(this.htI);
    }
  }

  private ie[] dt(int paramInt1, int paramInt2) {
    ArrayList localArrayList = new ArrayList();
    d(paramInt1, paramInt2, localArrayList);
    c(paramInt1, paramInt2, localArrayList);

    ie[] arrayOfie = new ie[localArrayList.size()];
    localArrayList.toArray(arrayOfie);
    return arrayOfie;
  }

  private void c(int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    int i = BX.ej(paramInt1);
    int j = BX.ek(paramInt2);

    aIJ localaIJ = this.hpP.getWorkingHavenWorld();
    short[][] arrayOfShort = localaIJ.aUI();

    for (int k = j - 1; k <= j + 2; k++)
      for (int m = i - 1; m <= i + 2; m++)
        if (((m != i) && (m != i + 1)) || ((k != j) && (k != j + 1)))
        {
          short s = localaIJ.a(arrayOfShort, m, k);
          if (s != 0)
          {
            cDs localcDs = ars.dzL.aP(s);
            paramArrayList.add(c(localcDs, m, k));
          }
        }
  }

  private void d(int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    cDs localcDs = ars.dzL.aP((short)0);

    int i = BX.ej(paramInt1);
    int j = BX.ek(paramInt2);

    paramArrayList.add(c(localcDs, i, j));
    paramArrayList.add(c(localcDs, i + 1, j));
    paramArrayList.add(c(localcDs, i, j + 1));
    paramArrayList.add(c(localcDs, i + 1, j + 1));
  }

  private ie c(cDs paramcDs, int paramInt1, int paramInt2) {
    bcQ localbcQ1 = this.hpP.getGround(paramInt1, paramInt2);
    bcQ localbcQ2 = this.hpP.b(paramcDs, paramInt1, paramInt2);
    short s = localbcQ1 != null ? localbcQ1.bqQ() : bnp.fGg;
    return new ie(localbcQ2, s);
  }

  public static boolean c(aLD paramaLD, int paramInt1, int paramInt2) {
    aIJ localaIJ = paramaLD.getWorkingHavenWorld();
    return new chs(localaIJ).dx(paramInt1, paramInt2);
  }
}