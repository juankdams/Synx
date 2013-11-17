public class cQw
  implements blq
{
  public dAb kBu;
  private String aLm;
  private aDo kBv;
  private String SL;

  public cQw(aDo paramaDo, String paramString1, String paramString2)
  {
    this.aLm = paramString2;
    this.kBv = paramaDo;
    this.SL = paramString1;
  }

  public void aPF() {
    cYJ localcYJ = this.kBv.gh(this.SL);

    StringBuilder localStringBuilder = new StringBuilder();
    int i = localcYJ.read();
    while ((i != -1) && (localStringBuilder.length() < 3)) {
      localStringBuilder.append((char)i);
      i = localcYJ.read();
    }

    localcYJ.seek(0L);

    if (localStringBuilder.toString().toUpperCase().equals("OGG"))
      this.kBu = localcYJ;
    else {
      this.kBu = new cES(localcYJ);
    }

    reset();
  }

  public void reset() {
    this.kBu.seek(0L);
  }

  public void close() {
    this.kBu.close();
  }

  public boolean aPG() {
    return true;
  }

  public void seek(long paramLong) {
    this.kBu.seek(paramLong);
  }

  public long length() {
    return this.kBu.length();
  }

  public long tell() {
    return this.kBu.tell();
  }

  public int read() {
    return this.kBu.read();
  }

  public int read(byte[] paramArrayOfByte) {
    return this.kBu.read(paramArrayOfByte);
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    return this.kBu.read(paramArrayOfByte, paramInt1, paramInt2);
  }

  public String getDescription() {
    return this.aLm;
  }

  public String als() {
    return dtb.pY(this.aLm);
  }
}