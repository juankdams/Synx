class abO
  implements dFU
{
  public boolean a(bat parambat)
  {
    buI.bCs().bCA();
    String str2;
    if (parambat.ajL() != -1) {
      String str1 = bU.fH().getString("notification.arcadeDungeonBonusTitle");
      str2 = bU.fH().getString("notification.arcadeDungeonBonusText", new Object[] { aqx.dyc.jB(parambat.ajL()) });
      cjO.clE().j(new az(str1, str2, ana.dqk));
    }
    int i = parambat.wx();
    if (i != -1) {
      str2 = bU.fH().getString("notification.arcadeDungeonEventTitle");
      String str3 = bU.fH().getString("notification.arcadeDungeonEventText", new Object[] { aqx.dyc.jz(i) });
      cjO.clE().j(new az(str2, str3, ana.dqk));

      buI.bCs().iR(aqx.dyc.jA(i));
    }

    return false;
  }

  public int vN() {
    return 15954;
  }
}