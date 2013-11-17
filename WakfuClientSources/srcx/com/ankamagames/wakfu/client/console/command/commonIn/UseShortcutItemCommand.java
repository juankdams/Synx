package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import bJz;
import byv;
import byz;
import cth;
import dnc;
import dpr;
import java.util.ArrayList;

public class UseShortcutItemCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (((String)paramArrayList.get(2)).length() >= 2) {
      dpr localdpr = byv.bFN().bFO().bGD();
      byte b = Byte.parseByte(((String)paramArrayList.get(2)).charAt(1) + "");

      b = localdpr.ft(b).VH();

      localdpr.f(b, Short.parseShort(((String)paramArrayList.get(2)).charAt(0) + ""));
    }
  }

  public boolean X() {
    return false;
  }
}