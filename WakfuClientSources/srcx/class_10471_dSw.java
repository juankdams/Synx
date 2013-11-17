import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class dSw
{
  private OutputStream gKM;
  private ByteArrayOutputStream mow;
  private int mox;
  private int moy;
  private boolean moz = false;
  private long lfC;
  private boolean moA;

  public dSw(OutputStream paramOutputStream)
  {
    this.gKM = paramOutputStream;
  }

  public dSw()
  {
    this.mow = new ByteArrayOutputStream();
    this.gKM = this.mow;
    this.moA = true;
  }

  public dSw(int paramInt)
  {
    this.mow = new ByteArrayOutputStream(paramInt);
    this.gKM = this.mow;
    this.moA = true;
  }

  public byte[] getData()
  {
    if (!this.moA)
      throw new IllegalStateException("Use this method only with memory streams!");
    try
    {
      this.gKM.close();
    }
    catch (IOException localIOException) {
    }
    return this.mow.toByteArray();
  }

  public static int Z(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 1;
    }
    long l = ()(paramDouble * 65536.0D);
    return kW(l);
  }

  public long dsV()
  {
    return this.lfC;
  }

  public static int kW(long paramLong)
  {
    int i;
    if (paramLong == 0L) {
      i = 0;
    }
    else {
      i = (int)(Math.floor(Math.log(Math.abs(paramLong)) / Math.log(2.0D)) + 2.0D);
    }
    return i;
  }

  public static int kX(long paramLong)
  {
    if (paramLong < 1L) {
      return 0;
    }
    return (int)(Math.floor(Math.log(paramLong) / Math.log(2.0D)) + 1.0D);
  }

  public void dsW()
  {
    if (this.moy > 0) {
      this.gKM.write(this.mox);
      this.lfC += 1L;
      this.moy = 0;
      this.mox = 0;
    }
  }

  public void close()
  {
    dsW();
    this.gKM.close();
  }

  public void dsX()
  {
    if (!this.moz) {
      this.gKM = new BufferedOutputStream(new DeflaterOutputStream(this.gKM, new Deflater(9)));
      this.moz = true;
    }
  }

  public void flush()
  {
    this.gKM.flush();
  }

  public void lu(boolean paramBoolean)
  {
    E(paramBoolean ? 1L : 0L, 1);
  }

  public void writeBytes(byte[] paramArrayOfByte)
  {
    dsW();
    if (paramArrayOfByte == null) {
      return;
    }
    this.gKM.write(paramArrayOfByte);
    this.lfC += paramArrayOfByte.length;
  }

  public void writeDouble(double paramDouble)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.putDouble(paramDouble);
    writeBytes(localByteBuffer.array());
  }

  public void aa(double paramDouble)
  {
    writeShort((short)(int)(paramDouble * 256.0D));
  }

  public void d(double paramDouble, int paramInt)
  {
    long l = ()(paramDouble * 65536.0D);
    D(l, paramInt);
  }

  public void writeFloat(float paramFloat)
  {
    writeInt(Float.floatToIntBits(paramFloat));
  }

  public void dG(float paramFloat)
  {
    int i = Float.floatToIntBits(paramFloat);
    int j = Math.abs((i & 0x80000000) >> 31);
    int k = (i & 0x7F800000) >> 23;
    int m = i & 0x7FFFFF;
    int n = 0;
    if (k != 0) {
      if (k == 255)
        n = 31;
      else {
        n = k - 127 + 15;
      }
    }
    int i1 = 0;
    if (n < 0)
      n = 0;
    else if (n > 31)
      n = 31;
    else {
      i1 = m >> 13;
    }
    int i2 = j << 15;
    i2 |= n << 10;
    i2 |= i1;
    DS(i2);
  }

  public void writeShort(short paramShort)
  {
    dsW();
    this.gKM.write(paramShort & 0xFF);
    this.gKM.write(paramShort >> 8);
    this.lfC += 2L;
  }

  public void writeInt(int paramInt)
  {
    dsW();
    this.gKM.write(paramInt & 0xFF);
    this.gKM.write(paramInt >> 8);
    this.gKM.write(paramInt >> 16);
    this.gKM.write(paramInt >> 24);
    this.lfC += 4L;
  }

  public void writeLong(long paramLong)
  {
    dsW();
    this.gKM.write((byte)(int)(paramLong & 0xFF));
    this.gKM.write((byte)(int)(paramLong >> 8));
    this.gKM.write((byte)(int)(paramLong >> 16));
    this.gKM.write((byte)(int)(paramLong >> 24));
    this.gKM.write((byte)(int)(paramLong >> 32));
    this.gKM.write((byte)(int)(paramLong >> 40));
    this.gKM.write((byte)(int)(paramLong >> 48));
    this.gKM.write((byte)(int)(paramLong >> 56));
    this.lfC += 8L;
  }

  public void writeByte(byte paramByte)
  {
    dsW();
    this.gKM.write(paramByte);
    this.lfC += 1L;
  }

  public void D(long paramLong, int paramInt)
  {
    int i = kW(paramLong);
    if (paramInt < i) {
      throw new IOException("At least " + i + " bits needed for representation of " + paramLong);
    }
    F(paramLong, paramInt);
  }

  public void writeString(String paramString)
  {
    writeBytes(dzp.qC(paramString));
    this.gKM.write(0);
    this.lfC += 1L;
  }

  public void DS(int paramInt)
  {
    dsW();
    this.gKM.write(paramInt & 0xFF);
    this.gKM.write(paramInt >> 8);
    this.lfC += 2L;
  }

  public void kY(long paramLong)
  {
    dsW();
    this.gKM.write((int)(paramLong & 0xFF));
    this.gKM.write((int)(paramLong >> 8));
    this.gKM.write((int)(paramLong >> 16));
    this.gKM.write((int)(paramLong >> 24));
    this.lfC += 4L;
  }

  public void eP(short paramShort)
  {
    dsW();
    this.gKM.write(paramShort);
    this.lfC += 1L;
  }

  public void E(long paramLong, int paramInt)
  {
    int i = kX(paramLong);
    if (paramInt < i) {
      throw new IOException("At least " + i + " bits needed for representation of " + paramLong + ". Used bits: " + paramInt);
    }
    F(paramLong, paramInt);
  }

  private void F(long paramLong, int paramInt) {
    int i = paramInt;
    while (i > 0) {
      this.moy += 1;

      if ((1L << i - 1 & paramLong) != 0L) {
        this.mox |= 1 << 8 - this.moy;
      }
      if (this.moy == 8)
      {
        this.gKM.write(this.mox);
        this.lfC += 1L;
        this.moy = 0;
        this.mox = 0;
      }
      i--;
    }
  }

  public void p(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    dsW();
    if (paramArrayOfByte == null) {
      return;
    }
    this.gKM.write(paramArrayOfByte, paramInt1, paramInt2);
    this.lfC += paramInt2;
  }
}