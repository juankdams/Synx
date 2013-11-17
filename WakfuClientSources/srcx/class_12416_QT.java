import org.apache.log4j.Logger;

public class QT extends NQ
{
  public void d(byte paramByte, boolean paramBoolean)
  {
    super.d(paramByte, paramBoolean);
    try {
      aMp localaMp = (aMp)this.ceE[paramByte];
      if (localaMp != null)
        localaMp.dG(an(paramByte));
    }
    catch (Exception localException) {
      K.error("[SYMBIOT] on demande de modifier un index non valide");
    }
    ceR.chM().chN();
    acB();
  }

  public void a(csi paramcsi, byte paramByte) {
    super.a(paramcsi, paramByte);
    acy();

    ceR.chM().chO();
  }

  public void al(byte paramByte) {
    super.al(paramByte);
    acy();
  }

  public void ak(byte paramByte) {
    super.ak(paramByte);
    acz();
  }

  public void clearAll() {
    super.clearAll();
    acy();
    acz();
  }

  public boolean b(bxb parambxb) {
    boolean bool = super.b(parambxb);
    acy();
    acz();
    return bool;
  }

  private void acy() {
    ceR.chM().acy();
  }

  private void acz() {
    ceR.chM().acz();
  }

  public csi Q(short paramShort) {
    bdi localbdi = cMn.cFp().dP(paramShort);
    int i = localbdi.alM();
    return new aMp(paramShort, localbdi.getName(), localbdi.dhn().c(eu.ayM, i), 0L, (short)0);
  }

  protected void aai()
  {
    for (csi localcsi : this.ceE)
      c(localcsi);
  }

  protected void c(csi paramcsi)
  {
    if (paramcsi != null)
      paramcsi.a(cMn.cFp().dP(paramcsi.Rw()));
  }

  public void acA() {
    try {
      for (csi localcsi : this.ceE)
        if (localcsi != null)
          dLE.doY().a((aMp)localcsi, aMp.bF);
    }
    catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  public void bM(long paramLong) {
    super.bM(paramLong);
    ceR.chM().chN();
    acA();
    acy();
  }

  public void aaf() {
    super.aaf();
    ceR.chM().chN();
  }

  public void aam() {
    byte b1 = this.ceH;
    int i = 1;
    byte b2 = this.ceI;
    while (i <= b2) {
      b1 = (byte)(b1 + 1);
      if (b1 >= b2)
        b1 = (byte)(b1 - b2);
      if (an(b1)) {
        break;
      }
      i = (byte)(i + 1);
    }
    bzu localbzu = new bzu();
    localbzu.d(16814);
    localbzu.a(b1);
    cjO.clE().j(localbzu);
    acz();
  }

  public void acB() {
    dLE.doY().a(ceR.chM(), ceR.bF);
  }

  public void aal() {
    super.aal();
    acA();
    acB();
  }
}