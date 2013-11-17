package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import cth;
import dnc;
import java.util.ArrayList;

public class GCCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    System.gc();
  }

  public boolean X()
  {
    return false;
  }
}