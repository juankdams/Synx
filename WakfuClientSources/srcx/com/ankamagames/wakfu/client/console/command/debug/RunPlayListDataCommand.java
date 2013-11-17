package com.ankamagames.wakfu.client.console.command.debug;

import aWc;
import aeF;
import bUD;
import cth;
import dnc;
import java.util.ArrayList;

public class RunPlayListDataCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    short s = bUD.getShort(paramArrayList.get(2));
    aWc.blo().bt(s);
  }

  public boolean X() {
    return false;
  }
}