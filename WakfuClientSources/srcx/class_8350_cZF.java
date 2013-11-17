import java.awt.Dimension;

final class cZF extends do
{
  public cZF(cnU paramcnU, int paramInt)
  {
    super(paramcnU, paramInt);
  }

  protected int a(JW paramJW) {
    return paramJW.getColumn();
  }

  protected int b(JW paramJW) {
    return paramJW.getColSpan();
  }

  int ak(int paramInt) {
    return this.Tw.ae(paramInt).UC();
  }

  int b(btg parambtg) {
    return parambtg.getColumnCount();
  }

  public int ag(int paramInt) {
    return getMinimumSize(paramInt).width;
  }

  public do a(btg parambtg) {
    return parambtg.gbr;
  }

  public int hl() {
    return this.Tw.getColumnCount();
  }

  public int af(int paramInt) {
    return getPreferredSize(paramInt).width;
  }
}