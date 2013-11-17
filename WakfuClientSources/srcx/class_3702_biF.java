import javax.media.opengl.GL;

public class biF extends arx
{
  public boolean TV()
  {
    String str = this.dzZ.glGetString(7939);
    return (str != null) && (str.contains("GL_ARB_texture_compression"));
  }

  public dEX TW() {
    return dEX.lOi;
  }
}