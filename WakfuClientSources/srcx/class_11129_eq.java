import java.util.Comparator;
import org.apache.log4j.Logger;

abstract class eq
  implements Comparator
{
  private static final Logger K = Logger.getLogger(eq.class);
  private float ayE;
  private float ayF;

  public final void a(float paramFloat1, float paramFloat2)
  {
    this.ayE = paramFloat1;
    this.ayF = paramFloat2;
  }

  public final int a(alT paramalT1, alT paramalT2) {
    gn localgn1 = a(paramalT1);
    gn localgn2 = a(paramalT2);
    float f1 = a(localgn1, this.ayE, this.ayF);
    float f2 = a(localgn2, this.ayE, this.ayF);
    if (f1 == f2) {
      return 0;
    }
    return f1 < f2 ? 1 : -1;
  }

  private static float a(gn paramgn, float paramFloat1, float paramFloat2) {
    if (paramgn == null)
      return (1.0F / 1.0F);
    float f1 = paramgn.nx() - paramFloat1;
    float f2 = paramgn.ny() - paramFloat2;
    return f1 * f1 + f2 * f2;
  }

  protected abstract gn a(alT paramalT);
}