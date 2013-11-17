package com.ankamagames.wakfu.client.console.command.debug.anim;

import aeF;
import byv;
import byz;
import cew;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SetSkinCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(SetSkinCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      paramcth.err("pas de localPlayer");
      return;
    }

    if (paramArrayList.size() != 3) {
      return;
    }
    localbyz.aeL().jz((String)paramArrayList.get(2));
  }

  public boolean X() {
    return false;
  }
}