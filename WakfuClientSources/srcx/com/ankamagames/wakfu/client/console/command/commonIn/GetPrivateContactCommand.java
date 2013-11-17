package com.ankamagames.wakfu.client.console.command.commonIn;

import CM;
import aAx;
import aTp;
import aeF;
import ahB;
import cBQ;
import cDA;
import cpa;
import cth;
import dLE;
import dju;
import dnc;
import drC;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import zC;

public class GetPrivateContactCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(GetPrivateContactCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if ((paramArrayList.get(2) != null) && (((String)paramArrayList.get(2)).length() > 0))
      aW(((String)paramArrayList.get(2)).charAt(0) == '1');
  }

  public static void aW(boolean paramBoolean)
  {
    String str1 = CM.LV().aw(paramBoolean);
    if ((str1 != null) && (str1.length() > 0)) {
      int i = aAx.aMd().aMi().auq();
      String str2 = drC.Bn(i);
      aTp localaTp = (aTp)cBQ.cxL().coO().nf(str2).fi((i == 0 ? "textEditorRenderableContainer." : "") + "chatInput");

      if (localaTp == null) {
        return;
      }
      dju localdju = aAx.aMd().aMi().auy();
      localdju.a("input", "/w \"" + str1 + "\" ");
      dLE.doY().a(localdju, new String[] { "input" });

      if (!localaTp.equals(zC.Ip().Iq()))
        zC.Ip().e(localaTp);
    }
  }

  public boolean X() {
    return false;
  }
}