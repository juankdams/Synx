import org.apache.log4j.Logger;

public abstract class cyv
  implements bBz, bWU, dsj, dxl, eo
{
  protected static final Logger K = Logger.getLogger(cyv.class);
  private static final short[] imN = { 0, 10, 20, 40, 60, 80, 100, 125, 150, 175, 200, 225, 250, 275, 300 };
  protected aee aOr;
  private LE imO;
  private SB imP;
  private bGl fsY;
  private dxl imQ = null;

  protected abstract cyv bXl();

  public void aJ() {
    this.imO = null;
    this.imP = null;
    this.imQ = null;
  }

  public void bc() {
    this.fsY = null;
    this.imO = null;
    this.imP = null;
    this.imQ = null;
  }

  public short nU() {
    if (this.imQ != null) {
      return (short)(this.fsY.nU() + this.imQ.nU());
    }
    return this.fsY.nU();
  }

  public byte cvt() {
    int i = cvu();

    for (int j = 0; (j < imN.length) && 
      (imN[j] <= i); j = (byte)(j + 1));
    return (byte)(j - 1);
  }

  public short cvu()
  {
    return this.fsY.nU();
  }

  public dxl cvv() {
    return this.imQ;
  }

  public void a(dxl paramdxl) {
    this.imQ = paramdxl;
  }

  public LE cvw() {
    return this.imO;
  }

  public void release() {
    if (this.aOr != null)
      try {
        this.aOr.y(this);
        this.aOr = null;
      } catch (Exception localException) {
        K.error("Exception dans le release de " + getClass().toString() + " normalement impossible");
      }
    else
      bc();
  }

  public long oj()
  {
    return this.imO.getId();
  }

  public int ok() {
    return this.imO.getId();
  }

  protected void a(LE paramLE, short paramShort, long paramLong) {
    this.imO = paramLE;
    this.fsY = new bGl(ble());
    e(paramShort, paramLong);
  }

  public boolean b(cPm paramcPm)
  {
    LE localLE = bXm().qy(paramcPm.bPw);
    if (localLE == null) {
      K.error("Impossible de désérialiser un skill : skill reference d'id " + paramcPm.bPw + " inconnu");
      return false;
    }

    a(localLE, paramcPm.bUp, paramcPm.aGh);
    return true;
  }

  public boolean c(cPm paramcPm)
  {
    dxl localdxl = cvv();
    a(null);
    paramcPm.bPw = this.imO.getId();
    paramcPm.bUp = nU();
    paramcPm.aGh = ayX();
    a(localdxl);
    return true;
  }

  public abstract bpa bXm();

  public short nP() {
    return 1;
  }

  public void l(short paramShort) {
  }

  public void a(short paramShort) {
  }

  public boolean b(dsj paramdsj) {
    return false;
  }

  public short nR() {
    return 1;
  }

  public dsj ow() {
    cyv localcyv = bXl();
    localcyv.a(this.imO, nU(), ayX());
    localcyv.imP = this.imP;
    return localcyv;
  }

  public dsj r(boolean paramBoolean) {
    return ow();
  }

  public boolean og() {
    return true;
  }

  public float bsM() {
    return 1.0F;
  }

  public void f(SB paramSB) {
    this.imP = paramSB;
  }

  public cOB ble() {
    if (this.imO != null) {
      return this.imO.Wh().bqS();
    }
    return dSy.abu();
  }

  public float ayY() {
    return this.fsY.ayY();
  }

  public uP e(short paramShort, long paramLong) {
    return this.fsY.e(dq(paramShort), paramLong);
  }

  public uP d(short paramShort, boolean paramBoolean) {
    return this.fsY.d(dq(paramShort), paramBoolean);
  }

  private short dq(short paramShort) {
    return bCO.d(paramShort, ble().Qb(), ble().nV());
  }

  public long ayX() {
    return this.fsY.ayX();
  }

  public uP da(long paramLong) {
    return this.fsY.da(paramLong);
  }

  public String ayZ() {
    return this.fsY.ayZ();
  }
}