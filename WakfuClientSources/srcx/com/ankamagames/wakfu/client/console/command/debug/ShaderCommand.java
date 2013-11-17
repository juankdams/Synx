package com.ankamagames.wakfu.client.console.command.debug;

import Pb;
import aeF;
import akR;
import ay;
import bdh;
import bhQ;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dSz;
import dbJ;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ShaderCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(ShaderCommand.class);

  private static final akR hel = new akR();

  private static String bMY() {
    try {
      return ay.bd().getString("shadersPath");
    } catch (bdh localbdh) {
      K.error("", localbdh);
    }
    return "";
  }

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 3) {
      String str = (String)paramArrayList.get(2);

      dbJ localdbJ = (dbJ)hel.get(str);

      if (localdbJ == null) {
        localdbJ = new dbJ(bMY() + str + ".cgfx", "test");
        localdbJ.a(WakfuClientInstance.awy().Dg().cKV());
        localdbJ.L(true);
        localdbJ.e(new bhQ(4000));
        hel.put(str, localdbJ);
        Pb.aaU().a(localdbJ);
      } else {
        localdbJ.stop(500);
        hel.remove(str);
      }
    }
  }

  public boolean X() {
    return false;
  }
}