import java.util.List;

public class rB extends dWf
{
  private static final cWh aGJ = new cWh(new ec[] { new bpq("Default", new dou[] { new dDZ("Somme minimum", Pq.chv), new dDZ("Ids des Elements interactifs", Pq.chx) }) });

  public static final aBW aGK = new dKL();
  private int aZE;
  private final bKR aZF = new bKR();

  private rB(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, Iterable paramIterable) {
    super(paramLong, paramInt1, paramInt2, paramBoolean, paramIterable);
  }

  public void b(List paramList)
  {
    aOw localaOw = (aOw)paramList.get(0);
    this.aZE = ((int)localaOw.b(null, null, null, null));
    aBr localaBr = (aBr)paramList.get(1);
    this.aZF.l(localaBr.g(null, null, null, null).cfv());
  }

  public cQY pt()
  {
    return cQY.kCI;
  }

  public boolean a(bQe parambQe)
  {
    return (this.aZF.N(parambQe.m())) && (parambQe.bXs() >= this.aZE);
  }
}