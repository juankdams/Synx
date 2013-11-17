public final class cWD extends pv
{
  public aiI pW()
  {
    return aiI.dgs;
  }

  protected void wR()
  {
    rb localrb = (rb)this.dvI;
    oj.vO().a(localrb);
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof rb)) {
      return false;
    }
    cMb localcMb = (cMb)this.dvI;
    byz localbyz = byv.bFN().bFO();
    long l = localcMb.abI().sN();
    if (l == localbyz.getId()) {
      return true;
    }

    return deV.jF(l);
  }

  public String qa()
  {
    return "manageEquipableDummy";
  }

  public csx qb()
  {
    return new cWD();
  }

  protected int qc()
  {
    return coH.hWw.aw;
  }
}