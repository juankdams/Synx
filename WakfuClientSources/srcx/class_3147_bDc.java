import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.debug.FlyingImageCommand;
import java.util.HashSet;

public class bDc
  implements Runnable
{
  public bDc(FlyingImageCommand paramFlyingImageCommand)
  {
  }

  public void run()
  {
    dOc localdOc = (dOc)cBQ.cxL().coO().nf("minimapDialog").fi("window");

    if (localdOc == null) {
      return;
    }

    cew localcew = byv.bFN().bFO().aeL();

    dCy localdCy = new dCy(WakfuClientInstance.awy().Dg(), new vJ(localdOc));

    bVl localbVl = bVl.caZ();

    doc localdoc = new doc(ay.bd().a("challengeFlyingImagePath", "defaultIconPath", new Object[] { "challengeProposal" }), 32, 32, localdCy, 2000);
    localdoc.a(localcew);

    HashSet localHashSet = dbI.cNt().b(localcew);
    localdoc.pu((localHashSet != null ? localHashSet.size() : 0) * 600);
    dbI.cNt().a(localdoc);
  }
}