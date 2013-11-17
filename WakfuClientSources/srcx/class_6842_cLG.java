import javax.media.opengl.GL;

class cLG extends FB
{
  public static final cLG iLe = new cLG();

  public void i(bSr parambSr)
  {
    GL localGL = (GL)parambSr.bZk();
    aEU localaEU = new aEU();
    localaEU.dm(true);
    localaEU.setMask(0);
    localaEU.u(517, 1, 1);
    localaEU.mn(7680);

    ajQ.axf().a(localGL, localaEU);
  }
}