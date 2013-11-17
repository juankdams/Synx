import java.util.Iterator;
import org.apache.log4j.Logger;

public class dTX
{
  private static final Logger K = Logger.getLogger(dTX.class);

  public static boolean d(ctU paramctU)
  {
    bBn localbBn1 = Hh.QM().dh(paramctU.csx());
    if (localbBn1 == null) {
      return false;
    }

    for (Iterator localIterator = paramctU.iterator(); localIterator.hasNext(); ) {
      bBn localbBn2 = (bBn)localIterator.next();
      if (localbBn2.acu() == cqG.iau) {
        return false;
      }
    }

    return true;
  }

  public static boolean a(dhJ paramdhJ, ctU paramctU, gA paramgA) {
    int i = paramctU.csw();
    int j = paramdhJ.bHr().cEj();

    if (paramgA.nP() == 1) {
      j++;
    }

    if (i <= j) {
      return true;
    }

    for (Iterator localIterator = paramctU.iterator(); localIterator.hasNext(); ) {
      bBn localbBn = (bBn)localIterator.next();

      gA localgA = paramdhJ.bHr().yf(localbBn.getId());
      if ((localgA == null) || (localgA.nQ() == 0))
      {
        j--;
      }
    }
    return j >= 0;
  }

  public static boolean a(dhJ paramdhJ, ctU paramctU) {
    return a(paramdhJ, paramctU, false);
  }

  public static boolean a(dhJ paramdhJ, ctU paramctU, boolean paramBoolean) {
    boolean bool = true;
    for (Iterator localIterator = paramctU.iterator(); (localIterator.hasNext()) && (bool); ) {
      bBn localbBn = (bBn)localIterator.next();
      gA localgA = paramdhJ.bHr().c(localbBn.getId(), aJx.ejL);
      if (localgA == null) {
        bool = false;
        if (paramBoolean) {
          K.error("Fusion de panoplie : le joueur id=" + paramdhJ.getId() + " ne possède pas l'item de refId=" + localbBn.getId());
        }
      }
    }
    return bool;
  }
}