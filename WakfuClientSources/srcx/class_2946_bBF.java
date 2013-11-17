final class bBF
  implements Comparable
{
  public final char guw;
  public final byte gux;

  bBF(byte paramByte, char paramChar)
  {
    this.gux = paramByte;
    this.guw = paramChar;
  }

  public int a(bBF parambBF) {
    return this.guw - parambBF.guw;
  }

  public String toString()
  {
    return "0x" + Integer.toHexString(0xFFFF & this.guw) + "->0x" + Integer.toHexString(0xFF & this.gux);
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof bBF)) {
      bBF localbBF = (bBF)paramObject;
      return (this.guw == localbBF.guw) && (this.gux == localbBF.gux);
    }
    return false;
  }

  public int hashCode()
  {
    return this.guw;
  }
}