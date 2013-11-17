public class cln extends rP
{
  public static final byte hMY = 1;
  private int aDH;
  private short aFe;

  public cln(Oo paramOo, int paramInt, short paramShort)
  {
    super(paramOo);
    this.aDH = paramInt;
    this.aFe = paramShort;
  }

  public cln(Oo paramOo, cbI paramcbI, int paramInt, short paramShort) {
    super(paramOo, paramcbI);
    this.aDH = paramInt;
    this.aFe = paramShort;
  }

  public int nn() {
    return this.aDH;
  }

  public short nP() {
    return this.aFe;
  }

  public byte yo() {
    return 1;
  }

  public int yp() {
    return 1;
  }

  public String yq() {
    return "Family - " + yl().getDescription();
  }

  public String yr() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("id = ").append(this.aDH).append(" quantité = ").append(this.aFe);
    cbI localcbI = yn();
    if (localcbI != null) {
      localStringBuilder.append(" Position = [").append(localcbI.OZ()).append(",").append(localcbI.Pa()).append("]");
    }
    return localStringBuilder.toString();
  }
}