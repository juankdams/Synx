import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dhN
{
  private final bQo daT = new bQo();

  private dhN(cir paramcir) {  } 
  public void z() { this.ldF.daT.gYv.clear();
    this.ldF.daT.gYv.ensureCapacity(this.daT.gYv.size());
    this.ldF.daT.gYv.addAll(this.daT.gYv); }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  public void cRu() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 10024001) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        cRu();
        return true;
      }
      return false;
    }

    return false;
  }
}