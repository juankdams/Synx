package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import cth;
import dlD;
import dnc;
import java.util.ArrayList;

public class RunScriptCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (paramArrayList.size() < 3) {
      return;
    }
    int i = Integer.parseInt((String)paramArrayList.get(2));
    dlD.cTt().AG(i);
    paramcth.trace("Script " + i);
  }

  public boolean X() {
    return false;
  }
}