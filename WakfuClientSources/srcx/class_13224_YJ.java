import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class YJ extends dqt
{
  private final long kM;
  private final Collection cJO = new ArrayList();
  private boolean cJP;

  private YJ(int paramInt, long paramLong)
  {
    super(paramInt, dPD.mia.bJ(), 0);
    this.kM = paramLong;
  }

  public static YJ[] b(bvT parambvT) {
    YJ[] arrayOfYJ = new YJ[parambvT.size()];

    Wr localWr = parambvT.bDK();
    int i = 0;
    for (Iterator localIterator = localWr.iterator(); localIterator.hasNext(); ) {
      aKw localaKw = (aKw)localIterator.next();
      YJ localYJ = a(localaKw);
      arrayOfYJ[(i++)] = localYJ;
    }
    return arrayOfYJ;
  }

  private static YJ a(aKw paramaKw)
  {
    YJ localYJ = new YJ(cXz(), paramaKw.eW());

    for (Iterator localIterator = paramaKw.iterator(); localIterator.hasNext(); ) {
      localYJ.cJO.add(localIterator.next());
    }

    return localYJ;
  }

  public long mC()
  {
    Su localSu = CA.Lv().bj(this.kM);

    if (localSu == null) {
      return 0L;
    }

    this.cJP = false;
    for (Object localObject = this.cJO.iterator(); ((Iterator)localObject).hasNext(); ) { Kp localKp = (Kp)((Iterator)localObject).next();
      a(localSu, localKp);
    }

    if (localSu != byv.bFN().bFO()) {
      return 0L;
    }

    if (this.cJO.isEmpty()) {
      return 0L;
    }

    if (cBQ.cxL().mZ("spellsDialog")) {
      localObject = dPm.dqv();
      ((dPm)localObject).acB();
    }

    if (cBQ.cxL().mZ("spellsDialog")) {
      dLE.doY().a(localSu.aet(), localSu.aet().getFields());
      dLE.doY().a(localSu.aez(), localSu.aez().getFields());
    }

    return 0L;
  }

  private void a(Su paramSu, Kp paramKp)
  {
    dSv localdSv = paramKp.UV();
    long l = paramKp.UW().DP();
    boolean bool = paramKp.UW().DR();

    if (localdSv.dsU()) {
      paramSu.a(localdSv.tc(), l, bool);
      this.cJP = true;
    } else {
      paramSu.b(localdSv.tc(), l, bool);
    }
  }

  protected void kO()
  {
  }
}