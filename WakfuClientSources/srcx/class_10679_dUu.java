import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dUu extends dzz
{
  private final asj ehi = new asj();
  private byte mrK;
  private int mrL;

  public asj aUv()
  {
    return this.ehi;
  }

  public byte duv() {
    return this.mrK;
  }

  public int duw() {
    return this.mrL;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    if (this.ehi.h(localByteBuffer)) {
      this.mrK = localByteBuffer.get();
      this.mrL = localByteBuffer.getInt();
    } else {
      K.error("Erreur durant la dé-serialisation d'un des inventaires marchands");
      return false;
    }
    return true;
  }

  public int getId() {
    return 10118;
  }
}