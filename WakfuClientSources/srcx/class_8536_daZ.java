import java.util.ArrayList;
import java.util.Iterator;

public class daZ
  implements dBv
{
  public static final String bC = "name";
  public static final String RH = "iconUrl";
  public static final String fFV = "itemType";
  public static final String kSW = "searchSubCategories";
  public static final String kSX = "this";
  public static final String eMS = "enabled";
  protected bnd kSY;
  protected ya kSZ;
  private ArrayList bFw;
  public final String[] bF = { "name", "iconUrl", "itemType", "searchSubCategories", "this" };

  public daZ(ya paramya1, ya paramya2)
  {
    this.kSZ = paramya2;
    this.bFw = d(paramya1);

    this.kSY = new bnd(paramya1);

    if (this.kSY == null)
      this.kSY = new bnd(null);
  }

  public String[] getFields()
  {
    return this.bF;
  }

  public Object getFieldValue(String paramString)
  {
    ya localya;
    if (paramString.equals("name")) {
      localya = this.kSY.bxx();
      return localya == null ? bU.fH().getString("all") : localya.getName();
    }if (paramString.equals("iconUrl")) {
      localya = this.kSY.bxx();
      String str = ay.bd().b(localya == null ? -1 : localya.nc());
      if (str == null) {
        str = ay.bd().b((short)-1);
      }
      return str;
    }if (paramString.equals("searchSubCategories"))
      return this.bFw;
    if (paramString.equals("this"))
      return this;
    if (paramString.equals("enabled"))
    {
      return Boolean.valueOf(true);
    }
    if (paramString.equals("itemType")) {
      return this.kSY;
    }
    return null;
  }

  private ArrayList d(ya paramya) {
    cjT localcjT = new cjT();
    if (this.kSZ == null)
      for (localObject1 = X.aw().aQn().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (ya)((Iterator)localObject1).next();
        localcjT.add(localObject2);
      }
    else {
      localcjT = this.kSZ.ng();
    }
    Object localObject1 = new ArrayList();
    ((ArrayList)localObject1).add(new bnd(null));
    for (Object localObject2 = localcjT.iterator(); ((Iterator)localObject2).hasNext(); ) { ya localya = (ya)((Iterator)localObject2).next();
      if (localya.nk()) {
        ((ArrayList)localObject1).add(new bnd(localya));
      }
    }
    return localObject1;
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

  public ya cMV() {
    return this.kSY.bxx();
  }

  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof daZ))
      return false;
    return cMV() == ((daZ)paramObject).cMV();
  }
}