import org.apache.log4j.Logger;

public class dtZ
{
  private static final Logger K = Logger.getLogger(dtZ.class);
  private final bMG gNb;

  public dtZ(bMG parambMG)
  {
    this.gNb = parambMG;
  }

  public void v(cew paramcew) {
    if (this.gNb.CD() == 0L) {
      paramcew.chv();
      return;
    }

    paramcew.a(this.gNb);
  }
}