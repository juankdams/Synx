import java.util.Comparator;

final class cTt
  implements Comparator
{
  public int c(dle paramdle1, dle paramdle2)
  {
    if (!paramdle1.b(eu.ayM))
      return 1;
    if (!paramdle2.b(eu.ayM))
      return -1;
    cqm localcqm1 = paramdle1.a(eu.ayM);
    Float localFloat1 = Float.valueOf(localcqm1.value() / localcqm1.max() * 100.0F);
    cqm localcqm2 = paramdle2.a(eu.ayM);
    Float localFloat2 = Float.valueOf(localcqm2.value() / localcqm2.max() * 100.0F);

    return localFloat1.compareTo(localFloat2);
  }
}