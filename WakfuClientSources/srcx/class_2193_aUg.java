import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aUg extends cGj
{
  protected static final Logger K = Logger.getLogger(aUg.class);
  public static final String eUK = "currentName";
  public static final String eUL = "linksByIsland";
  public static final String ciu = "iconUrl";
  private final Xg eUM = new Xg();
  private long eUN;
  private int bHh;

  public boolean a(long paramLong, cAK paramcAK)
  {
    this.eUM.clear();

    this.eUN = paramLong;
    CU localCU = aot.dtv.a(dFN.lQh, paramLong);
    this.bHh = localCU.Mc();

    byz localbyz = byv.bFN().bFO();

    aot.dtv.t(new dyZ(this, paramLong, localbyz, paramcAK));

    return true;
  }

  private void a(cPT paramcPT, long paramLong, byz parambyz, cAK paramcAK) {
    if ((paramcPT.cGW() != paramLong) && (paramcPT.cGX() != paramLong)) {
      return;
    }
    int i = paramcPT.cGW() == paramLong ? paramcPT.cGX() : paramcPT.cGW();

    if (!paramcPT.b(parambyz, paramcAK)) {
      return;
    }
    boolean bool = paramcPT.a(parambyz, paramcAK);

    aDK localaDK = (aDK)aot.dtv.a(dFN.lQh, i);
    if (localaDK == null) {
      return;
    }

    yn localyn = (yn)this.eUM.get(localaDK.arT());
    if (localyn == null) {
      localyn = new yn(localaDK.arT());
      this.eUM.put(localaDK.arT(), localyn);
    }

    localyn.a(new dAs(paramcPT, this.eUN, bool));
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("linksByIsland")) {
      if (this.eUM.size() == 0)
        return null;
      return this.eUM;
    }if (paramString.equals("currentName"))
      return bjt();
    if (paramString.equals("iconUrl")) {
      return ay.bd().a("zaapTypeIconPath", "defaultIconPath", new Object[] { Integer.valueOf(this.bHh == -1 ? anz.drd.azZ() : this.bHh) });
    }

    return null;
  }

  private String bjt() {
    return bU.fH().b(83, (int)this.eUN, new Object[0]);
  }

  public String getDescription() {
    lZ locallZ = new lZ();
    int i;
    Iterator localIterator;
    if (this.eUM.size() != 0) {
      i = 1;
      for (localIterator = this.eUM.iterator(); localIterator.hasNext(); ) {
        yn localyn = (yn)localIterator.next();
        ArrayList localArrayList = localyn.He();
        String str = localyn.Hd();

        int j = 0; for (int k = localArrayList.size(); j < k; j++) {
          if (i != 0)
            i = 0;
          else
            locallZ.tH();
          dAs localdAs = (dAs)localArrayList.get(j);
          locallZ.a(localdAs.getName()).a(" (").a(str).a(")");
        }
      }
    } else {
      locallZ.a(bU.fH().getString("boat.noDestinationsAvailable"));
    }

    return locallZ.tP();
  }
}