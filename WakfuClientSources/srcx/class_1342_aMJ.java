import java.util.Comparator;

class aMJ
  implements Comparator
{
  aMJ(bPE parambPE)
  {
  }

  public int a(dKz paramdKz1, dKz paramdKz2)
  {
    if (paramdKz2.djq() == paramdKz1.djq()) {
      return paramdKz1.u() - paramdKz2.u();
    }
    return paramdKz2.djq() - paramdKz1.djq();
  }
}