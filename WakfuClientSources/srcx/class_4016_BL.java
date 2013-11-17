import java.awt.Dimension;

final class BL extends do
{
  public BL(cnU paramcnU, int paramInt)
  {
    super(paramcnU, paramInt);
  }

  protected int a(JW paramJW) {
    return paramJW.getRow();
  }

  protected int b(JW paramJW) {
    return paramJW.getRowSpan();
  }

  int ak(int paramInt) {
    return this.Tw.ae(paramInt).UD();
  }

  int b(btg parambtg) {
    return parambtg.getRowCount();
  }

  public int ag(int paramInt) {
    return getMinimumSize(paramInt).height;
  }

  public do a(btg parambtg) {
    return parambtg.gbs;
  }

  public int hl() {
    return this.Tw.getRowCount();
  }

  public int af(int paramInt) {
    return getPreferredSize(paramInt).height;
  }
}