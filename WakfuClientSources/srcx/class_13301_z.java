import java.nio.ByteBuffer;

public class z extends cCA
  implements cMC
{
  private short aG;
  private boolean aH;

  public z(short paramShort)
  {
    this.aG = paramShort;
  }

  public z() {
  }

  public short K() {
    return this.aG;
  }

  public byte L()
  {
    return 2;
  }

  public boolean M() {
    return this.aH;
  }

  public void b(boolean paramBoolean) {
    this.aH = paramBoolean;
  }

  public void a(short paramShort) {
    this.aG = paramShort;
  }

  public void a(cXr paramcXr)
  {
    paramcXr.dT(this.aG);
  }

  public void a(ByteBuffer paramByteBuffer)
  {
    this.aG = paramByteBuffer.getShort();
  }
}