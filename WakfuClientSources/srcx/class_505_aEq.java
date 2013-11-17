import org.apache.log4j.Logger;

public final class aEq extends cMb
{
  private static final Logger K = Logger.getLogger(aEq.class);
  private axa dZY;
  private int[] dZZ;
  private bCJ aYR;
  private final cCH aYQ;

  public aEq()
  {
    this.aYQ = new bjD(this);
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (paramdJO == dJO.lVS) {
      byv.bFN().b(cuj.csG());
    }
    return false;
  }

  public String getName()
  {
    return bU.fH().getString("bookcase");
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVJ, dJO.lVK };
  }

  public csx[] am()
  {
    if ((abI().sN() == byv.bFN().bFO().getId()) || (deV.jF(abI().sN())))
    {
      return new csx[] { aiI.dgt.avt() };
    }

    return new csx[] { aiI.dgv.avt() };
  }

  public void aJ()
  {
    super.aJ();
    D(true);
    ev(true);
  }

  public void bc()
  {
    super.bc();
    this.aYR = null;
    byv.bFN().b(cuj.csG());
  }

  protected cCH ak()
  {
    return this.aYQ;
  }

  public void al()
  {
    if (!dzp.qF(this.fgH))
      this.dZY = ((axa)aKY.epr.a(cdc.hwk, Integer.parseInt(this.fgH)));
    if (this.dZY == null) {
      throw new IllegalArgumentException("Impossible de trouver le paramètre " + this.fgH + " pour l'élément interactif d'id=" + this.aTz);
    }
    this.aYR = new bCJ(0L, 0, gv.aEB, (short)this.dZY.aIO(), null);
  }

  public void aQB() {
    if (this.dZZ.length != this.aYR.cFy()) {
      throw new IllegalArgumentException("La taille des données dynamiques ne correspond pas à la taille des données statiques. Bookcase id=" + this.aTz);
    }
    short s1 = 0; for (short s2 = this.aYR.cFy(); s1 < s2; s1 = (short)(s1 + 1)) {
      gA localgA1 = this.aYR.dR(s1);
      int i = localgA1 == null ? 0 : localgA1.ok();
      int j = this.dZZ[s1];
      if (i != j)
      {
        if (localgA1 != null) {
          this.aYR.dS(s1);
        }
        if (j != 0) {
          gA localgA2 = new gA(dsE.cYX());
          localgA2.b(Hh.QM().dh(j));
          localgA2.l((short)1);
          try {
            this.aYR.i(localgA2, s1);
          } catch (dI localdI) {
            K.warn("Ne devrait pas arriver, on a nettoyé l'inventaire avant");
          } catch (dcF localdcF) {
            K.warn("Ne devrait pas arriver, on a nettoyé l'inventaire avant");
          } catch (bQT localbQT) {
            K.warn("Ne devrait pas arriver, on a nettoyé l'inventaire avant");
          }
        }
      }
    }
  }

  public void a(bbk parambbk) { this.aYR.d(parambbk); }

  public bCJ aQC()
  {
    return this.aYR;
  }

  public int[] aQD() {
    return this.dZZ;
  }

  public void t(int[] paramArrayOfInt) {
    this.dZZ = paramArrayOfInt;
  }

  public int aQE() {
    if (this.dZZ == null)
      return 0;
    int i = 0;
    for (int j = 0; j < this.dZZ.length; j++) {
      int k = this.dZZ[j];
      if (k > 0)
        i++;
    }
    return i;
  }

  protected dJO eR()
  {
    return dJO.lVD;
  }

  public void a(abc paramabc)
  {
  }

  public EA xN()
  {
    if (this.krh == null)
      this.krh = new cGM(this);
    return this.krh;
  }
}