import org.apache.log4j.Logger;

public class ayj
  implements cFh
{
  private static final Logger K;
  public static final int dNV = 300;
  private static final float[][] dNW;
  private static final ayj dNX = new ayj();
  private static final int dNY = 0;
  public static final int dNZ = 0;
  private boolean dOa = true;
  private int dOb = 2147483647;

  private final jw dOc = new jw(this);

  public static ayj aJY()
  {
    return dNX;
  }

  public static boolean la(int paramInt) {
    return paramInt == 0;
  }

  public final float[] a(aVn paramaVn)
  {
    int i = paramaVn.OV();
    float[] arrayOfFloat;
    try
    {
      arrayOfFloat = this.dOc.bc(i);
      if (arrayOfFloat != null)
        return arrayOfFloat;
    }
    catch (Exception localException1) {
      K.error("", localException1);
      return new float[] { 1.0F, 0.5F, 0.5F, 1.0F };
    }
    boolean bool;
    try
    {
      bool = bu(this.dOb, i);
    } catch (Exception localException2) {
      K.error("", localException2);
      return new float[] { 1.0F, 1.0F, 1.0F, 1.0F };
    }

    if (bool)
      arrayOfFloat = new float[] { 1.0F, 1.0F, 1.0F, 1.0F };
    else {
      arrayOfFloat = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };
    }

    this.dOc.b(i, arrayOfFloat);
    return arrayOfFloat;
  }

  public final boolean bu(int paramInt1, int paramInt2) {
    try {
      return LC.We().ad(paramInt1, paramInt2); } catch (Exception localException) {
    }
    return true;
  }

  public final void a(cXf paramcXf, float paramFloat1, float paramFloat2)
  {
    if (this.dOc.aLw == dNW) {
      this.dOc.setCapacity(LC.We().Wf());
      if ((!bB) && (this.dOc.aLw == dNW)) throw new AssertionError();
    }
  }

  public final void a(cXf paramcXf, int paramInt)
  {
    aWe localaWe = paramcXf.cKV();
    int i = localaWe.OV();

    boolean bool1 = false;
    if (i != this.dOb) {
      this.dOc.clearCache();

      boolean bool2 = lb(i);
      bool1 = this.dOa != bool2;
      this.dOa = bool2;
      this.dOb = i;
    }
    try
    {
      this.dOc.c(paramInt, bool1);
    } catch (Exception localException) {
      K.error("Problèlme de fade de layer maskKey=" + i);
      this.dOb = (i == 0 ? 2147483647 : 0);
    }
  }

  public final boolean aJZ() {
    return lb(this.dOb);
  }

  public final boolean lb(int paramInt) {
    return bu(paramInt, 0);
  }

  public final void clear() {
    this.dOb = 2147483647;
    this.dOa = true;
    this.dOc.clear();
  }

  static
  {
    K = Logger.getLogger(ayj.class);

    dNW = new float[1][];

    dNW[0] = { 1.0F, 1.0F, 1.0F, 1.0F };
  }
}