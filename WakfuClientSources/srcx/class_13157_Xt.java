import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Xt
{
  private static final Logger K = Logger.getLogger(Xt.class);
  private final HM[][] cHM;
  private final UG iM;
  private final cSi cHN = new cSi();

  public Xt(UG paramUG) {
    this.iM = paramUG;
    this.cHM = new HM[paramUG.getWidth()][paramUG.getHeight()];
    a(paramUG);
    ajr();
  }

  private void ajr() {
    this.cHN.clear();

    int i = this.iM.getWidth();
    int j = this.iM.getHeight();

    for (int k = 0; k < i; k++) {
      for (int m = 0; m < j; m++) {
        for (dhM localdhM : this.cHM[k][m].bQb) {
          if (!this.cHN.contains(localdhM.ldE)) {
            this.cHN.add(localdhM.ldE);
          }
        }
      }
    }
    this.cHN.sort();
  }

  private void a(UG paramUG) {
    int i = paramUG.getWidth();
    int j = paramUG.getHeight();
    int k = paramUG.getMinX();
    int m = paramUG.getMinY();
    int n = paramUG.ahP();
    int i1 = paramUG.ahQ();

    boolean[][] arrayOfBoolean = b(paramUG);

    for (int i2 = 0; i2 < i; i2++)
      for (int i3 = 0; i3 < j; i3++)
        if (arrayOfBoolean[i2][i3] != 0) {
          boolean bool = paramUG.aq(i2 + k, i3 + m);
          this.cHM[i2][i3] = HM.a(bool, i2 + k, i3 + m, n, i1);
        } else {
          this.cHM[i2][i3] = HM.bQc;
        }
  }

  private boolean[][] b(UG paramUG)
  {
    int i = paramUG.getWidth();
    int j = paramUG.getHeight();
    int k = paramUG.getMinX();
    int m = paramUG.getMinY();

    boolean[][] arrayOfBoolean = new boolean[paramUG.getWidth()][paramUG.getHeight()];
    int i1;
    int i2;
    int i3;
    for (int n = 0; n < i; n++) {
      i1 = -1;
      i2 = j;
      for (i3 = 0; i3 < j; i3++) {
        if (paramUG.aq(n + k, i3 + m)) {
          i1 = i3;
          break;
        }
      }
      for (i3 = j - 1; i3 >= i1; i3--) {
        if (paramUG.aq(n + k, i3 + m)) {
          i2 = i3;
          break;
        }
      }

      i2 = Math.min(j - 1, i2);
      for (i3 = Math.max(0, i1); i3 <= i2; i3++) {
        arrayOfBoolean[n][i3] = 1;
      }

      if (i1 != -1)
      {
        for (i3 = i1; i3 <= i2; i3++) {
          arrayOfBoolean[n][i3] = 1;
        }
      }

    }

    for (n = 0; n < j; n++) {
      i1 = -1;
      i2 = i;
      for (i3 = 0; i3 < i; i3++) {
        if (paramUG.aq(i3 + k, n + m)) {
          i1 = i3;
          break;
        }
      }
      for (i3 = i - 1; i3 >= Math.max(0, i1); i3--) {
        if (paramUG.aq(i3 + k, n + m)) {
          i2 = i3;
          break;
        }
      }
      i2 = Math.min(i - 1, i2);
      if (i1 != -1) {
        if ((!bB) && (i2 == i)) throw new AssertionError();
        for (i3 = i1; i3 <= i2; i3++) {
          arrayOfBoolean[i3][n] = 1;
        }
      }
    }
    return arrayOfBoolean;
  }

  public baX o(int paramInt1, int paramInt2, int paramInt3) {
    if (!this.iM.p(paramInt1, paramInt2)) {
      return null;
    }
    int i = paramInt1 - this.iM.getMinX();
    int j = paramInt2 - this.iM.getMinY();

    dhM localdhM = this.cHM[i][j].eU(paramInt3);
    if (localdhM == null) {
      return null;
    }

    int k = a(localdhM, i, j + 1);
    int m = a(localdhM, i + 1, j);
    int n = localdhM.ldE;
    return new baX(localdhM.fiX, n, n - k, n - m, paramInt1, paramInt2, localdhM.fiY);
  }

  public int ajs() {
    return this.iM.ahP();
  }

  public HM aJ(int paramInt1, int paramInt2) {
    if (!this.iM.p(paramInt1, paramInt2)) {
      return null;
    }
    return this.cHM[(paramInt1 - this.iM.getMinX())][(paramInt2 - this.iM.getMinY())];
  }

  public boolean p(int paramInt1, int paramInt2) {
    return this.iM.p(paramInt1 + this.iM.getMinX(), paramInt2 + this.iM.getMinY());
  }

  private int a(dhM paramdhM, int paramInt1, int paramInt2) {
    if (!p(paramInt1, paramInt2)) {
      return this.iM.ahP();
    }
    HM localHM = this.cHM[paramInt1][paramInt2];

    dhM localdhM = localHM.eV(paramdhM.ldE);
    if (localdhM == null) {
      return !localHM.bQb.isEmpty() ? paramdhM.ldE : this.iM.ahP();
    }
    return Math.max(paramdhM.ldD, localdhM.ldE);
  }

  public float aa(float paramFloat) {
    int i = this.cHN.indexOf((int)paramFloat);
    return i / this.cHN.size();
  }
}