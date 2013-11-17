import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class cfb extends cJK
{
  private static final dGy hzV = new apv();

  private static final CE hzW = new apx();

  private final CE hzX = new apw(this);

  protected static final Logger K = Logger.getLogger(cfb.class);

  protected final aoL cSR = new aoL();
  protected final aoL gNu = new aoL();
  protected final aoL hzY = new aoL();

  private final List hzZ = new ArrayList(5);

  cfb(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
      a(new cfb[9]);
  }

  public void initialize()
  {
    super.initialize();

    short s1 = (short)this.hY;
    short s2 = (short)this.hZ;

    dmn localdmn = cjS.clP().clQ();
    while (localdmn.hasNext()) {
      localdmn.fl();
      localObject1 = (ckT)localdmn.value();
      if ((localObject1 instanceof czN)) {
        localObject2 = (czN)localObject1;
        for (Cs localCs : ((czN)localObject2).cwK()) {
          if ((s1 == ((Short)localCs.getFirst()).shortValue()) && (s2 == ((Short)localCs.Lp()).shortValue())) {
            g((czN)localObject2);
            break;
          }
        }
      }
    }

    Object localObject1 = (dJN)cPV.cGZ().V(s1, s2);
    if (localObject1 == null) {
      return;
    }

    Object localObject2 = ((dJN)localObject1).cMa();
    if (localObject2 != null) {
      aoc.a(this, (brS[])localObject2);
      aoc.b(this, (brS[])localObject2);
    }
  }

  void k(azX paramazX) {
    if (!this.cSR.containsKey(paramazX.getId()))
      this.cSR.put(paramazX.getId(), paramazX);
    else
      K.error("Impossible d'ajouter une resource d'ID=" + paramazX.getId() + " à la partition " + this + " qui la contient déjà.");
  }

  public void aJ()
  {
  }

  public void bc()
  {
    this.cSR.clear();
    this.hzY.clear();
    this.gNu.clear();
  }

  void e(czN paramczN)
  {
    this.hzY.remove(paramczN.getId());
  }

  void q(azX paramazX)
  {
    this.cSR.remove(paramazX.getId());
  }

  boolean f(czN paramczN)
  {
    return this.hzY.N(paramczN.getId());
  }

  boolean r(azX paramazX)
  {
    return this.cSR.N(paramazX.getId());
  }

  void hn(long paramLong)
  {
    dWu localdWu = (dWu)this.gNu.remove(paramLong);
    if (localdWu != null)
      localdWu.tk();
  }

  void f(dWu paramdWu)
  {
    this.gNu.remove(paramdWu.getId());
    paramdWu.tk();
  }

  void g(dWu paramdWu)
  {
    try
    {
      if (!this.gNu.containsKey(paramdWu.getId())) {
        this.gNu.put(paramdWu.getId(), paramdWu);
        paramdWu.MW();
      } else {
        K.error("Impossible d'ajouter un éléments interactif d'ID=" + paramdWu.getId() + " à la partition " + this + " qui le contient déjà.");
      }
    } catch (Exception localException) {
      K.error("", localException);
    }
  }

  boolean ho(long paramLong)
  {
    return this.gNu.N(paramLong);
  }

  public void P(dGy paramdGy) {
    this.gNu.s(paramdGy);
  }

  dWu dw(long paramLong) {
    return (dWu)this.gNu.get(paramLong);
  }

  void g(czN paramczN)
  {
    if (!this.hzY.N(paramczN.getId())) {
      paramczN.gQ();
      this.hzY.put(paramczN.getId(), paramczN);
    } else {
      K.error("Impossible d'ajouter un item d'ID=" + paramczN.getId() + " à la partition " + this + " qui le contient déjà.");
    }
  }

  protected void clear() {
    super.clear();
    this.cSR.clear();
    this.gNu.clear();
    this.hzY.clear();
  }

  public void chX()
  {
    super.chX();

    this.cSR.a(hzW);

    this.hzY.a(this.hzX);

    aoc.bh(this.hY, this.hZ);
    this.gNu.s(hzV);

    clear();
  }

  private static cfb a(cfb paramcfb, int paramInt1, int paramInt2) {
    cfb localcfb = new cfb(paramcfb.getX() + paramInt1, paramcfb.getY() + paramInt2, 18, 18, false);

    localcfb.initialize();
    return localcfb;
  }

  private void vd(int paramInt)
  {
    cfb[] arrayOfcfb = (cfb[])brP();
    cfb localcfb = arrayOfcfb[4];

    switch (paramInt) {
    case 7:
      arrayOfcfb[7] = a(localcfb, 0, 1);
      break;
    case 1:
      arrayOfcfb[1] = a(localcfb, 0, -1);
      break;
    case 3:
      arrayOfcfb[3] = a(localcfb, -1, 0);
      break;
    case 5:
      arrayOfcfb[5] = a(localcfb, 1, 0);
      break;
    case 0:
      arrayOfcfb[0] = a(localcfb, -1, -1);
      break;
    case 2:
      arrayOfcfb[2] = a(localcfb, 1, -1);
      break;
    case 8:
      arrayOfcfb[8] = a(localcfb, 1, 1);
      break;
    case 6:
      arrayOfcfb[6] = a(localcfb, -1, 1);
      break;
    case 4:
    default:
      K.error("Tentative de renew d'une LocalPartition inexistante");
    }
  }

  void ve(int paramInt)
  {
    cfb[] arrayOfcfb = (cfb[])brP();

    switch (paramInt)
    {
    case 7:
      this.hzZ.add(arrayOfcfb[1]);
      this.hzZ.add(arrayOfcfb[0]);
      this.hzZ.add(arrayOfcfb[2]);

      arrayOfcfb[1] = arrayOfcfb[4];
      arrayOfcfb[0] = arrayOfcfb[3];
      arrayOfcfb[2] = arrayOfcfb[5];

      arrayOfcfb[4] = arrayOfcfb[7];
      arrayOfcfb[3] = arrayOfcfb[6];
      arrayOfcfb[5] = arrayOfcfb[8];

      vd(7);
      vd(6);
      vd(8);

      break;
    case 1:
      this.hzZ.add(arrayOfcfb[7]);
      this.hzZ.add(arrayOfcfb[6]);
      this.hzZ.add(arrayOfcfb[8]);

      arrayOfcfb[7] = arrayOfcfb[4];
      arrayOfcfb[6] = arrayOfcfb[3];
      arrayOfcfb[8] = arrayOfcfb[5];

      arrayOfcfb[4] = arrayOfcfb[1];
      arrayOfcfb[3] = arrayOfcfb[0];
      arrayOfcfb[5] = arrayOfcfb[2];

      vd(1);
      vd(0);
      vd(2);

      break;
    case 3:
      this.hzZ.add(arrayOfcfb[5]);
      this.hzZ.add(arrayOfcfb[2]);
      this.hzZ.add(arrayOfcfb[8]);

      arrayOfcfb[5] = arrayOfcfb[4];
      arrayOfcfb[2] = arrayOfcfb[1];
      arrayOfcfb[8] = arrayOfcfb[7];

      arrayOfcfb[4] = arrayOfcfb[3];
      arrayOfcfb[1] = arrayOfcfb[0];
      arrayOfcfb[7] = arrayOfcfb[6];

      vd(0);
      vd(3);
      vd(6);

      break;
    case 5:
      this.hzZ.add(arrayOfcfb[3]);
      this.hzZ.add(arrayOfcfb[0]);
      this.hzZ.add(arrayOfcfb[6]);

      arrayOfcfb[3] = arrayOfcfb[4];
      arrayOfcfb[0] = arrayOfcfb[1];
      arrayOfcfb[6] = arrayOfcfb[7];

      arrayOfcfb[4] = arrayOfcfb[5];
      arrayOfcfb[1] = arrayOfcfb[2];
      arrayOfcfb[7] = arrayOfcfb[8];

      vd(2);
      vd(5);
      vd(8);

      break;
    case 0:
      this.hzZ.add(arrayOfcfb[5]);
      this.hzZ.add(arrayOfcfb[2]);
      this.hzZ.add(arrayOfcfb[8]);
      this.hzZ.add(arrayOfcfb[7]);
      this.hzZ.add(arrayOfcfb[6]);

      arrayOfcfb[8] = arrayOfcfb[4];
      arrayOfcfb[4] = arrayOfcfb[0];
      arrayOfcfb[5] = arrayOfcfb[1];
      arrayOfcfb[7] = arrayOfcfb[3];

      vd(1);
      vd(2);
      vd(0);
      vd(3);
      vd(6);

      break;
    case 2:
      this.hzZ.add(arrayOfcfb[0]);
      this.hzZ.add(arrayOfcfb[3]);
      this.hzZ.add(arrayOfcfb[6]);
      this.hzZ.add(arrayOfcfb[7]);
      this.hzZ.add(arrayOfcfb[8]);

      arrayOfcfb[6] = arrayOfcfb[4];
      arrayOfcfb[3] = arrayOfcfb[1];
      arrayOfcfb[7] = arrayOfcfb[5];
      arrayOfcfb[4] = arrayOfcfb[2];

      vd(0);
      vd(1);
      vd(2);
      vd(5);
      vd(8);

      break;
    case 8:
      this.hzZ.add(arrayOfcfb[2]);
      this.hzZ.add(arrayOfcfb[1]);
      this.hzZ.add(arrayOfcfb[0]);
      this.hzZ.add(arrayOfcfb[3]);
      this.hzZ.add(arrayOfcfb[6]);

      arrayOfcfb[0] = arrayOfcfb[4];
      arrayOfcfb[1] = arrayOfcfb[5];
      arrayOfcfb[3] = arrayOfcfb[7];
      arrayOfcfb[4] = arrayOfcfb[8];

      vd(2);
      vd(5);
      vd(8);
      vd(7);
      vd(6);

      break;
    case 6:
      this.hzZ.add(arrayOfcfb[0]);
      this.hzZ.add(arrayOfcfb[1]);
      this.hzZ.add(arrayOfcfb[2]);
      this.hzZ.add(arrayOfcfb[5]);
      this.hzZ.add(arrayOfcfb[8]);

      arrayOfcfb[1] = arrayOfcfb[3];
      arrayOfcfb[2] = arrayOfcfb[4];
      arrayOfcfb[4] = arrayOfcfb[6];
      arrayOfcfb[5] = arrayOfcfb[7];

      vd(0);
      vd(3);
      vd(6);
      vd(7);
      vd(8);

      break;
    case 4:
    default:
      K.error("Translation d'une LocalPartition dans une direction invalide, bizarre...");
    }

    int i = 0; for (int j = this.hzZ.size(); i < j; i++) {
      ((cfb)this.hzZ.get(i)).chX();
    }
    this.hzZ.clear();
  }

  public String toString()
  {
    return "(" + getX() + ',' + getY() + ')';
  }

  void N(int paramInt1, int paramInt2, short paramShort) {
    if (this.gNu.isEmpty()) {
      return;
    }
    byz localbyz = byv.bFN().bFO();

    if (!localbyz.bGx()) {
      return;
    }
    cYk localcYk = new cYk();
    this.gNu.s(new apz(this, localcYk, paramInt1, paramInt2, paramShort, localbyz));
  }
}