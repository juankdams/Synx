import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil;
import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil.ObjectFactory;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.ankamagames.framework.kernel.core.maths.Matrix44.ObjectFactory;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.HashSet;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import org.apache.log4j.Logger;

public abstract class cXf extends adG
  implements apZ, dDJ, dbH
{
  private static final Logger K = Logger.getLogger(cXf.class);
  public static final String ftf = "contents/gfx";
  public static final String kKd = "contents/sounds";
  protected String ftj = "contents/gfx";
  protected String kKe = "contents/sounds";
  private int dyx;
  private int dyy;
  private static float kKf = 1.1F;
  protected static float kKg = 1.4F;

  private float kKh = kKf;
  private float kKi = kKg;

  protected final ArrayList kKj = new ArrayList();
  private boolean kKk;
  private final cYk kKl = new cYk(-2147483648, -2147483648, (short)-32768);

  private final Matrix44 kKm = Matrix44.bFc.arE();
  protected xn kKn;
  protected final btb kKo;
  protected boolean kKp;
  private boolean fuh;
  private boolean kKq;
  protected final bNa iIf = new bNa();
  protected boolean kKr;
  private final Matrix44 kKs = (Matrix44)Matrix44.bFc.bQx();
  private final aIn kKt = new aIn();
  private tF kKu;
  private boolean kKv;
  final aLr kKw = new aLr();
  final aLr kKx = new aLr();

  public cXf(float paramFloat1, float paramFloat2)
  {
    this(null, btb.bBd(), paramFloat1, paramFloat2);
    cLd();
  }

  protected cXf(xn paramxn, btb parambtb, float paramFloat1, float paramFloat2) {
    super(paramFloat1, paramFloat2);
    a(ayj.aJY());
    a(bQK.bXG());
    a(cWS.cKD());
    a(dbL.cNv());
    a(cnj.cnO());
    a(dbI.cNt());
    this.kKn = paramxn;
    this.kKo = parambtb;
  }

  protected cuA apI()
  {
    return new as(this, this, this.cUh, this.cUi);
  }

  public final aWe cKV()
  {
    return (aWe)super.apF();
  }

  public void iO(boolean paramBoolean) {
    this.kKk = paramBoolean;
  }

  public void ik(String paramString) {
    this.ftj = paramString;
    bfH.bsR().ik(paramString);
  }

  public void oD(String paramString)
  {
    cui.csF().setFile(paramString);
    cui.csF().load();
  }

  public int aCX() {
    return this.dyx;
  }

  public int aCY() {
    return this.dyy;
  }

  public void a(cFh paramcFh)
  {
    this.kKj.add(paramcFh);
  }

  public void b(cFh paramcFh)
  {
    this.kKj.remove(paramcFh);
  }

  public void uninitialize()
  {
    dY(true);
    super.uninitialize();
  }

  public void cKW() {
    HashSet localHashSet = new HashSet();
    this.kKn.a(localHashSet);

    for (Entity localEntity : localHashSet)
      localEntity.gQ();
  }

  public void bxI()
  {
    HashSet localHashSet = new HashSet();
    this.kKn.a(localHashSet);
    for (Entity localEntity : localHashSet) {
      localEntity.axl();
    }
    this.kKn.clear();
    super.uninitialize();
  }

  public void dY(boolean paramBoolean)
  {
    this.kKm.Ls();
    ax(false);
    l(bNa.gRy);

    this.kKn.clear();
    bhD();
    this.kKo.clear();

    iO(true);
    this.cUm.clear();
    this.cUn.clear();

    this.kKp = false;
    synchronized (this.kKw) {
      this.kKw.reset();
    }
  }

  protected void bhD() {
    bGT.bOB().clear();

    bQK.bXG().bXI();

    cWS.cKD().cKF();

    dbI.cNt().clear();

    btL.gcv.reset();

    cOj.kwA.clear();
    Pb.aaU().abb();
  }

  public void init(GLAutoDrawable paramGLAutoDrawable)
  {
    this.fuh = true;
    super.init(paramGLAutoDrawable);

    cKX();
  }

  public void W(int paramInt1, int paramInt2)
  {
    if ((this.bIv != paramInt1) || (this.bIw != paramInt2)) {
      super.W(paramInt1, paramInt2);
    }
    this.cUq.dL(paramInt1, paramInt2);
  }

  public void cKX() {
    if (this.cUq != null)
      this.kKp = false;
  }

  public void apH()
  {
    super.apH();
    this.kKp = false;
  }

  private void cKY() {
    this.kKn.clear();

    int i = this.cUp.size();
    for (int j = 0; j < i; j++) {
      this.kKn.a((Entity)this.cUp.get(j), 0);
    }

    if ((this.kKn instanceof RenderTreeStencil))
      dES.lNR.c((RenderTreeStencil)this.kKn);
  }

  public void cz(int paramInt)
  {
    if (!zm(paramInt)) {
      return;
    }
    super.cz(paramInt);

    aWe localaWe = cKV();
    localaWe.cz(paramInt);

    int i = (int)Math.floor(localaWe.xV());
    int j = (int)Math.floor(localaWe.xW());

    bOh.N(i, j, 2);

    int k = this.kKj.size();
    for (int m = 0; m < k; m++) {
      ((cFh)this.kKj.get(m)).a(this, paramInt);
    }

    dQ(this.kKk);

    zl(paramInt);
    nH(paramInt);

    cKZ();
    cKY();
    cLa();

    for (m = 0; m < this.cUn.size(); m++) {
      this.kKn.b((Entity)this.cUn.get(m));
    }

    this.cUm.clear();
    this.cUn.clear();

    Pb.aaU().update(paramInt);
  }

  protected final void cKZ() {
    this.cUo.rH();
    int i = Math.min(this.cUm.size(), 32766);
    for (int j = 0; j < i; j++) {
      Entity localEntity1 = (Entity)this.cUm.get(j);
      if (localEntity1.bpu() >= 0) {
        long l = localEntity1.mnP;
        dLw.kH(l);
        this.cUo.add((l << 15) + j);
      }
    }
    this.cUo.sort();
    this.cUp.clear();
    j = this.cUo.size();
    for (int k = 0; k < j; k++) {
      int m = (int)(this.cUo.uD(k) & 0x7FFF);
      if ((!bB) && (m < 0)) throw new AssertionError();
      Entity localEntity2 = (Entity)this.cUm.get(m);
      g(localEntity2);
    }
  }

  protected void g(Entity paramEntity) {
    this.cUp.add(paramEntity);
  }

  protected final void zl(int paramInt) {
    this.kKo.b(this, paramInt);

    I(this.cUq.xV(), this.cUq.xW());
  }

  protected final boolean zm(int paramInt)
  {
    if (!isInitialized()) {
      this.cUp.clear();
      return false;
    }

    if (this.cUq == null) {
      return false;
    }

    if (IH.Sd().Se()) {
      return false;
    }
    if (IH.Sd().Sg()) {
      this.cUq.cz(paramInt);
      dQ(this.kKk);
      return false;
    }
    return true;
  }

  protected void nH(int paramInt) {
    btL.gcv.c(this, paramInt);
  }

  private void cLa() {
    bBx localbBx = bBx.bKI();
    localbBx.reset();

    ayc localayc = dHL.lSB.dhZ();
    v(localayc);

    localbBx.H(this.cUp);
    localbBx.a(localayc.bZj(), this.cUq);
    localbBx.e(this);
  }

  protected final void o(GL paramGL) {
    ayc localayc = dHL.lSB.dhZ();
    localayc.dNI.qH(0);
    dsZ localdsZ = dsZ.cZe();

    localdsZ.kp(true);
    localdsZ.dk(1.0F);

    localdsZ.a(paramGL, aLv.epO, Matrix44.bFe);
    localdsZ.a(paramGL, MG());

    v(localayc);

    dsZ.cZe().reset();
    Pb.aaU().aaX();
  }

  private void v(bSr parambSr) {
    if (!IH.Sd().Se()) {
      cuA localcuA = apE();
      float f1 = localcuA.csO();
      float f2 = -localcuA.yf() * f1;
      float f3 = -localcuA.yg() * f1;

      this.kKm.Ls();
      if (this.kKq) {
        this.kKm.c(-f1, f1, 1.0F);
        this.kKm.b(-f2, f3, 0.0F);
      } else {
        this.kKm.c(f1, f1, 1.0F);
        this.kKm.b(f2, f3, 0.0F);
      }
      this.kKt.a(cEi.ixM, localcuA.yh());
      this.kKs.a(this.kKt);
      this.kKm.c(this.kKs);
    }
    parambSr.g(this.kKm);
  }

  protected void a(ayc paramayc)
  {
    v(paramayc);
  }

  public void a(GL paramGL)
  {
    if (!this.fuh) {
      return;
    }

    ayc localayc = dHL.lSB.dhZ();
    o(paramGL);

    a(localayc);
    b(localayc);

    if (cLf())
      dLV.fl((int)this.cUq.xV(), (int)this.cUq.xW());
  }

  protected void b(ayc paramayc)
  {
    Pb.aaU().a(this.kKn, paramayc);
  }

  private void c(aWe paramaWe)
  {
    boolean bool = d(paramaWe);
    if (this.kKv == bool) {
      return;
    }
    ea(bool);
    this.kKv = bool;
  }

  protected void ea(boolean paramBoolean)
  {
  }

  private boolean d(aWe paramaWe)
  {
    if (paramaWe.isLocked()) {
      return this.kKv;
    }
    int i = paramaWe.fa();
    int j = paramaWe.fb();
    int k = 0;
    if (apG() != null) {
      k = (int)Math.ceil(apG().getAltitude() + 0.5F);
    }

    if ((this.kKl.Z(i, j, k)) && (this.kKo.bBk())) {
      return this.kKv;
    }
    this.kKl.ac(i, j, (short)k);

    DisplayedScreenElement localDisplayedScreenElement = aWe.c(this.kKo, i, j, k);

    if (localDisplayedScreenElement == null) {
      paramaWe.blZ();
      return false;
    }

    int m = localDisplayedScreenElement.fa();
    int n = localDisplayedScreenElement.fb();
    int i1 = localDisplayedScreenElement.OV();
    paramaWe.cb(i1, localDisplayedScreenElement.RV());

    boolean bool = false;
    if (i1 == 0)
    {
      bool = false;
    }
    else {
      if ((this.kKu == null) || (!this.kKu.BV().p(m, n))) {
        this.kKu = cwO.dV(m, n);
      }
      if (this.kKu == null) {
        K.error("pas de map topologique aux coordonnées " + m + " " + n);
        return this.kKv;
      }
      int i2 = localDisplayedScreenElement.fc();
      bool = this.kKu.f(m, n, i2);
    }
    return bool;
  }

  public void dQ(boolean paramBoolean)
  {
    aWe localaWe = cKV();

    if (!this.kKp) {
      this.kKp = true;
    }

    this.kKk = false;
    c(localaWe);

    this.kKo.a(localaWe.csU());
  }

  protected void I(float paramFloat1, float paramFloat2)
  {
    int i = this.kKj.size();
    for (int j = 0; j < i; j++) {
      ((cFh)this.kKj.get(j)).b(this, paramFloat1, paramFloat2);
    }

    try
    {
      this.kKo.f(this);
    }
    catch (Exception localException)
    {
    }
  }

  public ArrayList a(float paramFloat1, float paramFloat2, float paramFloat3, bYP parambYP)
  {
    return a(paramFloat1, paramFloat2, paramFloat3, parambYP, 0.0F, 0.0F);
  }

  public ArrayList a(float paramFloat1, float paramFloat2, float paramFloat3, bYP parambYP, float paramFloat4, float paramFloat5)
  {
    if (this.cUq == null) {
      return null;
    }

    int i = (int)(cW(paramFloat1) + this.cUq.getScreenX() - paramFloat4);
    int j = (int)(cX(paramFloat2) + this.cUq.getScreenY() - paramFloat5);

    ArrayList localArrayList = new ArrayList();
    this.kKo.a(i, j, localArrayList);
    int k;
    if (parambYP.cdv())
    {
      for (k = 0; k < localArrayList.size(); )
      {
        DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)localArrayList.get(k);
        float f = localDisplayedScreenElement.fis.ddL().cjI() == 0 ? 0.55F : 1.0F;
        if (a(i, j, localDisplayedScreenElement) > f)
          localArrayList.remove(k);
        else {
          k++;
        }
      }
    }

    parambYP.a(localArrayList, new abR(this, paramFloat3, i, j));
    return localArrayList;
  }

  private float a(int paramInt1, int paramInt2, DisplayedScreenElement paramDisplayedScreenElement)
  {
    int i = paramDisplayedScreenElement.fa();
    int j = paramDisplayedScreenElement.fb();
    float f1 = r(i, j);
    float f2 = g(i, j, paramDisplayedScreenElement.fc());

    float f3 = (paramInt1 - f1) / this.cUj;
    float f4 = (paramInt2 - f2) / this.cUk;
    return Math.abs(f3) + Math.abs(f4);
  }

  protected final float cW(float paramFloat)
  {
    if (this.kKq) {
      return (-paramFloat + this.bIv * 0.5F) / this.cUq.csO();
    }
    return (paramFloat - this.bIv * 0.5F) / this.cUq.csO();
  }

  protected final float cX(float paramFloat)
  {
    return (this.bIw * 0.5F - paramFloat) / this.cUq.csO();
  }

  public ArrayList ak(float paramFloat1, float paramFloat2)
  {
    if (this.cUq == null) {
      return null;
    }
    return bQK.bXG().ao(cW(paramFloat1), cX(paramFloat2));
  }

  public abstract boolean e(MouseEvent paramMouseEvent);

  public abstract boolean mousePressed(MouseEvent paramMouseEvent);

  public abstract boolean f(MouseEvent paramMouseEvent);

  public abstract boolean g(MouseEvent paramMouseEvent);

  public abstract boolean h(MouseEvent paramMouseEvent);

  public boolean i(MouseEvent paramMouseEvent)
  {
    this.dyx = paramMouseEvent.getX();
    this.dyy = paramMouseEvent.getY();
    return false;
  }

  public boolean j(MouseEvent paramMouseEvent) {
    this.dyx = paramMouseEvent.getX();
    this.dyy = paramMouseEvent.getY();
    return false;
  }

  public abstract boolean a(MouseWheelEvent paramMouseWheelEvent);

  public abstract boolean d(KeyEvent paramKeyEvent);

  public abstract boolean c(KeyEvent paramKeyEvent);

  public abstract boolean b(KeyEvent paramKeyEvent);

  public String toString()
  {
    return "zoom=" + this.cUq.csO() + ", " + super.toString();
  }

  public boolean a(aVn paramaVn, Entity paramEntity, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    synchronized (this.kKw) {
      int i = this.kKw.a(this.kKo, paramInt1, paramInt2, paramInt3);
      paramEntity.mnP = dLw.a(paramInt1, paramInt2, i, paramInt4);

      DisplayedScreenElement localDisplayedScreenElement = this.kKw.b(this.kKo, paramInt1, paramInt2, paramInt3);
      bdB.a(paramaVn, localDisplayedScreenElement);
      return localDisplayedScreenElement != null;
    }
  }

  public final int Y(int paramInt1, int paramInt2, int paramInt3) {
    synchronized (this.kKw) {
      DisplayedScreenElement localDisplayedScreenElement = this.kKw.b(this.kKo, paramInt1, paramInt2, paramInt3);
      return localDisplayedScreenElement == null ? 0 : localDisplayedScreenElement.OV();
    }
  }

  public abstract boolean a(FocusEvent paramFocusEvent);

  public abstract boolean b(FocusEvent paramFocusEvent);

  public void l(bNa parambNa) {
    if (this.iIf.get() == parambNa.get()) {
      return;
    }

    this.iIf.set(parambNa.get());
    this.kKr = true;
  }

  public boolean bhE() {
    return this.kKo.gI();
  }

  public final void cLb() {
    aWe localaWe = cKV();
    this.kKv = d(localaWe);
  }

  public btb cLc()
  {
    return this.kKo;
  }

  public final void cLd() {
    this.kKn = ((xn)RenderTreeStencil.fjI.bQx());
  }

  public final cXf cLe() {
    cz(0);
    cXf localcXf = a(this.kKn, this.cUh, this.cUi);
    localcXf.g(this);
    localcXf.cKW();
    return localcXf;
  }

  protected abstract cXf a(xn paramxn, float paramFloat1, float paramFloat2);

  protected void g(cXf paramcXf) {
    this.kKm.a(paramcXf.kKm);

    this.fuh = paramcXf.fuh;
    this.iIf.set(paramcXf.iIf.bUH());
    this.kKr = paramcXf.kKr;
    W((int)paramcXf.MH(), (int)paramcXf.MI());

    this.cUp.addAll(paramcXf.cUp);

    this.cUo.o(paramcXf.cUo.cfv());
  }

  public final void iP(boolean paramBoolean) {
    dLV.iP(paramBoolean);
  }

  public final boolean cLf() {
    return dLV.cLf();
  }
}