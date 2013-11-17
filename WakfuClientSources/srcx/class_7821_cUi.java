import java.nio.ByteBuffer;

public class cUi extends dzz
{
  private final cSR kGD = new cSR();
  private final dFu kGE = new dFu();

  public void bc()
  {
    super.bc();
    this.kGD.clear();
    this.kGE.clear();
  }

  public void aJ()
  {
    super.aJ();
    this.kGD.clear();
    this.kGE.clear();
  }

  public dmn cJx() {
    return this.kGD.yF();
  }

  public aso cJy() {
    return this.kGE.abR();
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer1 = ByteBuffer.wrap(paramArrayOfByte);
    while (localByteBuffer1.hasRemaining()) {
      int i = localByteBuffer1.getInt();
      byte[] arrayOfByte1 = new byte[localByteBuffer1.getInt()];
      localByteBuffer1.get(arrayOfByte1);

      ByteBuffer localByteBuffer2 = ByteBuffer.wrap(arrayOfByte1);

      this.kGE.fg(i, localByteBuffer2.getInt());
      byte[] arrayOfByte2 = new byte[localByteBuffer2.getInt()];
      localByteBuffer2.get(arrayOfByte2);
      this.kGD.put(i, arrayOfByte2);
    }

    return true;
  }

  public int getId()
  {
    return 20034;
  }
}