import java.nio.ByteBuffer;

public abstract class ckq
{
  private final cSR hLz;

  protected ckq()
  {
    this.hLz = new cSR();
    fill();
  }

  public final agQ[] cmp() {
    agQ[] arrayOfagQ = new agQ[this.hLz.size()];
    this.hLz.d(arrayOfagQ);
    return arrayOfagQ;
  }

  public final agQ vD(int paramInt)
  {
    return (agQ)this.hLz.get(paramInt);
  }

  public final cdR b(int paramInt, ByteBuffer paramByteBuffer)
  {
    agQ localagQ = vD(paramInt);
    if (localagQ == null) {
      return null;
    }
    cdR localcdR = localagQ.pv();
    localagQ.a(localcdR.hxQ, paramByteBuffer);
    return localcdR;
  }

  protected abstract void fill();

  protected final void a(agQ paramagQ) {
    this.hLz.put(paramagQ.xj(), paramagQ);
  }
}