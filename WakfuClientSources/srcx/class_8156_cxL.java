import java.util.Comparator;

public class cxL
  implements Comparator
{
  private static cxL ilG = new cxL();

  public int a(dpa paramdpa1, dpa paramdpa2) {
    int i = paramdpa1.cWv() - paramdpa2.cWv();
    if (i != 0) {
      return i;
    }

    return paramdpa1.cWu() - paramdpa2.cWu();
  }
}