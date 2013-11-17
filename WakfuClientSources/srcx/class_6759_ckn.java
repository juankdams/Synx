import java.util.Comparator;
import java.util.Date;
import org.apache.log4j.Logger;

public class ckn
  implements Comparator
{
  public static final Logger K = Logger.getLogger(ckn.class);
  public static final ckn hLt = new ckn();

  public int a(aGj paramaGj1, aGj paramaGj2)
  {
    if (paramaGj1 == paramaGj2)
      return 0;
    int i = paramaGj1.getPriority();
    int j = paramaGj2.getPriority();

    if (i != j) {
      return i - j;
    }
    Date localDate1 = paramaGj1.aOm();
    Date localDate2 = paramaGj2.aOm();

    if (!localDate1.equals(localDate2)) {
      if (localDate1 == null)
        return 1;
      if (localDate2 == null)
        return -1;
      return localDate1.compareTo(localDate2);
    }

    if (paramaGj1.aSq() != paramaGj2.aSq()) {
      return paramaGj1.aSq().compareTo(paramaGj2.aSq());
    }

    return paramaGj2.hashCode() - paramaGj1.hashCode();
  }
}