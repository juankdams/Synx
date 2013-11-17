import java.io.InputStream;
import java.io.RandomAccessFile;

class aTh extends InputStream
{
  private long eQA;
  private long eQB;
  private boolean eQC = false;

  aTh(dKB paramdKB, long paramLong1, long paramLong2) {
    this.eQA = paramLong2;
    this.eQB = paramLong1;
  }

  public int read()
  {
    if (this.eQA-- <= 0L) {
      if (this.eQC) {
        this.eQC = false;
        return 0;
      }
      return -1;
    }
    synchronized (dKB.b(this.eon)) {
      dKB.b(this.eon).seek(this.eQB++);
      return dKB.b(this.eon).read();
    }
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.eQA <= 0L) {
      if (this.eQC) {
        this.eQC = false;
        paramArrayOfByte[paramInt1] = 0;
        return 1;
      }
      return -1;
    }

    if (paramInt2 <= 0) {
      return 0;
    }

    if (paramInt2 > this.eQA) {
      paramInt2 = (int)this.eQA;
    }
    int i = -1;
    synchronized (dKB.b(this.eon)) {
      dKB.b(this.eon).seek(this.eQB);
      i = dKB.b(this.eon).read(paramArrayOfByte, paramInt1, paramInt2);
    }
    if (i > 0) {
      this.eQB += i;
      this.eQA -= i;
    }
    return i;
  }

  void biB()
  {
    this.eQC = true;
  }
}