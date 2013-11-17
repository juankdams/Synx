import java.util.ArrayList;
import java.util.Iterator;

public class bRM extends rs
  implements dBv
{
  public static final float[] hbw = { 0.0F, 1.0F, 0.0F, 0.5F };
  public static final float[] hbx = { 1.0F, 0.0F, 0.0F, 0.5F };
  public static final String hby = "emotesWithTarget";
  public static final String hbz = "emotes";
  public static final String hbA = "smileys";
  public static final String[] bF = { "emotesWithTarget", "emotes", "smileys" };

  private final cSR fFx = new cSR();

  public bRM() {
    clear();
  }

  public void clear()
  {
    super.clear();

    for (aYU localaYU : aYU.values()) {
      int k = localaYU.getId();
      this.fFx.put(k, new cuI(k, localaYU.gp()));
    }
  }

  public boolean cB(int paramInt)
  {
    if (super.cB(paramInt)) {
      doe localdoe = bmJ.fFu.qi(paramInt);
      if (localdoe != null)
        localdoe.cVu();
      return true;
    }
    return false;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    Iterator localIterator;
    doe localdoe;
    if (paramString.equals("emotesWithTarget")) {
      for (localIterator = bmJ.fFu.bxs().iterator(); localIterator.hasNext(); ) { localdoe = (doe)localIterator.next();
        localdoe.j(this.aZB.contains(localdoe.getId()));
      }
      return bmJ.fFu.bxs();
    }
    if (paramString.equals("emotes")) {
      for (localIterator = bmJ.fFu.bxr().iterator(); localIterator.hasNext(); ) { localdoe = (doe)localIterator.next();
        localdoe.j(this.aZB.contains(localdoe.getId()));
      }
      return bmJ.fFu.bxr();
    }
    if (paramString.equals("smileys")) {
      return this.fFx.getValues();
    }
    return null;
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

  public boolean a(int paramInt, das paramdas)
  {
    cC localcC = (cC)this.fFx.get(paramInt);
    if (localcC != null) {
      return tR(paramInt);
    }

    doe localdoe = bmJ.fFu.qi(paramInt);
    if (localdoe.aTi()) {
      bgP.fuH.a(localdoe, paramdas);
      return true;
    }if (b(localdoe, paramdas))
    {
      paramdas.a(localdoe, -1L);
      return true;
    }
    return false;
  }

  private boolean tR(int paramInt)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null)
      return false;
    aYU localaYU = aYU.ox(paramInt);
    if (localaYU == null)
      return false;
    cQb localcQb = new cQb();
    localcQb.setMessage(localaYU.bnW());
    cjO.clE().j(localcQb);
    return true;
  }

  public boolean b(doe paramdoe, das paramdas) {
    int i = paramdoe.getId();
    if ((paramdas.ans()) && (!this.aZB.contains(i)))
      return false;
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc != null) && (
      (!localdKc.ga()) || (paramdoe.aTj()) || (paramdoe.aTi()))) {
      return false;
    }
    cew localcew = localbyz.aeL();
    if (localcew.dpz() != null)
      return false;
    return true;
  }

  public cC tS(int paramInt) {
    return bmJ.fFu.qg(paramInt);
  }

  public void a(bFj parambFj)
  {
    throw new UnsupportedOperationException("Pas de serialisation d'Emote dans le client");
  }
}