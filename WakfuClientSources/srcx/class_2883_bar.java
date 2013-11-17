import java.nio.ByteBuffer;

final class bar
{
  private final bQo daT = new bQo();

  private bar(dOl paramdOl) {
  }
  public void z() {
  }
  private boolean f(ByteBuffer paramByteBuffer) { return true; }

  private boolean o(ByteBuffer paramByteBuffer)
  {
    boolean bool = this.daT.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  public void bpb() {
  }

  public void uG() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }
    boolean bool;
    if (paramInt < 10003) {
      bool = f(paramByteBuffer);
      if (bool) {
        bpb();
        uG();
        return true;
      }
      return false;
    }
    if (paramInt < 10023) {
      bool = o(paramByteBuffer);
      if (bool) {
        uG();
        return true;
      }
      return false;
    }

    return false;
  }
}