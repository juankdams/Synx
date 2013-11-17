import org.apache.log4j.Logger;

public class dBx extends cSx
{
  private static Logger K = Logger.getLogger(dBx.class);

  public dBx(dKl paramdKl)
  {
    this.kET = paramdKl;
  }

  public dKl deI()
  {
    return (dKl)this.kET;
  }

  public void setSpacing(dKl paramdKl)
  {
    this.kET = paramdKl;
  }

  public CH mp()
  {
    return CH.bGD;
  }
}