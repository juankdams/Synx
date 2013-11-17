import javax.media.opengl.GL;

class cHU extends FB
{
  public static final cHU iDw = new cHU();

  public void i(bSr parambSr)
  {
    GL localGL = (GL)parambSr.bZk();
    aEU localaEU = new aEU();
    localaEU.dm(true);
    localaEU.setMask(1);
    localaEU.u(512, 1, -1);
    localaEU.mn(7681);
    localaEU.dn(false);

    ajQ.axf().a(localGL, localaEU);
  }
}