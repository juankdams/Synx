public class dEu
{
  private int bJP;
  private final cYq cQH = new cYq(cYq.kLU);
  private final cYq fLK = new cYq(cYq.kLU);

  public dEu CC(int paramInt)
  {
    this.bJP = paramInt;
    return this;
  }

  public dEu Z(dxL paramdxL) {
    this.cQH.P(paramdxL);
    return this;
  }

  public dEu aa(dxL paramdxL) {
    this.fLK.P(paramdxL);
    return this;
  }

  public bqd dgd() {
    bqv localbqv = new bqv(this.bJP);
    localbqv.G(this.cQH);
    localbqv.H(this.fLK);
    return localbqv;
  }

  public String toString()
  {
    return "GuildBonusBuilder{m_bonusId=" + this.bJP + ", m_buyDate=" + this.cQH + ", m_activationDate=" + this.fLK + '}';
  }
}