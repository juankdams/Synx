import java.util.ArrayList;

final class cjn
  implements dGy
{
  private final ArrayList hIJ = new ArrayList(64);
  private float hIK;

  public boolean f(uz paramuz)
  {
    if (paramuz == null) {
      return true;
    }
    paramuz.gS();
    if (paramuz.gR() <= 0) {
      if ((!bB) && (paramuz.bpu() != 0)) throw new AssertionError();
      this.hIJ.add(paramuz);
      this.hIK += paramuz.Dy();
    }
    return true;
  }

  void reset() {
    this.hIJ.clear();
    this.hIK = 0.0F;
  }

  float a(ArrayList paramArrayList, float paramFloat) {
    float f = 0.0F;
    int i;
    int j;
    uz localuz;
    if (this.hIK > paramFloat)
    {
      i = clb();

      for (j = 0; j < i; j++) {
        localuz = (uz)this.hIJ.get(j);
        paramFloat -= localuz.Dy();
        paramArrayList.add(localuz);
        f += localuz.Dy();
        if (paramFloat < 0.0F)
          break;
      }
    }
    else {
      i = this.hIJ.size();
      for (j = 0; j < i; j++) {
        localuz = (uz)this.hIJ.get(j);
        paramArrayList.add(localuz);
        f += localuz.Dy();
      }
    }
    return f;
  }

  private int clb() {
    int i = this.hIJ.size();
    for (int j = 0; j < i; j++) {
      for (int k = j + 1; k < i; k++) {
        uz localuz1 = (uz)this.hIJ.get(j);
        uz localuz2 = (uz)this.hIJ.get(k);
        if (localuz2.Dz() > localuz1.Dz()) {
          this.hIJ.set(j, localuz2);
          this.hIJ.set(k, localuz1);
        }
      }
    }
    return i;
  }
}