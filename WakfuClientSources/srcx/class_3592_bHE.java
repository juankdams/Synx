public class bHE
  implements dGy
{
  private final short eMk;
  private int aHm;

  public bHE(short paramShort)
  {
    this.eMk = bp(paramShort);
  }

  public boolean c(cuF paramcuF) {
    if (this.eMk == bp(paramcuF.adj().nc())) {
      this.aHm += 1;
    }
    return true;
  }

  private short bp(short paramShort) {
    short s = paramShort;
    dAi localdAi = ars.dzL.aN(paramShort);
    while (localdAi != null) {
      s = localdAi.ddx();
      localdAi = ars.dzL.aN(localdAi.ddx());
    }

    return s;
  }

  public int getCount() {
    return this.aHm;
  }
}