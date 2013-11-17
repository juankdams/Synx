import java.util.Comparator;

class bBX
  implements Comparator
{
  bBX(bMD parambMD)
  {
  }

  public int a(gA paramgA1, gA paramgA2)
  {
    if (paramgA1.ol().nc() != paramgA2.ol().nc()) {
      return paramgA1.ol().nc() - paramgA2.ol().nc();
    }
    return paramgA1.getName().compareTo(paramgA2.getName());
  }
}