import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aGl extends dWi
{
  private cYk edo;
  private Long edp;

  public boolean a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length != 22)) {
      K.error("le message recu a une taille de données incorrecte");
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.edo = new cYk();
    this.edo.setX(localByteBuffer.getInt());
    this.edo.setY(localByteBuffer.getInt());
    this.edo.dG(localByteBuffer.getShort());
    this.edp = Long.valueOf(localByteBuffer.getLong());
    return true;
  }

  public int getId()
  {
    return 8156;
  }

  public cYk aSs()
  {
    return this.edo;
  }

  public Long aSt()
  {
    return this.edp;
  }
}