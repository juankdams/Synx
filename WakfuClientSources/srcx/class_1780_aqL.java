public final class aqL
{
  private final aAn dyn;
  private String dyo;
  private String dyp;
  private String dyq;
  private int dyr = bDf.gyc;
  private String dys;
  private short dcA;

  public aqL(aAn paramaAn)
  {
    this.dyn = paramaAn;
  }

  public aqL fj(String paramString) {
    this.dyo = paramString;
    return this;
  }

  public aqL fk(String paramString) {
    this.dyp = paramString;
    return this;
  }

  public aqL fl(String paramString) {
    this.dyq = paramString;
    return this;
  }

  public aqL q(String paramString, int paramInt) {
    this.dyq = paramString;
    this.dyr = paramInt;
    return this;
  }

  public aqL fm(String paramString) {
    this.dys = paramString;
    return this;
  }

  public aqL aK(short paramShort) {
    this.dcA = paramShort;
    return this;
  }

  public dtt aCR() {
    dtt localdtt = new dtt(this.dyn);
    localdtt.nb(this.dyq);
    localdtt.qf(this.dys);
    localdtt.xp(this.dyr);
    localdtt.jz(this.dyo);
    localdtt.qe(this.dyp);
    localdtt.ax(this.dcA);
    return localdtt;
  }
}