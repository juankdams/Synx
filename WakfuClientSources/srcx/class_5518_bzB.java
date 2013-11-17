class bzB
  implements dSg
{
  bzB(coX paramcoX, dOc paramdOc, acq paramacq, biy parambiy)
  {
  }

  public boolean bIp()
  {
    this.gnL.setVisible(true);
    return false;
  }

  public boolean bIq()
  {
    int i = this.gnM.getMapBackgroundStartX();
    int j = this.gnM.getMapBackgroundEndX();
    int k = this.gnM.getMapBackgroundStartY();
    int m = this.gnM.getMapBackgroundEndY();
    dDq localdDq = this.gnM.getMapBackgroundPixmap();

    float f1 = (j - i) / localdDq.getWidth();
    float f2 = (m - k) / localdDq.getHeight();

    float f3 = this.gnM.getWidth() / f1;
    float f4 = this.gnM.getHeight() / f2;

    float f5 = f3 / localdDq.getWidth();
    float f6 = f4 / localdDq.getHeight();

    float f7 = f5 * 0.8F;
    dCr.a(this.gnN, f7);

    int n = (int)(i * f5);
    int i1 = (int)(k * f6);

    this.gnN.setPosition((int)(f3 * 0.933F) - n, (int)(f4 * 0.433F) - i1);

    return false;
  }
}