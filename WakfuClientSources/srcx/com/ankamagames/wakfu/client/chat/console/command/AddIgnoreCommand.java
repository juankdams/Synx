package com.ankamagames.wakfu.client.chat.console.command;

import aeF;
import byv;
import cth;
import cyx;
import dnc;
import dnu;
import java.util.ArrayList;

public class AddIgnoreCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = ((String)paramArrayList.get(2)).replaceAll("\"", "");

    dnu localdnu = new dnu();
    localdnu.pG(str);
    byv.bFN().aJK().d(localdnu);
  }

  public boolean X()
  {
    return false;
  }
}