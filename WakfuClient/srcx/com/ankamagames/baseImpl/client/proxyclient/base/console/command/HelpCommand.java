package com.ankamagames.baseImpl.client.proxyclient.base.console.command;

import aeF;
import coq;
import cth;
import dnc;
import java.util.ArrayList;
import java.util.Iterator;

public class HelpCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();

    ArrayList localArrayList3 = paramcth.cqV().getChildren();
    for (Object localObject1 = localArrayList3.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (aeF)((Iterator)localObject1).next();
      if (((aeF)localObject2).aql() <= paramcth.cqS()) {
        if ((localObject2 instanceof coq))
          localArrayList1.add(localObject2);
        else {
          localArrayList2.add(localObject2);
        }
      }

    }

    localObject1 = paramcth.cqT().getChildren();
    for (Object localObject2 = ((ArrayList)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (aeF)((Iterator)localObject2).next();
      if (((aeF)localObject3).aql() <= paramcth.cqS()) {
        if ((localObject3 instanceof coq))
          localArrayList1.add(localObject3);
        else {
          localArrayList2.add(localObject3);
        }
      }

    }

    localObject2 = new StringBuilder("# Liste des commandes #\n");
    for (Object localObject3 = localArrayList1.iterator(); ((Iterator)localObject3).hasNext(); ) { localaeF = (aeF)((Iterator)localObject3).next();
      ((StringBuilder)localObject2).append("[").append(localaeF.getName()).append("] ");
    }
    aeF localaeF;
    for (localObject3 = localArrayList2.iterator(); ((Iterator)localObject3).hasNext(); ) { localaeF = (aeF)((Iterator)localObject3).next();
      ((StringBuilder)localObject2).append(localaeF.getName()).append(" ");
    }

    paramcth.trace(((StringBuilder)localObject2).toString());
  }

  public boolean X()
  {
    return false;
  }
}