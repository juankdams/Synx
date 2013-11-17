import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;

public class ccG extends dRq
  implements cWq, vn
{
  public static final String TAG = "List";
  public static final String fjQ = "horizontalScrollBar";
  public static final String fjR = "verticalScrollBar";
  private bKe huF;
  private dRR fcM = null;

  private float huG = -1.0F;

  private float huH = -1.0F;

  private Or cQn = new Or();

  private boolean huI = false;

  private boolean ce = true;

  protected float huJ = 0.0F;

  private int huK = 1;

  private boolean fcO = false;
  private boolean bY;
  private boolean huL = false;

  private int huM = 0;

  private boolean fcN = false;

  private boolean huN = false;

  private int huO = -1;

  private int huP = -1;

  private int huQ = -1;

  private int huR = -1;

  private cD huS = cD.RM;

  private int huT = 1;

  private boolean huU = true;

  private boolean cg = false;

  private boolean cf = true;

  private dOf fcY = dOf.mfI;
  private ArrayList huV;
  protected ArrayList ca;
  private axU fcQ = null;

  private axU cb = null;

  private int cd = -1;

  private azz bZ = new azz();

  protected ArrayList cm = null;

  private ArrayList huW = null;
  private aFG hqK;
  private String cn = null;
  private cpa co = null;

  private boolean huX = false;
  private boolean huY = false;
  private cKm fcV;
  private cKm fcX;
  private aQA huZ;
  private boolean hva = true;

  private final ArrayList ck = new ArrayList();
  private boolean cl = false;

  public static long hvb = 0L;

  public static final int drs = "align".hashCode();
  public static final int hvc = "adaptCellSizeToContentSize".hashCode();
  public static final int hvd = "autoIdealSize".hashCode();
  public static final int cQr = "cellSize".hashCode();
  public static final int cs = "content".hashCode();
  public static final int ct = "horizontal".hashCode();
  public static final int hve = "idealSizeMaxColumns".hashCode();
  public static final int hvf = "idealSizeMaxRows".hashCode();
  public static final int hvg = "idealSizeMinColumns".hashCode();
  public static final int hvh = "idealSizeMinRows".hashCode();
  public static final int hvi = "listFilter".hashCode();
  public static final int hvj = "listOffset".hashCode();
  public static final int hvk = "minDisplayedCells".hashCode();
  public static final int hvl = "mouseOverColor".hashCode();
  public static final int hvm = "selectedColor".hashCode();
  public static final int hvn = "offset".hashCode();
  public static final int hvo = "oppositeScrollBarPosition".hashCode();
  public static final int hvp = "scrollBar".hashCode();
  public static final int fdi = "scrollBarBehaviour".hashCode();
  public static final int cu = "selected".hashCode();
  public static final int cv = "selectedValue".hashCode();
  public static final int cw = "selectionable".hashCode();
  public static final int cx = "selectionTogglable".hashCode();
  public static final int hvq = "showOneMore".hashCode();
  public static final int hvr = "wishedMinSize".hashCode();
  public static final int dNt = "enableDND".hashCode();
  public static final int hvs = "listLayoutMode".hashCode();
  public static final int hvt = "isoColumnCount".hashCode();
  public static final int hvu = "isoPositiveFactor".hashCode();
  public static final int hvv = "scrollMode".hashCode();
  public static final int hvw = "scrollOnMouseWheel".hashCode();

  public ccG()
  {
    this(false);
  }

  public ccG(boolean paramBoolean) {
    this.bY = paramBoolean;
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
    if ((paramaNL instanceof eR))
      this.bZ.a((eR)paramaNL);
  }

  protected void rd()
  {
    if ((this.fcX != null) && (this.cb != null)) {
      this.bqm.d(this.fcX.UM());
    }
    if ((this.fcQ != null) && (this.fcV != null)) {
      this.bqm.d(this.fcV.UM());
    }
    super.rd();
  }

  public void ajj()
  {
    this.fcM.ajj();
    super.ajj();

    a(CH.bGC, new dQc(this), false);

    a(CH.bGy, new dQb(this), false);
  }

  public void ccT()
  {
    for (axU localaxU : this.ca) {
      localaxU.ccT();
    }

    this.fcM.ccT();

    super.ccT();
  }

  public void a(dRY paramdRY) {
    if ((paramdRY != null) && (!this.ck.contains(paramdRY)))
      this.ck.add(paramdRY);
  }

  public void b(dRY paramdRY) {
    this.ck.remove(paramdRY);
  }

  public boolean getEnableDND()
  {
    return this.ce;
  }

  public void setEnableDND(boolean paramBoolean)
  {
    if (this.ce != paramBoolean) {
      this.ce = paramBoolean;
      for (int i = this.ca.size() - 1; i >= 0; i--)
        ((axU)this.ca.get(i)).setEnableDND(paramBoolean);
    }
  }

  public boolean getScrollOnMouseWheel()
  {
    return this.hva;
  }

  public void setScrollOnMouseWheel(boolean paramBoolean) {
    this.hva = paramBoolean;
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    for (int i = this.ca.size() - 1; i >= 0; i--)
      ((axU)this.ca.get(i)).setEnabled(paramBoolean);
  }

  public void setNetEnabled(boolean paramBoolean)
  {
    super.setNetEnabled(paramBoolean);
    for (int i = this.ca.size() - 1; i >= 0; i--)
      ((axU)this.ca.get(i)).setNetEnabled(paramBoolean);
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    if ((this.fnH) || (!this.aYZ) || (!getAppearance().bQ(paramInt1, paramInt2)) || (bsP.getInstance().isMovePointMode())) {
      return null;
    }

    dOc localdOc1 = null;
    dOc localdOc2 = null;

    paramInt1 -= getAppearance().getLeftInset();
    paramInt2 -= getAppearance().getBottomInset();

    for (axU localaxU : this.ca) {
      if (!localaxU.isUnloading()) {
        localdOc1 = localaxU.getWidget(paramInt1 - localaxU.getX(), paramInt2 - localaxU.getY());

        if (localdOc1 != null) {
          localdOc2 = localdOc1;
        }
      }
    }

    if ((this.fcN) && 
      (!this.fcM.isUnloading())) {
      localdOc1 = this.fcM.getWidget(paramInt1 - this.fcM.getX(), paramInt2 - this.fcM.getY());
    }

    if (localdOc1 != null) {
      localdOc2 = localdOc1;
    }

    return localdOc2;
  }

  public boolean g(dMr paramdMr)
  {
    if (this.hva) {
      float f = this.huJ;
      setOffset(this.huJ + paramdMr.dpj());
      return this.huJ != f;
    }

    return false;
  }

  public void setOffset(float paramFloat) {
    this.fcM.getSlider().setValue(bX(paramFloat));
  }

  public float getOffset() {
    return this.huJ;
  }

  private float bX(float paramFloat) {
    if (paramFloat < 0.0F) {
      paramFloat = 0.0F;
    }

    if ((this.huH == -1.0F) || (this.huG == -1.0F)) {
      return 1.0F;
    }

    if (this.bY) {
      f = getPotentialColumnCount(this.huH) - this.huG + this.huM;

      if (paramFloat > f + 1.0F) {
        paramFloat = f + 1.0F;
      }
      return f == 0.0F ? 0.0F : paramFloat / f;
    }
    float f = getPotentialRowCount(this.huG) - this.huH + this.huM;

    if (paramFloat > f + 1.0F) {
      paramFloat = f + 1.0F;
    }

    return f == 0.0F ? 0.0F : 1.0F - paramFloat / f;
  }

  private float bY(float paramFloat)
  {
    float f2;
    float f1;
    if (this.bY) {
      f2 = getPotentialColumnCount(this.huH) - this.huG + this.huM;

      f1 = f2 * paramFloat;
    } else {
      f2 = getPotentialRowCount(this.huG) - this.huH + this.huM;

      f1 = f2 * (1.0F - paramFloat);
    }
    if (f1 < 0.0F)
      f1 = 0.0F;
    else if (f1 > f2 + 1.0F) {
      f1 = f2 + 1.0F;
    }
    return f1;
  }

  private int getPotentialRowCount(float paramFloat) {
    ArrayList localArrayList = getItems();
    if (localArrayList == null) {
      return 0;
    }
    return (int)Math.ceil(localArrayList.size() / paramFloat);
  }

  private int getPotentialColumnCount(float paramFloat) {
    ArrayList localArrayList = getItems();
    if (localArrayList == null) {
      return 0;
    }
    return (int)Math.ceil(localArrayList.size() / paramFloat);
  }

  public void setListOffset(float paramFloat)
  {
    setListOffset(paramFloat, true);
  }

  public void setListOffset(float paramFloat, boolean paramBoolean) {
    float f1 = this.huJ;
    this.huJ = paramFloat;

    int i = (int)((Math.floor(this.huJ) - Math.floor(f1)) * (this.bY ? this.huH : this.huG));
    int j = i != 0 ? 1 : 0;
    float f2 = paramFloat - f1;

    if (j != 0)
    {
      int k;
      if (f2 > 0.0F)
      {
        for (k = 0; k < i; k++)
          this.ca.add(this.ca.remove(0));
      }
      else if (f2 < 0.0F)
      {
        for (k = 0; k < -i; k++) {
          this.ca.add(0, this.ca.remove(this.ca.size() - 1));
        }

      }

    }

    if (paramBoolean) {
      getListLayout().ap(false);
    }

    if ((j != 0) && (paramBoolean))
      uE(i);
  }

  protected void ba()
  {
    uE(0);
  }

  private void uE(int paramInt) {
    if ((this.fcO) || (this.ca == null)) {
      return;
    }

    this.cb = null;
    int i = 0;
    int j;
    if (this.bY)
      j = bCO.bD(this.huJ) * bCO.aB(this.huH);
    else {
      j = bCO.bD(this.huJ) * bCO.aB(this.huG);
    }

    for (int k = 0; k < this.ca.size(); k++) {
      int m = k + j;
      axU localaxU1 = (axU)this.ca.get(k);

      if ((k >= 0) && (k < this.ca.size()))
      {
        if ((this.cm != null) && (m >= 0) && (m < this.cm.size()))
        {
          if ((m == this.cd) && (i == 0)) {
            i = 1;
            this.cb = localaxU1;
            break;
          }
        }
      }
    }
    k = 0;
    m = this.ca.size();

    if (paramInt > 0)
      k = m - paramInt;
    else if (paramInt < 0) {
      m = -paramInt;
    }

    for (; k < m; k++) {
      if ((k >= 0) && (k < this.ca.size()))
      {
        int n = k + j;
        axU localaxU2 = (axU)this.ca.get(k);
        localaxU2.setContentProperty(this.cn + "#" + n, this.co);

        this.huZ.a(localaxU2, this.cm, n);
      }
    }
    if (i == 0) {
      this.cb = null;
    }

    bb();
  }

  public cD getListLayoutMode()
  {
    return this.huS;
  }

  public void setListLayoutMode(cD paramcD) {
    if (this.huS == paramcD) {
      return;
    }

    this.huS = paramcD;
    Object localObject = null;
    switch (dPX.mkb[this.huS.ordinal()]) {
    case 1:
      localObject = new zE(this);
      break;
    case 2:
      localObject = new bIr(this);
      break;
    case 3:
      localObject = new dex(this);
    }

    ((amp)localObject).aJ();
    a((crh)localObject);
  }

  public int getIsoColumnCount() {
    return this.huT;
  }

  public void setIsoColumnCount(int paramInt) {
    this.huT = paramInt;
  }

  public boolean getIsoPositiveFactor() {
    return this.huU;
  }

  public void setIsoPositiveFactor(boolean paramBoolean) {
    this.huU = paramBoolean;
  }

  public void setListFilter(bKe parambKe) {
    this.huF = parambKe;
  }

  public bKe getListFilter() {
    return this.huF;
  }

  public void setSelectionTogglable(boolean paramBoolean)
  {
    this.cg = paramBoolean;
  }

  public boolean getSelectionTogglable() {
    return this.cg;
  }

  public boolean isUsePositionTween()
  {
    return this.mff;
  }

  public void setSelectionable(boolean paramBoolean) {
    this.cf = paramBoolean;
  }

  public boolean getSelectionable() {
    return this.cf;
  }

  public void setHorizontal(boolean paramBoolean) {
    this.bY = paramBoolean;
    this.fcM.setHorizontal(paramBoolean);
    setOffset(this.huJ);
    this.huX = true;
    setNeedsToPreProcess();
  }

  public boolean getHorizontal() {
    return this.bY;
  }

  public void setCellSize(Or paramOr) {
    this.cQn = paramOr;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public String getTag() {
    return "List";
  }

  public boolean getAdaptCellSizeToContentSize()
  {
    return this.huI;
  }

  public void setAdaptCellSizeToContentSize(boolean paramBoolean)
  {
    this.huI = paramBoolean;
  }

  public void setNeedsScissor(boolean paramBoolean) {
    super.setNeedsScissor(paramBoolean);
  }

  public dOf getScrollbarBehaviour()
  {
    return this.fcY;
  }

  public void setScrollBar(boolean paramBoolean) {
    if (paramBoolean)
      this.fcY = dOf.mfJ;
    else
      this.fcY = dOf.mfK;
  }

  public boolean isScrollBarDisplayed()
  {
    switch (dPX.fGA[this.fcY.ordinal()]) {
    case 1:
      return true;
    case 2:
      return false;
    }
    return this.fcN;
  }

  public void setScrollBarBehaviour(dOf paramdOf)
  {
    this.fcY = paramdOf;
  }

  public bNa getSelectedColor() {
    if (this.fcX == null)
      return null;
    return this.fcX.getColor();
  }

  public void setSelectedColor(bNa parambNa) {
    if (parambNa != null) {
      if (this.fcX == null) {
        this.fcX = new cKm();
        this.fcX.aJ();
        setNeedsToResetMeshes();
      }

      this.fcX.setColor(parambNa);
    } else {
      if (this.fcX != null) {
        this.fcX.bc();
      }
      this.fcX = null;
      setNeedsToResetMeshes();
    }
  }

  public bNa getMouseOverColor() {
    if (this.fcV == null)
      return null;
    return this.fcV.getColor();
  }

  public void setMouseOverColor(bNa parambNa) {
    if (parambNa != null) {
      if (this.fcV == null) {
        this.fcV = new cKm();
        this.fcV.aJ();
        setNeedsToResetMeshes();
      }

      this.fcV.setColor(parambNa);
    } else {
      if (this.fcV != null) {
        this.fcV.bc();
      }
      this.fcV = null;
      setNeedsToResetMeshes();
    }
  }

  public int getMinDisplayedCells() {
    return this.huK;
  }

  public void setMinDisplayedCells(int paramInt) {
    this.huK = paramInt;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public boolean isAutoIdealSize() {
    return this.huN;
  }

  public void setAutoIdealSize(boolean paramBoolean) {
    this.huN = paramBoolean;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public void setAutoIdealSize(boolean paramBoolean, int paramInt1, int paramInt2) {
    this.huN = paramBoolean;
    this.huO = paramInt1;
    this.huP = paramInt2;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public void setAutoIdealSize(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.huN = paramBoolean;
    this.huO = paramInt1;
    this.huP = paramInt2;
    this.huQ = paramInt3;
    this.huR = paramInt4;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public int getIdealSizeMaxColumns()
  {
    return this.huP;
  }

  public void setIdealSizeMaxColumns(int paramInt)
  {
    this.huP = paramInt;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public int getIdealSizeMaxRows()
  {
    return this.huO;
  }

  public void setIdealSizeMaxRows(int paramInt)
  {
    this.huO = paramInt;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public int getIdealSizeMinColumns()
  {
    return this.huR;
  }

  public void setIdealSizeMinColumns(int paramInt)
  {
    this.huR = paramInt;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public int getIdealSizeMinRows()
  {
    return this.huQ;
  }

  public void setIdealSizeMinRows(int paramInt)
  {
    this.huQ = paramInt;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public void setShowOneMore(boolean paramBoolean) {
    if (paramBoolean)
      this.huM = 1;
    else {
      this.huM = 0;
    }
    this.huX = true;
    setNeedsToPreProcess();
  }

  public aQA getScrollMode() {
    return this.huZ;
  }

  public void setScrollMode(aQA paramaQA) {
    this.huZ = paramaQA;
  }

  public aFG getAlign()
  {
    return this.hqK;
  }

  public void setAlign(aFG paramaFG)
  {
    if (this.bY) {
      if ((paramaFG.equals(aFG.ech)) || (paramaFG.equals(aFG.eck)) || (paramaFG.equals(aFG.ecn)))
      {
        this.hqK = paramaFG;
      }
    }
    else if ((paramaFG.equals(aFG.ecj)) || (paramaFG.equals(aFG.eck)) || (paramaFG.equals(aFG.ecl)))
    {
      this.hqK = paramaFG;
    }
  }

  public boolean isOppositeScrollBarPosition()
  {
    return this.huL;
  }

  public void setOppositeScrollBarPosition(boolean paramBoolean) {
    this.huL = paramBoolean;
  }

  public Or getWishedMinSize()
  {
    return getPrefSize();
  }

  public void setWishedMinSize(Or paramOr)
  {
    setPrefSize(paramOr);
  }

  public Or getIdealSize()
  {
    return getIdealSize(-1, -1);
  }

  public Or getIdealSize(int paramInt1, int paramInt2)
  {
    Or localOr = getContentIdealSize(paramInt1, paramInt2, -1, -1);
    int i = localOr.width;
    int j = localOr.height;

    i += this.czl.getLeftInset() + this.czl.getRightInset();
    j += this.czl.getTopInset() + this.czl.getBottomInset();

    return new Or(i, j);
  }

  public Or getContentIdealSize(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = 10; int j = 10;
    int k = this.cm == null ? 0 : this.cm.size();

    int m = paramInt4 == -1 ? -2147483648 : paramInt4;
    int n = paramInt2 == -1 ? 2147483647 : paramInt2;
    int i1 = paramInt3 == -1 ? -2147483648 : paramInt3;
    int i2 = paramInt1 == -1 ? 2147483647 : paramInt1;

    int i3 = 0; int i4 = 0;
    if ((this.cQn.aaz() == -1.0F) || (this.cQn.aay() == -1.0F))
    {
      int i5;
      if (this.cQn.aay() != -1.0F) {
        i5 = (int)(1.0F / this.cQn.aay() * 100.0F);
        i4 = Math.max(m, Math.min(n, i5));
        i3 = Math.max(i1, Math.min(i2, getPotentialRowCount(i4)));
      }
      else if (this.cQn.aaz() != -1.0F) {
        i5 = (int)(1.0F / this.cQn.aaz() * 100.0F);
        i3 = Math.max(i1, Math.min(i2, i5));
        i4 = Math.max(m, Math.min(n, getPotentialColumnCount(i3)));
      }
      else
      {
        i5 = (paramInt2 >= 0) || (paramInt4 >= 0) ? 1 : 0;
        int i6 = (paramInt1 >= 0) || (paramInt3 >= 0) ? 1 : 0;

        if ((i5 != 0) && (i6 == 0)) {
          i4 = Math.min(Math.max(paramInt2, paramInt4), k);
          i3 = getPotentialRowCount(i4);
        } else if ((i5 == 0) && (i6 != 0)) {
          i3 = Math.min(Math.max(paramInt1, paramInt3), k);
          i4 = getPotentialColumnCount(i3);
        } else if ((i5 != 0) && (i6 != 0)) {
          if (this.bY) {
            i3 = Math.max(i1, Math.min(paramInt1, getPotentialRowCount(Math.max(1, m))));
            i4 = Math.max(m, Math.min(paramInt2, getPotentialColumnCount(i3)));
          } else {
            i4 = Math.max(m, Math.min(paramInt2, getPotentialColumnCount(Math.max(1, i1))));
            i3 = Math.max(i1, Math.min(paramInt1, getPotentialRowCount(i4)));
          }
        }
        else if (this.bY) {
          i3 = 1;
          i4 = k;
        } else {
          i4 = 1;
          i3 = k;
        }

      }

      j = this.cQn.height * i3;
      i = this.cQn.width * i4;
    }

    if ((i4 * i3 < k) && (this.fcY != dOf.mfK)) {
      Or localOr = this.fcM.getPrefSize();
      if (this.bY)
        j += localOr.height;
      else {
        i += localOr.width;
      }
    }

    return new Or(i, j);
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof cVL;
  }

  public cVL getAppearance()
  {
    return (cVL)this.czl;
  }

  public dRR getScrollBar() {
    return this.fcM;
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if (((this.bY) && ("horizontalScrollBar".equalsIgnoreCase(paramString))) || ((!this.bY) && ("verticalScrollBar".equalsIgnoreCase(paramString))) || (paramBoolean))
    {
      return this.fcM;
    }
    return null;
  }

  public void setSelected(cZd paramcZd) {
    setSelectedOffset(this.cm.indexOf(paramcZd));
  }

  public int getSelectedOffset() {
    return this.cd;
  }

  public void setSelectedOffset(int paramInt) {
    if (paramInt == this.cd) {
      return;
    }

    ArrayList localArrayList = getItems();

    int i = this.cd;
    this.cd = paramInt;
    axU localaxU = this.cb;
    this.cb = getRenderableByOffset(paramInt);

    if ((this.cm != null) && (i != -1)) {
      g(new arS(this, localaxU, localArrayList.get(i), false));
    }
    if ((this.cm != null) && (this.cd != -1)) {
      g(new arS(this, this.cb, localArrayList.get(this.cd), true));
    }

    bb();
  }

  public void setSelectedValue(Object paramObject)
  {
    ArrayList localArrayList = getItems();

    if (localArrayList == null) {
      return;
    }

    int i = -1;

    for (int j = 0; j < localArrayList.size(); j++) {
      Object localObject = localArrayList.get(j);
      if ((localObject != null) && ((localObject == paramObject) || (localObject.equals(paramObject)))) {
        i = j;
        break;
      }

    }

    setSelectedOffset(i);
  }

  public Object getSelectedValue() {
    return getSelectedValue(getItems());
  }

  public Object getSelectedValue(ArrayList paramArrayList)
  {
    if ((this.cd < 0) || (paramArrayList == null) || (this.cd >= paramArrayList.size())) {
      return null;
    }
    return paramArrayList.get(this.cd);
  }

  public axU getSelected() {
    return this.cb;
  }

  public int getSelectedOffsetByValue(Object paramObject) {
    int i = 0;
    while ((i < getItems().size()) && 
      (getItems().get(i) != paramObject)) {
      i++;
    }

    if (i == getItems().size()) {
      return -1;
    }
    return i;
  }

  public axU getRenderableByOffset(int paramInt)
  {
    int i;
    if (this.bY)
      i = paramInt - (int)(Math.floor(this.huJ) * Math.ceil(this.huH));
    else {
      i = paramInt - (int)(Math.floor(this.huJ) * Math.ceil(this.huG));
    }
    if ((i < 0) || (i >= this.ca.size())) {
      return null;
    }
    return (axU)this.ca.get(i);
  }

  public int getOffsetByRenderable(axU paramaxU)
  {
    if ((paramaxU == null) || (this.cm == null))
      return -1;
    int i;
    if (this.bY) {
      i = (int)(Math.floor(this.huJ) * Math.ceil(this.huH)) + this.ca.indexOf(paramaxU);
    }
    else {
      i = (int)(Math.floor(this.huJ) * Math.ceil(this.huG)) + this.ca.indexOf(paramaxU);
    }

    if (i >= this.cm.size()) {
      i = -1;
    }

    return i;
  }

  public dOc getWidget(String paramString, int paramInt) {
    if ((paramInt >= 0) && (paramInt < this.ca.size())) {
      return (dOc)this.ca.get(paramInt);
    }

    return null;
  }

  private void bb()
  {
    if ((this.cb != null) && (this.fcX != null)) {
      this.fcX.a(this.cb.getPosition(), this.cb.getSize(), this.czl.getTotalInsets());
    }

    setNeedsToResetMeshes();
  }

  private void a(axU paramaxU) {
    if (paramaxU == this.cb) {
      return;
    }

    if (paramaxU != null)
      setSelectedOffset(getOffsetByRenderable(paramaxU));
    else
      this.cd = -1;
  }

  private float du(int paramInt1, int paramInt2)
  {
    float f;
    if (this.bY) {
      if (!this.hqK.equals(aFG.eck)) {
        f = (float)Math.floor(paramInt1 / paramInt2);
      }
      else if ((this.cm != null) && (this.cm.size() > 0)) {
        int i = (int)Math.floor(paramInt1 / paramInt2);
        f = Math.min(this.cm.size(), i);
      } else {
        f = 0.0F;
      }
    }
    else {
      f = paramInt1 / paramInt2;
    }
    return f;
  }

  private float dv(int paramInt1, int paramInt2)
  {
    float f;
    if (this.bY) {
      f = paramInt1 / paramInt2;
    }
    else if (!this.hqK.equals(aFG.eck)) {
      f = (int)Math.floor(paramInt1 / paramInt2);
    }
    else if ((this.cm != null) && (this.cm.size() > 0)) {
      int i = (int)Math.floor(paramInt1 / paramInt2);
      f = Math.min(this.cm.size(), i);
    } else {
      f = 0.0F;
    }

    return f;
  }

  private void Hp() {
    if (this.fcN)
    {
      float f;
      if (this.bY) {
        f = getPotentialColumnCount(this.huH);
        if ((this.huH + this.huM > 0.0F) && (f - this.huG + this.huM > 0.0F))
        {
          this.fcM.setEnabled(true);
          this.fcM.setButtonJump(1.0F / (f - this.huG + this.huM));

          this.fcM.setSliderSize(this.huG / (f + this.huM));
        }
        else
        {
          this.fcM.setButtonJump(0.0F);
          this.fcM.setEnabled(false);
        }
      } else {
        f = getPotentialRowCount(this.huG);
        if ((this.huG + this.huM > 0.0F) && (f - this.huH + this.huM > 0.0F))
        {
          this.fcM.setEnabled(true);
          this.fcM.setButtonJump(1.0F / (f - this.huH + this.huM));

          this.fcM.setSliderSize(this.huH / (f + this.huM));
        }
        else
        {
          this.fcM.setButtonJump(0.0F);
          this.fcM.setEnabled(false);
        }
      }
    }
  }

  public void bTa()
  {
    this.cm = this.huW;
    this.huW = null;

    cfL();

    this.cl = true;
    this.huX = true;
    setNeedsToPreProcess();
  }

  public bJM getListLayout() {
    return (bJM)this.mmt;
  }

  public boolean isHorizontal()
  {
    return this.bY;
  }

  public ArrayList getItems()
  {
    if (this.huW != null) {
      return this.huW;
    }
    return this.cm;
  }

  public void setContentProperty(String paramString, cpa paramcpa)
  {
    this.cn = paramString;
    this.co = paramcpa;
  }

  public void setContent(Object[] paramArrayOfObject) {
    if (this.fnS) {
      return;
    }
    int i = this.cd;
    Object localObject = getSelectedValue();

    this.huW = new ArrayList();

    if (paramArrayOfObject != null) {
      for (int j = 0; j < paramArrayOfObject.length; j++) {
        if ((this.huF == null) || (this.huF.accept(paramArrayOfObject[j])))
        {
          this.huW.add(paramArrayOfObject[j]);
        }
      }
    }

    this.cd = getSelectedOffsetByValue(localObject);
    if ((this.cd == -1) && (i != -1)) {
      g(new arS(this, null, localObject, false));
      g(new arS(this, null, null, true));
    }

    setOffset(0.0F);

    this.fcQ = null;

    setNeedsToPreProcess();
    setNeedsToResetMeshes();
  }

  public void setContent(Iterable paramIterable) {
    if (this.fnS) {
      return;
    }
    int i = this.cd;
    Object localObject1 = getSelectedValue();

    this.huW = new ArrayList();

    if (paramIterable != null) {
      Iterator localIterator = paramIterable.iterator();
      while ((localIterator != null) && (localIterator.hasNext())) {
        Object localObject2 = localIterator.next();
        if ((this.huF == null) || (this.huF.accept(localObject2)))
        {
          this.huW.add(localObject2);
        }
      }
    }

    this.cd = getSelectedOffsetByValue(localObject1);
    if ((this.cd == -1) && (i != -1)) {
      g(new arS(this, null, localObject1, false));
      g(new arS(this, null, null, true));
    }

    setOffset(0.0F);

    this.fcQ = null;

    setNeedsToPreProcess();
    setNeedsToResetMeshes();
  }

  private void cfL()
  {
    this.huJ = this.huZ.a(this.huJ, this.cm, this.bY, this.huG, this.huH, this.huM);
  }

  public int getTableIndex(axU paramaxU) {
    return this.ca.indexOf(paramaxU) + (int)Math.floor(this.huJ);
  }

  public int getItemIndex(Object paramObject) {
    int i = 0;
    Iterator localIterator;
    if (this.cm != null) {
      for (localIterator = this.cm.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
        if (localObject == paramObject) {
          return i;
        }
        i++;
      }
    }
    return -1;
  }

  public ArrayList getRenderables()
  {
    return this.ca;
  }

  public Or getCellSize()
  {
    return this.cQn;
  }

  private void g(Object paramObject, int paramInt) {
    this.cm.add(paramInt, paramObject);
  }

  public void b(Object paramObject)
  {
    if (this.cm == null) {
      this.cm = new ArrayList();
    }
    g(paramObject, this.cm.size());
    this.cd = (this.cm.size() - 1);
    this.huX = true;
    setNeedsToPreProcess();
    bb();
  }

  public boolean b(int paramInt, Object paramObject)
  {
    if (this.cm == null) {
      this.cm = new ArrayList();
    }
    if ((paramInt >= 0) || (paramInt <= this.cm.size())) {
      g(paramObject, paramInt);
      this.cd = paramInt;
      this.huX = true;
      setNeedsToPreProcess();
      bb();
      return true;
    }
    return false;
  }

  public void a(Object paramObject1, Object paramObject2)
  {
    int i = 0;
    if (this.cm != null) {
      for (int j = 0; j < this.cm.size(); j++) {
        if (paramObject1 == this.cm.get(j)) {
          g(paramObject2, j);
          this.cd = j;
          i = 1;
          break;
        }
      }
      if (i != 0) {
        this.huX = true;
        setNeedsToPreProcess();
        bb();
      }
    }
  }

  public void c(ArrayList paramArrayList1, ArrayList paramArrayList2) {
    ArrayList localArrayList1 = new ArrayList(this.ca.size());
    ArrayList localArrayList2 = new ArrayList(this.cm.size());
    localArrayList1.addAll(this.ca);
    localArrayList2.addAll(this.cm);

    int i = 400;
    Object localObject;
    int k;
    int m;
    axU localaxU;
    int n;
    int i1;
    Point localPoint;
    for (int j = 0; j < paramArrayList1.size(); j++) {
      localObject = ((Cs)paramArrayList1.get(j)).getFirst();
      k = ((Integer)((Cs)paramArrayList1.get(j)).Lp()).intValue();
      m = this.cm.indexOf(localObject);

      localaxU = getRenderableByOffset(m);
      if (localaxU != null) {
        n = this.ca.indexOf(localaxU);
        i1 = n - m + k;

        if (n != i1) {
          localaxU.J(wG.class);
          localaxU.J(dHx.class);
          localaxU.a(new wG(null, new Rectangle(0, this.cQn.height, this.cQn.width, 0), localaxU, false, 0, 400, ddp.kWG));

          localPoint = (Point)this.huV.get(i1);
          localaxU.a(new dHx(localaxU.getX(), localaxU.getY(), localPoint.x, localPoint.y, localaxU, 400, 0, ddp.kWF));
          localaxU.a(new wG(new Rectangle(0, this.cQn.height, this.cQn.width, 0), new Rectangle(0, 0, this.cQn.width, this.cQn.height), localaxU, true, 400, 400, ddp.kWG));
        }

        if ((i1 >= 0) && (i1 < this.ca.size())) {
          localArrayList1.set(i1, localaxU);
        }
      }

      localArrayList2.set(k, localObject);
    }

    for (j = 0; j < paramArrayList2.size(); j++) {
      localObject = ((Cs)paramArrayList2.get(j)).getFirst();
      k = ((Integer)((Cs)paramArrayList2.get(j)).Lp()).intValue();
      m = this.cm.indexOf(localObject);

      if (m != k) {
        localaxU = getRenderableByOffset(m);
        if (localaxU != null) {
          n = this.ca.indexOf(localaxU);
          i1 = n - m + k;
          localaxU.J(dHx.class);
          localPoint = (Point)this.huV.get(i1);
          localaxU.a(new dHx(localaxU.getX(), localaxU.getY(), localPoint.x, localPoint.y, localaxU, 400, 400, ddp.kWG));
          if ((i1 >= 0) && (i1 < this.ca.size())) {
            localArrayList1.set(i1, localaxU);
          }
        }

        localArrayList2.set(k, localObject);
      }
    }

    this.ca = localArrayList1;
    this.cm = localArrayList2;
  }

  public void h(Object paramObject, int paramInt) {
    c(paramObject, paramInt, false);
  }

  public void c(Object paramObject, int paramInt, boolean paramBoolean) {
    int i = this.cm.indexOf(paramObject);

    if ((paramInt < 0) || (paramInt >= this.cm.size()) || (i == paramInt)) {
      return;
    }
    if (paramBoolean) {
      axU localaxU1 = getRenderableByOffset(i);

      if (localaxU1 != null) {
        int j = this.ca.indexOf(localaxU1);
        Point localPoint = localaxU1.meF;

        int k = Math.max(0, j - i + paramInt);
        int m;
        axU localaxU2;
        if (i < paramInt)
          for (m = j + 1; m <= k; m++) {
            localaxU2 = (axU)this.ca.get(m);
            localaxU2.a(new dHx(localaxU2.getX(), localaxU2.getY(), localPoint.x, localPoint.y, localaxU2, 700, 300, ddp.kWG));
            localPoint = localaxU2.meF;
          }
        else {
          for (m = j - 1; m >= k; m--) {
            localaxU2 = (axU)this.ca.get(m);
            localaxU2.a(new dHx(localaxU2.getX(), localaxU2.getY(), localPoint.x, localPoint.y, localaxU2, 700, 300, ddp.kWG));
            localPoint = localaxU2.meF;
          }
        }
        localaxU1.a(new wG(null, new Rectangle(0, this.cQn.height, this.cQn.width, 0), localaxU1, false, 0, 700, ddp.kWG));

        localaxU1.a(new dHx(localaxU1.getX(), localaxU1.getY(), localPoint.x, localPoint.y, localaxU1, 700, 0, ddp.kWF));
        localaxU1.a(new wG(new Rectangle(0, this.cQn.height, this.cQn.width, 0), new Rectangle(0, 0, this.cQn.width, this.cQn.height), localaxU1, true, 700, 700, ddp.kWG));

        this.ca.add(k, this.ca.remove(j));
      }
    }

    this.cm.add(paramInt, this.cm.remove(i));
  }

  public void o(Object paramObject1, Object paramObject2) {
    int i = this.cm.indexOf(paramObject1);
    int j = this.cm.indexOf(paramObject2);

    if ((i == -1) || (j == -1)) {
      return;
    }

    int k = (int)(Math.floor(this.huJ) * (this.bY ? this.huH : this.huG));
    int m = (int)(Math.floor(this.huJ + (this.bY ? this.huG : this.huH)) * (this.bY ? this.huH : this.huG));

    int n = (i >= k) && (i <= m) ? 1 : 0;
    int i1 = (j >= k) && (j <= m) ? 1 : 0;
    axU localaxU1;
    if ((n != 0) && (i1 != 0)) {
      localaxU1 = getRenderableByOffset(i);
      axU localaxU2 = getRenderableByOffset(j);

      localaxU1.a(new wG(null, new Rectangle(localaxU1.getX(), this.cQn.height + localaxU1.getY(), this.cQn.width, 0), localaxU1, false, 0, 250, ddp.kWF));

      localaxU1.a(new dHx(localaxU1.getX(), localaxU1.getY(), localaxU2.getX(), localaxU2.getY(), localaxU1, 250, 0, ddp.kWF));
      localaxU1.a(new wG(new Rectangle(localaxU1.getX(), this.cQn.height + localaxU1.getY(), this.cQn.width, 0), new Rectangle(localaxU1.getX(), localaxU1.getY(), this.cQn.width, this.cQn.height), localaxU1, true, 250, 250, ddp.kWF));

      localaxU2.a(new wG(null, new Rectangle(localaxU2.getX(), this.cQn.height + localaxU2.getY(), this.cQn.width, 0), localaxU2, false, 0, 250, ddp.kWF));

      localaxU2.a(new dHx(localaxU2.getX(), localaxU2.getY(), localaxU1.getX(), localaxU1.getY(), localaxU2, 250, 0, ddp.kWF));
      localaxU2.a(new wG(new Rectangle(localaxU2.getX(), this.cQn.height + localaxU2.getY(), this.cQn.width, 0), new Rectangle(localaxU2.getX(), localaxU2.getY(), this.cQn.width, this.cQn.height), localaxU2, true, 250, 250, ddp.kWF));
    }
    else if ((n != 0) || (i1 != 0))
    {
      if (n == 0) {
        localaxU1 = getRenderableByOffset(j);
        cAo.cxf().a(new dPZ(this, localaxU1, paramObject1), 250L, 0, 1);

        localaxU1.a(new wG(null, new Rectangle(localaxU1.getX(), this.cQn.height + localaxU1.getY(), this.cQn.width, 0), localaxU1, false, 0, 250, ddp.kWG));

        localaxU1.a(new wG(new Rectangle(localaxU1.getX(), this.cQn.height + localaxU1.getY(), this.cQn.width, 0), new Rectangle(localaxU1.getX(), localaxU1.getY(), this.cQn.width, this.cQn.height), localaxU1, true, 250, 250, ddp.kWG));
      }
      else
      {
        localaxU1 = getRenderableByOffset(i);
        cAo.cxf().a(new dPY(this, localaxU1, paramObject2), 250L, 0, 1);

        localaxU1.a(new wG(null, new Rectangle(localaxU1.getX(), this.cQn.height + localaxU1.getY(), this.cQn.width, 0), localaxU1, false, 0, 250, ddp.kWG));

        localaxU1.a(new wG(new Rectangle(localaxU1.getX(), this.cQn.height + localaxU1.getY(), this.cQn.width, 0), new Rectangle(localaxU1.getX(), localaxU1.getY(), this.cQn.width, this.cQn.height), localaxU1, true, 250, 250, ddp.kWG));
      }

    }

    this.cm.set(i, paramObject2);
    this.cm.set(j, paramObject1);
  }

  public void a(Object paramObject) {
  }

  public boolean b(Object paramObject1, Object paramObject2) {
    boolean bool = false;

    if (this.cm != null) {
      for (int i = 0; i < this.cm.size(); i++) {
        if (paramObject1 == this.cm.get(i)) {
          this.cm.set(i, paramObject2);
          bool = true;
          break;
        }
      }
      if (bool) {
        this.cd = i;
        this.huX = true;
        setNeedsToPreProcess();
        bb();
      }
      return bool;
    }
    return false;
  }

  public Object getValue(int paramInt)
  {
    if (this.cm != null) {
      return this.cm.get(paramInt);
    }
    return null;
  }

  public int size()
  {
    ArrayList localArrayList = getItems();
    if (localArrayList != null) {
      return localArrayList.size();
    }
    return 0;
  }

  protected void a(cSx paramcSx, boolean paramBoolean)
  {
    if ((!paramcSx.cIn()) && (
      (paramcSx.mp() == CH.bGd) || (paramcSx.mp() == CH.bGe)))
    {
      paramcSx.iH(true);
      MQ.WK().click();
    }
  }

  public void bc()
  {
    super.bc();
    this.cb = null;
    this.ca.clear();
    this.huV.clear();
    this.cm = null;
    this.huW = null;
    this.huF = null;

    this.cn = null;
    this.co = null;

    this.bZ = null;

    if (this.fcV != null) {
      this.fcV.bc();
      this.fcV = null;
    }

    if (this.fcX != null) {
      this.fcX.bc();
      this.fcX = null;
    }

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

    zE localzE = new zE(this);
    localzE.aJ();
    a(localzE);

    this.fcM = new dRR();
    this.fcM.aJ();
    this.fcM.setCanBeCloned(false);
    this.fcM.setHorizontal(this.bY);
    a(this.fcM);

    this.huZ = aQA.eNl;

    if (!this.bY) {
      this.fcM.getSlider().setValue(1.0F);

      this.hqK = aFG.ech;
    } else {
      this.hqK = aFG.ecj;
    }

    this.cd = -1;

    this.ca = new ArrayList();
    this.huV = new ArrayList();

    this.ce = true;

    this.hva = true;

    this.mfi = true;
  }

  public void invalidate() {
    super.invalidate();
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.huW != null) {
      bTa();
      this.huY = true;
      setNeedsToPostProcess();
    }

    if (this.huX) {
      super.cfM();
      invalidate();

      this.huX = false;
    }

    return bool;
  }

  public void cfM()
  {
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);
    if (this.huY) {
      ba();
      this.huY = false;
    }

    if (this.cl) {
      for (int i = this.ck.size() - 1; i >= 0; i--)
        ((dRY)this.ck.get(i)).ci();
      this.cl = false;
    }

    return bool;
  }

  public void c(bdj parambdj)
  {
    ccG localccG = (ccG)parambdj;
    super.c(parambdj);
    localccG.setAlign(this.hqK);
    localccG.setAutoIdealSize(this.huN, this.huO, this.huP, this.huQ, this.huR);
    localccG.setCellSize((Or)this.cQn.clone());
    localccG.setHorizontal(this.bY);
    localccG.setMinDisplayedCells(this.huK);
    localccG.setMouseOverColor(getMouseOverColor());
    localccG.setSelectedColor(getSelectedColor());
    localccG.setOffset(this.huJ);
    localccG.setOppositeScrollBarPosition(this.huL);
    localccG.setShowOneMore(this.huM > 0);
    localccG.setScrollBarBehaviour(this.fcY);
    localccG.setSelectionTogglable(this.cg);
    localccG.setSelectionable(this.cf);
    localccG.setEnableDND(this.ce);
    localccG.setListFilter(this.huF);
    localccG.setScrollMode(this.huZ);
    localccG.setListLayoutMode(this.huS);
    localccG.setIsoColumnCount(this.huT);
    localccG.setIsoPositiveFactor(true);
    localccG.setScrollOnMouseWheel(this.hva);
    localccG.meW = true;
    localccG.setNeedsToPreProcess();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else if (paramInt == hvc)
      setAdaptCellSizeToContentSize(bUD.getBoolean(paramString));
    else if (paramInt == hvd)
      setAutoIdealSize(bUD.getBoolean(paramString));
    else if (paramInt == cQr)
      setCellSize(paramaKN.gK(paramString));
    else if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == hve)
      setIdealSizeMaxColumns(bUD.aR(paramString));
    else if (paramInt == hvf)
      setIdealSizeMaxRows(bUD.aR(paramString));
    else if (paramInt == hvg)
      setIdealSizeMinColumns(bUD.aR(paramString));
    else if (paramInt == hvh)
      setIdealSizeMinRows(bUD.aR(paramString));
    else if (paramInt == hvj)
      setListOffset(bUD.aR(paramString));
    else if (paramInt == hvk)
      setMinDisplayedCells(bUD.aR(paramString));
    else if (paramInt == hvm)
      setSelectedColor(paramaKN.gJ(paramString));
    else if (paramInt == hvl)
      setMouseOverColor(paramaKN.gJ(paramString));
    else if (paramInt == hvn)
      setOffset(bUD.aR(paramString));
    else if (paramInt == hvo)
      setOppositeScrollBarPosition(bUD.getBoolean(paramString));
    else if (paramInt == hvp)
      setScrollBar(bUD.getBoolean(paramString));
    else if (paramInt == fdi)
      setScrollBarBehaviour(dOf.rD(paramString));
    else if (paramInt == cw)
      setSelectionable(bUD.getBoolean(paramString));
    else if (paramInt == cx)
      setSelectionTogglable(bUD.getBoolean(paramString));
    else if (paramInt == hvq)
      setShowOneMore(bUD.getBoolean(paramString));
    else if (paramInt == hvr)
      setPrefSize(paramaKN.gK(paramString));
    else if (paramInt == dNt)
      setEnableDND(bUD.getBoolean(paramString));
    else if (paramInt == hvu)
      setIsoPositiveFactor(bUD.getBoolean(paramString));
    else if (paramInt == hvt)
      setIsoColumnCount(bUD.aR(paramString));
    else if (paramInt == hvv)
      setScrollMode((aQA)paramaKN.b(aQA.class, paramString));
    else if (paramInt == hvw)
      setScrollOnMouseWheel(bUD.getBoolean(paramString));
    else if (paramInt == hvs)
      setListLayoutMode((cD)paramaKN.b(cD.class, paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == hvj)
      setListOffset(bUD.aR(paramObject));
    else if (paramInt == hvn)
      setOffset(bUD.aR(paramObject));
    else if (paramInt == hvp)
      setScrollBar(bUD.getBoolean(paramObject));
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
    else if (paramInt == hve)
      setIdealSizeMaxColumns(bUD.aR(paramObject));
    else if (paramInt == hvf)
      setIdealSizeMaxRows(bUD.aR(paramObject));
    else if (paramInt == hvg)
      setIdealSizeMinColumns(bUD.aR(paramObject));
    else if (paramInt == hvh)
      setIdealSizeMinRows(bUD.aR(paramObject));
    else if (paramInt == hvi)
      setListFilter((bKe)paramObject);
    else if (paramInt == dNt)
      setEnableDND(bUD.getBoolean(paramObject));
    else if (paramInt == hvu)
      setIsoPositiveFactor(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}