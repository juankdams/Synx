import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

public class bDa extends bhI
{
  public static final bhI gxY = new bDa();

  public dCi a(dhJ paramdhJ, EU paramEU, short paramShort)
  {
    dCi localdCi = paramdhJ.auK();
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();

    for (Object localObject1 = localdCi.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bfE)((Iterator)localObject1).next();
      bzj localbzj = ((bfE)localObject2).bsL();

      byte b = localbzj.bHU();
      bTI localbTI = bTI.dx(b);
      if (localbTI != null)
      {
        if (localbTI.bZV())
          localLinkedList1.add(localObject2);
        else if ((localbTI == bTI.hfc) && (!localbzj.bHY())) {
          localLinkedList2.add(localObject2);
        }
      }
    }
    Collections.sort(localLinkedList1, cJb.cDv());
    Collections.sort(localLinkedList2, cJb.cDv());

    localObject1 = new dCi(paramEU.Om(), localdCi.ajw(), localdCi.ajz(), false, false, false);
    Object localObject2 = localLinkedList2.subList(0, Math.min(localLinkedList2.size(), paramEU.Ol()));

    a((List)localObject2, (XB)localObject1, paramEU.Om());
    a(localLinkedList1, (XB)localObject1, paramEU.Om());
    return localObject1;
  }

  private static void a(List paramList, XB paramXB, short paramShort) {
    int i = 0; for (int j = paramList.size(); (i < j) && (paramXB.size() < paramShort); i++) {
      bfE localbfE = (bfE)paramList.get(i);
      try {
        paramXB.c(localbfE);
      } catch (dI localdI) {
        K.error("Exception", localdI);
      } catch (dcF localdcF) {
        K.error("Exception", localdcF);
      }
    }
  }
}