import java.util.Comparator;

class AK
  implements Comparator
{
  AK(dnp paramdnp)
  {
  }

  public int a(cPG paramcPG1, cPG paramcPG2)
  {
    return paramcPG1.getId() - paramcPG2.getId();
  }
}