import java.nio.ByteBuffer;

public class cXy extends dzz
{
  private bH kKO;
  private je eaV;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    bqr localbqr = bqr.cZ(localByteBuffer.get());
    this.kKO = ((bH)localbqr.gy());
    this.kKO.a(localByteBuffer);
    this.eaV = je.aZ(localByteBuffer.getInt());
    return true;
  }

  public bH cLl() {
    return this.kKO;
  }

  public je aRB() {
    return this.eaV;
  }

  public int getId()
  {
    return 15652;
  }

  public String toString()
  {
    return "HavenWorldManageActionResult{m_error=" + this.eaV + '}';
  }
}