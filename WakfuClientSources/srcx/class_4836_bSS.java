import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;

public final class bSS extends doA
{
  private static final aee bx = new bOO(new ate());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[] { new dmb("Nb de gisements min", dnN.lnS), new dmb("Nb de gisements max", dnN.lnS), new dmb("% d'avoir du rare", dnN.lnS) }), new dLx("Spawn un gisement sur la cellule cible", new dmb[0]) });
  private static final int heg = 3;
  private int heh;
  private int hei;
  private int hej;
  private boolean hek;

  public qM aF()
  {
    return by;
  }

  public bSS()
  {
    aH();
  }

  public bSS bZz()
  {
    bSS localbSS;
    try {
      localbSS = (bSS)bx.Mm();
      localbSS.aOr = bx;
    } catch (Exception localException) {
      localbSS = new bSS();
      localbSS.aOr = null;
      localbSS.eXg = false;
      K.error("Erreur lors d'un checkOut sur un EnutrofDepositPlacement : " + localException.getMessage());
    }
    return localbSS;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() == 0) {
      this.hei = 1;
      this.heh = 1;
      this.hej = 0;
      this.hek = false;
      return;
    }

    if (((dpI)this.eWL).bep() < 3) {
      return;
    }
    this.hek = true;
    this.heh = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    this.hei = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    if (this.hei < this.heh) {
      int i = this.hei;
      this.hei = this.heh;
      this.heh = i;
    }

    if (this.heh < 0) {
      this.heh = 1;
    }
    this.hej = ((dpI)this.eWL).a(2, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }
    if ((this.evo == null) || (!(this.evo instanceof dhJ))) {
      return;
    }
    if (this.heh <= 0) {
      return;
    }
    List localList = bMF.bUo().bUr();
    short s = ((dhJ)this.evo).nU();

    int i = bCO.sf(100);
    int j = 0;
    if (i < this.hej) {
      j = 1;
    }
    int k = bCO.cL(this.heh, this.hei + 1);
    if (j != 0) {
      a(localList, s);
      k--;
    }

    for (int m = 0; m < k; m++)
      b(localList, s);
  }

  private void a(List paramList, short paramShort)
  {
    Object localObject = null;
    int i = 0; for (int j = paramList.size(); i < j; i++) {
      chy localchy = (chy)paramList.get(i);
      if (localObject == null) {
        localObject = localchy;
      }
      else if (localchy.cjw() > localObject.cjw()) {
        localObject = localchy;
      }
    }
    ub((int)localObject.clt());
  }

  private void ub(int paramInt) {
    cYk localcYk = bZA();
    if (localcYk == null) {
      return;
    }
    bIL localbIL = bIL.a(this.ejP, localcYk, paramInt);
    localbIL.i(((dhJ)this.evo).afw());
    localbIL.ge(true);
    localbIL.cD((short)1);
    localbIL.b(ef.kL());
    localbIL.u(this);
    localbIL.bkz();
  }

  private cYk bZA()
  {
    UG localUG = this.ejP.LB();
    if ((this.hek) && (localUG == null)) {
      K.warn("pas de fightmap sur le context " + this.ejP);
      return null;
    }

    if (!this.hek) {
      return this.eUw;
    }
    return i(localUG);
  }

  private cYk i(UG paramUG) {
    cYk localcYk = null;
    for (int i = 0; i < 3; i++) {
      localcYk = j(paramUG);
      if (localcYk != null)
      {
        localcYk.dG(paramUG.aw(localcYk.getX(), localcYk.getY()));
        int j = a(paramUG, localcYk);
        if (j == -1) {
          localcYk = null;
        }
        else
        {
          if (M(localcYk)) {
            localcYk = null;
          }
          if (localcYk != null)
            return localcYk; 
        }
      }
    }
    return localcYk;
  }

  private boolean M(cYk paramcYk) {
    Collection localCollection = this.ejP.LC().bbj();
    for (cjK localcjK : localCollection) {
      if ((localcjK.axG() == this.evo) && (localcjK.getType() == xj.bpv.xj()) && (localcjK.B(paramcYk))) {
        return true;
      }
    }
    return false;
  }

  private cYk j(UG paramUG) {
    bbH localbbH = ((dpI)this.eWL).aui();
    if (localbbH.eL() == chY.hGo) {
      return paramUG.ahV();
    }
    CG localCG = this.evo.E();
    cYk localcYk = this.evo.ML();

    Iterable localIterable = ((dpI)this.eWL).aui().b(this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), localcYk.getX(), localcYk.getY(), localcYk.IB(), localCG);
    ArrayList localArrayList = new ArrayList();
    for (int[] arrayOfInt : localIterable) {
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];

      if ((paramUG.p(i, j)) && 
        (paramUG.am(i, j)))
      {
        int k = paramUG.aw(i, j);
        if (k != -32768)
        {
          localArrayList.add(arrayOfInt);
        }
      }
    }
    if (localArrayList.isEmpty()) {
      K.error("Pas de cellule trouvee pour le spawn d'un gisement " + localbbH.eL());
      return null;
    }

    return new cYk((int[])localArrayList.get(bCO.sf(localArrayList.size())));
  }

  private int a(UG paramUG, cYk paramcYk) {
    paramUG.bw(true);

    dqg localdqg = dqg.cXq();
    int i = -1;
    try {
      localdqg.a(this.evo.bY(), this.evo.afD(), ((dhJ)this.evo).arG());
      localdqg.a(paramUG);
      localdqg.ak(this.evo.ML());
      localdqg.al(paramcYk);
      Nm localNm = new Nm();
      localNm.caC = (paramUG.getHeight() + paramUG.getWidth());
      localNm.caB = 2048;
      localdqg.a(localNm);

      i = localdqg.cXv();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    } finally {
      localdqg.release();
      paramUG.bw(false);
    }
    return i;
  }

  private void b(List paramList, short paramShort) {
    int i = bCO.sf(100);
    Object localObject = null;
    int j = 0; for (int k = paramList.size(); j < k; j++) {
      chy localchy = (chy)paramList.get(j);
      if (localObject == null) {
        localObject = localchy;
      }
      else if (((i < localObject.cjw()) && (i > localchy.cjw())) || ((i > localchy.cjw()) && (localchy.cjw() > localObject.cjw())))
      {
        localObject = localchy;
      }
    }
    ub((int)localObject.clt());
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public void bc()
  {
    this.heh = 0;
    this.hej = 0;
    this.hek = true;
    super.bc();
  }
}