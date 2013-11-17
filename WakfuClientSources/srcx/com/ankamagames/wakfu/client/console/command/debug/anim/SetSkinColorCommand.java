package com.ankamagames.wakfu.client.console.command.debug.anim;

import aeF;
import byv;
import byz;
import cSR;
import cew;
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import cth;
import dnc;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class SetSkinColorCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(SetSkinColorCommand.class);

  private static cSR hES = new cSR();

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList) {
    byz localbyz = byv.bFN().bFO();
    int i = paramArrayList.size();
    if ((i != 3) && (i != 4)) {
      return;
    }
    if (localbyz == null) {
      paramcth.err("pas de localPlayer");
      return;
    }

    cew localcew = localbyz.aeL();
    String str = (String)paramArrayList.get(2);

    int j = Anm.B(str);
    if (j == 0) {
      return;
    }
    int k = 0;
    float[] arrayOfFloat;
    if (paramArrayList.get(3) == null) {
      arrayOfFloat = (float[])hES.remove(j);
      k = 1;
    }
    else {
      localObject = ((String)paramArrayList.get(3)).split("\\s+");
      float f1 = Float.parseFloat(localObject[0]);
      float f2 = Float.parseFloat(localObject[1]);
      float f3 = Float.parseFloat(localObject[2]);
      float f4 = localObject.length == 4 ? Float.parseFloat(localObject[3]) : 1.0F;

      arrayOfFloat = new float[] { f1 * f4, f2 * f4, f3 * f4, f4 };
    }

    Object localObject = localcew.aw(j);

    localcew.e(j, arrayOfFloat);
    if ((!hES.contains(j)) && (localObject != null) && (k == 0))
      hES.put(j, localObject);
    localcew.asZ();
  }

  public boolean X() {
    return false;
  }

  public static void main(String[] paramArrayOfString)
  {
    Pattern localPattern = Pattern.compile("(setSkinColor){1}\\s+([\\w\\-]+)\\s*((?:[0-1](?:\\.[0-9]+)?\\s*){3,4})?");
    Matcher localMatcher = localPattern.matcher("setSkinColor Cheveux 1.0");
    if (localMatcher.matches())
    {
      localMatcher.reset();
      ArrayList localArrayList = new ArrayList();
      while (localMatcher.find())
        for (int i = 0; i <= localMatcher.groupCount(); i++)
          if (i == 3) {
            String[] arrayOfString = localMatcher.group(3).split("\\s+");
            for (int j = 0; j < arrayOfString.length; j++)
              System.out.println(arrayOfString[j]);
          }
          else {
            System.out.println(localMatcher.group(i));
          }
    }
  }
}