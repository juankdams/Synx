import org.apache.log4j.Logger;

public class aVN
{
  private static final Logger K = Logger.getLogger(aVN.class);

  private static final aVN eXU = new aVN();
  private static final byte eXV = 1;
  private static final byte eXW = 2;
  private static final byte eXX = 4;

  public static aVN blg()
  {
    return eXU;
  }

  public boolean l(int paramInt, byte paramByte) {
    return a((byte)1, paramInt, paramByte);
  }

  public boolean m(int paramInt, byte paramByte) {
    return a((byte)2, paramInt, paramByte);
  }

  public boolean n(int paramInt, byte paramByte) {
    return a((byte)4, paramInt, paramByte);
  }

  private static boolean a(byte paramByte1, int paramInt, byte paramByte2) {
    bXw localbXw = agt.arQ().d(paramInt, paramByte2);
    if (localbXw == null) {
      return false;
    }
    if (paramByte1 == 2) {
      return localbXw.ccQ();
    }
    if (paramByte1 == 1) {
      return localbXw.ccR();
    }
    if (paramByte1 == 4)
      return localbXw.ccS();
    return false;
  }
}