import java.nio.ByteBuffer;

public class anl extends dzz
{
  private cYq aHo;
  private boolean dqR;
  private float dqS;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aHo = cYq.jq(localByteBuffer.getLong());
    this.dqR = (localByteBuffer.get() == 1);
    this.dqS = localByteBuffer.getFloat();
    return true;
  }

  public int getId() {
    return 15001;
  }

  public cYq azV() {
    return this.aHo;
  }

  public boolean azW() {
    return this.dqR;
  }

  public float azX() {
    return this.dqS;
  }
}