public class cld extends rP
{
  public static final byte hMK = 3;
  private wK dCg;
  private short aFe;

  public cld(wK paramwK, short paramShort)
  {
    super(Oo.cfs);
    this.dCg = paramwK;
    this.aFe = paramShort;
  }

  public cld(cbI paramcbI, wK paramwK, short paramShort) {
    super(Oo.cfs, paramcbI);
    this.dCg = paramwK;
    this.aFe = paramShort;
  }

  public wK cmT() {
    return this.dCg;
  }

  public short nP() {
    return this.aFe;
  }

  public byte yo() {
    return 3;
  }

  public int yp() {
    return 3;
  }

  public String yq() {
    return "AudioMarker - " + yl().getDescription();
  }

  public String yr() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("id = ").append(this.dCg.bL()).append(" quantité = ").append(this.aFe);
    cbI localcbI = yn();
    if (localcbI != null) {
      localStringBuilder.append(" Position = [").append(localcbI.OZ()).append(",").append(localcbI.Pa()).append("]");
    }
    return localStringBuilder.toString();
  }
}