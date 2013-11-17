import java.nio.ByteBuffer;
import java.util.ArrayList;

final class aVl
{
  private final bQo daT = new bQo();

  private aVl(agU paramagU) {  } 
  public void z() { this.eXx.daT.gYv.clear();
    this.eXx.daT.gYv.ensureCapacity(this.daT.gYv.size());
    this.eXx.daT.gYv.addAll(this.daT.gYv); }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  public void bla() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 10023) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        bla();
        return true;
      }
      return false;
    }

    return false;
  }
}