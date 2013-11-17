public class aOq
{
  public static final aOq euI = new aOq();
  private cyS bgA;
  private final cSR euJ = new cSR();

  public void init()
  {
    ud localud = (ud)byv.bFN().bFO().bSt();
    this.bgA = localud.CG();

    bfa();
  }

  public void clean() {
    this.euJ.s(new bCW(this));

    this.euJ.clear();
  }

  private void bfa() {
    for (dax localdax : dax.values()) {
      cig localcig = localdax.cMJ();
      this.euJ.put(localcig.getId(), new dvQ(localcig));
    }
  }

  public dvQ nn(int paramInt) {
    return (dvQ)this.euJ.get(paramInt);
  }

  public boolean H(dGy paramdGy) {
    return this.euJ.s(paramdGy);
  }
}