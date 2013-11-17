import org.apache.log4j.Logger;

public abstract class dJm extends dsv
{
  private static final Logger K = Logger.getLogger(dJm.class);
  protected static final byte lUQ = 1;
  protected static final byte lUR = 2;

  public static brc w(aYQ paramaYQ, float paramFloat)
  {
    int i = paramaYQ.readByte();
    switch (i) {
    case 1:
      return dsB.luO.u(paramaYQ, paramFloat);
    case 2:
      return bLx.gPi.k(paramaYQ, paramFloat);
    }
    K.error("type de condition inconnu " + i);
    return null;
  }
}