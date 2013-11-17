import java.util.Comparator;

class cie
  implements Comparator
{
  private static final cie hGI = new cie();

  public int a(Integer paramInteger1, Integer paramInteger2) {
    bBn localbBn1 = Hh.QM().dh(paramInteger1.intValue());
    bBn localbBn2 = Hh.QM().dh(paramInteger1.intValue());
    if ((localbBn1 == null) || (localbBn2 == null)) {
      return 0;
    }
    return localbBn2.nU() - localbBn1.nU();
  }
}