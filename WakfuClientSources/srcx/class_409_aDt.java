import java.io.File;

public class aDt
  implements blq
{
  private afP dYk;
  private File dYl;
  private int bec;

  public aDt(File paramFile)
  {
    this(paramFile, -1);
  }

  public aDt(File paramFile, int paramInt) {
    this.dYl = paramFile;
    this.bec = paramInt;
  }

  public void aPF() {
    if (this.bec == -1)
      this.dYk = new afP(this.dYl);
    else
      this.dYk = new afP(this.dYl, this.bec);
  }

  public void reset()
  {
    this.dYk.seek(0L);
  }

  public void close() {
    if (this.dYk != null)
      this.dYk.close();
  }

  public boolean aPG()
  {
    return true;
  }

  public void seek(long paramLong) {
    this.dYk.seek(paramLong);
  }

  public long length() {
    return this.dYk.length();
  }

  public long tell() {
    return this.dYk.getFilePointer();
  }

  public String getDescription() {
    return this.dYl.getPath();
  }

  public String als() {
    return dtb.pY(this.dYl.getPath());
  }

  public int read() {
    return this.dYk.read();
  }

  public int read(byte[] paramArrayOfByte) {
    return this.dYk.read(paramArrayOfByte);
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    return this.dYk.read(paramArrayOfByte, paramInt1, paramInt2);
  }
}