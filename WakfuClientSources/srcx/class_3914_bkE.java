public class bkE extends csx
{
  public csx qb()
  {
    return new bkE();
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof bKm)) {
      return false;
    }

    dwN localdwN = byv.bFN().bFO().bHa();
    byz localbyz = byv.bFN().bFO();

    if (localdwN == null) {
      return false;
    }
    if (localdwN.sN() != byv.bFN().bFO().getId()) {
      return false;
    }
    if (localbyz.bGK()) {
      return false;
    }
    if (localbyz.adF()) {
      return false;
    }
    return true;
  }

  public void run()
  {
    bKm localbKm = (bKm)this.dvI;
    aU localaU = new aU();
    localaU.g(localbKm.getId());
    byv.bFN().aJK().d(localaU);
  }

  public aiI pW()
  {
    return aiI.dfz;
  }

  public String qa()
  {
    return "kick";
  }

  protected int qc()
  {
    return coH.hWt.aw;
  }
}