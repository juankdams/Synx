import java.util.Comparator;

class cND
  implements Comparator
{
  cND(bWP parambWP)
  {
  }

  public int a(ae paramae1, ae paramae2)
  {
    int i = "Challenges - zone ".length();
    return Integer.parseInt(paramae1.getName().substring(i)) - Integer.parseInt(paramae2.getName().substring(i));
  }
}