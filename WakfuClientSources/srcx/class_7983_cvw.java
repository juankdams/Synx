import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class cvw extends doA
{
  private static final aee bx = new bOO(new cFN());

  private static final qM by = new dzQ(new ec[] { new dLx("Param standard", new dmb[] { new dmb("id des zones d'heure", dnN.lnQ), new dmb("id de la zone de l'heure courante", dnN.lnQ) }) });

  private List igu = new ArrayList();
  private long igv;
  private byte igw;
  private int igx;
  public cCH aDV = new cFM(this, 13);

  public qM aF()
  {
    return by;
  }

  public cvw cti()
  {
    cvw localcvw;
    try
    {
      localcvw = (cvw)bx.Mm();
      localcvw.aOr = bx;
    } catch (Exception localException) {
      localcvw = new cvw();
      localcvw.aOr = null;
      localcvw.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    localcvw.igv = this.igv;

    localcvw.igu.clear();
    return localcvw;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    hq localhq1 = bMF.bUo().fl(this.cxl);
    if (localhq1 == null) {
      cVD();
      return;
    }

    hq localhq2 = bMF.bUo().fl(this.igx);
    if (localhq2 == null) {
      K.error("Unable to find area " + this.igx + ". Using " + this.cxl + " as the area even for the 'current' hour");
      localhq2 = localhq1;
    }

    b(paramaVc, paramBoolean);

    int[][] arrayOfInt = ctj();
    a(localhq1, localhq2, arrayOfInt);
  }

  private int[][] ctj()
  {
    int[][] arrayOfInt1 = { { 1, -2 }, { 2, -1 }, { 3, 0 }, { 2, 1 }, { 1, 2 }, { 0, 3 }, { -1, 2 }, { -2, 1 }, { -3, 0 }, { -2, -1 }, { -1, -2 }, { 0, -3 } };

    if (this.evo == null) {
      K.error("pas de caster ");
      return arrayOfInt1;
    }
    CG localCG = this.evo.E();
    [I local[I;
    int k;
    int m;
    switch (cFK.RE[localCG.ordinal()])
    {
    case 1:
      break;
    case 2:
      for (local[I : arrayOfInt1) {
        k = local[I[0];
        m = local[I[1];
        local[I[0] = m;
        local[I[1] = (-k);
      }
      break;
    case 3:
      for (local[I : arrayOfInt1) {
        local[I[0] = (-local[I[0]);
        local[I[1] = (-local[I[1]);
      }
      break;
    case 4:
      for (local[I : arrayOfInt1) {
        k = local[I[0];
        m = local[I[1];
        local[I[0] = (-m);
        local[I[1] = k;
      }
    }

    return arrayOfInt1;
  }

  private void a(hq paramhq1, hq paramhq2, int[][] paramArrayOfInt) {
    byte b = 0;
    if ((this.ejP == null) || (this.ejP.LB() == null)) {
      if (this.ejP == null)
        K.warn("Unable to spawn hours : context is null");
      else
        K.warn("Unable to spawn hours : context has no fightmap");
      return;
    }
    for (int[] arrayOfInt1 : paramArrayOfInt) {
      b = (byte)(b + 1);
      int k = this.eUw.getX() + arrayOfInt1[0];
      int m = this.eUw.getY() + arrayOfInt1[1];
      if (this.ejP.LB().am(k, m))
      {
        boolean bool = b % 12 == this.igw % 12;

        short s = this.ejP.LB().aw(k, m);
        long l = this.igv + b;
        if (s != -32768) {
          hq localhq1 = bool ? paramhq2 : paramhq1;

          hq localhq2 = (hq)localhq1.a(new agg(l, k, m, s, this.ejP, this.evo, cVC(), this.evo.E()));

          localhq2.h(b);
          localhq2.t(bool);

          this.ejP.LC().g(localhq2);
          this.igu.add(localhq2);
        } else {
          K.warn("La cellule [" + this.eUw.getX() + arrayOfInt1[0] + ":" + this.eUw.getY() + arrayOfInt1[1] + "] n'existe pas");
        }
      }
    }
  }

  public void a(aVc paramaVc) {
    short s = cVC();
    if (this.eWL != null) {
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
      this.igx = ((dpI)this.eWL).a(1, s, dNF.mei);
    }

    long l = this.ejP.LD().P((byte)3);
    this.igv = (l << 8);

    if (l > 2147483647L) {
      K.error("problème possible entre les Ids des effects Users");
    }

    this.igw = ((byte)dDE.dft().VN().getHours());
  }

  public void aK()
  {
    if (this.igu != null)
      for (cjK localcjK : this.igu)
        this.ejP.LC().h(localcjK);
    super.aK();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public cCH nu()
  {
    return this.aDV;
  }
}