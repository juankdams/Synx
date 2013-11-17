import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class ahB
  implements dBv
{
  private static final Logger K = Logger.getLogger(ahB.class);
  public static final int ddl = 4;
  public static final String ddm = "currentView";
  public static final String ddn = "list";
  public static final String ddo = "windowId";
  public static final String ddp = "canAddView";
  public static final String[] bF = { "currentView", "list", "canAddView", "windowId" };

  private int ddq = 0;

  private final cSR ddr = new cSR();

  private int dds = -1;

  public ahB(int paramInt) {
    this.dds = paramInt;
  }

  public int auq() {
    return this.dds;
  }

  public dju aur()
  {
    int i = aAx.aMd().aMp();
    int j = this.ddr.size();
    if (j >= 4)
      return null;
    if (j == 3) {
      CM.LV().f(bU.fH().getString("error.chatViewMaxReached"), 3);
    }
    int k = aus();
    dju localdju = new dju(k, bU.fH().getString("chat.pipeName.personnal", new Object[] { Integer.valueOf(i) }), abi.cPs, cPU.kzO, false);
    aQL.f(localdju);
    this.ddr.put(k, localdju);
    dLE.doY().a(this, new String[] { "list", "canAddView" });
    return localdju;
  }

  public dju b(int paramInt, String paramString) {
    int i = paramInt == -1 ? aus() : paramInt;
    int j = this.ddr.size();
    if (j >= 4)
      return null;
    if (j == 3) {
      CM.LV().f(bU.fH().getString("error.chatViewMaxReached"), 3);
    }
    dju localdju = new dju(i, paramString, abi.cPt, cPU.kzP, false, true);
    this.ddr.put(i, localdju);
    dLE.doY().a(this, new String[] { "list" });
    return localdju;
  }

  private int aus() {
    for (int i = 0; i < this.ddr.size(); i++) {
      if (this.ddr.get(i) == null)
        return i;
    }
    return this.ddr.size();
  }

  public void a(dju paramdju, boolean paramBoolean)
  {
    int i = paramdju.cUQ();
    j(i, paramBoolean);
  }

  public void j(int paramInt, boolean paramBoolean)
  {
    if (!this.ddr.containsKey(paramInt))
      return;
    dju localdju = (dju)this.ddr.remove(paramInt);
    if (localdju != null) {
      if (paramBoolean)
        localdju.cUT();
      im(paramInt);
      dLE.doY().a(this, new String[] { "list", "canAddView" });
    }
  }

  private void im(int paramInt) {
    for (int i = paramInt; i < this.ddr.size(); i++) {
      dju localdju = (dju)this.ddr.remove(i + 1);
      if (localdju == null) {
        K.error("Erreur de continuité dans les indices des vues à l'indice : " + (i + 1));
        return;
      }
      localdju.AT(i);
      this.ddr.put(i, localdju);
    }
  }

  public dju in(int paramInt)
  {
    return (dju)this.ddr.get(paramInt);
  }

  public dmn aut() {
    return this.ddr.yF();
  }

  public boolean a(dju paramdju) {
    return this.ddr.containsValue(paramdju);
  }

  private dju auu() {
    return aux() > 0 ? (dju)auw()[0] : null;
  }

  public void auv() {
    a(auu());
  }

  public Object[] auw() {
    return this.ddr.getValues();
  }

  public int aux() {
    return this.ddr.size();
  }

  public void io(int paramInt)
  {
    this.ddq = paramInt;
    auE();
  }

  public dju auy() {
    return (dju)this.ddr.get(this.ddq);
  }

  public int auz() {
    return this.ddq;
  }

  public int auA() {
    return this.ddr.size();
  }

  public void a(dnp paramdnp) {
    io(paramdnp.cUQ());
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("list")) {
      ArrayList localArrayList = new ArrayList();
      for (Object localObject : auw()) {
        dju localdju = (dju)localObject;
        localArrayList.add(localdju);
      }
      Collections.sort(localArrayList, new yQ(this));

      return localArrayList;
    }if (paramString.equals("currentView"))
      return auy();
    if (paramString.equals("windowId"))
      return Integer.valueOf(this.dds);
    if (paramString.equals("canAddView")) {
      return Boolean.valueOf(this.ddr.size() < 4);
    }
    return null;
  }

  public void auB() {
    for (dmn localdmn = this.ddr.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      dju localdju = (dju)localdmn.value();
      localdju.clear();
      localdju.clean();
    }
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public void b(dju paramdju) {
    int i = this.ddr.size();
    if (i >= 4)
    {
      return;
    }
    if (this.ddr.containsKey(paramdju.cUQ())) {
      paramdju.AT(aus());
    }
    this.ddr.put(paramdju.cUQ(), paramdju);
    dLE.doY().a(this, new String[] { "list" });
  }

  public String toString()
  {
    return "wId=" + this.dds + " curVId=" + this.ddq + " vieSize=" + auA();
  }

  public void auC() {
    dmn localdmn = this.ddr.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ((dju)localdmn.value()).clean();
    }
  }

  public void auD() {
    for (dmn localdmn = aut(); localdmn.hasNext(); ) {
      localdmn.fl();
      ((dju)localdmn.value()).cUT();
    }
  }

  public void clean() {
    auD();
    this.ddr.clear();
  }

  public void auE() {
    dju localdju = auy();
    if (localdju == null) {
      K.error("On tente de rafraîchir la vue courante du chat d'id=" + auq() + " alors qu'elle n'existe pas !");
      return;
    }
    dLE.doY().a(localdju, dju.bF);
    localdju.cSs();
    localdju.cSm();
  }

  public void a(dju paramdju, int paramInt) {
    if (paramdju == null)
      return;
    paramdju.AT(paramInt);
    dju localdju = (dju)this.ddr.put(paramInt, paramdju);
    a(localdju, paramInt + 1);
  }

  public void ip(int paramInt) {
    for (dju localdju : (dju[])this.ddr.getValues()) {
      localdju.AT(localdju.cUQ() + paramInt);
      this.ddr.put(localdju.cUQ(), localdju);
    }
  }

  public boolean auF() {
    return this.ddr.size() < 4;
  }
}