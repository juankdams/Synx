public abstract class LE
{
  private final int aw;
  private final bcR bYp;
  private final cSi bYq = new cSi();
  private final cSi bYr = new cSi();
  private final int bYs;
  private final boolean bYt;
  private axk bYu;

  protected LE(int paramInt1, bcR parambcR, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2, boolean paramBoolean, axk paramaxk)
  {
    this.aw = paramInt1;
    this.bYp = parambcR;
    this.bYq.add(paramArrayOfInt1);
    this.bYr.add(paramArrayOfInt2);
    this.bYs = paramInt2;
    this.bYt = paramBoolean;
    this.bYu = paramaxk;
  }

  public axk Wg() {
    return this.bYu;
  }

  public int getId()
  {
    return this.aw;
  }

  public bcR Wh() {
    return this.bYp;
  }

  public cSi Wi() {
    return this.bYq;
  }

  public cSi Wj() {
    return this.bYr;
  }

  public int PY() {
    return this.bYs;
  }

  public boolean Wk() {
    return this.bYt;
  }

  public String toString() {
    return "AbstractReferenceSkill{m_id=" + this.aw + ", m_type=" + this.bYp + ", m_associatedItemTypes=" + this.bYq + ", m_associatedItems=" + this.bYr + ", m_maxLevel=" + this.bYs + ", m_innate=" + this.bYt + ", m_specificParameters=" + this.bYu + '}';
  }
}