import java.util.Comparator;

class apa
  implements Comparator
{
  apa(avV paramavV)
  {
  }

  public int a(gA paramgA1, gA paramgA2)
  {
    bBn localbBn1 = paramgA1.oi();
    bBn localbBn2 = paramgA2.oi();
    if (localbBn1.bKD() != localbBn2.bKD()) {
      return localbBn1.bKD().bJ() - localbBn2.bKD().bJ();
    }

    if (localbBn1.bKs() != localbBn2.bKs()) {
      return localbBn1.bKs().compareTo(localbBn2.bKs());
    }

    return localbBn1.nU() - localbBn2.nU();
  }
}