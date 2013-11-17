import java.util.ArrayList;
import java.util.List;

final class dBp
  implements Kb, dEf
{
  private final List aEZ = new ArrayList();

  private final dPx lIX = new dPx();
  private final aPF lIY = new aPF();
  private final long aTz;
  private final bBn lIZ;

  dBp(long paramLong, bBn parambBn)
  {
    this.aTz = paramLong;
    this.lIZ = parambBn;
  }

  public long getId() {
    return this.aTz;
  }

  public gA bI(long paramLong) {
    return (gA)this.lIX.bf(this.lIY.er(paramLong));
  }

  public gA ag(byte paramByte) {
    return (gA)this.lIX.bf(paramByte);
  }

  public boolean d(dGy paramdGy) {
    return this.lIX.s(paramdGy);
  }

  void a(byte paramByte, gA paramgA) {
    this.lIX.c(paramByte, paramgA);
    this.lIY.c(paramgA.oj(), paramByte);
    paramgA.a(this);
    L(paramgA);
  }

  void aV(gA paramgA) {
    this.lIX.be(this.lIY.es(paramgA.oj()));
    paramgA.b(this);
    M(paramgA);
  }

  void clear() {
    this.lIX.clear();
    this.lIY.clear();
  }

  public LR UL() {
    return LR.bYM;
  }

  private void L(gA paramgA)
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((dFj)this.aEZ.get(i)).g(paramgA);
  }

  private void M(gA paramgA)
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((dFj)this.aEZ.get(i)).h(paramgA);
  }

  public boolean a(dFj paramdFj)
  {
    return (!this.aEZ.contains(paramdFj)) && (this.aEZ.add(paramdFj));
  }

  public boolean b(dFj paramdFj) {
    return this.aEZ.remove(paramdFj);
  }

  public String toString()
  {
    return "BagModel{m_id=" + this.aTz + ", m_refItem=" + this.lIZ + ", m_items=" + this.lIX.size() + '}';
  }
}