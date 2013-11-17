public class cpj extends rP
{
  public static final byte hYt = 4;
  private int hlL;

  public cpj(int paramInt)
  {
    super(Oo.cft);
    this.hlL = paramInt;
  }

  public cpj(cbI paramcbI, int paramInt) {
    super(Oo.cft, paramcbI);
    this.hlL = paramInt;
  }

  public int ccv() {
    return this.hlL;
  }

  public byte yo() {
    return 4;
  }

  public int yp() {
    return 4;
  }

  public String yq() {
    return "Time - " + yl().getDescription();
  }

  public String yr() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("time = ").append(this.hlL);
    cbI localcbI = yn();
    if (localcbI != null) {
      localStringBuilder.append(" Position = [").append(localcbI.OZ()).append(",").append(localcbI.Pa()).append("]");
    }
    return localStringBuilder.toString();
  }
}