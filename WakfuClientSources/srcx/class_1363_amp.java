import org.apache.log4j.Logger;

public abstract class amp extends crh
  implements PT
{
  private static Logger K = Logger.getLogger(amp.class);

  protected boolean doS = false;

  public boolean ajO()
  {
    return true;
  }

  public boolean isStandAlone()
  {
    return this.doS;
  }

  public Or getContentGreedySize(dRq paramdRq, dOc paramdOc, Or paramOr)
  {
    return getContentPreferedSize(paramdRq);
  }

  public void a(dRq paramdRq, dOc paramdOc)
  {
  }

  public void aJ()
  {
    super.aJ();

    this.doS = false;
  }

  public amp ajQ() {
    return null;
  }
}