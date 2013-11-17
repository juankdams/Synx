public class td extends rP
{
  public static final byte bcV = 2;
  private byu bcW;
  private int bcX;

  public td(byu parambyu, int paramInt)
  {
    super(Oo.cfr);
    this.bcW = parambyu;
    this.bcX = paramInt;
  }

  public td(cbI paramcbI, byu parambyu, int paramInt) {
    super(Oo.cfr, paramcbI);
    this.bcW = parambyu;
    this.bcX = paramInt;
  }

  public byu AE() {
    return this.bcW;
  }

  public int getStrength() {
    return this.bcX;
  }

  public byte yo() {
    return 2;
  }

  public int yp() {
    return this.bcW.hV << 8 | 0x2;
  }

  public String yq() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Geography - ").append(this.bcW.name());
    return localStringBuilder.toString();
  }

  public String yr() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" : Force = ").append(this.bcX);
    cbI localcbI = yn();
    if (localcbI != null) {
      localStringBuilder.append(" Position = [").append(localcbI.OZ()).append(",").append(localcbI.Pa()).append("]");
    }
    return localStringBuilder.toString();
  }
}