import java.util.Comparator;

class fM
  implements Comparator
{
  private static final fM aCY = new fM();

  public int a(asM paramasM1, asM paramasM2) {
    if (paramasM2.isUnknown() == paramasM1.isUnknown())
      return 0;
    return paramasM2.isUnknown() ? -1 : 1;
  }
}