package com.ankamagames.wakfu.client.chat.console.command;

import Jl;
import aeF;
import byv;
import byz;
import cth;
import dnc;
import java.util.ArrayList;

public class PartyInvitationCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = ((String)paramArrayList.get(2)).replaceAll("\"", "");

    byv.bFN().bFO().bHj().ch(str);
  }

  public boolean X()
  {
    return false;
  }
}