package com.ankamagames.wakfu.client.console.command.debug;

import QX;
import aeF;
import cth;
import dnc;
import java.util.ArrayList;

public class FileLoadingLogCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    boolean bool = QX.isEnabled();
    QX.setEnabled(!bool);

    if (QX.isEnabled())
      paramcth.trace("file loading log: on");
    else
      paramcth.trace("file loading log: off");
  }

  public boolean X()
  {
    return false;
  }
}