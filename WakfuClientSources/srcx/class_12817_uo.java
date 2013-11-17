import org.apache.log4j.Logger;

public class uo extends cEz
{
  public static final Logger K = Logger.getLogger(uo.class);
  private final aum bhW;

  public uo(aum paramaum)
  {
    this.bhW = paramaum;
  }

  public String Dh() {
    return this.bhW.aGy().getSimpleName();
  }

  public String Di() {
    return this.bhW.aGy().getName();
  }

  public int Dj() {
    return this.bhW.akc();
  }

  public int Dk() {
    return this.bhW.akb();
  }
}