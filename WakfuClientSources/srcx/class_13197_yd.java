public class yd
{
  public static final yd brs = new yd(0, 0, 0, 0, 0, 0);
  public static final yd brt = new yd(0, 0, 0, 1, 0, 0);
  public static final yd bru = new yd(0, 0, 1, 0, 0, 0);
  public static final yd brv = new yd(0, 0, 7, 0, 0, 0);
  public static final yd brw = new yd(0, 1, 0, 0, 0, 0);
  public static final yd brx = new yd(1, 0, 0, 0, 0, 0);
  private int bry;
  private int brz;
  private int aMT;
  private int aMS;
  private int aMR;
  private int aMQ;
  private long brA;

  public yd(yd paramyd)
  {
    this.bry = paramyd.bry;
    this.brz = paramyd.brz;
    this.aMT = paramyd.aMT;
    this.aMS = paramyd.aMS;
    this.aMR = paramyd.aMR;
    this.aMQ = paramyd.aMQ;
    Hb();
  }

  public yd(cds paramcds) {
    this.bry = 0;
    this.brz = 0;
    this.aMT = paramcds.getDays();
    this.aMS = paramcds.getHours();
    this.aMR = paramcds.getMinutes();
    this.aMQ = paramcds.getSeconds();
    Hb();
  }

  public yd(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.bry = paramInt1;
    this.brz = paramInt2;
    this.aMT = paramInt3;
    this.aMS = paramInt4;
    this.aMR = paramInt5;
    this.aMQ = paramInt6;
    Hb();
  }

  private void Hb() {
    this.brA = (this.aMQ | this.aMR << 8 | this.aMS << 16 | this.aMT << 24 | this.brz << 32 | this.bry << 40);
  }

  public int getYears() {
    return this.bry;
  }

  public int getMonths() {
    return this.brz;
  }

  public int getDays() {
    return this.aMT;
  }

  public int getHours() {
    return this.aMS;
  }

  public int getMinutes() {
    return this.aMR;
  }

  public int getSeconds() {
    return this.aMQ;
  }

  public long rP()
  {
    return this.brA;
  }

  public static yd aV(long paramLong)
  {
    long l = paramLong;
    int i = (int)(l & 0xFF);
    l >>= 8;
    int j = (int)(l & 0xFF);
    l >>= 8;
    int k = (int)(l & 0xFF);
    l >>= 8;
    int m = (int)(l & 0xFF);
    l >>= 8;
    int n = (int)(l & 0xFF);
    l >>= 8;
    int i1 = (int)(l & 0xFFFF);
    return new yd(i1, n, m, k, j, i);
  }

  public String toString() {
    return (this.bry != 0 ? this.bry + " ans " : " ") + (this.brz != 0 ? this.brz + " mois " : "") + (this.aMT != 0 ? this.aMT + " jours " : "") + (this.aMS != 0 ? this.aMS + " heures " : "") + (this.aMR != 0 ? this.aMR + " minutes " : "") + (this.aMQ != 0 ? this.aMQ + " secondes " : "");
  }
}