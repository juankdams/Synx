import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import org.apache.log4j.Logger;

public abstract class dOc extends aNL
  implements bqp, dFD
{
  protected Jg czl;
  protected Jg meD;
  protected dRq meE;
  protected EntityGroup bqm;
  protected Point meF;
  private float meG;
  private float meH;
  protected Point meI = new Point(-1, -1);
  public Or haN;
  protected Or haL;
  protected boolean meJ = false;
  protected Or aCQ;
  protected boolean meK = false;
  protected Or meL;
  protected boolean meM = false;

  protected boolean meN = false;

  protected boolean meO = true;

  protected boolean meP = false;

  protected boolean meQ = false;

  protected boolean aYZ = false;

  protected boolean meR = false;

  protected boolean bur = true;

  protected boolean meS = true;

  protected String meT = null;

  protected boolean meU = false;

  protected String[] meV = new String[5];
  protected boolean meW = false;

  protected HashMap meX = null;
  protected String meY;
  protected String meZ;
  protected dgQ mfa;
  protected bXx mfb;
  protected anG bxb;
  protected doN mfc;
  protected doN mfd;
  protected duv cqZ = duv.lyl;

  protected boolean mfe = false;
  protected boolean mff = false;

  protected boolean mfg = true;

  protected Rectangle mfh = null;

  protected boolean mfi = false;
  private boolean gQb = true;

  protected boolean mfj = false;
  protected boolean mfk = false;

  protected boolean mfl = false;

  public static final int ijB = "size".hashCode();
  public static final int mfm = "prefSize".hashCode();
  public static final int mfn = "maxSize".hashCode();
  public static final int mfo = "expandable".hashCode();
  public static final int mfp = "shrinkable".hashCode();
  public static final int mfq = "greedy".hashCode();
  public static final int mfr = "focusable".hashCode();
  public static final int mfs = "focused".hashCode();
  public static final int czn = "enabled".hashCode();
  public static final int mft = "netEnabledId".hashCode();
  public static final int gea = "visible".hashCode();
  public static final int mfu = "usedInLayout".hashCode();
  public static final int mfv = "usePositionTween".hashCode();
  public static final int mfw = "useResizeTween".hashCode();
  public static final int dTX = "x".hashCode();
  public static final int dTY = "y".hashCode();
  public static final int mfx = "style".hashCode();
  public static final int mfy = "themeElementName".hashCode();
  public static final int mfz = "themeElementParentType".hashCode();
  public static final int mfA = "nonBlocking".hashCode();
  public static final int mfB = "cursorType".hashCode();
  public static final int mfC = "needsScissor".hashCode();
  public static final int mfD = "userDefinedSize".hashCode();
  public static final int mfE = "userDefinedPosition".hashCode();
  public static final int mfF = "stickWithinContainer".hashCode();

  public static final int aBi = "onClick".hashCode();
  public static final int aBj = "onDoubleClick".hashCode();
  public static final int aBk = "onFocusChange".hashCode();
  public static final int aBl = "onItemClick".hashCode();
  public static final int aBm = "onItemDoubleClick".hashCode();
  public static final int aBn = "onItemOut".hashCode();
  public static final int aBo = "onItemOver".hashCode();
  public static final int aBp = "onKeyPress".hashCode();
  public static final int aBq = "onKeyRelease".hashCode();
  public static final int aBr = "onKeyType".hashCode();
  public static final int aBs = "onListSelectionChange".hashCode();
  public static final int aBt = "onMouseDrag".hashCode();
  public static final int aBu = "onMouseDragIn".hashCode();
  public static final int aBv = "onMouseDragOut".hashCode();
  public static final int aBy = "onMouseMove".hashCode();
  public static final int aBw = "onMouseEnter".hashCode();
  public static final int aBx = "onMouseExit".hashCode();
  public static final int aBz = "onMousePress".hashCode();
  public static final int aBA = "onMouseRelease".hashCode();
  public static final int aBB = "onMouseWheel".hashCode();
  public static final int aBC = "onSelectionChange".hashCode();
  public static final int aBD = "onSliderMove".hashCode();
  public static final int mfG = "onValueChange".hashCode();
  public static final int aBE = "onDrag".hashCode();
  public static final int aBF = "onDrop".hashCode();
  public static final int aBG = "onDragOut".hashCode();
  public static final int aBH = "onDropOut".hashCode();
  public static final int aBI = "onDragOver".hashCode();
  public static final int mfH = "onStick".hashCode();
  public static final int aBJ = "onPopupDisplay".hashCode();
  public static final int aBK = "onPopupHide".hashCode();

  public void b(aNL paramaNL)
  {
    if ((paramaNL instanceof dwY)) {
      ((dwY)paramaNL).setClient(this);
      bsP.getInstance().getLayeredContainer().b((dOc)paramaNL, 30000);
    } else {
      super.b(paramaNL);
    }
  }

  public void a(aNL paramaNL)
  {
    boolean bool = true;
    if (((paramaNL instanceof bmv)) || ((paramaNL instanceof cuR))) {
      this.czl.a(paramaNL);
      return;
    }

    if ((paramaNL instanceof dgQ)) {
      bool &= setLayoutData((dgQ)paramaNL);
    }

    if ((paramaNL instanceof Jg)) {
      bool &= setAppearance((Jg)paramaNL);
    }

    if ((paramaNL instanceof anG)) {
      setPopup((anG)paramaNL);
    }

    if (bool)
      super.a(paramaNL);
  }

  public void d(String paramString, dOc paramdOc)
  {
    if ((paramString == null) || (paramdOc == null)) {
      return;
    }

    if (this.meX == null) {
      this.meX = new HashMap();
    }

    this.meX.put(paramString.toUpperCase(), paramdOc);

    this.meW = true;
    setNeedsToPreProcess();
  }

  protected void ST() {
    if ((!bB) && (this.czl == null)) throw new AssertionError();
    this.czl.ST();
    rd();
    this.mfg = false;
  }

  protected void rd()
  {
  }

  public void setPopup(anG paramanG)
  {
    this.bxb = paramanG;
  }

  public anG getPopup()
  {
    return this.bxb;
  }

  public EntityGroup getEntity() {
    return this.bqm;
  }

  public void setContainerParent(dRq paramdRq)
  {
    this.meE = paramdRq;
  }

  public dRq getContainer()
  {
    return this.meE;
  }

  public Or getMaxSize()
  {
    return this.meL;
  }

  public void setMaxSize(Or paramOr)
  {
    this.meL = paramOr;
    this.meM = (paramOr != null);
  }

  public Or getContentMinSize()
  {
    if (this.haL != null) {
      return this.haL;
    }
    return new Or(0, 0);
  }

  public Or getMinSize()
  {
    Or localOr = getContentMinSize();
    return new Or(localOr.width + this.czl.getLeftInset() + this.czl.getRightInset(), localOr.height + this.czl.getTopInset() + this.czl.getBottomInset());
  }

  public void dqg()
  {
  }

  public void setMinSize(Or paramOr)
  {
    this.haL = paramOr;
    this.meJ = (paramOr != null);
  }

  public Or getGreedySize() {
    Or localOr = getContentGreedySize();
    return new Or(localOr.width + this.czl.getLeftInset() + this.czl.getRightInset(), localOr.height + this.czl.getTopInset() + this.czl.getBottomInset());
  }

  public Or getContentGreedySize()
  {
    if (this.meE == null) {
      return new Or(this.czl.getContentWidth(), this.czl.getContentHeight());
    }

    return new Or(this.czl.getContentWidth(), this.czl.getContentHeight());
  }

  public Or getPrefSize()
  {
    Or localOr = getContentPrefSize();
    if (this.meP) {
      if (this.meL != null) {
        localOr.height = Math.min(localOr.height, this.meL.height);
        localOr.width = Math.min(localOr.width, this.meL.width);
      } else {
        localOr.height = 0;
        localOr.width = 0;
      }
    }
    return new Or(localOr.width + this.czl.getLeftInset() + this.czl.getRightInset(), localOr.height + this.czl.getTopInset() + this.czl.getBottomInset());
  }

  public Or getContentPrefSize()
  {
    if (this.aCQ == null) {
      return getContentMinSize();
    }

    Or localOr = getContentMinSize();

    if (localOr == null) {
      return this.aCQ;
    }
    int i = Math.max(this.aCQ.width, localOr.width);
    int j = Math.max(this.aCQ.height, localOr.height);
    return new Or(i, j);
  }

  public Or getSetPrefSize()
  {
    if (this.meK) {
      return this.aCQ;
    }
    return null;
  }

  public void setPrefSize(Or paramOr)
  {
    this.aCQ = paramOr;
    this.meK = (paramOr != null);
  }

  public Or getSize()
  {
    return this.haN;
  }

  public void setSize(Or paramOr)
  {
    setSize(paramOr.width, paramOr.height);
  }

  public void setSize(int paramInt1, int paramInt2)
  {
    setSize(paramInt1, paramInt2, false);
  }

  public void setSize(int paramInt1, int paramInt2, boolean paramBoolean) {
    if ((!this.mfe) || (paramBoolean))
    {
      int i = (this.haN.width != paramInt1 ? 1 : 0) | (this.haN.height != paramInt2 ? 1 : 0);
      if (i != 0) {
        this.haN.width = paramInt1;
        this.haN.height = paramInt2;
        invalidate();
        if (this.mfj) {
          cSx localcSx = cSx.cIo();
          localcSx.b(CH.bGJ);
          localcSx.q(this);
          g(localcSx);
        }

        if (this.mfl) {
          setPositionWithinParentBounds();
        }
        aHk();

        if ((this.etT) && (this.etW != null))
          ((bMw)this.etW).bTX();
      }
    }
    else
    {
      J(bOr.class);

      bOr localbOr = new bOr(getSize(), new Or(paramInt1, paramInt2), this, 0, 500, ddp.kWG);
      a(localbOr);
    }
  }

  public void setSizeToMinSize()
  {
    setSize(getMinSize());
  }

  public void setSizeToPrefSize()
  {
    setSize(getPrefSize());
  }

  public void setPositionWithinParentBounds() {
    if (this.meE == null) {
      return;
    }
    int i = bCO.J(getX(), 0, this.meE.getAppearance().getContentWidth() - getWidth());
    int j = bCO.J(getY(), 0, this.meE.getAppearance().getContentHeight() - getHeight());
    setPosition(i, j);
  }

  public int getWidth()
  {
    return this.haN.width;
  }

  public void setWidth(int paramInt) {
    setSize(paramInt, this.haN.height);
  }

  public void setHeight(int paramInt)
  {
    setSize(this.haN.width, paramInt);
  }

  public int getHeight()
  {
    return this.haN.height;
  }

  public void setEnableResizeEvents(boolean paramBoolean) {
    this.mfj = paramBoolean;
  }

  public void setEnablePositionEvents(boolean paramBoolean) {
    this.mfk = paramBoolean;
  }

  public boolean isNonBlocking()
  {
    return this.meQ;
  }

  public void setNonBlocking(boolean paramBoolean)
  {
    this.meQ = paramBoolean;
  }

  public int getX(dRq paramdRq)
  {
    if (this.meF != null) {
      if ((this.meE == null) || (this.meE == paramdRq)) {
        return this.meF.x + this.czl.getLeftInset();
      }
      return this.meF.x + this.meE.getX(paramdRq) + this.czl.getLeftInset();
    }

    return 0;
  }

  public int getY(dRq paramdRq)
  {
    if (this.meF != null) {
      if ((this.meE == null) || (this.meE == paramdRq)) {
        return this.meF.y + this.czl.getBottomInset();
      }
      return this.meF.y + this.meE.getY(paramdRq) + this.czl.getBottomInset();
    }

    return 0;
  }

  public int getScreenX()
  {
    if ((this.meI.x != -1) && (this.meI.y != -1)) {
      return this.meI.x;
    }
    if (this.meF != null) {
      if ((this.meE != null) && (this.meE.getAppearance() != null)) {
        return this.meF.x + this.meE.getScreenX() + this.meE.getAppearance().getLeftInset();
      }
      return this.meF.x;
    }

    return 0;
  }

  public int getScreenY()
  {
    if ((this.meI.x != -1) && (this.meI.y != -1)) {
      return this.meI.y;
    }
    if (this.meF != null) {
      if ((this.meE != null) && (this.meE.getAppearance() != null)) {
        return this.meF.y + this.meE.getScreenY() + this.meE.getAppearance().getBottomInset();
      }
      return this.meF.y;
    }

    return 0;
  }

  protected final Point getScreenPosition()
  {
    return this.meI;
  }

  public void setScreenPosition(int paramInt1, int paramInt2)
  {
    this.meI.setLocation(paramInt1, paramInt2);
  }

  public Point getPosition()
  {
    return this.meF;
  }

  public void setPosition(Point paramPoint)
  {
    setPosition(paramPoint.x, paramPoint.y, false);
  }

  public void setPosition(int paramInt1, int paramInt2)
  {
    setPosition(paramInt1, paramInt2, false);
  }

  public void setPosition(int paramInt1, int paramInt2, boolean paramBoolean) {
    setPosition(paramInt1, paramInt2, paramBoolean ? 0 : 300);
  }

  public void setPosition(int paramInt1, int paramInt2, int paramInt3) {
    setPosition(paramInt1, paramInt2, paramInt3, true, true);
  }

  public float getXPercInParent() {
    return this.meG;
  }

  public float getYPercInParent() {
    return this.meH;
  }

  public void setPosition(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramInt3 == 0) || (!this.mff)) {
      int i = 0;
      if (this.meF == null) {
        this.meF = new Point(paramInt1, paramInt2);
        i = 1;
      } else if ((this.meF.x != paramInt1) || (this.meF.y != paramInt2)) {
        this.meF.x = paramInt1;
        this.meF.y = paramInt2;
        i = 1;
      }

      if ((paramBoolean2) && (this.mfl) && (this.meE != null)) {
        this.meF.x = bCO.J(this.meF.x, 0, this.meE.getAppearance().getContentWidth() - getWidth());
        this.meF.y = bCO.J(this.meF.y, 0, this.meE.getAppearance().getContentHeight() - getHeight());
      }

      if (paramBoolean1) {
        aHk();
      }
      if (this.mfk) {
        cSx localcSx = cSx.cIo();
        localcSx.b(CH.bGK);
        localcSx.q(this);
        g(localcSx);
      }

      if ((i != 0) && (this.etT) && (this.etW != null)) {
        ((bMw)this.etW).bTW();
      }

      this.gQb = true;
      setNeedsToPostProcess();
    } else {
      dHx localdHx = new dHx(this.meF.x, this.meF.y, paramInt1, paramInt2, this, 0, paramInt3, ddp.kWG);

      a(localdHx);
    }
  }

  private void aHk() {
    if (this.meE != null) {
      this.meG = (this.meF.x / (this.meE.getWidth() - this.haN.width));
      this.meH = (this.meF.y / (this.meE.getHeight() - this.haN.height));
    }
  }

  public void setX(int paramInt)
  {
    setPosition(paramInt, this.meF.y, false);
  }

  public int getX()
  {
    return this.meF.x;
  }

  public int getDisplayX()
  {
    return getScreenX();
  }

  public void setY(int paramInt)
  {
    setPosition(this.meF.x, paramInt, false);
  }

  public int getY()
  {
    return this.meF.y;
  }

  public int getDisplayY()
  {
    return getScreenY();
  }

  public bsP getMasterRootContainer()
  {
    if (this.meE != null) {
      return this.meE.getMasterRootContainer();
    }
    return null;
  }

  public avN getComputedScissor()
  {
    if (this.mfh == null) {
      return null;
    }

    return avN.m(getScreenX() + this.mfh.x, getScreenY() + this.mfh.y, this.mfh.width, this.mfh.height);
  }

  public Rectangle getScissor()
  {
    return this.mfh;
  }

  public void setScissor(Rectangle paramRectangle)
  {
    this.mfh = paramRectangle;
  }

  public boolean isExpandable()
  {
    return this.meO;
  }

  public void setExpandable(boolean paramBoolean)
  {
    this.meO = paramBoolean;
  }

  public boolean isShrinkable()
  {
    return this.meP;
  }

  public void setShrinkable(boolean paramBoolean)
  {
    this.meP = paramBoolean;
  }

  public boolean getGreedy() {
    return this.meN;
  }

  public void setGreedy(boolean paramBoolean) {
    this.meN = paramBoolean;
  }

  public void setCursorType(duv paramduv)
  {
    this.cqZ = paramduv;
  }

  public duv getCursorType()
  {
    return this.cqZ;
  }

  public boolean getVisible()
  {
    return this.aYZ;
  }

  public boolean isParentVisible()
  {
    return this.meR;
  }

  protected void setParentVisible(boolean paramBoolean)
  {
    this.meR = paramBoolean;
  }

  public boolean getUsedInLayout()
  {
    return getVisible();
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean != this.aYZ) {
      this.aYZ = paramBoolean;
      if (this.meE != null) {
        this.meE.cfM();
        this.meE.setNeedsToResetMeshes();
      }

      setParentVisible((paramBoolean) && ((this.meE == null) || (this.meE.isParentVisible())));

      setNeedsToPostProcess();
    }
  }

  public boolean isVisible() {
    return this.aYZ;
  }

  public void setUsedInLayout(boolean paramBoolean)
  {
    setVisible(paramBoolean);
  }

  public boolean getUseResizeTween()
  {
    return this.mfe;
  }

  public void setUseResizeTween(boolean paramBoolean)
  {
    this.mfe = paramBoolean;
  }

  public boolean getUsePositionTween()
  {
    return this.mff;
  }

  public void setUsePositionTween(boolean paramBoolean)
  {
    this.mff = paramBoolean;
  }

  public boolean getEnabled()
  {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean)
  {
    this.bur = paramBoolean;
    ajk();
  }

  public boolean getNetEnabled() {
    return this.meS;
  }

  public void setNetEnabled(boolean paramBoolean) {
    this.meS = paramBoolean;
    ajk();
  }

  public String getNetEnabledId() {
    return this.meT;
  }

  public void setNetEnabledId(String paramString) {
    if (this.meT != null) {
      aig.dej.b(this.meT, this);
    }
    this.meT = paramString;

    if (this.meT != null)
      aig.dej.a(paramString, this);
  }

  public boolean isEnabledFull() {
    return (this.meS) && (this.bur);
  }

  private void ajk() {
    awf localawf = new awf(this, (this.bur) && (this.meS));
    g(localawf);
  }

  public void setStickWithinContainer(boolean paramBoolean) {
    this.mfl = paramBoolean;
  }

  public boolean isStickWithinContainer() {
    return this.mfl;
  }

  public boolean getFocusable()
  {
    return this.meU;
  }

  public void setFocusable(boolean paramBoolean)
  {
    if ((paramBoolean) && (!this.meU))
      zC.Ip().c(this);
    else if ((!paramBoolean) && (this.meU)) {
      zC.Ip().d(this);
    }
    this.meU = paramBoolean;
  }

  public void setFocused(boolean paramBoolean) {
    if ((zC.Ip().Iq() != this) && (paramBoolean))
      zC.Ip().e(this);
    else if (zC.Ip().Iq() == this)
      zC.Ip().It();
  }

  public dRq getRootFocusParent()
  {
    if (this.meE != null) {
      return this.meE.getRootFocusParent();
    }
    return null;
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    if (this.fnH) {
      return null;
    }

    if ((this.aYZ) && (!this.meQ) && (getAppearance().bQ(paramInt1, paramInt2)) && (!bsP.getInstance().isMovePointMode())) {
      return this;
    }
    return null;
  }

  public void setNeedsToResetMeshes() {
    this.mfg = true;
    setNeedsToPostProcess();
  }

  public boolean getNeedsToResetMeshes()
  {
    return this.mfg;
  }

  public Jg getAppearance()
  {
    return this.czl;
  }

  public boolean setAppearance(Jg paramJg)
  {
    boolean bool = false;

    if (isAppearanceCompatible(paramJg))
    {
      if ((this.czl != null) && (this.czl != paramJg)) {
        paramJg.setWidget(this);
        i(this.czl);
        this.czl = paramJg;
        bool = true;
      } else if (this.czl == null) {
        this.czl = paramJg;
        bool = true;
      }
    } else if (paramJg != null) {
      paramJg.beH();
    }

    return bool;
  }

  public abstract boolean isAppearanceCompatible(Jg paramJg);

  public void setDecoratorState(String paramString)
  {
    if ((this.czl != null) && (!this.czl.getCurrentState().equalsIgnoreCase(paramString))) {
      this.czl.SY();
      this.czl.setEnabled(paramString, true);
    }
  }

  public void rC(String paramString)
  {
    if (paramString == null) {
      return;
    }

    int i = 0;
    for (int j = 0; 
      j < this.meV.length; j++) {
      if (this.meV[j] == null) {
        this.meV[j] = paramString;
        i = 1;
        break;
      }
    }

    if (i == 0) {
      String[] arrayOfString = new String[this.meV.length + 5];
      this.meV = arrayOfString;
      System.arraycopy(this.meV, 0, arrayOfString, 0, this.meV.length);
      this.meV[j] = paramString;
    }

    this.meW = true;
    setNeedsToPreProcess();
  }

  public void setStyle(String paramString, boolean paramBoolean)
  {
    if ((this.meV == null) || (paramString == null)) {
      return;
    }

    if ((paramBoolean) || (!paramString.equals(this.meV[0]))) {
      this.meV[0] = paramString;
      if (this.etU) {
        if (this.czl != null) {
          this.czl.SW();
        }
        for (int i = 0; i < this.meV.length; i++) {
          if (this.meV[i] != null) {
            cBQ.cxL().bSM().b(this, this.meV[i]);
          }

        }

        if (this.meD != null) {
          this.meD.c(this.czl);
        }

        this.meW = false;
      }
    }
  }

  public void setStyle(String paramString)
  {
    try
    {
      setStyle(paramString, false);
    } catch (Exception localException) {
      K.error("Exception ", localException);
    }
  }

  public String getThemeElementName()
  {
    return this.meY;
  }

  public void setThemeElementName(String paramString)
  {
    this.meY = paramString;
  }

  public String getThemeElementParentType()
  {
    return this.meZ;
  }

  public void setThemeElementParentType(String paramString)
  {
    this.meZ = paramString;
  }

  public String getStyle()
  {
    return this.meV[0] == null ? "" : this.meV[0];
  }

  public String[] getStyles()
  {
    return this.meV;
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if (this.meX != null) {
      return (dOc)this.meX.get(paramString.toUpperCase());
    }
    return null;
  }

  public dOc getWidgetByThemeElementName(String paramString) {
    return getWidgetByThemeElementName(paramString, false);
  }

  public boolean setLayoutData(dgQ paramdgQ)
  {
    boolean bool = false;
    if ((this.mfa != null) && (this.mfa != paramdgQ)) {
      i(this.mfa);
      this.mfa = paramdgQ;
      bool = true;
    } else if (this.mfa == null) {
      this.mfa = paramdgQ;
      bool = true;
    }

    return bool;
  }

  public dgQ getLayoutData()
  {
    return this.mfa;
  }

  public bXx getDragAndDropParent()
  {
    return this.mfb;
  }

  public void setDragAndDropParent(bXx parambXx)
  {
    this.mfb = parambXx;
  }

  public void setOnFocusChange(bmW parambmW)
  {
    a(parambmW.mp(), parambmW, true);
  }

  public void setOnClick(csA paramcsA) {
    a(paramcsA.mp(), paramcsA, true);
  }

  public void setOnDoubleClick(Zd paramZd) {
    a(paramZd.mp(), paramZd, true);
  }

  public void setOnMouseMove(aDL paramaDL) {
    a(paramaDL.mp(), paramaDL, true);
  }

  public void setOnMouseEnter(bDy parambDy) {
    a(parambDy.mp(), parambDy, true);
  }

  public void setOnMouseExit(DY paramDY) {
    a(paramDY.mp(), paramDY, true);
  }

  public void setOnMousePress(aMB paramaMB) {
    a(paramaMB.mp(), paramaMB, true);
  }

  public void setOnMouseRelease(adV paramadV) {
    a(paramadV.mp(), paramadV, true);
  }

  public void setOnMouseWheel(vT paramvT) {
    a(paramvT.mp(), paramvT, true);
  }

  public void setOnMouseDrag(EB paramEB) {
    a(paramEB.mp(), paramEB, true);
  }

  public void setOnMouseDragOut(VS paramVS) {
    a(paramVS.mp(), paramVS, true);
  }

  public void setOnMouseDragIn(bLt parambLt) {
    a(parambLt.mp(), parambLt, true);
  }

  public void setOnKeyPress(aOn paramaOn) {
    a(paramaOn.mp(), paramaOn, true);
  }

  public void setOnKeyRelease(akx paramakx) {
    a(paramakx.mp(), paramakx, true);
  }

  public void setOnKeyType(dbp paramdbp) {
    a(paramdbp.mp(), paramdbp, true);
  }

  public void setOnPopupDisplay(cCu paramcCu) {
    a(paramcCu.mp(), paramcCu, true);
  }

  public void setOnPopupHide(jL paramjL) {
    a(paramjL.mp(), paramjL, true);
  }

  public void setOnSelectionChange(bvO parambvO) {
    a(parambvO.mp(), parambvO, true);
  }

  public void setOnSliderMove(dis paramdis) {
    a(paramdis.mp(), paramdis, true);
  }

  public void setOnStick(aFU paramaFU) {
    a(paramaFU.mp(), paramaFU, true);
  }

  public void setOnValueChange(aIr paramaIr) {
    a(paramaIr.mp(), paramaIr, true);
  }

  public void setOnListSelectionChange(dTZ paramdTZ) {
    a(paramdTZ.mp(), paramdTZ, true);
  }

  public void setOnItemOver(anx paramanx) {
    a(paramanx.mp(), paramanx, true);
  }

  public void setOnItemOut(cVk paramcVk) {
    a(paramcVk.mp(), paramcVk, true);
  }

  public void setOnItemClick(aqC paramaqC) {
    a(paramaqC.mp(), paramaqC, true);
  }

  public void setOnItemDoubleClick(bpP parambpP) {
    a(parambpP.mp(), parambpP, true);
  }

  public void setOnDrag(dVA paramdVA) {
    a(CH.bFX, paramdVA, false);
  }

  public void setOnDrop(bQa parambQa) {
    a(CH.bGa, parambQa, false);
  }

  public void setOnDropOut(fp paramfp) {
    a(CH.bGb, paramfp, false);
  }

  public void setOnDragOut(boO paramboO) {
    a(CH.bFY, paramboO, false);
  }

  public void setOnDragOver(Bc paramBc) {
    a(CH.bFZ, paramBc, false);
  }

  public dRq getWidgetParentOfType(Class paramClass)
  {
    if (this.meE == null) {
      return null;
    }
    if (paramClass.isAssignableFrom(this.meE.getClass())) {
      return this.meE;
    }
    return this.meE.getWidgetParentOfType(paramClass);
  }

  public void setUserDefinedSize(boolean paramBoolean)
  {
    if (this.etW == null) {
      this.etW = new bMw(this);
    }

    bMw localbMw = (bMw)this.etW;
    if (localbMw.bTV() == paramBoolean) {
      return;
    }

    localbMw.gn(paramBoolean);
    beL();
  }

  public boolean isSizeInitByUserDefinition() {
    return (this.etW != null) && (((bMw)this.etW).bTV()) && ((this.haN.getWidth() != 0.0D) || (this.haN.getHeight() != 0.0D));
  }

  public void setUserDefinedPosition(boolean paramBoolean)
  {
    if (this.etW == null) {
      this.etW = new bMw(this);
    }

    bMw localbMw = (bMw)this.etW;
    if (localbMw.bTU() == paramBoolean) {
      return;
    }

    localbMw.gm(paramBoolean);
    beL();
  }

  public boolean isPositionInitByUserDefinition() {
    return (this.etW != null) && (((bMw)this.etW).bTU()) && (this.etW.bTT());
  }

  public boolean g(cSx paramcSx)
  {
    if ((isEnabledFull()) || (!(paramcSx instanceof bv))) {
      return super.g(paramcSx);
    }
    paramcSx.release();

    return false;
  }

  public void invalidate()
  {
    if (this.czl != null) {
      this.czl.invalidate();
    }
    super.invalidate();
  }

  public boolean isInWidgetTree()
  {
    if (this.meE != null) {
      return this.meE.isInWidgetTree();
    }
    return false;
  }

  public void ajj()
  {
    if ((this.meY != null) && (this.meZ != null)) {
      dUo localdUo = IZ.Sq().dc(this.meZ);
      if (localdUo != null) {
        Class localClass = localdUo.bya();
        dRq localdRq = getWidgetParentOfType(localClass);
        if (localdRq != null) {
          localdRq.d(this.meY, this);
        }
      }
    }

    if (this.meU)
      zC.Ip().c(this);
  }

  public void ccT()
  {
  }

  public void rV()
  {
    super.rV();
    if (this.meD != null)
      this.meD.release();
    this.meD = ((Jg)this.czl.beO());

    if (this.meV[0] == null)
      setStyle("", true);
    else
      setStyle(this.meV[0], true);
  }

  public void bc()
  {
    zC.Ip().d(this);

    super.bc();

    if (bsP.getInstance() != null) {
      bsP.getInstance().k(this);
    }

    this.bqm.a(null);
    this.bqm.b(null);
    this.bqm.removeAllChildren();
    this.bqm.axl();
    this.bqm = null;

    this.haN = null;
    this.haL = null;
    this.meL = null;
    this.aCQ = null;
    this.meF = null;
    this.mfh = null;

    setNetEnabledId(null);

    this.meE = null;
    this.mfb = null;

    if (this.meD != null) {
      this.meD.release();
      this.meD = null;
    }
    this.czl = null;

    Arrays.fill(this.meV, null);

    this.meY = null;
    this.meZ = null;
    if (this.meX != null) {
      this.meX.clear();
      this.meX = null;
    }

    this.mfa = null;

    this.bxb = null;

    this.mfd = null;
    this.mfc = null;
  }

  public void aJ()
  {
    super.aJ();

    this.mfk = false;
    this.mfj = false;

    this.meO = true;
    this.meP = false;
    this.meN = false;
    this.meR = false;
    this.bur = true;
    this.meS = true;
    this.meU = false;
    this.meW = false;
    this.mfl = false;

    this.mfi = false;

    this.gQb = true;

    this.cqZ = duv.lyl;

    this.mfe = false;
    this.mff = false;

    this.mfg = true;

    cxn localcxn = new cxn();
    localcxn.Ls();
    if ((!bB) && (this.bqm != null)) throw new AssertionError();
    this.bqm = ((EntityGroup)EntityGroup.ecY.bQy());
    this.bqm.mnU = this;
    this.bqm.dsE().a(localcxn);

    atF localatF = new atF(this);
    this.bqm.a(localatF);
    this.bqm.b(localatF);
    this.bqm.aGp().d(new cEh(10000.0F, 0.0F, 0.0F));

    this.meJ = false;
    this.meM = false;
    this.meK = false;

    this.meF = new Point(0, 0);
    this.haN = new Or(0, 0);

    this.aYZ = true;
    this.meQ = false;

    setNeedsToPostProcess();
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.meW) {
      setStyle(this.meV[0], true);
    }

    return bool;
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);

    if ((this.mfg) && (this.bqm != null)) {
      this.bqm.removeAllChildren();
      ST();
    }

    if ((this.gQb) && (this.aYZ) && (this.bqm != null)) {
      int i = this.meF.x;
      int j = this.meF.y;
      if (this.meE != null) {
        i += this.meE.getAppearance().getLeftInset();
        j += this.meE.getAppearance().getBottomInset();
      }
      this.bqm.dsE().a(0, i, j);

      this.gQb = false;
    }

    return bool;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[").append(getClass().getSimpleName()).append("] ");
    if (this.bYJ != null) {
      localStringBuilder.append("id = ").append(this.bYJ).append(" ");
    }

    if (this.meF != null) {
      localStringBuilder.append("Position <").append(this.meF.x).append(", ").append(this.meF.y).append("> ");
    }
    if (this.haN != null) {
      localStringBuilder.append("Taille (").append(this.haN.width).append(", ").append(this.haN.height).append(")");
    }
    if (this.bYJ != null) {
      localStringBuilder.append("Id=").append(getId());
    }
    if (isUnloading()) {
      localStringBuilder.append("released");
    }
    return localStringBuilder.toString();
  }

  public void c(bdj parambdj)
  {
    dOc localdOc = (dOc)parambdj;
    super.c(localdOc);
    localdOc.mfk = this.mfk;
    localdOc.mfj = this.mfj;
    localdOc.bur = this.bur;
    localdOc.setNetEnabledId(this.meT);
    localdOc.meO = this.meO;
    localdOc.meP = this.meP;
    localdOc.meN = this.meN;
    localdOc.setFocusable(this.meU);
    if (this.meL != null) {
      localdOc.meL = this.meL.aaB();
    }
    localdOc.meM = this.meM;
    if (this.aCQ != null) {
      localdOc.aCQ = this.aCQ.aaB();
    }
    localdOc.meK = this.meK;
    if (this.haL != null) {
      localdOc.haL = this.haL.aaB();
    }
    localdOc.meJ = this.meJ;
    localdOc.meQ = this.meQ;
    localdOc.meF = ((Point)this.meF.clone());
    localdOc.haN = ((Or)this.haN.clone());

    localdOc.cqZ = this.cqZ;

    System.arraycopy(this.meV, 0, localdOc.meV, 0, this.meV.length);

    localdOc.meY = this.meY;
    localdOc.meZ = this.meZ;
    localdOc.aYZ = this.aYZ;
    if (localdOc.meD != null)
      localdOc.meD.release();
    localdOc.meD = (this.meD != null ? (Jg)this.meD.beO() : null);

    localdOc.mfi = this.mfi;

    if (this.etW != null) {
      localdOc.setUserDefinedSize(isSizeInitByUserDefinition());
      localdOc.setUserDefinedPosition(isPositionInitByUserDefinition());
    }

    localdOc.mfl = this.mfl;
  }

  public final boolean dqh() {
    return this.mfi;
  }

  public void setNeedsScissor(boolean paramBoolean) {
    this.mfi = paramBoolean;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ijB)
      setSize(paramaKN.gK(paramString));
    else if (paramInt == mfn)
      setMaxSize(paramaKN.gK(paramString));
    else if (paramInt == mfm)
      setPrefSize(paramaKN.gK(paramString));
    else if (paramInt == mfo)
      setExpandable(bUD.getBoolean(paramString));
    else if (paramInt == mfp)
      setShrinkable(bUD.getBoolean(paramString));
    else if (paramInt == mfq)
      setGreedy(bUD.getBoolean(paramString));
    else if (paramInt == mft)
      setNetEnabledId(paramString);
    else if (paramInt == czn)
      setEnabled(bUD.getBoolean(paramString));
    else if (paramInt == mfr)
      setFocusable(bUD.getBoolean(paramString));
    else if (paramInt == mfs)
      setFocused(bUD.getBoolean(paramString));
    else if ((paramInt == gea) || (paramInt == mfu))
      setVisible(bUD.getBoolean(paramString));
    else if (paramInt == mfv)
      setUsePositionTween(bUD.getBoolean(paramString));
    else if (paramInt == mfw)
      setUseResizeTween(bUD.getBoolean(paramString));
    else if (paramInt == mfF)
      setStickWithinContainer(bUD.getBoolean(paramString));
    else if (paramInt == dTX)
      setX(bUD.aR(paramString));
    else if (paramInt == dTY)
      setY(bUD.aR(paramString));
    else if (paramInt == mfx)
      setStyle(paramaKN.gL(paramString));
    else if (paramInt == mfy)
      setThemeElementName(paramaKN.gL(paramString));
    else if (paramInt == mfz)
      setThemeElementParentType(paramaKN.gL(paramString));
    else if (paramInt == mfA)
      setNonBlocking(bUD.getBoolean(paramString));
    else if (paramInt == mfB)
      setCursorType(duv.qn(paramString));
    else if (paramInt == mfC)
      setNeedsScissor(bUD.getBoolean(paramString));
    else if (paramInt == mfD)
      setUserDefinedSize(bUD.getBoolean(paramString));
    else if (paramInt == mfE)
      setUserDefinedPosition(bUD.getBoolean(paramString));
    else if (paramInt == aBE)
      setOnDrag((dVA)paramaKN.b(dVA.class, paramString));
    else if (paramInt == aBF)
      setOnDrop((bQa)paramaKN.b(bQa.class, paramString));
    else if (paramInt == aBG)
      setOnDragOut((boO)paramaKN.b(boO.class, paramString));
    else if (paramInt == aBH)
      setOnDropOut((fp)paramaKN.b(fp.class, paramString));
    else if (paramInt == aBI)
      setOnDragOver((Bc)paramaKN.b(Bc.class, paramString));
    else if (paramInt == aBi)
      setOnClick((csA)paramaKN.b(csA.class, paramString));
    else if (paramInt == aBj)
      setOnDoubleClick((Zd)paramaKN.b(Zd.class, paramString));
    else if (paramInt == aBk)
      setOnFocusChange((bmW)paramaKN.b(bmW.class, paramString));
    else if (paramInt == aBl)
      setOnItemClick((aqC)paramaKN.b(aqC.class, paramString));
    else if (paramInt == aBm)
      setOnItemDoubleClick((bpP)paramaKN.b(bpP.class, paramString));
    else if (paramInt == aBn)
      setOnItemOut((cVk)paramaKN.b(cVk.class, paramString));
    else if (paramInt == aBo)
      setOnItemOver((anx)paramaKN.b(anx.class, paramString));
    else if (paramInt == aBp)
      setOnKeyPress((aOn)paramaKN.b(aOn.class, paramString));
    else if (paramInt == aBq)
      setOnKeyRelease((akx)paramaKN.b(akx.class, paramString));
    else if (paramInt == aBr)
      setOnKeyType((dbp)paramaKN.b(dbp.class, paramString));
    else if (paramInt == aBs)
      setOnListSelectionChange((dTZ)paramaKN.b(dTZ.class, paramString));
    else if (paramInt == aBt)
      setOnMouseDrag((EB)paramaKN.b(EB.class, paramString));
    else if (paramInt == aBu)
      setOnMouseDragIn((bLt)paramaKN.b(bLt.class, paramString));
    else if (paramInt == aBv)
      setOnMouseDragOut((VS)paramaKN.b(VS.class, paramString));
    else if (paramInt == aBy)
      setOnMouseMove((aDL)paramaKN.b(aDL.class, paramString));
    else if (paramInt == aBw)
      setOnMouseEnter((bDy)paramaKN.b(bDy.class, paramString));
    else if (paramInt == aBx)
      setOnMouseExit((DY)paramaKN.b(DY.class, paramString));
    else if (paramInt == aBz)
      setOnMousePress((aMB)paramaKN.b(aMB.class, paramString));
    else if (paramInt == aBA)
      setOnMouseRelease((adV)paramaKN.b(adV.class, paramString));
    else if (paramInt == aBB)
      setOnMouseWheel((vT)paramaKN.b(vT.class, paramString));
    else if (paramInt == aBC)
      setOnSelectionChange((bvO)paramaKN.b(bvO.class, paramString));
    else if (paramInt == aBD)
      setOnSliderMove((dis)paramaKN.b(dis.class, paramString));
    else if (paramInt == mfH)
      setOnStick((aFU)paramaKN.b(aFU.class, paramString));
    else if (paramInt == aBJ)
      setOnPopupDisplay((cCu)paramaKN.b(cCu.class, paramString));
    else if (paramInt == aBK)
      setOnPopupHide((jL)paramaKN.b(jL.class, paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == ijB)
      setSize((Or)paramObject);
    else if (paramInt == mfn)
      setMaxSize((Or)paramObject);
    else if (paramInt == mfm)
      setPrefSize((Or)paramObject);
    else if (paramInt == mfo)
      setExpandable(bUD.getBoolean(paramObject));
    else if (paramInt == mfp)
      setShrinkable(bUD.getBoolean(paramObject));
    else if (paramInt == mfq)
      setGreedy(bUD.getBoolean(paramObject));
    else if (paramInt == czn)
      setEnabled(bUD.getBoolean(paramObject));
    else if (paramInt == mfr)
      setFocusable(bUD.getBoolean(paramObject));
    else if (paramInt == mfs)
      setFocused(bUD.getBoolean(paramObject));
    else if ((paramInt == gea) || (paramInt == mfu))
      setVisible(bUD.getBoolean(paramObject));
    else if (paramInt == mfv)
      setUsePositionTween(bUD.getBoolean(paramObject));
    else if (paramInt == mfw)
      setUseResizeTween(bUD.getBoolean(paramObject));
    else if (paramInt == dTX)
      setX(bUD.aR(paramObject));
    else if (paramInt == dTY)
      setY(bUD.aR(paramObject));
    else if (paramInt == mfx)
      setStyle((String)paramObject);
    else if (paramInt == mfy)
      setThemeElementName((String)paramObject);
    else if (paramInt == mfz)
      setThemeElementParentType((String)paramObject);
    else if (paramInt == mfA)
      setNonBlocking(bUD.getBoolean(paramObject));
    else if (paramInt == mfB)
      setCursorType((duv)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }

  public bdj getNewElement(String paramString, aNL paramaNL, Stack paramStack, cDA paramcDA)
  {
    Object localObject = super.getNewElement(paramString, paramaNL, paramStack, paramcDA);
    if (((localObject instanceof Jg)) && (this.czl != null)) {
      ((bdj)localObject).release();
      localObject = getAppearance();
    }

    return localObject;
  }
}