import java.util.Comparator;

public class bAd
  implements Comparator
{
  private static bAd goN = new bAd();

  public int a(axU paramaxU1, axU paramaxU2) {
    Su localSu1 = (Su)paramaxU1.getItemValue();
    Su localSu2 = (Su)paramaxU2.getItemValue();

    return localSu1.e(eu.azq) - localSu2.e(eu.azq);
  }
}