package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import byv;
import cth;
import dGW;
import dnc;
import java.util.ArrayList;

public class InventoryCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().c(dGW.dhM()))
      byv.bFN().b(dGW.dhM());
    else
      dGW.dhM().dhN();
  }

  public boolean X()
  {
    return false;
  }
}