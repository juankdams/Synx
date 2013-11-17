import com.sun.jna.Native;
import java.awt.Canvas;

public class con extends bmY
{
  private static final long serialVersionUID = 1L;
  private final Canvas hVO;

  public con(Canvas paramCanvas, dAW paramdAW)
  {
    super(paramdAW);
    this.hVO = paramCanvas;
  }

  public final Canvas cot()
  {
    return this.hVO;
  }

  public void a(djj paramdjj, ctQ paramctQ)
  {
    aHA.debug("attach()", new Object[0]);
    if (this.hVO.isDisplayable()) {
      long l = Native.a(this.hVO);
      aHA.debug("componentId={}", new Object[] { Long.valueOf(l) });
      this.fFS.a(paramdjj, paramctQ, l);
      aHA.debug("video surface attached", new Object[0]);
    }
    else {
      throw new IllegalStateException("The video surface component must be displayable");
    }
  }
}