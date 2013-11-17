import java.util.ArrayList;
import java.util.Collections;

public class bkx extends cGj
{
  public static final String NAME = "name";
  public static final String fAS = "contentList";
  public static final String fAT = "usable";
  private static final String[] bF = { "name", "contentList", "usable" };
  private final long fAU;
  private final String m_name;
  private final boolean dgA;
  private final ArrayList fAV = new ArrayList();

  private final aZh fAW = new uT(this);
  private final bbk fAX = new GB(this);

  public bkx(long paramLong, String paramString, boolean paramBoolean, ql paramql) {
    this.fAU = paramLong;
    this.m_name = paramString;
    this.dgA = paramBoolean;

    paramql.c(new cT(this));

    switch (cR.Sc[paramql.xu().ordinal()]) {
    case 1:
      Collections.sort(this.fAV, AY.bwN);
      break;
    case 2:
    default:
      Collections.sort(this.fAV, AY.bwO);
    }
  }

  public void bvr()
  {
    byz localbyz = byv.bFN().bFO();
    Vu localVu = (Vu)localbyz.b(RS.cru);
    localVu.a(this.fAW);
    for (cHu localcHu = localbyz.bGP().cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      localcRs.d(this.fAX);
    }
  }

  public void bvs() {
    byz localbyz = byv.bFN().bFO();
    Vu localVu = (Vu)localbyz.b(RS.cru);
    localVu.b(this.fAW);
    for (cHu localcHu = localbyz.bGP().cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      localcRs.c(this.fAX);
    }
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("contentList"))
      return this.fAV;
    if (paramString.equals("name"))
      return this.m_name;
    if (paramString.equals("usable")) {
      return Boolean.valueOf(this.dgA);
    }
    return null;
  }

  public long bvt() {
    return this.fAU;
  }
}