public class ajZ
{
  private final bBg djP;
  private final short djQ;
  private dFu djR = new dFu();

  public ajZ(bBg parambBg, short paramShort) {
    this.djP = parambBg;
    this.djQ = paramShort;
    Qk();
  }

  private void Qk() {
    cUh localcUh = ars.dzL.aM(this.djQ);
    bOB localbOB = ars.dzL.aO(localcUh.bVJ());
    localbOB.N(new cXw(this));
  }

  private int a(acl paramacl)
  {
    uw localuw = new uw(paramacl.aot());
    this.djP.o(localuw);
    return bCO.a(0, paramacl.ajS() - localuw.getCount(), new int[0]);
  }

  public boolean a(dsW paramdsW) {
    return this.djR.b(paramdsW);
  }

  public boolean axm() {
    return !this.djR.isEmpty();
  }
}