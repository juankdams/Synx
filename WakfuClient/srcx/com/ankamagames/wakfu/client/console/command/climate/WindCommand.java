package com.ankamagames.wakfu.client.console.command.climate;

import aeF;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class WindCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(WindCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    try {
      int i = 2;

      if (!((String)paramArrayList.get(i)).equalsIgnoreCase("start"))
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