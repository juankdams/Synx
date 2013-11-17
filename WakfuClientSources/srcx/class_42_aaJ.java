public abstract class aaJ
  implements cvW
{
  protected String cOZ;
  private bnm N;
  protected cSR cPa = new cSR();

  public boolean a(cWG paramcWG) {
    paramcWG.getId();

    return true;
  }

  protected void a(dxY paramdxY, String paramString, int paramInt) {
    short s = paramdxY.bEu();
    String str = am(s);
    if (cBQ.cxL().mZ(str)) {
      cBQ.cxL().mW(str);
    } else {
      cBQ.cxL().a(str, VV.dJ("stateDetailDialog"), this.cOZ == null ? paramString : this.cOZ, paramString, "stateDetailDialog", 1L, (short)10000);

      this.cOZ = str;
      if (paramInt != -1) {
        cSR localcSR = (cSR)this.cPa.get(paramInt);
        if (localcSR == null) {
          localcSR = new cSR();
          this.cPa.put(paramInt, localcSR);
        }

        if (!localcSR.containsKey(s)) {
          localcSR.put(s, paramdxY);
        }
      }
      dLE.doY().a("describedState", paramdxY, str);
      dLE.doY().a("describedStateLevel", Short.valueOf(paramdxY.nU()), str);
    }
  }

  public void anx()
  {
    this.cPa.clear();
  }

  protected String am(short paramShort) {
    return MK() + paramShort;
  }

  protected abstract String MK();

  public abstract void k(int paramInt1, int paramInt2, short paramShort);

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.N = new cia(this);

      cBQ.cxL().a(this.N);
      cBQ.cxL().j("wakfu.stateDetails", cyX.class);
    }
  }

  private void an(short paramShort) {
    for (dmn localdmn = this.cPa.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ((cSR)localdmn.value()).remove(paramShort);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);
      anx();
    }
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}