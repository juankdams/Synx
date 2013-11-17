import java.nio.ByteBuffer;

public class dbo
{
  private final cbQ kTf = new cbQ();
  private final cbQ kTg = new cbQ();
  final cnv bdm;

  public dbo(cnv paramcnv)
  {
    this.bdm = paramcnv;
  }

  void ju(long paramLong) {
    this.bdm.a(this, paramLong);
  }

  void B(long paramLong, int paramInt) {
    this.bdm.a(this, paramLong, Math.min(paramInt, this.kTg.size()));
  }

  void fD(long paramLong)
  {
    int i;
    while ((i = this.kTg.hl(paramLong)) != -1)
      this.kTg.remove(i);
    this.bdm.b(this, paramLong);
  }

  void AS() {
    this.bdm.a(this);
  }

  void cMZ() {
    this.bdm.c(this);
  }

  void AT() {
    this.bdm.d(this);
  }

  public cbQ AO() {
    return this.kTg;
  }

  public cbQ bPL() {
    return this.kTf;
  }

  public int O()
  {
    return 1 + 8 * this.kTg.size() + 1 + 8 * this.kTf.size();
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)this.kTg.size());
    for (int i = 0; i < this.kTg.size(); i++) {
      paramByteBuffer.putLong(this.kTg.get(i));
    }

    paramByteBuffer.put((byte)this.kTf.size());
    for (i = 0; i < this.kTf.size(); i++)
      paramByteBuffer.putLong(this.kTf.get(i));
  }

  public void read(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get();
    for (int j = 0; j < i; j++) {
      long l1 = paramByteBuffer.getLong();
      this.kTg.add(l1);
    }

    j = paramByteBuffer.get();
    for (int k = 0; k < j; k++) {
      long l2 = paramByteBuffer.getLong();
      this.kTf.add(l2);
    }
  }

  public void clear() {
    this.kTg.clear();
    this.kTf.clear();
  }
}