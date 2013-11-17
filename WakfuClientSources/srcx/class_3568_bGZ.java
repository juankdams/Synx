public class bGZ
{
  private final int aw;
  private final int bVd;
  private final int aHf;
  private final int gEg;
  private final int gEh;
  private final int Sk;
  private final int gEi;
  private final cWE gEj;
  private final bZA aB;

  protected bGZ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, bZA parambZA, int paramInt7, cWE paramcWE)
  {
    this.aw = paramInt1;
    this.aHf = paramInt2;
    this.gEg = paramInt3;
    this.gEh = paramInt4;
    this.Sk = paramInt6;
    this.aB = parambZA;
    this.gEi = paramInt5;
    this.bVd = paramInt7;
    this.gEj = paramcWE;
  }

  public int getId() {
    return this.aw;
  }

  public int gC() {
    return this.Sk;
  }

  public bZA F() {
    return this.aB;
  }

  public int bOG() {
    return this.gEh;
  }

  public int bOH() {
    return this.gEg;
  }

  public int axX() {
    return this.aHf;
  }

  public int bOI() {
    return this.gEi;
  }

  public int Ur() {
    return this.bVd;
  }

  public boolean bOJ() {
    return (this.bVd == 0) || (this.bVd == 16);
  }

  public cWE bOK()
  {
    return this.gEj;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AbstractCollectAction");
    localStringBuilder.append("{m_id=").append(this.aw);
    localStringBuilder.append(", m_craftId=").append(this.aHf);
    localStringBuilder.append(", m_levelMin=").append(this.gEg);
    localStringBuilder.append(", m_nbPlayerMin=").append(this.gEh);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}