import com.sun.opengl.cg.CGpass;
import com.sun.opengl.cg.CGtechnique;
import com.sun.opengl.cg.CgGL;

public class GS extends aXA
{
  public GS(CGtechnique paramCGtechnique)
  {
    super(CgGL.cgGetTechniqueName(paramCGtechnique));
    this.fcA = new dHr[a(paramCGtechnique)];

    int i = 0;
    CGpass localCGpass = CgGL.cgGetFirstPass(paramCGtechnique);
    while (localCGpass != null) {
      this.fcA[(i++)] = new cZh(localCGpass);
      localCGpass = CgGL.cgGetNextPass(localCGpass);
    }
  }

  private static int a(CGtechnique paramCGtechnique) {
    int i = 0;
    CGpass localCGpass = CgGL.cgGetFirstPass(paramCGtechnique);
    while (localCGpass != null) {
      i++;
      localCGpass = CgGL.cgGetNextPass(localCGpass);
    }
    return i;
  }
}