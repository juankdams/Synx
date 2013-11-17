import java.util.zip.CRC32;
import java.util.zip.ZipException;

public class Iz
  implements bpz, buX, Cloneable
{
  private static final bTM bRt = new bTM(30062);
  private static final int WORD = 4;
  private int mode = 0;

  private int bRu = 0;

  private int bRv = 0;

  private String bRw = "";

  private boolean bRx = false;

  private CRC32 crc = new CRC32();

  public bTM HA()
  {
    return bRt;
  }

  public bTM Oz()
  {
    return new bTM(14 + RW().getBytes().length);
  }

  public bTM Ox()
  {
    return Oz();
  }

  public byte[] Oy()
  {
    byte[] arrayOfByte1 = new byte[Oz().getValue() - 4];
    System.arraycopy(bTM.getBytes(getMode()), 0, arrayOfByte1, 0, 2);

    byte[] arrayOfByte2 = RW().getBytes();

    System.arraycopy(bpr.fS(arrayOfByte2.length), 0, arrayOfByte1, 2, 4);

    System.arraycopy(bTM.getBytes(RU()), 0, arrayOfByte1, 6, 2);

    System.arraycopy(bTM.getBytes(RV()), 0, arrayOfByte1, 8, 2);

    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 10, arrayOfByte2.length);

    this.crc.reset();
    this.crc.update(arrayOfByte1);
    long l = this.crc.getValue();

    byte[] arrayOfByte3 = new byte[arrayOfByte1.length + 4];
    System.arraycopy(bpr.fS(l), 0, arrayOfByte3, 0, 4);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 4, arrayOfByte1.length);
    return arrayOfByte3;
  }

  public byte[] Ow()
  {
    return Oy();
  }

  public void fj(int paramInt)
  {
    this.bRu = paramInt;
  }

  public int RU()
  {
    return this.bRu;
  }

  public void fk(int paramInt)
  {
    this.bRv = paramInt;
  }

  public int RV()
  {
    return this.bRv;
  }

  public void ce(String paramString)
  {
    this.bRw = paramString;
    this.mode = fl(this.mode);
  }

  public String RW()
  {
    return this.bRw;
  }

  public boolean isLink()
  {
    return RW().length() != 0;
  }

  public void setMode(int paramInt)
  {
    this.mode = fl(paramInt);
  }

  public int getMode()
  {
    return this.mode;
  }

  public void aI(boolean paramBoolean)
  {
    this.bRx = paramBoolean;
    this.mode = fl(this.mode);
  }

  public boolean isDirectory()
  {
    return (this.bRx) && (!isLink());
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l1 = bpr.h(paramArrayOfByte, paramInt1);
    byte[] arrayOfByte1 = new byte[paramInt2 - 4];
    System.arraycopy(paramArrayOfByte, paramInt1 + 4, arrayOfByte1, 0, paramInt2 - 4);
    this.crc.reset();
    this.crc.update(arrayOfByte1);
    long l2 = this.crc.getValue();
    if (l1 != l2) {
      throw new ZipException("bad CRC checksum " + Long.toHexString(l1) + " instead of " + Long.toHexString(l2));
    }

    int i = bTM.k(arrayOfByte1, 0);

    byte[] arrayOfByte2 = new byte[(int)bpr.h(arrayOfByte1, 2)];
    this.bRu = bTM.k(arrayOfByte1, 6);
    this.bRv = bTM.k(arrayOfByte1, 8);

    if (arrayOfByte2.length == 0) {
      this.bRw = "";
    } else {
      System.arraycopy(arrayOfByte1, 10, arrayOfByte2, 0, arrayOfByte2.length);
      this.bRw = new String(arrayOfByte2);
    }

    aI((i & 0x4000) != 0);
    setMode(i);
  }

  protected int fl(int paramInt)
  {
    int i = 32768;
    if (isLink())
      i = 40960;
    else if (isDirectory()) {
      i = 16384;
    }
    return i | paramInt & 0xFFF;
  }

  public Object clone()
  {
    try {
      Iz localIz = (Iz)super.clone();
      localIz.crc = new CRC32();
      return localIz;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }
}