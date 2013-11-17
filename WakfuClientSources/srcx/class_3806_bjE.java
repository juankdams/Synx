import javax.media.opengl.GL;

public class bjE extends arx
{
  public boolean TV()
  {
    String str = this.dzZ.glGetString(7939);
    return (str != null) && (str.contains("GL_ARB_multisample"));
  }

  public dEX TW() {
    return dEX.lOg;
  }
}