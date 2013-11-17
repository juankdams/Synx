package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import byv;
import byz;
import cth;
import dnc;
import java.util.ArrayList;

public final class SetPositionCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (paramArrayList.size() != 5)
      return;
    byv.bFN().bFO().d(Integer.parseInt((String)paramArrayList.get(2)), Integer.parseInt((String)paramArrayList.get(3)), Short.parseShort((String)paramArrayList.get(4)));
  }

  public boolean X() {
    return false;
  }
}