import java.util.Iterator;
import org.apache.log4j.Logger;

public final class Sg
{
  private static final Logger K = Logger.getLogger(Sg.class);

  public static void a(int paramInt, dhJ paramdhJ) {
    if (paramdhJ == null) {
      return;
    }
    switch (paramInt) {
    case 1:
      o(paramdhJ);
      break;
    case 2:
      break;
    default:
      K.error("Type de location inconnu pour la mise à jour " + paramInt);
    }
  }

  private static void o(dhJ paramdhJ) {
    bZH localbZH = paramdhJ.ayJ();
    if (localbZH == null) {
      return;
    }
    Iterator localIterator = localbZH.iterator();
    while (localIterator.hasNext()) {
      gA localgA = (gA)localIterator.next();
      if (localgA.or())
      {
        wz localwz = localgA.oq();
        if (localwz.getType() == 1)
        {
          cNr localcNr = (cNr)localwz;
          localcNr.cFS();
        }
      }
    }
  }
}