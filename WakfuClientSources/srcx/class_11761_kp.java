import java.nio.ByteBuffer;

public class kp extends dzz
{
  private int aNN;
  private cSi aNO;
  private long aNP;
  private bML aNQ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aNN = localByteBuffer.getInt();
    int i = localByteBuffer.get();
    this.aNO = new cSi(i);
    for (int j = 0; j < i; j = (byte)(j + 1)) {
      this.aNO.add(localByteBuffer.getInt());
    }
    if (localByteBuffer.get() == 1) {
      this.aNP = localByteBuffer.getInt();
    }
    j = localByteBuffer.getInt();
    if (j != 0) {
      this.aNQ = new bML(j);
      for (int k = 0; k < j; k++) {
        this.aNQ.q(localByteBuffer.get(), localByteBuffer.getLong());
      }
    }

    return true;
  }

  public int getId() {
    return 11202;
  }

  public int se()
  {
    return this.aNN;
  }

  public cSi sf()
  {
    return this.aNO;
  }

  public long getRemainingTime() {
    return this.aNP;
  }

  public bML sg() {
    return this.aNQ;
  }
}