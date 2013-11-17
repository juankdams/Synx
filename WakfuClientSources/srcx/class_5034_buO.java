import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public final class buO extends aRw
{
  private ArrayList gex = new ArrayList();
  private long bMA;

  public byte[] encode()
  {
    int i = 0;
    for (Object localObject1 = this.gex.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (byte[])((Iterator)localObject1).next();
      i += localObject2.length + 4;
    }
    localObject1 = ByteBuffer.allocate(12 + i);
    ((ByteBuffer)localObject1).putLong(this.bMA);
    ((ByteBuffer)localObject1).putInt(this.gex.size());

    for (Object localObject2 = this.gex.iterator(); ((Iterator)localObject2).hasNext(); ) { byte[] arrayOfByte = (byte[])((Iterator)localObject2).next();
      ((ByteBuffer)localObject1).putInt(arrayOfByte.length);
      ((ByteBuffer)localObject1).put(arrayOfByte);
    }

    return a((byte)2, ((ByteBuffer)localObject1).array());
  }

  public int getId() {
    return 2057;
  }

  public void ad(byte[] paramArrayOfByte) {
    this.gex.add(paramArrayOfByte);
  }

  public void setTimeStamp(long paramLong) {
    this.bMA = paramLong;
  }

  public static int bCG() {
    return 12;
  }

  public int bCH() {
    return this.gex.size();
  }
}