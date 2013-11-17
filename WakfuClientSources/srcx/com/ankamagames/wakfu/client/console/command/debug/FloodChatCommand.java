package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bU;
import cth;
import dTT;
import dka;
import dnc;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class FloodChatCommand
  implements dnc
{
  private long bpg;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (paramArrayList.size() != 3) {
      return;
    }

    ArrayList localArrayList = new ArrayList();
    for (Field localField : bU.class.getDeclaredFields()) {
      try {
        if (localField.getType() == String.class)
          localArrayList.add(bU.fH().getString((String)localField.get(bU.fH())));
      } catch (IllegalAccessException localIllegalAccessException) {
        localIllegalAccessException.printStackTrace();
      }
    }
    this.bpg = Long.parseLong((String)paramArrayList.get(2));
    for (int i = 0; i < this.bpg; i++)
      dka.cSF().a(new dTT(this, localArrayList), i, 1);
  }

  public boolean X()
  {
    return false;
  }
}