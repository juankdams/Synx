import org.apache.log4j.Logger;

public class aIQ
{
  protected static Logger K = Logger.getLogger(aIQ.class);
  private aDs ehF;
  private dfN ehG = null;
  private bUg ehH = null;
  private DL ehI = null;

  public void a(bUg parambUg)
  {
    this.ehH = parambUg;
  }

  public void b(dfN paramdfN)
  {
    this.ehG = paramdfN;
  }

  public void b(DL paramDL)
  {
    this.ehI = paramDL;
  }

  public aDs aUN()
  {
    return this.ehF;
  }

  protected void aUO()
  {
    if ((this.ehG != null) && (this.ehH != null) && (this.ehI != null))
    {
      this.ehF = new aDs();
      this.ehF.a(this.ehG);
      this.ehF.a(this.ehH);
      this.ehF.a(this.ehI);
      return;
    }
    K.error("Impossible de créer le ProxyClient : tous ces paramètres n'ont pas été définis");
  }
}