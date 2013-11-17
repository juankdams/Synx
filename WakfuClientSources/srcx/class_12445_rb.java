import org.apache.log4j.Logger;

public final class rb extends cMb
{
  private static final Logger K = Logger.getLogger(rb.class);
  public static final int aYO = -1;
  private dSJ aYP;
  private final cCH aYQ = new cGc(this);
  private bCJ aYR;
  private gA aUe;
  private int aYS = -1;
  private aRN aYT;

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVH, dJO.lVI };
  }

  public csx[] am() {
    return new csx[] { aiI.dgs.avt() };
  }

  protected dJO eR()
  {
    return dJO.lVD;
  }

  public void bc() {
    super.bc();
    this.aUe = null;
    this.aYT = null;
    byv.bFN().b(oj.vO());
  }

  public void aJ() {
    super.aJ();
    D(true);
    ev(true);
    this.aYS = -1;
    this.aYR = new bCJ(0L, 0, bbW.flL, (short)1, null);
  }

  public String getName() {
    return bU.fH().getString("equipable.dummy");
  }

  public void a(abc paramabc) {
  }

  protected cCH ak() {
    return this.aYQ;
  }

  public void al()
  {
    if (!dzp.qF(this.fgH))
      this.aYP = ((dSJ)aKY.epr.a(cdc.hwj, Integer.parseInt(this.fgH)));
    if (this.aYP == null)
      throw new IllegalArgumentException("Impossible de trouver le paramètre " + this.fgH + " pour l'élément interactif d'id=" + this.aTz);
  }

  public void a(bbk parambbk) {
    this.aYR.d(parambbk);
  }

  public void G(int paramInt1, int paramInt2) {
    if (paramInt1 == paramInt2) {
      return;
    }
    if ((paramInt1 != -1) && (this.aUe != null)) {
      gA localgA = this.aUe;
      this.aUe = null;
      this.aYR.K(localgA);
    }

    if (paramInt2 != -1) {
      this.aUe = new gA(dsE.cYX());
      this.aUe.b(Hh.QM().dh(this.aYS));
      this.aUe.l((short)1);
      try {
        this.aYR.av(this.aUe);
      } catch (dI localdI) {
        K.warn("Ne devrait pas arriver, on a nettoyé l'inventaire avant");
      } catch (dcF localdcF) {
        K.warn("Ne devrait pas arriver, on a nettoyé l'inventaire avant");
      }
    }
  }

  public gA getItem() {
    return this.aUe;
  }

  public String getAnimName() {
    return this.aYP.getAnimName();
  }

  public byte xK() {
    return this.aYP.xK();
  }

  public int xL() {
    return this.aYS;
  }

  public void cx(int paramInt) {
    this.aYS = paramInt;
  }

  public void a(aRN paramaRN) {
    this.aYT = paramaRN;
  }

  public aRN xM() {
    return this.aYT;
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    if (paramdJO == dJO.lVS) {
      byv.bFN().b(oj.vO());
    }
    d(paramdJO);
    return true;
  }

  public EA xN() {
    if (this.krh == null)
      this.krh = new dUg(this);
    return this.krh;
  }
}