import org.apache.log4j.Logger;

public class Nz
{
  private static final Logger K = Logger.getLogger(Nz.class);
  public static final byte cdt = -16;
  public static final byte cdu = 15;
  public static final int cdv = 4;
  public static final int cdw = 0;
  public static final byte cdx = 0;
  public static final byte cdy = 1;
  public static final byte cdz = 2;
  public static final byte cdA = 3;
  public static final byte cdB = 4;
  public static final byte cdC = 5;

  public static dNg ah(byte paramByte)
  {
    int i = (byte)((paramByte & 0xF) >> 0);

    switch (i) {
    case 0:
      return new bbU();
    case 1:
      return new bbT();
    case 2:
      return new drW();
    case 3:
      return new bbQ();
    case 4:
      return new dsk();
    case 5:
      return new dvk();
    }

    K.error("Type de map inconnu " + i);

    return null;
  }
}