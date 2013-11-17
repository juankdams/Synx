import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class ddm
{
  protected static final Logger K = Logger.getLogger(ddm.class);
  private static final boolean aRN = false;
  private static final ArrayList czt = new ArrayList();

  private static boolean bIx = false;

  private static double kWx = 3.0D;
  private bmM kWy;
  private bmM kWz = null;

  private final ArrayList ffN = new ArrayList();

  private static void cOv()
  {
    for (ddm localddm : czt)
      try {
        localddm.cOz();
      } catch (Exception localException) {
        K.error("Exception", localException);
      }
  }

  private static void initialize()
  {
    if (!bIx) {
      dka.cSF().a(new Cw(), 50L);

      bIx = true;
    }
  }

  private static void cOw() {
    K.trace(czt.size() + " manager(s) registered");
  }

  public static boolean a(ddm paramddm) {
    if (!bIx)
      initialize();
    if (!czt.contains(paramddm)) {
      boolean bool = czt.add(paramddm);

      return bool;
    }
    return false;
  }

  public static boolean b(ddm paramddm) {
    boolean bool = czt.remove(paramddm);
    if (!bool) {
      K.error("Impossible de retirer le manager " + paramddm + " de la liste.");
    }
    return bool;
  }

  public static double cOx()
  {
    return kWx;
  }

  public static void V(double paramDouble) {
    kWx = paramDouble;
  }

  public ddm(boolean paramBoolean)
  {
    this(paramBoolean, null);
  }

  public ddm(boolean paramBoolean, cUw paramcUw)
  {
    if (paramBoolean) {
      this.kWy = new bmM();
      a(paramcUw);
    } else {
      a(this);
      a(paramcUw);
    }
  }

  public void a(cUw paramcUw)
  {
    if ((paramcUw != null) && (!this.ffN.contains(paramcUw)))
      this.ffN.add(paramcUw);
  }

  public void b(cUw paramcUw)
  {
    if (paramcUw != null)
      this.ffN.remove(paramcUw);
  }

  public void a(long paramLong, bmM parambmM, boolean paramBoolean)
  {
    if ((parambmM.akk().czP() == 0.0F) && (parambmM.akm().czP() == 0.0F))
    {
      return;
    }

    cEi localcEi1 = parambmM.cp(paramLong);

    cEi localcEi2 = jB(paramLong);

    double d = localcEi2.o(localcEi1).czQ();

    if ((paramBoolean) || (d >= kWx) || (parambmM.akm().czP() == 0.0F))
    {
      bmM localbmM = new bmM(parambmM);

      for (cUw localcUw : this.ffN) {
        localcUw.a(paramLong, this.kWy, localbmM);
      }
      this.kWy = localbmM;
    }
  }

  public cEi jB(long paramLong)
  {
    return this.kWy.cp(paramLong);
  }

  public boolean cOy() {
    return this.kWz == null;
  }

  public void a(long paramLong, bmM parambmM)
  {
    if ((this.kWz == null) || (!parambmM.akl().equals(this.kWz.akl())))
    {
      this.kWz = new bmM(parambmM);
    }
  }

  private void cOz() {
    if (this.kWz != null) {
      long l = System.currentTimeMillis();
      for (cUw localcUw : this.ffN) {
        localcUw.a(l, new bmM(this.kWz));
      }
      this.kWz = null;
    }
  }

  public String toString()
  {
    if (this.kWz != null)
      return this.kWz.toString();
    if (this.kWy != null) {
      return this.kWy.toString();
    }
    return "<undefined>";
  }

  public static void cOA()
  {
    if (czt != null) {
      int i = czt.size();
      czt.clear();
      bIx = false;
      K.info("Nettoyage des vecteurs de mouvement des personnages (" + czt.size() + " restants sur " + i + ")");
    }
  }
}