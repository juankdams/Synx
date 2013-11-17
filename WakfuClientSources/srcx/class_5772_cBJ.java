import org.apache.log4j.Logger;

public class cBJ
{
  public static final String PACKAGE = "wakfu.partyList";
  private static final Logger K = Logger.getLogger(cBJ.class);

  public static boolean ekb = true;

  public static void deleteMember(cSx paramcSx, dUc paramdUc)
  {
    bzu localbzu = new bzu();
    localbzu.d(19030);
    localbzu.c(paramdUc.getId());
    cjO.clE().j(localbzu);
  }

  public static void setFollowedMember(dbi paramdbi, dUc paramdUc) {
    bzu localbzu = new bzu();
    localbzu.d(19031);
    localbzu.c(paramdUc.getId());
    localbzu.c(((br)paramdbi.cIk()).getSelected());
    cjO.clE().j(localbzu);
  }

  public static void addMember(cSx paramcSx, aTp paramaTp) {
    if ((paramcSx.mp() == CH.bGw) || ((paramcSx.mp() == CH.bGh) && (((ctH)paramcSx).getKeyCode() == 10))) {
      String str = paramaTp.getText();
      if (str != null) {
        bzu localbzu = new bzu();
        localbzu.d(19032);
        localbzu.a(paramaTp.getText());
        cjO.clE().j(localbzu);
        paramaTp.setText("");
      }
    }
  }

  public static void onPlayerClick(dMr paramdMr, dUc paramdUc) {
    if (paramdMr.getButton() != 3) {
      return;
    }
    byz localbyz = byv.bFN().bFO();

    if (paramdUc.getId() == localbyz.getId()) {
      return;
    }

    cxO localcxO = cBQ.cxL().cxY();
    localcxO.setHotSpotPosition(aFG.ecj);

    aay localaay = paramdUc.dum();
    localcxO.a(localaay.getName(), null);

    if (localbyz.bHj().Ta().Ph() == localbyz.getId())
    {
      localcxO.a(bU.fH().getString("party.deleteMember"), null, new clU(paramdUc), !((bgo)localaay.dhK()).cRB());
    }

    int i = dmY.cUs().cUu().ky(localaay.adv()) != null ? 1 : 0;
    if (i == 0) {
      localcxO.a(bU.fH().getString("chat.addToFriendList"), null, new clX(localaay), true);
    }

    boolean bool = Dj.My().y(0, localaay.eq());
    if (bool)
    {
      localcxO.a(bU.fH().getString("group.party.unFollowMember"), null, new clW(localaay), localaay.Lk() == localbyz.Lk());
    }
    else
    {
      localcxO.a(bU.fH().getString("group.party.followMember"), null, new clY(localaay), localaay.Lk() == localbyz.Lk());
    }

    cBQ.cxL().a(localcxO, cyb.cvg().getX() + 20, cyb.cvg().getY());
  }

  public static void openInviteDialog(cSx paramcSx)
  {
    cBQ.cxL().a("partyListInviteDialog", VV.dJ("partyListInviteDialog"), 257L, (short)10000);
  }

  public static void invite(cSx paramcSx, aTp paramaTp)
  {
    String str = paramaTp.getText();
    if (str != null) {
      byv.bFN().bFO().bHj().ch(str);
    }

    cBQ.cxL().mW("partyListInviteDialog");
  }

  public static void leaveParty(cSx paramcSx) {
    bzu localbzu = new bzu();
    localbzu.d(19030);
    localbzu.c(byv.bFN().bFO().getId());
    cjO.clE().j(localbzu);
  }

  public static void minimizeMaximizeDialog(cSx paramcSx, dRq paramdRq, czv paramczv)
  {
    ekb = !ekb;

    paramdRq.setVisible(ekb);
    paramczv.setStyle(ekb ? "yellowLeftArrow" : "yellowRightArrow");
  }
}