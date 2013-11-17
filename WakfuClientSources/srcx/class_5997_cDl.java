class cDl
  implements aUw, Comparable
{
  protected aUw hZs;
  protected aUw hZr;
  protected int iwz;
  protected long aPT;
  protected long iwA;
  protected long iwB;
  protected int iwC;
  protected int iwD;
  private boolean iwE;
  protected dUd iwF;

  public cDl()
  {
    this.iwz = 0;
    this.iwD = 0;
    this.iwE = false;
  }

  public void xv(int paramInt)
  {
    this.iwz = paramInt;
  }

  public int czj()
  {
    return this.iwz;
  }

  public aUw bjx()
  {
    return this.hZs;
  }

  public void a(aUw paramaUw)
  {
    this.hZs = paramaUw;
  }

  public aUw bjy()
  {
    return this.hZr;
  }

  public void b(aUw paramaUw)
  {
    this.hZr = paramaUw;
  }

  public long czk()
  {
    return this.aPT;
  }

  void ih(long paramLong)
  {
    this.aPT = paramLong;
  }

  public int czl()
  {
    return this.iwC;
  }

  public void xw(int paramInt)
  {
    this.iwC = paramInt;
  }

  public void ii(long paramLong)
  {
    this.iwA = paramLong;
  }

  public long czm()
  {
    return this.iwA;
  }

  public long czn()
  {
    return this.iwB;
  }

  public boolean czo()
  {
    return (this.iwC == -1) || (this.iwD <= this.iwC);
  }

  public dUd czp() {
    return this.iwF;
  }

  public void c(dUd paramdUd) {
    this.iwF = paramdUd;
  }

  void ij(long paramLong)
  {
    this.iwD += 1;
    this.iwB = (paramLong + this.iwA);
  }

  public boolean czq() {
    return this.iwE;
  }

  public void czr() {
    this.iwE = true;
  }

  public int compareTo(Object paramObject) {
    cDl localcDl = (cDl)paramObject;

    if (localcDl == null) {
      throw new UnsupportedOperationException("Comparaison d'un listener avec null.");
    }
    if (this.iwB < localcDl.iwB)
      return -1;
    if (this.iwB > localcDl.iwB) {
      return 1;
    }
    return 0;
  }

  public String toString() {
    return this.iwF.getClass().getName() + ", nextTime : " + this.iwB;
  }
}