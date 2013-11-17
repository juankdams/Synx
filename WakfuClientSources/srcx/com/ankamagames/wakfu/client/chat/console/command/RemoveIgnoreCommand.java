package com.ankamagames.wakfu.client.chat.console.command;

import aeF;
import byv;
import cth;
import cyx;
import dOG;
import dnc;
import java.util.ArrayList;

public class RemoveIgnoreCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = ((String)paramArrayList.get(2)).replaceAll("\"", "");

    dOG localdOG = new dOG();
    localdOG.pG(str);
    byv.bFN().aJK().d(localdOG);
  }

  public boolean X()
  {
    return false;
  }
}