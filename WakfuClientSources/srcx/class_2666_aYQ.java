import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

public class aYQ
{
  public static final ByteOrder feM = ByteOrder.LITTLE_ENDIAN;

  private static final Logger K = Logger.getLogger(aYQ.class);
  private final ByteBuffer aTS;
  private int feN = -1;

  private byte feO = -1;

  private byte feP = 0;

  private static final ByteBuffer feQ = ByteBuffer.allocate(0);

  private byte[] feR = new byte[''];

  protected aYQ(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null)
      throw new IllegalArgumentException("ByteBuffer can't be null");
    this.aTS = paramByteBuffer;
    this.aTS.order(feM);
  }

  public static aYQ g(InputStream paramInputStream) {
    aYQ localaYQ = new aYQ(h(paramInputStream));
    paramInputStream.close();
    return localaYQ;
  }

  public static aYQ ar(ByteBuffer paramByteBuffer)
  {
    return new aYQ(paramByteBuffer);
  }

  public static aYQ a(ByteBuffer paramByteBuffer, ByteOrder paramByteOrder)
  {
    paramByteBuffer.order(paramByteOrder);
    return new aYQ(paramByteBuffer);
  }

  public static aYQ V(byte[] paramArrayOfByte)
  {
    return new aYQ(ByteBuffer.wrap(paramArrayOfByte));
  }

  public static aYQ H(File paramFile) {
    return V(dtb.ab(paramFile));
  }

  public static aYQ a(byte[] paramArrayOfByte, ByteOrder paramByteOrder)
  {
    return new aYQ(ByteBuffer.wrap(paramArrayOfByte).order(paramByteOrder));
  }

  protected static ByteBuffer h(InputStream paramInputStream)
  {
    Object localObject = null;

    while (paramInputStream.available() != 0) {
      int i = paramInputStream.available();
      byte[] arrayOfByte1 = new byte[i];
      int j = 0;
      while (j != i) {
        int k = paramInputStream.read(arrayOfByte1, j, i - j);
        if (k == -1)
          throw new EOFException("Less data than assumed in the stream. " + i + " expected, " + j + " read");
        j += k;
      }

      if (localObject == null) {
        localObject = arrayOfByte1;
      }
      else {
        byte[] arrayOfByte2 = new byte[localObject.length + arrayOfByte1.length];
        System.arraycopy(localObject, 0, arrayOfByte2, 0, localObject.length);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, localObject.length, arrayOfByte1.length);
        localObject = arrayOfByte2;
      }
    }

    if (localObject != null)
      return ByteBuffer.wrap(localObject);
    return ByteBuffer.allocate(0);
  }

  public final void a(ByteOrder paramByteOrder)
  {
    this.aTS.order(paramByteOrder);
  }

  public final ByteOrder order()
  {
    return this.aTS.order();
  }

  public final int os(int paramInt)
  {
    if (paramInt <= 0)
      return 0;
    int i = this.aTS.remaining();
    int j = Math.min(i, paramInt);
    this.aTS.position(this.aTS.position() + j);
    return j;
  }

  public final int available()
  {
    return this.aTS.remaining();
  }

  public void close()
  {
  }

  public final int i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = Math.min(available(), Math.min(paramArrayOfByte.length - paramInt1, paramInt2));
    this.aTS.get(paramArrayOfByte, paramInt1, i);
    return i;
  }

  public final int W(byte[] paramArrayOfByte)
  {
    int i = Math.min(available(), paramArrayOfByte.length);
    this.aTS.get(paramArrayOfByte, 0, i);
    return i;
  }

  public final byte[] ot(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.aTS.get(arrayOfByte);
    return arrayOfByte;
  }

  public final short[] ou(int paramInt)
  {
    short[] arrayOfShort = new short[paramInt];
    for (int i = 0; i < paramInt; i++)
      arrayOfShort[i] = this.aTS.getShort();
    return arrayOfShort;
  }

  public final int[] ov(int paramInt) {
    int[] arrayOfInt = new int[paramInt];
    for (int i = 0; i < paramInt; i++)
      arrayOfInt[i] = this.aTS.getInt();
    return arrayOfInt;
  }

  public final float[] ow(int paramInt) {
    float[] arrayOfFloat = new float[paramInt];
    for (int i = 0; i < paramInt; i++)
      arrayOfFloat[i] = this.aTS.getFloat();
    return arrayOfFloat;
  }

  public final float readFloat()
  {
    return this.aTS.getFloat();
  }

  public final short readShort()
  {
    return this.aTS.getShort();
  }

  public final int readUnsignedShort()
  {
    return this.aTS.getShort() & 0xFFFF;
  }

  public final int readInt()
  {
    return this.aTS.getInt();
  }

  public final long readUnsignedInt()
  {
    return this.aTS.getInt() & 0xFFFFFFFF;
  }

  public final long readLong()
  {
    return this.aTS.getLong();
  }

  public final byte readByte()
  {
    return this.aTS.get();
  }

  public final short bnS()
  {
    return (short)((short)this.aTS.get() & 0xFF);
  }

  public final boolean bnT()
  {
    int i = this.aTS.position();

    if ((i == this.feN) && (this.feO <= 6)) {
      this.feO = ((byte)(this.feO + 1));
      return (this.feP & 1 << 7 - this.feO) != 0;
    }
    this.feO = 0;
    this.feN = (i + 1);
    this.feP = this.aTS.get();
    int j = this.feP & 0x80;
    return j != 0;
  }

  public final String readString()
  {
    int i = this.aTS.limit();

    for (int j = this.aTS.position(); (j < i) && 
      (this.aTS.get(j) != 0); j++);
    if (j >= i) {
      throw new EOFException("Unable to find a valid Null terminated UTF-8 string end.");
    }
    int k = j - this.aTS.position();
    if (k > 0) {
      if (k > this.feR.length)
        this.feR = new byte[k];
      this.aTS.get(this.feR, 0, k);
      this.aTS.get();
      return dzp.m(this.feR, 0, k);
    }
    this.aTS.get();
    return "";
  }

  public final int getOffset()
  {
    return this.aTS.position();
  }

  public final void setOffset(int paramInt)
  {
    this.aTS.position(paramInt);
  }
}