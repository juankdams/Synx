class dEd
  implements Runnable
{
  private final aLD hpP;
  private final CG ax;
  private final int lMP;

  private dEd(aLD paramaLD, CG paramCG, int paramInt)
  {
    this.hpP = paramaLD;
    this.ax = paramCG;
    this.lMP = paramInt;
  }

  public void run() {
    switch (hU.RE[this.ax.ordinal()]) {
    case 1:
      this.hpP.translate(0.0F, -30.0F);
      break;
    case 2:
      this.hpP.translate(0.0F, 30.0F);
      break;
    case 3:
      this.hpP.translate(30.0F, 0.0F);
      break;
    case 4:
      this.hpP.translate(-30.0F, 0.0F);
    }
  }

  public boolean k(dMr paramdMr)
  {
    switch (hU.RE[this.ax.ordinal()]) {
    case 1:
      return paramdMr.getScreenY() > this.lMP;
    case 2:
      return paramdMr.getScreenY() < this.lMP;
    case 3:
      return paramdMr.getScreenX() < this.lMP;
    case 4:
      return paramdMr.getScreenX() > this.lMP;
    }

    return false;
  }
}