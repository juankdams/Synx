package com.ankamagames.wakfu.client.console.command.debug.anim;

import aeF;
import byv;
import byz;
import cew;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SetAnimCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(SetAnimCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 3) {
      byz localbyz = byv.bFN().bFO();
      if (localbyz != null)
        localbyz.aeL().eq((String)paramArrayList.get(2));
      else
        paramcth.err("pas de localPlayer");
    }
  }

  public boolean X()
  {
    return false;
  }
}