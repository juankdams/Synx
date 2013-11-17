import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bsP extends dhh
{
  private static final Logger K = Logger.getLogger(bsP.class);
  public static final String TAG = "MasterRootContainer";
  private static final bsP gae = new bsP();
  private dOc gaf;
  private dOc gag;
  private MouseEvent gah = null;

  private dMr gai = null;
  private MouseEvent gaj = null;

  private Or gak = null;
  private boolean cwN = false;
  private dOc gal;
  private boolean gam = false;
  private int gan;
  private final adz gao = new adz();
  private dwY gap;
  private boolean gaq = true;

  private boolean gar = false;

  private final ArrayList aBf = new ArrayList();

  private boolean gas = false;

  public static bsP getInstance()
  {
    return gae;
  }

  public void aji()
  {
    a(CH.bGj, new azI(this), false);
  }

  public void setSize(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.gak = new Or(paramInt1, paramInt2);
    setNeedsToPreProcess();
  }

  public bsP getMasterRootContainer()
  {
    return this;
  }

  public String getTag() {
    return "MasterRootContainer";
  }

  public dOc getMouseOver() {
    return this.gaf;
  }

  public dMr getCurrentMouseEvent() {
    return this.gai;
  }

  public MouseEvent getCurrentAWTMouseEvent() {
    return this.gaj;
  }

  public dwY getPopupContainer() {
    return this.gap;
  }

  public boolean isResized() {
    return this.cwN;
  }

  public boolean isKeyEventConsumed() {
    return this.gaq;
  }

  public void setKeyEventConsumed(boolean paramBoolean) {
    this.gaq = paramBoolean;
  }

  public void setElementMap(cpa paramcpa)
  {
    super.setElementMap(paramcpa);

    this.lcm.setElementMap(paramcpa);
  }

  public void setVisible(boolean paramBoolean)
  {
    boolean bool = this.aYZ;

    super.setVisible(paramBoolean);

    dGx.dhr().a(duv.lyl);
    if (bool != paramBoolean)
      for (cJI localcJI : this.aBf)
        if (paramBoolean)
          localcJI.b(this);
        else
          localcJI.c(this);
  }

  public void a(cJI paramcJI)
  {
    if (!this.aBf.contains(paramcJI))
      this.aBf.add(paramcJI);
  }

  public void b(cJI paramcJI) {
    this.aBf.remove(paramcJI);
  }

  public void bAW()
  {
    bc();
    aJ();
    setSize(dUq.dup().duu());
    cmV localcmV = cBQ.cxL().cxS();
    localcmV.h(this.bqm);
  }

  public boolean isInWidgetTree()
  {
    return true;
  }

  public boolean isInTree()
  {
    return true;
  }

  public boolean isDragging() {
    return this.gal != null;
  }

  public dOc getDragged() {
    return this.gal;
  }

  public int getDragButton() {
    return this.gan;
  }

  public void setDragged(dOc paramdOc, int paramInt) {
    this.gal = paramdOc;
    this.gan = paramInt;
  }

  public boolean isShiftPressed() {
    return this.gar;
  }

  public void bAX() {
    if (this.gal != null) {
      this.gal = null;
      this.gan = 0;
      ajT.axh().cancel();
    }
  }

  public void k(dOc paramdOc) {
    if (this.gal == paramdOc) {
      this.gal = null;
      this.gan = 0;
      ajT.axh().cleanUp();
    }
    if (this.gaf == paramdOc) {
      this.gaf = null;
    }
    if (this.gag == paramdOc)
      this.gag = null;
  }

  public void bAY()
  {
    if (this.gah != null)
      j(this.gah);
  }

  public boolean isMovePointMode()
  {
    return this.gas;
  }

  public void setMovePointMode(boolean paramBoolean) {
    this.gas = paramBoolean;
    dGx.dhr().a(paramBoolean ? duv.lyn : duv.lyl);
  }

  public boolean j(MouseEvent paramMouseEvent)
  {
    this.gah = paramMouseEvent;
    this.gaj = paramMouseEvent;

    int i = this.haN.height - paramMouseEvent.getY();
    int j = paramMouseEvent.getX();

    int k = 0;
    if (!Ts.agx().ao(j, i)) {
      k = 1;
    }

    if ((this.gal == null) && (k != 0)) {
      this.gaj = null;
      return true;
    }

    cyb.cvg().dm(j, i);

    aNL localaNL = k == 0 ? getWidget(j, i) : null;
    dMr localdMr;
    if (localaNL != null) {
      if ((localaNL != this) || (localaNL != this.gaf)) {
        dGx.dhr().a(localaNL.getCursorType());
      }

      localdMr = dMr.m(paramMouseEvent);
      localdMr.q(localaNL);
      localdMr.setScreenX(j);
      localdMr.setScreenY(i);
      localdMr.b(CH.bGo);
      this.gai = localdMr;
      this.gaj = paramMouseEvent;
      localaNL.g(localdMr);
    }

    if (this.gas) {
      dGx.dhr().a(duv.lyn);
    }

    if (localaNL != this.gaf)
    {
      aZO localaZO;
      if (this.gaf != null) {
        localdMr = dMr.m(paramMouseEvent);
        localdMr.q(this.gaf);
        localdMr.setScreenX(j);
        localdMr.setScreenY(i);
        localdMr.b(CH.bGt);
        this.gai = localdMr;
        this.gaf.g(localdMr);
        this.gai = null;

        localaZO = aZO.boR();
        localaZO.q(this.gaf);
        localaZO.b(CH.bGA);
        this.gaf.g(localaZO);
      }
      if (localaNL != null) {
        localdMr = dMr.m(paramMouseEvent);
        localdMr.q(localaNL);
        localdMr.setScreenX(j);
        localdMr.setScreenY(i);
        localdMr.b(CH.bGs);
        this.gai = localdMr;
        localaNL.g(localdMr);
        this.gai = null;

        localaZO = aZO.boR();
        localaZO.q(localaNL);
        localaZO.b(CH.bGz);
        localaNL.g(localaZO);
      }
      this.gaf = localaNL;
    }

    if (this.gal != null) {
      this.gai = dMr.m(paramMouseEvent);
      this.gai.q(this.gal);
      this.gai.setScreenX(j);
      this.gai.setScreenY(i);
      this.gai.b(CH.bGq);

      if (!ajT.axh().c(this.gaf, j, i)) {
        if (this.gam) {
          localdMr = dMr.l(this.gai);
          localdMr.b(CH.bGp);
          this.gal.g(localdMr);

          this.gam = false;
        }
        this.gal.g(this.gai);
      } else {
        this.gai.release();
      }

      this.gai = null;
    }

    bWx.cbz().dm(paramMouseEvent.getX(), i);

    this.gaj = null;

    return this.gal != null;
  }

  public boolean mousePressed(MouseEvent paramMouseEvent)
  {
    int i = paramMouseEvent.getButton();
    if (i == 0) {
      return false;
    }

    this.gaj = paramMouseEvent;

    int j = paramMouseEvent.getX();
    int k = this.haN.height - paramMouseEvent.getY();

    if (!Ts.agx().ao(j, k)) {
      this.gaj = null;
      this.gao.hL(i);
      return true;
    }

    Object localObject = getWidget(j, k);

    if (localObject == null) {
      localObject = this;
    }

    zC.Ip().e((dOc)localObject);

    dMr localdMr = dMr.m(paramMouseEvent);
    localdMr.q((aNL)localObject);
    localdMr.setScreenX(j);
    localdMr.setScreenY(k);
    localdMr.b(CH.bGu);
    this.gai = localdMr;

    if ((this.gal == null) && (localObject != this)) {
      this.gam = true;
      this.gal = ((dOc)localObject);
      this.gan = i;
      ajT.axh().b((dOc)localObject, j, k);
    }

    cyb.cvg().a((dOc)localObject, localdMr);
    ((dOc)localObject).g(localdMr);
    this.gai = null;
    this.gaj = null;

    if (localObject != this) {
      this.gao.hL(i);
    }

    return localObject != this;
  }

  public boolean f(MouseEvent paramMouseEvent)
  {
    int i = paramMouseEvent.getButton();
    if (i == 0) {
      return false;
    }
    this.gaj = paramMouseEvent;

    int j = paramMouseEvent.getX();
    int k = this.haN.height - paramMouseEvent.getY();

    int m = this.gan == i ? 1 : 0;

    int n = !Ts.agx().ao(j, k) ? 1 : 0;

    if ((n != 0) && (m == 0)) {
      this.gaj = null;
      return this.gao.remove(i);
    }

    Object localObject = getWidget(j, k);

    if (localObject == null) {
      localObject = this;
    }

    dMr localdMr1 = null;
    if (n == 0) {
      localdMr1 = dMr.m(paramMouseEvent);
      localdMr1.q((aNL)localObject);
      localdMr1.setScreenX(j);
      localdMr1.setScreenY(k);
      localdMr1.b(CH.bGv);
      this.gai = localdMr1;
    }

    if (m != 0) {
      dMr localdMr2 = dMr.m(paramMouseEvent);
      localdMr2.q((aNL)localObject);
      localdMr2.setScreenX(j);
      localdMr2.setScreenY(k);
      localdMr2.b(CH.bGr);
      this.gal.g(localdMr2);
      this.gal = null;
      this.gan = 0;
      ajT.axh().d((dOc)localObject, j, k);
    }

    if (n == 0) {
      cyb.cvg().b((dOc)localObject, localdMr1);
      ((dOc)localObject).g(localdMr1);
      this.gai = null;
    }

    this.gaj = null;

    return this.gao.remove(i);
  }

  public boolean a(MouseWheelEvent paramMouseWheelEvent) {
    this.gaj = paramMouseWheelEvent;

    int i = paramMouseWheelEvent.getX();
    int j = this.haN.height - paramMouseWheelEvent.getY();

    if (!Ts.agx().ao(i, j)) {
      return true;
    }

    Object localObject = getWidget(i, j);

    if (localObject == null) {
      localObject = this;
    }

    dMr localdMr = dMr.m(paramMouseWheelEvent);
    localdMr.q((aNL)localObject);
    localdMr.setScreenX(i);
    localdMr.setScreenY(j);
    localdMr.CX(paramMouseWheelEvent.getWheelRotation());
    localdMr.b(CH.bGy);
    this.gai = localdMr;
    ((dOc)localObject).g(localdMr);
    this.gai = null;

    this.gaj = null;
    return localObject != this;
  }

  public boolean c(KeyEvent paramKeyEvent) {
    boolean bool = false;

    if ((!Ts.agx().isEmpty()) && (!cBQ.cxL().cxR().a(paramKeyEvent))) {
      bool = true;
    }

    if (EK.NJ().c(paramKeyEvent)) {
      return true;
    }
    if (paramKeyEvent.getKeyCode() == 16) {
      this.gar = true;
    }

    if (paramKeyEvent.getKeyCode() == 17) {
      setMovePointMode(true);
    }

    if (paramKeyEvent.getKeyCode() == 9) {
      if ((paramKeyEvent.getModifiersEx() & 0x40) == 64)
        zC.Ip().Is();
      else {
        zC.Ip().It();
      }
      return bool;
    }

    bool |= a(paramKeyEvent, CH.bGh);

    return bool;
  }

  public boolean b(KeyEvent paramKeyEvent) {
    boolean bool1 = false;

    if ((!Ts.agx().isEmpty()) && (!cBQ.cxL().cxR().a(paramKeyEvent))) {
      bool1 = true;
    }

    if (EK.NJ().b(paramKeyEvent)) {
      return true;
    }
    if (paramKeyEvent.getKeyCode() == 16) {
      this.gar = false;
    }

    if (paramKeyEvent.getKeyCode() == 17) {
      setMovePointMode(false);
    }

    boolean bool2 = a(paramKeyEvent, CH.bGi);

    if (bool2) {
      cBQ.cxL().cxR().eH(-1);
      setMovePointMode(false);
    }

    return bool2 | bool1;
  }

  public boolean d(KeyEvent paramKeyEvent) {
    return a(paramKeyEvent, CH.bGj);
  }

  private boolean a(KeyEvent paramKeyEvent, CH paramCH)
  {
    int i = paramKeyEvent.getKeyCode();
    dOc localdOc = zC.Ip().Iq();
    boolean bool;
    if (localdOc != null) {
      ctH localctH = ctH.crh();
      localctH.q(localdOc);
      localctH.setKeyChar(paramKeyEvent.getKeyChar());
      localctH.setKeyCode(i);
      localctH.setModifiers(paramKeyEvent.getModifiersEx());
      localctH.b(paramCH);
      this.gaq = false;
      bool = localdOc.g(localctH);
    } else {
      return false;
    }

    return (this.gaq) || (bool);
  }

  public boolean bb(int paramInt)
  {
    if (this.cwN) {
      this.cwN = false;
    }

    boolean bool = false;

    if (this.gak != null) {
      super.setSize(this.gak.width, this.gak.height, false);
      this.gak = null;
      this.cwN = true;
      bool = true;
    }

    bool |= super.bb(paramInt);

    return bool;
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);

    Point localPoint = dUq.dup().duq();
    this.bqm.dsE().a(0, localPoint.x, localPoint.y + this.haN.height);

    return bool;
  }

  public void aJ()
  {
    super.aJ();
    setTreeDepth(0);
    this.meQ = false;
    this.cwN = false;
    this.mfj = true;

    this.gap = new dwY();
    this.gap.aJ();

    this.lcm.b(this.gap, 30000);

    aHr.efc.aJ();
    this.lcm.b(aHr.efc, -40000);
    aHr.efc.setElementMap(new cpa("", cBQ.cxL().coO()));
    aHr.efc.rV();

    setScreenPosition(0, 0);

    aji();

    this.mfi = true;
  }

  public void bc()
  {
    super.bc();
    this.gal = null;
    this.gah = null;
    this.gaf = null;
    this.gai = null;
    this.gaj = null;
    this.gak = null;

    this.gap = null;
  }

  protected void rd()
  {
    super.rd();
  }
}