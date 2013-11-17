import java.nio.ByteBuffer;

public class aO extends cCH
{
  private dVs iv;

  aO(Vk paramVk)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    if (this.iv == null) {
      paramByteBuffer.put((byte)0);
      return;
    }

    Vk.a(this.iw).b(this.iv);
    this.iv.g(paramByteBuffer);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    dhJ localdhJ = (dhJ)this.iw.bkf();
    if (localdhJ.getId() < 0L) {
      paramByteBuffer.get();
      return;
    }
    this.iv = new dVs();
    this.iv.h(paramByteBuffer);

    localdhJ.a(this.iv);
  }

  public int cc()
  {
    if (Vk.b(this.iw).getId() < 0L) {
      return 1;
    }

    this.iv = new dVs();
    Vk.a(this.iw).b(this.iv);
    return this.iv.O();
  }
}