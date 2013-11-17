import com.sun.opengl.util.Screenshot;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import org.apache.log4j.Logger;

public class bAU
  implements FocusListener, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, GLEventListener
{
  public static final long grf = 2L;
  public static final long grg = 20L;
  protected static final Logger K = Logger.getLogger(bAU.class);
  private static final boolean grh = cwl.ctO() == cwl.ihJ;

  public static final Color gri = Color.BLACK;

  private float grj = 0.0F;
  private float grk = 0.0F;
  private float grl = 0.0F;
  private float grm = 0.0F;

  private final Object grn = new Object();
  private final ArrayList gcw = new ArrayList();

  private final Object gro = new Object();
  private final ArrayList grp = new ArrayList();
  private GL dzZ;
  private final ArrayList grq;
  private final ArrayList grr;
  private final ArrayList grs;
  private final ArrayList grt;
  private final ArrayList gru;
  private final HashMap grv = new HashMap();
  private static final boolean grw = false;
  private static final boolean grx = false;
  private boolean gry;
  private boolean grz = true;
  private boolean grA = !this.grz;

  private long grB = System.nanoTime();
  private int grC;
  private final float[] grD = new float['´'];

  private boolean grE = false;
  private dTc grF;
  private int grG = 0;
  private int grH = 0;

  private ArrayList grI = null;
  private boolean bIx;
  private boolean grJ = false;
  private boolean grK = false;
  private boolean grL = false;

  private vZ grM = null;

  public bAU()
  {
    a(gri);

    this.grq = new ArrayList();
    this.grr = new ArrayList();
    this.grs = new ArrayList();

    this.gry = true;
    this.grA = true;

    this.gru = new ArrayList();
    this.grt = new ArrayList();
  }

  public void x(float[] paramArrayOfFloat)
  {
    this.grj = paramArrayOfFloat[0];
    this.grk = paramArrayOfFloat[1];
    this.grl = paramArrayOfFloat[2];
    this.grm = paramArrayOfFloat[3];
  }

  public void a(Color paramColor)
  {
    this.grj = (paramColor.getRed() / 255.0F);
    this.grk = (paramColor.getGreen() / 255.0F);
    this.grl = (paramColor.getBlue() / 255.0F);
    this.grm = (paramColor.getAlpha() / 255.0F);
  }

  public GL bJA() {
    return this.dzZ;
  }

  public void fJ(boolean paramBoolean) {
    this.grJ = paramBoolean;
  }

  public void fK(boolean paramBoolean) {
    this.grK = paramBoolean;
  }

  public boolean bJB() {
    return this.grL;
  }

  public void fL(boolean paramBoolean) {
    this.grL = paramBoolean;
  }

  public int bJC()
  {
    return this.grH;
  }

  public int bJD()
  {
    return this.grG;
  }

  private void a(GLAutoDrawable paramGLAutoDrawable, boolean paramBoolean) {
    if ((!bB) && (this.dzZ == null)) throw new AssertionError("Unable to call enableVSync if m_gl is not initialised! Did you call it before Renderer::Init ?");
    if (this.grA == paramBoolean) {
      return;
    }
    this.grA = paramBoolean;

    if (this.grA) {
      paramGLAutoDrawable.setAutoSwapBufferMode(true);
      this.dzZ.setSwapInterval(1);
    } else {
      paramGLAutoDrawable.setAutoSwapBufferMode(false);
      this.dzZ.setSwapInterval(0);
    }
    for (akF localakF : this.gru)
      localakF.co(paramBoolean);
  }

  public void fM(boolean paramBoolean)
  {
    this.grz = paramBoolean;
    this.grA = (!this.grz);
  }

  public final boolean bJE() {
    return this.grA;
  }

  public void a(Uq paramUq, boolean paramBoolean)
  {
    synchronized (this.grn) {
      synchronized (this.gro) {
        if (!this.gcw.contains(paramUq))
          if (!paramBoolean) {
            this.gcw.add(0, paramUq);
            this.grp.add(0, paramUq);
          } else {
            this.gcw.add(paramUq);
            this.grp.add(paramUq);
          }
      }
    }
  }

  public void a(Uq paramUq1, Uq paramUq2, boolean paramBoolean)
  {
    synchronized (this.grn) {
      synchronized (this.gro) {
        if (this.gcw.contains(paramUq1)) {
          return;
        }
        int i = this.gcw.indexOf(paramUq2);
        if (i == -1) {
          i = 0;
        }
        else if (paramBoolean) {
          i++;
        }

        int j = this.grp.indexOf(paramUq2);
        if (j == -1) {
          j = 0;
        }
        else if (paramBoolean) {
          j++;
        }

        this.gcw.add(i, paramUq1);
        this.grp.add(j, paramUq1);
      }
    }
  }

  public void a(Uq paramUq)
  {
    this.gcw.remove(paramUq);
  }

  public void a(cSa paramcSa)
  {
    if (!this.grt.contains(paramcSa))
      this.grt.add(paramcSa);
  }

  public void b(cSa paramcSa)
  {
    this.grt.remove(paramcSa);
  }

  public void a(akF paramakF)
  {
    if (!this.gru.contains(paramakF))
      this.gru.add(paramakF);
  }

  public void b(akF paramakF)
  {
    this.gru.remove(paramakF);
  }

  public void init(GLAutoDrawable paramGLAutoDrawable) {
    K.info("Renderer.init started");

    this.dzZ = paramGLAutoDrawable.getGL();
    ayc localayc = dHL.lSB.dhZ();
    localayc.e(this.dzZ);

    aWE.g(this.dzZ);
    aWE.a(this.dzZ, this.grv);

    aWE.bmm().f(this.dzZ);

    int i = 1;
    int j = 3;
    if (aWE.bmm().cc(1, 3)) {
      if (this.grM != null) {
        localObject = aWE.bmm().bmn();
        this.grM.a(this, new bwL(1, 3, ((ckm)localObject).getMajor(), ((ckm)localObject).getMinor()));
      }
      return;
    }
    this.grM = null;

    Object localObject = dsZ.cZe();
    ((dsZ)localObject).cZf();

    this.dzZ.glClearColor(this.grj, this.grk, this.grl, this.grm);
    ajQ.axf().c(this.dzZ);

    ((dsZ)localObject).a(this.dzZ, 0, 0, paramGLAutoDrawable.getWidth(), paramGLAutoDrawable.getHeight());

    paramGLAutoDrawable.setSize(paramGLAutoDrawable.getWidth(), paramGLAutoDrawable.getHeight());

    this.dzZ.glTexParameterf(3553, 10242, 33071.0F);
    this.dzZ.glTexParameterf(3553, 10243, 33071.0F);
    this.dzZ.glTexParameterf(3553, 10240, 9729.0F);
    this.dzZ.glTexParameterf(3553, 10241, 9728.0F);

    this.dzZ.glHint(3152, 4354);
    this.dzZ.glHint(34031, 4354);
    this.dzZ.glHint(33170, 4354);

    this.dzZ.glDisable(2896);
    ((dsZ)localObject).kt(false);
    ((dsZ)localObject).kv(false);
    ((dsZ)localObject).kw(false);

    this.dzZ.glAlphaFunc(517, 0.0F);
    this.dzZ.glEnable(3008);

    this.dzZ.glDisable(2884);
    ((dsZ)localObject).kp(false);
    this.dzZ.glShadeModel(7425);
    this.dzZ.glPixelZoom(1.0F, 1.0F);

    ((dsZ)localObject).ks(true);

    this.dzZ.glIndexMask(0);

    this.dzZ.glDisable(3024);

    if (this.gry)
      this.dzZ.glDrawBuffer(1029);
    else {
      this.dzZ.glDrawBuffer(1028);
    }

    a(paramGLAutoDrawable, this.grz);

    ((dsZ)localObject).x(localayc);

    for (cSa localcSa : this.grt) {
      localcSa.c(paramGLAutoDrawable);
    }

    this.bIx = true;
    K.info("Renderer.init ended");
  }

  public final HashMap bJF() {
    return this.grv;
  }

  public void display(GLAutoDrawable paramGLAutoDrawable)
  {
    long l1;
    float f1;
    if ((this.grJ) || (this.grK)) {
      l1 = System.nanoTime();
      f1 = (float)(l1 - this.grB) / 1000000.0F;
      long l2 = this.grJ ? 500L : 50L;
      l2 = ()((float)l2 - f1);

      if (l2 > 1L) {
        try {
          Thread.sleep(l2);
        } catch (InterruptedException localInterruptedException) {
          K.error("Exception", localInterruptedException);
        }
      }
    }

    if (this.bIx)
      try
      {
        l1 = System.nanoTime();
        f1 = (float)(l1 - this.grB) / 1000000.0F;

        int i = this.grD.length;
        this.grD[(++this.grC % i)] = f1;

        float f2 = 0.0F;
        for (int j = 0; j < i; j++) {
          f2 += this.grD[j];
        }
        float f3 = f2 / i;

        float f4 = f1 / f3;
        int k;
        if (f4 <= 2.0F)
          k = (int)f1;
        else {
          k = (int)f1 / 2;
        }

        this.grB = l1;

        if (bJB()) {
          f1 = k = 0;
        }

        if (this.grt != null) {
          int m = 0; for (int n = this.grt.size(); m < n; m++) {
            ((cSa)this.grt.get(m)).b(paramGLAutoDrawable);
          }
        }

        ayc localayc = dHL.lSB.dhZ();
        int i2;
        synchronized (this.grn) {
          a(paramGLAutoDrawable, this.grz);

          synchronized (this.gro) {
            localObject1 = paramGLAutoDrawable.getWidth();
            localObject1 += localObject1 % 2;
            i2 = paramGLAutoDrawable.getHeight();
            i2 += i2 % 2;
            int i3 = 0; for (int i4 = this.grp.size(); i3 < i4; i3++) {
              Uq localUq = (Uq)this.grp.get(i3);
              localUq.init(paramGLAutoDrawable);
              localUq.W(localObject1, i2);
            }
            this.grp.clear();
          }

          btS.a("process", 0.0F, 0.2F, 0.2F);
          ??? = 0; for (Object localObject1 = this.gcw.size(); ??? < localObject1; ???++) {
            ((Uq)this.gcw.get(???)).cz(k);
          }
          btS.end();
          bOE.bVz().update(k);
          aHl.eeV.update(k);
          tq.Bg().b(dHL.lSB.dhZ());
        }

        synchronized (this.grn) {
          ??? = dsZ.cZe();
          if (this.grI != null) {
            bJG();
          }
          ((dsZ)???).kw(false);
          ((dsZ)???).kv(false);
          ((dsZ)???).x(localayc);
          if (!Pb.aaU().j(localayc)) {
            ajQ.axf().c(this.dzZ);
          }

          btS.a("display", 0.0F, 0.9F, 0.9F);

          int i1 = 0; for (i2 = this.gcw.size(); i1 < i2; i1++) {
            ((Uq)this.gcw.get(i1)).a(this.dzZ);
          }
          btS.end();

          tq.Bg().Bj();
          dbP.cNw().a(localayc);

          btS.a(localayc);
          btS.bCd();
          if (this.grE) {
            HE();
          }
          if ((this.gry) && (!this.grA)) {
            paramGLAutoDrawable.swapBuffers();
          }

          bAw.bIJ().rY();
        }
      } catch (Throwable localThrowable) {
        K.error("Throwable dans le process du renderer : ", localThrowable);
        if (localThrowable.getCause() != null)
          K.error("Reason : ", localThrowable.getCause());
      }
  }

  private void bJG()
  {
    if (this.grI.size() <= 0) {
      return;
    }

    if (!((chT)this.grI.get(0)).cjD()) {
      this.grI.remove(0);

      if (this.grI.size() == 0)
        this.grI = null;
    }
  }

  public boolean a(dTc paramdTc)
  {
    if ((this.grE) || (this.grF != null)) {
      return false;
    }

    this.grE = true;
    this.grF = paramdTc;
    return true;
  }

  private void HE()
  {
    if ((!this.grE) || (this.grF == null)) {
      return;
    }

    File localFile = this.grF.bEU();
    try
    {
      Screenshot.writeToFile(localFile, this.grG, this.grH);
      this.grF.bEV();
    } catch (Exception localException) {
      this.grF.c(localException);
      K.error(localException.getMessage() + " Impossible d'enregistrer un ScreenShot dans " + localFile.getAbsolutePath());
    } finally {
      this.grE = false;
      this.grF = null;
    }
  }

  public void reshape(GLAutoDrawable paramGLAutoDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt4 += paramInt4 % 2;
    paramInt3 += paramInt3 % 2;
    if ((this.grG == paramInt3) && (this.grH == paramInt4)) {
      return;
    }
    this.grG = paramInt3;
    this.grH = paramInt4;
    Object localObject;
    if ((paramGLAutoDrawable.getWidth() != 0) && (paramGLAutoDrawable.getHeight() != 0)) {
      for (localIterator = this.gcw.iterator(); localIterator.hasNext(); ) { localObject = (Uq)localIterator.next();
        ((Uq)localObject).W(paramInt3, paramInt4);
      }

      dHL.lSB.dhZ().dh(paramInt3, paramInt4);
      Pb.aaU().ai(paramInt3, paramInt4);
    }

    for (Iterator localIterator = this.grt.iterator(); localIterator.hasNext(); ) { localObject = (cSa)localIterator.next();
      ((cSa)localObject).a(paramGLAutoDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }

  public void displayChanged(GLAutoDrawable paramGLAutoDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
    for (cSa localcSa : this.grt)
      localcSa.a(paramGLAutoDrawable, paramBoolean1, paramBoolean2);
  }

  public void keyTyped(KeyEvent paramKeyEvent)
  {
    try {
      for (apZ localapZ : this.grr)
        if (localapZ.d(paramKeyEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void keyReleased(KeyEvent paramKeyEvent) {
    try {
      for (apZ localapZ : this.grr)
        if (localapZ.b(paramKeyEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void keyPressed(KeyEvent paramKeyEvent) {
    try {
      for (apZ localapZ : this.grr)
        if (localapZ.c(paramKeyEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void a(apZ paramapZ, boolean paramBoolean) {
    if (!this.grr.contains(paramapZ))
      if (!paramBoolean)
        this.grr.add(paramapZ);
      else
        this.grr.add(0, paramapZ);
  }

  public void a(apZ paramapZ)
  {
    this.grr.remove(paramapZ);
  }

  private MouseEvent k(MouseEvent paramMouseEvent) {
    if ((grh) && 
      (paramMouseEvent.getButton() == 1) && (paramMouseEvent.isControlDown())) {
      int i = paramMouseEvent.getModifiersEx() ^ 0x80;
      return new MouseEvent(paramMouseEvent.getComponent(), paramMouseEvent.getID(), paramMouseEvent.getWhen(), i, paramMouseEvent.getX(), paramMouseEvent.getY(), paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), 3);
    }

    return paramMouseEvent;
  }

  public void mouseClicked(MouseEvent paramMouseEvent) {
    try {
      paramMouseEvent = k(paramMouseEvent);
      for (dbH localdbH : this.grq)
        if (localdbH.e(paramMouseEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void mousePressed(MouseEvent paramMouseEvent) {
    try {
      paramMouseEvent = k(paramMouseEvent);
      for (dbH localdbH : this.grq)
        if (localdbH.mousePressed(paramMouseEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void mouseReleased(MouseEvent paramMouseEvent) {
    try {
      paramMouseEvent = k(paramMouseEvent);
      for (dbH localdbH : this.grq)
        if (localdbH.f(paramMouseEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void mouseEntered(MouseEvent paramMouseEvent) {
    try {
      for (dbH localdbH : this.grq)
        if (localdbH.g(paramMouseEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void mouseExited(MouseEvent paramMouseEvent) {
    try {
      for (dbH localdbH : this.grq)
        if (localdbH.h(paramMouseEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void mouseDragged(MouseEvent paramMouseEvent) {
    try {
      paramMouseEvent = k(paramMouseEvent);
      for (dbH localdbH : this.grq)
        if (localdbH.i(paramMouseEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void mouseMoved(MouseEvent paramMouseEvent) {
    try {
      for (dbH localdbH : this.grq)
        if (localdbH.j(paramMouseEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    try {
      for (dbH localdbH : this.grq)
        if (localdbH.a(paramMouseWheelEvent))
          break;
    }
    catch (Throwable localThrowable)
    {
      K.error("Erreur : ", localThrowable);
    }
  }

  public void a(dbH paramdbH, boolean paramBoolean) {
    if (!this.grq.contains(paramdbH))
      if (!paramBoolean)
        this.grq.add(paramdbH);
      else
        this.grq.add(0, paramdbH);
  }

  public void a(dbH paramdbH)
  {
    this.grq.remove(paramdbH);
  }

  public boolean bJH() {
    return this.grA;
  }

  public void fN(boolean paramBoolean) {
    this.grA = paramBoolean;
  }

  public boolean bJI() {
    return this.gry;
  }

  public void fO(boolean paramBoolean) {
    this.gry = paramBoolean;
  }

  public void a(vZ paramvZ) {
    this.grM = paramvZ;
  }

  public void a(dDJ paramdDJ, boolean paramBoolean) {
    if (!this.grs.contains(paramdDJ))
      if (!paramBoolean)
        this.grs.add(paramdDJ);
      else
        this.grs.add(0, paramdDJ);
  }

  public void a(dDJ paramdDJ)
  {
    this.grs.remove(paramdDJ);
  }

  public void focusGained(FocusEvent paramFocusEvent) {
    for (dDJ localdDJ : this.grs)
      if (localdDJ.a(paramFocusEvent))
        break;
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    for (dDJ localdDJ : this.grs)
      if (localdDJ.b(paramFocusEvent))
        break;
  }

  public void a(chT paramchT)
  {
    if (this.grI == null) {
      this.grI = new ArrayList();
    }
    this.grI.add(paramchT);
  }
}