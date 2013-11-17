import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public final class alI extends akN
{
  private static final ArrayList ayr = new ArrayList();
  private static final String dmE = "ignoreObstacles";
  private boolean dmF;
  private long dmG;

  public alI(ArrayList paramArrayList)
  {
    int i = u(paramArrayList);
    this.dmF = false;
    this.dmG = -1L;
    switch (i) {
    case 1:
      this.dmF = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("ignoreObstacles");
      break;
    case 2:
      this.dmG = ((aOw)paramArrayList.get(0)).b(null, null, null, null);
      break;
    case 3:
      this.dmF = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("ignoreObstacles");
      this.dmG = ((aOw)paramArrayList.get(1)).b(null, null, null, null);
    }
  }

  protected List kM()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramObject2 == null) {
      return 0;
    }
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject4, paramObject3);

    dbE localdbE = aAw.ah(paramObject4);

    if (localdbE == null)
      return -1;
    cYk localcYk;
    if ((paramObject2 instanceof cYk))
      localcYk = (cYk)paramObject2;
    else if ((paramObject2 instanceof axQ))
      localcYk = ((axQ)paramObject2).ML();
    else {
      return -2;
    }

    UG localUG = localdbE.LB();

    if (this.dmF) {
      localUG.bw(true);
    }
    dqg localdqg = dqg.cXq();
    int i = -1;
    try {
      localdqg.a(localdhJ.bY(), localdhJ.afD(), localdhJ.arG());
      localdqg.a(localUG);
      localdqg.ak(localdhJ.ML());
      localdqg.al(localcYk);
      Nm localNm = new Nm();
      localNm.caC = ((int)this.dmG);
      localNm.caB = 256;
      localdqg.a(localNm);

      i = localdqg.cXv();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    } finally {
      localdqg.release();
      localUG.bw(false);
    }

    if (i == -1) {
      return -1;
    }
    return 0;
  }

  public Enum gm()
  {
    return Bz.bCQ;
  }

  static
  {
    ayr.add(zT.buX);
    ayr.add(zT.buY);
    ayr.add(zT.bva);
    ayr.add(new Pq[] { Pq.chu, Pq.chv });
  }
}