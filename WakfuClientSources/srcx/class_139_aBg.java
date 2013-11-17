import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aBg
  implements ddC
{
  protected static Logger K = Logger.getLogger(aBg.class);

  public static final aBg dUP = new aBg();
  private final ArrayList dUQ;

  private aBg()
  {
    this.dUQ = new ArrayList();
  }

  public void a(ddC paramddC)
  {
    this.dUQ.add(paramddC);
  }

  public void initialize() {
    K.info("Initializing benchmarks...");
    int i = 0; for (int j = this.dUQ.size(); i < j; i++) {
      ddC localddC = (ddC)this.dUQ.get(i);
      try {
        localddC.initialize();
      } catch (Exception localException) {
        K.error("Erreur à l'initialisation du benchmark " + localddC.getName(), localException);
      }
    }
  }

  public void a(ccT paramccT) {
    K.info("Running benchmarks...");
    int i = 0; for (int j = this.dUQ.size(); i < j; i++) {
      ddC localddC = (ddC)this.dUQ.get(i);
      K.info("\t* benchmarking " + localddC.getName() + "...");
      try {
        localddC.a(paramccT);
      } catch (Exception localException) {
        K.error("Erreur à l'execution du benchmark " + localddC.getName(), localException);
      }
    }
  }

  public void cleanUp() {
    K.info("Cleaning up benchmarks...");
    int i = 0; for (int j = this.dUQ.size(); i < j; i++) {
      ddC localddC = (ddC)this.dUQ.get(i);
      try {
        localddC.cleanUp();
      } catch (Exception localException) {
        K.error("Erreur au cleanup du benchmark " + localddC.getName(), localException);
      }
    }
  }

  public String getName() {
    return "Benchmark runner";
  }
}