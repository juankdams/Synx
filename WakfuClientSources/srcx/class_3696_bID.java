import java.nio.ByteBuffer;

public class bID extends dzz
{
  private int cRF;
  private byte[] gHP;
  private byte[] gHQ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cRF = localByteBuffer.getInt();

    int i = localByteBuffer.getInt();
    this.gHP = new byte[i];
    localByteBuffer.get(this.gHP);

    int j = localByteBuffer.getInt();
    this.gHQ = new byte[j];
    localByteBuffer.get(this.gHQ);

    return true;
  }

  public int getId() {
    return 12600;
  }

  public byte[] bPO() {
    return this.gHP;
  }

  public byte[] bPP() {
    return this.gHQ;
  }

  public int bPQ() {
    return this.cRF;
  }
}