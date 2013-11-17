import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dmM
{
  private static final Logger K = Logger.getLogger(dmM.class);

  private static final dmM lkH = new dmM();
  private int lkI;
  private boolean lkJ;
  private final btE lkK = new duV();
  private final cMg lkL = new cMg();
  private final btE lkM = new aAW();
  private float lkN;
  public static final int gaJ = 2;
  private final ArrayList kSO = new ArrayList();

  public static dmM cUe()
  {
    return lkH;
  }

  private dmM() {
    reset();
  }

  public void reset() {
    this.lkI = -1;
    dAn.ddB();
  }

  public void AL(int paramInt) {
    this.lkI = paramInt;
  }

  public int cUf() {
    return this.lkI;
  }

  public float cUg() {
    return this.lkN;
  }

  public void dd(float paramFloat) {
    this.lkN = paramFloat;
  }

  public void jB(boolean paramBoolean) {
    this.lkJ = paramBoolean;
  }

  public void cUh() {
    this.lkL.iA(false);
  }

  public void cUi() {
    this.lkL.iA(true);
  }

  public void cUj() {
    this.lkL.setBorderVisible(false);
  }

  public void cUk() {
    this.lkL.setBorderVisible(true);
  }

  private btE AM(int paramInt) {
    if (paramInt == this.lkI) {
      return this.lkM;
    }
    if (this.lkJ) {
      return this.lkK;
    }
    return this.lkL;
  }

  public void b(Su paramSu, int paramInt) {
    btE localbtE = AM(paramInt);
    localbtE.J(paramSu);
  }

  public void c(Su paramSu, int paramInt) {
    if (byv.bFN().bFO() == paramSu) {
      AL(-1);
    }
    btE localbtE = AM(paramInt);
    localbtE.ag(paramSu);
  }

  public void a(ckT paramckT, cjK paramcjK) {
    btE localbtE = AM(paramckT.getId());
    localbtE.a(paramckT, paramcjK);
  }

  public void b(ckT paramckT, cjK paramcjK) {
    btE localbtE = AM(paramckT != null ? paramckT.getId() : 0);
    localbtE.b(paramckT, paramcjK);
  }

  public void c(ckT paramckT, cjK paramcjK) {
    btE localbtE = AM(paramckT.getId());
    localbtE.c(paramckT, paramcjK);
  }

  public boolean AN(int paramInt) {
    return AM(paramInt).aMI();
  }

  public boolean AO(int paramInt) {
    return AM(paramInt).aMJ();
  }

  public void d(czN paramczN) {
    btE localbtE = AM(paramczN.getId());
    localbtE.d(paramczN);
  }

  public void cUl() {
    dAn.ddB();
    dmn localdmn = cjS.clP().clQ();
    while (localdmn.hasNext())
      try {
        localdmn.fl();
        ckT localckT = (ckT)localdmn.value();
        if (localckT.aEu() != dzm.lFM)
        {
          btE localbtE = AM(localckT.getId());
          localbtE.c(localckT);
        }
      } catch (Exception localException) { K.error("Exception levee", localException); }

  }

  public static void m(ckT paramckT)
  {
    dAn.m(paramckT);
    cHu localcHu = bVl.caZ().cbc();
    while (localcHu.hasNext()) {
      localcHu.fl();
      ob localob = (ob)localcHu.value();
      localob.setVisible(localob.vK().isVisible());
    }
  }

  public void AP(int paramInt) {
    boolean bool = false;
    switch (paramInt) {
    case 0:
      this.lkJ = true;
      bool = false;
      break;
    case 1:
      this.lkJ = false;
      bool = false;
      break;
    case 2:
      this.lkJ = false;
      bool = true;
      break;
    default:
      K.error("FightLODLevel inconnu " + paramInt);
    }
    this.lkL.iA(bool);
    cUl();
  }

  public static void j(czN paramczN) {
    dAn.s(paramczN);
  }

  public ArrayList ar(float paramFloat1, float paramFloat2)
  {
    this.kSO.clear();
    dAn.ak(this.kSO);
    for (int i = this.kSO.size() - 1; i >= 0; i--) {
      if (!((dCb)this.kSO.get(i)).w(paramFloat1, paramFloat2)) {
        this.kSO.remove(i);
      }
    }
    return this.kSO;
  }
}