import java.util.Arrays;

public class aTu extends bGk
{
  float eRi = 0.1F;
  private static final int eRj = 64;
  private final float[] eRk = new float[4096];
  private rp cHC;
  private float eRl;
  private float eRm;
  private float aZs;
  private float aZt;
  private int eRn;
  private int eRo;
  private int eRp;
  private int eRq;
  private final cEi eRr = new cEi(-1.0F, 0.5F, 0.0F);

  private boolean eRs = false;
  float eRt = 0.5F;
  float eRu = 0.5F;

  private int eRv = -2147483648;
  private int eRw = -2147483648;
  private float bIj;
  private float bIk;
  private float bIl;
  private float bIm;
  private final amr eRx = new aAr(this);

  private final bzA eRy = new bzA("cloud.tga", this.eRx);
  private final dUX eRz = this.eRy;

  public aTu() {
    this.aZs = 0.0F;
    this.aZt = 0.0F;
    this.eRp = 2147483647;
    this.eRq = 2147483647;

    Arrays.fill(this.eRk, 1.0F);
  }

  public void dF(String paramString) {
    if (this.eRz == this.eRy)
      this.eRy.jt(paramString);
  }

  public void a(rp paramrp)
  {
    this.cHC = paramrp;
  }

  public void J(float paramFloat1, float paramFloat2) {
    this.eRr.m(paramFloat1, paramFloat2, 0.0F);
  }

  public void aV(float paramFloat) {
    if (!bCO.X(paramFloat, this.eRu)) {
      this.eRu = paramFloat;
      this.eRs = true;
    }
  }

  public void aW(float paramFloat) {
    if (!bCO.X(paramFloat, this.eRt)) {
      this.eRt = paramFloat;
      this.eRs = true;
    }
  }

  public void aX(float paramFloat) {
    paramFloat = bCO.t(paramFloat, 0.0F, 0.7F);
    if (!bCO.X(paramFloat, this.eRi)) {
      this.eRi = paramFloat;
      this.eRs = true;
    }
  }

  public void aId() {
    rp localrp = this.cHC;
    if (localrp == null) {
      return;
    }
    this.eRp = (bCO.bD(localrp.xV()) - 32);
    this.eRq = (bCO.bD(localrp.xW()) - 32);

    biR();

    int i = this.eRp + this.eRn;
    int j = this.eRq + this.eRo;

    if ((this.eRv != i) || (this.eRw != j) || (this.eRs)) {
      this.eRz.a(this.eRk, 64, 64, i, j);
    }

    this.eRs = false;
    this.eRv = i;
    this.eRw = j;
  }

  public void update(int paramInt) {
    float f = paramInt / 1000.0F;
    this.eRl = (this.eRr.getX() * f);
    this.eRm = (this.eRr.getY() * f);
  }

  private void biR() {
    this.aZs -= this.eRl;
    this.aZt -= this.eRm;

    int i = bCO.bD(this.aZs);
    this.eRn += i;
    this.aZs -= i;

    int j = bCO.bD(this.aZt);
    this.eRo += j;
    this.aZt -= j;

    float f1 = this.aZs; float f2 = this.aZt;

    this.bIj = ((1.0F - f1) * (1.0F - f2));
    this.bIk = ((1.0F - f1) * f2);
    this.bIl = (f1 * (1.0F - f2));
    this.bIm = (f1 * f2);
  }

  public int getPriority() {
    return 100;
  }

  public boolean wS() {
    return (this.eRt == 0.0F) && (this.eRu == 0.0F);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    try {
      float[] arrayOfFloat = this.eRk;

      int i = paramInt1 - this.eRp;
      i %= 64;
      if (i < 0)
        i += 64;
      int j = (i + 1) % 64;

      int k = paramInt2 - this.eRq;
      k %= 64;
      if (k < 0)
        k += 64;
      int m = (k + 1) % 64;

      int n = i + k * 64;
      int i1 = i + m * 64;
      int i2 = j + k * 64;
      int i3 = j + m * 64;

      float f = this.bIj * arrayOfFloat[n] + this.bIk * arrayOfFloat[i1] + this.bIl * arrayOfFloat[i2] + this.bIm * arrayOfFloat[i3];

      paramArrayOfFloat[0] *= f;
      paramArrayOfFloat[1] *= f;
      paramArrayOfFloat[2] *= f;
    }
    catch (Exception localException)
    {
    }
  }
}