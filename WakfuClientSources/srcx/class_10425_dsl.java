import org.apache.log4j.Logger;

public class dsl
{
  protected static final Logger K = Logger.getLogger(dsl.class);
  private int ggd;
  private dIX luD;

  public void a(dIX paramdIX)
  {
    this.luD = paramdIX;
    if (this.luD != null)
      this.luD.c(this, 0);
  }

  public int bDx() {
    return this.ggd;
  }

  private void BB(int paramInt) {
    if (this.luD != null)
      this.luD.c(this, paramInt);
  }

  public boolean BC(int paramInt) {
    if (paramInt < 0)
      return false;
    int i = paramInt - this.ggd;
    this.ggd = paramInt;
    BB(i);
    return true;
  }

  public boolean Bj(int paramInt) {
    if (paramInt <= 0)
      return false;
    return BC(this.ggd + paramInt);
  }

  public boolean BD(int paramInt) {
    if (paramInt <= 0)
      return false;
    return BC(Math.max(0, this.ggd - paramInt));
  }
}