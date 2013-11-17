import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class aTV
{
  protected static Logger K = Logger.getLogger(aTV.class);

  private static bep[] iL = new bep[32];
  private static bep[] eUt;
  private caW eUu;
  private UG iM;
  private dNg bes;
  private final agl eUv;
  private final cYk eUw;
  private final int dKG;
  private final cOE ejP;
  private int eUx;
  private int dAs;
  private boolean eUy;
  private int eUz = 0;

  public aTV(agl paramagl, cYk paramcYk, int paramInt, cOE paramcOE) {
    this.eUv = paramagl;
    this.eUw = paramcYk;
    this.dKG = paramInt;
    this.ejP = paramcOE;
    if (this.ejP != null)
      this.iM = this.ejP.LB();
  }

  private boolean aiu()
  {
    bjg();
    return (bji()) && (bjh());
  }

  private void bjg() {
    this.eUu = new caW();
    this.eUu.b(this.eUv.bY(), this.eUv.afD(), this.eUv.arG());
  }

  private boolean bjh() {
    int i = this.eUv.fa();
    int j = this.eUv.fb();
    short s = this.eUv.fc();
    int k = this.bes.a(i, j, iL, 0);
    int m = cTI.a(0, k, iL, s);
    if (m == -32768) {
      K.error("Unable to find the cell (" + i + "; " + j + ") with z value = " + s);
      return false;
    }
    return true;
  }

  private boolean bji() {
    int i = this.eUv.fa();
    int j = this.eUv.fb();
    this.bes = this.iM.ei(i, j);
    if (this.bes == null) {
      K.error("The cell (" + i + "; " + j + ") is not in the fightMap");
      return false;
    }
    return true;
  }

  public iU bjj() {
    if (!aiu()) {
      K.error("Impossible d'initialiser correctement le computer");
      return null;
    }

    int i = this.eUv.fa();
    int j = this.eUv.fb();
    short s = this.eUv.fc();
    int k = 0;

    CG localCG = E();

    iU localiU = new iU();

    if ((localCG.hY == 0) && (localCG.hZ == 0)) {
      localiU.g(i, j, s);
      return localiU;
    }

    this.eUx = this.bes.a(i, j, eUt, 0);

    for (int m = 0; m < this.dKG; m++) {
      i += localCG.hY;
      j += localCG.hZ;

      apo localapo = A(i, j, s);

      if (localapo.isError()) {
        break;
      }
      if (localapo.isStopped()) {
        i -= localCG.hY;
        j -= localCG.hZ;
        localiU.y(true);
        localiU.a(localapo.qU());
      }
      else
      {
        int n = localapo.aBw() - s;

        if (n < 0) {
          k -= n;
        }
        localiU.aY(m + 1);
        localiU.aX(k);
        s = localapo.aBw();

        localiU.g(i, j, s);

        if (!bV(i, j))
        {
          if (bjm()) break; 
        }
      }
    }
    return localiU;
  }

  private CG E() {
    if (!this.eUy) {
      return new La(this.eUv.fa(), this.eUv.fb(), this.eUv.fc(), this.eUw.getX(), this.eUw.getY(), this.eUw.IB()).Vy();
    }
    return new La(this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), this.eUv.fa(), this.eUv.fb(), this.eUv.fc()).Vy();
  }

  private apo A(int paramInt1, int paramInt2, short paramShort) {
    apo localapo = new apo();
    localapo.bC(false);
    localapo.cE(false);
    if (!bU(paramInt1, paramInt2)) {
      K.error("The cell (" + paramInt1 + "; " + paramInt2 + ") is not in the fightMap");
      localapo.cE(true);
      return localapo;
    }

    if (!this.iM.aq(paramInt1, paramInt2)) {
      localapo.cF(true);
      return localapo;
    }

    int i = this.bes.a(paramInt1, paramInt2, eUt, 0);

    if (!p(i, paramShort)) {
      localapo.cF(true);
      return localapo;
    }

    localapo.aH(bjk());

    bjl();
    this.eUx = i;
    Object localObject;
    if ((this.eUv.aeH()) && (this.iM.s(paramInt1, paramInt2, paramShort))) {
      localObject = this.iM.au(paramInt1, paramInt2);
      if ((localObject instanceof dle)) {
        localapo.a((cdO)localObject);
      }
      localapo.cF(true);
      return localapo;
    }

    if ((this.eUv instanceof awr)) {
      localObject = this.ejP.LC().x(paramInt1, paramInt2, xj.bps.xj());
      if (!((List)localObject).isEmpty()) {
        localapo.cF(true);
        return localapo;
      }
    }
    localapo.bC(true);
    return localapo;
  }

  private boolean p(int paramInt, short paramShort) {
    int i = cTI.a(this.dAs, this.eUx, iL, paramShort);
    if (i == -32768) {
      K.error("Pas d'altitude valide trouvée pour la prochaine cellule");
      return false;
    }
    int j = this.eUu.a(i + this.dAs, this.dAs, this.eUx, iL, 0, paramInt, eUt);

    if (j <= 0) {
      return false;
    }
    short s = eUt[this.eUu.hrR[0]].aOl;
    return (this.eUz <= 0) || (s - paramShort <= this.eUz);
  }

  private short bjk() {
    return eUt[this.eUu.hrR[0]].aOl;
  }

  private void bjl() {
    bep[] arrayOfbep = iL;
    iL = eUt;
    eUt = arrayOfbep;
    this.dAs = this.eUu.hrR[0];
  }

  private boolean bU(int paramInt1, int paramInt2) {
    if (this.bes.p(paramInt1, paramInt2)) {
      return true;
    }
    this.bes = this.iM.ei(paramInt1, paramInt2);
    return this.bes != null;
  }

  private boolean bV(int paramInt1, int paramInt2) {
    return this.eUw.ae(paramInt1, paramInt2);
  }

  private boolean bjm() {
    if (this.ejP == null)
      return false;
    Collection localCollection = this.ejP.LC().bbj();
    if (this.ejP.LC() == null)
      return false;
    if (localCollection != null) {
      Iterator localIterator = localCollection.iterator();
      int i = 0;
      while (localIterator.hasNext()) {
        aAn localaAn = (aAn)localIterator.next();
        if (localaAn.c(aIm.egQ)) {
          i = 1;
          break;
        }
      }
      if (i != 0)
        return true;
    }
    return false;
  }

  public void ec(boolean paramBoolean) {
    this.eUy = paramBoolean;
  }

  public void nV(int paramInt) {
    this.eUz = paramInt;
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