public class oQ
  implements dFU
{
  public boolean b(cWG paramcWG)
  {
    sP localsP = (sP)dLE.doY().rv("selectedGuildRank");
    if (localsP == null) {
      return false;
    }

    String str = localsP.getName();
    if ((!str.equals(dqB.cXD().jX(localsP.getId()).getName())) && (!aiN.avC().eA(str))) {
      NW localNW = new NW(102, 0, bU.fH().getString("error.guild.rank.invalidName"), 2L);
      localNW.cT(Cn.et(1));
      Hm.QP().a(localNW);
      return false;
    }

    dqB.cXD().a(localsP);
    dLE.doY().t("rankModificationDirty", Boolean.valueOf(false));
    return false;
  }

  public int vN() {
    return 18213;
  }
}