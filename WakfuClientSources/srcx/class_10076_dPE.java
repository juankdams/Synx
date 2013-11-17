import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dPE
{
  private static final Logger K = Logger.getLogger(dPE.class);
  public static final float miy = -0.5F;
  public static final float miz = 0.5F;
  private final aYr bwL;
  private final PX miA = new PX();
  private final dHF gXp = new dHF();

  private final ArrayList aBf = new ArrayList();
  public static final int miB = 0;
  public static final int miC = 1;
  public static final int miD = 2;
  public static final int miE = 3;

  public dPE(aYr paramaYr)
  {
    this.bwL = paramaYr;
  }

  public boolean a(bgU parambgU) {
    return (!this.aBf.contains(parambgU)) && (this.aBf.add(parambgU));
  }

  public boolean a(cTK paramcTK, asK paramasK) {
    if ((paramcTK == null) || (paramasK == null)) {
      return false;
    }

    cvY localcvY = paramcTK.cJf();
    asK localasK = localcvY.biJ();
    int i = l(paramcTK);
    if (i != 0) {
      switch (i) {
      case 2:
        K.error("[Nation] Impossible de prendre en compte l'opinion du joueur " + paramcTK + " car il n'a pas voté");
        break;
      case 1:
        K.error("[Nation] Impossible de prendre en compte l'opinion du joueur " + paramcTK + " car un vote est en cours");
        break;
      case 3:
        K.error("[Nation] Impossible de prendre en compte l'opinion du joueur " + paramcTK + " car il n'y a pas de gouverneur");
      }

      return false;
    }

    this.miA.e(localasK.bUy, -1);
    this.miA.b(paramasK.bUy, 1, 1);
    localcvY.a(paramasK);
    dqK();
    return true;
  }

  public void dqG() {
    this.miA.clear();
    this.miA.c(asK.dCA.bUy, this.bwL.aNc().aNb());
    dqK();
  }

  public void clear() {
    this.miA.clear();
  }

  public int b(asK paramasK) {
    return this.miA.ap(paramasK.bUy);
  }

  public int dqH() {
    return this.gXp.dhX();
  }

  public float dhW() {
    return this.gXp.dhW();
  }

  public boolean dqI() {
    return dD(this.gXp.dhW());
  }

  public boolean dqJ() {
    return dE(this.gXp.dhW());
  }

  public static boolean dD(float paramFloat) {
    return paramFloat <= -0.5F;
  }

  public static boolean dE(float paramFloat) {
    return paramFloat >= 0.5F;
  }

  private void dqK() {
    float f1 = this.gXp.dhW();

    this.gXp.clear();
    this.miA.a(this.gXp);

    float f2 = this.gXp.dhW();
    if (f2 != f1)
      for (int i = 0; i < this.aBf.size(); i++)
        ((bgU)this.aBf.get(i)).a(this.bwL, f1, f2);
  }

  public int l(cTK paramcTK)
  {
    cvY localcvY = paramcTK.cJf();
    asK localasK = localcvY.biJ();

    if (this.bwL.aMX()) {
      return 1;
    }

    dxL localdxL = localcvY.biD();
    cYq localcYq = this.bwL.aNc().bUE();
    if (localdxL.Q(localcYq)) {
      return 2;
    }

    if (this.miA.ap(localasK.bUy) <= 0) {
      return 2;
    }

    if (localcvY.UI().aNd().clp() == null) {
      return 3;
    }

    return 0;
  }

  public void a(aUd paramaUd)
  {
    this.miA.a(new dMP(paramaUd));
  }

  public void b(aUd paramaUd) {
    int i = 0; for (int j = paramaUd.eUI.size(); i < j; i++) {
      cfL localcfL = (cfL)paramaUd.eUI.get(i);
      this.miA.c(localcfL.hAH, localcfL.hAI);
    }
    dqK();
  }
}