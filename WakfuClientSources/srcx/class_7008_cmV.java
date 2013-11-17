import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import org.apache.log4j.Logger;

public class cmV extends DB
  implements dCp
{
  private static Logger K = Logger.getLogger(cmV.class);
  public static final boolean hSx = false;
  private GL dzZ;
  private dUq hSy;
  private bsP hSz;
  private anT hSA;
  private final ArrayList aBf = new ArrayList();

  private final ArrayList hSB = new ArrayList();
  private int ia;
  private int ib;
  private float aYg = 1.0F;
  private float aYh = 1.0F;

  private boolean hSC = false;

  private static final cxn hSD = new cxn();

  private static final int[] hSE = { 0, 1, 2, 3 };
  public static long hSF;
  public static long hSG;
  public static long hSH;
  public static long hSI;
  public static long hSJ;
  public static long hSK;
  public static long hSL;
  public static long hSM;
  private static final boolean hSN = false;
  private static final int hSO = 5;
  private static final long hSP = 3000000L;
  public static int hSQ = 0;
  private static long hSR = 0L;
  private static boolean hSS;

  public cmV()
  {
    a(cBQ.cxL());
  }

  public void a(dEO paramdEO)
  {
    if (!this.aBf.contains(paramdEO))
      this.aBf.add(paramdEO);
  }

  public void b(dEO paramdEO)
  {
    if (this.aBf.contains(paramdEO))
      this.aBf.remove(paramdEO);
  }

  public void a(drz paramdrz)
  {
    if (!this.hSB.contains(paramdrz))
      this.hSB.add(paramdrz);
  }

  public void b(drz paramdrz)
  {
    if (this.hSB.contains(paramdrz))
      this.hSB.remove(paramdrz);
  }

  public void W(int paramInt1, int paramInt2)
  {
    setScale(paramInt1 / 922.0F, paramInt2 / 720.0F);
    paramInt1 = (int)(paramInt1 / this.aYg);
    paramInt2 = (int)(paramInt2 / this.aYh);
    super.W(paramInt1, paramInt2);

    int i = paramInt1 - this.ia;
    int j = paramInt2 - this.ib;
    this.ia = paramInt1;
    this.ib = paramInt2;

    if (this.hSy != null) {
      this.hSy.fu(this.ia, this.ib);
    }

    if (this.hSz != null) {
      this.hSz.setSize(this.ia, this.ib);
    }

    ZW localZW = cBQ.cxL().cxP();
    if (localZW != null) {
      localZW.alK();
    }
    dB(i, j);
  }

  public bsP getMasterRootContainer()
  {
    return this.hSz;
  }

  public boolean cnF()
  {
    return this.hSC;
  }

  public void init(GLAutoDrawable paramGLAutoDrawable)
  {
    try
    {
      super.init(paramGLAutoDrawable);

      ((jM)paramGLAutoDrawable).setFocusTraversalKeysEnabled(false);

      this.dzZ = paramGLAutoDrawable.getGL();
      this.hSy = dUq.dup();
      this.hSy.fu(this.ia, this.ib);

      this.hSy.a(this.dzZ, paramGLAutoDrawable);

      cDA localcDA = cBQ.cxL().coO();
      cpa localcpa = localcDA.nd("masterRootContainer");

      this.hSz = bsP.getInstance();
      this.hSz.aJ();
      this.hSz.setSize(this.ia, this.ib);
      this.hSz.setElementMap(localcpa);

      this.hSz.getEntity().dsE().b(0, this.aYg, this.aYh);

      cnI();
    }
    catch (Throwable localThrowable)
    {
      K.error("Exception", localThrowable);
    }
  }

  private void o(GL paramGL) {
    ayc localayc = dHL.lSB.dhZ();
    dsZ localdsZ = dsZ.cZe();

    localayc.dNI.qH(0);

    localdsZ.kp(true);
    localdsZ.a(cnQ.hUX, cnQ.hUY);
    localdsZ.dk(1.0F);

    localdsZ.a(paramGL, aLv.epO, Matrix44.bFe);
    localdsZ.a(paramGL, aLv.epN, Matrix44.bFe);

    Fi localFi = MG();
    localdsZ.a(paramGL, localFi);

    hSD.Ls();
    hSD.b(0.0F, -2.0F * localFi.OO(), 0.0F);
    localayc.g(hSD.aGp());

    dsZ.cZe().reset();
  }

  public void a(GL paramGL)
  {
    if (!byn.bFr().bFs()) {
      return;
    }

    o(paramGL);

    ayc localayc = dHL.lSB.dhZ();
    try {
      if ((this.hSz != null) && (this.hSz.getVisible())) {
        this.hSz.getEntity().a(localayc);
      }
      int i = this.hSB.size();
      for (int j = 0; j < i; j++)
        ((drz)this.hSB.get(j)).a(localayc, this.hSy);
    }
    catch (Throwable localThrowable) {
      K.error("Exception", localThrowable);
    }
  }

  public static boolean cnG()
  {
    return true;
  }

  public static void cnH()
  {
  }

  public void cz(int paramInt)
  {
    Pb.aaU().update(0);
    if (!byn.bFr().bFs()) {
      return;
    }
    if ((this.hSz != null) && (!this.hSz.getVisible())) {
      return;
    }

    long l1 = 0L;

    long l2 = 0L;
    long l3 = 0L;
    long l4 = 0L;
    long l5 = 0L;
    try
    {
      super.cz(paramInt);

      vR(paramInt);

      if (this.hSz == null) {
        return;
      }

      if (cwf.ctJ().ctK()) {
        cwf.ctJ().sort();
      }

      cwf.ctJ().ctL();

      anT.aAo().jm(paramInt);

      cDz.iwP.cz(paramInt);
    }
    catch (Throwable localThrowable)
    {
      K.error("Exception", localThrowable);
    }
  }

  private void setScale(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 >= 1.0F) && (paramFloat2 >= 1.0F)) {
      this.aYg = 1.0F;
      this.aYh = 1.0F;
    } else {
      this.aYg = Math.min(paramFloat1, paramFloat2);
      this.aYh = this.aYg;
    }

    if (this.hSz != null)
      h(this.hSz.getEntity());
  }

  public float getScale()
  {
    return this.aYg;
  }

  public boolean isScaled() {
    return (this.aYg != 1.0F) || (this.aYh != 1.0F);
  }

  public void h(Entity paramEntity) {
    paramEntity.dsE().b(0, this.aYg, this.aYh);
  }

  public void f(avN paramavN) {
    paramavN.setX((int)(paramavN.getX() * this.aYg));
    paramavN.setY((int)(paramavN.getY() * this.aYh));
    paramavN.setWidth((int)(paramavN.getWidth() * this.aYg));
    paramavN.setHeight((int)(paramavN.getHeight() * this.aYh));
  }

  public int vO(int paramInt) {
    return (int)(paramInt / this.aYg);
  }

  public int vP(int paramInt) {
    return (int)(paramInt / this.aYh);
  }

  public boolean c(KeyEvent paramKeyEvent) {
    if ((this.hSz != null) && (this.hSz.getVisible())) {
      return this.hSz.c(paramKeyEvent);
    }
    return false;
  }

  public boolean b(KeyEvent paramKeyEvent) {
    if ((this.hSz != null) && (this.hSz.getVisible())) {
      return this.hSz.b(paramKeyEvent);
    }
    return false;
  }

  public boolean d(KeyEvent paramKeyEvent) {
    if ((this.hSz != null) && (this.hSz.getVisible())) {
      return this.hSz.d(paramKeyEvent);
    }
    return false;
  }

  public boolean e(MouseEvent paramMouseEvent) {
    return false;
  }

  public boolean g(MouseEvent paramMouseEvent) {
    return false;
  }

  public boolean h(MouseEvent paramMouseEvent)
  {
    return false;
  }

  public boolean i(MouseEvent paramMouseEvent) {
    if (!vQ(paramMouseEvent.getButton()))
      return false;
    if ((this.hSz != null) && (this.hSz.getVisible())) {
      MouseEvent localMouseEvent = paramMouseEvent;
      if (isScaled()) {
        localMouseEvent = new MouseEvent(paramMouseEvent.getComponent(), paramMouseEvent.getID(), paramMouseEvent.getWhen(), paramMouseEvent.getModifiersEx(), vO(paramMouseEvent.getX()), vP(paramMouseEvent.getY()), paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), paramMouseEvent.getButton());
      }
      return this.hSz.j(localMouseEvent);
    }
    return false;
  }

  public boolean j(MouseEvent paramMouseEvent) {
    if ((this.hSz != null) && (this.hSz.getVisible())) {
      MouseEvent localMouseEvent = paramMouseEvent;
      if (isScaled()) {
        localMouseEvent = new MouseEvent(paramMouseEvent.getComponent(), paramMouseEvent.getID(), paramMouseEvent.getWhen(), paramMouseEvent.getModifiersEx(), vO(paramMouseEvent.getX()), vP(paramMouseEvent.getY()), paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), paramMouseEvent.getButton());
      }
      return this.hSz.j(localMouseEvent);
    }
    return false;
  }

  public boolean mousePressed(MouseEvent paramMouseEvent) {
    if (!vQ(paramMouseEvent.getButton()))
      return false;
    if ((this.hSz != null) && (this.hSz.getVisible())) {
      MouseEvent localMouseEvent = paramMouseEvent;
      if (isScaled()) {
        localMouseEvent = new MouseEvent(paramMouseEvent.getComponent(), paramMouseEvent.getID(), paramMouseEvent.getWhen(), paramMouseEvent.getModifiersEx(), vO(paramMouseEvent.getX()), vP(paramMouseEvent.getY()), paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), paramMouseEvent.getButton());
      }
      return this.hSz.mousePressed(localMouseEvent);
    }
    return false;
  }

  public boolean f(MouseEvent paramMouseEvent) {
    if (!vQ(paramMouseEvent.getButton()))
      return false;
    if ((this.hSz != null) && (this.hSz.getVisible())) {
      MouseEvent localMouseEvent = paramMouseEvent;
      if (isScaled()) {
        localMouseEvent = new MouseEvent(paramMouseEvent.getComponent(), paramMouseEvent.getID(), paramMouseEvent.getWhen(), paramMouseEvent.getModifiersEx(), vO(paramMouseEvent.getX()), vP(paramMouseEvent.getY()), paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), paramMouseEvent.getButton());
      }
      return this.hSz.f(localMouseEvent);
    }
    return false;
  }

  public boolean a(MouseWheelEvent paramMouseWheelEvent) {
    if ((this.hSz != null) && (this.hSz.getVisible())) {
      MouseWheelEvent localMouseWheelEvent = paramMouseWheelEvent;
      if (isScaled()) {
        localMouseWheelEvent = new MouseWheelEvent(paramMouseWheelEvent.getComponent(), paramMouseWheelEvent.getID(), paramMouseWheelEvent.getWhen(), paramMouseWheelEvent.getModifiersEx(), vO(paramMouseWheelEvent.getX()), vP(paramMouseWheelEvent.getY()), paramMouseWheelEvent.getClickCount(), paramMouseWheelEvent.isPopupTrigger(), paramMouseWheelEvent.getScrollType(), paramMouseWheelEvent.getScrollAmount(), paramMouseWheelEvent.getWheelRotation());
      }
      return this.hSz.a(localMouseWheelEvent);
    }
    return false;
  }

  private boolean vQ(int paramInt) {
    for (int k : hSE)
      if (paramInt == k)
        return true;
    return false;
  }

  protected void cnI()
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((dEO)this.aBf.get(i)).b(this);
  }

  protected void vR(int paramInt)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((dEO)this.aBf.get(i)).a(this, paramInt);
  }

  protected void dB(int paramInt1, int paramInt2)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((dEO)this.aBf.get(i)).a(this, paramInt1, paramInt2);
  }

  public boolean a(FocusEvent paramFocusEvent)
  {
    zC.Ip().setEnabled(true);
    return false;
  }

  public boolean b(FocusEvent paramFocusEvent) {
    zC.Ip().setEnabled(false);
    cBQ.cxL().cxR().eH(-1);
    bsP.getInstance().setMovePointMode(false);

    return false;
  }
}