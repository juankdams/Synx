package com.ankamagames.wakfu.client.chat.console.command;

import aeF;
import bRM;
import byv;
import byz;
import cth;
import das;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class EmoteCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(EmoteCommand.class);
  private final int Rm;

  public EmoteCommand(int paramInt)
  {
    this.Rm = paramInt;
  }

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    boolean bool = byv.bFN().bFO().bGE().a(this.Rm, das.kQI);
    if (!bool)
      K.error("Impossible d'utiliser l'Emote " + this.Rm);
  }

  public boolean X()
  {
    return false;
  }
}