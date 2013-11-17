import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class beT extends dzz
{
  private final Collection cPn = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    while (localByteBuffer.hasRemaining()) {
      adY localadY = adY.aM(localByteBuffer.get());
      ddz localddz = localadY.apU();
      localddz.a(localByteBuffer);
      this.cPn.add(localddz);
    }
    return true;
  }

  public Iterator anF() {
    return this.cPn.iterator();
  }

  public int getId()
  {
    return 15999;
  }

  public String toString()
  {
    return "TemporaryInventoryChangeMessage{m_changes=" + this.cPn.size() + '}';
  }
}