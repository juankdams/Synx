package com.ankamagames.wakfu.client.console.command.debug.anim;

import aeF;
import bAF;
import byv;
import byz;
import cew;
import cth;
import diq;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SetSkinPartCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(SetSkinPartCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      paramcth.err("pas de localPlayer");
      return;
    }

    if (paramArrayList.size() != 4) {
      return;
    }
    cew localcew = localbyz.aeL();
    String str = (String)paramArrayList.get(3);
    try {
      int i = Integer.parseInt((String)paramArrayList.get(2));
      try
      {
        String[] arrayOfString = diq.ph((String)paramArrayList.get(3));
        localcew.b(bAF.rU(i), arrayOfString);
      } catch (Exception localException) {
        K.error("", localException);
      }
    } catch (NumberFormatException localNumberFormatException) {
      localcew.b((String)paramArrayList.get(2), new String[] { str });
    }
  }

  public boolean X()
  {
    return false;
  }
}