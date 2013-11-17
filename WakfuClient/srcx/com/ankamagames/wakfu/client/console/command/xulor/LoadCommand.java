package com.ankamagames.wakfu.client.console.command.xulor;

import VV;
import aeF;
import cBQ;
import cth;
import dnc;
import java.util.ArrayList;

public class LoadCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (!paramArrayList.isEmpty())
      cBQ.cxL().a((String)paramArrayList.get(2), VV.dJ((String)paramArrayList.get(2)), 16L, (short)0);
  }

  public boolean X()
  {
    return false;
  }
}