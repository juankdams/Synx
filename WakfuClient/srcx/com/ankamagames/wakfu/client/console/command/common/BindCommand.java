package com.ankamagames.wakfu.client.console.command.common;

import aeF;
import cQb;
import cjO;
import cth;
import dnc;
import java.util.ArrayList;

public class BindCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    cQb localcQb = new cQb();
    localcQb.setMessage((String)paramArrayList.get(2));
    cjO.clE().j(localcQb);
  }

  public boolean X() {
    return false;
  }
}