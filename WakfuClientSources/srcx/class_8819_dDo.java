import java.util.Comparator;

class dDo
  implements Comparator
{
  private static final dDo lLx = new dDo(true);
  private static final dDo lLy = new dDo(false);

  private boolean cXr = true;

  private dDo(boolean paramBoolean)
  {
    this.cXr = paramBoolean;
  }

  public int a(bxW parambxW1, bxW parambxW2)
  {
    if (parambxW1.aOC() > parambxW2.aOC()) {
      return this.cXr ? 1 : -1;
    }
    if (parambxW1.aOC() < parambxW2.aOC()) {
      return this.cXr ? -1 : 1;
    }
    return 0;
  }
}