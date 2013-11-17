public class Fj
  implements adL
{
  public static final Fj bMB = new Fj();
  private final dJJ bMC;
  private final bDr bMD;

  private Fj()
  {
    this.bMC = Hh.QM();
    this.bMD = Hh.QM();
  }

  public gA c(dGD paramdGD)
  {
    gA localgA = this.bMC.QN();
    return localgA.b(paramdGD) ? localgA : null;
  }

  public String toString()
  {
    return "StorageBoxContentProvider{m_itemProvider=" + this.bMC.getClass().getName() + ", m_rawItemProvider=" + this.bMD.getClass().getName() + '}';
  }
}