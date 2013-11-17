import com.sun.opengl.cg.CgGL;
import javax.media.opengl.GL;

public class crf extends arx
{
  public boolean TV()
  {
    String str = this.dzZ.glGetString(7939);
    if ((str == null) || (!str.contains("GL_ARB_vertex_shader")))
      return false;
    try
    {
      return CgGL.cgGLIsProfileSupported(6150);
    } catch (Throwable localThrowable) {
    }
    return false;
  }

  public dEX TW()
  {
    return dEX.lOk;
  }
}