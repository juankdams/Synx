import java.util.Comparator;

final class bRa
  implements Comparator
{
  public int b(Su paramSu1, Su paramSu2)
  {
    return paramSu2.getName().compareTo(paramSu1.getName());
  }
}