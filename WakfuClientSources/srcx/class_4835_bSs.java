import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class bSs extends bhI
{
  public static final bhI gxY = new bSs();

  public dCi a(dhJ paramdhJ, EU paramEU, short paramShort)
  {
    dCi localdCi = paramdhJ.auK();
    LinkedList localLinkedList = new LinkedList();

    for (Iterator localIterator1 = localdCi.iterator(); localIterator1.hasNext(); ) { localObject = (bfE)localIterator1.next();
      bzj localbzj = ((bfE)localObject).bsL();
      Iterator localIterator2 = localbzj.cc(paramShort);
      int j = 0;

      while ((localIterator2.hasNext()) && (j == 0))
      {
        dpI localdpI = (dpI)localIterator2.next();
        if ((localdpI.eo() == bsj.fSt.getId()) || (localdpI.eo() == bsj.fSg.getId()) || (localdpI.eo() == bsj.fSv.getId()))
        {
          j = 1;
        }
      }
      if (j == 0)
      {
        byte b = localbzj.bHU();
        bTI localbTI = bTI.dx(b);
        if ((localbTI != null) && 
          (localbTI.bZV()))
        {
          localLinkedList.add(localObject);
        }
      } } Collections.sort(localLinkedList, cJb.cDv());

    short s = paramEU.Om();
    Object localObject = new dCi(s, localdCi.ajw(), localdCi.ajz(), false, false, false);
    int i = 0;
    while ((i < s) && (i < localLinkedList.size())) {
      try {
        ((dCi)localObject).c((dsj)localLinkedList.get(i));
      } catch (dI localdI) {
        K.error("Exception", localdI);
      } catch (dcF localdcF) {
        K.error("Exception", localdcF);
      }
      i++;
    }
    return localObject;
  }
}