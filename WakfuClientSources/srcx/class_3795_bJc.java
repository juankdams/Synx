public class bJc extends ajt
{
  private long gJX;

  public void gO(long paramLong)
  {
    this.gJX = paramLong;
  }

  public void a(dwn paramdwn) {
    if (!ajt.c(paramdwn)) {
      paramdwn.setVisible(false);
      return;
    }

    if ((paramdwn.getValue() instanceof brS)) {
      brS localbrS = (brS)paramdwn.getValue();
      if (localbrS.dYr == 47) {
        if (localbrS.aTz == this.gJX) {
          paramdwn.setVisible(false);
          return;
        }

        CU localCU = aot.dtv.a(dFN.lQf, localbrS.aTz);
        a(paramdwn, localCU.Md());

        awT localawT = byv.bFN().bFO().bGF();
        if (localawT.kT((int)localbrS.aTz)) {
          paramdwn.setVisible(true);
          paramdwn.kJ(true);
          paramdwn.kK(false);
          return;
        }
      }
    }

    paramdwn.setVisible(true);
    paramdwn.kJ(false);
    paramdwn.kK(true);
  }
}