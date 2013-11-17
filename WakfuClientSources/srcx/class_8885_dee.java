import org.apache.log4j.Logger;

public class dee extends csx
{
  private dwN kYc;
  private byte kYd;

  public dee(dwN paramdwN, byte paramByte)
  {
    this.kYc = paramdwN;
    this.kYd = paramByte;
  }

  public csx qb() {
    return new dee(this.kYc, this.kYd);
  }

  public dee()
  {
  }

  public boolean pZ()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.bGK()) {
      return false;
    }

    if (localbyz.adF()) {
      return false;
    }

    if (aYP.feK.bnQ()) {
      return false;
    }

    return true;
  }

  public void run()
  {
    K.error("MRUUpgradeDimmensionalBagRoomAction.run()");
  }

  public aiI pW()
  {
    return aiI.dfF;
  }

  public String qa()
  {
    return "bagUpgrade";
  }

  protected int qc()
  {
    return coH.hWH.aw;
  }
}