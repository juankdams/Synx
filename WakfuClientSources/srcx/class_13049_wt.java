import java.util.Collection;

class wt extends dBq
{
  wt(ckT paramckT, byz parambyz, byte paramByte)
  {
    super(paramckT, parambyz, paramByte);
  }

  public int sS()
  {
    int i = super.sS();
    if (i != 0) {
      return i;
    }
    int j = FA();
    if ((j != -1) && (this.bml != j)) {
      return 1036;
    }
    ayn localayn = FB();

    int k = this.bml == localayn.aKk().Fx() ? 1 : 0;

    int m = (a(localayn)) && (localayn.avc() != 0) ? 1 : 0;
    int n = (b(localayn)) && (localayn.avc() != 0) ? 1 : 0;

    if ((k != 0) && (n != 0))
      return 1036;
    if ((k == 0) && (m != 0)) {
      return 1037;
    }
    return 0;
  }

  private byte FA() {
    Collection localCollection = this.aCI.bgG();
    long l1 = this.dmy.c(go.aEq);
    byte b = -1;
    for (Su localSu : localCollection) {
      if ((localSu instanceof dcw))
      {
        long l2 = ((dcw)localSu).c(go.aEq);
        if (l2 == l1)
          b = localSu.Fx();
      }
    }
    return b;
  }

  private boolean a(aid paramaid) {
    dqU localdqU = this.dmy.cJf().UI().aMP().jq(paramaid.avc());
    return localdqU == dqU.ltr;
  }

  private boolean b(aid paramaid) {
    dqU localdqU = this.dmy.cJf().UI().aMP().jq(paramaid.avc());
    return localdqU == dqU.ltp;
  }

  private ayn FB() {
    for (Su localSu : this.aCI.bgG()) {
      ayn localayn = l(localSu);
      if (localayn != null)
        return localayn;
    }
    return null;
  }

  private ayn l(Su paramSu)
  {
    if ((paramSu.getType() != 1) || (!(paramSu instanceof byo)))
    {
      return null;
    }
    byo localbyo = (byo)paramSu;

    return localbyo.FB();
  }
}