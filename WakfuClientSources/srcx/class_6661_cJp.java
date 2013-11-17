class cJp
  implements dFU
{
  public boolean a(bFG parambFG)
  {
    int i = parambFG.ajL();

    String str1 = "notification.guildBonusLearnedTitle";
    String str2 = bU.fH().b(138, i, new Object[0]);
    String str3 = bU.fH().getString("notification.guildBonusLearnedText", new Object[] { str2 });

    String str4 = bU.fH().getString("notification.guildBonusLearnedTitle");
    String str5 = cda.createLink(str3, ana.dqj);
    az localaz = new az(str4, str5, ana.dqj);
    cjO.clE().j(localaz);

    String str6 = bU.fH().getString("guild.chatBonusActivated", new Object[] { str2 });
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), str6);
    localaEe.mm(4);
    CM.LV().a(localaEe);
    return false;
  }

  public int vN() {
    return 20072;
  }
}