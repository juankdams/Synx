import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Insets;
import java.util.ArrayList;

public class bKO extends dRq
  implements Qe, vn
{
  public static final String TAG = "tree";
  public static final String fcB = "button";
  public static final String gOg = "cell";
  public static final String gOh = "openedCell";
  public static final String gOi = "leafCell";
  public static final String gOj = "selectedCell";
  public static final String fcE = "oddCell";
  public static final String fcF = "evenCell";
  public static final String fcG = "scrollBar";
  private azz bZ;
  private aIo gOk;
  private ArrayList gOl;
  private ArrayList ca;
  private dRR fcM;
  private boolean fcN;
  private boolean fcO;
  private int TR;
  private String cn;
  private cpa co;
  private boolean fcR;
  private boolean gOm;
  private boolean gOn;
  private ArrayList fcU;
  private boolean gOo;
  private boolean gOp;
  private aIo gOq;
  private ArrayList gOr;
  private boolean gOs;
  private boolean gOt;
  private boolean gOu;
  private int fcZ;
  private int fda;
  private int fdb;
  private boolean ce;
  private bNa fdd;
  private bNa fde;
  public static final int cs = "content".hashCode();
  public static final int fdf = "cellHeight".hashCode();
  public static final int dNt = "enableDND".hashCode();
  public static final int fdg = "minRows".hashCode();
  public static final int fdh = "maxRows".hashCode();
  public static final int gOv = "openOnlyOne".hashCode();
  public static final int gOw = "selectOnlyOne".hashCode();
  public static final int gOx = "displayRoot".hashCode();
  public static final int gOy = "noClosingOnClick".hashCode();
  public static final int gOz = "noUnselectingOnClick".hashCode();

  public bKO()
  {
    this.fcN = false;

    this.cn = null;
    this.co = null;

    this.gOo = true;
    this.gOp = true;

    this.gOq = null;

    this.gOs = false;
    this.gOt = false;
    this.gOu = false;
  }

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof eR)) {
      this.bZ.a((eR)paramaNL);
    }

    super.a(paramaNL);
  }

  protected void rd() {
    for (int i = this.fcU.size() - 1; i >= 0; i--) {
      this.bqm.d(((cKm)this.fcU.get(i)).UM());
    }
    super.rd();
  }

  public String getTag()
  {
    return "tree";
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("scrollBar")) {
      return this.fcM;
    }
    return super.getWidgetByThemeElementName(paramString, paramBoolean);
  }

  public void setColor(bNa parambNa, String paramString) {
    if ((paramString == null) || (paramString.equals("evenCell")))
      this.fdd = parambNa;
    else if (paramString.equals("oddCell"))
      this.fde = parambNa;
  }

  public void setContentProperty(String paramString, cpa paramcpa)
  {
    this.cn = paramString;
    this.co = paramcpa;
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
    int i = 0; for (int j = this.ca.size(); i < j; i++)
      ((axU)this.ca.get(i)).setEnabled(paramBoolean);
  }

  public void setNetEnabled(boolean paramBoolean)
  {
    super.setNetEnabled(paramBoolean);
    int i = 0; for (int j = this.ca.size(); i < j; i++)
      ((axU)this.ca.get(i)).setNetEnabled(paramBoolean);
  }

  public boolean getSelectOnlyOne()
  {
    return this.gOo;
  }

  public void setSelectOnlyOne(boolean paramBoolean) {
    this.gOo = paramBoolean;
  }

  public aIo getSelected() {
    return this.gOq;
  }

  public boolean getOpenOnlyOne() {
    return this.gOp;
  }

  public void setOpenOnlyOne(boolean paramBoolean) {
    this.gOp = paramBoolean;
  }

  public aIo getTopOpened() {
    if (!this.gOr.isEmpty()) {
      return (aIo)this.gOr.get(this.gOr.size() - 1);
    }

    return null;
  }

  public void setContent(aIo paramaIo) {
    this.gOk = paramaIo;

    if (!this.gOs) {
      this.gOk.cq(true);
    }

    setContentDirty();
  }

  private void setContentDirty() {
    this.gOn = true;
    setNeedsToPreProcess();
  }

  private void setTreeDirty() {
    this.gOm = true;
    setNeedsToPreProcess();
  }

  private void setValuesDirty() {
    this.fcR = true;
    setNeedsToPostProcess();
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

  public void setDisplayRoot(boolean paramBoolean) {
    this.gOs = paramBoolean;
  }

  public void setNoClosingOnClick(boolean paramBoolean) {
    this.gOt = paramBoolean;
  }

  public void setNoUnselectingOnClick(boolean paramBoolean) {
    this.gOu = paramBoolean;
  }

  private void bTa()
  {
    aIo localaIo = getTopOpened();

    this.gOl.clear();
    ajp localajp = new ajp(this.gOk);
    int i = !this.gOs ? 1 : 0;
    while (localajp.hasNext()) {
      if (i != 0) {
        localajp.awh();
        i = 0;
      } else {
        this.gOl.add(localajp.awh());
      }
    }

    int j = this.TR;
    int k = this.gOl.indexOf(localaIo);
    if (this.gOl.size() <= this.ca.size())
      j = 0;
    else if ((k == -1) || (k < this.TR) || (k >= this.TR + this.ca.size()))
    {
      if ((k != -1) && (k + this.ca.size() <= this.gOl.size())) {
        j = k;
      }
    }
    j = bCO.J(j, 0, this.gOl.size() - this.ca.size());

    if (j != this.TR) {
      this.TR = j;
      setOffset(j);
    }
  }

  private int bTb() {
    return a(this.gOk) - (this.gOs ? 0 : 1);
  }

  private int a(aIo paramaIo) {
    if (paramaIo == null) {
      return 0;
    }

    int i = 1;

    if ((paramaIo.hasChildren()) && (paramaIo.axS())) {
      ArrayList localArrayList = paramaIo.getChildren();
      int j = 0; for (int k = localArrayList.size(); j < k; j++) {
        i += a((aIo)localArrayList.get(j));
      }
    }

    return i;
  }

  private float oo(int paramInt) {
    if (paramInt < 0) {
      paramInt = 0;
    }

    int i = bTb();

    int j = i - this.ca.size();
    if (paramInt > j + 1) {
      paramInt = j + 1;
    }
    return 1.0F - paramInt / j;
  }

  private int bb(float paramFloat)
  {
    int i = bTb();
    float f2 = i - this.ca.size();

    float f1 = f2 - Math.round(f2 * paramFloat);

    if (f1 < 0.0F)
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

    int i = this.TR;
    int j = 0;
    int k = 0;
    Object localObject1;
    Object localObject2;
    for (int m = this.gOl.size(); k < m; k++) {
      localObject1 = (aIo)this.gOl.get(k);
      if (i != 0) {
        i--;
      }
      else
      {
        if (j == this.ca.size())
        {
          break;
        }
        localObject2 = (axU)this.ca.get(j);
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append(this.cn);
        localStringBuilder1.append("#").append(j + this.TR);

        ((axU)localObject2).setContentProperty(localStringBuilder1.toString(), this.co);
        ((axU)localObject2).setContent(((aIo)localObject1).getValue());

        String str = getStyle();
        StringBuilder localStringBuilder2 = new StringBuilder("tree");
        if (str != null) {
          localStringBuilder2.append(str);
        }
        localStringBuilder2.append("$");
        if (((aIo)localObject1).axS())
          localStringBuilder2.append("openedCell");
        else if (((aIo)localObject1).isSelected())
          localStringBuilder2.append("selectedCell");
        else if (((aIo)localObject1).hasChildren())
          localStringBuilder2.append("cell");
        else {
          localStringBuilder2.append("leafCell");
        }

        ((axU)localObject2).getAppearance().setMargin(new Insets(0, (((aIo)localObject1).getDepth() - (this.gOs ? 0 : 1)) * 10 + 5, 0, 0));
        ((axU)localObject2).setStyle(localStringBuilder2.toString(), true);

        j++;
      }
    }
    k = j; for (m = this.ca.size(); k < m; k++) {
      localObject1 = (axU)this.ca.get(j);
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(this.cn);
      ((StringBuilder)localObject2).append("#").append(k + this.TR);

      ((axU)localObject1).setContentProperty(((StringBuilder)localObject2).toString(), this.co);
      ((axU)localObject1).setContent(null);
    }
  }

  public void ajj()
  {
    this.fcM.ajj();
    super.ajj();

    a(CH.bGC, new aki(this), false);

    a(CH.bGy, new akj(this), false);
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.gOn) {
      bTa();
      setValuesDirty();
      this.gOm = true;
      this.gOn = false;
    }

    if (this.gOm) {
      super.cfM();
      invalidate();
      this.gOm = false;
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
    bKO localbKO = (bKO)parambdj;

    localbKO.setCellHeight(this.fcZ);
    localbKO.setMinRows(this.fda);
    localbKO.setMaxRows(this.fdb);
    localbKO.setEnableDND(this.ce);
    localbKO.setSelectOnlyOne(this.gOo);
    localbKO.setOpenOnlyOne(this.gOp);

    for (int i = localbKO.mmr.size() - 1; i >= 0; i--) {
      dOc localdOc = (dOc)localbKO.mmr.get(i);
      if (localdOc != localbKO.fcM)
        localdOc.beH();
    }
  }

  public void bc()
  {
    super.bc();

    this.fdd = null;
    this.fde = null;

    this.fcM = null;
    this.gOk = null;
    this.gOl = null;
    this.fcU = null;
    this.ca = null;

    this.gOq = null;
    this.gOr = null;
  }

  public void aJ()
  {
    super.aJ();

    yy localyy = new yy(this);
    localyy.aJ();
    a(localyy);

    this.fcM = new dRR();
    this.fcM.aJ();
    this.fcM.setHorizontal(false);
    this.fcM.setValue(1.0F);
    a(this.fcM);

    this.fda = -1;
    this.fdb = -1;
    this.fcZ = 30;
    this.ce = true;

    this.TR = 0;
    this.fcO = false;
    this.gOm = false;

    this.bZ = new azz();
    this.ca = new ArrayList();
    this.fcU = new ArrayList();
    this.gOl = new ArrayList();
    this.gOr = new ArrayList();
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
    else if (paramInt == gOv)
      setOpenOnlyOne(bUD.getBoolean(paramString));
    else if (paramInt == gOw)
      setSelectOnlyOne(bUD.getBoolean(paramString));
    else if (paramInt == gOx)
      setDisplayRoot(bUD.getBoolean(paramString));
    else if (paramInt == gOy)
      setNoClosingOnClick(bUD.getBoolean(paramString));
    else if (paramInt == gOz)
      setNoUnselectingOnClick(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == cs)
      setContent((aIo)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}