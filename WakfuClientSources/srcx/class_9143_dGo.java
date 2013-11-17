import java.util.Iterator;
import org.apache.log4j.Logger;

public class dGo extends bhI
{
  public static final bhI gxY = new dGo();

  private bhI dhq() {
    return bDa.gxY;
  }

  private dCi b(dhJ paramdhJ, EU paramEU, short paramShort) {
    return dhq().a(paramdhJ, paramEU, paramShort);
  }

  public dCi a(dhJ paramdhJ, EU paramEU, short paramShort)
  {
    amS localamS = paramdhJ.a(aFy.ebH, (byte)0);
    if (localamS == null) {
      return b(paramdhJ, paramEU, paramShort);
    }

    dCi localdCi1 = paramdhJ.auK();
    short s = paramEU.Om();
    dCi localdCi2 = new dCi(s, localdCi1.ajw(), localdCi1.ajz(), true, false, false);

    Iterator localIterator = localdCi1.iterator();
    while (localIterator.hasNext()) {
      bfE localbfE = (bfE)localIterator.next();
      if ((localbfE != null) && 
        (localbfE.bsL() != null) && 
        (!localbfE.bsL().bHY()))
      {
        try
        {
          localdCi2.c(localbfE);
        } catch (Exception localException) {
          K.error("Unable to add spellLevel " + localbfE + "to double", localException);
        }
      }
    }
    if (localdCi2.isEmpty()) {
      return b(paramdhJ, paramEU, paramShort);
    }
    return localdCi2;
  }
}