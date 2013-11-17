package com.ankamagames.wakfu.client.core.script;

import bVl;
import bYE;
import bxT;
import dsg;
import java.util.ArrayList;
import ob;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$GetElementsId extends dsg
{
  InteractiveElementFunctionsLibrary$GetElementsId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getElementsId";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("type", null, bxT.gja, false), new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("id", null, bxT.giY, false) };
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);
    int k = Br(2);

    ArrayList localArrayList = bVl.caZ().dk(j, k);
    int m = localArrayList.size();
    int n = 0;

    if (m != 0)
    {
      int i1;
      if (paramInt < 4) {
        for (i1 = 0; i1 < m; i1++) {
          ob localob1 = (ob)localArrayList.get(i1);
          if (localob1.vI() == i) {
            kg(localob1.getId());
            n = 1;
          }
        }
      } else {
        i1 = Br(3);
        for (int i2 = 0; i2 < m; i2++) {
          ob localob2 = (ob)localArrayList.get(i2);
          if ((localob2.vI() == i) && (localob2.getAltitude() == i1)) {
            kg(localob2.getId());
            n = 1;
          }
        }
      }
    }
    if (n == 0) {
      cYR();
      a(InteractiveElementFunctionsLibrary.ch(), "L'element interactif de type=" + i + " en (" + j + "," + k + ") n'existe pas");
    }
  }
}