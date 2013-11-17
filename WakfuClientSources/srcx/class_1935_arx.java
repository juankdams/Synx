import javax.media.opengl.GL;

public abstract class arx
  implements dOz
{
  protected GL dzZ;

  public void initialize()
  {
    this.dzZ = ((GL)dHL.lSB.dhZ().bZk());
  }

  public void cleanUp() {
    this.dzZ = null;
  }
}