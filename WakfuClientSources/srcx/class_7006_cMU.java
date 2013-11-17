import java.nio.ByteBuffer;

public class cMU extends dzz
{
  private azO ksn;
  private boolean coU;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.ksn = azO.bu(localByteBuffer.get());
    this.coU = (localByteBuffer.get() == 1);
    return true;
  }

  public azO cFF() {
    return this.ksn;
  }

  public boolean isLocked() {
    return this.coU;
  }

  public int getId()
  {
    return 5226;
  }

  public String toString()
  {
    return "EquipmentPositionLockedMessage{m_position=" + this.ksn + ", m_locked=" + this.coU + '}';
  }
}