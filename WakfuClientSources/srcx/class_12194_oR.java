import org.apache.log4j.Logger;

class oR
  implements dFU
{
  public boolean a(cVu paramcVu)
  {
    cbd localcbd = paramcVu.cKe();
    if (localcbd == null) {
      sH.K.error("Message d'erreur de guilde inconnu !!!");
      return false;
    }
    String str = null;
    switch (dvG.lAU[localcbd.ordinal()]) {
    case 1:
      str = bU.fH().getString("error.guild.creation");
      break;
    case 2:
      str = bU.fH().getString("error.guild.alreadyInGuild");
      byv.bFN().b(dKb.djg());
      break;
    case 3:
      str = bU.fH().getString("group.error.unknown_user");
      break;
    case 4:
      str = bU.fH().getString("error.guild.creation.existingBlazon");
      break;
    case 5:
      str = bU.fH().getString("group.error.invitationPending");
      break;
    case 6:
      str = bU.fH().getString("guild.error.user.already.in.guild");
      break;
    case 7:
      str = bU.fH().getString("error.guild.creation.existingName");
      break;
    case 8:
      str = bU.fH().getString("error.guild.creation.invalidName");
    }

    if (str == null) {
      sH.K.error("Message d'erreur de guilde non traité : " + localcbd.name());
      return false;
    }

    aEe localaEe = new aEe(str);
    localaEe.mm(3);
    CM.LV().a(localaEe);
    return false;
  }

  public int vN() {
    return 20059;
  }
}