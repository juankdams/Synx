public class cbp
{
  public static final cbp hsN = new cbp();

  private final cSR ddr = new cSR();
  private final adz hsO = new adz();

  public void a(cym paramcym) {
    int i = paramcym.getId();
    this.ddr.put(i, paramcym);

    if (paramcym.Wk())
      this.hsO.hL(i);
  }

  public cym ut(int paramInt)
  {
    return (cym)this.ddr.get(paramInt);
  }

  public boolean uu(int paramInt) {
    cym localcym = ut(paramInt);
    return (localcym == null) || (localcym.cvm());
  }

  public boolean uv(int paramInt) {
    cym localcym = ut(paramInt);
    return (localcym == null) || (localcym.cvn());
  }

  public short uw(int paramInt) {
    cym localcym = ut(paramInt);
    return localcym != null ? localcym.cvo() : -1;
  }

  public boolean ux(int paramInt) {
    return this.ddr.contains(paramInt);
  }

  public adz cfa() {
    return this.hsO;
  }
}