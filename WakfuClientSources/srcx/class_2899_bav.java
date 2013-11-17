class bav extends dTY
{
  private dnE fiC;

  public bav(dnE paramdnE)
  {
    this.fiC = paramdnE;
  }

  public Object w(FF paramFF)
  {
    Object localObject = super.w(paramFF);
    if (localObject == null) {
      return null;
    }
    ((cmA)localObject).a(this.fiC);
    return localObject;
  }

  public boolean a(dTY paramdTY, FF paramFF)
  {
    if (!super.a(paramdTY, paramFF)) {
      return false;
    }
    bav localbav = (bav)paramdTY;
    return this.fiC.bm(localbav.fiC);
  }

  public boolean b(dTY paramdTY, FF paramFF)
  {
    if (!super.b(paramdTY, paramFF)) {
      return false;
    }
    bav localbav = (bav)paramdTY;
    return this.fiC.at(localbav.fiC);
  }
}