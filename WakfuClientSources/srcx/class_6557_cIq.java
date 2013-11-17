public abstract class cIq
{
  private final aoL iDY = new aoL();

  protected final void b(long paramLong, short paramShort, byte[] paramArrayOfByte) {
    this.iDY.put(paramLong, new dmf(paramShort, paramArrayOfByte));
  }

  protected final dmf iL(long paramLong) {
    return (dmf)this.iDY.get(paramLong);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[Definitions for ");

    for (long l : this.iDY.aBb()) {
      localStringBuilder.append(l).append(" ");
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}