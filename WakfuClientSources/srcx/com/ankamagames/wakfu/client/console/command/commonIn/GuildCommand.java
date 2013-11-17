package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import byv;
import cth;
import dnc;
import java.util.ArrayList;
import vt;

public class GuildCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (!byv.bFN().c(vt.Ek()))
      byv.bFN().a(vt.Ek());
    else
      byv.bFN().b(vt.Ek());
  }

  public boolean X()
  {
    return false;
  }
}