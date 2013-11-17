package com.ankamagames.wakfu.client.console.command.debug;

import aWc;
import aeF;
import bUD;
import cth;
import dnc;
import java.util.ArrayList;

public class AlternativeMusicCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    boolean bool = bUD.getBoolean((String)paramArrayList.get(2));
    aWc.blo().ek(bool);
  }

  public boolean X() {
    return false;
  }
}