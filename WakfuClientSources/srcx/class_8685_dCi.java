import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dCi extends XB
  implements eo
{
  private static final Logger K = Logger.getLogger(dCi.class);
  private short aFV;

  public dCi(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public boolean b(dVs paramdVs)
  {
    if (this.cHW) {
      K.warn("Impossible d'ajouter l'information de quantité à un RawSpellLevelInventory qui n'est pas prévu pour");
    }

    paramdVs.clear();
    for (bfE localbfE : this) {
      if (localbfE.og()) {
        oT localoT = new oT();
        if (!localbfE.b(localoT.aUy)) {
          return false;
        }
        paramdVs.aZC.add(localoT);
      }
    }
    return true;
  }

  public boolean c(dVs paramdVs)
  {
    ajy();

    if (this.cHW) {
      K.warn("Impossible d'ajouter les quantités depuis un RawStackInventory qui ne connait pas cette information");
    }
    boolean bool = true;
    bfE localbfE = null;
    for (oT localoT : paramdVs.aZC) {
      try {
        localbfE = (bfE)this.cHT.o(localoT.aUy);
        if (localbfE != null) {
          if (!c(localbfE)) {
            bool = false;
            K.error("Impossible d'ajouter un sort (" + localbfE.ok() + ") au SpellInventory");
            localbfE.release();
          }
        }
        else bool = false; 
      }
      catch (dI localdI)
      {
        K.error(bBd.g(localdI));
        bool = false;
        localbfE.release();
      } catch (dcF localdcF) {
        K.error(bBd.g(localdcF));
        bool = false;
        localbfE.release();
      }
    }

    return bool;
  }

  public short oX() {
    return this.aFV;
  }

  public void m(short paramShort) {
    this.aFV = paramShort;
  }

  public int nP(int paramInt)
  {
    return 0;
  }

  public int bP(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public bfE deX()
  {
    Iterator localIterator = this.cHS.values().iterator(); if (localIterator.hasNext()) { bfE localbfE = (bfE)localIterator.next();
      return localbfE;
    }
    return null;
  }
}