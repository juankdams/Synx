import java.util.Iterator;
import org.apache.log4j.Logger;

public class bFg extends bCI
{
  private static final Logger K = Logger.getLogger(bFg.class);
  private boolean gAl;
  private final bmt gAm;

  public bFg(long paramLong, adL paramadL, ccq paramccq, short paramShort, byte paramByte, boolean paramBoolean, bmt parambmt)
  {
    super(paramLong, paramadL, paramccq, paramShort, paramByte);
    this.gAl = paramBoolean;
    this.gAm = parambmt;
  }

  public boolean a(aOm paramaOm)
  {
    if (paramaOm != null) {
      ld localld = (ld)paramaOm;
      if (localld.apR()) {
        return false;
      }
    }
    return super.a(paramaOm);
  }

  public void b(dkl paramdkl, aOm paramaOm)
  {
    if (this.gAl) {
      localObject = iterator();
      while (((Iterator)localObject).hasNext()) {
        ((ld)((Iterator)localObject).next()).hi(0L);
      }
    }

    Object localObject = (ld)paramaOm;
    ((ld)localObject).hi(dDE.dft().bcy());
    super.b(paramdkl, paramaOm);
  }

  public bmt aaN() {
    return this.gAm;
  }

  public boolean c(asj paramasj)
  {
    throw new UnsupportedOperationException("Le client ne doit pas sérialiser des ProtectorMerchantInventory");
  }

  public boolean a(Xe paramXe) {
    if (this.bkH != paramXe.cxL) {
      K.warn("Mauvais uid à la désérialisation: attendu=" + this.bkH + ", trouvé=" + paramXe.cxL);
    }

    ajy();
    boolean bool = true;
    for (bKX localbKX : paramXe.aZC) {
      ld localld = (ld)this.cHT.o(localbKX.ehJ);
      if (localld != null) {
        try {
          if (b(localld, localbKX.cIh)) {
            localld.a(cQn.eA(localbKX.type));
            localld.bm(localbKX.gha);
            localld.cE(localbKX.aOw);
            localld.hi(localbKX.ghb);
          } else {
            bool = false;
          }
        } catch (dI localdI) {
          bool = false;
          K.error(localdI);
        } catch (dcF localdcF) {
          bool = false;
          K.error(localdcF);
        } catch (bQT localbQT) {
          bool = false;
          K.error(localbQT);
        }
      } else {
        K.error("Désérialisation d'un ProtectorMerchantItem null à la position " + localbKX.cIh);
        bool = false;
      }
    }
    return bool;
  }

  public ld sA(int paramInt)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      ld localld = (ld)localIterator.next();
      if (localld.sD() == paramInt) {
        return localld;
      }
    }
    return null;
  }

  public aOm bLe()
  {
    return new ld();
  }
}