import java.util.Comparator;

class aMc
  implements Comparator
{
  static final aMc eqV = new aMc();

  public int a(cYu paramcYu1, cYu paramcYu2) {
    return paramcYu1.getOrder() - paramcYu2.getOrder();
  }
}