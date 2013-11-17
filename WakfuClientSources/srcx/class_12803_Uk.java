public class Uk
  implements dFU
{
  public boolean b(cWG paramcWG)
  {
    bzu localbzu = (bzu)paramcWG;
    aCl localaCl = dqB.cXD().ay(localbzu.ah());

    if (localaCl == null) {
      return false;
    }

    String str = bU.fH().getString("guild.excludeMember.validate", new Object[] { localaCl.getName() });
    cKX localcKX = cBQ.cxL().a(str, 6L, 102, 3);

    localcKX.a(new dlU(this, localaCl));

    return false;
  }

  public int vN() {
    return 18207;
  }
}