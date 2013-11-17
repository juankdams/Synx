import java.io.UnsupportedEncodingException;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

public abstract class EY
  implements bpz
{
  private long bMk;
  private byte[] bMl;
  private byte[] data;

  protected EY()
  {
  }

  protected EY(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    CRC32 localCRC32 = new CRC32();
    localCRC32.update(paramArrayOfByte, paramInt1, paramInt2);
    this.bMk = localCRC32.getValue();
    try
    {
      this.bMl = paramString.getBytes("UTF-8");
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      throw new RuntimeException("FATAL: UTF-8 encoding not supported.", localUnsupportedEncodingException);
    }
  }

  protected EY(String paramString, byte[] paramArrayOfByte)
  {
    this(paramString, paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  private void Ot() {
    if (this.bMl == null) {
      return;
    }

    this.data = new byte[5 + this.bMl.length];

    this.data[0] = 1;
    System.arraycopy(bpr.fS(this.bMk), 0, this.data, 1, 4);
    System.arraycopy(this.bMl, 0, this.data, 5, this.bMl.length);
  }

  public long Ou()
  {
    return this.bMk;
  }

  public void bu(long paramLong)
  {
    this.bMk = paramLong;
    this.data = null;
  }

  public byte[] Ov()
  {
    byte[] arrayOfByte = null;
    if (this.bMl != null) {
      arrayOfByte = new byte[this.bMl.length];
      System.arraycopy(this.bMl, 0, arrayOfByte, 0, arrayOfByte.length);
    }
    return arrayOfByte;
  }

  public void o(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      this.bMl = new byte[paramArrayOfByte.length];
      System.arraycopy(paramArrayOfByte, 0, this.bMl, 0, paramArrayOfByte.length);
    }
    else {
      this.bMl = null;
    }
    this.data = null;
  }

  public byte[] Ow()
  {
    if (this.data == null) {
      Ot();
    }
    byte[] arrayOfByte = null;
    if (this.data != null) {
      arrayOfByte = new byte[this.data.length];
      System.arraycopy(this.data, 0, arrayOfByte, 0, arrayOfByte.length);
    }
    return arrayOfByte;
  }

  public bTM Ox()
  {
    if (this.data == null) {
      Ot();
    }
    return new bTM(this.data.length);
  }

  public byte[] Oy()
  {
    return Ow();
  }

  public bTM Oz()
  {
    return Ox();
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 5) {
      throw new ZipException("UniCode path extra data must have at least 5 bytes.");
    }

    int i = paramArrayOfByte[paramInt1];

    if (i != 1) {
      throw new ZipException("Unsupported version [" + i + "] for UniCode path extra data.");
    }

    this.bMk = bpr.h(paramArrayOfByte, paramInt1 + 1);
    this.bMl = new byte[paramInt2 - 5];
    System.arraycopy(paramArrayOfByte, paramInt1 + 5, this.bMl, 0, paramInt2 - 5);
    this.data = null;
  }
}