public class ctG
  implements adL
{
  public static final ctG idQ = new ctG();
  private final dJJ bMC;
  private final bDr bMD;

  private ctG()
  {
    this.bMC = Hh.QM();
    this.bMD = Hh.QM();
  }

  ctG(dJJ paramdJJ, bDr parambDr) {
    this.bMC = paramdJJ;
    this.bMD = parambDr;
  }

  public dGD a(eo parameo)
  {
    dGD localdGD = crg();
    return parameo.j(localdGD) ? localdGD : null;
  }

  public gA c(dGD paramdGD)
  {
    gA localgA = QN();
    return localgA.b(paramdGD) ? localgA : null;
  }

  public gA QN() {
    return this.bMC.QN();
  }

  public dGD crg() {
    return this.bMD.QO();
  }

  public String toString()
  {
    return "GuildStorageBoxContentProvider{m_itemProvider=" + this.bMC.getClass().getName() + ", m_rawItemProvider=" + this.bMD.getClass().getName() + '}';
  }
}