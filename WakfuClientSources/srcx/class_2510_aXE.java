import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class aXE extends dRq
  implements Qe, bYf, cWq, vn
{
  public static final String TAG = "table";
  public static final String fcB = "button";
  public static final String fcC = "directSortButton";
  public static final String fcD = "indirectSortButton";
  public static final String fcE = "oddCell";
  public static final String fcF = "evenCell";
  public static final String fcG = "scrollBar";
  public static final String fcH = "mouseOver";
  public static final String fcI = "mouseOverCell";
  public static final String fcJ = "selected";
  private ArrayList fcK;
  private ArrayList fcL;
  private ArrayList cm;
  private ArrayList ca;
  private dRR fcM;
  private boolean fcN;
  private boolean fcO;
  private int TR;
  private int cd;
  private int fcP;
  private axU cb;
  private axU fcQ;
  private String cn;
  private cpa co;
  private boolean fcR;
  private boolean fcS;
  private int[] fcT;
  private ArrayList fcU;
  private cKm fcV;
  private cKm fcW;
  private cKm fcX;
  private dOf fcY;
  private int fcZ;
  private int fda;
  private int fdb;
  private boolean ce;
  private cNL fdc;
  private bNa fdd;
  private bNa fde;
  private boolean cf;
  private boolean cg;
  public static final int cs = "content".hashCode();
  public static final int fdf = "cellHeight".hashCode();
  public static final int dNt = "enableDND".hashCode();
  public static final int fdg = "minRows".hashCode();
  public static final int fdh = "maxRows".hashCode();
  public static final int fdi = "scrollBarBehaviour".hashCode();
  public static final int cw = "selectionable".hashCode();

  public aXE()
  {
    this.fcN = false;

    this.cd = -1;
    this.fcP = -1;

    this.cn = null;
    this.co = null;

    this.fcT = null;
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);

    if ((paramaNL instanceof bSJ)) {
      bSJ localbSJ = (bSJ)paramaNL;
      localbSJ.setVisibilityListener(this);
      a(localbSJ);
    }
  }

  private void a(bSJ parambSJ) {
    this.fcL.add(parambSJ);

    biy localbiy = new biy();
    localbiy.aJ();
    a(localbiy);

    localbiy.setElementMap(this.cUY);
    localbiy.setChildrenAdded(true);
    localbiy.setCanBeCloned(false);

    String str1 = getStyle();
    StringBuilder localStringBuilder = new StringBuilder("table");
    if (str1 != null) {
      localStringBuilder.append(str1);
    }
    localStringBuilder.append("$").append("button");
    String str2 = localStringBuilder.toString();
    localbiy.setStyle(str2, true);
    localbiy.setText(parambSJ.getName());
    localbiy.setEnabled((this.bur) && (parambSJ.getSortable()));
    localbiy.setNetEnabled(this.meS);
    localbiy.a(CH.bGw, new bnB(this, localbiy, str2, parambSJ, str1), false);

    this.fcK.add(localbiy);

    setTableDirty();
  }

  protected void rd()
  {
    for (int i = this.fcU.size() - 1; i >= 0; i--) {
      this.bqm.d(((cKm)this.fcU.get(i)).UM());
    }

    if ((this.fcX != null) && (this.cb != null)) {
      this.bqm.d(this.fcX.UM());
    }

    if ((this.fcV != null) && (this.fcQ != null)) {
      this.bqm.d(this.fcV.UM());
    }

    if ((this.fcW != null) && (this.fcQ != null)) {
      this.bqm.d(this.fcW.UM());
    }

    super.rd();
  }

  public String getTag()
  {
    return "table";
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("scrollBar")) {
      return this.fcM;
    }
    return super.getWidgetByThemeElementName(paramString, paramBoolean);
  }

  public void setColor(bNa parambNa, String paramString) {
    if ((paramString == null) || (paramString.equals("mouseOver"))) {
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
    } else if (paramString.equals("mouseOverCell")) {
      if (parambNa != null) {
        if (this.fcW == null) {
          this.fcW = new cKm();
          this.fcW.aJ();
          setNeedsToResetMeshes();
        }

        this.fcW.setColor(parambNa);
      } else {
        if (this.fcW != null) {
          this.fcW.bc();
        }
        this.fcW = null;
        setNeedsToResetMeshes();
      }
    } else if (paramString.equals("selected")) {
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
    } else if (paramString.equals("evenCell"))
      this.fdd = parambNa;
    else if (paramString.equals("oddCell"))
      this.fde = parambNa;
  }

  public void setContentProperty(String paramString, cpa paramcpa)
  {
    this.cn = paramString;
    this.co = paramcpa;
  }

  public void setSelectionable(boolean paramBoolean) {
    this.cf = paramBoolean;
  }

  public dOf getScrollBarBehaviour() {
    return this.fcY;
  }

  public void setScrollBarBehaviour(dOf paramdOf) {
    this.fcY = paramdOf;
  }

  public int getCellHeight() {
    return this.fcZ;
  }

  public void setCellHeight(int paramInt) {
    this.fcZ = paramInt;
  }

  public int getMinRows() {
    return this.fda;
  }

  public void setMinRows(int paramInt) {
    this.fda = paramInt;
  }

  public int getMaxRows() {
    return this.fdb;
  }

  public void setMaxRows(int paramInt) {
    this.fdb = paramInt;
  }

  public boolean isEnableDND() {
    return this.ce;
  }

  public void setEnableDND(boolean paramBoolean) {
    this.ce = paramBoolean;
  }

  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    int i = 0; for (int j = this.ca.size(); i < j; i++) {
      ((axU)this.ca.get(i)).setEnabled(paramBoolean);
    }
    i = 0; for (j = this.fcK.size(); i < j; i++)
      ((biy)this.fcK.get(i)).setEnabled((paramBoolean) && (((bSJ)this.fcL.get(i)).getSortable()));
  }

  public void setNetEnabled(boolean paramBoolean)
  {
    super.setNetEnabled(paramBoolean);
    int i = 0; for (int j = this.ca.size(); i < j; i++) {
      ((axU)this.ca.get(i)).setNetEnabled(paramBoolean);
    }
    i = 0; for (j = this.fcK.size(); i < j; i++)
      ((biy)this.fcK.get(i)).setNetEnabled(paramBoolean);
  }

  public void setContent(Iterable paramIterable)
  {
    if ((!bB) && (this.cm == null)) throw new AssertionError();

    Object localObject1 = null;
    if (this.cd != -1) {
      localObject1 = this.cm.get(this.fcT[this.cd]);
    }

    this.cm.clear();

    if (paramIterable != null) {
      Iterator localIterator = paramIterable.iterator();
      while (localIterator.hasNext()) {
        this.cm.add(localIterator.next());
      }
    }

    this.fcT = null;

    int i = getSelectedOffsetByValue(localObject1);
    if ((this.TR == 0) || (getRenderableByOffset(this.TR) == null)) {
      setOffset(0);
    }
    if (i != -1)
    {
      setSelectedOffset(i, false);
    } else {
      this.cd = bCO.J(this.cd, -1, this.cm.size() - 1);
      this.cb = getRenderableByOffset(this.cd);

      if (this.fcT == null) {
        bmR();
      }

      Object localObject2 = null;
      if (this.cd != -1) {
        localObject2 = this.cm.get(this.fcT[this.cd]);
      }
      if (localObject1 != localObject2) {
        diZ localdiZ = new diZ(this);
        localdiZ.bk(localObject1);
        localdiZ.setValue(localObject2);
        g(localdiZ);
      }

      bb();
    }

    this.fcQ = null;

    setTableDirty();
    setValuesDirty();
  }

  public void setContent(Object[] paramArrayOfObject) {
    if ((!bB) && (this.cm == null)) throw new AssertionError();

    Object localObject1 = null;
    if (this.cd != -1) {
      localObject1 = this.cm.get(this.fcT[this.cd]);
    }

    this.cm.clear();

    if (paramArrayOfObject != null) {
      for (Object localObject3 : paramArrayOfObject) {
        this.cm.add((dBv)localObject3);
      }
    }

    this.fcT = null;
    setOffset(0);

    int i = getSelectedOffsetByValue(localObject1);

    if (i != -1)
    {
      setSelectedOffset(i, false);
    } else {
      this.cd = bCO.J(this.cd, -1, this.cm.size() - 1);
      this.cb = getRenderableByOffset(this.cd);

      if (this.fcT == null) {
        bmR();
      }

      Object localObject2 = null;
      if (this.cd != -1) {
        localObject2 = this.cm.get(this.fcT[this.cd]);
      }
      if (localObject1 != localObject2) {
        diZ localdiZ = new diZ(this);
        localdiZ.bk(localObject1);
        localdiZ.setValue(localObject2);
        g(localdiZ);
      }

      bb();
    }

    this.fcQ = null;

    setTableDirty();
    setValuesDirty();
  }

  private axU getRenderableByPosition(int paramInt1, int paramInt2) {
    int i = paramInt1 * this.fcL.size() + paramInt2;
    if ((i < 0) || (i >= this.ca.size())) {
      return null;
    }

    return (axU)this.ca.get(i);
  }

  private void setTableDirty() {
    this.fcS = true;
    setNeedsToPreProcess();
  }

  private void setValuesDirty() {
    this.fcR = true;
    setNeedsToPostProcess();
  }

  public Object getValue(int paramInt) {
    if ((paramInt < 0) || (paramInt >= this.cm.size())) {
      return null;
    }
    return this.cm.get(paramInt);
  }

  public axU getSelected() {
    return null;
  }

  public int getTableIndex(axU paramaxU) {
    return this.ca.indexOf(paramaxU);
  }

  public int getItemIndex(Object paramObject)
  {
    return this.cm.indexOf(paramObject);
  }

  public dOc getWidget(String paramString, int paramInt) {
    if ((paramInt >= 0) && (paramInt < this.ca.size())) {
      return (dOc)this.ca.get(paramInt);
    }

    return null;
  }

  public ArrayList getRenderables() {
    return this.ca;
  }

  public void setTableModel(cNL paramcNL) {
    this.fdc = paramcNL;
  }

  public cNL getTableModel() {
    return this.fdc;
  }

  public int getOffset() {
    return this.TR;
  }

  public void setOffset(int paramInt) {
    if (this.TR == paramInt) {
      return;
    }

    float f = oo(paramInt);
    this.fcM.getSlider().setValue(f);
  }

  private void setListOffset(int paramInt) {
    if (this.TR == paramInt) {
      return;
    }

    this.TR = paramInt;
    setValuesDirty();
  }

  public int getSelectedOffsetByValue(Object paramObject) {
    if (this.cm == null) {
      return -1;
    }

    int i = this.cm.indexOf(paramObject);
    if (i == -1) {
      return -1;
    }

    if (this.fcT == null) {
      bmR();
    }

    for (int j = 0; j < this.fcT.length; j++) {
      if (this.fcT[j] == i) {
        return j;
      }
    }

    return -1;
  }

  public int getOffsetByRenderable(axU paramaxU)
  {
    if ((paramaxU == null) || (this.cm == null)) {
      return -1;
    }

    int i = this.TR + this.ca.indexOf(paramaxU) / this.fcL.size();

    if (i >= this.cm.size()) {
      i = -1;
    }

    return i;
  }

  public axU getRenderableByOffset(int paramInt) {
    if ((paramInt == -1) || (this.cm == null)) {
      return null;
    }

    int i = (paramInt - this.TR) * this.fcL.size();
    if ((i < 0) || (i >= this.ca.size())) {
      return null;
    }

    return (axU)this.ca.get(i);
  }

  public void setSelectedOffset(int paramInt, boolean paramBoolean) {
    if ((paramInt == this.cd) && (!paramBoolean)) {
      return;
    }

    int i = this.cd;
    this.cd = paramInt;

    this.cb = getRenderableByOffset(paramInt);

    if (this.fcT == null) {
      bmR();
    }

    Object localObject1 = null; Object localObject2 = null;
    if (i != -1) {
      localObject1 = this.cm.get(this.fcT[i]);
    }
    if (this.cd != -1) {
      localObject2 = this.cm.get(this.fcT[this.cd]);
    }
    if (localObject1 != localObject2) {
      diZ localdiZ = new diZ(this);
      localdiZ.bk(localObject1);
      localdiZ.setValue(localObject2);
      g(localdiZ);
    }

    bb();
  }

  private void bb()
  {
    if ((this.cb != null) && (this.fcX != null)) {
      this.fcX.f(0, this.cb.getY(), this.czl.getContentWidth() - this.fcM.getWidth(), this.cb.getHeight(), this.czl.getTopInset(), this.czl.getBottomInset(), this.czl.getLeftInset(), this.czl.getRightInset());
    }

    setNeedsToResetMeshes();
  }

  private void a(axU paramaxU) {
    if (paramaxU == this.cb) {
      return;
    }

    if (paramaxU != null)
      setSelectedOffset(getOffsetByRenderable(paramaxU), false);
    else
      this.cd = -1;
  }

  private float oo(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = 0;
    }
    int i = this.cm.size() - this.ca.size() / this.fcL.size();
    if (i == 0) {
      return 1.0F;
    }
    if ((i > 0) && (paramInt > i + 1)) {
      paramInt = i + 1;
    }
    return 1.0F - paramInt / i;
  }

  private int bb(float paramFloat)
  {
    float f2 = this.cm.size() - this.ca.size() / this.fcL.size();
    float f1 = f2 - Math.round(f2 * paramFloat);

    if ((f2 < 0.0F) || (f1 < 0.0F))
      f1 = 0.0F;
    else if (f1 > f2 + 1.0F) {
      f1 = f2 + 1.0F;
    }
    return Math.round(f1);
  }

  public void ba() {
    if ((this.fcO) || (this.ca == null)) {
      return;
    }

    bmR();

    this.cb = null;
    int i = this.TR;

    for (int j = 0; j < this.ca.size(); j += this.fcL.size()) {
      k = j / this.fcL.size() + i;
      axU localaxU1 = (axU)this.ca.get(j);

      if ((j >= 0) && (j < this.ca.size()))
      {
        if ((this.cm != null) && (k >= 0) && (k < this.cm.size()))
        {
          if (k == this.cd) {
            this.cb = localaxU1;
            break;
          }
        }
      }
    }
    j = this.ca.size() / this.fcL.size();
    for (int k = 0; k < j; k++) {
      int m = k + i;
      int n = m >= this.fcT.length ? m : this.fcT[m];
      ((cKm)this.fcU.get(k)).setColor(m % 2 == 0 ? this.fdd : this.fde);
      for (int i1 = this.fcL.size() - 1; i1 >= 0; i1--) {
        bSJ localbSJ = (bSJ)this.fcL.get(i1);
        axU localaxU2 = getRenderableByPosition(k, i1);
        String str = localbSJ.getField();

        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(this.cn);
        localStringBuilder.append("#").append(n);
        if (str != null) {
          localStringBuilder.append("/").append(localbSJ.getField());
        }

        localaxU2.setContentProperty(localStringBuilder.toString(), this.co);

        if ((this.cm != null) && (n >= 0) && (n < this.cm.size())) {
          dBv localdBv = (dBv)this.cm.get(n);
          if (localdBv != null) {
            if (str != null)
              localaxU2.setContent(localdBv.getFieldValue(localbSJ.getField()));
            else
              localaxU2.setContent(localdBv);
          }
          else
            localaxU2.setContent(null);
        }
        else {
          localaxU2.setContent(null);
        }
      }
    }

    bb();
  }

  private void bmR() {
    if ((this.fcT == null) && (this.fdc != null)) {
      this.fcT = this.fdc.ac(this.cm);
    }

    if (this.fcT == null)
      this.fcT = cNL.yE(this.cm.size());
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.fcS) {
      super.cfM();
      invalidate();
      this.fcS = false;
    }

    return bool;
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);

    if (this.fcR) {
      ba();
      this.fcR = false;
    }

    return bool;
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    aXE localaXE = (aXE)parambdj;

    localaXE.setCellHeight(this.fcZ);
    localaXE.setMinRows(this.fda);
    localaXE.setMaxRows(this.fdb);
    localaXE.setEnableDND(this.ce);
    localaXE.setTableModel(this.fdc);
    localaXE.setScrollBarBehaviour(this.fcY);
    localaXE.setSelectionable(this.cf);
  }

  public void ajj()
  {
    this.fcM.ajj();
    super.ajj();

    a(CH.bGC, new bnz(this), false);

    a(CH.bGy, new bny(this), false);
  }

  public void bc()
  {
    super.bc();

    this.fdd = null;
    this.fde = null;

    if (this.fcV != null) {
      this.fcV.bc();
      this.fcV = null;
    }
    if (this.fcW != null) {
      this.fcW.bc();
      this.fcW = null;
    }
    if (this.fcX != null) {
      this.fcX.bc();
      this.fcX = null;
    }
    if (this.fcU != null) {
      for (int i = this.fcU.size() - 1; i >= 0; i--) {
        ((cKm)this.fcU.get(i)).bc();
      }
      this.fcU = null;
    }

    this.cb = null;
    this.fcQ = null;

    this.fcK = null;
    this.fcM = null;
    this.fcL = null;
    this.cm = null;
    this.fdc = null;
    this.ca = null;
  }

  public void aJ()
  {
    super.aJ();

    aIe localaIe = new aIe(this);
    localaIe.aJ();
    a(localaIe);

    this.fcM = new dRR();
    this.fcM.aJ();
    this.fcM.setHorizontal(false);
    this.fcM.setValue(1.0F);
    this.fcM.setCanBeCloned(false);
    a(this.fcM);

    this.fda = -1;
    this.fdb = -1;
    this.fcZ = 30;
    this.ce = true;

    this.TR = 0;
    this.fcO = false;
    this.fcS = false;
    this.meQ = false;

    this.cf = true;
    this.cg = false;

    this.cd = -1;
    this.fcP = -1;

    this.ca = new ArrayList();
    this.fcK = new ArrayList();
    this.fcL = new ArrayList();
    this.cm = new ArrayList();
    this.fcU = new ArrayList();
    this.fcY = dOf.mfI;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fdf)
      setCellHeight(bUD.aR(paramString));
    else if (paramInt == dNt)
      setEnableDND(bUD.getBoolean(paramString));
    else if (paramInt == fdg)
      setMinRows(bUD.aR(paramString));
    else if (paramInt == fdh)
      setMaxRows(bUD.aR(paramString));
    else if (paramInt == cw)
      setSelectionable(bUD.getBoolean(paramString));
    else if (paramInt == fdi)
      setScrollBarBehaviour(dOf.rD(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cs) {
      if ((paramObject == null) || (paramObject.getClass().isArray()))
        setContent((Object[])paramObject);
      else if ((paramObject instanceof Iterable))
      {
        setContent((Iterable)paramObject);
      }
      else return false;
    }
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }

  public void a(Object paramObject)
  {
  }

  public void b(Object paramObject)
  {
  }

  public boolean b(int paramInt, Object paramObject) {
    return false;
  }

  public void a(Object paramObject1, Object paramObject2) {
  }

  public boolean b(Object paramObject1, Object paramObject2) {
    return false;
  }

  public int size() {
    return this.cm.size();
  }

  public void a(bSJ parambSJ, boolean paramBoolean) {
    if (paramBoolean) {
      a(parambSJ);
    } else {
      int i = this.fcL.indexOf(parambSJ);
      this.fcL.remove(parambSJ);
      this.fcK.remove(i);
      setTableDirty();
      setNeedsToPreProcess();
    }
  }
}