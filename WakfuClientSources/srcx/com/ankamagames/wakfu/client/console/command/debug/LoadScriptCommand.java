package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bXf;
import cth;
import dlD;
import dnc;
import java.util.ArrayList;

public class LoadScriptCommand
  implements dnc
{
  private static bXf aCO = null;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList) {
    if (paramArrayList.size() < 4) {
      return;
    }
    int i = Integer.parseInt((String)paramArrayList.get(2));
    String str = (String)paramArrayList.get(3);

    if (aCO != null) {
      aCO.ccs();
    }

    paramcth.trace("Loading script " + i + "...");
    aCO = dlD.cTt().a(i, null, false);

    aCO.kE(str);
  }

  public boolean X() {
    return false;
  }
}