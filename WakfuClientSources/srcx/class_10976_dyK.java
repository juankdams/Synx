import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class dyK extends dzz
{
  private final Collection cPn = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    while (localByteBuffer.hasRemaining()) {
      bIY localbIY = bIY.dr(localByteBuffer.get());
      dTK localdTK = (dTK)localbIY.gy();
      localdTK.a(localByteBuffer);
      this.cPn.add(localdTK);
    }
    return true;
  }

  public Iterator anF() {
    return this.cPn.iterator();
  }

  public int getId()
  {
    return 20050;
  }

  public String toString()
  {
    return "GuildChangeMessage{m_changes=" + this.cPn.size() + '}';
  }
}