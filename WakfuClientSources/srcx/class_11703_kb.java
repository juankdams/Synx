public class kb
  implements cds
{
  private int aMQ;
  private int aMR;
  private int aMS;
  private int aMT;
  private long aMU;

  public kb(long paramLong)
  {
    this.aMU = paramLong;
    rL();
  }

  public kb(cds paramcds) {
    this.aMQ = paramcds.getSeconds();
    this.aMR = paramcds.getMinutes();
    this.aMS = paramcds.getHours();
    this.aMT = paramcds.getDays();
    rM();
    rL();
  }

  public kb(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.aMQ = paramInt1;
    this.aMR = paramInt2;
    this.aMS = paramInt3;
    this.aMT = paramInt4;
    rM();
    rL();
  }

  public void a(cds paramcds) {
    if (paramcds == null) {
      a(hwQ);
      return;
    }

    this.aMQ = paramcds.getSeconds();
    this.aMR = paramcds.getMinutes();
    this.aMS = paramcds.getHours();
    this.aMT = paramcds.getDays();
    this.aMU = paramcds.rO();
  }

  public void set(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.aMQ = paramInt1;
    this.aMR = paramInt2;
    this.aMS = paramInt3;
    this.aMT = paramInt4;
    rM();
    rL();
  }

  private void rL() {
    long l = this.aMU;
    this.aMT = ((int)(l / 86400L));
    l -= this.aMT * 3600 * 24;
    this.aMS = ((int)(l / 3600L));
    l -= this.aMS * 3600;
    this.aMR = ((int)(l / 60L));
    l -= this.aMR * 60;
    this.aMQ = ((int)l);
  }

  private void rM() {
    this.aMU = (this.aMQ + this.aMR * 60 + this.aMS * 3600 + this.aMT * 3600 * 24);
  }

  public int getSeconds() {
    return this.aMQ;
  }

  public int getMinutes() {
    return this.aMR;
  }

  public int getHours() {
    return this.aMS;
  }

  public int getDays() {
    return this.aMT;
  }

  public boolean rN() {
    return this.aMU > 0L;
  }

  public boolean isEmpty() {
    return this.aMU == 0L;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == this) || ((paramObject instanceof cds))) {
      cds localcds = (cds)paramObject;
      return rO() == localcds.rO();
    }
    return false;
  }

  public boolean b(cds paramcds) {
    return this.aMU > paramcds.rO();
  }

  public boolean c(cds paramcds) {
    return this.aMU < paramcds.rO();
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{Interval: ");
    localStringBuilder.append(this.aMT).append("d ");
    localStringBuilder.append(this.aMS).append(":").append(this.aMR).append(';').append(this.aMQ);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public long rO() {
    return this.aMU;
  }

  public long rP() {
    return this.aMU * 1000L;
  }

  public static kb I(long paramLong) {
    return new kb(paramLong);
  }

  public static kb J(long paramLong) {
    return new kb(paramLong / 1000L);
  }

  public int d(cds paramcds) {
    if (isEmpty()) {
      return 0;
    }
    if (paramcds.isEmpty()) {
      throw new ArithmeticException("/ by zero");
    }

    long l1 = this.aMU;
    long l2 = paramcds.rO();

    if (l2 == 0L) {
      throw new ArithmeticException("/ by zero");
    }

    return (int)(l1 / l2);
  }

  public void e(cds paramcds) {
    if (paramcds == null) {
      return;
    }
    this.aMU += paramcds.rO();
    rL();
  }

  public void f(cds paramcds) {
    if (paramcds == null) {
      return;
    }
    this.aMU -= paramcds.rO();
    rL();
  }

  public void bi(int paramInt) {
    this.aMU *= paramInt;
    rL();
  }

  public void v(float paramFloat) {
    this.aMU = (()((float)this.aMU * paramFloat));
    rL();
  }
}