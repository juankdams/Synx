import org.apache.log4j.Logger;

public class bzA
  implements dUX
{
  protected static Logger K = Logger.getLogger(bzA.class);

  private static final String gnI = byn.bFr().bFt() + "textures/";
  private final amr gnJ;
  private float[] gnK = null;
  private int ia;
  private int ib;

  public bzA(String paramString, amr paramamr)
  {
    this.gnJ = paramamr;
    String str = gnI + paramString;
    jt(str);
  }

  void jt(String paramString) {
    aoI localaoI = dCs.dfa().qP("TGA");
    crX localcrX = localaoI.bU(paramString);
    if (localcrX == null) {
      return;
    }
    cSJ localcSJ = localcrX.wn(0);
    this.ia = localcSJ.getWidth();
    this.ib = localcSJ.getHeight();

    this.gnK = new float[this.ib * this.ia];

    for (int i = 0; i < this.ib; i++) {
      int j = i * this.ia;
      for (int k = 0; k < this.ia; k++) {
        bNa localbNa = localcSJ.ez(k, i);
        this.gnK[(j + k)] = localbNa.QC();
      }
    }
    localcrX.axl();
  }

  public void a(float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.gnK == null) {
      return;
    }
    int i = paramInt3 % this.ia;
    if (i < 0)
      i += this.ia;
    int j = paramInt4 % this.ib;
    if (j < 0)
      j += this.ib;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    if (this.gnJ == null)
      for (k = j; k < j + paramInt2; k++) {
        m = k % this.ib;
        n = m * this.ia;
        i1 = (k - j) * paramInt2 - i;
        for (i2 = i; i2 < i + paramInt1; i2++) {
          i3 = i2 % this.ia;
          paramArrayOfFloat[(i1 + i2)] = this.gnK[(n + i3)];
        }
      }
    else
      for (k = j; k < j + paramInt2; k++) {
        m = k % this.ib;
        n = m * this.ia;
        i1 = (k - j) * paramInt2 - i;
        for (i2 = i; i2 < i + paramInt1; i2++) {
          i3 = i2 % this.ia;
          paramArrayOfFloat[(i1 + i2)] = this.gnJ.d(i3, m, this.gnK[(n + i3)]);
        }
      }
  }
}