import java.util.Comparator;

class cPe
  implements Comparator
{
  cPe(vt paramvt)
  {
  }

  public int a(bxW parambxW1, bxW parambxW2)
  {
    agw localagw1 = dqB.cXD().jX(parambxW1.aOC());
    agw localagw2 = dqB.cXD().jX(parambxW2.aOC());
    if (localagw1.arV() > localagw2.arV()) {
      return 1;
    }
    if (localagw1.arV() < localagw2.arV()) {
      return -1;
    }
    return localagw1.getName().compareTo(localagw2.getName());
  }
}