import java.nio.ByteBuffer;

public class bUT extends bSb
{
  private final ByteBuffer bej;

  public bUT(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.bej = paramByteBuffer;
  }

  public long position()
  {
    return this.bej.position();
  }

  protected void y(int paramInt, byte paramByte) {
    this.hcj = paramByte;
    this.bej.position(paramInt);
  }

  public byte get() {
    ahr();
    return (byte)(this.bej.get() - this.hcj);
  }

  public boolean readBoolean() {
    ahr();
    return this.bej.get() - this.hcj != 0;
  }

  public short getShort() {
    ahr();
    return (short)(this.bej.getShort() - this.hcj);
  }

  public float getFloat() {
    ahr();
    return this.bej.getFloat();
  }

  public int getInt() {
    ahr();
    return this.bej.getInt() - this.hcj;
  }

  public double getDouble() {
    ahr();
    return this.bej.getDouble();
  }

  public long getLong() {
    ahr();
    return this.bej.getLong() - this.hcj;
  }

  public String caP() {
    int i = getInt();
    byte[] arrayOfByte = new byte[i];
    this.bej.get(arrayOfByte);
    return dzp.aJ(arrayOfByte);
  }

  public byte[] caQ() {
    int i = getInt();
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++)
      arrayOfByte[j] = get();
    return arrayOfByte;
  }

  public int[] caR() {
    int i = getInt();
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++)
      arrayOfInt[j] = getInt();
    return arrayOfInt;
  }

  public short[] caS() {
    int i = getInt();
    short[] arrayOfShort = new short[i];
    for (int j = 0; j < i; j++)
      arrayOfShort[j] = getShort();
    return arrayOfShort;
  }

  public float[] caT() {
    int i = getInt();
    float[] arrayOfFloat = new float[i];
    for (int j = 0; j < i; j++)
      arrayOfFloat[j] = getFloat();
    return arrayOfFloat;
  }

  public String[] caU() {
    int i = getInt();
    String[] arrayOfString = new String[i];
    for (int j = 0; j < i; j++)
      arrayOfString[j] = caP();
    return arrayOfString;
  }

  public long[] caV() {
    int i = getInt();
    long[] arrayOfLong = new long[i];
    for (int j = 0; j < i; j++)
      arrayOfLong[j] = getLong();
    return arrayOfLong;
  }
}