import org.apache.log4j.Logger;

public class bfX extends aia
  implements bBz
{
  private static final bOO aCJ = new bOO(new apb());

  private static Logger K = Logger.getLogger(bfX.class);

  public void a(caT paramcaT)
  {
    paramcaT.a(this);
  }

  public static bfX fw(long paramLong)
  {
    bfX localbfX;
    try
    {
      localbfX = (bfX)aCJ.Mm();
      localbfX.aOr = aCJ;
    } catch (Exception localException) {
      K.warn("Erreur au checkOut d'un " + bfX.class.getSimpleName());
      localbfX = new bfX();
    }
    localbfX.X(paramLong);
    return localbfX;
  }

  public void release()
  {
    if (this.aOr != null) {
      try {
        this.aOr.y(this);
      } catch (Exception localException) {
        K.warn("Erreur au release d'un " + bfX.class.getSimpleName());
      }
      this.aOr = null;
    } else {
      K.error("Double release de " + getClass().toString());
    }
  }
}