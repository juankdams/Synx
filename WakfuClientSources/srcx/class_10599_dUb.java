import java.nio.ByteBuffer;

final class dUb
{
  private short dsE = 0;
  private String name = null;
  private int dsF = 0;
  private long dsG = 0L;
  private long dsH = 0L;
  private short dsI = 0;
  private short dsJ = 0;
  private byte btt = 0;
  private bBa dsK = null;
  private OY dsL = null;
  private int direction = 0;
  private long dsM = 0L;

  private dUb(aof paramaof) {  } 
  public void z() { this.mro.dsE = this.dsE;
    this.mro.name = this.name;
    this.mro.dsF = this.dsF;
    this.mro.dsG = this.dsG;
    this.mro.dsH = this.dsH;
    this.mro.dsI = this.dsI;
    this.mro.dsJ = this.dsJ;
    this.mro.btt = this.btt;
    this.mro.dsK = this.dsK;
    this.mro.dsL = this.dsL;
    this.mro.direction = this.direction;
    this.mro.dsM = this.dsM; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.dsE = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.name = dzp.aJ(arrayOfByte);
    this.dsF = paramByteBuffer.getInt();
    this.dsG = paramByteBuffer.getLong();
    this.dsH = paramByteBuffer.getLong();
    this.dsI = paramByteBuffer.getShort();
    this.btt = paramByteBuffer.get();
    int j = paramByteBuffer.get() == 1 ? 1 : 0;
    if (j != 0) {
      this.dsK = new bBa();
      bool1 = this.dsK.b(paramByteBuffer, 1);
      if (!bool1)
        return false;
    } else {
      this.dsK = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.dsL = new OY();
      boolean bool2 = this.dsL.b(paramByteBuffer, 1);
      if (!bool2)
        return false;
    } else {
      this.dsL = null;
    }
    this.direction = paramByteBuffer.getInt();
    this.dsM = paramByteBuffer.getLong();
    return true;
  }

  public void A() {
  }

  public void J() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }
    boolean bool;
    if (paramInt < 1) {
      bool = e(paramByteBuffer);
      if (bool) {
        A();
        J();
        return true;
      }
      return false;
    }
    if (paramInt < 10013) {
      bool = f(paramByteBuffer);
      if (bool) {
        J();
        return true;
      }
      return false;
    }

    return false;
  }
}