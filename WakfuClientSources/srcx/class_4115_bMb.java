import java.util.Comparator;

class bMb
  implements Comparator
{
  private static final bMb gPz = new bMb();

  public int a(Integer paramInteger1, Integer paramInteger2) {
    bBn localbBn1 = Hh.QM().dh(paramInteger1.intValue());
    bBn localbBn2 = Hh.QM().dh(paramInteger1.intValue());
    if ((localbBn1 == null) || (localbBn2 == null)) {
      return 0;
    }
    return localbBn2.getName().compareTo(localbBn1.getName());
  }
}