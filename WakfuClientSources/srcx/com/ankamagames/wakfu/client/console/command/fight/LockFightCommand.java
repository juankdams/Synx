package com.ankamagames.wakfu.client.console.command.fight;

import aeF;
import cth;
import dbj;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class LockFightCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(LockFightCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dbj.lockFight();
  }

  public boolean X() {
    return false;
  }
}