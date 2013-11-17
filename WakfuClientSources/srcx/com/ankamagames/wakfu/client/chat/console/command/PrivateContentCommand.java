package com.ankamagames.wakfu.client.chat.console.command;

import CM;
import FJ;
import aeF;
import bU;
import byv;
import byz;
import ceb;
import cth;
import dnc;
import java.util.ArrayList;

public class PrivateContentCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str1 = ((String)paramArrayList.get(2)).replaceAll("\"", "");

    String str2 = (String)paramArrayList.get(3);
    str2 = ceb.cgG().kS(str2);

    if (str1.contains("<")) {
      CM.LV().f(bU.fH().getString("error.chat.privateFieldEmpty"), 3);
      return;
    }
    byz localbyz = byv.bFN().bFO();

    if (localbyz != null)
      FJ.a(str2, localbyz.getName(), localbyz.getId(), str1);
  }

  public boolean X()
  {
    return false;
  }
}