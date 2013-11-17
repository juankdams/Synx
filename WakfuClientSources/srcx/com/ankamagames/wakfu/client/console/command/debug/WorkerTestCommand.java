package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import buq;
import cth;
import dka;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class WorkerTestCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(WorkerTestCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dka.cSF().a(new buq(this), 1000L, -1);
  }

  public boolean X()
  {
    return false;
  }
}