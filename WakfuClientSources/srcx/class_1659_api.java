import org.apache.log4j.Logger;

public abstract class api extends dsv
{
  private static final Logger K = Logger.getLogger(dY.class);
  protected static final byte dvd = 1;
  protected static final byte dve = 2;

  public static dAU f(aYQ paramaYQ, float paramFloat)
  {
    int i = paramaYQ.readByte();
    switch (i) {
    case 1:
      return cBW.iuf.p(paramaYQ, paramFloat);
    case 2:
      return bbd.fjg.i(paramaYQ, paramFloat);
    }
    K.error("type de definition inconnu " + i);
    return null;
  }
}