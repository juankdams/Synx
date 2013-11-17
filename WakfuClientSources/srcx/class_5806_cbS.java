public class cbS extends aGO
{
  public cbS(cyS paramcyS)
  {
    super(paramcyS);
  }

  public void s(long paramLong, int paramInt) {
    aCl localaCl = CG().ay(paramLong);
    int i = localaCl.ajD();
    super.s(paramLong, paramInt);
    int j = localaCl.ajD();

    if (i == j) {
      return;
    }
    if (localaCl.getId() != byv.bFN().bFO().getId()) {
      return;
    }
    String str = bU.fH().getString("guild.chatPointsGain", new Object[] { Integer.valueOf(j - i) });
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), str);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }
}