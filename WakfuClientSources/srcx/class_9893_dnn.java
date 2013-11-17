import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class dnn
  implements bX
{
  private static final Logger K = Logger.getLogger(dnn.class);
  private FreeParticleSystem lmD;
  private FreeParticleSystem lmE;
  private FreeParticleSystem lmF;
  private FreeParticleSystem lmG;
  private FreeParticleSystem lmH;
  private FreeParticleSystem lmI;
  private final cew aEM;

  public dnn(cew paramcew)
  {
    if ((!bB) && (paramcew == null)) throw new AssertionError();
    this.aEM = paramcew;
    this.aEM.a(this);
  }

  public void b(boolean paramBoolean, dnS paramdnS) {
    if (this.aEM == null) {
      return;
    }
    if (paramBoolean)
    {
      this.aEM.cgU();
    }
    else this.aEM.cgV();
  }

  public void cgY()
  {
    chh();
    chm();
    chl();
    chj();
    chi();
    chn();
  }

  public void cUG() {
    if (this.lmD != null)
      this.lmD.setVisible(true);
  }

  public void cUH() {
    if (this.lmD != null)
      this.lmD.setVisible(false);
  }

  public void chh()
  {
    if (this.lmD != null) {
      cWS.cKD().zk(this.lmD.getId());
      this.lmD = null;
    }
  }

  public void chi() {
    if (this.lmE != null) {
      cWS.cKD().zk(this.lmE.getId());
      this.lmE = null;
    }
  }

  public void cUI() {
    if (this.lmF != null)
      this.lmF.setVisible(true);
  }

  public void cUJ() {
    if (this.lmF != null)
      this.lmF.setVisible(false);
  }

  public void cgX() {
    if (this.lmG != null)
      this.lmG.setVisible(true);
  }

  public void cgW() {
    if (this.lmG != null)
      this.lmG.setVisible(false);
  }

  public void dI(byte paramByte)
  {
    chm();
    a(paramByte, clP.hPt);
  }

  public void dJ(byte paramByte) {
    chm();
    a(paramByte, clP.hPs);
  }

  private void a(byte paramByte, int[][] paramArrayOfInt) {
    Su localSu = this.aEM.cbD();
    if ((localSu == null) || (this.lmF != null)) {
      K.error(String.format("Cercle d'équipe déjà présent sur #%d %s - %s", new Object[] { Long.valueOf(this.aEM.getId()), localSu, bBd.rV(6) }));

      return;
    }

    int i = localSu.aeR();
    int j = localSu.afD();
    if ((j < 0) || (j >= paramArrayOfInt.length))
      j = 0;
    if ((paramByte < 0) || (paramByte >= paramArrayOfInt[j].length)) {
      K.error(String.format("Id de team invalide pour afficher le cercle d'équipe sur #%d %s %s", new Object[] { Long.valueOf(this.aEM.getId()), localSu, bBd.rV(6) }));

      return;
    }

    if ((!bB) && (this.lmF != null)) throw new AssertionError();
    chm();
    this.lmF = cof.cop().vY(paramArrayOfInt[j][paramByte]);
    if (this.lmF != null) {
      this.lmF.b(this.aEM);
      this.lmF.cS(i);
      this.lmF.setVisible(this.aEM.isVisible());
      cWS.cKD().b(this.lmF);
    } else {
      K.error("Impossible d'afficher le cercle d'équipe sur l'acteur id=" + this.aEM.getId() + " : APS invalide (" + paramArrayOfInt[j][paramByte] + ")");
    }
  }

  public void chm()
  {
    if (this.lmF == null) {
      return;
    }
    cWS.cKD().zk(this.lmF.getId());
    this.lmF = null;
  }

  public void j(CG paramCG) {
    Su localSu = this.aEM.cbD();
    int i = localSu.aeR();

    int j = localSu.Fx();
    if ((j < 0) || (j >= clP.hPp.length))
      return;
    int[] arrayOfInt = clP.hPp[j];

    int k = paramCG.m_index;
    int m;
    switch (k) {
    case 1:
      m = arrayOfInt[0];
      break;
    case 3:
      m = arrayOfInt[1];
      break;
    case 5:
      m = arrayOfInt[2];
      break;
    case 7:
      m = arrayOfInt[3];
      break;
    case 2:
    case 4:
    case 6:
    default:
      m = arrayOfInt[0];
    }

    int n = localSu.afD();
    cYk localcYk = null;
    if (n == 1) {
      localcYk = localSu.ML();
      localcYk.k(paramCG);
    }

    chn();
    this.lmG = cof.cop().vY(m);
    if (this.lmG != null) {
      if (localcYk != null)
        this.lmG.k(localcYk.getX(), localcYk.getY(), localcYk.IB());
      else {
        this.lmG.b(this.aEM);
      }
      this.lmG.cS(i);
      this.lmG.setVisible(this.aEM.isVisible());
      cWS.cKD().b(this.lmG);
    }
  }

  public void chn() {
    if (this.lmG == null) {
      return;
    }
    cWS.cKD().zk(this.lmG.getId());
    this.lmG = null;
  }

  public void che()
  {
    Su localSu = this.aEM.cbD();
    if (localSu == null) {
      return;
    }
    if (!localSu.afp()) {
      return;
    }
    int i = localSu.aeR();
    int j = localSu.Fx();

    if ((j < 0) || (j >= clP.hPo.length)) {
      return;
    }

    this.lmD = cof.cop().vY(clP.hPo[j]);
    if (this.lmD != null) {
      this.lmD.b(this.aEM);
      this.lmD.cS(i);
      cWS.cKD().b(this.lmD);
    }
  }

  public void chf() {
    Su localSu = this.aEM.cbD();
    if (localSu == null) {
      return;
    }
    if (!localSu.afp()) {
      return;
    }
    int i = localSu.aeR();
    int j = localSu.Fx();

    if ((j < 0) || (j >= clP.hPq.length)) {
      return;
    }

    this.lmE = cof.cop().vY(clP.hPq[j]);
    if (this.lmE != null) {
      this.lmE.b(this.aEM);
      this.lmE.cS(i);
      cWS.cKD().b(this.lmE);
    }
  }

  public void dK(byte paramByte)
  {
    Su localSu = this.aEM.cbD();
    if (localSu == null) {
      return;
    }
    int i = localSu.aeR();

    if (this.lmH != null) {
      cWS.cKD().zk(this.lmH.getId());
      this.lmH = null;
    }

    if (paramByte >= 0) {
      this.lmH = cof.cop().vY(clP.hPy[paramByte]);
    }
    else if ((localSu instanceof bKm))
      this.lmH = cof.cop().vY(clP.hPz[0]);
    else {
      this.lmH = cof.cop().vY(clP.hPz[1]);
    }

    if (this.lmH != null) {
      this.lmH.b(this.aEM);
      this.lmH.cS(i);
      cWS.cKD().b(this.lmH);
    }
  }

  public void chk()
  {
    Su localSu = this.aEM.cbD();
    if (localSu == null) {
      return;
    }
    int i = localSu.aeR();

    if (this.lmH != null) {
      cWS.cKD().zk(this.lmH.getId());
      this.lmH = null;
    }
    this.lmH = cof.cop().vY(clP.hPz[1]);

    if (this.lmH != null) {
      this.lmH.b(this.aEM);
      this.lmH.cS(i);
      cWS.cKD().b(this.lmH);
    }
  }

  public void chl()
  {
    if (this.lmH != null) {
      cWS.cKD().zk(this.lmH.getId());
      this.lmH = null;
    }
  }

  public void chg()
  {
    Su localSu = this.aEM.cbD();
    if (localSu == null) {
      return;
    }
    int i = localSu.aeR();
    int j = localSu.Fx();

    if (this.lmI != null) {
      cWS.cKD().zk(this.lmI.getId());
      this.lmI = null;
    }
    if ((j >= 0) && (j < clP.hPr.length)) {
      this.lmI = cof.cop().vY(clP.hPr[j]);
    }

    if (this.lmI != null) {
      this.lmI.b(this.aEM);
      this.lmI.cS(i);
      cWS.cKD().b(this.lmI);
    }
  }

  public void chj()
  {
    if (this.lmI != null) {
      cWS.cKD().zk(this.lmI.getId());
      this.lmI = null;
    }
  }
}