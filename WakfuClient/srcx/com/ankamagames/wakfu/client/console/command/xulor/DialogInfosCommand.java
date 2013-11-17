package com.ankamagames.wakfu.client.console.command.xulor;

import aeF;
import cBQ;
import cth;
import dOc;
import dnc;
import java.util.ArrayList;

public class DialogInfosCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 3) {
      dOc localdOc = (dOc)cBQ.cxL().mU((String)paramArrayList.get(2));
      if (localdOc != null)
        paramcth.trace(localdOc.toString());
      else
        paramcth.err("La dialog " + (String)paramArrayList.get(2) + " n'existe pas.");
    }
  }

  public boolean X()
  {
    return false;
  }
}