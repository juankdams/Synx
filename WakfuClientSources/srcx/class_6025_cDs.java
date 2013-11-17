public class cDs extends bvy
{
  private final short idf;
  private final int aJA;

  public cDs(short paramShort1, short paramShort2, int paramInt1, int paramInt2, short paramShort3)
  {
    super(paramShort1, paramInt2, paramShort3);
    this.idf = paramShort2;
    this.aJA = paramInt1;
  }

  public short bqQ() {
    return this.idf;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof cDs)) {
      return false;
    }

    cDs localcDs = (cDs)paramObject;
    return this.idf == localcDs.idf;
  }

  public int hashCode()
  {
    return this.idf;
  }

  public String toString()
  {
    return super.toString() + "m_patchId=" + this.idf;
  }

  public int ahA()
  {
    return this.aJA;
  }
}