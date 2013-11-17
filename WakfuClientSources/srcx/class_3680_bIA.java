import java.util.Comparator;

final class bIA
  implements Comparator
{
  public int a(apX paramapX1, apX paramapX2)
  {
    bTI localbTI1 = paramapX1.Cz();
    bTI localbTI2 = paramapX2.Cz();
    int i = localbTI1.bJ();
    int j = localbTI2.bJ();
    if (i != j)
      return i < j ? -1 : 1;
    return paramapX1.nU() < paramapX2.nU() ? -1 : 1;
  }
}