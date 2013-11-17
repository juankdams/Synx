import java.awt.Point;
import java.awt.Rectangle;

public class wG extends oe
{
  private final boolean bmJ;

  public wG(Rectangle paramRectangle1, Rectangle paramRectangle2, dOc paramdOc, boolean paramBoolean, int paramInt1, int paramInt2, ddp paramddp)
  {
    super(paramRectangle1, paramRectangle2, paramdOc, paramInt1, paramInt2, paramddp);

    if (paramRectangle1 == null) {
      be(new Rectangle(new Point(0, 0), paramdOc.getSize()));
    }

    this.bmJ = paramBoolean;
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn == null) {
      return true;
    }

    Rectangle localRectangle1 = (Rectangle)this.iJh;
    Rectangle localRectangle2 = (Rectangle)this.iJi;

    int i = (int)this.dRn.a(localRectangle1.x, localRectangle2.x, this.bmM, this.aKS);
    int j = (int)this.dRn.a(localRectangle1.y, localRectangle2.y, this.bmM, this.aKS);
    int k = (int)this.dRn.a(localRectangle1.width, localRectangle2.width, this.bmM, this.aKS);
    int m = (int)this.dRn.a(localRectangle1.height, localRectangle2.height, this.bmM, this.aKS);

    getWidget().setScissor(new Rectangle(i, j, k, m));

    return true;
  }

  public void nv()
  {
    if (this.bmJ)
      getWidget().setScissor(null);
    else {
      getWidget().setScissor((Rectangle)this.iJi);
    }
    super.nv();
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[").append(getClass().getSimpleName()).append("]").append(this.iJh).append(" -> ").append(this.iJi);
    return localStringBuilder.toString();
  }
}