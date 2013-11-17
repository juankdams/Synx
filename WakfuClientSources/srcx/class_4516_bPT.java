import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class bPT extends Canvas
{
  private Point aVM = null;
  private Image gYc;

  public bPT(Composite paramComposite, int paramInt, ImageData paramImageData)
  {
    this(paramComposite, paramInt);
    d(paramImageData);
  }

  public bPT(Composite paramComposite, int paramInt) {
    super(paramComposite, paramInt | 0x100000);

    addPaintListener(new cHC(this));
  }

  public void d(ImageData paramImageData)
  {
    if (this.gYc != null) {
      this.gYc.dispose();
    }

    this.gYc = new Image(getDisplay(), paramImageData);
  }

  public Point computeSize(int paramInt1, int paramInt2) {
    return computeSize(paramInt1, paramInt2, false);
  }

  public Point computeSize(int paramInt1, int paramInt2, boolean paramBoolean) {
    if ((!paramBoolean) && (this.aVM != null)) {
      return this.aVM;
    }

    if (this.gYc != null) {
      Rectangle localRectangle = this.gYc.getBounds();
      this.aVM = new Point(localRectangle.width, localRectangle.height);
    } else {
      this.aVM = new Point(0, 0);
    }

    return this.aVM;
  }

  public void dispose() {
    super.dispose();

    if (this.gYc != null)
      this.gYc.dispose();
  }
}