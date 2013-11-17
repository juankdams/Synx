package com.ankamagames.wakfu.client.console.command.climate;

import aDE;
import aeF;
import byv;
import byz;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import cyx;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class RainCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(RainCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    try {
      byz localbyz = WakfuClientInstance.awy().awz().bFO();
      int i = localbyz.fa();
      int j = localbyz.fb();
      short s = localbyz.Lk();

      int k = 2;

      float f = (float)Double.parseDouble((String)paramArrayList.get(k));

      aDE localaDE = new aDE();
      localaDE.setLocation(i, j);
      localaDE.Y(s);
      localaDE.c(f);
      WakfuClientInstance.awy().awz().aJK().d(localaDE);
    }
    catch (Exception localException) {
      paramcth.err("Problème lors de l'execution de la commande : " + localException.toString());
    }
  }

  public boolean X() {
    return false;
  }
}