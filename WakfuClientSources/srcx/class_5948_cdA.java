import java.util.Comparator;

final class cdA
  implements Comparator
{
  public int a(dCb paramdCb1, dCb paramdCb2)
  {
    if (paramdCb1.ato() < paramdCb2.ato())
      return 1;
    if (paramdCb1.ato() > paramdCb2.ato())
      return -1;
    return 1;
  }
}