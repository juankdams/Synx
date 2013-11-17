package com.ankamagames.wakfu.client.console.command.commonIn;

import Dm;
import aeF;
import byv;
import cth;
import dnc;
import java.util.ArrayList;

public class TutorialBookCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().c(Dm.bHF))
      byv.bFN().b(Dm.bHF);
    else
      byv.bFN().a(Dm.bHF);
  }

  public boolean X()
  {
    return false;
  }
}