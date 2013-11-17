package com.ankamagames.wakfu.client.chat.console.command;

import aeF;
import byv;
import cth;
import cyZ;
import cyx;
import dnc;
import java.util.ArrayList;

public class RemoveFriendCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = ((String)paramArrayList.get(2)).replaceAll("\"", "");

    cyZ localcyZ = new cyZ();
    localcyZ.mA(str);
    byv.bFN().aJK().d(localcyZ);
  }

  public boolean X()
  {
    return false;
  }
}