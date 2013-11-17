import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class aaT extends dzz
{
  private long cfv;
  private final Collection cPn = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cfv = localByteBuffer.getLong();
    while (localByteBuffer.hasRemaining()) {
      cQy localcQy = cQy.eD(localByteBuffer.get());
      dMx localdMx = localcQy.cHn();
      localdMx.a(localByteBuffer);
      this.cPn.add(localdMx);
    }
    return true;
  }

  public long anE() {
    return this.cfv;
  }

  public Iterator anF() {
    return this.cPn.iterator();
  }

  public int getId()
  {
    return 15982;
  }

  public String toString()
  {
    return "PetChangeMessage{m_itemId=" + this.cfv + ", m_changes=" + this.cPn.size() + '}';
  }
}