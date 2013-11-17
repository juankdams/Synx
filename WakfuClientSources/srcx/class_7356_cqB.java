import org.apache.log4j.Logger;

public class cqB extends csx
{
  private final cYk iaq;
  private boolean hyJ = false;
  private int hyK = 2;
  private boolean hyL = true;
  private byte hyM = bea.fqJ.bJ();
  private cYk hyN = null;
  private cYk hyP = null;
  private cYk hyQ = null;
  private int[] hyO = null;

  public cqB() {
    this.iaq = new cYk();
  }

  public cqB(cYk paramcYk1, boolean paramBoolean1, int paramInt, boolean paramBoolean2, byte paramByte, cYk paramcYk2, int[] paramArrayOfInt, cYk paramcYk3, cYk paramcYk4) {
    this.iaq = paramcYk1;
    this.hyJ = paramBoolean1;
    this.hyK = paramInt;
    this.hyL = paramBoolean2;
    this.hyM = paramByte;
    this.hyN = paramcYk2;
    this.hyO = paramArrayOfInt;
    this.hyP = paramcYk3;
    this.hyQ = paramcYk4;
  }

  public csx qb() {
    return new cqB(this.iaq, this.hyJ, this.hyK, this.hyL, this.hyM, this.hyN, this.hyO, this.hyP, this.hyQ);
  }

  public void O(cYk paramcYk) {
    this.hyN = paramcYk;
  }

  public void dH(byte paramByte) {
    this.hyM = paramByte;
  }

  public void L(int[] paramArrayOfInt) {
    this.hyO = paramArrayOfInt;
  }

  public void uZ(int paramInt) {
    this.hyK = paramInt;
  }

  public void gP(boolean paramBoolean) {
    this.hyJ = paramBoolean;
  }

  public void gQ(boolean paramBoolean) {
    this.hyL = paramBoolean;
  }

  public void P(cYk paramcYk) {
    this.hyP = paramcYk;
  }

  public void Q(cYk paramcYk) {
    this.hyQ = paramcYk;
  }

  public aiI pW()
  {
    return aiI.dfJ;
  }

  public void run()
  {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }

    cew localcew1 = byv.bFN().bFO().aeL();

    cew localcew2 = ((Su)this.dvI).aeL();
    int i = localcew2.dpB();
    int j = localcew2.dpC();
    short s = (short)(int)localcew2.getAltitude();

    int k = localcew1.fa();
    int m = localcew1.fb();

    if ((Math.abs(i - k) <= 10) && (Math.abs(j - m) <= 10)) {
      cet localcet = new cet();
      localcet.O(((Su)this.dvI).getId());
      localcet.h(i, j, s);
      localcet.O(this.hyN);
      localcet.dH(this.hyM);
      localcet.L(this.hyO);
      localcet.uZ(this.hyK);
      localcet.gP(this.hyJ);
      localcet.gQ(this.hyL);
      localcet.P(this.hyP);
      localcet.Q(this.hyQ);
      byv.bFN().aJK().d(localcet);
    }
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof Su)) {
      return false;
    }

    if (((Su)this.dvI).adF()) {
      return false;
    }

    byz localbyz = byv.bFN().bFO();

    if (localbyz.adF()) {
      return false;
    }
    if (localbyz.bHa() != null) {
      return false;
    }
    if (localbyz.bGK()) {
      return false;
    }

    if (aYP.feK.bnQ()) {
      return false;
    }

    if (localbyz.d(dKm.lWN) > 0) {
      return false;
    }
    if (((Su)this.dvI).c(dKm.lWP)) {
      return false;
    }
    return true;
  }

  public String qa()
  {
    return "trainingFightStart";
  }

  protected int qc() {
    return aiI.dfw.eo();
  }
}