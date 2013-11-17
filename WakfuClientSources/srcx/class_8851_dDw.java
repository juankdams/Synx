public class dDw
{
  public static final int lLG = 5;
  private static final Xg lLH = new Xg();

  public static byte f(cxg paramcxg)
  {
    int i = bCO.cL(1, 101);
    int j = 0;
    byte[] arrayOfByte = (byte[])lLH.get(paramcxg.getId());
    byte b1 = 0; for (byte b2 = (byte)arrayOfByte.length; b1 < b2; b1 = (byte)(b1 + 1)) {
      j += arrayOfByte[b1];
      if (i <= j) {
        return b1;
      }
    }

    return 0;
  }

  static
  {
    lLH.put(cxg.ijR.getId(), new byte[] { 100, 0, 0, 0, 0 });
    lLH.put(cxg.ijS.getId(), new byte[] { 50, 50, 0, 0, 0 });
    lLH.put(cxg.ijT.getId(), new byte[] { 30, 40, 30, 0, 0 });
    lLH.put(cxg.ijU.getId(), new byte[] { 20, 30, 30, 20, 0 });
    lLH.put(cxg.ijV.getId(), new byte[] { 10, 30, 20, 20, 20 });
  }
}