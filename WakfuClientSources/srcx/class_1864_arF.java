import java.util.Comparator;

class arF
  implements Comparator
{
  arF(aAx paramaAx)
  {
  }

  public int a(dju paramdju1, dju paramdju2)
  {
    int i = this.dAh.d(paramdju1) - this.dAh.d(paramdju2);
    return i == 0 ? paramdju1.getName().compareTo(paramdju2.getName()) : i;
  }
}