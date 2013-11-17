import java.util.Comparator;

class aKK
  implements Comparator
{
  aKK(dKB paramdKB)
  {
  }

  public int a(dPL paramdPL1, dPL paramdPL2)
  {
    if (paramdPL1 == paramdPL2) {
      return 0;
    }

    Object localObject1 = (paramdPL1 instanceof auy) ? (auy)paramdPL1 : null;
    Object localObject2 = (paramdPL2 instanceof auy) ? (auy)paramdPL2 : null;
    if (localObject1 == null) {
      return 1;
    }
    if (localObject2 == null) {
      return -1;
    }
    long l = acP.b(localObject1.aGM()) - acP.b(localObject2.aGM());

    return l < 0L ? -1 : l == 0L ? 0 : 1;
  }
}