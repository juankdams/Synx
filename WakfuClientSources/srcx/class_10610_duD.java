import javax.media.opengl.GL;

class duD extends FB
{
  public int ia;
  public int ib;

  public void i(bSr parambSr)
  {
    ayc localayc = (ayc)parambSr;
    dsZ localdsZ = dsZ.cZe();

    GL localGL = (GL)localayc.bZk();
    localGL.glClear(1024);
    localdsZ.ks(false);

    localdsZ.x(parambSr);

    int i = Math.min(this.ia, this.ib) / 2;
    dUq.dup().an(this.ia / 2, this.ib / 2, i);

    localdsZ.ks(true);
  }
}