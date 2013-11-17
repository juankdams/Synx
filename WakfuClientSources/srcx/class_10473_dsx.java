public class dsx
  implements dGy
{
  private final int aGs;
  private int aHm;

  public dsx(int paramInt)
  {
    this.aGs = paramInt;
    this.aHm = 0;
  }

  public boolean c(cuF paramcuF) {
    bOB localbOB = ars.dzL.aO(paramcuF.adj().bVJ());
    if (aDF.g(paramcuF.adj()) != aAb.dSs) {
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