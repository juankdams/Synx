package com.ankamagames.framework.script;

import bYE;
import bxT;
import com.ankamagames.framework.script.defaultFunctionLibrary.ExecuteScript;
import dsg;
import hQ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class DefaultFunctionsLibrary extends hQ
{
  private static final Logger K = Logger.getLogger(DefaultFunctionsLibrary.class);
  private static final bYE[] foF = { new bYE("time", "Durée d'execution du script en milliseconds", bxT.gja, false) };

  private static final bYE[] foG = { new bYE("time", "Temps d'attente avant l'appel de la fonction (en ms)", bxT.gja, false), new bYE("loopCount", "Nombre de fois ou la méthode doit être appelée (doit être = 1)", bxT.gja, false), new bYE("funcName", "Fonction à appeler", bxT.giZ, false), new bYE("funcParams", "Paramètres de la fonction à appeler", bxT.gje, true) };

  private static final bYE[] foH = { new bYE("taskId", "Id de la tâche", bxT.gja, false) };

  private static final bYE[] foI = { new bYE("fileName", "Nom du fichier contenant le script", bxT.gja, false) };

  private static final bYE[] foJ = { new bYE("libName", "chaine de texte correspondant au nom de la librairie à charger", bxT.giZ, false) };

  private static final bYE[] foK = { new bYE("time", "Temps d'attente avant l'appel de la fonction (en ms)", bxT.gja, false), new bYE("funcName", "Fonction à appeler", bxT.giZ, false), new bYE("funcParams", "Paramètres de la fonction à appeler", bxT.gje, true) };

  private static final bYE[] foL = { new bYE("taskId", "Id de la tâche", bxT.gja, false) };

  private static final bYE[] foM = { new bYE("taskId", "Identifiant de la tâche à stopper", bxT.gja, true) };

  private static final bYE[] foN = { new bYE("message", "Un ensemble de valeurs, au format texte ou numérique, qui seront affichées les unes après les autres.", bxT.gje, true) };

  private static final bYE[] foO = { new bYE("param1", null, bxT.giY, false), new bYE("param2", null, bxT.gjb, true) };

  private static final bYE[] foP = { new bYE("result", null, bxT.gjc, false) };

  private static final bYE[] foQ = { new bYE("param1", null, bxT.giY, false), new bYE("param2", null, bxT.gjb, true) };

  private static final bYE[] foR = { new bYE("result", null, bxT.gjc, false) };

  private static final bYE[] foS = { new bYE("param1", null, bxT.giY, false), new bYE("param2", null, bxT.gjb, true) };

  private static final bYE[] foT = { new bYE("result", null, bxT.gjc, false) };

  private static final bYE[] foU = { new bYE("param1", null, bxT.giY, false), new bYE("param2", null, bxT.gjb, true) };

  private static final bYE[] foV = { new bYE("result", null, bxT.giY, false) };

  private static final bYE[] foW = { new bYE("param", null, bxT.giY, false) };

  private static final bYE[] foX = { new bYE("result", null, bxT.giY, false) };

  private static final bYE[] foY = { new bYE("param1", null, bxT.giY, false), new bYE("param2", null, bxT.giY, false) };

  private static final bYE[] foZ = { new bYE("result", null, bxT.giY, false) };

  private static final bYE[] fpa = { new bYE("param1", null, bxT.gjb, false), new bYE("param2", null, bxT.gjb, true) };

  private static final bYE[] fpb = { new bYE("result", null, bxT.giY, false) };

  private static final bYE[] fpc = { new bYE("param1", null, bxT.gjb, false), new bYE("param2", null, bxT.gjb, true) };

  private static final bYE[] fpd = { new bYE("result", null, bxT.gjb, false) };

  private static final bYE[] fpe = { new bYE("param", null, bxT.giX, false) };

  private static final bYE[] fpf = { new bYE("result", null, bxT.giY, false) };

  private static final bYE[] fpg = { new bYE("x", null, bxT.gjb, false), new bYE("y", null, bxT.gjb, false), new bYE("z", null, bxT.gjb, false) };

  private static final bYE[] fph = { new bYE("result", null, bxT.giY, false) };

  private static final bYE[] fpi = { new bYE("x", null, bxT.giY, false) };

  private static final bYE[] fpj = { new bYE("x", null, bxT.gjb, false), new bYE("y", null, bxT.gjb, false), new bYE("z", null, bxT.gjb, false) };

  private static final bYE[] fpk = { new bYE("param1", null, bxT.gje, false) };

  private static final bYE[] fpl = { new bYE("result", null, bxT.giZ, false) };

  private static final DefaultFunctionsLibrary fpm = new DefaultFunctionsLibrary();

  public final String getName()
  {
    return null;
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public static DefaultFunctionsLibrary brE()
  {
    return fpm;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return null;
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return new dsg[] { new DefaultFunctionsLibrary.GetTimer(paramLuaState), new DefaultFunctionsLibrary.Invoke(paramLuaState), new DefaultFunctionsLibrary.SetInterval(paramLuaState), new DefaultFunctionsLibrary.Trace(paramLuaState), new DefaultFunctionsLibrary.Interrupt(paramLuaState), new DefaultFunctionsLibrary.Require(paramLuaState), new DefaultFunctionsLibrary.Import(paramLuaState), new DefaultFunctionsLibrary.IsEqual(paramLuaState), new DefaultFunctionsLibrary.IsLower(paramLuaState), new DefaultFunctionsLibrary.IsGreater(paramLuaState), new DefaultFunctionsLibrary.Substract(paramLuaState), new DefaultFunctionsLibrary.Random(paramLuaState), new DefaultFunctionsLibrary.RandomFloat(paramLuaState), new DefaultFunctionsLibrary.AbsoluteValue(paramLuaState), new DefaultFunctionsLibrary.MaxValue(paramLuaState), new DefaultFunctionsLibrary.ToString(paramLuaState), new DefaultFunctionsLibrary.PositionToLong(paramLuaState), new DefaultFunctionsLibrary.LongToPosition(paramLuaState), new DefaultFunctionsLibrary.ToLong(paramLuaState), new ExecuteScript(paramLuaState) };
  }
}