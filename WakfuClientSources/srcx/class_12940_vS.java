import java.util.ArrayList;
import java.util.List;

final class vS
  implements chG, dFj
{
  private static final dGy bkY = new bBT();

  private final List aEZ = new ArrayList();

  private final aoL bkZ = new aoL();

  vS() {
    a(new alG());
  }

  public boolean d(dGy paramdGy) {
    return this.bkZ.s(paramdGy);
  }

  public Kb aL(long paramLong) {
    return (Kb)this.bkZ.get(paramLong);
  }

  void a(Kb paramKb) {
    this.bkZ.put(paramKb.getId(), paramKb);
    paramKb.a(this);
    c(paramKb);
  }

  void b(Kb paramKb) {
    this.bkZ.remove(paramKb.getId());
    paramKb.b(this);
    d(paramKb);
  }

  void clear() {
    this.bkZ.s(bkY);
    this.bkZ.clear();
  }

  private void c(Kb paramKb)
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((dxp)this.aEZ.get(i)).e(paramKb);
  }

  private void d(Kb paramKb) {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((dxp)this.aEZ.get(i)).f(paramKb);
  }

  public void g(gA paramgA) {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((dxp)this.aEZ.get(i)).q(paramgA);
  }

  public void h(gA paramgA) {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((dxp)this.aEZ.get(i)).r(paramgA);
  }

  public boolean a(dxp paramdxp) {
    return (!this.aEZ.contains(paramdxp)) && (this.aEZ.add(paramdxp));
  }

  public boolean b(dxp paramdxp) {
    return this.aEZ.remove(paramdxp);
  }

  public String toString()
  {
    return "BagInventoryModel{, m_bags=" + this.bkZ.size() + '}';
  }
}