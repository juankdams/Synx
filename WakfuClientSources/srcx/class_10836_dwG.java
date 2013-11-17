import java.nio.ByteBuffer;

final class dwG
{
  private int aGg = 0;
  private String name = null;
  private int eRD = 0;
  private int eRE = 0;
  private int eRF = 0;
  private int eRG = 0;
  private byte eRH = 0;
  private long eRI = 0L;
  private int lCj = 0;
  private long eRJ = 0L;
  private long eRK = 0L;
  private int eRL = 0;
  private long eRM = 0L;

  private dwG(aTz paramaTz) {  } 
  public void z() { this.lCk.aGg = this.aGg;
    this.lCk.name = this.name;
    this.lCk.eRD = this.eRD;
    this.lCk.eRE = this.eRE;
    this.lCk.eRF = this.eRF;
    this.lCk.eRG = this.eRG;
    this.lCk.eRH = this.eRH;
    this.lCk.eRI = this.eRI;
    this.lCk.eRJ = this.eRJ;
    this.lCk.eRK = this.eRK;
    this.lCk.eRL = this.eRL;
    this.lCk.eRM = this.eRM; }

  private boolean m(ByteBuffer paramByteBuffer)
  {
    this.aGg = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.name = dzp.aJ(arrayOfByte);
    this.eRD = paramByteBuffer.getInt();
    this.eRE = paramByteBuffer.getInt();
    this.eRF = paramByteBuffer.getInt();
    this.eRG = paramByteBuffer.getInt();
    this.eRH = paramByteBuffer.get();
    this.eRI = paramByteBuffer.getLong();
    this.lCj = paramByteBuffer.getInt();
    this.eRJ = paramByteBuffer.getLong();
    this.eRK = paramByteBuffer.getLong();
    return true;
  }

  public void bAG() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 313)
    {
      return false;
    }if (paramInt < 315) {
      boolean bool = m(paramByteBuffer);
      if (bool) {
        bAG();
        return true;
      }
      return false;
    }

    return false;
  }
}