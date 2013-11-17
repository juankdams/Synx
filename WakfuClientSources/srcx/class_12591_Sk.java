class Sk
  implements cuF
{
  private final cUh csa;
  private final long bkH;
  private final long aKE;
  private short aEd;
  private short aEe;
  private int csb;
  private final aoL bPQ;

  Sk(cUh paramcUh, long paramLong1, int paramInt, long paramLong2, short paramShort1, short paramShort2)
  {
    this.csa = paramcUh;
    this.bkH = paramLong1;
    this.csb = paramInt;
    this.aKE = paramLong2;
    this.aEd = paramShort1;
    this.aEe = paramShort2;

    if (!this.csa.aTC())
      this.bPQ = new aoL();
    else
      this.bPQ = new aoL(0);
  }

  public cUh adj()
  {
    return this.csa;
  }

  public long EN() {
    return this.bkH;
  }

  public long rb() {
    return this.aKE;
  }

  public short nx() {
    return this.aEd;
  }

  public short ny() {
    return this.aEe;
  }

  public void W(short paramShort) {
    this.aEd = paramShort;
  }

  public void X(short paramShort) {
    this.aEe = paramShort;
  }

  public boolean adk() {
    return !this.bPQ.isEmpty();
  }

  public avk bS(long paramLong) {
    return (avk)this.bPQ.get(paramLong);
  }

  public boolean k(dGy paramdGy) {
    return this.bPQ.s(paramdGy);
  }

  void b(avk paramavk) {
    this.bPQ.put(paramavk.EN(), paramavk);
  }

  void bT(long paramLong) {
    this.bPQ.remove(paramLong);
  }

  public int adl() {
    return this.csb;
  }

  public void gC(int paramInt) {
    this.csb = paramInt;
  }

  public String toString()
  {
    return "BuildingModel{m_definition=" + this.csa + ", m_uid=" + this.bkH + ", m_creationDate=" + this.aKE + ", m_x=" + this.aEd + ", m_y=" + this.aEe + ", m_equippedItemId=" + this.csb + ", m_elements=" + this.bPQ.size() + '}';
  }
}