import javax.media.opengl.GL;

public class dzN extends arx
{
  public boolean TV()
  {
    String str = this.dzZ.glGetString(7939);

    return (str != null) && (str.contains("GL_ARB_texture_non_power_of_two"));
  }

  public dEX TW() {
    return dEX.lOl;
  }
}