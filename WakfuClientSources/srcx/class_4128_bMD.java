import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public class bMD extends cKT
  implements bbk, dBv
{
  private static final Logger K = Logger.getLogger(bMD.class);
  public static final String gQp = "allItemsView";
  public static final String gQq = "recyclableItemsView";
  public static final String gQr = "gemmedItemsView";
  public static final String gQs = "currentInventoryView";
  public static final String gQt = "bagListWithoutPockets";
  public static final String gQu = "typedBagListWithoutPockets";
  public static final String gQv = "currentBagType";
  public static final String gQw = "bagTypes";
  private bRN gQx = bRN.hbB;
  private final dVm[] gQy = { new dVm(bRN.hbB), new dVm(bRN.hbC) };
  private static final short gQz = 603;
  public static final String[] bF = { "currentInventoryView", "bagListWithoutPockets", "typedBagListWithoutPockets", "currentBagType", "bagTypes" };

  private final aZh gQA = new bBR(this);

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    try
    {
      if (paramString.equals("currentInventoryView")) {
        switch (bBY.gwh[this.gQx.ordinal()]) {
        case 1:
          return go(true);
        case 2:
          return bUf();
        }

        return null;
      }

      if (paramString.equals("bagTypes"))
        return this.gQy;
      if (paramString.equals("currentBagType"))
        return this.gQx;
      if (paramString.equals("gemmedItemsView"))
        return bUe();
      if (paramString.equals("recyclableItemsView"))
        return bUd();
      if (paramString.equals("allItemsView"))
        return new dzS(this);
      if (paramString.equals("bagListWithoutPockets"))
        return go(false);
      if (paramString.equals("typedBagListWithoutPockets"))
        return go(false);
    }
    catch (Exception localException) {
      K.error("Exception levee", localException);
    }
    return null;
  }

  private aDu bUd() {
    return new aDu(this, new dmi(byv.bFN().bFO()));
  }

  private aDu bUe() {
    return new aDu(this, bhB.fwr);
  }

  private qj[] bUf() {
    qj[] arrayOfqj = new qj[2];
    Vu localVu = (Vu)byv.bFN().bFO().b(RS.cru);
    qj localqj1 = new qj(bU.fH().getString("questInventory"));
    qj localqj2 = new qj(bU.fH().getString("tokenInventory"));
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    localVu.d(new bBQ(this, localArrayList2, localArrayList1));

    localqj1.g(localArrayList1);
    localqj2.g(localArrayList2);
    arrayOfqj[0] = localqj2;
    arrayOfqj[1] = localqj1;
    return arrayOfqj;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString)
  {
    return false;
  }

  public void bUg() {
    dLE.doY().a(this, new String[] { "bagListWithoutPockets", "currentInventoryView", "allItemsView", "recyclableItemsView", "gemmedItemsView" });
  }

  private col[] bUh() {
    return go(true);
  }

  private col[] go(boolean paramBoolean) {
    int i = paramBoolean ? 0 : -1;
    col[] arrayOfcol = new col[6 + i];

    cRs[] arrayOfcRs1 = new cRs[this.iJy.size()];
    this.iJy.d(arrayOfcRs1);

    for (cRs localcRs : arrayOfcRs1) {
      int m = localcRs.cHq();
      if (m == 0) {
        if (paramBoolean)
          arrayOfcol[0] = ((bCJ)localcRs).bLg();
      }
      else if ((m > 0) && (m + i < arrayOfcol.length)) {
        arrayOfcol[(m + i)] = ((bCJ)localcRs).bLg();
      }
    }
    return arrayOfcol;
  }

  public byte gp(boolean paramBoolean) {
    col[] arrayOfcol = bUh();

    if (paramBoolean)
      for (int i = 0; i < arrayOfcol.length; j = (byte)(i + 1))
        if (!cRs.a(false, i))
        {
          if ((arrayOfcol[i] == null) && (cRs.a(paramBoolean, i)))
            return i;
        }
    int k;
    for (int j = 0; j < arrayOfcol.length; k = (byte)(j + 1)) {
      if ((arrayOfcol[j] == null) && (cRs.a(paramBoolean, j))) {
        return j;
      }
    }
    return -1;
  }

  public ArrayList A(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    gA localgA;
    for (localgA : bUi()) {
      if (localgA != null) {
        for (cGx localcGx : paramList) {
          if (localcGx.xL(localgA.ok())) {
            localArrayList.add(localgA);
            break;
          }
        }
      }
    }
    Collections.sort(localArrayList, new bBX(this));

    return localArrayList;
  }

  public int tj(int paramInt) {
    int i = 0;
    for (gA localgA : hi(paramInt)) {
      i += localgA.nP();
    }
    return i;
  }

  public gA[] bUi() {
    ArrayList localArrayList = new ArrayList();

    cHu localcHu = cEg();

    while (localcHu.hasNext()) {
      localcHu.fl();
      localObject = (cRs)localcHu.value();
      for (short s = 0; s < ((cRs)localObject).cFy(); s = (short)(s + 1)) {
        gA localgA = (gA)((cRs)localObject).cHT().dB(s);
        if (localgA != null) {
          localArrayList.add(localgA);
        }
      }
    }
    Object localObject = new gA[localArrayList.size()];
    return (gA[])localArrayList.toArray((Object[])localObject);
  }

  public bRN bUj() {
    return this.gQx;
  }

  public void a(bRN parambRN) {
    this.gQx = parambRN;
    dLE.doY().a(this, new String[] { "currentBagType", "currentInventoryView" });
  }

  protected void a(cRs paramcRs) {
    paramcRs.d(this);
  }

  protected void b(cRs paramcRs) {
    paramcRs.c(this);
  }

  public void a(bNz parambNz) {
    switch (bBY.aOs[parambNz.bVg().ordinal()]) {
    case 1:
    case 2:
    case 3:
    case 4:
      dLE.doY().a(this, new String[] { "allItemsView", "recyclableItemsView", "gemmedItemsView" });
    }
  }

  public void bUk()
  {
    Vu localVu = (Vu)byv.bFN().bFO().b(RS.cru);
    localVu.a(this.gQA);
  }

  public void bUl() {
    dLE.doY().a(this, new String[] { "gemmedItemsView" });
  }
}