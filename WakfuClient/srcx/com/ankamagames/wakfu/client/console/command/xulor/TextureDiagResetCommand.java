package com.ankamagames.wakfu.client.console.command.xulor;

import aeF;
import cBQ;
import cth;
import dnc;
import java.util.ArrayList;
import uk;

public class TextureDiagResetCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    cBQ.cxL().bSM().CX();
    paramcth.trace("Remise à zero");
  }

  public boolean X()
  {
    return false;
  }
}