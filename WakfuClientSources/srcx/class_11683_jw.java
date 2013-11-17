import java.util.Arrays;

final class jw
{
  private static final float aLu = 0.003333333F;
  private static final float aLv = 2.0F;
  float[][] aLw;
  private final cSi aLx = new cSi(20);
  private int[] aLy;
  private boolean[] aLz;
  private boolean[] aLA;

  jw(ayj paramayj)
  {
    clear();
  }

  void clear() {
    this.aLw = ayj.aKa();
    this.aLz = null;
    this.aLA = null;
    this.aLx.reset();
    this.aLy = null;
  }

  float[] bc(int paramInt) {
    return this.aLw[(-paramInt)];
  }

  void b(int paramInt, float[] paramArrayOfFloat) {
    this.aLx.add(paramInt);
    if (paramInt < 0) {
      paramInt = -paramInt;
    }
    if ((!bB) && (this.aLw[paramInt] != null)) throw new AssertionError("Le groupe est déjà en cache");
    this.aLw[paramInt] = paramArrayOfFloat;
    this.aLy = null;
  }

  void setCapacity(int paramInt) {
    if ((!bB) && (this.aLw != ayj.aKa())) throw new AssertionError();
    if ((!bB) && (this.aLA != null)) throw new AssertionError();
    if ((!bB) && (this.aLz != null)) throw new AssertionError();

    this.aLw = new float[paramInt][];
    this.aLA = new boolean[paramInt];
    this.aLz = new boolean[paramInt];
  }

  private boolean a(float[] paramArrayOfFloat, float paramFloat)
  {
    if (paramArrayOfFloat == null) {
      return false;
    }
    if (paramArrayOfFloat[0] > 0.0F) {
      paramFloat *= 2.0F;
      paramArrayOfFloat[0] -= paramFloat;
      paramArrayOfFloat[1] -= paramFloat;
      paramArrayOfFloat[2] -= paramFloat;
      if (paramArrayOfFloat[0] < 0.0F) {
        paramArrayOfFloat[3] -= -paramArrayOfFloat[0];
        float tmp66_65 = (paramArrayOfFloat[2] = 0.0F); paramArrayOfFloat[1] = tmp66_65; paramArrayOfFloat[0] = tmp66_65;
        if (paramArrayOfFloat[3] < 0.0F) {
          paramArrayOfFloat[3] = 0.0F;
        }
      }
      return false;
    }
    if (paramArrayOfFloat[3] > 0.0F) {
      paramArrayOfFloat[3] -= paramFloat;
      if (paramArrayOfFloat[3] < 0.0F) {
        paramArrayOfFloat[3] = 0.0F;
      }
      return false;
    }
    return true;
  }

  private boolean b(float[] paramArrayOfFloat, float paramFloat) {
    if (paramArrayOfFloat == null) {
      return false;
    }
    if (paramArrayOfFloat[0] > 0.0F) {
      paramArrayOfFloat[0] -= paramFloat;
      paramArrayOfFloat[1] -= paramFloat;
      paramArrayOfFloat[2] -= paramFloat;
      paramArrayOfFloat[3] -= paramFloat;
      if (paramArrayOfFloat[0] < 0.0F)
      {
        float tmp63_62 = (paramArrayOfFloat[2] = paramArrayOfFloat[3] = 0.0F); paramArrayOfFloat[1] = tmp63_62; paramArrayOfFloat[0] = tmp63_62;
      }
      return false;
    }
    return true;
  }

  private boolean c(float[] paramArrayOfFloat, float paramFloat) {
    if (paramArrayOfFloat == null) {
      return false;
    }
    if (paramArrayOfFloat[3] < 1.0F) {
      paramArrayOfFloat[3] += 2.0F * paramFloat;
      if (paramArrayOfFloat[3] > 1.0F) {
        paramFloat = paramArrayOfFloat[3] - 1.0F;
        paramArrayOfFloat[0] += paramFloat;
        paramArrayOfFloat[1] += paramFloat;
        paramArrayOfFloat[2] += paramFloat;
        paramArrayOfFloat[3] = 1.0F;
        if (paramArrayOfFloat[0] > 1.0F)
        {
          float tmp79_78 = (paramArrayOfFloat[2] = 1.0F); paramArrayOfFloat[1] = tmp79_78; paramArrayOfFloat[0] = tmp79_78;
        }
      }
      return false;
    }
    if (paramArrayOfFloat[0] < 1.0F) {
      paramArrayOfFloat[0] += paramFloat;
      paramArrayOfFloat[1] += paramFloat;
      paramArrayOfFloat[2] += paramFloat;
      if (paramArrayOfFloat[0] > 1.0F)
      {
        float tmp130_129 = (paramArrayOfFloat[2] = 1.0F); paramArrayOfFloat[1] = tmp130_129; paramArrayOfFloat[0] = tmp130_129;
      }
      return false;
    }
    return true;
  }

  private boolean d(float[] paramArrayOfFloat, float paramFloat) {
    if (paramArrayOfFloat == null) {
      return false;
    }
    if (paramArrayOfFloat[0] < 1.0F) {
      paramArrayOfFloat[0] += paramFloat;
      paramArrayOfFloat[1] += paramFloat;
      paramArrayOfFloat[2] += paramFloat;
      paramArrayOfFloat[3] += paramFloat;
      if (paramArrayOfFloat[0] > 1.0F)
      {
        float tmp63_62 = (paramArrayOfFloat[2] = paramArrayOfFloat[3] = 1.0F); paramArrayOfFloat[1] = tmp63_62; paramArrayOfFloat[0] = tmp63_62;
      }
      return false;
    }
    return true;
  }

  void c(int paramInt, boolean paramBoolean) {
    float f = 0.003333333F * paramInt;
    int i = this.aLx.size();
    if (this.aLy == null) {
      this.aLy = new int[i];
      this.aLx.h(this.aLy, 0, i);
      Arrays.sort(this.aLy);
    }

    for (int j = 0; j < i; j++) {
      int k = this.aLy[j];
      int m = k > 0 ? k : -k;
      if (this.aLA[m] == 0)
      {
        if (paramBoolean) {
          this.aLz[m] = true;
        }

        float[] arrayOfFloat = this.aLw[m];

        if ((ayj.la(k)) || (this.aLz[m] != 0)) {
          if (a(k, arrayOfFloat, f)) {
            v(m, k);
          }

        }
        else if (b(k, arrayOfFloat, f))
          v(m, k);
      }
    }
  }

  private void v(int paramInt1, int paramInt2)
  {
    this.aLw[paramInt1] = null;
    this.aLz[paramInt1] = false;
    Cu.b(this.aLx, paramInt2);
  }

  private boolean a(int paramInt, float[] paramArrayOfFloat, float paramFloat)
  {
    if (this.aLB.bu(ayj.a(this.aLB), paramInt)) {
      if (c(paramArrayOfFloat, paramFloat)) {
        this.aLA[(paramInt > 0 ? paramInt : -paramInt)] = true;
      }
      return false;
    }

    if (a(paramArrayOfFloat, paramFloat)) {
      this.aLA[(paramInt > 0 ? paramInt : -paramInt)] = true;
      return true;
    }
    return false;
  }

  private boolean b(int paramInt, float[] paramArrayOfFloat, float paramFloat)
  {
    if (this.aLB.bu(ayj.a(this.aLB), paramInt)) {
      if (d(paramArrayOfFloat, paramFloat)) {
        this.aLA[(paramInt > 0 ? paramInt : -paramInt)] = true;
      }
      return false;
    }

    if (b(paramArrayOfFloat, paramFloat)) {
      this.aLA[(paramInt > 0 ? paramInt : -paramInt)] = true;
      return true;
    }
    return false;
  }

  void clearCache() {
    if (this.aLA == null) {
      return;
    }
    int i = 0; for (int j = this.aLA.length; i < j; i++) {
      this.aLA[i] = false;
    }
    i = 0; for (j = this.aLz.length; i < j; i++)
      this.aLz[i] = false;
  }
}