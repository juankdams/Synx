package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import byv;
import cth;
import dnc;
import java.util.ArrayList;
import pY;

public class CharacterBookCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    pY localpY = pY.xl();
    if (!byv.bFN().c(localpY))
      byv.bFN().a(localpY);
    else
      byv.bFN().b(localpY);
  }

  public boolean X()
  {
    return false;
  }
}