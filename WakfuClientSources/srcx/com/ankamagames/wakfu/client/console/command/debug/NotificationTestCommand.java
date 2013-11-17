package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bxD;
import cth;
import dka;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class NotificationTestCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(NotificationTestCommand.class);
  private Runnable cdh;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (this.cdh == null) {
      this.cdh = new bxD(this);

      dka.cSF().a(this.cdh, 5000L, 25);
      paramcth.trace("Test started.");
    } else {
      dka.cSF().j(this.cdh);
      this.cdh = null;
      paramcth.trace("Test stopped.");
    }
  }

  public boolean X()
  {
    return false;
  }
}