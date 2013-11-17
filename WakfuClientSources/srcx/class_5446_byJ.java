import org.apache.log4j.Logger;

public final class byJ
  implements Qt
{
  public static final byJ gma = new byJ();
  private static final Logger K = Logger.getLogger(byJ.class);
  private int gmb;
  private final cSR cpL = new cSR();

  private int gmc = -1;
  private final cSR gmd = new cSR();

  public dmn bHG()
  {
    return this.gmd.yF();
  }

  private void bHH() {
    this.cpL.clear();
    int[] arrayOfInt1 = QI.cpK.acs();

    for (int k : arrayOfInt1) {
      bva localbva = (bva)QI.cpK.gq(k);
      if (localbva.bpl() == this.gmb)
        this.cpL.put(localbva.getId(), localbva);
    }
  }

  public bva rC(int paramInt) {
    return (bva)this.cpL.get(paramInt);
  }

  public bva cF(int paramInt1, int paramInt2) {
    dmn localdmn = this.cpL.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      bva localbva = (bva)localdmn.value();
      if (localbva.cB(paramInt1, paramInt2))
        return localbva;
    }
    return null;
  }

  public bva cG(int paramInt1, int paramInt2) {
    dmn localdmn = this.cpL.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      bva localbva = (bva)localdmn.value();
      if (localbva.bCL().contains(paramInt1, paramInt2))
        return localbva;
    }
    return null;
  }

  public void rD(int paramInt) {
    if (paramInt == this.gmb) {
      return;
    }

    this.gmb = paramInt;
    bHH();

    t(this.gmb, true);
  }

  public void a(aid paramaid, aYr paramaYr) {
    bGI localbGI = paramaid.avb();
    if (localbGI == null)
      return;
    bva localbva = (bva)this.cpL.get(localbGI.getId());
    if (localbva == null) {
      return;
    }
    t(this.gmc, true);
  }

  public void rE(int paramInt) {
    t(paramInt, false);
  }

  private void t(int paramInt, boolean paramBoolean) {
    if ((this.gmc == paramInt) && (!paramBoolean)) {
      return;
    }
    this.gmc = paramInt;

    bKM.bSX().b(bdN.fpZ);

    this.gmd.clear();

    dUx localdUx = bDk.bLI().cr((short)paramInt);
    if ((paramInt <= 0) || (localdUx == null) || (!localdUx.msb)) {
      return;
    }
    cSR localcSR = new cSR();

    int[] arrayOfInt = QI.cpK.acs();

    for (int k : arrayOfInt) {
      bva localbva = (bva)QI.cpK.gq(k);
      if (localbva.bpl() == paramInt)
      {
        if (localbva.boT() == null) {
          localbva.o(cSE.kEZ.yZ(localbva.getId()));
        }
        this.gmd.put(k, localbva);

        cwE localcwE = new cwE(localbva);
        aid localaid = localbva.boT();
        int m = localaid != null ? localaid.avc() : -1;
        dMI localdMI = (dMI)localcSR.get(m);
        if (localdMI == null) {
          localdMI = new dMI();
          localcSR.put(m, localdMI);
          localdMI.rf(paramInt);
        }

        localdMI.a(localcwE);
      }
    }
    ??? = localcSR.yF();
    while (((dmn)???).hasNext()) {
      ((dmn)???).fl();
      bKM.bSX().a(bdN.fpZ, ((dMI)((dmn)???).value()).getId(), (aQI)((dmn)???).value());
    }

    this.gmc = paramInt;
  }
}