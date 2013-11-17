import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

abstract class Vk extends doA
{
  private static final short czu = 8;
  private static final short czv = 2;
  private dCi czw;
  public cCH czx;

  Vk()
  {
    this.czx = new aO(this);
  }
  protected void aiq() {
    dhJ localdhJ = (dhJ)this.evp;

    dCi localdCi = localdhJ.auK();

    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();

    a(localdCi, localArrayList1, true, false);
    a(localdCi, localArrayList2, false, true);

    Collections.sort(localArrayList1, cJb.cDv());
    Collections.sort(localArrayList2, cJb.cDv());
    Object localObject;
    if (localArrayList2.size() > 0)
      localObject = localArrayList2.subList(0, Math.min(localArrayList2.size(), 2));
    else {
      localObject = new LinkedList();
    }

    ((List)localObject).addAll(localArrayList1.subList(0, Math.min(localArrayList1.size(), 8 - ((List)localObject).size())));

    this.czw = new dCi((short)8, localdCi.ajw(), localdCi.ajz(), false, false, false);

    for (Iterator localIterator = ((List)localObject).iterator(); localIterator.hasNext(); ) {
      bfE localbfE = (bfE)localIterator.next();
      try {
        if (this.czw.f(localbfE)) {
          K.warn("Le sort est deja contenu dans l'inventaire, il faut vérifier si son élément n'est pas PHYSICAL id : " + localbfE.ok());
        }
        else
        {
          this.czw.c(localbfE);
        }
      } catch (dI localdI) { K.error("Exception", localdI);
      } catch (dcF localdcF) {
        K.error("Exception", localdcF);
      }
    }
  }

  private void a(dCi paramdCi, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    for (bfE localbfE : paramdCi) {
      bzj localbzj = localbfE.bsL();
      Iterator localIterator2 = localbzj.cc(cVC());

      byte b = localbzj.bHU();

      bTI localbTI = bTI.dx(b);
      if ((localbTI != null) && 
        ((paramBoolean1) || (!localbTI.bZV())) && 
        ((paramBoolean2) || (localbTI != bTI.hfc)) && 
        (!localbzj.bHY()))
      {
        int i = 0;
        while (localIterator2.hasNext()) {
          dpI localdpI = (dpI)localIterator2.next();
          if ((localdpI.eo() == bsj.fSt.getId()) || (localdpI.eo() == bsj.fSg.getId()) || (localdpI.eo() == bsj.fSP.getId()) || (localdpI.eo() == bsj.fSv.getId()))
          {
            i = 1;
            break;
          }
        }

        if (i == 0)
        {
          paramList.add(localbfE);
        }
      }
    }
  }

  public cCH lJ() { return this.czx; }


  public void bc()
  {
    super.bc();
    this.czx = null;
  }

  public void aJ()
  {
    super.aJ();
    this.czx = new aO(this);
  }
}