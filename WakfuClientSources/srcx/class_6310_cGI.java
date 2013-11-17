import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Iterator;

public class cGI
  implements dBv
{
  public static final String iBN = "typeFilterList";
  public static final String[] bF = { "typeFilterList" };

  protected ArrayList cVf = new ArrayList();

  public cGI() {
    init();
  }

  protected final void init() {
    this.cVf.clear();
    for (aYk localaYk : aYk.values())
      if (b(localaYk))
      {
        this.cVf.add(a(localaYk));
      }
  }

  private boolean b(aYk paramaYk) {
    if (paramaYk == aYk.fdN) {
      return false;
    }

    return true;
  }

  protected dKJ a(aYk paramaYk) {
    return new dKJ(paramaYk.getType());
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("typeFilterList")) {
      return this.cVf;
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

  private dKJ el(byte paramByte) {
    for (dKJ localdKJ : this.cVf) {
      if (localdKJ.bJ() == paramByte) {
        return localdKJ;
      }
    }
    return null;
  }

  public boolean l(String paramString) {
    return false;
  }

  public void a(aYk paramaYk, boolean paramBoolean) {
    n(paramaYk.getType(), paramBoolean);
  }

  public void n(byte paramByte, boolean paramBoolean) {
    c(paramByte, paramBoolean, true);
  }

  protected void c(byte paramByte, boolean paramBoolean1, boolean paramBoolean2) {
    for (dKJ localdKJ : this.cVf) {
      if (localdKJ.bJ() == paramByte) {
        localdKJ.setSelected(paramBoolean1);
        break;
      }
    }

    if (paramBoolean2)
      WakfuClientInstance.awy().awB().c(bmz.fEo, cBL());
  }

  public void bLQ()
  {
    for (dKJ localdKJ : this.cVf)
      localdKJ.setSelected(true);
  }

  public void bLR()
  {
    for (dKJ localdKJ : this.cVf)
      localdKJ.setSelected(false);
  }

  public void cBK()
  {
    np(WakfuClientInstance.awy().awB().f(bmz.fEo));
  }

  private String cBL() {
    StringBuilder localStringBuilder = new StringBuilder();
    for (dKJ localdKJ : this.cVf) {
      if (localdKJ.p(null)) {
        localStringBuilder.append(localdKJ.bJ()).append(";");
      }
    }

    return localStringBuilder.toString();
  }

  public void np(String paramString) {
    for (Object localObject1 = this.cVf.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (dKJ)((Iterator)localObject1).next();
      ((dKJ)localObject2).setSelected(false);
    }
    Object localObject2;
    localObject1 = paramString.split(";");
    for (Object localObject3 : localObject1) {
      byte b = bUD.e(localObject3, (byte)-1);
      if (b != -1)
        c(b, true, false);
    }
  }

  public ArrayList cBM()
  {
    return this.cVf;
  }

  public boolean a(dwn paramdwn, byte paramByte) {
    dKJ localdKJ = el(paramByte);
    if (localdKJ == null) {
      return false;
    }
    return !localdKJ.p(paramdwn);
  }
}