public class crI
{
  private final int[] ibb;
  private final boolean[] ibc;

  public crI()
  {
    int i = eu.lE() + 1;

    this.ibb = new int[i];
    this.ibc = new boolean[i];

    for (eu localeu : eu.values())
      a(localeu, localeu.getDefaultValue());
  }

  public int h(dSc paramdSc) {
    return this.ibb[paramdSc.bJ()];
  }

  public void a(dSc paramdSc, int paramInt) {
    this.ibb[paramdSc.bJ()] = paramInt;
    this.ibc[paramdSc.bJ()] = true;
  }

  public boolean c(dSc paramdSc) {
    return this.ibc[paramdSc.bJ()];
  }
}