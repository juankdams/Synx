import java.nio.ByteBuffer;

final class bAe
{
  private String crN = null;
  private long crO = 0L;
  private int aDe = 0;
  private short goO = 0;
  private final Hp goP = new Hp();

  private bAe(bCj parambCj) {  } 
  public void z() { this.goQ.crN = this.crN;
    this.goQ.crO = this.crO;
    this.goQ.aDe = this.aDe;
    this.goQ.goO = this.goO;
    this.goQ.goP.bPB = this.goP.bPB;
    this.goQ.goP.bPC = this.goP.bPC;
    this.goQ.goP.bPD = this.goP.bPD; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.crN = dzp.aJ(arrayOfByte);
    this.crO = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.goO = paramByteBuffer.getShort();
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.crN = dzp.aJ(arrayOfByte);
    this.crO = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.goO = paramByteBuffer.getShort();
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.crN = dzp.aJ(arrayOfByte);
    this.crO = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.goO = paramByteBuffer.getShort();
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.crN = dzp.aJ(arrayOfByte);
    this.crO = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.goO = paramByteBuffer.getShort();
    return true;
  }

  public void A() {
  }

  public void uF() {
  }

  public void la() {
  }

  public void lb() {
  }

  public void aqy() {
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
        uF();
        la();
        lb();
        aqy();
        return true;
      }
      return false;
    }
    if (paramInt < 313) {
      bool = f(paramByteBuffer);
      if (bool) {
        uF();
        la();
        lb();
        aqy();
        return true;
      }
      return false;
    }
    if (paramInt < 314) {
      bool = m(paramByteBuffer);
      if (bool) {
        la();
        lb();
        aqy();
        return true;
      }
      return false;
    }
    if (paramInt < 315) {
      bool = k(paramByteBuffer);
      if (bool) {
        lb();
        aqy();
        return true;
      }
      return false;
    }
    if (paramInt < 10024001) {
      bool = n(paramByteBuffer);
      if (bool) {
        aqy();
        return true;
      }
      return false;
    }

    return false;
  }
}