import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;

public class dad extends dRq
  implements djl
{
  public static final String TAG = "TabbedContainer";
  private static final String kOe = "tab";
  private static final String kOf = "separator";
  private static final String kOg = "backgroundTabsContainer";
  private static final String kOh = "increaseButton";
  private static final String kOi = "decreaseButton";
  private HashMap kOj;
  private ArrayList kOk;
  private dRq kOl;
  private dRq kOm;
  private czv kOn;
  private dRq kOo;
  private aHd kOp;
  private Rectangle kOq;
  private double kOr;
  private aFD kOs;
  private aFE kOt;
  private aFD fyQ;
  private aFG kOu;
  private Pw fyR;
  private bmG kOv;
  private aHd kOw;
  private boolean kOx;
  private boolean kOy;
  private biy gfO;
  private biy gfP;
  private int kOz;
  private boolean kOA;
  private boolean aQS;
  private boolean gYd;
  private boolean kOB;
  private int kOC;
  private int kOD;
  public static final String kOE = "tabsRadiogGroup";
  public static int kOF = 0;

  public static final int kOG = "pixmapAlignment".hashCode();
  public static final int kOH = "scrollButtonsNearby".hashCode();
  public static final int kOI = "scrollButtonsPositionedBeforeTabs".hashCode();
  public static final int kOJ = "selectedTabIndex".hashCode();
  public static final int kOK = "tabsAlignment".hashCode();
  public static final int kOL = "tabsLabelAlignment".hashCode();
  public static final int kOM = "tabsPosition".hashCode();
  public static final int kON = "tabsSizesEquilibrate".hashCode();
  public static final int fyY = "textOrientation".hashCode();
  public static final int kOO = "tabsXOffset".hashCode();
  public static final int kOP = "tabsYOffset".hashCode();

  public dad()
  {
    this.kOq = new Rectangle();
    this.kOr = 0.0D;

    this.fyQ = aFD.ebY;
    this.kOu = aFG.eck;
    this.fyR = Pw.chX;

    this.kOx = false;
    this.kOy = false;

    this.kOz = 0;
    this.kOA = false;

    this.aQS = true;
    this.gYd = true;
    this.kOB = false;

    this.kOC = 0;
    this.kOD = 0;
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
    if ((paramaNL instanceof buA)) {
      buA localbuA = (buA)paramaNL;
      aHd localaHd = new aHd();
      localaHd.aJ();
      localaHd.setElementMap(this.cUY);
      localaHd.setGroupId(this.kOv.getId());
      localaHd.setValue(Integer.toString(this.kOj.size()));
      localaHd.setTextOrientation(this.fyR);
      localaHd.setPixmapAlign(this.fyQ);
      localaHd.setNeedsScissor(true);
      localaHd.setChildrenAdded(true);
      localaHd.setClickSoundId(-2);
      localaHd.setOverrideClickSound(false);
      localaHd.setStyle("TabbedContainer" + getStyle() + "$" + "tab" + this.kOs, true);
      localbuA.setButton(localaHd);
      localbuA.a(this);
      localaHd.a(CH.bGu, new tZ(this, localaHd), false);

      this.kOj.put(localaHd, localbuA);
      this.kOk.add(localaHd);
      this.kOo.a(localaHd);
    }
  }

  public String getTag()
  {
    return "TabbedContainer";
  }

  public void setElementMap(cpa paramcpa)
  {
    super.setElementMap(paramcpa);

    this.kOv.setElementMap(paramcpa);
  }

  public boolean isScrollButtonsNearby() {
    return this.kOy;
  }

  public void setScrollButtonsNearby(boolean paramBoolean) {
    this.kOy = paramBoolean;
    this.aQS = true;
    setNeedsToPreProcess();
  }

  public boolean isScrollButtonsPositionedBeforeTabs() {
    return this.kOx;
  }

  public void setScrollButtonsPositionedBeforeTabs(boolean paramBoolean) {
    this.kOx = paramBoolean;
    this.aQS = true;
    setNeedsToPreProcess();
  }

  public aFD getTabsPosition() {
    return this.kOs;
  }

  public void setTabsSizesEquilibrate(boolean paramBoolean) {
    this.kOB = paramBoolean;
  }

  public int getTabXOffset() {
    return this.kOC;
  }

  public void setTabsXOffset(int paramInt) {
    this.kOC = paramInt;
  }

  public int getTabYOffset() {
    return this.kOD;
  }

  public void setTabsYOffset(int paramInt) {
    this.kOD = paramInt;
  }

  public void setTabsPosition(aFD paramaFD)
  {
    aId localaId = (aId)this.kOo.getLayoutManager();
    switch (tX.bgx[paramaFD.ordinal()]) {
    case 1:
      localaId.setHorizontal(true);
      break;
    case 2:
      localaId.setHorizontal(true);
      break;
    case 3:
      localaId.setHorizontal(false);
      break;
    case 4:
      localaId.setHorizontal(false);
    }

    this.kOs = paramaFD;
    this.kOo.cfM();
    cME();
  }

  public aFE getTabsAlignment() {
    return this.kOt;
  }

  public void setTabsAlignment(aFE paramaFE)
  {
    this.kOt = paramaFE;
    this.kOo.cfM();
  }

  public aFG getTabsLabelAlignment() {
    return this.kOu;
  }

  public void setTabsLabelAlignment(aFG paramaFG) {
    this.kOu = paramaFG;
    for (aHd localaHd : this.kOk)
      localaHd.setAlign(this.kOu);
  }

  public aFD getPixmapAlignment()
  {
    return this.fyQ;
  }

  public void setPixmapAlignment(aFD paramaFD) {
    this.fyQ = paramaFD;
    for (aHd localaHd : this.kOk)
      localaHd.setPixmapAlign(paramaFD);
  }

  public Pw getTextOrientation()
  {
    return this.fyR;
  }

  public void setTextOrientation(Pw paramPw) {
    if (this.fyR != paramPw) {
      this.fyR = paramPw;
      for (aHd localaHd : this.kOk)
        localaHd.setTextOrientation(paramPw);
    }
  }

  public biy getSelectedTab()
  {
    return this.kOp;
  }

  public int getSelectedTabIndex() {
    for (int i = 0; i < this.kOk.size(); i++) {
      if (this.kOk.get(i) == this.kOp) {
        return i;
      }
    }
    return -1;
  }

  public void setSelectedTab(aHd paramaHd) {
    paramaHd.getAppearance().Li();
    this.kOp = paramaHd;
    this.kOw = paramaHd;
    this.aQS = true;
    setNeedsToPreProcess();
  }

  public void setSelectedTabIndex(int paramInt) {
    if ((!bB) && ((paramInt < 0) || (paramInt >= this.kOk.size()))) throw new AssertionError();
    aHd localaHd = (aHd)this.kOk.get(paramInt);
    if (localaHd.getVisible())
      setSelectedTab(localaHd);
    else
      cMF();
  }

  public void setDataContainer(dRq paramdRq)
  {
    if (paramdRq == this.kOl) {
      return;
    }

    if (this.kOl != null) {
      h(this.kOl);
    }
    a(paramdRq);
    this.kOl = paramdRq;
    this.kOl.invalidate();
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    if ((this.fnH) || (!this.aYZ) || (!getAppearance().bQ(paramInt1, paramInt2)) || (bsP.getInstance().isMovePointMode())) {
      return null;
    }
    Object localObject = this.meQ ? null : this;

    paramInt1 -= getAppearance().getLeftInset();
    paramInt2 -= getAppearance().getBottomInset();

    int i = this.kOo.getX();
    int j = this.kOo.getY() + (int)this.kOr;
    if ((paramInt1 > i) && (paramInt1 < i + this.kOq.getWidth()) && (paramInt2 > j) && (paramInt2 < j + this.kOq.getHeight()))
    {
      localObject = this.kOo.getWidget(paramInt1 - this.kOo.meF.x, paramInt2 - this.kOo.meF.y);
    }
    if (localObject != null) {
      return localObject;
    }

    for (int k = 0; k < this.mmr.size(); k++) {
      dOc localdOc = (dOc)this.mmr.get(k);
      if ((localdOc != this.kOo) && 
        (!localdOc.isUnloading())) {
        localdOc = localdOc.getWidget(paramInt1 - localdOc.meF.x, paramInt2 - localdOc.meF.y);

        if (localdOc != null) {
          localObject = localdOc;
        }
      }
    }

    return localObject;
  }

  private void setButtonsMinHeight(int paramInt)
  {
    for (aHd localaHd : this.kOk)
      localaHd.setPrefSize(new Or(0, paramInt));
  }

  public void setStyle(String paramString, boolean paramBoolean)
  {
    super.setStyle(paramString, paramBoolean);

    cME();
  }

  private void setButtonsMinWidth(int paramInt)
  {
    for (aHd localaHd : this.kOk)
      localaHd.setPrefSize(new Or(paramInt, 0));
  }

  private int iT(boolean paramBoolean)
  {
    int i = 0;
    i = (int)Math.max(paramBoolean ? this.gfO.getMinSize().getWidth() : this.gfO.getMinSize().getHeight(), i);
    i = (int)Math.max(paramBoolean ? this.gfP.getMinSize().getWidth() : this.gfP.getMinSize().getHeight(), i);
    for (aHd localaHd : this.kOk) {
      i = (int)Math.max(paramBoolean ? localaHd.getMinSize().getWidth() : localaHd.getMinSize().getHeight(), i);
    }
    return i;
  }

  public void rV() {
    this.kOv.rV();
    this.kOo.rV();
    this.kOm.rV();
    this.kOn.rV();
    this.gfO.rV();
    this.gfP.rV();
    super.rV();
  }

  public void bc()
  {
    if (this.kOl != null) {
      this.bFw.remove(this.kOl);
    }
    super.bc();

    this.kOj.clear();

    this.kOq = null;
  }

  public void aJ()
  {
    super.aJ();

    this.kOj = new HashMap();
    this.kOk = new ArrayList();

    cSt localcSt = new cSt(this, null);
    localcSt.aJ();
    a(localcSt);

    this.kOv = new bmG();
    this.kOv.aJ();
    this.kOv.setId("tabsRadiogGroup" + kOF++);

    this.kOo = dRq.checkOut();
    dHY localdHY = new dHY(this, null);
    this.kOo.getEntity().a(localdHY);
    this.kOo.getEntity().b(localdHY);

    this.kOm = new dRq();
    this.kOm.aJ();

    this.kOn = new czv();
    this.kOn.aJ();

    this.gfO = new biy();
    this.gfO.aJ();
    this.gfO.a(CH.bGw, new ua(this), false);

    this.gfP = new biy();
    this.gfP.aJ();
    this.gfP.a(CH.bGw, new tW(this), false);

    this.kOo.setNeedsScissor(true);

    a(this.kOm);

    a(this.kOo);

    a(this.kOn);

    a(this.gfO);
    a(this.gfP);

    setTabsPosition(aFD.ebV);
    setTabsAlignment(aFE.ecd);

    this.mfi = true;
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);
    if (this.aQS) {
      invalidate();
      this.aQS = false;
    }

    return bool;
  }

  public void validate()
  {
    if (this.kOp != null)
    {
      setDataContainer(((buA)this.kOj.get(this.kOp)).getData());
    }
    else if (this.kOk.isEmpty())
    {
      this.kOp = null;
      this.kOl = null;
    } else {
      for (aHd localaHd : this.kOk) {
        if ((localaHd.getValue() != null) && (localaHd.getValue().equalsIgnoreCase(this.kOv.getValue()))) {
          setSelectedTab(localaHd);
        }
      }
      if (this.kOp == null) {
        cMF();
      }
      if (this.kOp != null) {
        setDataContainer(((buA)this.kOj.get(this.kOp)).getData());
      }
    }
    super.validate();
  }

  public void brn()
  {
    super.brn();
    cME();
  }

  private void cME()
  {
    if (this.kOj != null) {
      for (buA localbuA : this.kOj.values()) {
        aHd localaHd = localbuA.getButton();
        localaHd.czl.SW();
        localaHd.setStyle("TabbedContainer" + getStyle() + "$" + "tab" + this.kOs, true);
        localbuA.bCq();
      }
    }
    if (this.kOn != null) {
      this.kOn.czl.SW();
      this.kOn.setStyle("TabbedContainer" + getStyle() + "$" + "separator" + this.kOs, true);
    }
    if (this.kOm != null) {
      this.kOm.czl.SW();
      this.kOm.setStyle("TabbedContainer" + getStyle() + "$" + "backgroundTabsContainer" + this.kOs, true);
    }
    if (this.gfO != null) {
      this.gfO.czl.SW();
      this.gfO.setStyle("TabbedContainer" + getStyle() + "$" + "increaseButton" + this.kOs, true);
    }
    if (this.gfP != null) {
      this.gfP.czl.SW();
      this.gfP.setStyle("TabbedContainer" + getStyle() + "$" + "decreaseButton" + this.kOs, true);
    }
  }

  public void cfM()
  {
    super.cfM();
    switch (tX.bgx[this.kOs.ordinal()])
    {
    case 1:
    case 2:
      this.kOo.setPrefSize(new Or(0, iT(false)));
      if (this.kOB)
        setButtonsMinWidth(iT(true)); break;
    case 3:
    case 4:
      this.kOo.setPrefSize(new Or(iT(true), 0));
      if (this.kOB)
        setButtonsMinHeight(iT(false));
      break;
    }
  }

  public void c(bdj parambdj)
  {
    dad localdad = (dad)parambdj;
    super.c(localdad);
    localdad.kOs = this.kOs;
    localdad.kOt = this.kOt;
    localdad.fyQ = this.fyQ;
    localdad.kOu = this.kOu;
    localdad.fyR = this.fyR;
    localdad.kOx = this.kOx;
    localdad.kOy = this.kOy;
    localdad.kOC = this.kOC;
    localdad.kOD = this.kOD;
  }

  public void iU(boolean paramBoolean) {
    this.mmt.a(getContainer());
    if (this.kOp != null)
      cMF();
  }

  public void cMF() {
    for (int i = 0; i < this.kOk.size(); i++) {
      aHd localaHd = (aHd)this.kOk.get(i);
      if ((localaHd != null) && (((buA)this.kOj.get(localaHd)).isVisible())) {
        setSelectedTab(localaHd);
        return;
      }
    }
  }

  private ArrayList getVisibleTabs()
  {
    ArrayList localArrayList = new ArrayList();
    for (aHd localaHd : this.kOk) {
      if (((buA)this.kOj.get(localaHd)).isVisible())
        localArrayList.add(localaHd);
    }
    return localArrayList;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == kOG)
      setPixmapAlignment(aFD.gp(paramString));
    else if (paramInt == kOH)
      setScrollButtonsNearby(bUD.getBoolean(paramString));
    else if (paramInt == kOJ)
      setSelectedTabIndex(bUD.aR(paramString));
    else if (paramInt == kOI)
      setScrollButtonsPositionedBeforeTabs(bUD.getBoolean(paramString));
    else if (paramInt == kOK)
      setTabsAlignment(aFE.gq(paramString));
    else if (paramInt == kOL)
      setTabsLabelAlignment(aFG.gr(paramString));
    else if (paramInt == kOM)
      setTabsPosition(aFD.gp(paramString));
    else if (paramInt == fyY)
      setTextOrientation(Pw.df(paramString));
    else if (paramInt == kOO)
      setTabsXOffset(bUD.aR(paramString));
    else if (paramInt == kOP)
      setTabsYOffset(bUD.aR(paramString));
    else if (paramInt == kON)
      setTabsSizesEquilibrate(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == kOG)
      setPixmapAlignment((aFD)paramObject);
    else if (paramInt == kOJ)
      setSelectedTabIndex(bUD.aR(paramObject));
    else if (paramInt == kOH)
      setScrollButtonsNearby(bUD.getBoolean(paramObject));
    else if (paramInt == kOI)
      setScrollButtonsPositionedBeforeTabs(bUD.getBoolean(paramObject));
    else if (paramInt == kOK)
      setTabsAlignment((aFE)paramObject);
    else if (paramInt == kOL)
      setTabsLabelAlignment((aFG)paramObject);
    else if (paramInt == kOM)
      setTabsPosition((aFD)paramObject);
    else if (paramInt == fyY)
      setTextOrientation((Pw)paramObject);
    else if (paramInt == kOO)
      setTabsXOffset(bUD.aR(paramObject));
    else if (paramInt == kOP)
      setTabsYOffset(bUD.aR(paramObject));
    else if (paramInt == kON)
      setTabsSizesEquilibrate(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}