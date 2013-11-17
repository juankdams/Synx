import java.util.ArrayList;

class aZ
  implements Runnable
{
  aZ(Jd paramJd, dRq paramdRq, ArrayList paramArrayList)
  {
  }

  public void run()
  {
    aWc.blo().a(600012L, false, 600);

    if (Jd.a(this.iO) == -2147483648) {
      Jd.a(this.iO, this.iP.getY() - 100);
    }
    this.iP.setY(Jd.a(this.iO));
    this.iP.setVisible(true);
    dHx localdHx = new dHx(this.iP.getX(), this.iP.getY(), this.iP.getX(), this.iP.getY() + 100, this.iP, 0, 750, ddp.kWG);

    aga localaga = new aga(bNa.gRu, bNa.gRx, this.iQ, 0, 500, 1, ddp.kWG);
    localaga.a(new Lv(this, localaga));

    this.iP.a(localdHx);
    this.iP.a(localaga);
    Jd.b(this.iO);
    Jd.a(this.iO, 0L);
  }
}