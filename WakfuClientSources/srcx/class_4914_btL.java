import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class btL
  implements aWi
{
  public static final btL gcv = new btL();

  private final ArrayList gcw = new ArrayList();

  private final ArrayList gcx = new ArrayList(3000);

  private static final Comparator gcy = new bio();

  private final bMp gcz = bMp.bTJ();
  private final ArrayList gcA = new ArrayList(8);
  private final ArrayList gcB = new ArrayList(3);

  private final ArrayList gcC = new ArrayList(8);

  private final ArrayList gcD = new ArrayList();
  private float gcE;
  private float gcF;
  private boolean gcG = true; private boolean gcH = true;

  private boolean gcI = true;

  private final float[] gcJ = new float[6];

  private btL()
  {
    this.gcA.add(this.gcz);
  }

  public void initialize()
  {
    bSj.hcO.a(new r(), this);
    reset();
  }

  public boolean bBT() {
    return this.gcI;
  }

  public void fn(boolean paramBoolean) {
    this.gcI = paramBoolean;
  }

  public bGL kG(int paramInt) {
    return awd.aIc().kG(paramInt);
  }

  public void qP(int paramInt) {
    bGL localbGL = kG(paramInt);
    if (localbGL != null)
      localbGL.setEnabled(true);
  }

  public void qQ(int paramInt) {
    bGL localbGL = kG(paramInt);
    if (localbGL != null)
      localbGL.setEnabled(false);
  }

  public void kF(int paramInt) {
    awd.aIc().kF(paramInt);
  }

  public void cA(int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      kF(paramInt1);
      return;
    }
    bGL localbGL = kG(paramInt1);
    if (localbGL != null)
      localbGL.shutdown(paramInt2);
  }

  public void a(bxu parambxu) {
    awd.aIc().c((bGL)parambxu);
  }

  public void b(bxu parambxu) {
    awd.aIc().kF(parambxu.getId());
  }

  public void a(cnk paramcnk) {
    if (!this.gcw.contains(paramcnk))
      this.gcw.add(paramcnk);
  }

  public void b(cnk paramcnk) {
    this.gcw.remove(paramcnk);
  }

  public void a(agk paramagk) {
    if (!this.gcA.contains(paramagk)) {
      this.gcA.add(paramagk);
      Collections.sort(this.gcA, gcy);
      if ((paramagk instanceof bGk))
        this.gcB.add((bGk)paramagk);
    }
  }

  public void b(agk paramagk)
  {
    this.gcA.remove(paramagk);

    this.gcB.remove(paramagk);
  }

  public void a(aON paramaON) {
    if (!this.gcD.contains(paramaON))
      this.gcD.add(paramaON);
  }

  public void b(aON paramaON)
  {
    this.gcD.remove(paramaON);
  }

  public void c(adG paramadG, int paramInt) {
    qR(paramInt);
    if (!this.gcI) {
      return;
    }

    g(paramadG);
    if (this.gcz.bTK()) {
      bBW();
      bBV();
      this.gcz.gl(false);
    } else {
      if (this.gcG) {
        bBW();
      }
      if (this.gcH) {
        bBV();
      }
    }
    bBX();

    bBU();
    bBY();
  }

  private void qR(int paramInt) {
    qS(paramInt);
    awd.aIc().d(this.gcF, paramInt);
  }

  private void bBU() {
    this.gcC.clear();
    int i = 0; for (int j = this.gcA.size(); i < j; i++) {
      agk localagk = (agk)this.gcA.get(i);
      if (!localagk.wS())
        this.gcC.add(localagk);
    }
  }

  private void bBV() {
    this.gcz.bT(this.gcF);
    this.gcH = false;
  }

  private void bBW() {
    this.gcz.bS(this.gcE);
    this.gcG = false;
  }

  private void qS(int paramInt)
  {
    int i = 0; for (int j = this.gcA.size(); i < j; i++)
      ((agk)this.gcA.get(i)).update(paramInt);
  }

  private void g(adG paramadG)
  {
    rp localrp = paramadG.apF();

    int i = 2147483647;
    int j = -2147483648;
    int k = 2147483647;
    int m = -2147483648;

    this.gcx.clear();

    int n = this.gcw.size();
    for (int i1 = 0; i1 < n; i1++) {
      ((cnk)this.gcw.get(i1)).a(localrp, this.gcx);
    }

    i1 = this.gcx.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      bgL localbgL = (bgL)this.gcx.get(i2);
      int i4 = localbgL.fa();
      int i5 = localbgL.fb();

      if (i4 < i) {
        i = i4;
      }
      if (i4 > j) {
        j = i4;
      }
      if (i5 < k) {
        k = i5;
      }
      if (i5 > m) {
        m = i5;
      }
    }

    i2 = 0; for (int i3 = this.gcB.size(); i2 < i3; i2++)
      ((bGk)this.gcB.get(i2)).setBounds(i, k, j - i + 1, m - k + 1);
  }

  private void bBX()
  {
    int i = 0; for (int j = this.gcB.size(); i < j; i++)
      ((bGk)this.gcB.get(i)).aId();
  }

  private void bBY()
  {
    int i = 0; for (int j = this.gcx.size(); i < j; i++) {
      bgL localbgL = (bgL)this.gcx.get(i);

      int k = localbgL.fa();
      int m = localbgL.fb();
      int n = localbgL.fc();
      int i1 = localbgL.OW();

      b(k, m, n, i1, this.gcJ);
      localbgL.d(this.gcJ);
    }
  }

  private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    paramArrayOfFloat[0] = 1.0F;
    paramArrayOfFloat[1] = 1.0F;
    paramArrayOfFloat[2] = 1.0F;

    int i = 0; for (int j = this.gcC.size(); i < j; i++)
      ((agk)this.gcC.get(i)).a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfFloat);
  }

  public void reset()
  {
    this.gcA.clear();
    this.gcB.clear();
    bv(1.0F);
    this.gcG = true;
    this.gcH = true;

    awd.aIc().clear();
    a(this.gcz);
    a(aaS.anD());
    a(bvr.bDd());
    a(awd.aIc());
  }

  public void ie() {
    this.gcz.gl(true);
  }

  public void P(float paramFloat1, float paramFloat2) {
    int i = this.gcD.size();
    int j;
    if (!byn.S(this.gcE, paramFloat1)) {
      this.gcE = paramFloat1;
      this.gcG = true;
      for (j = 0; j < i; j++) {
        ((aON)this.gcD.get(j)).aQ(this.gcE);
      }
    }

    if (!byn.S(this.gcF, paramFloat2)) {
      this.gcF = paramFloat2;
      this.gcH = true;
      for (j = 0; j < i; j++)
        ((aON)this.gcD.get(j)).aR(this.gcF);
    }
  }

  public void bv(float paramFloat)
  {
    float f1 = paramFloat > 0.001F ? paramFloat : 0.0F;
    float f2 = paramFloat < -0.001F ? -paramFloat : 0.0F;
    P(f1, f2);
  }

  public float bBZ() {
    return this.gcF;
  }

  public float bCa() {
    return this.gcE;
  }
}