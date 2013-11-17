import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;

public class akn extends Layout
{
  private Point dlc;
  private Point dld;
  private Point dle;
  private Point dlf;
  private Point dlg;
  private Point dlh;
  private Point dli;
  private Point dlj;
  private Point dlk;
  private Point dll;

  public akn(bcq parambcq)
  {
  }

  protected Point computeSize(Composite paramComposite, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramBoolean) || (this.dlc == null)) {
      this.dlc = bcq.a(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);
      this.dld = bcq.b(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);
      this.dle = bcq.c(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);
      this.dlf = bcq.d(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);
      this.dlg = bcq.e(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);
      this.dlh = bcq.f(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);
      this.dli = bcq.g(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);
      this.dlj = bcq.h(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);

      this.dlk = bcq.i(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);

      this.dll = bcq.j(this.dlm).computeSize(paramInt1, paramInt2, paramBoolean);
    }

    int i = 0;
    i = bCO.a(i, this.dlc.x + this.dld.x + this.dle.x, new int[0]);
    i = bCO.a(i, this.dlf.x + this.dll.x + this.dlg.x, new int[0]);
    i = bCO.a(i, this.dlh.x + this.dli.x + this.dlj.x, new int[0]);

    int j = 0;
    j = bCO.a(j, this.dlc.y + this.dlf.y + this.dlh.y, new int[0]);
    j = bCO.a(j, this.dld.y + this.dll.y + this.dli.y, new int[0]);
    j = bCO.a(j, this.dle.y + this.dlg.y + this.dlj.y, new int[0]);

    return new Point(i, j);
  }

  protected void layout(Composite paramComposite, boolean paramBoolean) {
    Rectangle localRectangle = paramComposite.getBounds();
    int i = localRectangle.width;
    int j = localRectangle.height;

    bcq.a(this.dlm).setBounds(0, 0, this.dlc.x, this.dlc.y);
    bcq.b(this.dlm).setBounds(this.dlc.x, 0, i - this.dlc.x - this.dle.x, this.dld.y);
    bcq.c(this.dlm).setBounds(i - this.dle.x, 0, this.dle.x, this.dle.y);

    bcq.d(this.dlm).setBounds(0, this.dlc.y, this.dlf.x, j - this.dlc.y - this.dlh.y);
    bcq.e(this.dlm).setBounds(i - this.dlg.x, this.dle.y, this.dlg.x, j - this.dle.y - this.dlj.y);

    bcq.f(this.dlm).setBounds(0, j - this.dlh.y, this.dlh.x, this.dlh.y);
    bcq.g(this.dlm).setBounds(this.dlh.x, j - this.dli.y, i - this.dlh.x - this.dlj.x, this.dli.y);
    bcq.h(this.dlm).setBounds(i - this.dlj.x, j - this.dlj.y, this.dlj.x, this.dlj.y);

    bcq.i(this.dlm).setBounds(i - this.dlk.x - 3, 3, this.dlk.x, this.dlk.y);

    if (bcq.k(this.dlm))
      bcq.j(this.dlm).setBounds(this.dlf.x, this.dld.y, i - this.dlf.x - this.dlg.x, j - this.dld.y - this.dli.y);
    else
      bcq.j(this.dlm).setBounds(0, 0, i, j);
  }

  protected boolean flushCache(Control paramControl)
  {
    boolean bool = super.flushCache(paramControl);

    return bool;
  }
}