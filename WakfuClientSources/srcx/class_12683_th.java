import java.nio.ByteBuffer;

public class th extends hk
{
  private th(aAY paramaAY)
  {
  }

  public void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.bdf.dUq.m(Yp.cIQ);
    if (paramByteBuffer.get() == 0) {
      return;
    }

    dpE localdpE = dpE.aL(paramByteBuffer);
    this.bdf.dUq.b(localdpE);
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    dpE localdpE = this.bdf.dUq.clp();
    if (localdpE == null) {
      paramByteBuffer.put((byte)0);
      return;
    }

    paramByteBuffer.put((byte)1);
    localdpE.b(paramByteBuffer);
  }

  public int O()
  {
    dpE localdpE = this.bdf.dUq.clp();
    return 1 + (localdpE != null ? localdpE.O() : 0);
  }
}