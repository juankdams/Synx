import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class dQz extends cGj
{
  protected static final Logger K = Logger.getLogger(dQz.class);
  public static final String eUK = "currentName";
  public static final String eUL = "linksByIsland";
  public static final String ciu = "iconUrl";
  private final Xg mkQ;
  private long mkR;
  private int bHh;
  private boolean mkS;

  public dQz()
  {
    this.mkQ = new Xg();
  }

  public boolean kT(long paramLong)
  {
    this.mkS = false;
    this.mkQ.clear();

    this.mkR = paramLong;

    CU localCU = aot.dtv.a(dFN.lQe, this.mkR);
    this.bHh = localCU.Mc();

    byz localbyz = byv.bFN().bFO();
    kr localkr = localbyz.bGF().aIA();
    while (localkr.hasNext()) {
      int i = localkr.next();
      aNn localaNn = (aNn)aot.dtv.a(dFN.lQe, i);
      if ((localaNn != null) && (localaNn.getId() != paramLong) && (localaNn.af(localbyz)))
      {
        baK localbaK = (baK)this.mkQ.get(localaNn.arT());
        if (localbaK == null) {
          localbaK = new baK(localaNn.arT());
          this.mkQ.put(localaNn.arT(), localbaK);
        }

        bVn localbVn = aot.dtv.m(paramLong, localaNn.getId());

        localbaK.a(new Of(localbVn, this.mkR));
      }
    }
    return true;
  }

  public String[] getFields() {
    return null;
  }

  public ArrayList drA() {
    ArrayList localArrayList = new ArrayList();
    int i = 0; for (int j = this.mkQ.size(); i < j; i++) {
      localArrayList.add(this.mkQ.hc(i));
    }

    Collections.sort(localArrayList, ceT.bEa);
    return localArrayList;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("linksByIsland")) {
      if (this.mkQ.size() == 0)
        return null;
      return drA();
    }if (paramString.equals("currentName")) {
      if (this.mkS) {
        return bU.fH().getString("haven.world.zaap.name");
      }
      return bU.fH().b(36, (int)this.mkR, new Object[0]);
    }if (paramString.equals("iconUrl")) {
      return ay.bd().a("zaapTypeIconPath", "defaultIconPath", new Object[] { Integer.valueOf(this.bHh == -1 ? anz.drc.azZ() : this.bHh) });
    }

    return null;
  }

  public void C(long paramLong, int paramInt) {
    this.bHh = -1;
    this.mkQ.clear();
    this.mkR = paramLong;
    this.mkS = true;
    byz localbyz = byv.bFN().bFO();
    kr localkr = localbyz.bGF().aIA();
    while (localkr.hasNext()) {
      int i = localkr.next();
      aNn localaNn = (aNn)aot.dtv.a(dFN.lQe, i);
      if ((localaNn != null) && (localaNn.af(localbyz)))
      {
        baK localbaK = (baK)this.mkQ.get(localaNn.arT());
        if (localbaK == null) {
          localbaK = new baK(localaNn.arT());
          this.mkQ.put(localaNn.arT(), localbaK);
        }

        localbaK.a(new Of(new bVn(0L, (int)paramLong, (int)localaNn.getId(), paramInt), this.mkR));
      }
    }
  }
}