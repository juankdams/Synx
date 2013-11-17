import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import org.apache.log4j.Logger;

public class cdi
  implements cix
{
  private static final Logger K = Logger.getLogger(cdi.class);

  private static final cdi hwy = new cdi();

  public static cdi cgh() {
    return hwy;
  }

  public void a(VertexBufferPCT paramVertexBufferPCT, float[] paramArrayOfFloat, int paramInt)
  {
    paramVertexBufferPCT.f(paramArrayOfFloat, paramInt);
  }

  public void k(float[] paramArrayOfFloat)
  {
  }
}