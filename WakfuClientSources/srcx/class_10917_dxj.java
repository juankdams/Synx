import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

final class dxj
{
  private static Logger K = Logger.getLogger(dxj.class);
  private final dbE aVI;

  dxj(dbE paramdbE)
  {
    this.aVI = paramdbE;
  }

  baf a(dle paramdle, bqk parambqk, cYk paramcYk, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, bZA parambZA)
  {
    if (parambqk == null) {
      K.error(this.aVI.ha("cast d'un conteneur null"));
      return baf.fhz;
    }

    if ((!this.aVI.aDG().AP()) || (this.aVI.aDG().AQ() != paramdle.getId())) {
      return baf.fhQ;
    }
    int i = paramdle.e(eu.ayU);
    if (((paramdle instanceof aTa)) && 
      (((aTa)paramdle).Vj())) {
      i++;
    }

    if ((paramInt2 >= 1) && (paramBoolean1)) {
      paramInt2 = Math.max(paramInt2 + i, paramInt1);
    }
    if ((paramdle.c(cfY.hBc)) && (paramInt2 > 1)) {
      paramInt2 = 1;
    }

    if (paramInt1 > paramInt2) {
      return baf.fhC;
    }

    UG localUG = this.aVI.LB();

    if ((paramcYk != null) && (localUG != null)) {
      int j = paramcYk.getX();
      int k = paramcYk.getY();
      short s = paramcYk.IB();
      dhJ localdhJ = this.aVI.bo(paramcYk.getX(), paramcYk.getY());

      int m = Math.abs(j - paramdle.fa()) + Math.abs(k - paramdle.fb());

      if ((m < paramInt1) || (m > paramInt2)) {
        if (m != 0)
          return baf.fhC;
        if (!paramBoolean5) {
          return baf.fhC;
        }
      }

      if (!localUG.p(j, k)) {
        return baf.fhB;
      }

      if ((paramBoolean4) && (localUG.ap(j, k))) {
        return baf.fhB;
      }

      if (!localUG.aq(j, k)) {
        return baf.fhB;
      }

      if (paramBoolean2) {
        if (!cyC.a(paramdle, this.aVI, j, k, s)) {
          return baf.fhA;
        }

      }
      else if (!localUG.v(j, k, s)) {
        return baf.fhA;
      }

      if ((parambZA != null) && (!parambZA.i(paramdle, paramcYk, parambqk, this.aVI))) {
        return baf.fhN;
      }

      List localList = this.aVI.k(paramcYk);
      Object localObject4;
      if ((parambZA != null) && (!localList.isEmpty())) {
        int n = 0;
        int i2 = 0; for (int i3 = localList.size(); i2 < i3; i2++) {
          localObject4 = localList.get(i2);
          if (parambZA.i(paramdle, localObject4, parambqk, this.aVI)) {
            n = 1;
            break;
          }
        }
        if (n == 0) {
          return baf.fhN;
        }
      }

      for (Object localObject1 = parambqk.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (dpI)((Iterator)localObject1).next();
        if ((((dpI)localObject2).beA() != null) && (((dpI)localObject2).atZ() != null))
        {
          localObject3 = ((dpI)localObject2).beA();
          if (!localUG.a((bbH)localObject3, paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), paramdle.fa(), paramdle.fb(), paramdle.fc(), paramdle.E()))
          {
            return baf.fhP;
          }
        }
      }
      Object localObject2;
      Object localObject3;
      if ((paramBoolean3) && 
        (localUG.s(j, k, s))) {
        return baf.fhL;
      }

      if (localdhJ != null)
      {
        if ((localdhJ.c(cfY.hBt)) && 
          (localdhJ != paramdle)) {
          return baf.fhN;
        }

        if (((paramdle instanceof dhJ)) && ((localdhJ instanceof dhJ)) && 
          (paramdle.c(cfY.hBi))) {
          localObject1 = (dhJ)paramdle;
          localObject2 = (dhJ)localdhJ;
          if (((dhJ)localObject1).nU() < ((dhJ)localObject2).nU()) {
            return baf.fhN;
          }
        }

        int i1 = 0;
        for (localObject2 = parambqk.iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (dpI)((Iterator)localObject2).next();
          if (((duF)localObject3).atZ() == null) {
            i1 = 1;
            break;
          }
          localObject4 = ((duF)localObject3).atZ().a(localdhJ, paramdle);

          switch (cNs.hfz[((btH)localObject4.getFirst()).ordinal()]) {
          case 1:
          case 2:
          case 3:
            i1 = 1;
          }
        }

        if (i1 == 0) {
          return baf.fhy;
        }

      }

    }
    else if ((parambZA != null) && (!parambZA.i(paramdle, paramcYk, parambqk, this.aVI))) {
      return baf.fhN;
    }

    return baf.fhx;
  }

  boolean a(dhJ paramdhJ1, cYk paramcYk, bzj parambzj, dhJ paramdhJ2, UG paramUG) {
    boolean bool1 = parambzj.bHP();
    if ((!parambzj.uV()) && (!bool1)) {
      return true;
    }
    boolean bool2 = bool1;
    if (bool1) {
      if ((paramcYk.getX() != paramdhJ1.ML().getX()) && (paramcYk.getY() != paramdhJ1.ML().getY())) {
        bool2 = false;
      }
      if ((bool2) && (parambzj.bHQ())) {
        dqg localdqg = dqg.cXq();
        localdqg.a(paramdhJ1.bY(), paramdhJ1.afD(), paramdhJ1.arG());
        localdqg.a(paramUG);
        if (paramdhJ2 != null)
          paramUG.c(paramdhJ2);
        boolean bool3 = localdqg.e(paramdhJ1.aKb(), paramcYk);
        paramUG.ahM();
        localdqg.release();
        if (!bool3) {
          bool2 = false;
        }
      }
    }

    if ((!parambzj.uV()) || (bool2)) {
      return bool2;
    }
    return Math.abs(paramcYk.getX() - paramdhJ1.ML().getX()) == Math.abs(paramcYk.getY() - paramdhJ1.ML().getY());
  }
}