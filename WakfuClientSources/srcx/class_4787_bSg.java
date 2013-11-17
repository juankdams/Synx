import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bSg extends doA
{
  private static final aee bx = new bOO(new Og());

  private static final qM by = new dzQ(new ec[] { new dLx("Balance la cible dans le dos du caster à un nombre de case définie", new dmb[] { new dmb("nombre de case dans le dos du caster", dnN.lnR), new dmb("Dégâts de collision par cellule", dnN.lnR) }) });

  private static bep[] iL = new bep[32];
  private static bep[] eUt;
  private cYk dKD;
  private float dKF;
  private float dKH;
  public cCH aAR = new Oi(this, 10);

  public qM aF()
  {
    return by;
  }

  public bSg bZf()
  {
    bSg localbSg;
    try
    {
      localbSg = (bSg)bx.Mm();
      localbSg.aOr = bx;
    } catch (Exception localException) {
      localbSg = new bSg();
      localbSg.aOr = null;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    localbSg.dKF = this.dKF;
    return localbSg;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.cxl <= 0) {
      jJ(true);
      return;
    }

    int i = 1;

    if (((this.evo instanceof aTa)) && 
      (((aTa)this.evo).Vj())) {
      i = 0;
    }

    if (i != 0)
    {
      if (this.eWU) {
        if (this.dKF > 0.0F)
        {
          bFw localbFw = bFw.a(this.ejP, bTI.heZ, dnO.lnU, bMr.ax(this.dKF), this.evo);
          localbFw.bkr();
          localbFw.c(null, false);
        }

      }
      else if (this.dKD == null) {
        K.error("pas de cellule d'arrivée");
        jJ(true);
        return;
      }

      this.evp.q(this.dKD.getX(), this.dKD.getY(), this.dKD.IB());

      b(paramaVc, paramBoolean);

      if (this.ejP.LC() != null)
        this.ejP.LC().a(this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), this.dKD.getX(), this.dKD.getY(), this.dKD.IB(), this.evp);
    }
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null) {
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
      this.dKH = ((dpI)this.eWL).o(1, s);
    } else {
      this.cxl = 0;
      this.dKH = 0.0F;
    }

    if ((!(this.evp instanceof dhJ)) || (!(this.evo instanceof dhJ))) {
      this.cxl = 0;
    }
    if (this.cxl > 0)
      aHO();
  }

  public void aHO()
  {
    this.dKF = 0.0F;

    if (((this.evp instanceof dhJ)) && ((this.evo instanceof dhJ))) {
      UG localUG = this.ejP.LB();
      if (localUG == null) {
        K.error("pas de fightmap sur le context " + this.ejP);
        return;
      }

      int i = this.evo.fa();
      int j = this.evo.fb();
      short s1 = this.evo.fc();

      dhJ localdhJ = (dhJ)this.evp;
      caW localcaW = new caW();
      localcaW.b(localdhJ.bY(), localdhJ.afD(), localdhJ.arG());

      dNg localdNg = localUG.ei(i, j);
      if (localdNg == null) {
        K.error("The cell (" + i + "; " + j + ") is not in the fightMap");
        return;
      }
      int k = localdNg.a(i, j, iL, 0);
      int m = cTI.a(0, k, iL, s1);
      if (m == -32768) {
        K.error("Unable to find the cell (" + i + "; " + j + ") with z value = " + s1);
        return;
      }

      CG localCG = new La(this.evo.fa(), this.evo.fb(), this.evo.fc(), this.eUw.getX(), this.eUw.getY(), this.eUw.IB()).Vy().LO();

      int n = localCG.hY;
      int i1 = localCG.hZ;
      int i3;
      for (int i2 = 0; i2 < this.cxl; i2++) {
        i3 = i + n;
        int i4 = j + i1;

        if (!localdNg.p(i3, i4)) {
          localdNg = localUG.ei(i3, i4);
          if (localdNg == null) {
            K.error("The cell (" + i3 + "; " + i4 + ") is not in the fightMap");
            return;
          }
        }

        int i5 = localdNg.a(i3, i4, eUt, 0);

        int i6 = localcaW.a(m, 0, k, iL, 0, i5, eUt);
        if (i6 <= 0)
        {
          break;
        }

        short s2 = eUt[localcaW.hrR[0]].aOl;

        bep[] arrayOfbep = iL;
        iL = eUt;
        eUt = arrayOfbep;
        k = i5;
        m = localcaW.hrR[0];

        if (localUG.s(i3, i4, s2)) {
          break;
        }
        i = i3;
        j = i4;
        s1 = s2;

        Collection localCollection = this.ejP.LC().bbj();
        if (localCollection != null) {
          Iterator localIterator = localCollection.iterator();
          int i7 = 0;
          while (localIterator.hasNext()) {
            aAn localaAn = (aAn)localIterator.next();
            if (localaAn.c(aIm.egQ)) {
              i7 = 1;
              break;
            }
          }
          if (i7 != 0)
          {
            break;
          }
        }
      }
      this.dKD = new cYk(i, j, s1);

      if (i2 < this.cxl) {
        i3 = this.cxl - i2;
        if (i3 > 0) {
          this.dKF += i3 * this.dKH;
        }
      }

      this.cxl = i2;
    }
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public boolean bzc() {
    return true;
  }

  public cYk qR() {
    return this.dKD;
  }

  public cCH lJ()
  {
    return this.aAR;
  }

  static
  {
    for (int i = 0; i < iL.length; i++) {
      iL[i] = new bep();
    }

    eUt = new bep[32];

    for (i = 0; i < eUt.length; i++)
      eUt[i] = new bep();
  }
}