import java.util.Comparator;

class arH
  implements Comparator
{
  arH(aAx paramaAx)
  {
  }

  public int a(cPG paramcPG1, cPG paramcPG2)
  {
    return paramcPG1.getId() - paramcPG2.getId();
  }
}