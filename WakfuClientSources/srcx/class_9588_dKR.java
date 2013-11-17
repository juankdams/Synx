public final class dKR
  implements baD
{
  private final bPu lZo = new bPu();
  private final aoL lZp = new aoL();

  public int a(dEv paramdEv, bcz parambcz)
  {
    if ((paramdEv == null) || (parambcz == null))
      return 0;
    short s = bCO.l(paramdEv.bJ(), parambcz.bJ());
    dRs localdRs = (dRs)this.lZo.cx(s);
    if (localdRs != null)
      return localdRs.ctb();
    return 0;
  }

  public void a(dEv paramdEv, bcz parambcz, int paramInt) {
    if ((paramdEv == null) || (parambcz == null) || (paramInt == 0))
      return;
    dRs localdRs = b(paramdEv, parambcz);
    localdRs.wT(localdRs.ctb() + paramInt);
  }

  public int a(bG parambG, int paramInt) {
    if (parambG == null)
      return 0;
    long l = bCO.cM(parambG.bJ(), paramInt);
    cuO localcuO = (cuO)this.lZp.get(l);
    if (localcuO != null)
      return localcuO.ctb();
    return 0;
  }

  public void a(bG parambG, int paramInt1, int paramInt2) {
    if ((parambG == null) || (paramInt2 == 0))
      return;
    cuO localcuO = b(parambG, paramInt1);
    localcuO.wT(localcuO.ctb() + paramInt2);
  }

  private dRs b(dEv paramdEv, bcz parambcz) {
    short s = bCO.l(paramdEv.bJ(), parambcz.bJ());
    dRs localdRs = (dRs)this.lZo.cx(s);
    if (localdRs == null) {
      localdRs = c(paramdEv, parambcz);
    }
    return localdRs;
  }

  private cuO b(bG parambG, int paramInt) {
    long l = bCO.cM(parambG.bJ(), paramInt);
    cuO localcuO = (cuO)this.lZp.get(l);
    if (localcuO == null) {
      localcuO = b(paramInt, parambG);
    }
    return localcuO;
  }

  private dRs c(dEv paramdEv, bcz parambcz)
  {
    short s = bCO.l(paramdEv.bJ(), parambcz.bJ());
    dRs localdRs = (dRs)this.lZo.cx(s);
    if (localdRs != null) {
      return localdRs;
    }
    localdRs = new dRs(paramdEv, parambcz);
    this.lZo.c(s, localdRs);
    return localdRs;
  }

  private cuO b(int paramInt, bG parambG)
  {
    long l = bCO.cM(parambG.bJ(), paramInt);
    cuO localcuO = (cuO)this.lZp.get(l);
    if (localcuO != null) {
      return localcuO;
    }
    localcuO = new cuO();
    this.lZp.put(l, localcuO);
    return localcuO;
  }

  public void reset() {
    this.lZo.clear();
    this.lZp.clear();
  }
}