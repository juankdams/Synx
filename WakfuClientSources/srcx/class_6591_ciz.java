import org.apache.log4j.Logger;

public class ciz extends aia
  implements bBz
{
  private static final bOO aCJ = new bOO(new buD());

  private static Logger K = Logger.getLogger(ciz.class);

  public void a(caT paramcaT)
  {
    paramcaT.a(this);
  }

  public static ciz ht(long paramLong)
  {
    ciz localciz;
    try
    {
      localciz = (ciz)aCJ.Mm();
      localciz.aOr = aCJ;
    } catch (Exception localException) {
      K.warn("Erreur au checkOut d'un " + ciz.class.getSimpleName());
      localciz = new ciz();
    }
    localciz.X(paramLong);
    return localciz;
  }

  public void release()
  {
    if (this.aOr != null) {
      try {
        this.aOr.y(this);
      } catch (Exception localException) {
        K.warn("Erreur au release d'un " + ciz.class.getSimpleName());
      }
      this.aOr = null;
    } else {
      K.error("Double release de " + getClass().toString());
    }
  }
}