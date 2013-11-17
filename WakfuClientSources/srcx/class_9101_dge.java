import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class dge
  implements Iterable
{
  private final short lbc;
  private final List lbd = new ArrayList();

  public short cPH()
  {
    return this.lbc;
  }

  public boolean ec(short paramShort) {
    return this.lbc < paramShort;
  }

  public void d(bbL parambbL)
  {
    this.lbd.add(parambbL);
  }

  public Iterator iterator() {
    if (this.lbd == null)
      return Collections.emptyList().iterator();
    return this.lbd.iterator();
  }

  public int O()
  {
    int i = 4;
    for (bbL localbbL : this.lbd) {
      i += localbbL.O();
    }
    return i;
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.lbc);
    paramByteBuffer.putShort((short)this.lbd.size());
    for (bbL localbbL : this.lbd)
      localbbL.b(paramByteBuffer);
  }

  public static dge b(ahy paramahy, long paramLong, ByteBuffer paramByteBuffer)
  {
    short s = paramByteBuffer.getShort();
    dge localdge = new dge(s);
    int i = paramByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      bbL localbbL = bbL.a(paramahy, paramLong, paramByteBuffer);
      localdge.d(localbbL);
    }
    return localdge;
  }

  dge(short paramShort) {
    this.lbc = paramShort;
  }
}