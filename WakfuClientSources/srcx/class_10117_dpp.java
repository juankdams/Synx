import javax.media.opengl.GL;

public class dpp extends arx
{
  public boolean TV()
  {
    String str = this.dzZ.glGetString(7939);
    return (str != null) && (str.contains("GL_ARB_multitexture"));
  }

  public dEX TW() {
    return dEX.lOh;
  }
}