package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import byv;
import cth;
import dKb;
import dnc;
import java.util.ArrayList;

public class GuildBannerCreatorCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().c(dKb.djg()))
      byv.bFN().b(dKb.djg());
    else
      byv.bFN().a(dKb.djg());
  }

  public boolean X()
  {
    return false;
  }
}