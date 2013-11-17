import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class boL
  implements dTK
{
  private static final Logger K = Logger.getLogger(boL.class);
  private int cHZ;

  boL()
  {
  }

  boL(int paramInt)
  {
    this.cHZ = paramInt;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.cHZ);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.cHZ = paramByteBuffer.getInt();
  }

  public void a(aGO paramaGO) {
    try {
      if (this.cHZ > 0)
        paramaGO.mz(this.cHZ);
      else
        paramaGO.my(Math.abs(this.cHZ));
    }
    catch (dPr localdPr) {
      K.error("Impossible de retirer le membre", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJQ;
  }

  public String toString()
  {
    return "GuildPointsChange{m_guildPoints=" + this.cHZ + '}';
  }
}