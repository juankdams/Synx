package com.ankamagames.wakfu.client.console.command.xulor.property;

import aeF;
import bxq;
import cth;
import dLE;
import dnc;
import java.util.ArrayList;

public class ListCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    StringBuilder localStringBuilder = new StringBuilder("# Liste des propriétés #");
    dLE.doY().ac(new bxq(this, localStringBuilder));

    paramcth.trace(localStringBuilder.toString());
  }

  public boolean X()
  {
    return false;
  }
}