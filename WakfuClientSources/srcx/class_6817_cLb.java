import com.sun.opengl.impl.Debug;
import com.sun.opengl.impl.packrect.Rect;
import com.sun.opengl.impl.packrect.RectanglePacker;
import com.sun.opengl.util.FPSAnimator;
import com.sun.opengl.util.j2d.TextureRenderer;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.media.opengl.GL;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.glu.GLU;

public class cLb extends P
{
  private static final boolean DEBUG = Debug.isPropertyDefined("jogl.debug.TextRenderer");
  private static final boolean iJM = false;
  private static final boolean iJN = false;
  static final int iJO = 256;
  static final int iJP = 128;
  private static final int iJQ = 1000;
  private static final float iJR = 0.7F;
  static final int iJS = 100;
  static final int iJT = 3;
  static final int iJU = 2;
  static final int iJV = 4;
  static final int iJW = 400;
  static final int iJX = 1200;
  static final int iJY = 800;
  static final int iJZ = 4800;
  static final int iKa = 3200;
  static final int iKb = 12;
  static final int iKc = 8;
  private Font font;
  private boolean iKd;
  private boolean iKe;
  private aYE iKf;
  private boolean iKg;
  private RectanglePacker iKh;
  private boolean iKi;
  private vP iKj;
  private TextureRenderer iKk;
  private Graphics2D iKl;
  private FontRenderContext iKm;
  private Map iKn = new HashMap();
  private cBt iKo;
  private int iKp;
  private boolean iKq;
  private boolean iKr;
  private int iKs;
  private int iKt;
  private boolean iKu;
  private boolean iKv;
  private float iKw;
  private float iKx;
  private float iKy;
  private float iKz;
  private Color iKA;
  private boolean iKB;
  private Frame iKC;
  private boolean iKD;
  cCK iKE;
  private boolean iKF = true;
  private boolean iKG;
  private boolean iKH;
  private boolean iKI = true;

  private char[] iKJ = new char[1];

  public cLb(Font paramFont)
  {
    this(paramFont, false, false, null, false);
  }

  public cLb(Font paramFont, boolean paramBoolean)
  {
    this(paramFont, false, false, null, paramBoolean);
  }

  public cLb(Font paramFont, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramFont, paramBoolean1, paramBoolean2, null, false);
  }

  public cLb(Font paramFont, boolean paramBoolean1, boolean paramBoolean2, vP paramvP)
  {
    this(paramFont, paramBoolean1, paramBoolean2, paramvP, false);
  }

  public cLb(Font paramFont, boolean paramBoolean1, boolean paramBoolean2, vP paramvP, boolean paramBoolean3)
  {
    this.font = paramFont;
    this.iKd = paramBoolean1;
    this.iKe = paramBoolean2;
    this.iKg = paramBoolean3;

    this.iKh = new RectanglePacker(new cob(this), 256, 128);

    if (paramvP == null) {
      paramvP = new cOc();
    }

    this.iKj = paramvP;

    this.iKo = new cBt(this);
  }

  public Rectangle2D getBounds(String paramString)
  {
    return getBounds(paramString);
  }

  public Rectangle2D getBounds(CharSequence paramCharSequence)
  {
    Rect localRect = null;

    if ((localRect = (Rect)this.iKn.get(paramCharSequence)) != null) {
      cwN localcwN = (cwN)localRect.getUserData();

      return new Rectangle2D.Double(-localcwN.cua().x, -localcwN.cua().y, localRect.w(), localRect.h());
    }

    return b(this.iKj.getBounds(paramCharSequence, this.font, getFontRenderContext()));
  }

  public FontRenderContext getFontRenderContext()
  {
    if (this.iKm == null) {
      this.iKm = cEs().getFontRenderContext();
    }

    return this.iKm;
  }

  public void beginRendering(int paramInt1, int paramInt2)
  {
    beginRendering(paramInt1, paramInt2, true);
  }

  public void beginRendering(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(true, paramInt1, paramInt2, paramBoolean);
  }

  public void begin3DRendering()
  {
    a(false, 0, 0, false);
  }

  public void setColor(Color paramColor)
  {
    int i = (this.iKv) && (this.iKA != null) && (paramColor.equals(this.iKA)) ? 1 : 0;

    if (i == 0) {
      cEu();
    }

    cEr().setColor(paramColor);
    this.iKv = true;
    this.iKA = paramColor;
  }

  public void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = (this.iKv) && (this.iKA == null) && (paramFloat1 == this.iKw) && (paramFloat2 == this.iKx) && (paramFloat3 == this.iKy) && (paramFloat4 == this.iKz) ? 1 : 0;

    if (i == 0) {
      cEu();
    }

    cEr().setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    this.iKv = true;
    this.iKw = paramFloat1;
    this.iKx = paramFloat2;
    this.iKy = paramFloat3;
    this.iKz = paramFloat4;
    this.iKA = null;
  }

  public void draw3D(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    b(paramString, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public void flush()
  {
    cEu();
  }

  public void endRendering()
  {
    iq(true);
  }

  public void end3DRendering()
  {
    iq(false);
  }

  public void dispose()
  {
    this.iKh.dispose();
    this.iKh = null;
    this.iKk = null;
    this.iKl = null;
    this.iKm = null;

    if (this.iKC != null)
      this.iKC.dispose();
  }

  private static Rectangle2D a(Rectangle2D paramRectangle2D)
  {
    int i = (int)Math.floor(paramRectangle2D.getMinX()) - 1;
    int j = (int)Math.floor(paramRectangle2D.getMinY()) - 1;
    int k = (int)Math.ceil(paramRectangle2D.getMaxX()) + 1;
    int m = (int)Math.ceil(paramRectangle2D.getMaxY()) + 1;
    return new Rectangle2D.Double(i, j, k - i, m - j);
  }

  private Rectangle2D b(Rectangle2D paramRectangle2D)
  {
    int i = (int)Math.max(1.0D, 0.015D * this.font.getSize());

    return new Rectangle2D.Double((int)Math.floor(paramRectangle2D.getMinX() - i), (int)Math.floor(paramRectangle2D.getMinY() - i), (int)Math.ceil(paramRectangle2D.getWidth() + 2 * i), (int)Math.ceil(paramRectangle2D.getHeight()) + 2 * i);
  }

  private TextureRenderer cEr()
  {
    TextureRenderer localTextureRenderer = (TextureRenderer)this.iKh.getBackingStore();

    if (localTextureRenderer != this.iKk)
    {
      if (this.iKl != null) {
        this.iKl.dispose();
        this.iKl = null;
        this.iKm = null;
      }

      this.iKk = localTextureRenderer;
    }

    return this.iKk;
  }

  private Graphics2D cEs() {
    TextureRenderer localTextureRenderer = cEr();

    if (this.iKl == null) {
      this.iKl = localTextureRenderer.createGraphics();

      this.iKl.setComposite(AlphaComposite.Src);
      this.iKl.setColor(Color.WHITE);
      this.iKl.setFont(this.font);
      this.iKl.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.iKd ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);

      this.iKl.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, this.iKe ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
    }

    return this.iKl;
  }

  private void a(boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2)
  {
    GL localGL = GLU.getCurrentGL();

    if ((DEBUG) && (!this.iKD)) {
      p(localGL);
    }

    this.iKq = true;
    this.iKr = paramBoolean1;
    this.iKs = paramInt1;
    this.iKt = paramInt2;
    this.iKu = paramBoolean2;

    dsZ.cZe().x(dHL.lSB.dhZ());

    localGL.glPushClientAttrib(-1);

    if (paramBoolean1) {
      cEr().beginOrthoRendering(paramInt1, paramInt2, paramBoolean2);
    }
    else {
      cEr().begin3DRendering();
    }

    if (!this.iKi)
    {
      int[] arrayOfInt = new int[1];
      localGL.glGetIntegerv(3379, arrayOfInt, 0);
      this.iKh.setMaxSize(arrayOfInt[0], arrayOfInt[0]);
      this.iKi = true;
    }

    if ((this.iKB) && (this.iKv)) {
      if (this.iKA == null)
        cEr().setColor(this.iKw, this.iKx, this.iKy, this.iKz);
      else {
        cEr().setColor(this.iKA);
      }

      this.iKB = false;
    }

    if ((this.iKg) && (!cEr().isUsingAutoMipmapGeneration())) {
      if (DEBUG) {
        System.err.println("Disabled mipmapping in TextRenderer");
      }

      this.iKg = false;
    }
  }

  private void iq(boolean paramBoolean)
  {
    cEu();

    this.iKq = false;
    GL localGL = GLU.getCurrentGL();

    localGL.glPopClientAttrib();

    if ((getUseVertexArrays()) && (q(localGL))) {
      try {
        localGL.glBindBuffer(34962, 0);
      } catch (Exception localException) {
        this.iKG = false;
      }
    }

    if (paramBoolean)
      cEr().endOrthoRendering();
    else {
      cEr().end3DRendering();
    }

    if (++this.iKp >= 1000) {
      this.iKp = 0;

      if (DEBUG) {
        System.err.println("Clearing unused entries in endRendering()");
      }

      cEt();
    }
  }

  private void cEt() {
    ArrayList localArrayList = new ArrayList();

    this.iKh.visit(new aGo(this, localArrayList));

    for (Iterator localIterator = localArrayList.iterator(); localIterator.hasNext(); ) {
      Rect localRect = (Rect)localIterator.next();
      this.iKh.remove(localRect);
      this.iKn.remove(((cwN)localRect.getUserData()).ctZ());

      int i = ((cwN)localRect.getUserData()).ijg;

      if (i > 0) {
        this.iKo.clearCacheEntry(i);
      }

    }

    float f = this.iKh.verticalFragmentationRatio();

    if ((!localArrayList.isEmpty()) && (f > 0.7F)) {
      if (DEBUG) {
        System.err.println("Compacting TextRenderer backing store due to vertical fragmentation " + f);
      }

      this.iKh.compact();
    }

    if (DEBUG)
      cEr().markDirty(0, 0, cEr().getWidth(), cEr().getHeight());
  }

  private void b(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    List localList = this.iKo.mF(paramString);
    for (dov localdov : localList) {
      float f = localdov.draw3D(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      paramFloat1 += f * paramFloat4;
    }
  }

  private void cEu() {
    if (this.iKE != null)
      cCK.a(this.iKE);
  }

  private void a(CharSequence paramCharSequence, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    String str;
    if ((paramCharSequence instanceof String))
      str = (String)paramCharSequence;
    else {
      str = paramCharSequence.toString();
    }

    Rect localRect = (Rect)this.iKn.get(str);

    if (localRect == null)
    {
      localObject1 = cEs();
      localObject2 = a(this.iKj.getBounds(str, this.font, getFontRenderContext()));
      localRectangle2D = b((Rectangle2D)localObject2);
      Point localPoint = new Point((int)-localRectangle2D.getMinX(), (int)-localRectangle2D.getMinY());

      localRect = new Rect(0, 0, (int)localRectangle2D.getWidth(), (int)localRectangle2D.getHeight(), new cwN(str, localPoint, (Rectangle2D)localObject2, -1));

      this.iKh.add(localRect);
      this.iKn.put(str, localRect);

      localObject1 = cEs();

      int i = localRect.x() + localPoint.x;
      int j = localRect.y() + localPoint.y;

      ((Graphics2D)localObject1).setComposite(AlphaComposite.Clear);
      ((Graphics2D)localObject1).fillRect(localRect.x(), localRect.y(), localRect.w(), localRect.h());
      ((Graphics2D)localObject1).setComposite(AlphaComposite.Src);

      this.iKj.draw((Graphics2D)localObject1, str, i, j);

      cEr().markDirty(localRect.x(), localRect.y(), localRect.w(), localRect.h());
    }

    Object localObject1 = cEr();

    Object localObject2 = (cwN)localRect.getUserData();
    ((cwN)localObject2).cuf();

    Rectangle2D localRectangle2D = ((cwN)localObject2).cud();

    ((TextureRenderer)localObject1).draw3DRect(paramFloat1 - paramFloat4 * ((cwN)localObject2).cub(), paramFloat2 - paramFloat4 * ((float)localRectangle2D.getHeight() - ((cwN)localObject2).cuc()), paramFloat3, localRect.x() + (((cwN)localObject2).cua().x - ((cwN)localObject2).cub()), ((TextureRenderer)localObject1).getHeight() - localRect.y() - (int)localRectangle2D.getHeight() - (((cwN)localObject2).cua().y - ((cwN)localObject2).cuc()), (int)localRectangle2D.getWidth(), (int)localRectangle2D.getHeight(), paramFloat4);
  }

  private void p(GL paramGL)
  {
    this.iKC = new Frame("TextRenderer Debug Output");

    GLCanvas localGLCanvas = new GLCanvas(new GLCapabilities(), null, GLContext.getCurrent(), null);

    localGLCanvas.addGLEventListener(new aCR(this, paramGL, this.iKC));
    this.iKC.add(localGLCanvas);

    FPSAnimator localFPSAnimator = new FPSAnimator(localGLCanvas, 10);
    this.iKC.addWindowListener(new aGr(this, localFPSAnimator));

    this.iKC.setSize(256, 128);
    this.iKC.setVisible(true);
    localFPSAnimator.start();
    this.iKD = true;
  }

  public void setUseVertexArrays(boolean paramBoolean)
  {
    this.iKF = paramBoolean;
  }

  public final boolean getUseVertexArrays()
  {
    return this.iKF;
  }

  public void setSmoothing(boolean paramBoolean)
  {
    this.iKI = paramBoolean;
    cEr().setSmoothing(paramBoolean);
  }

  public boolean getSmoothing()
  {
    return this.iKI;
  }

  private final boolean q(GL paramGL) {
    if (!this.iKH) {
      this.iKG = paramGL.isExtensionAvailable("GL_VERSION_1_5");
      this.iKH = true;
    }
    return this.iKG;
  }

  public String getFontName()
  {
    if (this.font == null)
      return null;
    String str;
    if (this.font.isBold())
      str = this.font.isItalic() ? "bolditalic" : "bold";
    else {
      str = this.font.isItalic() ? "italic" : "plain";
    }
    return this.font.getFamily() + '-' + str + '-' + this.font.getSize();
  }

  public int aq()
  {
    int i = 0;
    if (this.font.isBold()) {
      i |= 1;
    }
    if (this.font.isItalic()) {
      i |= 2;
    }
    return i;
  }

  public hf getFont()
  {
    if (this.font == null) {
      return null;
    }
    if (this.iKf == null) {
      this.iKf = new aYE(this.font, true, at());
    }
    return this.iKf;
  }

  public hf a(int paramInt, float paramFloat)
  {
    if (this.font == null) {
      return null;
    }
    Font localFont = this.font.deriveFont(paramInt, paramFloat);
    return new aYE(localFont, true, false);
  }

  public int a(char paramChar)
  {
    FontRenderContext localFontRenderContext = getFontRenderContext();
    Rectangle2D localRectangle2D = this.font.getStringBounds(String.valueOf(paramChar), localFontRenderContext);
    return (int)localRectangle2D.getWidth();
  }

  public int b(char paramChar)
  {
    return a(paramChar);
  }

  public int c(char paramChar)
  {
    FontRenderContext localFontRenderContext = getFontRenderContext();
    Rectangle2D localRectangle2D = this.font.getStringBounds(String.valueOf(paramChar), localFontRenderContext);
    return (int)localRectangle2D.getHeight();
  }

  public int ar()
  {
    FontRenderContext localFontRenderContext = getFontRenderContext();
    Rectangle2D localRectangle2D = this.font.getMaxCharBounds(localFontRenderContext);
    return (int)localRectangle2D.getWidth();
  }

  public int as()
  {
    FontRenderContext localFontRenderContext = getFontRenderContext();
    Rectangle2D localRectangle2D = this.font.getMaxCharBounds(localFontRenderContext);
    return (int)localRectangle2D.getHeight();
  }

  public int b(String paramString, int paramInt1, int paramInt2)
  {
    for (int i = Math.min(paramString.length() - 1, paramInt1 - 1); i >= 0; i--) {
      if (f(paramString.substring(0, i + 1)) <= paramInt2) {
        return i + 1;
      }
    }

    return 0;
  }

  public int f(String paramString)
  {
    Rectangle2D localRectangle2D = this.font.getStringBounds(paramString, getFontRenderContext());
    return (int)localRectangle2D.getWidth();
  }

  public int g(String paramString)
  {
    Rectangle2D localRectangle2D = this.font.getStringBounds(paramString, getFontRenderContext());
    return (int)localRectangle2D.getHeight();
  }

  public int h(String paramString)
  {
    LineMetrics localLineMetrics = this.font.getLineMetrics(paramString, getFontRenderContext());
    return (int)Math.ceil(localLineMetrics.getDescent());
  }

  public boolean at()
  {
    return false;
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, float paramFloat2)
  {
    draw3D(new String(paramArrayOfChar), paramFloat1, paramFloat2, 0.0F, 1.0F);
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    draw3D(new String(paramArrayOfChar), paramFloat1, paramFloat2, paramArrayOfChar.length, paramFloat3);
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3)
  {
    draw3D(new String(paramArrayOfChar).substring(0, paramInt), paramFloat1, paramFloat2, 0.0F, paramFloat3);
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2) {
    draw3D(new String(paramArrayOfChar).substring(0, paramInt), paramFloat1, paramFloat2, 0.0F, 1.0F);
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    draw3D(new String(paramArrayOfChar).substring(0, paramInt), paramFloat1, paramFloat2, 0.0F, paramFloat3);
  }
}