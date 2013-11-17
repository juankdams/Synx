import org.apache.log4j.Logger;

class bXn
{
  public static final Logger K = Logger.getLogger(bXn.class);
  private final dQx hmh;
  private final dRq hmi;

  bXn(dQx paramdQx, dRq paramdRq)
  {
    this.hmh = paramdQx;
    this.hmi = paramdRq;
  }

  boolean contains(int paramInt1, int paramInt2)
  {
    return this.hmh.contains(paramInt1, paramInt2);
  }

  void activate()
  {
    this.hmi.setVisible(true);
  }

  void ccD()
  {
    this.hmi.setVisible(false);
  }
}