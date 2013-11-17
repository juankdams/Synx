public class aYt
{
  private final int aw;
  private final int ceP;
  private final DJ fep = new DJ(1);
  private final int feq;
  private final DJ fer = new DJ(1);
  private final int fes;
  private final bZA aB;

  public aYt(int paramInt1, int paramInt2, int paramInt3, bZA parambZA, int paramInt4)
  {
    this.aw = paramInt1;
    this.feq = paramInt2;
    this.fes = paramInt3;
    this.aB = parambZA;
    this.ceP = paramInt4;
  }

  public void q(int paramInt, short paramShort) {
    if (this.fep.contains(paramInt))
      throw new IllegalArgumentException("Une définition de l'item " + paramInt + " existe déjà");
    this.fep.i(paramInt, paramShort);
  }

  public void r(int paramInt, short paramShort) {
    if (this.fer.contains(paramInt))
      throw new IllegalArgumentException("Une définition de l'item " + paramInt + " existe déjà");
    this.fer.i(paramInt, paramShort);
  }

  public boolean c(aGQ paramaGQ) {
    for (int i = 0; i < this.fep.size(); i++) {
      if (!paramaGQ.k(this.fep.uM(i), this.fep.eF(i)))
        return false;
    }
    return true;
  }

  public int bnM() {
    return this.feq;
  }

  public boolean d(aGQ paramaGQ) {
    for (int i = 0; i < this.fer.size(); i++) {
      if (!paramaGQ.k(this.fer.uM(i), this.fer.eF(i)))
        return false;
    }
    return true;
  }

  public int bnN() {
    return this.fes;
  }

  public bZA F() {
    return this.aB;
  }

  public int getId() {
    return this.aw;
  }

  public int getOrder() {
    return this.ceP;
  }

  public String toString()
  {
    return "Exchange{m_id=" + this.aw + '}';
  }
}