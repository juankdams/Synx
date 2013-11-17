import java.util.Comparator;

class IS
  implements Comparator
{
  private static final IS bRZ = new IS();

  public int a(Integer paramInteger1, Integer paramInteger2) {
    bBn localbBn1 = Hh.QM().dh(paramInteger1.intValue());
    bBn localbBn2 = Hh.QM().dh(paramInteger1.intValue());
    if ((localbBn1 == null) || (localbBn2 == null)) {
      return 0;
    }
    return localbBn1.getName().compareTo(localbBn2.getName());
  }
}