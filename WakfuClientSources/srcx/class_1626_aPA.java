public class aPA
  implements dGy
{
  private final short eMk;
  private int aHm;

  public aPA(short paramShort)
  {
    this.eMk = bp(paramShort);
  }

  public boolean a(aXL paramaXL) {
    if (this.eMk == bp(paramaXL.adj().nc())) {
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