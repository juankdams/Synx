import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dUI
  implements dOz
{
  protected static Logger K = Logger.getLogger(dUI.class);

  public static final dUI msG = new dUI();
  private final ArrayList msH;

  private dUI()
  {
    this.msH = new ArrayList();
  }

  public void a(dOz paramdOz)
  {
    if (!this.msH.contains(paramdOz))
      this.msH.add(paramdOz);
  }

  public void initialize() {
    K.info("Initializing hardware tests...");
    int i = 0; for (int j = this.msH.size(); i < j; i++) {
      dOz localdOz = (dOz)this.msH.get(i);
      try {
        localdOz.initialize();
      } catch (Throwable localThrowable) {
        K.error("Erreur à l'initialisation du test hardware " + localdOz.TW().dgD(), localThrowable);
      }
    }
  }

  public boolean TV()
  {
    K.info("Testing supported features...");
    int i = 0; for (int j = this.msH.size(); i < j; i++) {
      dOz localdOz = (dOz)this.msH.get(i);
      dEX localdEX = localdOz.TW();
      boolean bool = false;
      try
      {
        bool = localdOz.TV();
      } catch (Throwable localThrowable) {
        K.error("Erreur pendant le test hardware " + localdEX.dgD(), localThrowable);
      }

      K.info("\t* " + localdEX.dgD() + "..." + (bool ? " supported !" : " not supported !"));
      aNh.eth.a(localdEX, bool);
    }

    return true;
  }

  public void cleanUp() {
    K.info("Cleaning up hardware tests...");
    int i = 0; for (int j = this.msH.size(); i < j; i++) {
      dOz localdOz = (dOz)this.msH.get(i);
      try {
        localdOz.cleanUp();
      } catch (Throwable localThrowable) {
        K.error("Erreur pendant le cleanup du test hardware " + localdOz.TW().dgD(), localThrowable);
      }
    }
  }

  public dEX TW() {
    return null;
  }
}