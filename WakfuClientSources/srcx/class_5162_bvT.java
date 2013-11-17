import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bvT extends dzz
{
  private Wr ggE;
  private boolean ggF;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.ggF = (localByteBuffer.get() != 0);
    this.ggE = Wr.V(localByteBuffer);

    if (localByteBuffer.hasRemaining()) {
      K.error("Il reste " + localByteBuffer.remaining() + " bytes inutilisés");
      return false;
    }
    return true;
  }

  public int getId()
  {
    return 4214;
  }

  public int size() {
    return this.ggE.size();
  }

  public Wr bDK() {
    return this.ggE;
  }

  public boolean bDL() {
    return this.ggF;
  }
}