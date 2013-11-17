import java.nio.ByteBuffer;

public class bYV extends dzz
{
  private byte dON;
  private dGD aVD;
  private short dhr;

  public byte[] encode()
  {
    throw new UnsupportedOperationException("On tente d'encoder un message serveur->client coté client...");
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dON = localByteBuffer.get();
    this.dhr = localByteBuffer.getShort();
    if (localByteBuffer.hasRemaining()) {
      this.aVD = new dGD();
      this.aVD.h(localByteBuffer);
    }
    return true;
  }

  public int getId()
  {
    return 5214;
  }

  public dGD cdA() {
    return this.aVD;
  }

  public short cdB() {
    return this.dhr;
  }

  public byte cdC() {
    return this.dON;
  }
}