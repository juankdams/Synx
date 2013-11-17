import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Window;
import java.awt.image.BufferedImage;
import javax.swing.SwingUtilities;

public class cHK extends cOS
  implements coc
{
  private final cto iCL;
  private final dHg iCM;
  private final ann iCN;
  private con iCO;
  private Window iCP;
  private boolean iCQ;
  private boolean iCR;

  public cHK(djj paramdjj, bSW parambSW)
  {
    this(paramdjj, parambSW, null);
  }

  public cHK(djj paramdjj, bSW parambSW, cto paramcto)
  {
    super(paramdjj, parambSW);

    this.iCL = paramcto;
    this.iCM = new dHg(this, null);
    this.iCN = new ann(this, null);
  }

  public void a(con paramcon)
  {
    aHA.debug("setVideoSurface(videoSurface={})", new Object[] { paramcon });

    this.iCO = paramcon;
  }

  public void cok()
  {
    aHA.debug("attachVideoSurface()", new Object[0]);
    if (this.iCO != null)
    {
      if (this.iCO.cot().isVisible()) {
        this.iCO.a(this.le, this);
      }
      else
      {
        throw new IllegalStateException("The video surface is not visible");
      }
    }
    else
    {
      aHA.debug("Can't attach video surface since no video surface has been set", new Object[0]);
    }
  }

  public void col()
  {
    aHA.debug("toggleFullScreen()", new Object[0]);
    if (this.iCL != null)
      setFullScreen(!this.iCL.crb());
  }

  public void setFullScreen(boolean paramBoolean)
  {
    aHA.debug("setFullScreen(fullScreen={})", new Object[] { Boolean.valueOf(paramBoolean) });
    if (this.iCL != null)
      if (paramBoolean) {
        this.iCL.cqZ();
      }
      else
        this.iCL.cra();
  }

  public boolean MS()
  {
    aHA.debug("isFullScreen()", new Object[0]);
    if (this.iCL != null) {
      return this.iCL.crb();
    }

    return false;
  }

  public BufferedImage com()
  {
    aHA.debug("getVideoSurfaceContents()", new Object[0]);
    try {
      Rectangle localRectangle = this.iCO.cot().getBounds();
      localRectangle.setLocation(this.iCO.cot().getLocationOnScreen());
      return new Robot().createScreenCapture(localRectangle);
    }
    catch (Exception localException) {
      throw new RuntimeException("Failed to get video surface contents", localException);
    }
  }

  public Window con()
  {
    aHA.debug("getOverlay()", new Object[0]);
    return this.iCP;
  }

  public void c(Window paramWindow)
  {
    aHA.debug("setOverlay(overlay={})", new Object[] { paramWindow });
    if (this.iCO != null)
    {
      hp(false);

      cBU();

      d(paramWindow);
    }
    else {
      throw new IllegalStateException("Can't set an overlay when there's no video surface");
    }
  }

  public void hp(boolean paramBoolean)
  {
    aHA.debug("enableOverlay(enable={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.iCQ = paramBoolean;
    if (this.iCP != null)
    {
      Window localWindow;
      if (paramBoolean) {
        if (!this.iCP.isVisible()) {
          this.iCP.setLocation(this.iCO.cot().getLocationOnScreen());
          this.iCP.setSize(this.iCO.cot().getSize());
          localWindow = (Window)SwingUtilities.getAncestorOfClass(Window.class, this.iCO.cot());
          localWindow.addComponentListener(this.iCM);
          this.iCP.setVisible(true);
        }

      }
      else if (this.iCP.isVisible()) {
        this.iCP.setVisible(false);
        localWindow = (Window)SwingUtilities.getAncestorOfClass(Window.class, this.iCO.cot());
        localWindow.removeComponentListener(this.iCM);
      }
    }
  }

  public boolean coo()
  {
    aHA.debug("overlayEnabled()", new Object[0]);
    return (this.iCP != null) && (this.iCP.isVisible());
  }

  public void hq(boolean paramBoolean)
  {
    aHA.debug("setEnableMouseInputHandling(enable={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.le.j(csu(), paramBoolean ? 1 : 0);
  }

  public void hr(boolean paramBoolean)
  {
    aHA.debug("setEnableKeyInputHandling(enable={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.le.i(csu(), paramBoolean ? 1 : 0);
  }

  private void d(Window paramWindow)
  {
    aHA.debug("addOverlay(overlay={})", new Object[] { paramWindow });
    if (paramWindow != null) {
      this.iCP = paramWindow;
      Window localWindow = (Window)SwingUtilities.getAncestorOfClass(Window.class, this.iCO.cot());
      if (localWindow != null) {
        localWindow.addWindowListener(this.iCN);
      }
      else
      {
        aHA.warn("Failed to find a Window ancestor for the video surface Canvas", new Object[0]);
      }
    }
  }

  private void cBU()
  {
    aHA.debug("removeOverlay()", new Object[0]);
    if (this.iCP != null) {
      Window localWindow = (Window)SwingUtilities.getAncestorOfClass(Window.class, this.iCO.cot());
      localWindow.removeWindowListener(this.iCN);
      this.iCP = null;
    }
  }

  protected final void cBV()
  {
    aHA.debug("onBeforePlay()", new Object[0]);
    cok();
  }

  private void cBW()
  {
    aHA.trace("showOverlay()", new Object[0]);
    if (this.iCR)
      hp(true);
  }

  private void cBX()
  {
    aHA.trace("hideOverlay()", new Object[0]);
    if (this.iCQ) {
      this.iCR = true;
      hp(false);
    }
    else {
      this.iCR = false;
    }
  }
}