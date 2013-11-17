public final class aJS extends aRw
{
  private final int bgB;
  private final int ejS;

  public aJS(int paramInt1, int paramInt2)
  {
    this.bgB = paramInt1;
    this.ejS = paramInt2;
  }

  public byte[] encode()
  {
    cXr localcXr = new cXr();
    localcXr.putInt(this.bgB);
    localcXr.putInt(this.ejS);
    return a((byte)6, localcXr.toArray());
  }

  public int getId()
  {
    return 597;
  }
}