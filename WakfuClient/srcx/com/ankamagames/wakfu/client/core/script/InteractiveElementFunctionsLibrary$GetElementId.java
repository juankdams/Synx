package com.ankamagames.wakfu.client.core.script;

import bVl;
import bYE;
import bxT;
import dsg;
import java.util.ArrayList;
import ob;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$GetElementId extends dsg
{
  InteractiveElementFunctionsLibrary$GetElementId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getElementId";
  }

  public String getDescription()
  {
    return "Récupère l'id d'un element interactif à une position";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("type", "Type de l'element interactif", bxT.gja, false), new bYE("posX", "Position x", bxT.gja, false), new bYE("posY", "Position y", bxT.gja, false), new bYE("posZ", "Position z", bxT.gja, true) };
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

    if (m == 0) {
      cYR();
      return;
    }
    int n;
    if (paramInt < 4) {
      for (n = 0; n < m; n++) {
        ob localob1 = (ob)localArrayList.get(n);
        if (localob1.vI() == i) {
          kg(localob1.getId());
          return;
        }
      }
    } else {
      n = Br(3);
      for (int i1 = 0; i1 < m; i1++) {
        ob localob2 = (ob)localArrayList.get(i1);
        if ((localob2.vI() == i) && (localob2.getAltitude() == n)) {
          kg(localob2.getId());
          return;
        }
      }
    }

    a(InteractiveElementFunctionsLibrary.ch(), "L'element interactif de type=" + i + " en (" + j + "," + k + ") n'existe pas");
  }
}