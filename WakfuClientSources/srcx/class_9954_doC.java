import org.apache.log4j.Logger;

public abstract class doC
{
  private static final Logger K = Logger.getLogger(doC.class);

  public static final doC lpc = new drX();

  protected abstract void a(azp paramazp, short paramShort1, short paramShort2);

  public abstract int a(eu parameu, short paramShort1, short paramShort2);

  public void a(azp paramazp, short paramShort)
  {
    a(paramazp, (short)0, paramShort);
  }

  public void b(azp paramazp, short paramShort1, short paramShort2)
  {
    a(paramazp, paramShort1, paramShort2);
  }
}