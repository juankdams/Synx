package com.ankamagames.wakfu.client.console.command.debug;

import aWc;
import aeF;
import bUD;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class PlayMusicCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(PlayMusicCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    long l = bUD.getLong(paramArrayList.get(2));
    int i = 100;
    if (paramArrayList.size() > 3) {
      i = bUD.aR(paramArrayList.get(3));
      if (i == 0)
        i = 100;
    }
    aWc.blo().c(l, i / 100.0F);
  }

  public boolean X()
  {
    return false;
  }
}