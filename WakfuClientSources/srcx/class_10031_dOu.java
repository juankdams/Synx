import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class dOu extends cCH
{
  dOu(doA paramdoA)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(doA.g(this.mge) ? 1 : 0));
    paramByteBuffer.put(doA.h(this.mge));
    this.mge.loV.b(paramByteBuffer);
    int i = this.mge.bWm();
    paramByteBuffer.putInt(i);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    doA.e(this.mge, paramByteBuffer.get() == 1);
    doA.a(this.mge, paramByteBuffer.get());
    this.mge.loV = bvk.ay(paramByteBuffer);
    this.mge.loW = paramByteBuffer.getInt();
  }

  public int cc()
  {
    if (this.mge.loV == null) {
      this.mge.loV = bvk.bCS();
      K.error(((dpI)this.mge.bkc()).eo() + " : m_endtime null, théoriquement impossible");
    }
    return 2 + bvk.O() + 4;
  }
}