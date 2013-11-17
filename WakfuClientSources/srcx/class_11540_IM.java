import java.nio.ByteBuffer;

class IM extends cCH
{
  IM(aVc paramaVc, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.bRW.evp != null ? this.bRW.evp.getId() : 0L);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    long l = paramByteBuffer.getLong();
    if (l == 0L) {
      this.bRW.evp = null;
    }
    else if ((this.bRW.ejP != null) && (this.bRW.ejP.LD() != null)) {
      this.bRW.evp = this.bRW.ejP.LD().bk(l);
      if (this.bRW.evp != null);
    }
  }
}