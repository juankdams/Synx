import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;

public class anc extends Layout
{
  private Point aVM;

  protected Point computeSize(Composite paramComposite, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((this.aVM == null) || (paramBoolean)) {
      int i = -2147483648;
      int j = -2147483648;

      for (Control localControl : paramComposite.getChildren()) {
        if (localControl.isVisible()) {
          Point localPoint = localControl.computeSize(paramInt1, paramInt2, paramBoolean);

          i = Math.max(localPoint.x, i);
          j = Math.max(localPoint.y, j);
        }
      }

      this.aVM = new Point(i, j);
    }

    return this.aVM;
  }

  protected void layout(Composite paramComposite, boolean paramBoolean) {
    Rectangle localRectangle = paramComposite.getBounds();
    int i = localRectangle.width;
    int j = localRectangle.height;

    for (Control localControl : paramComposite.getChildren()) {
      Object localObject = localControl.getLayoutData();
      if ((localObject instanceof dGS))
      {
        dGS localdGS = (dGS)localObject;

        Point localPoint = localControl.computeSize(i, j, false);
        int n = localdGS.t(i, localPoint.x);
        int i1 = localdGS.q(j, localPoint.y);
        int i2 = localdGS.r(n, i);
        int i3 = localdGS.s(i1, j);
        localControl.setBounds(i2, i3, n, i1);
      }
    }
  }
}