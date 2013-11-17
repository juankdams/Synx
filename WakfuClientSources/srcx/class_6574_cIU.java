import java.util.Collection;

public final class cIU
{
  final aLn iGW;

  public cIU(aLn paramaLn)
  {
    this.iGW = paramaLn;
  }

  public void execute() {
    ckT localckT = cjS.clP().vz(this.iGW.a());

    if (!(localckT instanceof czN)) {
      return;
    }
    czN localczN = (czN)localckT;

    byv localbyv = byv.bFN();

    if (localbyv.c(acp.cRI)) {
      return;
    }
    byz localbyz = localbyv.bFO();

    if (!bGP.gDx.a(new aGH[] { localbyz })) {
      return;
    }
    Jl localJl = localbyz.bHj();
    if (!localJl.Td()) {
      return;
    }
    Fs localFs = localJl.Ta();

    for (Su localSu : localczN.bgG())
      if ((localFs.N(localSu.getId())) && (a(localczN, localSu)))
        break;
  }

  private boolean a(czN paramczN, Su paramSu)
  {
    fe localfe = bSh.b(paramczN, paramSu);

    if (localfe.mb() != 0) {
      be(paramSu);
      return false;
    }

    if (localfe.md()) {
      i(paramczN);
      return true;
    }

    String str1 = bU.fH().getString("party.question.joinPartyMemberInFight", new Object[] { String.format("<b>%s</b>", new Object[] { paramSu.getName() }) });

    cOv localcOv = new cOv();
    localcOv.Q(paramSu);
    String str2 = localcOv.Eu();
    if (str2 != null)
      str1 = str1 + "\n" + str2;
    localcOv = null;
    cKX localcKX = cBQ.cxL().a(str1, Cn.et(5), 2073L, 102, 1);

    paramczN.d(localcKX);

    localcKX.a(new aZE(this, paramczN, localcKX, localfe, paramSu));

    return true;
  }

  private void i(czN paramczN) {
    Collection localCollection = paramczN.bgG();
    for (Su localSu : localCollection)
      if ((localSu.getType() == 1) && ((localSu instanceof byo)))
      {
        byo localbyo = (byo)localSu;

        ayn localayn = localbyo.FB();
        if (localayn != null)
        {
          bGx localbGx = new bGx(localayn.getId());
          byv.bFN().aJK().d(localbGx);
          return;
        }
      }
  }

  private void be(Su paramSu) { String str = bU.fH().getString("party.notice.partyMemberJoinFight", new Object[] { paramSu.getName() });
    aEe localaEe = new aEe(str);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }
}