import java.util.List;

public class cSZ extends dWf
{
  private static final cWh aGJ = new cWh(new ec[] { new bpq("Nothing", new dou[0]) });

  public static final aBW aGK = new aSe();

  private cSZ(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, Iterable paramIterable)
  {
    super(paramLong, paramInt1, paramInt2, paramBoolean, paramIterable);
  }

  public void b(List paramList)
  {
  }

  public cQY pt()
  {
    return cQY.kDa;
  }

  public boolean a(cwu paramcwu)
  {
    if (!paramcwu.ctR().bOJ()) {
      return false;
    }
    dgG localdgG = paramcwu.ctQ();
    int i = localdgG.nn();
    ais localais = paramcwu.MY();

    if (localais == null)
      return false;
    kr localkr;
    if ((localdgG instanceof bmx)) {
      bmx localbmx = (bmx)localdgG;
      adz localadz = localbmx.bxj();
      for (localkr = localadz.apz(); localkr.hasNext(); ) {
        if (localais.iA(localkr.next()))
          return true;
      }
    }
    return localais.iB(i);
  }
}