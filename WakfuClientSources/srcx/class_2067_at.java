import java.util.ArrayList;
import java.util.Iterator;

public class at extends dRq
  implements cWq, vn
{
  public static final String TAG = "StackList";
  private boolean bY = true;
  private azz bZ;
  private final ArrayList ca = new ArrayList();

  private axU cb = null;
  private Object cc = null;
  private int cd = -1;

  private boolean ce = true;

  private boolean cf = true;
  private boolean cg = true;

  private boolean ch = true;
  private boolean ci = false;
  private int cj;
  private final ArrayList ck = new ArrayList();
  private boolean cl = false;

  private final ArrayList cm = new ArrayList();

  private String cn = null;
  private cpa co = null;

  public static final int cp = "innerExpandable".hashCode();
  public static final int cq = "clickSoundId".hashCode();
  public static final int cr = "innerNonBlocking".hashCode();
  public static final int cs = "content".hashCode();
  public static final int ct = "horizontal".hashCode();
  public static final int cu = "selected".hashCode();
  public static final int cv = "selectedValue".hashCode();
  public static final int cw = "selectionable".hashCode();
  public static final int cx = "selectionTogglable".hashCode();

  public void a(dRY paramdRY)
  {
    if ((paramdRY != null) && (!this.ck.contains(paramdRY)))
      this.ck.add(paramdRY);
  }

  public void b(dRY paramdRY) {
    this.ck.remove(paramdRY);
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
    if ((paramaNL instanceof eR))
      this.bZ.a((eR)paramaNL);
  }

  public void a(Object paramObject)
  {
  }

  public void b(Object paramObject) {
  }

  public boolean b(int paramInt, Object paramObject) {
    return false;
  }

  public void a(Object paramObject1, Object paramObject2) {
  }

  public boolean b(Object paramObject1, Object paramObject2) {
    return false;
  }

  public dOc getWidget(String paramString, int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.ca.size())) {
      return (dOc)this.ca.get(paramInt);
    }

    return null;
  }

  public ArrayList getRenderables() {
    return this.ca;
  }

  public boolean getSelectionable() {
    return this.cf;
  }

  public void setSelectionable(boolean paramBoolean) {
    this.cf = paramBoolean;
  }

  public boolean getSelectionTogglable() {
    return this.cg;
  }

  public void setSelectionTogglable(boolean paramBoolean) {
    this.cg = paramBoolean;
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    int i = 0; for (int j = this.ca.size(); i < j; i++)
      ((axU)this.ca.get(i)).setEnabled(paramBoolean);
  }

  public void setNetEnabled(boolean paramBoolean)
  {
    super.setNetEnabled(paramBoolean);
    int i = 0; for (int j = this.ca.size(); i < j; i++)
      ((axU)this.ca.get(i)).setNetEnabled(paramBoolean);
  }

  public void setEnableDND(boolean paramBoolean)
  {
    this.ce = paramBoolean;
  }

  public boolean getEnableDND() {
    return this.ce;
  }

  public boolean isHorizontal() {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean) {
    ((aId)this.mmt).setHorizontal(paramBoolean);
    this.bY = paramBoolean;
    cfM();
  }

  public boolean isInnerExpandable() {
    return this.ch;
  }

  public void setInnerExpandable(boolean paramBoolean) {
    if (this.ch != paramBoolean) {
      this.ch = paramBoolean;
      for (int i = 0; i < this.ca.size(); i++)
        ((axU)this.ca.get(i)).setExpandable(this.ch);
    }
  }

  public boolean getInnerNonBlocking()
  {
    return this.ci;
  }

  public void setInnerNonBlocking(boolean paramBoolean) {
    if (this.ci != paramBoolean) {
      this.ci = paramBoolean;
      for (int i = 0; i < this.ca.size(); i++)
        ((axU)this.ca.get(i)).setNonBlocking(this.ci);
    }
  }

  public int getSelectedOffsetByValue(Object paramObject)
  {
    int i = 0;
    int j = this.cm.size();
    while ((i < j) && 
      (this.cm.get(i) != paramObject)) {
      i++;
    }

    if (i == j) {
      return -1;
    }
    return i;
  }

  public Object getSelectedValue()
  {
    return this.cc;
  }

  public void setContent(Object[] paramArrayOfObject)
  {
    if (this.fnS) {
      return;
    }
    int i = this.cd;
    Object localObject = getSelectedValue();

    this.cm.clear();

    if (paramArrayOfObject != null)
    {
      this.cm.ensureCapacity(paramArrayOfObject.length);
      for (int j = 0; j < paramArrayOfObject.length; j++) {
        this.cm.add(paramArrayOfObject[j]);
      }

    }

    this.cd = getSelectedOffsetByValue(localObject);
    if ((this.cd == -1) && (i != -1)) {
      g(new arS(this, null, localObject, false));
      g(new arS(this, null, null, true));
    }

    q(this.cm.size());
    ba();

    this.cl = true;
  }

  public void setContent(Iterable paramIterable)
  {
    if (this.fnS) {
      return;
    }
    int i = this.cd;
    Object localObject1 = getSelectedValue();

    this.cm.clear();

    if (paramIterable != null) {
      Iterator localIterator = paramIterable.iterator();
      while ((localIterator != null) && (localIterator.hasNext())) {
        Object localObject2 = localIterator.next();
        this.cm.add(localObject2);
      }

    }

    this.cd = getSelectedOffsetByValue(localObject1);
    if ((this.cd == -1) && (i != -1)) {
      g(new arS(this, null, localObject1, false));
      g(new arS(this, null, null, true));
    }

    q(this.cm.size());
    ba();
  }

  public ArrayList getItems()
  {
    return this.cm;
  }

  public Object getValue(int paramInt) {
    if ((paramInt >= 0) && (paramInt < this.cm.size())) {
      return this.cm.get(paramInt);
    }

    return null;
  }

  public axU getSelected() {
    return this.cb;
  }

  public int getTableIndex(axU paramaxU) {
    return this.ca.indexOf(paramaxU);
  }

  public int getItemIndex(Object paramObject) {
    return this.cm.indexOf(paramObject);
  }

  public void setContentProperty(String paramString, cpa paramcpa) {
    this.cn = paramString;
    this.co = paramcpa;
  }

  public int getOffsetByRenderable(axU paramaxU) {
    return this.ca.indexOf(paramaxU);
  }

  public void setSelected(cZd paramcZd) {
    this.cd = this.cm.indexOf(paramcZd);
    bb();
  }

  public int getClickSoundId() {
    return this.cj;
  }

  public void setClickSoundId(int paramInt) {
    this.cj = paramInt;
  }

  public int getSelectedOffset()
  {
    return this.cd;
  }

  public void setSelectedValue(Object paramObject) {
    if (this.cm == null) {
      return;
    }

    int i = this.cd;
    this.cd = -1;

    for (int j = 0; j < this.cm.size(); j++) {
      if (this.cm.get(j) == paramObject) {
        this.cd = j;
        break;
      }

    }

    if (i != this.cd) {
      if (i != -1) {
        g(new arS(this, (axU)this.ca.get(this.cd), this.cm.get(i), false));
      }
      if (this.cd != -1) {
        g(new arS(this, (axU)this.ca.get(this.cd), this.cm.get(this.cd), true));
      }
      bb();
    }
  }

  protected void a(cSx paramcSx, boolean paramBoolean)
  {
    if ((!paramcSx.cIn()) && (
      (paramcSx.mp() == CH.bGd) || (paramcSx.mp() == CH.bGe)))
    {
      paramcSx.iH(true);
      switch (this.cj) {
      case -1:
        MQ.WK().click();
        break;
      case -2:
        MQ.WK().WO();
        break;
      default:
        MQ.WK().fN(this.cj);
      }
    }
  }

  private void ba()
  {
    if (this.ca == null) {
      return;
    }

    this.cb = null;
    int i = 0;

    int j = this.ca.size();

    for (int k = 0; k < j; k++) {
      axU localaxU = (axU)this.ca.get(k);
      localaxU.setContentProperty(this.cn + "#" + k, this.co);

      if ((this.cm != null) && (k < this.cm.size())) {
        if ((k == this.cd) && (i == 0)) {
          i = 1;
          this.cb = localaxU;
        }
        localaxU.setContent(this.cm.get(k));
      } else {
        localaxU.setContent(null);
      }

    }

    if (i == 0)
      this.cb = null;
  }

  private void bb()
  {
    this.cb = ((axU)this.ca.get(this.cd));
  }

  private void a(axU paramaxU) {
    axU localaxU = this.cb;
    if (paramaxU == this.cb) {
      return;
    }
    Object localObject1 = getSelectedValue();

    this.cb = paramaxU;

    if (this.cb != null)
      this.cd = getOffsetByRenderable(this.cb);
    else
      this.cd = -1;
    Object localObject2;
    if (this.cd == -1)
      localObject2 = null;
    else
      localObject2 = this.cm.get(this.cd);
    arS localarS;
    if (localaxU != null) {
      localarS = new arS(this);
      localarS.f(localaxU);
      localarS.setSelected(false);
      localarS.setValue(localObject1);
      g(localarS);
    }
    if (this.cb != null) {
      localarS = new arS(this);
      localarS.f(this.cb);
      localarS.setSelected(true);
      localarS.setValue(localObject2);
      g(localarS);
    }
  }

  private void q(int paramInt)
  {
    for (int i = this.ca.size(); i < paramInt; i++) {
      axU localaxU = new axU();
      localaxU.aJ();
      localaxU.setCollection(this);
      localaxU.setNonBlocking(this.meQ);
      localaxU.setRendererManager(this.bZ);
      localaxU.setEnableDND(this.ce);
      localaxU.setEnabled(this.bur);
      localaxU.setNetEnabled(this.meS);
      localaxU.setExpandable(this.ch);
      localaxU.setNonBlocking(this.ci);

      localaxU.a(CH.bGw, new bsm(this), false);

      this.ca.add(localaxU);
      a(localaxU);
    }

    i = this.ca.size();
    for (int j = i - 1; j >= paramInt; j--)
      ((axU)this.ca.remove(j)).beH();
  }

  public int size()
  {
    return this.cm != null ? this.cm.size() : 0;
  }

  public void bc()
  {
    super.bc();

    this.cn = null;
    this.co = null;

    this.cb = null;
    this.ca.clear();

    this.cm.clear();

    this.cc = null;

    this.cn = null;
    this.co = null;

    this.bZ = null;

    this.ck.clear();
  }

  public void aJ()
  {
    super.aJ();

    this.meQ = false;
    this.cl = false;

    cVL localcVL = new cVL();
    localcVL.aJ();
    localcVL.setWidget(this);
    a(localcVL);

    this.bZ = new azz();

    this.cd = -1;

    this.ce = true;

    this.mfi = true;

    this.cj = -1;
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);
    if (this.cl) {
      for (int i = this.ck.size() - 1; i >= 0; i--)
        ((dRY)this.ck.get(i)).ci();
      this.cl = false;
    }
    return bool;
  }

  public void c(bdj parambdj)
  {
    at localat = (at)parambdj;
    super.c(parambdj);
    localat.setHorizontal(this.bY);
    localat.setEnableDND(this.ce);
    localat.setInnerExpandable(this.ch);
    localat.setInnerNonBlocking(this.ci);
    localat.setClickSoundId(this.cj);

    for (int i = localat.mmr.size() - 1; i >= 0; i--) {
      dOc localdOc = (dOc)localat.mmr.get(i);
      localdOc.beH();
    }
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cp)
      setInnerExpandable(bUD.getBoolean(paramString));
    else if (paramInt == cq)
      setClickSoundId(bUD.aR(paramString));
    else if (paramInt == cr)
      setInnerNonBlocking(bUD.getBoolean(paramString));
    else if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == cw)
      setSelectionable(bUD.getBoolean(paramString));
    else if (paramInt == cx)
      setSelectionTogglable(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == cp)
      setInnerExpandable(bUD.getBoolean(paramObject));
    else if (paramInt == cq)
      setClickSoundId(bUD.aR(paramObject));
    else if (paramInt == cr)
      setInnerNonBlocking(bUD.getBoolean(paramObject));
    else if (paramInt == cs) {
      if ((paramObject == null) || (paramObject.getClass().isArray()))
        setContent((Object[])paramObject);
      else if ((paramObject instanceof Iterable))
        setContent((Iterable)paramObject);
      else
        return false;
    }
    else if (paramInt == cu)
      setSelected((cZd)paramObject);
    else if (paramInt == cv)
      setSelectedValue(paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}