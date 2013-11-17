package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import byv;
import cth;
import dnc;
import java.util.ArrayList;
import kf;

public class DungeonListCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().c(kf.rX()))
      byv.bFN().b(kf.rX());
    else
      byv.bFN().a(kf.rX());
  }

  public boolean X()
  {
    return false;
  }
}