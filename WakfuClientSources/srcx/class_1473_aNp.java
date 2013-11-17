import java.util.Comparator;

class aNp
  implements Comparator
{
  private static final aNp etw = new aNp(true);
  private static final aNp etx = new aNp(false);

  private boolean cXr = true;

  private aNp(boolean paramBoolean)
  {
    this.cXr = paramBoolean;
  }

  public int a(bxW parambxW1, bxW parambxW2)
  {
    return this.cXr ? parambxW1.getName().compareTo(parambxW2.getName()) : parambxW2.getName().compareTo(parambxW1.getName());
  }
}