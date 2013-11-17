import java.util.Comparator;

class bTA
  implements Comparator
{
  bTA(dqB paramdqB)
  {
  }

  public int a(agw paramagw1, agw paramagw2)
  {
    if (paramagw1.arV() < paramagw2.arV()) {
      return 1;
    }
    if (paramagw2.arV() < paramagw1.arV()) {
      return -1;
    }
    return 0;
  }
}