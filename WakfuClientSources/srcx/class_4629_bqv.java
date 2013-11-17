import java.util.ArrayList;

final class bqv
  implements bqd
{
  private final ArrayList aBf = new ArrayList();
  private final int bJP;
  private final cYq cQH = new cYq(cYq.kLU);
  private final cYq fLK = new cYq(cYq.kLU);

  bqv(int paramInt) {
    this.bJP = paramInt;
  }

  public int ajL() {
    return this.bJP;
  }

  public dxL byZ() {
    return this.cQH;
  }

  public dxL bza() {
    return this.fLK;
  }

  void G(dxL paramdxL) {
    this.cQH.P(paramdxL);
  }

  void H(dxL paramdxL)
  {
    this.fLK.P(paramdxL);
    bzA();
  }

  private void bzA()
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((YQ)this.aBf.get(i)).c(this);
  }

  public boolean a(YQ paramYQ)
  {
    return (!this.aBf.contains(paramYQ)) && (this.aBf.add(paramYQ));
  }

  public boolean b(YQ paramYQ) {
    return this.aBf.remove(paramYQ);
  }

  public String toString()
  {
    return "GuildBonusModel{m_activationDate=" + this.fLK + ", m_bonusId=" + this.bJP + ", m_buyDate=" + this.cQH + '}';
  }
}