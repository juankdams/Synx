import java.util.Comparator;

class bTw
  implements Comparator
{
  bTw(dqB paramdqB)
  {
  }

  public int a(mt parammt1, mt parammt2)
  {
    int i = parammt1.getLevel();
    int j = parammt2.getLevel();
    if (i > j) {
      return 1;
    }
    if (i < j) {
      return -1;
    }
    return 0;
  }
}