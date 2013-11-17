public enum cpT
{
  private final byte ePB;
  private final long[] hZk;
  private final ciB hZl;
  private final dJZ hZm;
  private final kk hZn;
  private final boolean hZo;

  private cpT(byte paramciB, dJZ paramkk, ciB paramArrayOfLong, kk paramBoolean, long[] arg7, boolean arg8)
  {
    this.ePB = paramciB;
    Object localObject;
    this.hZk = localObject;
    this.hZl = paramArrayOfLong;
    this.hZm = paramkk;
    this.hZn = paramBoolean;
    boolean bool;
    this.hZo = bool;
  }

  public byte bcI() {
    return this.ePB;
  }

  public ciB cpc() {
    return this.hZl;
  }

  public dJZ cpd() {
    return this.hZm;
  }

  public kk cpe() {
    return this.hZn;
  }

  public boolean hE(long paramLong) {
    for (long l : this.hZk) {
      if (paramLong == l) {
        return true;
      }
    }
    return false;
  }

  public static cpT dR(byte paramByte) {
    for (cpT localcpT : values()) {
      if (localcpT.ePB == paramByte) {
        return localcpT;
      }
    }

    return null;
  }

  public static cpT f(aOv paramaOv) {
    for (cpT localcpT : values()) {
      if ((localcpT.hZm == paramaOv) || (localcpT.hZn == paramaOv) || (localcpT.hZl == paramaOv)) {
        return localcpT;
      }
    }

    return null;
  }

  public static cpT hF(long paramLong) {
    for (cpT localcpT : values()) {
      if (aUP.c(localcpT.hZk, paramLong)) {
        return localcpT;
      }
    }
    return null;
  }

  public boolean cpf() {
    return this.hZo;
  }

  public void blt() {
    setEnabled(true);
  }

  public void blv() {
    setEnabled(false);
  }

  private void setEnabled(boolean paramBoolean) {
    if (this.hZo) {
      if (this.hZm != null) {
        this.hZm.setEnabled(paramBoolean);
      }
      if (this.hZl != null) {
        this.hZl.setEnabled(paramBoolean);
      }
      if (this.hZn != null)
        this.hZn.setEnabled(paramBoolean);
    }
  }
}