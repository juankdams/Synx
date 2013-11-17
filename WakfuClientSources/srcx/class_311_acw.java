import java.util.zip.ZipException;

public class acw
  implements crQ
{
  static final bTM bRt = new bTM(1);
  private static final String cSk = "Zip64 extended information must contain both size values in the local file header.";
  private static final byte[] EMPTY = new byte[0];
  private bPi cSl;
  private bPi cSm;
  private bPi cSn;
  private bpr cSo;
  private byte[] cSp;

  public acw()
  {
  }

  public acw(bPi parambPi1, bPi parambPi2)
  {
    this(parambPi1, parambPi2, null, null);
  }

  public acw(bPi parambPi1, bPi parambPi2, bPi parambPi3, bpr parambpr)
  {
    this.cSl = parambPi1;
    this.cSm = parambPi2;
    this.cSn = parambPi3;
    this.cSo = parambpr;
  }

  public bTM HA()
  {
    return bRt;
  }

  public bTM Oz()
  {
    return new bTM(this.cSl != null ? 16 : 0);
  }

  public bTM Ox()
  {
    return new bTM((this.cSl != null ? 8 : 0) + (this.cSm != null ? 8 : 0) + (this.cSn != null ? 8 : 0) + (this.cSo != null ? 4 : 0));
  }

  public byte[] Oy()
  {
    if ((this.cSl != null) || (this.cSm != null)) {
      if ((this.cSl == null) || (this.cSm == null)) {
        throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
      }
      byte[] arrayOfByte = new byte[16];
      w(arrayOfByte);
      return arrayOfByte;
    }
    return EMPTY;
  }

  public byte[] Ow()
  {
    byte[] arrayOfByte = new byte[Ox().getValue()];
    int i = w(arrayOfByte);
    if (this.cSn != null) {
      System.arraycopy(this.cSn.getBytes(), 0, arrayOfByte, i, 8);
      i += 8;
    }
    if (this.cSo != null) {
      System.arraycopy(this.cSo.getBytes(), 0, arrayOfByte, i, 4);
      i += 4;
    }
    return arrayOfByte;
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      return;
    }
    if (paramInt2 < 16) {
      throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
    }
    this.cSl = new bPi(paramArrayOfByte, paramInt1);
    paramInt1 += 8;
    this.cSm = new bPi(paramArrayOfByte, paramInt1);
    paramInt1 += 8;
    int i = paramInt2 - 16;
    if (i >= 8) {
      this.cSn = new bPi(paramArrayOfByte, paramInt1);
      paramInt1 += 8;
      i -= 8;
    }
    if (i >= 4) {
      this.cSo = new bpr(paramArrayOfByte, paramInt1);
      paramInt1 += 4;
      i -= 4;
    }
  }

  public void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.cSp = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, this.cSp, 0, paramInt2);

    if (paramInt2 >= 28) {
      b(paramArrayOfByte, paramInt1, paramInt2);
    } else if (paramInt2 == 24) {
      this.cSl = new bPi(paramArrayOfByte, paramInt1);
      paramInt1 += 8;
      this.cSm = new bPi(paramArrayOfByte, paramInt1);
      paramInt1 += 8;
      this.cSn = new bPi(paramArrayOfByte, paramInt1);
    } else if (paramInt2 % 8 == 4) {
      this.cSo = new bpr(paramArrayOfByte, paramInt1 + paramInt2 - 4);
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if (this.cSp != null) {
      int i = (paramBoolean1 ? 8 : 0) + (paramBoolean2 ? 8 : 0) + (paramBoolean3 ? 8 : 0) + (paramBoolean4 ? 4 : 0);

      if (this.cSp.length < i) {
        throw new ZipException("central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length " + i + " but is " + this.cSp.length);
      }

      int j = 0;
      if (paramBoolean1) {
        this.cSl = new bPi(this.cSp, j);
        j += 8;
      }
      if (paramBoolean2) {
        this.cSm = new bPi(this.cSp, j);

        j += 8;
      }
      if (paramBoolean3) {
        this.cSn = new bPi(this.cSp, j);

        j += 8;
      }
      if (paramBoolean4) {
        this.cSo = new bpr(this.cSp, j);
        j += 4;
      }
    }
  }

  public bPi aoO()
  {
    return this.cSl;
  }

  public void a(bPi parambPi)
  {
    this.cSl = parambPi;
  }

  public bPi aoP()
  {
    return this.cSm;
  }

  public void b(bPi parambPi)
  {
    this.cSm = parambPi;
  }

  public bPi aoQ()
  {
    return this.cSn;
  }

  public void c(bPi parambPi)
  {
    this.cSn = parambPi;
  }

  public bpr aoR()
  {
    return this.cSo;
  }

  public void a(bpr parambpr)
  {
    this.cSo = parambpr;
  }

  private int w(byte[] paramArrayOfByte) {
    int i = 0;
    if (this.cSl != null) {
      System.arraycopy(this.cSl.getBytes(), 0, paramArrayOfByte, 0, 8);
      i += 8;
    }
    if (this.cSm != null) {
      System.arraycopy(this.cSm.getBytes(), 0, paramArrayOfByte, i, 8);
      i += 8;
    }
    return i;
  }
}