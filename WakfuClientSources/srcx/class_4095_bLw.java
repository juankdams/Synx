import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public class bLw
  implements doR
{
  private final AtomicInteger gPg = new AtomicInteger(0);
  private int TR;
  private crG gPh;

  public bLw(crG paramcrG)
  {
    this.TR = 0;
    this.gPh = paramcrG;
  }

  public boolean bTq() {
    this.TR = 0;
    return true;
  }

  public boolean b(blq paramblq) {
    this.TR = 0;
    return true;
  }

  public String getDescription() {
    return this.gPh.cqe().getDescription();
  }

  public String als() {
    return this.gPh.cqe().als();
  }

  public int j(ByteBuffer paramByteBuffer, int paramInt) {
    if (!this.gPh.isInitialized()) {
      return 0;
    }
    paramByteBuffer.position(paramInt);
    byte[] arrayOfByte = this.gPh.cqf();
    int i = Math.min(paramByteBuffer.limit() - paramInt, arrayOfByte.length - this.TR);
    i = Math.max(0, i - i % this.gPh.cqe().bTt());
    paramByteBuffer.put(arrayOfByte, this.TR, i);
    this.TR += i;

    if (this.TR >= arrayOfByte.length) {
      return -i;
    }
    return i;
  }

  public int bTr() {
    return this.gPh.cqe().bTr();
  }

  public int bTs() {
    return this.gPh.cqe().bTs();
  }

  public void gk(boolean paramBoolean)
  {
  }

  public void reset() {
    this.TR = 0;
  }

  public void close() {
  }

  public int alg() {
    return this.gPh.cqe().alg();
  }

  public long all() {
    throw new UnsupportedOperationException("JOrbisVirtualStream.rawTell");
  }

  public long alm() {
    return this.TR;
  }

  public float aln() {
    throw new UnsupportedOperationException("JOrbisVirtualStream.timeTell");
  }

  public int am(float paramFloat) {
    throw new UnsupportedOperationException("Impossible de seek sur un son non streamé à la seconds=" + paramFloat);
  }

  public int cu(long paramLong) {
    if (paramLong > 2147483647L) {
      throw new UnsupportedOperationException("Impossible de pcmSeek sur un son non streamé à la position offset=" + paramLong);
    }
    this.TR = ((int)paramLong);

    return 0;
  }

  public int ct(long paramLong) {
    throw new UnsupportedOperationException("Impossible de rawSeek sur un son non streamé à la position offset=" + paramLong);
  }

  public int bTt() {
    return this.gPh.cqe().bTt();
  }

  public int ayf() {
    return this.gPh.cqe().ayf();
  }

  public void th(int paramInt)
  {
  }

  public int bTu() {
    return this.gPg.get();
  }

  public void bTv() {
    this.gPg.incrementAndGet();
  }

  public void bTw() {
    this.gPg.decrementAndGet();
  }
}