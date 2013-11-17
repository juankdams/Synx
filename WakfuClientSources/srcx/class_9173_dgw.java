import java.nio.ByteBuffer;

public class dgw extends aRw
{
  public boolean bqF = true;
  private byte dJU;
  private boolean lbs;
  private String Th;
  private String hME;

  public byte[] encode()
  {
    byte[] arrayOfByte1 = dzp.qC(this.Th);
    byte[] arrayOfByte2 = dzp.qC(this.hME);
    int i = 3 + arrayOfByte1.length + 1 + arrayOfByte2.length;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.put(this.dJU);
    localByteBuffer.put((byte)(this.lbs ? 1 : 0));
    localByteBuffer.put((byte)arrayOfByte1.length);
    localByteBuffer.put(arrayOfByte1);
    localByteBuffer.put((byte)arrayOfByte2.length);
    localByteBuffer.put(arrayOfByte2);

    if (this.bqF)
      return a((byte)6, localByteBuffer.array());
    return a((byte)2, localByteBuffer.array());
  }

  public final int getId() {
    return 503;
  }

  public void cF(byte paramByte) {
    this.dJU = paramByte;
  }

  public void jc(boolean paramBoolean) {
    this.lbs = paramBoolean;
  }

  public void E(String paramString) {
    this.Th = paramString;
  }

  public void lo(String paramString) {
    this.hME = paramString;
  }

  public void al(boolean paramBoolean) {
    this.bqF = paramBoolean;
  }
}