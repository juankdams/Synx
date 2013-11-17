import java.util.Comparator;

class ceX
  implements Comparator
{
  private static final ceX hzP = new ceX(true);
  private static final ceX hzQ = new ceX(false);

  private boolean cXr = true;

  private ceX(boolean paramBoolean)
  {
    this.cXr = paramBoolean;
  }

  public int a(bxW parambxW1, bxW parambxW2)
  {
    if (parambxW1.ajD() > parambxW2.ajD()) {
      return this.cXr ? 1 : -1;
    }
    if (parambxW1.ajD() < parambxW2.ajD()) {
      return this.cXr ? -1 : 1;
    }
    return 0;
  }
}