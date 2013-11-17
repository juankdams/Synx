import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class kd extends dRq
  implements caY, el
{
  public static final String aNe = "timelineElementType";
  public static final int aNf = 1;
  public static final int aNg = 2;
  public static final String TAG = "timeline";
  private static final int aNh = 250;
  private zu aNi;
  private azz aNj;
  private int aNk;
  private ArrayList aNl;
  private ArrayList aNm;
  private buG aNn;
  private HashMap aNo;
  private czv aNp;
  private boolean aNq;
  private boolean aNr;
  private boolean aNs;
  private boolean aNt;
  private ArrayList aNu;
  private ArrayList aNv;
  private rF aNw;
  private static int aNx = 100;
  private final Object aNy;
  public static final int cs = "content".hashCode();

  public kd()
  {
    this.aNo = new HashMap();

    this.aNq = false;

    this.aNr = false;
    this.aNs = true;

    this.aNt = false;

    this.aNw = new rF();

    this.aNy = new Object();
  }

  public void b(aNL paramaNL)
  {
    if ((paramaNL instanceof eR))
      this.aNj.a((eR)paramaNL);
    else if ((paramaNL instanceof czv)) {
      this.aNp = ((czv)paramaNL);
    }
    super.b(paramaNL);
  }

  private void rR() {
    this.aNn = new buG(null);
    axU localaxU = new axU();
    localaxU.aJ();
    localaxU.setNonBlocking(this.meQ);
    localaxU.setRendererManager(this.aNj);
    localaxU.setEnableDND(false);
    localaxU.setEnabled(this.bur);
    localaxU.setNetEnabled(this.meS);
    this.aNn.e(localaxU);
    a(localaxU);
    localaxU.setContentProperty("timelineTurn", null);
    localaxU.setContent(this.aNw);
    this.aNo.put(localaxU, Integer.valueOf(1));
  }

  public che b(Su paramSu) {
    che localche = new che(paramSu, null);

    paramSu.d(eu.azq).a(this);
    this.aNl.add(localche);

    this.aNq = true;
    setNeedsToPreProcess();

    axU localaxU = new axU();
    localaxU.aJ();
    localaxU.setNonBlocking(this.meQ);
    localaxU.setRendererManager(this.aNj);
    localaxU.setEnableDND(false);
    localaxU.setEnabled(this.bur);
    localaxU.setNetEnabled(this.meS);
    a(localaxU);
    localaxU.setContentProperty("timeline" + paramSu.getId(), null);
    localaxU.setContent(paramSu);
    localche.e(localaxU);

    this.aNo.put(localaxU, Integer.valueOf(1));

    setWidgetOnTop(this.aNp);

    return localche;
  }

  private void a(che paramche) {
    if (this.aNl == null) {
      return;
    }

    synchronized (this.aNy) {
      this.aNl.remove(paramche);

      paramche.xg().d(eu.azq).b(this);

      axU localaxU = paramche.getRenderable();
      int i = ((Integer)this.aNo.get(localaxU)).intValue();
      if (i == 1) {
        this.aNo.remove(localaxU);
        localaxU.beH();
      } else {
        this.aNo.put(localaxU, Integer.valueOf(i - 1));
      }

      this.aNq = true;
      setNeedsToPreProcess();
    }
  }

  public void c(Su paramSu) {
    if (this.aNl == null) {
      return;
    }

    synchronized (this.aNy) {
      for (int i = this.aNl.size() - 1; i >= 0; i--) {
        che localche = (che)this.aNl.get(i);
        if (localche.xg() == paramSu)
        {
          this.aNq = true;
          setNeedsToPreProcess();

          this.aNm.remove(localche);
          this.aNl.remove(i);

          paramSu.d(eu.azq).b(this);

          axU localaxU = localche.getRenderable();
          int j = ((Integer)this.aNo.get(localaxU)).intValue();
          if (j == 1) {
            this.aNo.remove(localaxU);
            localaxU.beH();
          } else {
            this.aNo.put(localaxU, Integer.valueOf(j - 1));
          }
        }
      }
    }
  }

  public String getTag()
  {
    return "timeline";
  }

  public boolean isAppearanceCompatible(Jg paramJg) {
    return true;
  }

  public dOc getWidget(String paramString, int paramInt) {
    if (paramString == null) {
      return null;
    }

    return null;
  }

  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    int i = 0; for (int j = this.aNl.size(); i < j; i++)
      ((che)this.aNl.get(i)).getRenderable().setEnabled(paramBoolean);
  }

  public void setNetEnabled(boolean paramBoolean)
  {
    super.setNetEnabled(paramBoolean);
    int i = 0; for (int j = this.aNl.size(); i < j; i++)
      ((che)this.aNl.get(i)).getRenderable().setNetEnabled(paramBoolean);
  }

  public void setContent(zu paramzu)
  {
    if (this.aNi == paramzu) {
      return;
    }

    this.aNi = paramzu;
    if (this.aNi != null) {
      this.aNi.k(this);
    }

    a(aOH.bfJ());
    this.aNq = true;
    setNeedsToPreProcess();
    setNeedsToPostProcess();
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    if ((this.fnH) || (!this.aYZ) || (!getAppearance().bQ(paramInt1, paramInt2))) {
      return null;
    }

    return super.getWidget(paramInt1, paramInt2);
  }

  private che getFighterElement(Su paramSu, int paramInt)
  {
    int i = 0; for (int j = this.aNl.size(); i < j; i++) {
      che localche = (che)this.aNl.get(i);
      if (localche.xg() == paramSu) {
        if (paramInt == 0) {
          return localche;
        }
        paramInt--;
      }

    }

    return null;
  }

  private void a(aOH paramaOH) {
    if (this.aNi == null) {
      return;
    }

    Su localSu = this.aNi.Ih();

    List localList1 = this.aNi.Id();

    int i = localList1.indexOf(localSu);
    if (i == -1) {
      return;
    }

    List localList2 = this.aNi.Ie();

    List localList3 = this.aNi.Ie();
    ArrayList localArrayList = new ArrayList();

    this.aNk = (localList1.size() - i - 1);
    this.aNm = new ArrayList();

    int j = i;
    Object localObject;
    che localche;
    for (int k = localList1.size(); j < k; j++) {
      localObject = (Su)localList1.get(j);
      localList3.remove(localObject);
      localche = getFighterElement((Su)localObject, 0);
      if (localche == null) {
        localche = b((Su)localObject);
      }
      localArrayList.add(localObject);
      this.aNm.add(localche);
    }

    j = 0; for (k = localList2.size(); (j < k) && (
      (localList3.size() != 0) || (j < localList2.indexOf(localSu))); j++)
    {
      localObject = (Su)localList2.get(j);
      localList3.remove(localObject);
      localche = getFighterElement((Su)localObject, localArrayList.contains(localObject) ? 1 : 0);
      if (localche == null) {
        localche = b((Su)localObject);
      }
      localArrayList.add(localObject);
      this.aNm.add(localche);
    }

    j = this.aNl.size();
    for (k = j - 1; k >= 0; k--) {
      localObject = (che)this.aNl.get(k);
      if (!this.aNm.contains(localObject)) {
        a((che)localObject);
      }
    }

    this.aNs = true;
  }

  public void rS() {
  }

  public void d(Su paramSu) {
    a(pT.xh().h(paramSu));
    this.aNq = true;
    setNeedsToPreProcess();
    setNeedsToPostProcess();
  }

  public void e(Su paramSu) {
    c(paramSu);
    a(pT.xi().h(paramSu));
    this.aNq = true;
    setNeedsToPreProcess();
    setNeedsToPostProcess();
  }

  public void rT() {
  }

  public void rU() {
    this.aNt = true;
    this.aNw.cD(this.aNi.AU());
  }

  public void f(Su paramSu) {
  }

  public void g(Su paramSu) {
    a(aOH.bfK());
    this.aNq = true;
    setNeedsToPreProcess();
    setNeedsToPostProcess();
  }

  public void a(cqm paramcqm) {
    Rx localRx = (Rx)paramcqm;
    if ((localRx.Ce() == eu.azq) && (!this.aNt)) {
      this.aNi.AS();
      this.aNi.Ig();
      a(aOH.bfK());
      this.aNq = true;
      setNeedsToPreProcess();
      setNeedsToPostProcess();
    }
  }

  public axU getCellRenderable(Su paramSu) {
    int i = 0; for (int j = this.aNl.size(); i < j; i++) {
      che localche = (che)this.aNl.get(i);
      if (localche.xg() == paramSu) {
        return localche.getRenderable();
      }
    }

    return null;
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.aNq) {
      cfM();
    }

    return bool;
  }

  public void rV()
  {
    super.rV();

    setNeedsToResetMeshes();

    rR();
  }

  public void bc()
  {
    super.bc();

    if (this.aNl != null) {
      int i = 0; for (int j = this.aNl.size(); i < j; i++) {
        Rx localRx = ((che)this.aNl.get(i)).xg().d(eu.azq);
        localRx.b(this);
      }
      this.aNl.clear();
      this.aNl = null;
    }

    this.aNm = null;
    this.aNu = null;
    this.aNv = null;
    this.aNp = null;

    this.aNo.clear();

    this.aNi = null;
  }

  public void aJ()
  {
    super.aJ();

    this.aNt = false;

    this.aNu = new ArrayList();
    this.aNv = new ArrayList();

    this.aNj = new azz();

    this.aNl = new ArrayList();

    this.mmw = true;

    this.aNr = false;
    this.aNs = false;

    this.aNw.cD(1);

    setNonBlocking(true);

    aNF localaNF = new aNF(this);
    localaNF.aJ();
    a(localaNF);

    this.mfj = true;
    a(CH.bGJ, new eL(this), false);
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == cs)
      setContent((zu)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}