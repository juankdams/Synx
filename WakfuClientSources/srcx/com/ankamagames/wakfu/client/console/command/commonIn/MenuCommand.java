package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import aoT;
import byv;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class MenuCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(MenuCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (!byv.bFN().c(aoT.aBl()))
      byv.bFN().a(aoT.aBl());
    else
      byv.bFN().b(aoT.aBl());
  }

  public boolean X()
  {
    return false;
  }
}