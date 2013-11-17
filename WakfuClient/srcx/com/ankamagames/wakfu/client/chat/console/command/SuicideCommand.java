package com.ankamagames.wakfu.client.chat.console.command;

import aeF;
import byv;
import byz;
import cew;
import cth;
import cyx;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import ow;

public final class SuicideCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(SuicideCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().bFO().adF()) {
      return;
    }
    if (byv.bFN().bFO().aeL().dpz() != null) {
      byv.bFN().bFO().aeL().bIS();
    }

    ow localow = new ow();
    byv.bFN().aJK().d(localow);
  }

  public boolean X()
  {
    return false;
  }
}