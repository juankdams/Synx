import java.util.List;

public class cnf extends btl
{
  private List hSX = null;
  private final cYk cQE = new cYk();

  public void a(arl paramarl, byte paramByte, List paramList) {
    a(paramarl, paramByte);
    this.hSX = paramList;
    bu(99.0F);

    bt(99.0F);
  }

  public void reset() {
    this.hSX = null;
  }

  protected boolean S(int paramInt1, int paramInt2, short paramShort) {
    this.cQE.ac(paramInt1, paramInt2, paramShort);
    return (!bCs.a(this.cQE, this.hSX)) || (super.S(paramInt1, paramInt2, paramShort));
  }
}