public class aaW
  implements dFU
{
  public int vN()
  {
    return 18205;
  }

  public boolean b(cWG paramcWG) {
    yi localyi = (yi)paramcWG;
    long l1 = localyi.eq();
    long l2 = localyi.Hc();

    aCl localaCl = dqB.cXD().ay(l1);

    long l3 = dqB.cXD().CE();
    if ((l2 != l3) && (localaCl.aOC() != l3)) {
      dqB.cXD().I(l1, l2);
      return false;
    }

    String str = null;
    long l4 = byv.bFN().bFO().getId();
    if (l1 != l4)
      str = bU.fH().getString("guild.warning.giveMasterRank", new Object[] { localaCl.getName() });
    else {
      str = bU.fH().getString("guild.warning.removeSelfMasterRank", new Object[] { localaCl.getName() });
    }

    cKX localcKX = cBQ.cxL().a(str, 6L, 102, 3);

    localcKX.a(new aYm(this, l1, l2));

    return false;
  }
}