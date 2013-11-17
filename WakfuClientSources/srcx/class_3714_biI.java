import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class biI
{
  public static final biI fzg = new biI();

  private static final Logger K = Logger.getLogger(biI.class);

  private final ArrayList aBf = new ArrayList();

  public void a(eN parameN)
  {
    if (!this.aBf.contains(parameN))
      this.aBf.add(parameN);
  }

  public void b(eN parameN) {
    this.aBf.remove(parameN);
  }

  public void b(dCV paramdCV) {
    int i = 0; for (int j = this.aBf.size(); i < j; i++) {
      aid localaid = paramdCV.boT();

      if (localaid != null) {
        eN localeN = (eN)this.aBf.get(i);
        try {
          localeN.a(paramdCV);
        } catch (Exception localException) {
          K.error("Exception levée lors du traitement d'un evenement de protecteur " + localaid.getId() + ", par un listener : " + localeN.getClass().getSimpleName(), localException);
        }
      }
    }
  }
}