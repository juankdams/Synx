import java.util.ArrayList;

class bc
  implements Runnable
{
  bc(Jd paramJd)
  {
  }

  public void run()
  {
    axU localaxU = (axU)Jd.e(this.iO).getRenderables().get(Jd.i(this.iO));
    jq localjq = (jq)localaxU.getInnerElementMap().fi("flippingImage");
    localjq.start();
    Jd.j(this.iO);
    Jd.k(this.iO);
  }
}