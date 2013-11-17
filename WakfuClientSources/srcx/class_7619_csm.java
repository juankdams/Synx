import java.util.Iterator;

class csm
  implements Ce
{
  private bBn aNS;

  csm(bBn parambBn)
  {
    this.aNS = parambBn;
  }

  public int nS() {
    return 0;
  }

  public long nT() {
    return 0L;
  }

  public Iterator iterator() {
    return this.aNS.bKh();
  }
}