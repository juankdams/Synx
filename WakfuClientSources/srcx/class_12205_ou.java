class ou
  implements bnt
{
  private final short aEd;
  private final short aEe;
  private short aTB;
  private short aTC;
  private short aTD;
  private short aTE;

  ou(short paramShort1, short paramShort2)
  {
    this.aEd = paramShort1;
    this.aEe = paramShort2;
  }

  ou(short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, short paramShort6)
  {
    this(paramShort1, paramShort2);
    this.aTB = paramShort3;
    this.aTC = paramShort4;
    this.aTD = paramShort5;
    this.aTE = paramShort6;
  }

  public short nx() {
    return this.aEd;
  }

  public short ny() {
    return this.aEe;
  }

  public short vQ() {
    return this.aTB;
  }

  public short vR() {
    return this.aTC;
  }

  public short vS() {
    return this.aTD;
  }

  public short vT() {
    return this.aTE;
  }

  public boolean a(short paramShort1, short paramShort2, short paramShort3, short paramShort4)
  {
    boolean bool = (this.aTB != paramShort1) || (this.aTC != paramShort2) || (this.aTD != paramShort3) || (this.aTE != paramShort4);

    this.aTB = paramShort1;
    this.aTC = paramShort2;
    this.aTD = paramShort3;
    this.aTE = paramShort4;
    return bool;
  }

  public String toString()
  {
    return "PartitionModel{m_x=" + this.aEd + ", m_y=" + this.aEe + '}';
  }
}