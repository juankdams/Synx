package com.ankamagames.wakfu.client.console.command.commonIn;

import Ts;
import aeF;
import bsP;
import cth;
import dnc;
import java.util.ArrayList;

public class CloseAllWindowsCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    boolean bool = !bsP.getInstance().getVisible();
    if ((bool) || (Ts.agx().isEmpty()))
      bsP.getInstance().setVisible(bool);
  }

  public boolean X()
  {
    return false;
  }
}