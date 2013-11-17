package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import cth;
import dnc;
import java.util.ArrayList;
import zV;

public class AdditionalShortcutBarCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byte b = Byte.parseByte((String)paramArrayList.get(2));
    zV.IH().M(b);
  }

  public boolean X() {
    return false;
  }
}