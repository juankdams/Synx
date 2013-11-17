public class aFT extends dNT
{
  public static final int SIZE = 4;

  public aFT()
  {
    this(0L);
  }

  public aFT(long paramLong)
  {
    super(4, paramLong, true);
  }

  public dRo aSh()
  {
    return new dRo(longValue() & 0xFF);
  }

  public dRo aSi()
  {
    return new dRo(longValue() >> 16 & 0xFF);
  }
}