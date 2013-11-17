import org.apache.log4j.Logger;

public class Od extends cMb
  implements AQ
{
  protected static final Logger K = Logger.getLogger(Od.class);
  protected dJu ceX;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    K.info("Action performed on interactive element : " + paramdJO.toString());
    a(paramdJO);
    d(paramdJO);
    return true;
  }

  public dJO eR()
  {
    return dJO.lVR;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVR };
  }

  public csx[] am()
  {
    if (this.ceX == null) {
      return csx.icw;
    }
    if (this.aTn == 1) {
      aCH localaCH = clR.cni().vL(this.ceX.gC());
      aNS localaNS = (aNS)aiI.dgq.avt();
      localaNS.iT(localaCH.aOR());
      localaNS.ma("desc.mru." + localaCH.aOS());

      a(localaNS);

      localaNS.fn(aat());
      localaNS.cM(aas());

      csx[] arrayOfcsx = new csx[1];
      arrayOfcsx[0] = localaNS;
      return arrayOfcsx;
    }
    return csx.icw;
  }

  public static boolean m(int paramInt1, int paramInt2, int paramInt3)
  {
    bBn localbBn = vd.QM().dh(paramInt1);
    byz localbyz = byv.bFN().bFO();

    if ((localbBn != null) && 
      (localbyz.bGP().yi(paramInt1) < paramInt2)) {
      Vu localVu = (Vu)localbyz.b(RS.cru);
      cEG localcEG = localVu.ha(paramInt1);
      if ((localcEG == null) || (localcEG.nP() < paramInt2)) {
        return false;
      }
    }

    return localbyz.JE() >= paramInt3;
  }

  public static String n(int paramInt1, int paramInt2, int paramInt3) {
    lZ locallZ = new lZ();
    bBn localbBn = vd.QM().dh(paramInt1);
    byz localbyz = byv.bFN().bFO();
    if (localbBn != null) {
      int i = ((paramInt2 != 1) || (localbyz.ayJ().hh(paramInt1) == null)) && (localbyz.bGP().yi(paramInt1) < paramInt2) ? 1 : 0;

      Vu localVu = (Vu)localbyz.b(RS.cru);
      cEG localcEG = localVu.ha(paramInt1);
      i &= ((localcEG == null) || (localcEG.nP() < paramInt2) ? 1 : 0);
      locallZ.am((i != 0 ? bNa.gRz : bNa.gRA).bUV());
      locallZ.a("[").a(localbBn.getName()).a("]").a(" x").bw(paramInt2);
    }
    if (paramInt3 > 0) {
      if (localbBn != null) {
        locallZ.tH();
      }
      locallZ.am((localbyz.JE() < paramInt3 ? bNa.gRz : bNa.gRA).bUV());
      locallZ.a(bU.fH().getString("kama.shortGain", new Object[] { Integer.valueOf(paramInt3) }));
    }
    return locallZ.tP();
  }

  public static void a(cMb paramcMb, aNS paramaNS, bZA parambZA) {
    byz localbyz = byv.bFN().bFO();
    if ((parambZA != null) && (!parambZA.i(localbyz, paramcMb, null, localbyz.ayL()))) {
      paramaNS.setEnabled(false);
      paramaNS.gW(daj.a(parambZA));
    }
  }

  private boolean aas() {
    if (this.ceX == null) {
      return false;
    }
    return m(this.ceX.diN(), this.ceX.diO(), this.ceX.qW());
  }

  private String aat() {
    if (this.ceX == null) {
      return null;
    }
    return n(this.ceX.diN(), this.ceX.diO(), this.ceX.qW());
  }

  private void a(aNS paramaNS) {
    if (this.ceX == null) {
      return;
    }
    a(this, paramaNS, this.ceX.F());

    byz localbyz = byv.bFN().bFO();

    Vu localVu = (Vu)localbyz.b(RS.cru);
    if ((getId() == 14641L) && (localVu.ha(12787) != null)) {
      paramaNS.setEnabled(false);
      paramaNS.gW(bU.fH().getString("lootChest.cantDrop"));
    }
  }

  public aCH te() {
    return clR.cni().vL(this.ceX.gC());
  }

  public short OL()
  {
    return (short)(int)(bY() * 10.0F);
  }

  public void aJ()
  {
    super.aJ();
    x((short)1);
    dO((short)-32768);
    eu(true);
    ev(true);
    ix(true);
    iz(true);
    D(true);
    if ((!bB) && (this.ceX != null)) throw new AssertionError(); 
  }

  public void bc()
  {
    super.bc();
    this.ceX = null;
  }

  public String getName()
  {
    if (this.ceX == null) {
      return null;
    }
    String str = bU.fH().b(85, this.ceX.getId(), new Object[0]);
    if (this.ceX.qW() > 0) {
      str = str + " (" + this.ceX.qW() + "§)";
    }

    if (this.ceX.diP()) {
      str = str + " (" + this.ceX.diO() + " x " + bU.fH().b(15, this.ceX.diN(), new Object[0]) + ')';
    }

    return str;
  }

  public void al()
  {
    super.al();
    this.ceX = ((dJu)aKY.epr.a(cdc.hvU, Integer.parseInt(this.fgH)));
    if (this.ceX == null)
      K.error("pas de param(paramId=" + this.fgH + ") trouvé pour le lootChest " + getId(), new Exception());
  }

  public void a(abc paramabc)
  {
  }

  public void aau()
  {
    super.aau();
    this.aTn = 0;
    sM();
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDx.a(new aGH[] { localbyz });
  }

  public diP tj() {
    return this.ceX;
  }

  public String toString()
  {
    return "LootChest{m_param=" + this.ceX.getId() + '}';
  }

  public EA xN()
  {
    if (this.krh == null)
      this.krh = new Qu(this);
    return this.krh;
  }
}