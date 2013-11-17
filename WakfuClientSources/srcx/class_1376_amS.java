import java.util.ArrayList;
import org.apache.log4j.Logger;

public class amS extends dfy
  implements eo
{
  private static final Logger K = Logger.getLogger(amS.class);

  private aFy dpE = aFy.ebG;

  public amS(aFy paramaFy, adL paramadL, bPr parambPr, short paramShort, boolean paramBoolean) {
    super(paramadL, parambPr, paramShort, paramBoolean);
    this.dpE = paramaFy;
  }

  public boolean a(adm paramadm)
  {
    paramadm.clear();

    paramadm.type = ((byte)this.dpE.ordinal());

    for (bnP localbnP = this.ixA.cTd(); localbnP.hasNext(); ) {
      localbnP.fl();
      short s = localbnP.Lb();
      ahg localahg = (ahg)dB(s);
      if (localahg == null) {
        K.error("Incohérence d'Inventory, l'item $" + localbnP.bic() + " est référencé mais n'est pas présent dans le tableau", new Exception());
      }
      else if (localahg.og()) {
        dBQ localdBQ = new dBQ();
        localdBQ.cIh = s;
        boolean bool = localahg.b(localdBQ.lJs);
        if (bool) {
          paramadm.aZC.add(localdBQ);
        } else {
          K.error("Impossible de convertir le raccourci à la position " + s + " sous forme dé-sérialisée brute");
          return false;
        }
      }
    }
    return true;
  }

  public boolean b(adm paramadm)
  {
    ajy();

    boolean bool = true;

    aFy[] arrayOfaFy = aFy.values();
    if ((paramadm.type >= 0) && (paramadm.type < arrayOfaFy.length))
      this.dpE = arrayOfaFy[paramadm.type];
    else {
      bool = false;
    }
    try
    {
      for (dBQ localdBQ : paramadm.aZC) {
        ahg localahg = (ahg)this.cHT.o(localdBQ.lJs);
        if (localahg != null) {
          if (!b(localahg, localdBQ.cIh))
            bool = false;
        } else {
          bool = false;
          K.error("Erreur lors de la dé-serialisation d'un ArrayInventory : item null");
        }
      }
    } catch (dI localdI) {
      K.error(localdI);
      bool = false;
    } catch (dcF localdcF) {
      K.error(localdcF);
      bool = false;
    } catch (bQT localbQT) {
      K.error(localbQT);
      bool = false;
    }

    return bool;
  }

  public aFy azo() {
    return this.dpE;
  }

  public boolean a(long paramLong, bKq parambKq) {
    ahg localahg = (ahg)ci(paramLong);
    return (localahg != null) && (localahg.asL() == parambKq);
  }
}