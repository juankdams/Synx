public final class cig
{
  private final int aw;
  private final cds hGS;
  private final cds hGT;
  private final int aJA;
  private final aRH hGU;
  private final cI hGV;

  public cig(int paramInt1, long paramLong1, long paramLong2, int paramInt2, aRH paramaRH, cI paramcI)
  {
    this.aw = paramInt1;
    this.hGS = kb.J(paramLong1);
    this.hGT = kb.J(paramLong2);
    this.aJA = paramInt2;
    this.hGU = paramaRH;
    this.hGV = paramcI;
  }

  public int getId() {
    return this.aw;
  }

  public cds cjW() {
    return this.hGS;
  }

  public boolean cjX() {
    return cjW().rN();
  }

  public cds cjY() {
    return this.hGT;
  }

  public boolean bkM() {
    return cjY().rN();
  }

  public aRH cjZ() {
    return this.hGU;
  }

  public int qW() {
    return this.aJA;
  }

  public cI cka() {
    return this.hGV;
  }

  public String toString()
  {
    return "GuildBonusDefinition{m_id=" + this.aw + ", m_learningDuration=" + this.hGS + ", m_duration=" + this.hGT + ", m_cost=" + this.aJA + ", m_effect=" + this.hGU + ", m_type=" + this.hGV + '}';
  }
}