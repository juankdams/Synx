public class dcM
{
  private long dbD;
  private long kVO;
  private byte kVP;
  private byte kVQ;
  private int kVR;

  public dcM(long paramLong)
  {
    this.dbD = paramLong;
    this.kVR = ((int)(this.dbD % 1000L));
    long l1 = this.dbD / 1000L;
    this.kVQ = ((byte)(int)(l1 % 60L));
    long l2 = this.dbD / 1000L / 60L;
    this.kVP = ((byte)(int)(l2 % 60L));
    this.kVO = (this.dbD / 1000L / 60L / 60L);
  }

  public long getTime() {
    return this.dbD;
  }

  public long cOg() {
    return this.kVO;
  }

  public byte cOh() {
    return this.kVP;
  }

  public byte cOi() {
    return this.kVQ;
  }

  public int cOj() {
    return this.kVR;
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.kVO != 0L)
      localStringBuilder.append(this.kVO).append("h ");
    if (this.kVP != 0)
      localStringBuilder.append(this.kVP).append("min ");
    if (this.kVQ != 0)
      localStringBuilder.append(this.kVQ).append("sec ");
    localStringBuilder.append(this.kVR).append("ms");
    return localStringBuilder.toString();
  }
}