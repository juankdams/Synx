import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class pC extends Canvas
{
  private Point aVM;
  private int aVN = 0;
  private boolean aVO = false;
  private Image aVP;
  private Image aVQ;
  private Image aVR;

  public pC(Composite paramComposite, int paramInt)
  {
    super(paramComposite, paramInt);

    addPaintListener(new axK(this));

    addMouseMoveListener(new axD(this));

    addMouseTrackListener(new axF(this));

    addMouseListener(new axG(this));

    addKeyListener(new axH(this));
  }

  public void a(ImageData paramImageData)
  {
    if (this.aVP != null) {
      this.aVP.dispose();
    }

    this.aVP = new Image(getDisplay(), paramImageData);
  }

  public void b(ImageData paramImageData) {
    if (this.aVQ != null) {
      this.aVQ.dispose();
    }

    this.aVQ = new Image(getDisplay(), paramImageData);
  }

  public void c(ImageData paramImageData) {
    if (this.aVR != null) {
      this.aVR.dispose();
    }

    this.aVR = new Image(getDisplay(), paramImageData);
  }

  public Point computeSize(int paramInt1, int paramInt2) {
    return computeSize(paramInt1, paramInt2, false);
  }

  public Point computeSize(int paramInt1, int paramInt2, boolean paramBoolean) {
    if ((!paramBoolean) && (this.aVM != null)) {
      return this.aVM;
    }

    if (this.aVP != null) {
      Rectangle localRectangle = this.aVP.getBounds();
      this.aVM = new Point(localRectangle.width, localRectangle.height);
    } else {
      this.aVM = new Point(0, 0);
    }

    return this.aVM;
  }

  public void dispose() {
    super.dispose();

    if (this.aVP != null) {
      this.aVP.dispose();
      this.aVP = null;
    }

    if (this.aVQ != null) {
      this.aVQ.dispose();
      this.aVQ = null;
    }

    if (this.aVR != null) {
      this.aVR.dispose();
      this.aVR = null;
    }
  }
}