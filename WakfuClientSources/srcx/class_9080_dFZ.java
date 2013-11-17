import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public final class dFZ extends akN
{
  private static ArrayList aAG = new ArrayList();

  private static final int[][] lQv = { { -1, -1 }, { 0, -1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, 1 }, { -1, 1 }, { -1, 0 } };

  protected List kM()
  {
    return aAG;
  }

  public dFZ(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  private boolean a(UG paramUG, int paramInt1, int paramInt2)
  {
    if (paramUG.ay(paramInt1, paramInt2)) {
      return true;
    }
    cdO localcdO = paramUG.au(paramInt1, paramInt2);

    if ((localcdO == null) || (!localcdO.aeH())) {
      return false;
    }

    if (!(localcdO instanceof axQ)) {
      K.error("Unknown obstacle type : " + localcdO);
      return true;
    }

    if (((axQ)localcdO).a(afC.cYy))
      return false;
    return true;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramObject2 == null) {
      return 0;
    }
    dbE localdbE = aAw.ah(paramObject4);

    if (localdbE == null)
      return -1;
    cYk localcYk1;
    if ((paramObject2 instanceof cYk))
      localcYk1 = (cYk)paramObject2;
    else if ((paramObject2 instanceof axQ))
      localcYk1 = ((axQ)paramObject2).ML();
    else {
      return -2;
    }

    UG localUG = localdbE.LB();

    int i = 0;
    int j = 0;
    cYk localcYk2 = new cYk();
    cYk localcYk3 = new cYk();

    dqg localdqg = dqg.cXq();
    localdqg.a(6, (byte)0, (short)4);
    localdqg.a(localUG);

    localUG.bw(true);
    try {
      for (int k = 0; k <= lQv.length; k++) {
        int[] arrayOfInt = lQv[(k % lQv.length)];
        int m = localcYk1.getX() + arrayOfInt[0];
        int n = localcYk1.getY() + arrayOfInt[1];

        boolean bool = localUG.aq(m, n);

        short s = bool ? localUG.aw(m, n) : 0;
        localcYk3.ac(m, n, s);

        int i1 = (bool) && (!a(localUG, m, n)) ? 1 : 0;

        if (k != 0)
        {
          if (i1 != j) {
            i++;
          }
          else if ((i1 != 0) && 
            (!localdqg.d(localcYk2, localcYk3))) {
            i++;
          }

        }

        localcYk2.ae(localcYk3);
        j = i1;
      }
    } finally {
      localUG.bw(false);
      localdqg.release();
    }

    if ((i == 0) || (i == 2))
      return 0;
    return -1;
  }

  public Enum gm() {
    return Bz.bAM;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}