import java.util.ArrayList;

abstract class bpt
{
  static final aee fJT = new dSD();

  private final ArrayList bcw = new ArrayList();
  private int beh;

  protected bpt(int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      this.bcw.add(aOk());
  }

  protected abstract bzu aOk();

  protected abstract boolean a(bzu parambzu);

  public final bzu byL() {
    int i = 0; for (int j = this.bcw.size(); i < j; i++) {
      if (a((bzu)this.bcw.get(i))) {
        if (i > this.beh)
          this.beh = i;
        return (bzu)this.bcw.get(i);
      }
    }

    bzu localbzu = aOk();
    this.bcw.add(localbzu);
    return localbzu;
  }
}