import com.sun.jna.Native;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class dcj extends axA
{
  private static final Map kUT = Collections.synchronizedMap(bIG.gIh ? new blN() : new HashMap());
  protected long size;

  public static void purge()
  {
    kUT.size();
  }

  public dcj(long paramLong)
  {
    this.size = paramLong;
    if (paramLong <= 0L) {
      throw new IllegalArgumentException("Allocation size must be greater than zero");
    }
    this.dMH = malloc(paramLong);
    if (this.dMH == 0L)
      throw new OutOfMemoryError("Cannot allocate " + paramLong + " bytes");
  }

  protected dcj()
  {
  }

  public axA dp(long paramLong)
  {
    return p(paramLong, size() - paramLong);
  }

  public axA p(long paramLong1, long paramLong2)
  {
    F(paramLong1, paramLong2);
    return new ctm(this, paramLong1, paramLong2);
  }

  public dcj zF(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("Byte boundary must be positive: " + paramInt);
    }
    for (int i = 0; i < 32; i++) {
      if (paramInt == 1 << i) {
        long l1 = paramInt - 1L ^ 0xFFFFFFFF;

        if ((this.dMH & l1) != this.dMH) {
          long l2 = this.dMH + paramInt - 1L & l1;
          long l3 = this.dMH + this.size - l2;
          if (l3 <= 0L) {
            throw new IllegalArgumentException("Insufficient memory to align to the requested boundary");
          }
          return (dcj)p(l2 - this.dMH, l3);
        }
        return this;
      }
    }
    throw new IllegalArgumentException("Byte boundary must be a power of two");
  }

  protected void finalize()
  {
    dispose();
  }

  protected void dispose()
  {
    free(this.dMH);
    this.dMH = 0L;
  }

  public void clear()
  {
    dq(this.size);
  }

  public boolean valid()
  {
    return this.dMH != 0L;
  }

  public long size() {
    return this.size;
  }

  protected void F(long paramLong1, long paramLong2)
  {
    if (paramLong1 < 0L) {
      throw new IndexOutOfBoundsException("Invalid offset: " + paramLong1);
    }
    if (paramLong1 + paramLong2 > this.size) {
      String str = "Bounds exceeds available space : size=" + this.size + ", offset=" + (paramLong1 + paramLong2);

      throw new IndexOutOfBoundsException(str);
    }
  }

  public void read(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 1L);
    super.read(paramLong, paramArrayOfByte, paramInt1, paramInt2);
  }

  public void read(long paramLong, short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 2L);
    super.read(paramLong, paramArrayOfShort, paramInt1, paramInt2);
  }

  public void read(long paramLong, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 2L);
    super.read(paramLong, paramArrayOfChar, paramInt1, paramInt2);
  }

  public void read(long paramLong, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 4L);
    super.read(paramLong, paramArrayOfInt, paramInt1, paramInt2);
  }

  public void read(long paramLong, long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 8L);
    super.read(paramLong, paramArrayOfLong, paramInt1, paramInt2);
  }

  public void read(long paramLong, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 4L);
    super.read(paramLong, paramArrayOfFloat, paramInt1, paramInt2);
  }

  public void read(long paramLong, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 8L);
    super.read(paramLong, paramArrayOfDouble, paramInt1, paramInt2);
  }

  public void write(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 1L);
    super.write(paramLong, paramArrayOfByte, paramInt1, paramInt2);
  }

  public void write(long paramLong, short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 2L);
    super.write(paramLong, paramArrayOfShort, paramInt1, paramInt2);
  }

  public void write(long paramLong, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 2L);
    super.write(paramLong, paramArrayOfChar, paramInt1, paramInt2);
  }

  public void write(long paramLong, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 4L);
    super.write(paramLong, paramArrayOfInt, paramInt1, paramInt2);
  }

  public void write(long paramLong, long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 8L);
    super.write(paramLong, paramArrayOfLong, paramInt1, paramInt2);
  }

  public void write(long paramLong, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 4L);
    super.write(paramLong, paramArrayOfFloat, paramInt1, paramInt2);
  }

  public void write(long paramLong, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    F(paramLong, paramInt2 * 8L);
    super.write(paramLong, paramArrayOfDouble, paramInt1, paramInt2);
  }

  public byte getByte(long paramLong)
  {
    F(paramLong, 1L);
    return super.getByte(paramLong);
  }

  public char getChar(long paramLong)
  {
    F(paramLong, 1L);
    return super.getChar(paramLong);
  }

  public short getShort(long paramLong)
  {
    F(paramLong, 2L);
    return super.getShort(paramLong);
  }

  public int getInt(long paramLong)
  {
    F(paramLong, 4L);
    return super.getInt(paramLong);
  }

  public long getLong(long paramLong)
  {
    F(paramLong, 8L);
    return super.getLong(paramLong);
  }

  public float getFloat(long paramLong)
  {
    F(paramLong, 4L);
    return super.getFloat(paramLong);
  }

  public double getDouble(long paramLong)
  {
    F(paramLong, 8L);
    return super.getDouble(paramLong);
  }

  public axA bX(long paramLong)
  {
    F(paramLong, axA.SIZE);
    return super.bX(paramLong);
  }

  public ByteBuffer q(long paramLong1, long paramLong2)
  {
    F(paramLong1, paramLong2);
    ByteBuffer localByteBuffer = super.q(paramLong1, paramLong2);

    kUT.put(localByteBuffer, this);
    return localByteBuffer;
  }

  public String getString(long paramLong, boolean paramBoolean)
  {
    F(paramLong, 0L);
    return super.getString(paramLong, paramBoolean);
  }

  public void setByte(long paramLong, byte paramByte)
  {
    F(paramLong, 1L);
    super.setByte(paramLong, paramByte);
  }

  public void setChar(long paramLong, char paramChar)
  {
    F(paramLong, Native.cuL);
    super.setChar(paramLong, paramChar);
  }

  public void setShort(long paramLong, short paramShort)
  {
    F(paramLong, 2L);
    super.setShort(paramLong, paramShort);
  }

  public void setInt(long paramLong, int paramInt)
  {
    F(paramLong, 4L);
    super.setInt(paramLong, paramInt);
  }

  public void setLong(long paramLong1, long paramLong2)
  {
    F(paramLong1, 8L);
    super.setLong(paramLong1, paramLong2);
  }

  public void setFloat(long paramLong, float paramFloat)
  {
    F(paramLong, 4L);
    super.setFloat(paramLong, paramFloat);
  }

  public void setDouble(long paramLong, double paramDouble)
  {
    F(paramLong, 8L);
    super.setDouble(paramLong, paramDouble);
  }

  public void a(long paramLong, axA paramaxA)
  {
    F(paramLong, axA.SIZE);
    super.a(paramLong, paramaxA);
  }

  public void setString(long paramLong, String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      F(paramLong, (paramString.length() + 1L) * Native.cuL);
    else
      F(paramLong, paramString.getBytes().length + 1L);
    super.setString(paramLong, paramString, paramBoolean);
  }

  public String toString() {
    return "allocated@0x" + Long.toHexString(this.dMH) + " (" + this.size + " bytes)";
  }

  protected static void free(long paramLong)
  {
    Native.free(paramLong);
  }

  protected static long malloc(long paramLong) {
    return Native.malloc(paramLong);
  }
}