public class bWX extends dPJ
{
  private final long ag;
  private final short grQ;

  public bWX(long paramLong, short paramShort)
  {
    this.ag = paramLong;
    this.grQ = paramShort;
  }

  public short nc()
  {
    return 1;
  }

  public cIG pk()
  {
    return null;
  }

  public int hashCode()
  {
    return new Long(this.ag * this.grQ).hashCode();
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof bWX)) {
      bWX localbWX = (bWX)paramObject;
      return (this.ag == localbWX.ag) && (this.grQ == localbWX.grQ);
    }
    return false;
  }
}