import org.apache.log4j.Logger;

class bor
{
  static final Logger K = Logger.getLogger(bor.class);

  private atC fHN = atC.dFb;
  private byte bml;
  private final byte fHO;
  private final boolean fHP;
  private final long fHQ;
  private boolean fHR;
  private Long fHS;

  bor(byte paramByte, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    this.fHP = paramBoolean2;
    this.fHO = paramByte;
    this.bml = paramByte;
    this.fHR = paramBoolean1;
    this.fHQ = paramLong;
    this.fHS = Long.valueOf(paramLong);
  }

  public boolean byc() {
    return this.fHN == atC.dFb;
  }

  public boolean aJu() {
    return this.fHN == atC.dFc;
  }

  public boolean byd() {
    return this.fHN == atC.dFd;
  }

  public byte Fx() {
    return this.bml;
  }

  public void as(byte paramByte) {
    this.bml = paramByte;
  }

  public byte bye() {
    return this.fHO;
  }

  boolean a(atC paramatC) {
    if (this.fHN != paramatC.aFO()) {
      K.error(String.format("[FIGHT_STATE] État incorrect pour une transition vers l'état %s, actuel: %s, requis: %s", new Object[] { paramatC, this.fHN, paramatC.aFO() }));

      return false;
    }

    this.fHN = paramatC;
    return true;
  }

  public boolean byf() {
    return this.fHP;
  }

  public boolean byg() {
    return this.fHR;
  }

  public void eY(boolean paramBoolean) {
    this.fHR = paramBoolean;
  }

  public long aJq() {
    return this.fHQ;
  }

  public Long byh() {
    return this.fHS;
  }

  public void a(Long paramLong, byte paramByte) {
    this.fHS = paramLong;
    this.bml = paramByte;
  }

  public boolean fN(long paramLong) {
    return (this.fHS != null) && (this.fHS.longValue() == paramLong);
  }

  public boolean fO(long paramLong) {
    return this.fHQ == paramLong;
  }
}