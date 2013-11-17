import com.sun.opengl.cg.CgGL;
import javax.media.opengl.GL;

public class cip extends arx
{
  public boolean TV()
  {
    Pb.aaU().cZ("transform");
    Pb.aaU().da("gui");

    String str = this.dzZ.glGetString(7939);
    if ((str == null) || (!str.contains("GL_ARB_fragment_shader")))
      return false;
    try
    {
      System.loadLibrary("Cg");
      System.loadLibrary("CgGL");
      return CgGL.cgGLIsProfileSupported(7000);
    } catch (Throwable localThrowable) {
    }
    return false;
  }

  public dEX TW()
  {
    return dEX.lOj;
  }
}