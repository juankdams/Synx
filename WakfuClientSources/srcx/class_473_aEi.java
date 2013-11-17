import javax.media.opengl.GL;

public class aEi extends arx
{
  public boolean TV()
  {
    String str = this.dzZ.glGetString(7939);
    return (str != null) && (str.contains("GL_EXT_framebuffer_object"));
  }

  public dEX TW() {
    return dEX.lOf;
  }
}