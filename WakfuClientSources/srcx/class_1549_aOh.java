public class aOh extends afn
{
  private final bHu euB;
  private boolean euC = false;

  public aOh(int paramInt, bHu parambHu) {
    super(paramInt, null, null, null);
    this.euB = parambHu;
    loadChildren();
  }

  public short aqT()
  {
    if (!this.euC) {
      dUx localdUx = bDk.bLI().cr((short)getId());
      as((short)(localdUx != null ? localdUx.cYh : 0));
      this.euC = true;
    }

    return super.aqT();
  }

  private void loadChildren() {
    int i = 0; for (int j = this.euB.size(); i < j; i++) {
      short s = this.euB.get(i);
      dUx localdUx = bDk.bLI().cr(s);
      Dg localDg = b(localdUx);
      a(new azm(localDg, s));
    }
  }

  public bNa aqU()
  {
    return bNa.gRx;
  }

  private static Dg b(dUx paramdUx)
  {
    dmn localdmn = paramdUx.duz();
    Dg localDg = new Dg();
    while (localdmn.hasNext()) {
      localdmn.fl();
      bva localbva = (bva)localdmn.value();
      localDg.a(localbva.bCL());
    }
    return localDg;
  }
}