package com.ankamagames.wakfu.client.console.command.fight;

import Su;
import aeF;
import arl;
import byv;
import byz;
import cth;
import dnc;
import java.util.ArrayList;

public class ShowAggroCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Aggro List \n");

    byz localbyz = byv.bFN().bFO();
    if ((localbyz != null) && (localbyz.aeQ() != null)) {
      for (Su localSu : localbyz.aeQ().bgG())
        localStringBuffer.append(localSu.cyl());
    }
    else {
      localStringBuffer.append("pas de combat en cours \n");
    }
    cth.cqP().trace(localStringBuffer.toString());
  }

  public boolean X()
  {
    return false;
  }
}