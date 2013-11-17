import org.apache.log4j.Logger;

public abstract class aVg extends ckq
{
  private static final Logger K = Logger.getLogger(aVg.class);

  protected final void fill()
  {
    dUV[] arrayOfdUV1 = dUV.values();
    for (dUV localdUV : arrayOfdUV1) {
      agQ localagQ = dUV.a(localdUV);
      if (localagQ == null) {
        localagQ = a(localdUV);
      }
      if (localagQ != null)
      {
        if (localagQ.adi() != localdUV.adi()) {
          K.error("type incorrect pour le model " + localagQ.getClass().getSimpleName() + " " + localdUV.name());
        }
        else
          a(localagQ);
      }
    }
  }

  protected abstract agQ a(dUV paramdUV);
}