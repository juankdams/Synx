public class dwn
{
  private float kIw;
  private float kIx;
  private float lBv;
  private float lBw;
  private float lBx;
  private float lBy;
  private String m_name;
  private boolean haJ;
  private boolean lBz;
  private boolean lBA;
  private boolean aYZ = true;
  private boolean lBB;
  private boolean lBC;
  private Object aOd;
  private avz lBD;
  private avz lBE;
  private avz lBF;
  private String ftS;
  private float[] bRQ;

  public dwn(float paramFloat1, float paramFloat2, float paramFloat3, String paramString, avz paramavz, float[] paramArrayOfFloat)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramString, null, paramavz, paramArrayOfFloat);
  }

  public dwn(float paramFloat1, float paramFloat2, float paramFloat3, String paramString, Object paramObject, avz paramavz, float[] paramArrayOfFloat) {
    this(paramFloat1, paramFloat2, paramFloat3, paramString, paramObject, paramavz, paramArrayOfFloat, false, false);
  }

  public dwn(float paramFloat1, float paramFloat2, float paramFloat3, String paramString1, Object paramObject, avz paramavz, String paramString2, float[] paramArrayOfFloat) {
    this(paramFloat1, paramFloat2, paramFloat3, paramString1, paramObject, paramavz, null, paramString2, paramArrayOfFloat, false, false);
  }

  public dwn(float paramFloat1, float paramFloat2, float paramFloat3, String paramString, Object paramObject, avz paramavz, float[] paramArrayOfFloat, boolean paramBoolean1, boolean paramBoolean2) {
    this(paramFloat1, paramFloat2, paramFloat3, paramString, paramObject, paramavz, null, paramArrayOfFloat, paramBoolean1, paramBoolean2);
  }

  public dwn(float paramFloat1, float paramFloat2, float paramFloat3, String paramString, Object paramObject, avz paramavz1, avz paramavz2, float[] paramArrayOfFloat, boolean paramBoolean1, boolean paramBoolean2) {
    this(paramFloat1, paramFloat2, paramFloat3, paramString, paramObject, paramavz1, paramavz2, null, paramArrayOfFloat, paramBoolean1, paramBoolean2);
  }

  public dwn(float paramFloat1, float paramFloat2, float paramFloat3, String paramString1, Object paramObject, avz paramavz1, avz paramavz2, String paramString2, float[] paramArrayOfFloat, boolean paramBoolean1, boolean paramBoolean2) {
    this.kIw = paramFloat1;
    this.kIx = paramFloat2;
    this.lBv = paramFloat3;
    this.lBw = paramFloat1;
    this.lBx = paramFloat2;
    this.lBy = paramFloat3;
    this.m_name = paramString1;
    this.aOd = paramObject;
    this.lBD = paramavz1;
    this.lBE = paramavz2;
    this.ftS = paramString2;
    this.bRQ = paramArrayOfFloat;
    this.haJ = paramBoolean1;
    this.lBz = paramBoolean2;
  }

  public float cKl() {
    return this.kIw;
  }

  public void cU(float paramFloat) {
    this.kIw = paramFloat;
  }

  public float cKm() {
    return this.kIx;
  }

  public void cV(float paramFloat) {
    this.kIx = paramFloat;
  }

  public float dbr() {
    return this.lBv;
  }

  public void dq(float paramFloat) {
    this.lBv = paramFloat;
  }

  public String getName() {
    if (this.m_name != null) {
      return this.m_name;
    }
    return null;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public avz dbs() {
    return this.lBD;
  }

  public avz dbt() {
    return this.lBE;
  }

  public avz dbu() {
    return this.lBF;
  }

  public void a(avz paramavz) {
    this.lBD = paramavz;
  }

  public void b(avz paramavz) {
    this.lBE = paramavz;
  }

  public void c(avz paramavz) {
    this.lBF = paramavz;
  }

  public float[] ckE() {
    return this.bRQ;
  }

  public void g(float[] paramArrayOfFloat) {
    this.bRQ = paramArrayOfFloat;
  }

  public Object getValue()
  {
    return this.aOd;
  }

  public void setValue(Object paramObject) {
    this.aOd = paramObject;
  }

  public float dbv() {
    return this.lBx;
  }

  public float dbw() {
    return this.lBw;
  }

  public float dbx() {
    return this.lBy;
  }

  public void B(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.lBw = paramFloat1;
    this.lBx = paramFloat2;
    this.lBy = paramFloat3;
  }

  public boolean isEditable() {
    return this.haJ;
  }

  public void setEditable(boolean paramBoolean) {
    this.haJ = paramBoolean;
  }

  public void kH(boolean paramBoolean) {
    this.lBz = paramBoolean;
  }

  public boolean dby() {
    return this.lBz;
  }

  public boolean dbz() {
    return this.lBA;
  }

  public void kI(boolean paramBoolean) {
    this.lBA = paramBoolean;
  }

  public boolean dbA() {
    return this.lBB;
  }

  public void kJ(boolean paramBoolean) {
    this.lBB = paramBoolean;
  }

  public boolean dbB() {
    return this.lBC;
  }

  public void kK(boolean paramBoolean) {
    this.lBC = paramBoolean;
  }

  public String getParticlePath() {
    return this.ftS;
  }

  public void setParticlePath(String paramString) {
    this.ftS = paramString;
  }

  public boolean isVisible() {
    return this.aYZ;
  }

  public void setVisible(boolean paramBoolean) {
    this.aYZ = paramBoolean;
  }

  public boolean dr(float paramFloat)
  {
    return (Math.abs(this.lBw - this.kIw) >= paramFloat) || (Math.abs(this.lBx - this.kIx) >= paramFloat);
  }
}