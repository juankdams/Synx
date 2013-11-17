package com.ankamagames.wakfu.client.console.command.debug;

import KO;
import aeF;
import bMo;
import cMS;
import cth;
import dnc;
import java.util.ArrayList;

public class SystemMessageCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = null;
    int i = 2147483647;

    if (paramArrayList.size() >= 4) {
      str = ((String)paramArrayList.get(3)).trim();
    }

    if (paramArrayList.size() >= 3)
      try {
        i = Integer.parseInt((String)paramArrayList.get(2));
      }
      catch (NumberFormatException localNumberFormatException) {
      }
    KO.Vm().a(new bMo(cMS.ksh, "Message", 500, 2500, "AnimChallenge1"));
  }

  public boolean X()
  {
    return false;
  }
}