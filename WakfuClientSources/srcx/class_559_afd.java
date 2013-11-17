import java.util.Comparator;

class afd
  implements Comparator
{
  private static final afd cXp = new afd(true);
  private static final afd cXq = new afd(false);

  private boolean cXr = true;

  private afd(boolean paramBoolean)
  {
    this.cXr = paramBoolean;
  }

  public int a(bxW parambxW1, bxW parambxW2)
  {
    return this.cXr ? parambxW1.nU() - parambxW2.nU() : parambxW2.nU() - parambxW1.nU();
  }
}