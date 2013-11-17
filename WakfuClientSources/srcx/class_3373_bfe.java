import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public class bfe extends aRw
{
  private ArrayList eNy = new ArrayList();
  private long fst;

  public void fs(long paramLong)
  {
    this.eNy.add(Long.valueOf(paramLong));
  }

  public byte[] encode()
  {
    short s = (short)this.eNy.size();
    int i = 10 + s * 8;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.putLong(this.fst);
    localByteBuffer.putShort(s);
    for (Iterator localIterator = this.eNy.iterator(); localIterator.hasNext(); ) { long l = ((Long)localIterator.next()).longValue();
      localByteBuffer.putLong(l);
    }

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5207;
  }

  public void ft(long paramLong) {
    this.fst = paramLong;
  }
}