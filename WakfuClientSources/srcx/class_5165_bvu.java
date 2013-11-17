import java.util.ArrayList;

public class bvu extends dyB
{
  public static dGy gfs = new aGB();
  private Oo gft;
  private boolean gfu;
  private ML gfv;

  public void a(ML paramML)
  {
    this.gfv = paramML;
  }

  public Oo bDe() {
    return this.gft;
  }

  public void a(Oo paramOo) {
    this.gft = paramOo;
  }

  public void fu(boolean paramBoolean) {
    this.gfu = paramBoolean;
  }

  public void dk(long paramLong)
  {
  }

  public void stop(long paramLong) {
    z(gfs);
  }

  private boolean c(rP paramrP) {
    if (this.gft != paramrP.yl()) {
      return false;
    }

    if (this.gfu != paramrP.ym()) {
      return false;
    }

    if (this.gfv == null) {
      return true;
    }

    return this.gfv.a(paramrP);
  }

  public void v(ArrayList paramArrayList)
  {
  }

  public void a(ArrayList paramArrayList, rP paramrP)
  {
    if (c(paramrP))
      super.v(paramArrayList);
  }

  public void a(ArrayList paramArrayList, wK paramwK)
  {
  }
}