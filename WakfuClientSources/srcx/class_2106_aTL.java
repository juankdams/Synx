import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;
import org.apache.log4j.Logger;

public class aTL extends bnM
{
  private static final Logger K = Logger.getLogger(aTL.class);

  private final Stack eRW = new Stack();
  private boolean eRX;
  private boolean eRY;
  private boolean eRZ;
  private boolean eSa;
  private int eSb;
  private int eSc;
  private final adz eSd = new adz();
  private final boolean[] eSe = new boolean[256];
  private dCb eSf;
  private final ArrayList aDd = new ArrayList();

  private static final Comparator eSg = new cdA();

  public aTL(dnq paramdnq, float paramFloat1, float paramFloat2)
  {
    super(paramdnq, paramFloat1, paramFloat2);

    cKV().a(aZs.fgg);

    a(acL.apd());
    a(bVl.caZ());
    a(dps.cXa());

    a(aHr.efc);
    a(Dj.My());
    a(Xm.cHv);

    cKV().b(new cdy(this));
  }

  public void dV(boolean paramBoolean)
  {
    this.eRZ = paramBoolean;
  }

  public void dW(boolean paramBoolean) {
    this.eRX = paramBoolean;
  }

  public void dX(boolean paramBoolean) {
    this.eRY = paramBoolean;
  }

  public void dY(boolean paramBoolean)
  {
    super.dY(paramBoolean);

    bq(0.0F);
    eX(false);

    akY.axI().clear();
    bOX.bVM().clear();

    acL.apd().clear();
    aWc.blo().reset();
    dps.cXa().clear();

    tq.Bg().Bj();
  }

  public void cz(int paramInt)
  {
    bGT.bOB().update(paramInt);
    cOj.kwA.update(paramInt);

    super.cz(paramInt);

    biU();
  }

  private static boolean v(char paramChar) {
    return (paramChar >= 0) && (paramChar < 'Ā');
  }

  public boolean c(KeyEvent paramKeyEvent)
  {
    if (this.eRX) {
      ani.f(paramKeyEvent);
    }
    char c = paramKeyEvent.getKeyChar();
    if ((v(c)) && (this.eSe[c] != 1)) {
      this.eSe[c] = true;
    }
    return false;
  }

  public boolean b(KeyEvent paramKeyEvent)
  {
    if (this.eRY) {
      ani.g(paramKeyEvent);
    }
    char c = paramKeyEvent.getKeyChar();
    if (v(c)) {
      this.eSe[c] = false;
    }
    return false;
  }

  public boolean d(KeyEvent paramKeyEvent)
  {
    return false;
  }

  public boolean g(MouseEvent paramMouseEvent)
  {
    return false;
  }

  public boolean h(MouseEvent paramMouseEvent)
  {
    return false;
  }

  public boolean mousePressed(MouseEvent paramMouseEvent)
  {
    if (!this.eSd.contains(paramMouseEvent.getButton()))
      this.eSd.hL(paramMouseEvent.getButton());
    this.eSb = paramMouseEvent.getX();
    this.eSc = paramMouseEvent.getY();
    aqQ.q(paramMouseEvent.getX(), paramMouseEvent.getY(), paramMouseEvent.getButton());
    return false;
  }

  public boolean f(MouseEvent paramMouseEvent)
  {
    if (this.eSd.contains(paramMouseEvent.getButton()))
      this.eSd.remove(paramMouseEvent.getButton());
    aqQ.r(paramMouseEvent.getX(), paramMouseEvent.getY(), paramMouseEvent.getButton());
    aWe localaWe = WakfuClientInstance.awy().Dg().cKV();

    return true;
  }

  public boolean e(MouseEvent paramMouseEvent)
  {
    return false;
  }

  public boolean a(MouseWheelEvent paramMouseWheelEvent)
  {
    if (!ceb.cgG().cgF()) {
      cKV().D(paramMouseWheelEvent.getWheelRotation() * 0.1F);
    }
    return false;
  }

  public boolean i(MouseEvent paramMouseEvent)
  {
    super.i(paramMouseEvent);
    if (!this.eSa) {
      return false;
    }
    int i = paramMouseEvent.getX() - this.eSb;
    int j = paramMouseEvent.getY() - this.eSc;
    if (i * i + j * j < 200)
      return true;
    aqQ.bn(paramMouseEvent.getX(), paramMouseEvent.getY());
    return false;
  }

  public boolean j(MouseEvent paramMouseEvent)
  {
    super.j(paramMouseEvent);
    bR(paramMouseEvent.getX(), paramMouseEvent.getY());
    return false;
  }

  private boolean biT() {
    return !this.eSd.isEmpty();
  }

  private void bR(int paramInt1, int paramInt2) {
    this.eSf = bS(paramInt1, paramInt2);

    if (!biT()) {
      if (this.eRZ) {
        aqQ.bm(paramInt1, paramInt2);
      }
    }
    else if (this.eSa)
      aqQ.bn(paramInt1, paramInt2);
  }

  public dCb bS(int paramInt1, int paramInt2)
  {
    this.aDd.clear();

    float f1 = cW(paramInt1);
    float f2 = cX(paramInt2);

    byz localbyz = byv.bFN().bFO();
    int i = localbyz == null ? -1 : localbyz.aeR();

    ArrayList localArrayList = bQK.bXG().ao(f1, f2);
    for (Object localObject1 = localArrayList.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (cUo)((Iterator)localObject1).next();
      if (localObject2 != null) {
        int j = ((cUo)localObject2).aeR() == i ? 1 : 0;
        if ((j != 0) && (((cUo)localObject2).apP())) {
          this.aDd.add(localObject2);
        }
      }
    }

    localObject1 = (ob)bVl.caZ().ap(f1, f2);
    if (localObject1 != null) {
      this.aDd.add(localObject1);
    }
    Object localObject2 = dps.cXa().ap(f1, f2);
    if ((localObject2 != null) && ((localObject2 instanceof dCb))) {
      this.aDd.add((dCb)localObject2);
    }

    if (i == -1) {
      localObject3 = (azX)acL.apd().ap(f1, f2);
      if (localObject3 != null) {
        this.aDd.add(localObject3);
      }
    }

    Collections.sort(this.aDd, eSg);

    Object localObject3 = null;
    if (!this.aDd.isEmpty()) {
      localObject3 = (dCb)this.aDd.get(0);
    }
    bQK.bXG().g((dCb)localObject3);
    acL.apd().g((dCb)localObject3);
    bVl.caZ().g((dCb)localObject3);
    dps.cXa().g((dCb)localObject3);
    if ((localObject3 != null) && (((dCb)localObject3).apP())) {
      ((dCb)localObject3).setSelected(true);
    }

    return localObject3;
  }

  public ArrayList bT(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList1 = new ArrayList();

    float f1 = cW(paramInt1);
    float f2 = cX(paramInt2);

    int i = 0;
    if (byv.bFN().bFO() != null) {
      i = byv.bFN().bFO().aeQ() != null ? 1 : 0;
    }
    ArrayList localArrayList2 = bQK.bXG().ao(f1, f2);
    if (localArrayList2 != null) {
      localArrayList1.addAll(localArrayList2);
    }

    if (i == 0) {
      ArrayList localArrayList3 = bVl.caZ().ao(f1, f2);
      if (localArrayList3 != null) {
        localArrayList1.addAll(localArrayList3);
      }
      ArrayList localArrayList4 = acL.apd().ao(f1, f2);
      if (localArrayList4 != null) {
        localArrayList1.addAll(localArrayList4);
      }
      ArrayList localArrayList5 = dmM.cUe().ar(f1, f2);
      if (localArrayList5 != null) {
        localArrayList1.addAll(localArrayList5);
      }
    }
    Collections.sort(localArrayList1, eSg);

    return localArrayList1;
  }

  public boolean a(FocusEvent paramFocusEvent)
  {
    return false;
  }

  public boolean b(FocusEvent paramFocusEvent)
  {
    return false;
  }

  public void a(ZF paramZF)
  {
    this.eRW.push(paramZF);
  }

  public void biU()
  {
    while (!this.eRW.empty()) {
      ZF localZF = (ZF)this.eRW.pop();
      localZF.update();
    }
  }

  public dCb biV()
  {
    return this.eSf;
  }

  public boolean isKeyDown(int paramInt) {
    if ((!bB) && (!v((char)paramInt))) throw new AssertionError();
    return this.eSe[paramInt];
  }

  public boolean isButtonDown(int paramInt) {
    return this.eSd.contains(paramInt);
  }

  public void dZ(boolean paramBoolean) {
    this.eSa = paramBoolean;
  }

  protected void ea(boolean paramBoolean)
  {
    super.ea(paramBoolean);
    dO.hI().l(paramBoolean);
  }

  protected cXf a(xn paramxn, float paramFloat1, float paramFloat2)
  {
    aTL localaTL = new aTL(this.fGS, paramFloat1, paramFloat2);
    localaTL.kKn = paramxn;
    return localaTL;
  }

  protected void bhD()
  {
    super.bhD();
    um.bhU.clear();
  }
}