package com.ankamagames.wakfu.client.chat.console.command;

import aeF;
import byv;
import cth;
import cyx;
import dnc;
import dqv;
import java.util.ArrayList;

public class AddFriendCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = ((String)paramArrayList.get(2)).replaceAll("\"", "");

    dqv localdqv = new dqv();
    localdqv.mA(str);
    byv.bFN().aJK().d(localdqv);
  }

  public boolean X()
  {
    return false;
  }
}