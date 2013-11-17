import java.util.ArrayList;

class sp
  implements dFU
{
  public boolean a(anq paramanq)
  {
    if (paramanq.IR())
    {
      byv.bFN().b(acp.cRI);
      byz localbyz = byv.bFN().bFO();

      localbyz.cQN();
      localbyz.auK().ajy();
      localbyz.auK().c(paramanq.azY());
      localbyz.bSs().initialize();

      localbyz.c(localbyz.bGq());
      ArrayList localArrayList = localbyz.bGD().ka(false);
      for (bJz localbJz : localArrayList)
      {
        localbJz.clean();
      }
      localbyz.bGi();
      localbyz.f(localbyz.bEY());
    }
    else
    {
      cBQ.cxL().a(bU.fH().getString("notification.restatSpellsFail"), Cn.et(1), 3L, 102, 1);
    }

    return false;
  }

  public int vN() {
    return 13202;
  }
}