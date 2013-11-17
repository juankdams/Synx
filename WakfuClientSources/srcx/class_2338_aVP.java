import com.ankamagames.wakfu.client.WakfuClientInstance;

public class aVP extends aLl
{
  public aVP(bva parambva)
  {
    super(parambva);
  }

  public void hF() {
    super.hF();

    if (this.deh == byv.bFN().bFO().bHn()) {
      dO.hI().k(true);
      aWc.blo().b(new azB(TE.cwJ));
    } else {
      aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
      anK.a(localaWe, dAf.lGN);
    }
  }

  public void bcL() {
    super.bcL();

    if (this.deh == byv.bFN().bFO().bHn()) {
      aWc.blo().b(new azB(TE.cwK));
    }
    dO.hI().k(false);
  }
}