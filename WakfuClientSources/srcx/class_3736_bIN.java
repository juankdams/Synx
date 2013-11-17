public final class bIN
{
  public static final bIN gJf = new bIN("RAW");
  public static final bIN gJg = new bIN("TGA");
  public static final bIN gJh = new bIN("TGAM");
  public static final bIN gJi = new bIN("PNG");
  public static final bIN gJj = new bIN("BMP");
  public static final bIN gJk = new bIN("JPG");
  private final int aw;

  public bIN(int paramInt)
  {
    this.aw = paramInt;
  }

  public bIN(String paramString) {
    this.aw = jQ(paramString);
  }

  public static int jQ(String paramString) {
    byte[] arrayOfByte = paramString.getBytes();
    int i = 0;
    if (arrayOfByte.length == 0)
      return i;
    if (arrayOfByte.length >= 1)
      i |= clH.dM(arrayOfByte[0]);
    if (arrayOfByte.length >= 2)
      i |= clH.dM(arrayOfByte[1]) << 8;
    if (arrayOfByte.length >= 3)
      i |= clH.dM(arrayOfByte[2]) << 16;
    if (arrayOfByte.length >= 4)
      i |= clH.dM(arrayOfByte[3]) << 24;
    return i;
  }

  public static String ta(int paramInt) {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[3] = ((byte)(paramInt >> 24));
    arrayOfByte[2] = ((byte)(paramInt >> 16 & 0xFF));
    arrayOfByte[1] = ((byte)(paramInt >> 8 & 0xFF));
    arrayOfByte[0] = ((byte)(paramInt & 0xFF));
    return new String(arrayOfByte);
  }

  public String toString()
  {
    return ta(this.aw);
  }

  public int getID() {
    return this.aw;
  }
}