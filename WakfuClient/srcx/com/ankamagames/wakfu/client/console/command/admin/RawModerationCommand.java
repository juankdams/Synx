package com.ankamagames.wakfu.client.console.command.admin;

import aJc;
import aeF;
import cth;
import ddQ;
import dnc;
import dte;
import ee;
import java.util.ArrayList;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenSource;
import org.apache.log4j.Logger;

public class RawModerationCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(RawModerationCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() < 1)) {
      K.error("Commande vide.");
    }
    String str1 = (String)paramArrayList.get(1);
    String[] arrayOfString = str1.trim().split("[ ]+", 2);
    if (str1.length() > 0)
      arrayOfString[0] = arrayOfString[0].toLowerCase();
    String str2 = "";
    Object localObject2;
    for (localObject2 : arrayOfString) {
      str2 = str2 + (String)localObject2 + " ";
    }
    K.info("Exécution de la commande brute : " + str2);
    ??? = new aJc(new ANTLRStringStream(str2 + "\n"));
    CommonTokenStream localCommonTokenStream = new CommonTokenStream((TokenSource)???);
    ee localee = new ee(localCommonTokenStream);
    try
    {
      localObject2 = localee.kK();
    } catch (RecognitionException localRecognitionException) {
      str4 = "Erreur de syntaxe dans la commande (ligne " + localRecognitionException.line + ", caractère " + localRecognitionException.charPositionInLine + ", token " + localRecognitionException.token.toString() + ")";
      K.error(str4);
      cth.cqP().err(str4);
      return;
    } catch (ddQ localddQ) {
      str4 = "Erreur de syntaxe :" + localddQ;
      K.error(str4);
      cth.cqP().err(str4);
      return;
    } catch (Exception localException) {
      String str4 = "Commande incorrecte : " + localException;
      K.error(str4);
      cth.cqP().err(str4);
      return;
    }

    if ((localObject2 != null) && (((dte)localObject2).isValid())) {
      ((dte)localObject2).execute();
    } else {
      String str3 = "Le parseur de commande n'a retourné aucun objet valide.";
      K.error(str3);
      cth.cqP().err(str3);
    }
  }

  public boolean X()
  {
    return false;
  }
}