import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cvS
{
  private static final Logger K = Logger.getLogger(cvS.class);

  public static bBn a(bBn parambBn, cpu paramcpu) {
    aRQ localaRQ = paramcpu.b(parambBn.bKD());
    short s = paramcpu.dj(parambBn.nU());
    cxg localcxg = paramcpu.c(parambBn.bKs());

    return Bd.bwT.b(localaRQ, localcxg, s);
  }

  public static boolean a(dhJ paramdhJ, int paramInt, cpu paramcpu, boolean paramBoolean) {
    bBn localbBn = Hh.QM().dh(paramInt);
    if (localbBn.bKD() == aRQ.eOT) {
      if (paramBoolean) {
        K.warn("Le joueur " + paramdhJ + " demande une fusion de rune de type " + localbBn.bKD());
      }
      return false;
    }

    ArrayList localArrayList = paramdhJ.bHr().hi(paramInt);
    if (localArrayList.isEmpty()) {
      if (paramBoolean) {
        K.warn("Le joueur " + paramdhJ + " essaye de fusionner comme rune l'item de refId" + paramInt + " qu'il ne possède pas");
      }
      return false;
    }

    if (!paramcpu.h(localbBn)) {
      if (paramBoolean) {
        K.warn("Le joueur " + paramdhJ + " essaye d'effectuer la fusion de type " + paramcpu + " sur un objet déjà maxé.");
      }
      return false;
    }

    int i = 0;
    for (Iterator localIterator = localArrayList.iterator(); localIterator.hasNext(); ) {
      gA localgA = (gA)localIterator.next();
      i += localgA.nP();
    }

    if (i < paramcpu.aHZ()) {
      if (paramBoolean) {
        K.warn("Le joueur " + paramdhJ + " essayer de fusionner comme rune l'item de refId " + paramInt + " mais n'en possède pas 2");
      }
      return false;
    }

    return true;
  }
}