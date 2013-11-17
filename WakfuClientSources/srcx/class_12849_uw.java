public class uw
  implements dGy
{
  private final int aGs;
  private int aHm;

  public uw(int paramInt)
  {
    this.aGs = paramInt;
    this.aHm = 0;
  }

  public boolean a(aXL paramaXL) {
    bOB localbOB = ars.dzL.aO(paramaXL.adj().bVJ());
    if (aDF.g(paramaXL.adj()) != aAb.dSs) {
      return true;
    }
    int i = localbOB.aTy();
    if ((dxA.eY(i, this.aGs)) || (i == this.aGs)) {
      this.aHm += 1;
    }
    return true;
  }

  public int getCount() {
    return this.aHm;
  }
}