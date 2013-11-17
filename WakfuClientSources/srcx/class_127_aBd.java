import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class aBd extends avU
{
  private static final Logger K = Logger.getLogger(aBd.class);

  aBd(cKg paramcKg) {
    super(paramcKg);
  }

  public void ag(ByteBuffer paramByteBuffer) {
    short s1 = paramByteBuffer.getShort();
    short s2 = paramByteBuffer.getShort();
    try {
      r(s1, s2);
    } catch (bcw localbcw) {
      K.error("[HAVEN_WORLD] Impossible d'ajouter une partition", localbcw);
    }
  }

  public void ah(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort();
    long l1 = paramByteBuffer.getLong();
    int j = paramByteBuffer.getInt();
    long l2 = paramByteBuffer.getLong();
    short s1 = paramByteBuffer.getShort();
    short s2 = paramByteBuffer.getShort();
    try {
      a(new bFA(l1, i, j, s1, s2), l2);
    } catch (bcw localbcw) {
      K.error("[HAVEN_WORLD] Impossible d'ajouter le bâtiment " + l1, localbcw);
    }
  }
}