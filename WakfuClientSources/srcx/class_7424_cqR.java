import java.nio.ByteBuffer;
import java.util.EnumMap;
import org.apache.log4j.Logger;

class cqR extends cCH
{
  cqR(dWu paramdWu)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("Impossible de sérialiser un élément interactif côté client");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    K.trace("Décodage des données globales (len=" + paramByteBuffer.remaining() + ")");
    if (paramByteBuffer.remaining() > 0) {
      if (paramByteBuffer.remaining() < 1) {
        K.error("Impossible de désérialiser une partie vide");
        return;
      }
      int i = paramByteBuffer.get() & 0xFF;
      if (paramByteBuffer.remaining() != i * 6) {
        K.error("Impossible de désérialiser " + i + " actions dans un buffer de " + paramByteBuffer.remaining() + " octets");
        return;
      }
      for (int j = 0; j < i; j++) {
        short s = paramByteBuffer.getShort();
        int k = paramByteBuffer.getInt();
        dJO localdJO = dJO.eH(s);
        if (localdJO != null)
          dWu.h(this.iaC).put(localdJO, Integer.valueOf(k));
        else
          K.error("Pas de InteractiveElementAction d'ID=" + s);
      }
    }
  }
}