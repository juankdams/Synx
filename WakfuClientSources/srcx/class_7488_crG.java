import java.nio.ByteBuffer;

public class crG
{
  private boolean bIx;
  private byte[] iaZ;
  private djg iba;

  public crG(djg paramdjg)
  {
    this.iba = paramdjg;
    this.bIx = false;
  }

  public boolean initialize() {
    long l = this.iba.cRP();
    if (l > 2147483647L) {
      throw new UnsupportedOperationException("Impossible de charger un son de plus de 2147483647 octets"); } this.iaZ = new byte[(int)l];
    ByteBuffer localByteBuffer = ByteBuffer.wrap(this.iaZ);

    int j = 0;
    int i;
    do { i = this.iba.j(localByteBuffer, j);
      j += i; }
    while (i > 0);

    this.iba.close();
    this.bIx = true;

    return true;
  }

  public void close() {
    this.iba.close();

    this.iaZ = null;
    this.iba = null;
    this.bIx = false;
  }

  public djg cqe() {
    return this.iba;
  }

  public byte[] cqf() {
    return this.iaZ;
  }

  public int cqg() {
    return this.iaZ.length;
  }

  public boolean isInitialized() {
    return this.bIx;
  }

  public String toString() {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.iba);
    localStringBuffer.append("\ninitialized=").append(this.bIx);
    return localStringBuffer.toString();
  }
}