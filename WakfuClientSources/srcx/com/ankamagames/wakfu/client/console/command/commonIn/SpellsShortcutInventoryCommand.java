package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import byv;
import bzu;
import cth;
import dnc;
import java.util.ArrayList;
import zV;

public class SpellsShortcutInventoryCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (!byv.bFN().aCA().contains(zV.IH())) {
      byv.bFN().a(zV.IH());
    }
    bzu.cf((short)16406);
  }

  public boolean X() {
    return false;
  }
}