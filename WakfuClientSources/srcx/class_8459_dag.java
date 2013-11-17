import java.util.ArrayList;
import java.util.Iterator;

public class dag extends bCI
  implements dBv
{
  public static final String kOQ = "browsingBagInventory";
  public static final String gmh = "bagInventory";
  public static final String kOR = "bagType";
  public static final String gSk = "locked";
  public static final String RH = "iconUrl";
  public static final String kOS = "fleaTitle";
  public static final String kOT = "fleaMarketRegistered";
  public static final String kOU = "currentSize";
  public static final String[] bF = { "browsingBagInventory", "bagInventory", "bagType", "locked", "iconUrl", "fleaTitle", "fleaMarketRegistered", "currentSize" };

  private String kOV = "";
  private boolean kOW;
  private int m_size;
  private String aGq;

  public dag(long paramLong, ccq paramccq, short paramShort, byte paramByte)
  {
    super(paramLong, cVz.cKg(), paramccq, paramShort, paramByte);
  }

  public aOm bLe()
  {
    return BG.KH();
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject1;
    Object localObject3;
    if (paramString.equals("browsingBagInventory")) {
      localObject1 = new aOm[cFy()];
      int i = 0;
      for (localObject3 = iterator(); ((Iterator)localObject3).hasNext(); ) { aOm localaOm = (aOm)((Iterator)localObject3).next();
        localObject1[i] = localaOm;
        i++;
      }
      return localObject1;
    }
    Object localObject2;
    if (paramString.equals("bagInventory")) {
      localObject1 = new ArrayList();
      for (localObject2 = jb(false); ((Iterator)localObject2).hasNext(); ) {
        ((ArrayList)localObject1).add(((Iterator)localObject2).next());
      }
      return localObject1;
    }
    if (paramString.equals("bagType")) {
      localObject1 = "";
      localObject2 = bLd();
      if (localObject2 != null) {
        for (localObject3 = ((ccq)localObject2).cfH(); ((arE)localObject3).hasNext(); ) {
          int j = ((arE)localObject3).aDV();
          localObject1 = (String)localObject1 + bU.fH().b(14, j, new Object[0]);
          if (((arE)localObject3).hasNext())
            localObject1 = (String)localObject1 + ", ";
        }
        if (((String)localObject1).length() > 0)
          localObject1 = bU.fH().getString("market.authorizedItemTypes", new Object[] { localObject1 });
      }
      return ((String)localObject1).length() == 0 ? null : localObject1;
    }
    if (paramString.equals("locked")) {
      return Boolean.valueOf(isLocked());
    }
    if (paramString.equals("iconUrl")) {
      return this.aGq;
    }
    if (paramString.equals("fleaTitle")) {
      return this.kOV;
    }
    if (paramString.equals("fleaMarketRegistered")) {
      return Boolean.valueOf(this.kOW);
    }
    if (paramString.equals("currentSize")) {
      return Integer.valueOf(this.m_size);
    }
    return null;
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

  public boolean l(String paramString) {
    return false;
  }

  public void cMG() {
    dLE.doY().a(this, new String[] { "browsingBagInventory", "bagInventory", "bagType", "locked", "iconUrl", "fleaTitle", "fleaMarketRegistered" });
  }

  public void oG(String paramString)
  {
    this.kOV = paramString;
  }

  public void iV(boolean paramBoolean) {
    this.kOW = paramBoolean;
    dLE.doY().a(this, new String[] { "fleaMarketRegistered" });
  }

  public void setSize(int paramInt) {
    this.m_size = paramInt;
  }

  public int getSize() {
    return this.m_size;
  }

  public void iT(int paramInt) {
    this.aGq = ay.bd().u(paramInt);
  }
}