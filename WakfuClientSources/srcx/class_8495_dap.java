import org.apache.log4j.Logger;

public abstract class dap
{
  protected static final Logger K = Logger.getLogger(dap.class);

  private final cSR kQG = new cSR();
  private static dap kQH;

  public void a(aLM paramaLM)
  {
    this.kQG.put(paramaLM.bdn(), paramaLM);
  }

  public cSR cMH() {
    return this.kQG;
  }

  public aLM zw(int paramInt) {
    return (aLM)this.kQG.get(paramInt);
  }

  public static dap cMI()
  {
    return kQH;
  }

  public static void a(dap paramdap) {
    kQH = paramdap;
  }
}