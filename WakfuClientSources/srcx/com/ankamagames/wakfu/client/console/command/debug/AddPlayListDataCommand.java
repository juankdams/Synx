package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bUD;
import cFX;
import cth;
import dkx;
import dnc;
import java.util.ArrayList;

public class AddPlayListDataCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    long l1 = bUD.getLong(paramArrayList.get(2));
    long l2 = bUD.getLong(paramArrayList.get(3));
    short s = bUD.getShort(paramArrayList.get(4));

    cFX localcFX = new cFX();
    localcFX.a(1, l1, l2, (byte)100, (short)0, (byte)1, 3);
    localcFX.a(2, l1, l2, (byte)100, (short)0, (byte)1, 3);
    localcFX.dC(s);

    dkx.cSX().b(localcFX);
  }

  public boolean X() {
    return false;
  }
}