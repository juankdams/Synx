package com.ankamagames.wakfu.client.chat.console.command;

import aZv;
import aeF;
import bBc;
import bHj;
import byv;
import byz;
import cth;
import cyx;
import dnc;
import java.util.ArrayList;

public class AdminChannelMessageCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = (String)paramArrayList.get(2);

    if (!bBc.f(byv.bFN().bFO().bSu().bOR(), bBc.gto)) {
      aZv localaZv = new aZv();
      localaZv.ca(str);
      localaZv.hH("admin_channel");
      byv.bFN().aJK().d(localaZv);
    }
  }

  public boolean X()
  {
    return false;
  }
}