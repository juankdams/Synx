import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class aCX
{
  private static final int bDE = 92;
  private final gB[] dXD;
  private float[] dXE;
  private final Random aFu = new Random(0L);
  private int aFv = 0;

  private jP dXF = new jP();

  public aCX() {
    this(92);
  }

  public aCX(int paramInt) {
    this.dXD = new gB[paramInt];
    for (int i = 0; i < paramInt; i++)
      this.dXD[i] = new gB(i);
    lX(this.dXF.ru());
  }

  public int getDuration() {
    return this.dXD.length;
  }

  public gB aOZ() {
    return this.dXD[(this.dXD.length - 1)];
  }

  public gB aPa() {
    return this.dXD[0];
  }

  public void a(jP paramjP) {
    this.dXF = paramjP;
  }

  public jP aPb() {
    return this.dXF;
  }

  public int aPc() {
    return this.aFv;
  }

  public void aJ(int paramInt) {
    this.aFv = paramInt;
    for (gB localgB : this.dXD)
      localgB.aJ(paramInt + localgB.getDayOfMonth() * 1000000);
  }

  public float rt() {
    return this.dXF.rt();
  }

  public void k(float paramFloat) {
    this.dXF.k(paramFloat);
  }

  public float rv() {
    return this.dXF.rv();
  }

  public void l(float paramFloat) {
    this.dXF.l(paramFloat);
  }

  public float oA() {
    return this.dXF.oA();
  }

  public void e(float paramFloat) {
    this.dXF.e(paramFloat);
  }

  public float oB() {
    return this.dXF.oB();
  }

  public void f(float paramFloat) {
    this.dXF.f(paramFloat);
  }

  public float rw() {
    return this.dXF.rw();
  }

  public void m(float paramFloat) {
    this.dXF.m(paramFloat);
  }

  public float rx() {
    return this.dXF.rx();
  }

  public void n(float paramFloat) {
    this.dXF.n(paramFloat);
  }

  public float ry() {
    return this.dXF.ry();
  }

  public void o(float paramFloat) {
    this.dXF.o(paramFloat);
  }

  public float rz() {
    return this.dXF.rz();
  }

  public void p(float paramFloat) {
    this.dXF.p(paramFloat);
  }

  public gB[] aPd() {
    return this.dXD;
  }

  public gB lW(int paramInt) {
    return this.dXD[paramInt];
  }

  public void lX(int paramInt)
  {
    this.dXF.bd(paramInt);
    this.dXE = new float[paramInt];

    float f1 = (float)(1.0D / Math.sqrt(6.283185307179586D));
    float f2 = paramInt / 15.0F;

    for (int i = 0; i < paramInt; i++)
      this.dXE[i] = ((float)(f1 * Math.exp(-(i * i) / (2.0F * f2 * f2))));
  }

  private void aPe() {
    float[] arrayOfFloat = new float[this.dXD.length];
    gB localgB;
    if (this.dXE.length > 0) {
      for (localgB : this.dXD) {
        int k = localgB.getDayOfMonth();

        arrayOfFloat[k] = (this.dXE[0] * this.dXD[k].oy());
        for (int m = 1; m < this.dXE.length; m++) {
          if (k + m < this.dXD.length)
            arrayOfFloat[k] += this.dXE[m] * this.dXD[(k + m)].oy();
          if (k - m >= 0)
            arrayOfFloat[k] += this.dXE[m] * this.dXD[(k - m)].oy();
        }
      }
    }
    for (localgB : this.dXD)
      localgB.c(arrayOfFloat[localgB.getDayOfMonth()]);
  }

  private void aPf() {
    for (gB localgB : this.dXD)
      localgB.c(0.0F);
  }

  private void aPg() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(Arrays.asList(this.dXD));

    int i = (int)(this.dXD.length * this.dXF.rt());
    for (int j = 0; j < i; j++) {
      gB localgB = (gB)localArrayList.remove((int)(this.aFu.nextFloat() * localArrayList.size()));
      localgB.c(1.0F);
    }
  }

  private void normalize() {
    float f1 = 0.0F;
    for (gB localgB1 : this.dXD) {
      f1 += localgB1.oy();
    }
    if (f1 > 0.0F) {
      float f2 = this.dXF.rv() / f1;
      for (gB localgB3 : this.dXD) {
        float f3 = localgB3.oy() * f2;
        if (f3 > 0.0F) {
          int n = 0;
        }
        localgB3.c(f3);
      }
    }

    for (gB localgB2 : this.dXD)
      localgB2.oK();
  }

  public void aPh()
  {
    for (gB localgB : this.dXD) {
      localgB.e(0.0F);
      localgB.f(0.0F);
    }
  }

  public void aPi() {
    float f1 = this.dXF.oA();
    float f2 = this.dXF.oB();
    float f3 = this.dXF.rw();
    float f4 = this.dXF.rx();

    for (gB localgB : this.dXD) {
      if (localgB.getDayOfMonth() == 0) {
        localgB.e(f1 + this.aFu.nextFloat() * (f2 - f1));
      } else {
        float f5 = this.dXD[(localgB.getDayOfMonth() - 1)].oB();
        localgB.e(Math.max(f1, f5 - (int)(f3 + this.aFu.nextFloat() * (f4 - f3))));
      }
      localgB.f(Math.min(f2, localgB.oA() + (int)(f3 + this.aFu.nextFloat() * (f4 - f3))));
    }
  }

  private void aPj()
  {
    for (gB localgB : this.dXD)
      localgB.d(0.0F);
  }

  private void aPk() {
    float f1 = this.dXF.ry();
    float f2 = this.dXF.rz();
    for (gB localgB : this.dXD) {
      localgB.d(f1 + this.aFu.nextFloat() * (f2 - f1));
      localgB.c(f1, f2);
    }
  }

  public void update()
  {
    lX(this.dXF.ru());
    aPl();
    aPm();
  }

  public void aPl() {
    this.aFu.setSeed(this.aFv);
    aPf();
    aPg();
    aPe();
    normalize();
    aPn();
  }

  public void aPm() {
    this.aFu.setSeed(this.aFv);
    aPh();
    aPi();
  }

  public void aPn() {
    this.aFu.setSeed(this.aFv);
    aPj();
    aPk();
  }
}