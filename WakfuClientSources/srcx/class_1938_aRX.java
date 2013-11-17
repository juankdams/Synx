import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public abstract class aRX
{
  protected static final Logger K = Logger.getLogger(aRX.class);
  protected long bkK;
  protected String ePr;
  protected long aT;
  protected cCB ePs;
  protected bwt ePt;
  protected apG ePu;

  protected aRX(long paramLong1, String paramString, long paramLong2, cCB paramcCB, bwt parambwt, apG paramapG)
  {
    this.bkK = paramLong1;
    this.ePr = paramString;
    this.aT = paramLong2;
    this.ePs = paramcCB;
    this.ePt = parambwt;
    this.ePu = paramapG;
  }

  public long sN() {
    return this.bkK;
  }

  public void aI(long paramLong) {
    this.bkK = paramLong;
  }

  public String bhX() {
    return this.ePr;
  }

  public void hf(String paramString) {
    this.ePr = paramString;
  }

  public long CD() {
    return this.aT;
  }

  public void eC(long paramLong) {
    this.aT = paramLong;
  }

  public cCB bhY() {
    return this.ePs;
  }

  public bwt bhZ() {
    return this.ePt;
  }

  public apG aCI() {
    return this.ePu;
  }

  public byte bia() {
    return 0;
  }

  public aqA c(cVo paramcVo)
  {
    aqA localaqA = this.ePu.bj(paramcVo.fa(), paramcVo.fb());
    if ((localaqA != null) && (localaqA.a(paramcVo))) {
      a(paramcVo, localaqA);
      return localaqA;
    }
    return null;
  }

  public boolean b(cVo paramcVo, int paramInt1, int paramInt2)
  {
    aqA localaqA = this.ePu.bj(paramInt1, paramInt2);
    return (localaqA != null) && (localaqA.a(paramcVo, paramInt1, paramInt2));
  }

  public boolean d(cVo paramcVo)
  {
    aqA localaqA = this.ePu.bj(paramcVo.fa(), paramcVo.fb());
    if ((localaqA != null) && (localaqA.b(paramcVo))) {
      b(paramcVo, localaqA);
      return true;
    }
    return false;
  }

  public boolean a(cMH paramcMH)
  {
    for (aqA localaqA : this.ePu) {
      sD localsD = new sD();
      localaqA.a(localsD.bbJ, true);
      paramcMH.ayw.add(localsD);
    }
    return true;
  }

  public boolean a(drq paramdrq, boolean paramBoolean)
  {
    paramdrq.ayt = this.bkK;
    paramdrq.ayu = this.ePr;
    paramdrq.ayv = this.aT;

    for (aqA localaqA : this.ePu) {
      cXz localcXz = new cXz();
      if (!localaqA.a(localcXz.bbJ, false)) {
        K.error("Erreur durant la sérialisation de la salle " + localaqA.aCJ() + " du sac " + this);
        return false;
      }
      paramdrq.ayw.add(localcXz);
    }

    return true;
  }

  public boolean b(cMH paramcMH)
  {
    this.ePu.clear();
    if (paramcMH.ayw.isEmpty()) {
      K.error("Pas de pièce ... problème de dé-serialisation du sac " + this);
    }

    for (Iterator localIterator1 = paramcMH.ayw.iterator(); localIterator1.hasNext(); ) { localsD = (sD)localIterator1.next();
      try {
        aqA localaqA1 = this.ePs.bjF();
        this.ePu.a(localsD.bbJ.gdr, localaqA1);
        if (!localaqA1.b(localsD.bbJ, false))
          K.error("Erreur durant la récupération des données d'une pièce du sac " + this);
      } catch (Exception localException2) {
        K.error("Erreur durant la récupération des données d'une pièce du sac " + localsD, localException2);
      } }
    sD localsD;
    try
    {
      this.ePu.a(this.ePs);

      if (!this.ePu.aBC())
        K.error("Erreur lors de l'Update des room du Havre-sac " + this);
    }
    catch (Exception localException1) {
      K.error("Erreur durant l'update des données d'une pièce du sac " + this, localException1);
    }

    for (Iterator localIterator2 = paramcMH.ayw.iterator(); localIterator2.hasNext(); ) { localsD = (sD)localIterator2.next();
      try {
        aqA localaqA2 = this.ePu.bi(localsD.bbJ.gdr);
        if (!localaqA2.b(localsD.bbJ, true))
          K.error("Erreur durant la récupération des données d'une pièce du sac " + this);
      } catch (Exception localException3) {
        K.error("Erreur durant la récupération des données d'une pièce du sac " + localsD, localException3);
      }
    }

    return true;
  }

  public boolean a(drq paramdrq)
  {
    this.bkK = paramdrq.ayt;
    this.ePr = paramdrq.ayu;
    this.aT = paramdrq.ayv;

    this.ePu.clear();
    for (Iterator localIterator = paramdrq.ayw.iterator(); localIterator.hasNext(); ) { localcXz = (cXz)localIterator.next();
      localaqA = this.ePs.bjF();
      this.ePu.a(localcXz.bbJ.gdr, localaqA);
      if (!localaqA.b(localcXz.bbJ, false)) {
        K.error("Erreur durant la récupération des données d'une pièce du sac " + this);
        return false;
      }
    }
    cXz localcXz;
    aqA localaqA;
    this.ePu.a(this.ePs);

    this.ePu.aBC();

    for (localIterator = paramdrq.ayw.iterator(); localIterator.hasNext(); ) { localcXz = (cXz)localIterator.next();
      localaqA = this.ePu.bi(localcXz.bbJ.gdr);
      if (!localaqA.b(localcXz.bbJ, true)) {
        K.error("Erreur durant la récupération des données d'une pièce du sac " + this);
        return false;
      }
    }
    return true;
  }

  protected void a(cVo paramcVo, aqA paramaqA)
  {
  }

  protected void b(cVo paramcVo, aqA paramaqA)
  {
  }

  public abstract void a(tF paramtF);
}