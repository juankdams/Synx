import java.util.Comparator;

class bNf
  implements Comparator
{
  private static final bNf gRU = new bNf();

  public int a(Integer paramInteger1, Integer paramInteger2) {
    bBn localbBn1 = Hh.QM().dh(paramInteger1.intValue());
    bBn localbBn2 = Hh.QM().dh(paramInteger1.intValue());
    if ((localbBn1 == null) || (localbBn2 == null)) {
      return 0;
    }
    return localbBn1.nU() - localbBn2.nU();
  }
}