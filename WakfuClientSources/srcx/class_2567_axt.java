import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class axt extends dzz
{
  private final Collection cPn = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    while (localByteBuffer.hasRemaining()) {
      JC localJC = JC.af(localByteBuffer.get());
      jI localjI = localJC.TT();
      localjI.a(localByteBuffer);
      this.cPn.add(localjI);
    }
    return true;
  }

  public Iterator anF() {
    return this.cPn.iterator();
  }

  public int getId()
  {
    return 15998;
  }

  public String toString()
  {
    return "QuestInventoryChangeMessage{m_changes=" + this.cPn.size() + '}';
  }
}