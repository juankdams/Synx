import java.nio.ByteBuffer;

public abstract class dCh extends hk
{
  public final void b(ByteBuffer paramByteBuffer)
  {
    cxS localcxS = akJ();
    b(localcxS);
    localcxS.g(paramByteBuffer);
  }

  public final void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    cxS localcxS = akJ();
    localcxS.b(paramByteBuffer, paramInt);
    a(localcxS);
  }

  public final int O()
  {
    cxS localcxS = akJ();
    b(localcxS);
    return localcxS.O();
  }

  protected abstract cxS akJ();

  protected abstract void b(cxS paramcxS);

  protected abstract void a(cxS paramcxS);
}