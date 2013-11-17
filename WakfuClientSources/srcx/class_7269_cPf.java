import java.util.Comparator;

class cPf
  implements Comparator
{
  cPf(vt paramvt)
  {
  }

  public int a(bxW parambxW1, bxW parambxW2)
  {
    if (parambxW1.ajD() > parambxW2.ajD()) {
      return 1;
    }
    if (parambxW1.ajD() < parambxW2.ajD()) {
      return -1;
    }
    return 0;
  }
}