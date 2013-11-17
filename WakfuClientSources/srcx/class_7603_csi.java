import org.apache.log4j.Logger;

public class csi
  implements dxl, eo
{
  private static final Logger K = Logger.getLogger(csi.class);
  private static final boolean aRN = false;
  private short bQD;
  private dGf ibU = null;
  private String m_name = "";
  private int ibV;
  private long ibW;
  private long ibX;
  private short ibY;
  private short ibZ;
  private byte hJn = -1;
  private byte bml = -1;
  private long ica = -1L;
  private CG ax = CG.bFP;
  private boolean icb;

  public csi()
  {
  }

  public csi(short paramShort1, String paramString, int paramInt, short paramShort2, short paramShort3)
  {
    this.bQD = paramShort1;
    this.m_name = paramString;
    this.ibV = paramInt;
    this.ibW = -1L;
    this.ibY = paramShort3;
    this.ibX = ble().hR(paramShort2);
  }

  public csi(short paramShort1, String paramString, int paramInt, long paramLong, short paramShort2) {
    this.bQD = paramShort1;
    this.m_name = paramString;
    this.ibV = paramInt;
    this.ibW = -1L;
    this.ibX = paramLong;
    this.ibY = paramShort2;
  }

  public void ej(long paramLong) {
    this.ibW = paramLong;
  }

  public int cqE() {
    return this.ibV;
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public short Rw() {
    return this.bQD;
  }

  public short cqF() {
    return this.ibY;
  }

  public short nU() {
    if (this.ibZ > 0) {
      return this.ibZ;
    }
    short s = ble().cF(this.ibX);
    if (this.ibY < s) {
      s = this.ibY;
    }
    return s;
  }

  public long cqG() {
    return this.ibW;
  }

  protected void hH(long paramLong) {
    this.ibX = paramLong;
  }

  public long cqH() {
    return this.ibX;
  }

  public void a(dGf paramdGf) {
    this.ibU = paramdGf;
  }

  public short cqI() {
    if (this.ibU != null) {
      return this.ibU.alN();
    }
    return 0;
  }

  public void dF(byte paramByte) {
    this.hJn = paramByte;
  }

  public void c(CG paramCG) {
    this.ax = paramCG;
  }

  public CG E() {
    return this.ax;
  }

  public long cqJ() {
    return this.ica;
  }

  public void hI(long paramLong) {
    this.ica = paramLong;
  }

  public void dk(short paramShort) {
    this.ibZ = paramShort;
  }

  public byte xK() {
    return 0;
  }

  public byte Fx() {
    return this.bml;
  }

  public void as(byte paramByte) {
    this.bml = paramByte;
  }

  public void b(dhJ paramdhJ1, dhJ paramdhJ2) {
    paramdhJ1.d(this);
    if (this.ibV > 0) {
      paramdhJ1.d(eu.ayM).set(this.ibV);
    }

    d(paramdhJ1, paramdhJ2);

    paramdhJ1.setName(this.m_name);
    paramdhJ1.dF(this.hJn);
    if (paramdhJ2.c(dKm.lXr))
      paramdhJ1.a(dKm.lXr);
  }

  private void d(dhJ paramdhJ1, dhJ paramdhJ2)
  {
    boolean bool = ((dGf)paramdhJ1.aJp()).b(cfY.hCB);
    int i = !((dGf)paramdhJ1.aJp()).b(cfY.hCE) ? 1 : 0;
    if ((i != 0) && (paramdhJ2.b(eu.azI)) && (!bdF())) {
      paramdhJ1.d(eu.azc).gv(paramdhJ2.e(eu.azI));
    }
    if ((bool) && (paramdhJ2.b(eu.azc)))
      paramdhJ1.d(eu.azc).gv(paramdhJ2.e(eu.azc));
  }

  public boolean a(aof paramaof)
  {
    paramaof.clear();
    paramaof.dsE = this.bQD;
    paramaof.name = this.m_name;
    paramaof.dsF = this.ibV;
    paramaof.dsG = this.ibW;
    paramaof.dsH = this.ibX;
    paramaof.dsI = this.ibY;
    paramaof.btt = this.hJn;
    paramaof.direction = this.ax.m_index;
    paramaof.dsM = this.ica;
    paramaof.dsJ = this.ibZ;
    return true;
  }

  public boolean b(aof paramaof) {
    this.bQD = paramaof.dsE;
    this.m_name = paramaof.name;
    this.ibV = paramaof.dsF;
    this.ibW = paramaof.dsG;
    this.ibX = paramaof.dsH;
    this.ibY = paramaof.dsI;
    this.hJn = paramaof.btt;
    this.ax = CG.eu(paramaof.direction);
    this.ica = paramaof.dsM;
    this.ibZ = paramaof.dsJ;
    return true;
  }

  public cOB ble() {
    return cqb.abu();
  }

  public uP e(short paramShort, long paramLong) {
    short s = (short)(paramShort - this.ibY);
    long l = paramLong - this.ibX;
    this.ibY = paramShort;
    this.ibX = paramLong;
    return new uP(l, s);
  }

  public uP d(short paramShort, boolean paramBoolean) {
    return e(paramShort, this.ibX);
  }

  public long ayX() {
    return this.ibX;
  }

  public uP da(long paramLong)
  {
    if (paramLong < 0L) {
      return uP.biS;
    }
    if (paramLong == 0L) {
      return uP.biS;
    }

    this.ibX += paramLong;

    return new uP(paramLong, (short)0);
  }

  public float ayY()
  {
    if (this.ibY < ble().cF(ayX())) {
      return 0.0F;
    }

    return ble().d(nU(), ayX());
  }

  public float bsM() {
    return 1.0F;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("BasicInvocationCharacteristics");
    localStringBuilder.append("{m_breed=").append(this.ibU);
    localStringBuilder.append(", m_typeId=").append(this.bQD);
    localStringBuilder.append(", m_name='").append(this.m_name).append('\'');
    localStringBuilder.append(", m_currentHp=").append(this.ibV);
    localStringBuilder.append(", m_summonId=").append(this.ibW);
    localStringBuilder.append(", m_currentXP=").append(this.ibX);
    localStringBuilder.append(", m_cappedLevel=").append(this.ibY);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }

  public void clean() {
  }

  public int cqK() {
    if (this.ibU != null) {
      return this.ibU.anj();
    }
    return 0;
  }

  public void hu(boolean paramBoolean) {
    this.icb = paramBoolean;
  }

  public boolean bdF() {
    return this.icb;
  }
}