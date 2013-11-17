public class bmV extends ciH
{
  public bmV()
  {
    this(null);
  }

  public bmV(ciA paramciA) {
    super(axA.SIZE);
    d(paramciA);
  }

  public void d(ciA paramciA) {
    sF().a(0L, paramciA != null ? paramciA.sF() : null);
  }

  public ciA bxv() {
    axA localaxA = sF().bX(0L);
    if (localaxA == null)
      return null;
    if (auL.dHJ.sF().equals(localaxA))
      return (ciA)auL.dHJ;
    ciA localciA = new ciA();
    localciA.m(localaxA);
    return localciA;
  }
}