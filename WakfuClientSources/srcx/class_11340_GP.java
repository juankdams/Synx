import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class GP extends dzz
{
  private boolean bPe;
  private dxQ bPf;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bPe = (localByteBuffer.get() == 1);
    int i = localByteBuffer.get();
    if (i == 0) {
      return true;
    }
    this.bPf = new dxQ();
    for (int j = 0; j < i; j++)
    {
      byte b = localByteBuffer.get();
      bTI localbTI = bTI.dx(b);
      if (localbTI == null)
      {
        K.error("Unable to find Element of id " + b);
        localByteBuffer.getLong();
      }
      else {
        this.bPf.c(localbTI, localByteBuffer.getLong());
      }
    }
    return true;
  }

  public boolean QG() {
    return this.bPe;
  }

  public dxQ QH() {
    return this.bPf;
  }

  public int getId()
  {
    return 13200;
  }

  public String toString()
  {
    return "SpellsRestatNeededMessage{m_globalRestat=" + this.bPe + '}';
  }
}