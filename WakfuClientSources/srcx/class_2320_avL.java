import java.nio.ByteBuffer;

public class avL extends dzz
{
  private long kM;
  private cUb aFh;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kM = localByteBuffer.getLong();
    if (localByteBuffer.remaining() > 0) {
      aTz localaTz = new aTz();
      localaTz.h(localByteBuffer);
      this.aFh = cxD.ilA.a(localaTz);
    }
    return true;
  }

  public int getId()
  {
    return 15980;
  }

  public long eW() {
    return this.kM;
  }

  public cUb nJ() {
    return this.aFh;
  }

  public String toString()
  {
    return "PetEquippedMessage{m_playerId=" + this.kM + ", m_pet=" + this.aFh + '}';
  }
}