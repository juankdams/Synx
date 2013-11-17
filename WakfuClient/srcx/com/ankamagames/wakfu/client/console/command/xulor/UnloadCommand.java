package com.ankamagames.wakfu.client.console.command.xulor;

import aeF;
import cBQ;
import cth;
import dnc;
import java.util.ArrayList;

public class UnloadCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (paramArrayList.isEmpty()) {
      return;
    }
    String str = (String)paramArrayList.get(2);
    if (str.equals("all")) {
      cBQ.cxL().cyf();
      return;
    }
    if (cBQ.cxL().mZ(str))
      cBQ.cxL().mW((String)paramArrayList.get(2));
    else
      paramcth.err(str + " n'est pas chargé !");
  }

  public boolean X()
  {
    return false;
  }
}