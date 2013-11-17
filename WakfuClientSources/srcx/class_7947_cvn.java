import java.util.Comparator;

class cvn
  implements Comparator
{
  private static cvn ifY = new cvn();

  public int a(cBV paramcBV1, cBV paramcBV2) {
    return paramcBV1.getId() - paramcBV2.getId();
  }
}