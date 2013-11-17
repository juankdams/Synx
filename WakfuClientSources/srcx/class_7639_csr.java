import org.apache.log4j.Logger;

public class csr
  implements cvW
{
  private static final Logger K = Logger.getLogger(csr.class);

  private static csr ico = new csr();

  private boolean aFc = false;

  public static csr cqN()
  {
    return ico;
  }

  public boolean a(cWG paramcWG) {
    if (!this.aFc) {
      K.warn("Traitement d'un message alors que la frame n'est plus active");
    }

    switch (paramcWG.getId()) {
    case 18015:
      axB.aIZ(); axB.aJh();

      return true;
    case 19992:
      return true;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (paramBoolean)
      return;
    this.aFc = true;
    byz localbyz = byv.bFN().bFO();

    localbyz.a(new eu[] { eu.ayN, eu.ayM, eu.ayO, eu.ayP });
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    this.aFc = false;
    axB.aIZ(); axB.aJi();
  }
}