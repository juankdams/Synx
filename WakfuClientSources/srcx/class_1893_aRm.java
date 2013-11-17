import com.ankamagames.baseImpl.graphics.alea.display.RenderTree;
import com.ankamagames.baseImpl.graphics.alea.display.RenderTree.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aRm extends cXf
{
  private static final Logger K = Logger.getLogger(aRm.class);

  private short az = -1;
  private boolean eOn = true;
  private dSz eOo;

  private aRm(xn paramxn, float paramFloat1, float paramFloat2)
  {
    super(paramxn, null, paramFloat1, paramFloat2);
    iO(false);
  }

  public aRm(float paramFloat1, float paramFloat2) {
    super((xn)RenderTree.lNX.bQx(), btb.bBc(), paramFloat1, paramFloat2);
    iO(false);
  }

  private cSF bhC() {
    return (cSF)this.cUq;
  }

  protected cuA apI()
  {
    return new cSF(this, null);
  }

  public boolean e(MouseEvent paramMouseEvent)
  {
    return false;
  }

  public boolean mousePressed(MouseEvent paramMouseEvent)
  {
    return false;
  }

  public boolean f(MouseEvent paramMouseEvent)
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

  public boolean i(MouseEvent paramMouseEvent)
  {
    return false;
  }

  public boolean a(MouseWheelEvent paramMouseWheelEvent)
  {
    return false;
  }

  public boolean d(KeyEvent paramKeyEvent)
  {
    return false;
  }

  public boolean c(KeyEvent paramKeyEvent)
  {
    return false;
  }

  public boolean b(KeyEvent paramKeyEvent)
  {
    return false;
  }

  public boolean a(FocusEvent paramFocusEvent)
  {
    return false;
  }

  public boolean b(FocusEvent paramFocusEvent)
  {
    return false;
  }

  protected void bhD()
  {
  }

  public void cz(int paramInt)
  {
    if (!zm(paramInt)) {
      return;
    }
    nI(paramInt);

    dQ(true);

    zl(paramInt);

    this.kKn.clear();
    cKZ();

    this.cUm.clear();
    this.cUn.clear();
  }

  protected void g(Entity paramEntity)
  {
    this.kKn.b(paramEntity);
  }

  protected void nH(int paramInt)
  {
    throw new UnsupportedOperationException("pas de light sur les map de décor de fond");
  }

  public void dQ(boolean paramBoolean)
  {
    this.kKo.a(this.cUq.csU());
  }

  protected void I(float paramFloat1, float paramFloat2)
  {
    this.kKo.f(this);
  }

  public boolean bhE()
  {
    return (!bhF()) || (this.kKo.gI());
  }

  public void reset() {
    a((short)-1, 0.0F, 0.0F, 0.0F);
  }

  public void a(short paramShort, float paramFloat) {
    a(paramShort, paramFloat, paramFloat, 1.0F);
  }

  public void a(short paramShort, float paramFloat1, float paramFloat2) {
    a(paramShort, paramFloat1, paramFloat1, paramFloat2);
  }

  public void a(short paramShort, float paramFloat1, float paramFloat2, float paramFloat3) {
    dY(true);
    this.eOo.b(this);
    this.az = paramShort;
    if (bhF()) {
      aWe localaWe = this.eOo.cKV();
      bhC().a(localaWe, paramFloat1, paramFloat2, paramFloat3);

      this.kKo.a(bOh.cN(paramShort));
      this.kKo.qL(paramShort);
      iO(true);
      ax(true);

      this.eOo.a(this);
    }
  }

  public void a(dsO paramdsO) {
    this.eOn = paramdsO.lvd;
    a(paramdsO.az, paramdsO.lve, paramdsO.lvf, paramdsO.dka);
  }

  public boolean bhF() {
    return this.az != -1;
  }

  public void a(dSz paramdSz) {
    this.eOo = paramdSz;
  }

  public boolean bhG() {
    return this.eOn;
  }

  private void nI(int paramInt) {
    if (this.eOo == null) {
      return;
    }
    aWe localaWe = this.eOo.cKV();
    bhC().a(localaWe, this.eOn, paramInt);
  }

  protected cXf a(xn paramxn, float paramFloat1, float paramFloat2)
  {
    return new aRm(paramxn, paramFloat1, paramFloat2);
  }
}