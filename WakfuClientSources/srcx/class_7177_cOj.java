import org.apache.log4j.Logger;

public final class cOj
{
  private static final Logger K = Logger.getLogger(cOj.class);

  public static final cOj kwA = new cOj();

  private final cSR kwB = new cSR();

  private final ahX kwC = new ahX();

  public void a(ckq paramckq, cXf paramcXf)
  {
    this.kwC.a(paramckq, paramcXf);
  }

  public void update(int paramInt) {
    this.kwC.update(paramInt);
  }

  public boolean a(int paramInt, aDR paramaDR) {
    if (paramaDR == null)
      return false;
    this.kwB.put(paramInt, paramaDR);
    this.kwC.a(paramaDR);
    return true;
  }

  public boolean yK(int paramInt) {
    aDR localaDR = (aDR)this.kwB.get(paramInt);
    if (localaDR == null)
      return false;
    this.kwC.b(localaDR);
    return true;
  }

  public void clear()
  {
    this.kwB.clear();
    this.kwC.clear();
  }

  public void reset() {
    clear();
    this.kwC.reset();
  }
}