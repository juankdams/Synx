import org.apache.log4j.Logger;

public class aSi extends cEz
{
  public static final Logger K = Logger.getLogger(aSi.class);
  private final bOO bf;
  private final String ePx;
  private final String ePy;

  public aSi(bOO parambOO)
  {
    this.bf = parambOO;
    String str = this.bf.getName();
    if (str == null)
    {
      this.ePx = "unknown pool";
      this.ePy = this.ePx;
    }
    else
    {
      this.ePy = str;
      if (str.contains("."))
        this.ePx = str.substring(str.lastIndexOf(".") + 1);
      else
        this.ePx = str;
    }
  }

  public String Dh() {
    return this.ePx;
  }

  public String Di() {
    return this.ePy;
  }

  public int Dk() {
    return this.bf.Mn();
  }

  public int Dj() {
    return this.bf.Mo();
  }
}