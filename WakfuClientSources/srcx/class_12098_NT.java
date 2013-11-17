import com.sun.opengl.cg.CGparameter;

class NT
{
  public final CGparameter ceK;
  public final String m_name;
  private float ceL;
  private float[] ceM;

  NT(String paramString, CGparameter paramCGparameter)
  {
    this.m_name = paramString;
    this.ceK = paramCGparameter;
  }

  public boolean S(float paramFloat) {
    return this.ceL == paramFloat;
  }

  public void T(float paramFloat) {
    this.ceL = paramFloat;
  }

  public boolean c(float[] paramArrayOfFloat, int paramInt1, int paramInt2) {
    if (this.ceM == null) {
      return false;
    }
    for (int i = 0; i < paramInt2; i++) {
      if (this.ceM[i] != paramArrayOfFloat[(paramInt1 + i)]) {
        return false;
      }
    }
    return true;
  }

  public void d(float[] paramArrayOfFloat, int paramInt1, int paramInt2) {
    if (this.ceM == null) {
      this.ceM = new float[paramInt2];
    }

    for (int i = 0; i < paramInt2; i++)
      this.ceM[i] = paramArrayOfFloat[(paramInt1 + i)];
  }
}