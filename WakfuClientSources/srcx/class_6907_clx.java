import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class clx extends cCH
{
  clx(deM paramdeM)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    if (deM.a(this.hNs) == null) {
      paramByteBuffer.put((byte)0);
      return;
    }
    int i = deM.a(this.hNs).size();
    if (i > 127) {
      K.error("Nombre d'actions " + i + " > 255");
      return;
    }
    paramByteBuffer.put((byte)i);
    dyO localdyO = deM.a(this.hNs).Vo();
    while (localdyO.hasNext()) {
      localdyO.fl();
      paramByteBuffer.putShort(localdyO.fm());
      paramByteBuffer.putInt(localdyO.value());
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    throw new UnsupportedOperationException();
  }
}