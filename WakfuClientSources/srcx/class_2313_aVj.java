import java.util.ArrayList;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.log4j.Logger;

public final class aVj
{
  private static final Logger K = Logger.getLogger(aVj.class);

  public static ArrayList hl(String paramString)
  {
    if ((paramString == null) || (paramString.trim().length() == 0)) {
      return null; } 
ANTLRStringStream localANTLRStringStream = new ANTLRStringStream(paramString);
    dLr localdLr = new dLr(localANTLRStringStream);
    CommonTokenStream localCommonTokenStream = new CommonTokenStream(localdLr);

    aPe localaPe = new aPe(localCommonTokenStream);
    ArrayList localArrayList;
    try { localArrayList = localaPe.bfT();
    } catch (RecognitionException localRecognitionException) {
      throw new RuntimeException("Erreur de syntaxe dans le critère, à la ligne " + localRecognitionException.line + " caractère " + localRecognitionException.charPositionInLine + " sur le Token " + localRecognitionException.token.toString() + ".", localRecognitionException);
    }

    if (localaPe.getNumberOfSyntaxErrors() != 0) {
      throw new RuntimeException("Erreur de syntaxe dans le critère", new Exception());
    }

    return localArrayList;
  }

  public static aUG hm(String paramString) {
    ArrayList localArrayList = hl(paramString);

    if ((localArrayList == null) || (localArrayList.isEmpty())) {
      return null;
    }

    dKY localdKY = (dKY)localArrayList.get(localArrayList.size() - 1);

    if (localdKY.aNE() != Pq.chz) {
      K.error("On a un critère de type " + localdKY.aNE().name() + " au lieu d'un booléen");
      return null;
    }
    return (aUG)localdKY;
  }

  public static bZA hn(String paramString)
  {
    ArrayList localArrayList = hl(paramString);

    if ((localArrayList == null) || (localArrayList.isEmpty())) {
      return null;
    }

    bZA localbZA = null;
    for (dKY localdKY : localArrayList) {
      if ((localdKY != null) && (localdKY.aNE() == Pq.chw)) {
        if (localbZA == null)
          localbZA = (bZA)localdKY;
        else {
          localbZA = pP.a(localbZA, localdKY);
        }
      }
    }

    return localbZA;
  }
}