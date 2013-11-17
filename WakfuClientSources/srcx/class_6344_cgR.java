import org.apache.log4j.Logger;

public class cgR
{
  private static final Logger K = Logger.getLogger(cgR.class);
  public static final String hEL = "gColorScale";
  private final cbW[] hEM;
  private final int[] hEN;
  private final float[] fru;

  public static cgR b(cgR paramcgR)
  {
    if (paramcgR == null)
      return null;
    return new cgR(paramcgR);
  }

  public float getFloat(String paramString) {
    int i = getIndex(paramString);
    if (i >= 0) {
      return this.fru[i];
    }
    return 0.0F;
  }

  public cgR(cbW[] paramArrayOfcbW)
  {
    this.hEM = new cbW[paramArrayOfcbW.length + 1];
    this.hEM[0] = new cbW("gColorScale", bHf.gFo);
    System.arraycopy(paramArrayOfcbW, 0, this.hEM, 1, paramArrayOfcbW.length);
    int i = this.hEM.length;
    this.hEN = new int[i];
    int j = 0;
    for (int k = 0; k < i; k++) {
      this.hEN[k] = j;
      j += this.hEM[k].hto.getSize();
    }
    this.fru = new float[j];

    setFloat("gColorScale", 2.0F);
  }

  private cgR(cgR paramcgR) {
    this.hEM = ((cbW[])paramcgR.hEM.clone());
    this.hEN = ((int[])paramcgR.hEN.clone());
    this.fru = ((float[])paramcgR.fru.clone());
  }

  public final void setFloat(String paramString, float paramFloat) {
    int i = getIndex(paramString);
    if ((!bB) && (kY(paramString) != bHf.gFo)) throw new AssertionError();
    if (i >= 0)
      this.fru[i] = paramFloat;
  }

  public final void a(String paramString, float paramFloat1, float paramFloat2)
  {
    int i = getIndex(paramString);
    if ((!bB) && (kY(paramString) != bHf.gFp)) throw new AssertionError();
    if (i >= 0) {
      this.fru[i] = paramFloat1;
      this.fru[(i + 1)] = paramFloat2;
    }
  }

  public final void b(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = getIndex(paramString);
    if ((!bB) && (kY(paramString) != bHf.gFq)) throw new AssertionError();
    if (i >= 0) {
      this.fru[i] = paramFloat1;
      this.fru[(i + 1)] = paramFloat2;
      this.fru[(i + 2)] = paramFloat3;
    }
  }

  public final void a(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    int i = getIndex(paramString);
    if ((!bB) && (kY(paramString) != bHf.gFr)) throw new AssertionError();
    if (i >= 0) {
      this.fru[i] = paramFloat1;
      this.fru[(i + 1)] = paramFloat2;
      this.fru[(i + 2)] = paramFloat3;
      this.fru[(i + 3)] = paramFloat4;
    }
  }

  public final void d(String paramString, float[] paramArrayOfFloat)
  {
    a(paramString, paramArrayOfFloat, bHf.gFq);
  }

  public final void e(String paramString, float[] paramArrayOfFloat) {
    a(paramString, paramArrayOfFloat, bHf.gFr);
  }

  public final void f(String paramString, float[] paramArrayOfFloat) {
    a(paramString, paramArrayOfFloat, bHf.gFs);
  }

  public final void a(hz paramhz)
  {
    int i = 0; for (int j = this.hEM.length; i < j; i++)
      paramhz.a(this.hEM[i], this.hEN[i], this.fru);
  }

  private void a(String paramString, float[] paramArrayOfFloat, bHf parambHf)
  {
    int i = getIndex(paramString);
    if (i >= 0) {
      if ((!bB) && (kY(paramString) != parambHf)) throw new AssertionError();
      if ((!bB) && (paramArrayOfFloat.length != parambHf.getSize())) throw new AssertionError();
      int j = 0; for (int k = paramArrayOfFloat.length; j < k; j++)
        this.fru[(i + j)] = paramArrayOfFloat[j];
    }
  }

  private int getIndex(String paramString)
  {
    int i = 0; for (int j = this.hEM.length; i < j; i++) {
      if (this.hEM[i].m_name.equals(paramString)) {
        return this.hEN[i];
      }
    }
    K.error("pas de variable nommé " + paramString);
    return -1;
  }

  private bHf kY(String paramString) {
    int i = 0; for (int j = this.hEM.length; i < j; i++) {
      if (this.hEM[i].m_name.equals(paramString)) {
        return this.hEM[i].hto;
      }
    }
    return null;
  }
}