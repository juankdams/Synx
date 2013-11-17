import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class BG extends aOm
  implements dBv
{
  public static final String bDJ = "packType";
  public static final String bsQ = "price";
  public static final String bDK = "formatedPrice";
  public static final String bDL = "item";
  public static final String bDM = "packList";
  public static final String bDN = "durationList";
  public static final String bka = "duration";
  public static final String[] bF = { "packType", "price", "formatedPrice", "item", "packList", "duration", "durationList" };

  private ArrayList bDO = new ArrayList();
  private ArrayList bDP = new ArrayList();
  protected bAp bta;

  public static BG KH()
  {
    BG localBG = new BG();
    localBG.aJ();
    return localBG;
  }

  public boolean og()
  {
    return true;
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    int i;
    int j;
    Object localObject;
    if (paramString.equals("packType")) {
      if (this.bDO.isEmpty()) {
        KJ();
      }

      i = 0; for (j = this.bDO.size(); i < j; i++) {
        localObject = (aPU)this.bDO.get(i);
        if (((aPU)localObject).Hy() == Hy()) {
          return localObject;
        }
      }

      return null;
    }if (paramString.equals("duration")) {
      if (this.bDP.isEmpty()) {
        KK();
      }

      i = 0; for (j = this.bDP.size(); i < j; i++) {
        localObject = (bUF)this.bDP.get(i);
        if (((bUF)localObject).bdK() == KI()) {
          return localObject;
        }
      }

      return null;
    }if (paramString.equals("price"))
      return Integer.valueOf(Hv());
    if (paramString.equals("formatedPrice"))
    {
      return DecimalFormat.getIntegerInstance().format(Hv());
    }if (paramString.equals("item"))
      return getItem();
    if (paramString.equals("packList")) {
      if (this.bDO.isEmpty()) {
        KJ();
      }
      return this.bDO;
    }if (paramString.equals("durationList")) {
      if (this.bDP.isEmpty()) {
        KK();
      }
      return this.bDP;
    }
    return getItem() == null ? null : getItem().getFieldValue(paramString);
  }

  public short nP()
  {
    if (getItem() == null)
      return -1;
    return super.nP();
  }

  public bAp KI() {
    return this.bta;
  }

  public void KJ() {
    this.bDO.clear();
    for (bCe localbCe : bCe.values())
      if (localbCe.goO <= nP())
        this.bDO.add(new aPU(localbCe, true, localbCe == this.bsX));
  }

  public void KK()
  {
    this.bDP.clear();
    for (bAp localbAp : bAp.values())
      this.bDP.add(new bUF(this, localbAp, localbAp == this.bta));
  }

  public void a(String paramString, Object paramObject)
  {
    if (paramString.equalsIgnoreCase("price")) {
      int i = eX.parseStringNumber(paramObject.toString());
      if (i != -1)
        ed(i);
    }
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString)
  {
    return paramString.equalsIgnoreCase("price");
  }

  public void ed(int paramInt)
  {
    super.ed(paramInt);
    dLE.doY().a(this, new String[] { "price", "formatedPrice" });
  }

  public void b(bCe parambCe)
  {
    super.b(parambCe);
    for (aPU localaPU : this.bDO) {
      localaPU.setSelected(localaPU.Hy() == parambCe);
    }
    dLE.doY().a(this, new String[] { "packType" });
  }

  public void b(bAp parambAp) {
    this.bta = parambAp;
    for (bUF localbUF : this.bDP) {
      localbUF.setSelected(localbUF.bdK() == parambAp);
    }
    dLE.doY().a(this, new String[] { "duration" });
  }

  public void l(short paramShort)
  {
    super.l(paramShort);
    dLE.doY().a(this, new String[] { "quantity" });
  }

  public dsj ow()
  {
    BG localBG = new BG();
    localBG.aUe = this.aUe;
    localBG.bsX = this.bsX;
    localBG.bsY = this.bsY;
    return localBG;
  }

  public boolean b(Qv paramQv)
  {
    this.aUe = Hh.QM().c(paramQv.cpq);
    if (this.aUe != null) {
      ed(paramQv.cps);
      bCe localbCe = bCe.co(paramQv.cpr);
      if (localbCe != null) {
        b(localbCe);
        return true;
      }
      K.error("Impossible de trouver le pack à " + paramQv.cpr + " items");
      return false;
    }

    return false;
  }

  public boolean a(Qv paramQv)
  {
    paramQv.cps = Hv();
    paramQv.cpr = Hy().goO;
    this.aUe.a(paramQv.cpq);
    return true;
  }

  public String getName() {
    return getItem().getName();
  }

  public String fJ() {
    return getItem().fJ();
  }

  public void bc()
  {
    super.bc();
    this.bDO.clear();
    this.bDP.clear();
    this.bta = null;
  }
}