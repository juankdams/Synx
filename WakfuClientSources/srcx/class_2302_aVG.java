import org.apache.log4j.Logger;

public final class aVG
  implements aVS
{
  private static final Logger K = Logger.getLogger(aVG.class);
  private final drN eXH;

  public aVG(drN paramdrN)
  {
    this.eXH = paramdrN;
  }

  public drN jt(int paramInt) {
    try {
      if (cze.cwb().a(paramInt, this.eXH))
        return this.eXH;
    } catch (Exception localException) {
      K.error("Problème avec " + this.eXH.getClass().getSimpleName() + " d'id=" + paramInt, localException);
    }
    return null;
  }
}