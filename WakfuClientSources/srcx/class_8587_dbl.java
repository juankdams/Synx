import java.util.ArrayList;
import java.util.Iterator;

class dbl
  implements bPA
{
  dbl(czd paramczd, ArrayList paramArrayList)
  {
  }

  public boolean a(int paramInt, dSl paramdSl)
  {
    Iterator localIterator = this.kTd.iterator();
    while (localIterator.hasNext()) {
      Runnable localRunnable = (Runnable)localIterator.next();
      if (!paramdSl.k(localRunnable))
        localIterator.remove();
    }
    return !this.kTd.isEmpty();
  }
}