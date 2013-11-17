public class aOf extends bGk
  implements aON
{
  public static final aOf eup = new aOf();

  private final aoL cSR = new aoL();
  private final dPx euq = new dPx();

  private float eur = 0.65F;
  private float eus = 0.0F;
  private float cas = 0.65F;
  private boolean eut = true;

  private final bEw euu = new bEw();
  private boolean Vm = true;
  private boolean euv = true;

  private final dVT euw = new dVT(512);

  private final bhG eux = new big(this);

  private final eH euy = new bie(this);
  private static final float euz = 0.09803922F;

  public void aQ(float paramFloat)
  {
    aS(paramFloat);
  }

  public void aR(float paramFloat)
  {
  }

  public void aS(float paramFloat)
  {
    this.eur = (paramFloat < 0.0F ? 0.0F : paramFloat);
    this.eut = (!byn.S(this.eus, this.eur));
    if (this.eut)
      this.eus = this.eur;
  }

  public void nm(int paramInt)
  {
    this.cas = paramInt;
    this.eut = true;
  }

  public void aId()
  {
    if (this.euv) {
      this.euu.clear();
      this.euu.ensureCapacity(this.cSR.size());
      this.euv = false;
    }

    this.cSR.b(this.eux);

    if (!this.Vm) {
      return;
    }

    this.Vm = false;

    this.euw.reset();
    this.euu.a(this.euy);
    this.euw.normalize();
  }

  public int getPriority() {
    return 200;
  }

  public boolean wS() {
    return byn.S(this.eur, 0.0F);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    this.euw.a(paramInt1, paramInt2, paramArrayOfFloat);
  }

  public void update(int paramInt) {
    if ((!this.eut) && (!this.euq.isEmpty())) {
      return;
    }
    this.cas = 0.8F;

    for (cSO localcSO : cSO.values()) {
      byte b = a(localcSO);

      if (b > 0)
      {
        int k = b + 1;
        int m = 3;

        float[] arrayOfFloat = new float[k * 3];
        this.euq.c(b, arrayOfFloat);

        for (int n = 0; n < arrayOfFloat.length; n++) {
          arrayOfFloat[n] = 1.0F;
        }
        float f1 = 0.09803922F * this.eur;
        for (int i1 = 0; i1 < k; tmp191_190++) {
          float f2 = (i1 == 0) || (i1 == k - 1) ? f1 * 0.5F : f1;

          arrayOfFloat[(i1 + k)] = (1.0F - f2);
          long tmp191_190 = (1.0F - 0.4F * f2); arrayOfFloat[(i1 + 2 * k)] = tmp191_190; arrayOfFloat[i1] = tmp191_190;
        }
      }
    }

    this.eut = false;
    this.Vm = true;
  }

  public final void k(azX paramazX)
  {
    int i = paramazX.aLU().cII();
    if (i <= 0)
      return;
    this.cSR.put(n(paramazX), paramazX);
    this.euv = true;
  }

  public final void h(azX paramazX) {
    this.cSR.remove(n(paramazX));
    this.euv = true;
  }

  private static long n(azX paramazX) {
    return bCO.cM(paramazX.fa(), paramazX.fb());
  }

  byte o(azX paramazX)
  {
    if (!paramazX.isVisible()) {
      return 0;
    }
    if ((paramazX.aLR() == 0) || (paramazX.aLR() == 16))
    {
      return 0;
    }
    return a(paramazX.aLU());
  }

  private byte a(cSO paramcSO) {
    return (byte)(int)(paramcSO.cII() * this.cas);
  }
}