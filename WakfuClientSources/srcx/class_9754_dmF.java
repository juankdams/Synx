import org.apache.log4j.Logger;

class dmF
  implements vZ
{
  dmF(cRd paramcRd)
  {
  }

  public void a(bAU parambAU, R paramR)
  {
    cRd.K.fatal("Error while initializing Renderer : " + paramR.toString());
    if (cRd.b(this.lkG) != null) {
      cRd.b(this.lkG).a(parambAU, paramR.toString());
    }
    System.exit(0);
  }
}