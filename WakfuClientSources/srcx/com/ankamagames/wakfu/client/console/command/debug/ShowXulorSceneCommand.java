package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bAU;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dCp;
import dnc;
import java.util.ArrayList;

public class ShowXulorSceneCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dCp localdCp = WakfuClientInstance.awy().cUV();
    if (paramArrayList.size() == 3)
      if (((String)paramArrayList.get(2)).equals("0"))
        WakfuClientInstance.awy().rs().a(localdCp);
      else
        WakfuClientInstance.awy().rs().a(localdCp, true);
  }

  public boolean X()
  {
    return false;
  }
}