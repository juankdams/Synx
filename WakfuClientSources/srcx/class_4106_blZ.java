import java.util.Comparator;

class blZ
  implements Comparator
{
  private static final blZ fDm = new blZ();

  public int a(Integer paramInteger1, Integer paramInteger2) {
    bBn localbBn1 = Hh.QM().dh(paramInteger1.intValue());
    bBn localbBn2 = Hh.QM().dh(paramInteger1.intValue());
    if ((localbBn1 == null) || (localbBn2 == null)) {
      return 0;
    }
    return localbBn2.bKs().ccr() - localbBn1.bKs().ccr();
  }
}