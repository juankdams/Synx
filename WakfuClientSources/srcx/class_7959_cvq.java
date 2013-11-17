import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class cvq extends XB
  implements eo
{
  private static final Logger K = Logger.getLogger(cvq.class);

  public cvq(adL paramadL) {
    super((short)32767, paramadL, null, false, false, false);
  }

  public cyv b(bcR parambcR, short paramShort)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      cyv localcyv = (cyv)localIterator.next();

      if ((localcyv.cvw().Wh() == parambcR) && 
        (localcyv.cvw().Wi().contains(paramShort))) {
        return localcyv;
      }

    }

    return null;
  }

  public List a(bcR parambcR)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      cyv localcyv = (cyv)localIterator.next();

      if (localcyv.cvw().Wh() == parambcR) {
        localArrayList.add(localcyv);
      }
    }

    return localArrayList;
  }

  public boolean a(rv paramrv)
  {
    if (this.cHW) {
      K.warn("Impossible d'ajouter les quantités depuis un RawSkillInventory qui ne connait pas cette information");
    }

    ajy();

    boolean bool = true;
    cyv localcyv = null;
    for (yV localyV : paramrv.aZC) {
      try {
        localcyv = (cyv)this.cHT.o(localyV.btg);
        if (localcyv != null) {
          if (!c(localcyv)) {
            K.error("Impossible d'ajouter un skill (" + localcyv.ok() + ") au SkillInventory");
            bool = false;
            localcyv.release();
          }
        }
        else bool = false; 
      }
      catch (dI localdI)
      {
        K.error(bBd.g(localdI));
        bool = false;
        localcyv.release();
      } catch (dcF localdcF) {
        K.error(bBd.g(localdcF));
        bool = false;
        localcyv.release();
      }
    }

    return bool;
  }

  public boolean b(rv paramrv)
  {
    if (this.cHW) {
      K.warn("Impossible d'ajouter l'information de quantité à un RawSkillInventory qui n'est pas prévu pour");
    }
    paramrv.clear();
    for (cyv localcyv : this) {
      if (localcyv.og()) {
        yV localyV = new yV();
        if (!localcyv.c(localyV.btg)) {
          return false;
        }
        paramrv.aZC.add(localyV);
      }
    }
    return true;
  }

  public int nP(int paramInt)
  {
    return 0;
  }

  public int bP(int paramInt1, int paramInt2)
  {
    return 0;
  }
}