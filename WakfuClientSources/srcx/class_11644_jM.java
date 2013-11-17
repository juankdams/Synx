import com.sun.opengl.util.Animator;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import org.apache.log4j.Logger;

public class jM extends GLCanvas
{
  private static Logger K = Logger.getLogger(jM.class);
  private bAU aMs;
  private Animator aMt;

  private static GLCapabilities a(dIP paramdIP)
  {
    GLCapabilities localGLCapabilities = new GLCapabilities();

    localGLCapabilities.setHardwareAccelerated(true);
    localGLCapabilities.setDoubleBuffered(paramdIP.lUn);
    localGLCapabilities.setSampleBuffers(false);
    localGLCapabilities.setDepthBits(paramdIP.lUo);
    localGLCapabilities.setStencilBits(paramdIP.lUp);

    switch (paramdIP.lTm) {
    case 16:
      localGLCapabilities.setRedBits(4);
      localGLCapabilities.setGreenBits(4);
      localGLCapabilities.setBlueBits(4);
      localGLCapabilities.setAlphaBits(4);
      break;
    case 32:
      localGLCapabilities.setAlphaBits(8);
    case 24:
      localGLCapabilities.setRedBits(8);
      localGLCapabilities.setGreenBits(8);
      localGLCapabilities.setBlueBits(8);
    }

    return localGLCapabilities;
  }

  public jM(dIP paramdIP)
  {
    super(a(paramdIP));

    this.aMt = new Animator(this);
  }

  public Animator rr()
  {
    return this.aMt;
  }

  public bAU rs()
  {
    return this.aMs;
  }

  public void a(bAU parambAU)
  {
    if ((parambAU != this.aMs) && (parambAU != null)) {
      if (this.aMs != null) {
        removeGLEventListener(this.aMs);
        removeMouseListener(this.aMs);
        removeMouseMotionListener(this.aMs);
        removeKeyListener(this.aMs);
        removeFocusListener(this.aMs);
      }
      this.aMs = parambAU;
      addGLEventListener(this.aMs);
      addMouseListener(this.aMs);
      addMouseMotionListener(this.aMs);
      addMouseWheelListener(this.aMs);
      addKeyListener(this.aMs);
      addFocusListener(this.aMs);
    }
  }
}