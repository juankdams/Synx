import java.util.Comparator;

public class Bj
  implements Comparator
{
  public static final Bj bxh = new Bj();

  public int a(aiA paramaiA1, aiA paramaiA2) {
    int i = paramaiA1.Qb() - paramaiA2.Qb();
    if (i != 0) {
      return i;
    }

    return paramaiA1.Lk() - paramaiA2.Lk();
  }
}