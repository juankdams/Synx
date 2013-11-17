import org.apache.log4j.Logger;

public class cqa
{
  private static final Logger K = Logger.getLogger(cqa.class);

  public static final cqa hZQ = new cqa();

  private final cSR hZR = new cSR();
  private final il hZS = new il();

  public void b(int paramInt, int[] paramArrayOfInt, short paramShort)
  {
    int[] arrayOfInt = (paramArrayOfInt == null) || (paramArrayOfInt.length == 0) ? null : paramArrayOfInt;
    this.hZR.put(paramInt, arrayOfInt);
    this.hZS.a(paramInt, paramShort);
  }

  public int[] wc(int paramInt) {
    return (int[])this.hZR.get(paramInt);
  }

  public boolean wd(int paramInt) {
    return wc(paramInt) != null;
  }

  public short we(int paramInt) {
    return this.hZS.get(paramInt);
  }
}