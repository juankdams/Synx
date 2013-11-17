import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class aug
{
  private static final Logger K = Logger.getLogger(aug.class);

  public abstract ctN QF();

  public static byte[] a(ctN paramctN)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(5 + paramctN.O());
    localByteBuffer.put((byte)paramctN.crj().ordinal());
    localByteBuffer.putInt(paramctN.bP());
    paramctN.g(localByteBuffer);
    return localByteBuffer.array();
  }

  public static ctN A(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    byte b = localByteBuffer.get();
    ctN localctN = dfr.eU(b);
    if (localctN == null) {
      K.error("Impossible de décoder une NactionActionRequest : type inconnu : " + b);
      return null;
    }
    localctN.dc(localByteBuffer.getInt());
    if (localctN.h(localByteBuffer)) {
      return localctN;
    }
    K.error("Erreur à la désérialisation d'une requête de type " + b);
    return null;
  }
}