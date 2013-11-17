package com.ankamagames.wakfu.client.chat.console.command;

import CM;
import aEe;
import aeF;
import bU;
import byv;
import byz;
import cth;
import dnc;
import java.util.ArrayList;

public class HelpCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byz localbyz = byv.bFN().bFO();

    String str = " >" + bU.fH().getString("chat.help") + "\n";

    aEe localaEe = new aEe(str);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public boolean X()
  {
    return false;
  }
}