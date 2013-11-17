import java.util.Comparator;

final class Uf
  implements Comparator
{
  public int compare(Object paramObject1, Object paramObject2)
  {
    dSR localdSR1;
    if ((paramObject1 instanceof apX))
      localdSR1 = (dSR)((apX)paramObject1).bsL();
    else
      localdSR1 = (dSR)paramObject1;
    dSR localdSR2;
    if ((paramObject2 instanceof apX))
      localdSR2 = (dSR)((apX)paramObject2).bsL();
    else
      localdSR2 = (dSR)paramObject2;
    return localdSR1.vp() - localdSR2.vp();
  }
}