import java.util.ArrayList;
import java.util.Iterator;

class dwl
  implements Runnable
{
  dwl(aCg paramaCg)
  {
  }

  public void run()
  {
    this.ddi.dj(false);
    for (Object localObject = aCg.a(this.ddi).iterator(); ((Iterator)localObject).hasNext(); ) { String str = (String)((Iterator)localObject).next();
      ckV localckV = (ckV)dLE.doY().br("pet", str);
      localckV.o(null);
      localckV.ij(-1);
    }
    localObject = (ckV)dLE.doY().rv("pet");
    if (localObject != null)
      ((ckV)localObject).o(null);
  }
}