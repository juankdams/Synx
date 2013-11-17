package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import byv;
import cth;
import dnc;
import java.util.ArrayList;
import vt;

public class GuildManagementCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().c(vt.Ek()))
      byv.bFN().b(vt.Ek());
    else
      byv.bFN().a(vt.Ek());
  }

  public boolean X()
  {
    return false;
  }
}