package com.ankamagames.framework.script.defaultFunctionLibrary;

import avG;
import bFB;
import bXf;
import bYE;
import bxT;
import cB;
import dlD;
import dsg;
import hQ;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class ExecuteScript extends dsg
{
  private static final Logger K = Logger.getLogger(ExecuteScript.class);
  public static final String NAME = "executeScript";
  private static final bYE[] Rf = { new bYE("ScriptName", null, bxT.gja, false), new bYE("Params", null, bxT.gjd, false) };

  private static final bYE[] bxk = { new bYE("executionTime", null, bxT.giY, false) };
  private static final String dFU = "execution_Time";

  public ExecuteScript(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "executeScript";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return bxk;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    if ((i == 0) || (i == -1)) {
      Bz(0);
      return;
    }
    HashMap localHashMap = new HashMap();
    bFB[] arrayOfbFB1 = Bw(1);
    if (arrayOfbFB1.length % 2 != 0) {
      a(K, "La liste des parametres du script n'est pas paire, il faut (nom, valeur) pour chaque parametre");
      kg(0L);
      return;
    }

    for (int j = 0; j < arrayOfbFB1.length; j += 2) {
      localHashMap.put((String)arrayOfbFB1[j].getValue(), arrayOfbFB1[(j + 1)].getValue());
    }

    localHashMap.put("fightId", Integer.valueOf(cYS().a()));

    hQ[] arrayOfhQ = cYS().vM();
    try
    {
      bFB[] arrayOfbFB2 = new bFB[1];
      bXf localbXf = dlD.cTt().a(i, arrayOfhQ, localHashMap, b(arrayOfbFB2), false);

      if (localbXf == null) {
        a(K, i + " inconnu ");
        kg(0L);
        return;
      }
      bFB localbFB;
      if (arrayOfbFB2[0] != null)
        localbFB = arrayOfbFB2[0];
      else {
        localbFB = localbXf.kD("execution_Time");
      }
      if ((localbFB == null) || (localbFB.bNs() != bxT.gjb)) {
        kg(0L);
        return;
      }

      kg(((Double)localbFB.getValue()).longValue());
    }
    catch (AssertionError localAssertionError) {
      K.error("ERREUR CRITIQUE DANS UN SCRIPT", localAssertionError);
    }
  }

  private static cB b(bFB[] paramArrayOfbFB) {
    return new avG(paramArrayOfbFB);
  }
}