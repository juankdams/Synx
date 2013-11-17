public class FS extends ciH
{
  public FS()
  {
    this(null);
  }

  public FS(dNQ paramdNQ) {
    super(axA.SIZE);
    a(paramdNQ);
  }

  public void a(dNQ paramdNQ) {
    sF().a(0L, paramdNQ != null ? paramdNQ.sF() : null);
  }

  public dNQ Qa() {
    axA localaxA = sF().bX(0L);
    if (localaxA == null) {
      return null;
    }
    if (auL.dHJ.sF().equals(localaxA)) {
      return auL.dHJ;
    }
    dNQ localdNQ = new dNQ();
    localdNQ.m(localaxA);
    return localdNQ;
  }
}