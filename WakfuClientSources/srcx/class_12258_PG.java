import java.util.Comparator;

class PG
  implements Comparator
{
  public int a(cDg paramcDg1, cDg paramcDg2)
  {
    cYk localcYk1 = paramcDg1.ML();
    cYk localcYk2 = paramcDg2.ML();
    return localcYk1.getX() - localcYk2.getX() + (localcYk1.getY() - localcYk2.getY());
  }
}