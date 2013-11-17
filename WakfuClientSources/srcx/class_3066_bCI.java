import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class bCI extends dQG
  implements bXd, eo
{
  private static final Logger K = Logger.getLogger(bCI.class);
  protected final long bkH;
  protected final ccq gxc;
  protected final byte gxd;
  protected String gxe;
  private final ArrayList gxf;

  public bCI(long paramLong, adL paramadL, ccq paramccq, short paramShort, byte paramByte)
  {
    super(paramadL, cUX.cJU(), paramShort, true);
    this.bkH = paramLong;
    this.gxc = paramccq;
    this.gxd = paramByte;

    this.gxf = new ArrayList();
  }

  public long EN() {
    return this.bkH;
  }

  public final byte bLc() {
    return this.gxd;
  }

  public final ccq bLd()
  {
    return this.gxc;
  }

  public final aOm ab(gA paramgA)
  {
    aOm localaOm = bLe();
    localaOm.setItem(paramgA);

    boolean bool = false;
    try {
      bool = c(localaOm);
    } catch (amq localamq) {
      K.error("Item can not be added to the merchant bag", localamq);
    } catch (Exception localException) {
      K.error("Item can not be added to the merchant bag", localException);
    }
    if (bool) {
      return localaOm;
    }
    localaOm.setItem(null);
    localaOm.release();
    return null;
  }

  public final aOm a(gA paramgA, short paramShort1, short paramShort2, int paramInt)
  {
    aOm localaOm = bLe();
    localaOm.setItem(paramgA);
    localaOm.b(bCe.co(paramShort2));
    localaOm.ed(paramInt);

    boolean bool = false;
    try {
      bool = e(localaOm, paramShort1);
    } catch (amq localamq) {
      K.error("Erreur lors de l'ajout de L'item au sac marchant!", localamq);
    } catch (Exception localException) {
      K.error("Erreur lors de l'ajout de L'item au sac marchant!", localException);
    }
    if (bool) {
      return localaOm;
    }

    localaOm.setItem(null);
    localaOm.release();
    return null;
  }

  public abstract aOm bLe();

  public boolean a(aOm paramaOm)
  {
    return paramaOm != null;
  }

  public void b(dkl paramdkl, aOm paramaOm) {
    c(paramdkl, paramaOm);
  }

  public cXZ a(dkl paramdkl, long paramLong, short paramShort, dsl paramdsl)
  {
    cXZ localcXZ = new cXZ();
    localcXZ.eM((byte)1);
    aOm localaOm = (aOm)ci(paramLong);

    if (localaOm == null) {
      K.error("Impossible de récupérer l'item " + paramLong);
      return localcXZ;
    }

    if (isLocked()) {
      K.error("Requête d'achat sur un inventaire marchand verouillé");
      localcXZ.eM((byte)3);
      return localcXZ;
    }
    if ((!a(localaOm)) || (paramShort <= 0)) {
      return localcXZ;
    }

    dsl localdsl = paramdkl.fO();

    int i = localaOm.nP();
    long l = localaOm.Hv() * paramShort;

    if ((l > 2147483647L) || (l < 0L)) {
      K.error("[BROCANTE] Tentative d'achat d'un objet en brocante invalide : prix total incohérent (dépassement de capacité ou négatif) [price=" + l + ']');

      return localcXZ;
    }

    int j = localdsl.bDx();
    short s = localaOm.Hy().goO;

    if ((i < paramShort * s) || (j < l) || (s < 0)) {
      K.error("[BROCANTE] Quantité insuffisante(" + paramShort + '/' + i + ") " + "ou le joueur n'a pas les moyens(" + j + '/' + l + ") " + "ou les constantes sont invalides packSize=" + s);

      return localcXZ;
    }

    gA localgA = localaOm.getItem().a(gA.oh().byv().asd(), false);
    localgA.l((short)(paramShort * s));

    if (!paramdkl.P(localgA)) {
      K.warn("[BROCANTE] Impossible d'acheter : Les inventaires du joueur ne peuvent acceuillir l'objet de type " + localgA.ok());
      localgA.release();
      localcXZ.eM((byte)2);
      return localcXZ;
    }

    b(paramdkl, localaOm);

    if (localaOm.nP() == paramShort * s)
    {
      cg(paramLong);
      localaOm.release();
    } else {
      c(localaOm.oj(), (short)-(paramShort * s));
    }

    cRs localcRs = paramdkl.Q(localgA);

    localdsl.BC(j - (int)l);

    if (paramdsl != null) {
      paramdsl.Bj((int)l);
    }
    localcXZ.eM((byte)0);
    localcXZ.e(localcRs);
    localcXZ.aP(localgA);
    localcXZ.ed((int)l);
    localcXZ.zn(paramShort * s);

    return localcXZ;
  }

  public String bLf() {
    return this.gxe;
  }

  public void jE(String paramString) {
    this.gxe = paramString;
  }

  public void a(aOm paramaOm, int paramInt)
  {
    aOm localaOm = (aOm)ci(paramaOm.oj());
    if (localaOm == paramaOm) {
      localaOm.ed(paramInt);
      b(YS.d(this, paramaOm, il(paramaOm.oj())));
    } else {
      K.error("Impossible de définir le prix sur un objet qui ne fait pas partie de l'inventaire: " + paramaOm.oj());
    }
  }

  public void a(aOm paramaOm, bCe parambCe)
  {
    aOm localaOm = (aOm)ci(paramaOm.oj());
    if (localaOm == paramaOm) {
      localaOm.b(parambCe);
      b(YS.e(this, paramaOm, il(paramaOm.oj())));
    } else {
      K.error("Impossible de définir le prix sur un objet qui ne fait pas partie de l'inventaire: " + paramaOm.oj());
    }
  }

  public boolean b(asj paramasj)
  {
    if (this.bkH != paramasj.cxL) {
      K.warn("Mauvais uid à la désérialisation: attendu=" + this.bkH + ", trouvé=" + paramasj.cxL);
    }
    if (this.gxc.ordinal() != (paramasj.dBZ & 0xFF)) {
      K.warn("Mauvais type d'item requis à la désérialisation: attendu=" + this.gxc + ", trouvé=" + paramasj.dBZ);
    }
    if (cFy() != paramasj.dCa) {
      K.warn("Mauvais nombre de slots la désérialisation: attendu=" + cFy() + ", trouvé=" + paramasj.dCa);
    }
    if (this.gxd != paramasj.dCb) {
      K.warn("Mauvaise packMax à la désérialisation: attendu=" + this.gxd + ", trouvé=" + paramasj.dCb);
    }
    this.gxe = paramasj.dCc;
    setLocked(paramasj.dCd);
    ajy();
    boolean bool = true;
    for (cGd localcGd : paramasj.aZC) {
      aOm localaOm = (aOm)this.cHT.o(localcGd.ehJ);
      if (localaOm != null) {
        try {
          if (!b(localaOm, localcGd.cIh)) {
            bool = false;
            K.error("L'item (" + localaOm + ")ne peut être ajouté à l'inventaire, slot : " + localcGd.cIh);
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

        if (!bool) {
          localaOm.setItem(null);
          localaOm.release();
        }
      } else {
        K.error("Désérialisation d'un MerchantItem null à la position " + localcGd.cIh);
        bool = false;
      }
    }
    return bool;
  }

  public boolean c(asj paramasj)
  {
    d(paramasj);
    for (bnP localbnP = this.ixA.cTd(); localbnP.hasNext(); ) {
      localbnP.fl();
      short s = localbnP.Lb();
      aOm localaOm = (aOm)dB(s);
      if (localaOm == null) {
        K.error("Incohérence d'Inventory, l'item $" + localbnP.bic() + " est référencé mais n'est pas présent dans le tableau", new Exception());
      }
      else if (localaOm.og()) {
        cGd localcGd = new cGd();
        localcGd.cIh = s;
        boolean bool = localaOm.j(localcGd.ehJ);
        if (bool) {
          paramasj.aZC.add(localcGd);
        } else {
          K.error("Impossible de convertir l'item à la position " + s + " sous forme désérialisée brute");
          return false;
        }
      }
    }
    return true;
  }

  public void d(asj paramasj) {
    paramasj.clear();
    paramasj.cxL = this.bkH;
    paramasj.dBZ = ((byte)this.gxc.ordinal());
    paramasj.dCa = cFy();
    paramasj.dCb = this.gxd;
    paramasj.dCc = this.gxe;
    paramasj.dCd = isLocked();
  }

  public void a(dWb paramdWb) {
    if (this.gxf.contains(paramdWb)) {
      K.error("Tentative d'ajout multiple du même listener d'evenement sur un MerchantInventory");
      return;
    }
    this.gxf.add(paramdWb);
  }

  public void b(dWb paramdWb) {
    this.gxf.remove(paramdWb);
  }

  protected final void c(dkl paramdkl, aOm paramaOm) {
    int i = 0; for (int j = this.gxf.size(); i < j; i++)
      ((dWb)this.gxf.get(i)).a(paramdkl, paramaOm);
  }

  public String ov()
  {
    return "merchant";
  }
}