package com.ankamagames.wakfu.client.chat.console.command;

import aeF;
import byv;
import cHg;
import cth;
import cyx;
import dnc;
import java.util.ArrayList;

public final class WhoisCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = ((String)paramArrayList.get(2)).replaceAll("\"", "");

    cHg localcHg = new cHg();
    localcHg.cf(str);
    byv.bFN().aJK().d(localcHg);
  }

  public boolean X() {
    return false;
  }
}