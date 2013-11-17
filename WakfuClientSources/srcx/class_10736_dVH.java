import javax.media.opengl.GL;

class dVH
{
  String m_name;
  float[] bRQ = null;
  long bYL;
  final deC muz = new deC();
  final deC muA = new deC();
  long muB;

  dVH(String paramString)
  {
    this.m_name = paramString;

    this.muz.jD(btS.gcZ);
    this.muA.jD(btS.gcZ);
  }

  public final void start() {
    this.muA.zO(1);
    this.bYL = System.nanoTime();
  }

  public final void jD(long paramLong) {
    this.muz.jD(paramLong);
    this.muA.jD(paramLong);
  }

  public final void lb(long paramLong) {
    this.muz.zO((int)(paramLong - this.bYL));
  }

  public String toString(String paramString) {
    return String.format("%15s|% 6.1f|% 6.1f|% 6.1f|% 6.1f|%3d", new Object[] { this.m_name + paramString, Double.valueOf(this.muz.kYv / 1000000.0D / this.muA.kYv), Double.valueOf(this.muz.kYv / 1000000.0D), Double.valueOf(this.muz.dWq / 1000000.0D), Double.valueOf(this.muz.beh / 1000000.0D), Integer.valueOf(this.muA.kYv) });
  }

  public void r(GL paramGL)
  {
    a(paramGL, this.muz, this.bRQ, 2.E-005D);
  }

  public static void a(GL paramGL, deC paramdeC, float[] paramArrayOfFloat, double paramDouble) {
    if (paramArrayOfFloat == null) {
      return;
    }
    paramGL.glColor4fv(paramArrayOfFloat, 0);
    paramGL.glBegin(1);
    int i = (int)Math.min(btS.gcZ, 500L);
    int[] arrayOfInt = paramdeC.kYy;
    float f = -500.0F;

    int j = (int)(btS.gcZ % 500L);

    for (int k = 0; k < i - 1; k++) {
      paramGL.glVertex2f(k * 2.0F + -500.0F, (float)(arrayOfInt[((k + j) % 500)] * paramDouble) - 300.0F);
      paramGL.glVertex2f((k + 1) * 2.0F + -500.0F, (float)(arrayOfInt[((k + 1 + j) % 500)] * paramDouble) - 300.0F);
    }
    paramGL.glEnd();
  }
}