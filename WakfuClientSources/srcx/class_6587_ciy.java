final class ciy extends dcW
{
  public boolean a(cAP paramcAP)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<text color=\"").append(cPU.kAy).append("\">");
    switch (paramcAP.agd()) {
    case 3:
      localStringBuilder.append(bU.fH().getString("fight.invitation.cancel.anotherInvitation"));
      break;
    case 7:
      localStringBuilder.append(bU.fH().getString("fight.invitation.cancel.fightCreationImpossible"));
      break;
    case 4:
      localStringBuilder.append(bU.fH().getString("fight.invitation.cancel.initiatorCancelled"));
      break;
    case 6:
      localStringBuilder.append(bU.fH().getString("fight.invitation.cancel.initiatorNotAvailable"));
      break;
    case 5:
      localStringBuilder.append(bU.fH().getString("fight.invitation.cancel.noPendingFight"));
      break;
    case 2:
      localStringBuilder.append(bU.fH().getString("fight.invitation.cancel.playerNotFound"));
      break;
    case 1:
      localStringBuilder.append(bU.fH().getString("fight.invitation.cancel.playerRefused"));
      break;
    case 0:
      localStringBuilder.append(bU.fH().getString("fight.invitation.cancel.unknownError"));
    }

    localStringBuilder.append("</text>");
    aEe localaEe = new aEe(localStringBuilder.toString());
    localaEe.mm(4);
    CM.LV().a(localaEe);
    return false;
  }
}