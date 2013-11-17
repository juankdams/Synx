package com.ankamagames.wakfu.client.console.command.climate;

import adG;
import aeF;
import cSi;
import com.ankamagames.baseImpl.graphics.script.EffectFunctionsLibrary;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class TemperatureCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(TemperatureCommand.class);

  private static final cSi aUp = new cSi();
  private static final ArrayList aUq = new ArrayList();

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    try
    {
      adG localadG = EffectFunctionsLibrary.cPR().cPS();

      int i = 2;

      if ((!((String)paramArrayList.get(i)).equalsIgnoreCase("start")) && 
        (!((String)paramArrayList.get(i)).equalsIgnoreCase("stop")))
      {
        paramcth.err("Arguments incorrects");
      }
    } catch (Exception localException) {
      paramcth.err("Problème lors de l'execution de la commande : " + localException.toString());
    }
  }

  public boolean X() {
    return false;
  }
}