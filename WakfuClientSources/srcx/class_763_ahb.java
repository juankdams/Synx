class ahb extends bLb
{
  public ahb(bDf parambDf, byte[] paramArrayOfByte)
  {
    super(parambDf, paramArrayOfByte);
  }

  public long asH()
  {
    return ((byte[])this.gOL).length;
  }
}