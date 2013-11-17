public class azB extends rP
{
  public static final byte dRb = 0;
  private TE dRc;

  public azB(TE paramTE)
  {
    this(paramTE, null);
  }

  public azB(TE paramTE, cbI paramcbI) {
    super(Oo.cfo, paramcbI);
    this.dRc = paramTE;
  }

  public TE aLx() {
    return this.dRc;
  }

  public byte yo() {
    return 0;
  }

  public int yp()
  {
    return this.dRc.ET() << 8 | 0x0;
  }

  public String yq() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Weather - ").append(this.dRc.getDescription());
    return localStringBuilder.toString();
  }

  public String yr() {
    StringBuilder localStringBuilder = new StringBuilder();
    cbI localcbI = yn();
    if (localcbI != null) {
      localStringBuilder.append(" Position = [").append(localcbI.OZ()).append(",").append(localcbI.Pa()).append("]");
    }
    return localStringBuilder.toString();
  }
}