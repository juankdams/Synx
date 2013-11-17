import org.apache.log4j.Logger;

public final class ddV extends bxG
{
  private long bux;
  private int buy;
  private boolean buz;
  private boolean buA;
  private aiZ gAc;
  private int hY;
  private int hZ;
  private int bpL;

  public ddV(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public long mC()
  {
    Su localSu = dX(this.bux);
    if (localSu == null) {
      return 0L;
    }

    apX localapX = bFa.a(localSu, this.gAc);
    if (localapX == null) {
      return 0L;
    }

    if (Ij()) {
      arl localarl = localSu.aeQ();
      if (localarl != null) {
        localSu.cQH().a(localapX, localarl.LH().AU(), localarl.i(this.hY, this.hZ, this.bpL));
      }

      lZ locallZ = cOQ();
      if (locallZ != null)
        ehE.info(locallZ.tP());
      return 0L;
    }
    return 0L;
  }

  private lZ cOQ()
  {
    Su localSu = dX(this.bux);
    dSR localdSR = Be.Kj().ea(this.buy);
    if (localdSR == null) {
      K.error("Sort inconnu " + this.buy);
      return null;
    }
    lZ locallZ = new lZ().tI().am(cPU.kAA);
    if ((localdSR.cWj()) && (localSu.bnX()) && (!localSu.aeI())) {
      locallZ.a(bU.fH().getString("fight.spellCast.shadow", new Object[] { new lZ().tz().a(localSu.cQF()).tA().tP() }));
    }
    else
    {
      locallZ.a(bU.fH().getString("fight.spellCast", new Object[] { new lZ().tz().a(localSu.cQF()).tA().tP(), new lZ().tz().a(localdSR.getName()).tP() }));
    }

    locallZ.tJ();

    if (this.buz)
      d(locallZ);
    else if (this.buA) {
      c(locallZ);
    }

    return locallZ;
  }

  private void c(lZ paramlZ) {
    if (byv.bFN().bFO().aeR() == mD().getId())
    {
      paramlZ.tz().am(cPU.kAC);
      paramlZ.a(" (").a(bU.fH().getString("critical.miss")).a(")");
    }
  }

  private void d(lZ paramlZ) {
    if (byv.bFN().bFO().aeR() == mD().getId())
    {
      paramlZ.tI().am(cPU.kAC);
      paramlZ.a(" (").a(bU.fH().getString("critical")).a(")");
      paramlZ.tJ();
    }
  }

  public void jC(long paramLong) {
    this.bux = paramLong;
  }

  public void zL(int paramInt) {
    this.buy = paramInt;
  }

  public void iZ(boolean paramBoolean) {
    this.buz = paramBoolean;
  }

  public void ja(boolean paramBoolean) {
    this.buA = paramBoolean;
  }

  public void d(aiZ paramaiZ) {
    this.gAc = paramaiZ;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
  }

  public void fH(int paramInt) {
    this.bpL = paramInt;
  }
}