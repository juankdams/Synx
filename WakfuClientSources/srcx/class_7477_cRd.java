import com.ankamagames.baseImpl.graphics.opengl.FullscreenUtils;
import com.sun.opengl.util.Animator;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.lang.reflect.Method;
import java.net.URL;
import javax.swing.JFrame;
import org.apache.log4j.Logger;

public abstract class cRd
{
  public static final Logger K = Logger.getLogger(cRd.class);
  public static final boolean kDk = true;
  private static final int kDl = 16;
  protected static final int kDm = 800;
  protected static final int kDn = 600;
  private static final int kDo = 1024;
  private static final int kDp = 768;
  private static final int kDq = 32;
  private static final int kDr = 0;
  private static final tb kDs = tb.bcO;

  public static final GraphicsEnvironment kDt = GraphicsEnvironment.getLocalGraphicsEnvironment();

  private JFrame kDu = null;

  private dHI kDv = null;
  private jM kDw;
  private bAU aMs;
  private String hh = null;
  private tb kDx;

  protected abstract JFrame cDE();

  protected abstract URL cwx();

  public abstract void b(dJR paramdJR);

  public abstract void cDG();

  public void initialize()
  {
    b(new dIP());
  }

  public void b(dIP paramdIP) {
    K.info("Initializing GLApplication UI");
    this.kDw = new jM(paramdIP);
    K.info("GLappUI : Workspace created");
    this.kDw.setFocusable(true);

    this.aMs = new bAU();
    K.info("GLappUI : Renderer created");
    this.aMs.a(new dmF(this));

    this.aMs.fO(true);

    this.kDw.a(this.aMs);

    this.kDu = cDE();
    this.kDu.addComponentListener(new dmG(this));

    K.info("GLappUI : Frame created");

    this.kDu.setVisible(false);
    this.kDu.setTitle(this.hh);

    URL localURL = cwx();
    if (localURL != null) {
      Image localImage = Toolkit.getDefaultToolkit().getImage(localURL);
      this.kDu.setIconImage(localImage);
      if (cwl.ctP()) {
        try {
          Class localClass = Class.forName("com.apple.eawt.Application");
          Method localMethod1 = localClass.getMethod("getApplication", new Class[0]);
          Object localObject = localMethod1.invoke(null, new Object[0]);
          Method localMethod2 = localClass.getMethod("setDockIconImage", new Class[] { Image.class });
          localMethod2.invoke(localObject, new Object[] { localImage });
        } catch (Exception localException) {
          K.error("Exception while trying to set dock icon " + localImage + " : ", localException);
        }
      }
    }

    this.kDu.setDefaultCloseOperation(2);
    this.kDu.addWindowListener(new dmH(this));
  }

  public void close()
  {
    if (this.kDv != null) {
      this.kDv.cVc();
    }

    if (this.kDu != null) {
      this.kDu.dispose();
    }
    else
    {
      System.exit(0);
    }
  }

  protected jM cHy()
  {
    return this.kDw;
  }

  public void io(boolean paramBoolean) {
    if (!EventQueue.isDispatchThread()) {
      EventQueue.invokeLater(new dmI(this, paramBoolean));

      return;
    }
    if (this.kDw != null)
      this.kDw.setVisible(paramBoolean);
  }

  public void cHz()
  {
    if (!EventQueue.isDispatchThread()) {
      EventQueue.invokeLater(new dmK(this));

      return;
    }
    if (this.kDw != null)
      this.kDw.setSize(this.kDw.getSize());
  }

  public Rectangle cHA()
  {
    if (this.kDw != null) {
      return this.kDw.getBounds();
    }
    return new Rectangle(0, 0, 0, 0);
  }

  public bAU rs()
  {
    return this.aMs;
  }

  public void cHB() {
    setVisible(true);
    if (!this.kDw.rr().isAnimating()) {
      this.kDw.rr().start();
    }
    K.info("GLappUI : GL Rendering started");
  }

  public void setTitle(String paramString)
  {
    this.hh = paramString;
    if (this.kDu != null)
      this.kDu.setTitle(this.hh);
  }

  public void setCursor(Cursor paramCursor)
  {
    this.kDu.setCursor(paramCursor);
  }

  public int cHC() {
    return this.kDu.getX();
  }

  public int cHD() {
    return this.kDu.getY();
  }

  public Dimension getSize() {
    return this.kDu.getSize();
  }

  public int getWidth() {
    return this.kDu.getWidth();
  }

  public int getHeight() {
    return this.kDu.getHeight();
  }

  public void setVisible(boolean paramBoolean) {
    if (this.kDu == null) {
      return;
    }
    this.kDu.setVisible(paramBoolean);
  }

  public void a(dHI paramdHI) {
    this.kDv = paramdHI;
  }

  protected dHI cHE() {
    return this.kDv;
  }

  public void a(dIu paramdIu)
  {
    if (paramdIu.dij()) {
      paramdIu = cHI();
    }

    K.info("Applying resolution : " + paramdIu);

    switch (dmL.cxH[paramdIu.dii().ordinal()]) {
    case 1:
      boolean bool = D(paramdIu.getWidth(), paramdIu.getHeight(), paramdIu.dih(), paramdIu.getFrequency());

      if (!bool)
        cDF(); break;
    case 2:
      cDF();
      break;
    case 3:
      em(paramdIu.getWidth(), paramdIu.getHeight());
      Rectangle localRectangle = cHH();
      if (!localRectangle.contains(this.kDu.getLocation())) {
        this.kDu.setLocation(localRectangle.x, localRectangle.y);
      }
      break;
    }

    dIu localdIu = cHF();
    if (!localdIu.equals(paramdIu)) {
      K.info("Resolution applied : " + localdIu);
    }

    if (this.kDv != null)
      this.kDv.b(localdIu);
  }

  public dIu cHF()
  {
    GraphicsDevice localGraphicsDevice = kDt.getDefaultScreenDevice();
    DisplayMode localDisplayMode = localGraphicsDevice.getDisplayMode();
    int i = localDisplayMode.getBitDepth();
    return new dIu(getWidth(), getHeight(), i, localDisplayMode.getRefreshRate(), this.kDx);
  }

  protected void cDF() {
    this.kDx = tb.bcP;

    GraphicsDevice localGraphicsDevice = kDt.getDefaultScreenDevice();
    if (localGraphicsDevice.getFullScreenWindow() == this.kDu) {
      localGraphicsDevice.setFullScreenWindow(null);
    }

    if (cwl.ctP()) {
      try {
        FullscreenUtils.hfC.showMenuAndDock(false);
      } catch (Throwable localThrowable) {
        K.error("Impossible de cacher le menu et le doc Mac", localThrowable);
      }
    }

    Dimension localDimension = Toolkit.getDefaultToolkit().getScreenSize();
    this.kDu.setBounds(0, 0, localDimension.width, localDimension.height);
    this.kDu.setExtendedState(6);
    this.kDu.setVisible(true);
    this.kDu.setResizable(false);
  }

  protected void em(int paramInt1, int paramInt2) {
    this.kDx = tb.bcO;

    GraphicsDevice localGraphicsDevice = kDt.getDefaultScreenDevice();
    if (localGraphicsDevice.getFullScreenWindow() == this.kDu) {
      localGraphicsDevice.setFullScreenWindow(null);
    }

    if (cwl.ctP()) {
      try {
        FullscreenUtils.hfC.showMenuAndDock(true);
      } catch (Throwable localThrowable) {
        K.error("Impossible d'afficher le menu et le doc Mac", localThrowable);
      }
    }

    Rectangle localRectangle = cHH();
    int i = Math.max(Math.min(paramInt1, localRectangle.width), 800);
    int j = Math.max(Math.min(paramInt2, localRectangle.height), 600);
    this.kDu.setSize(i, j);

    if ((i == localRectangle.width) && (j == localRectangle.height))
    {
      int k = Math.min(1024, localRectangle.width);
      int m = Math.min(768, localRectangle.height);
      this.kDu.setSize(k, m);
      this.kDu.setExtendedState(6);
    } else {
      this.kDu.setExtendedState(0);
    }
    this.kDu.setResizable(true);
    this.kDu.setVisible(true);
  }

  protected boolean D(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (cwl.ctP()) {
      try {
        FullscreenUtils.hfC.showMenuAndDock(true);
      } catch (Throwable localThrowable) {
        K.error("Impossible d'afficher le menu et le doc Mac", localThrowable);
      }

    }

    GraphicsDevice localGraphicsDevice = kDt.getDefaultScreenDevice();

    if (!localGraphicsDevice.isFullScreenSupported()) {
      K.debug("Fullscreen mode not supported, defaulting to simulated fullscreen");
    }

    DisplayMode localDisplayMode1 = a(localGraphicsDevice, paramInt1, paramInt2, paramInt3, paramInt4);
    if (localDisplayMode1 == null) {
      K.warn("No available displayMode corresponding to " + paramInt1 + "x" + paramInt2 + "x" + paramInt3);
      return false;
    }

    if (localGraphicsDevice.getFullScreenWindow() != this.kDu) {
      localGraphicsDevice.setFullScreenWindow(this.kDu);
    }

    if (localGraphicsDevice.getDisplayMode() == localDisplayMode1) {
      this.kDx = tb.bcQ;
      return true;
    }

    if (!localGraphicsDevice.isDisplayChangeSupported()) {
      K.warn("Unable to change display mode. Defaulting to windowed mode");
      localGraphicsDevice.setFullScreenWindow(null);
      return false;
    }

    try
    {
      localGraphicsDevice.setDisplayMode(localDisplayMode1);
    } catch (Exception localException) {
      K.error("Unable to set mode " + a(localDisplayMode1) + ". Defaulting to windowed mode", localException);
      localGraphicsDevice.setFullScreenWindow(null);
      return false;
    }

    DisplayMode localDisplayMode2 = localGraphicsDevice.getDisplayMode();
    this.kDx = tb.bcQ;

    this.kDu.setBounds(0, 0, localDisplayMode2.getWidth(), localDisplayMode2.getHeight());
    return true;
  }

  public Rectangle cHG()
  {
    GraphicsDevice localGraphicsDevice = kDt.getDefaultScreenDevice();
    return a(localGraphicsDevice);
  }

  public Rectangle cHH()
  {
    if (this.kDu == null) {
      return cHG();
    }

    Rectangle localRectangle1 = this.kDu.getBounds();

    Object localObject = null;
    int i = -1;

    for (GraphicsDevice localGraphicsDevice : kDt.getScreenDevices()) {
      Rectangle localRectangle2 = localGraphicsDevice.getDefaultConfiguration().getBounds();
      Rectangle localRectangle3 = localRectangle2.intersection(localRectangle1);
      int m = localRectangle3.width * localRectangle3.height;
      if (m > i) {
        localObject = localGraphicsDevice;
        i = m;
      }
    }

    if (localObject != null) {
      return a(localObject);
    }
    return cHG();
  }

  private Rectangle a(GraphicsDevice paramGraphicsDevice)
  {
    GraphicsConfiguration localGraphicsConfiguration = paramGraphicsDevice.getDefaultConfiguration();
    Insets localInsets = Toolkit.getDefaultToolkit().getScreenInsets(localGraphicsConfiguration);
    Rectangle localRectangle = localGraphicsConfiguration.getBounds();
    localRectangle.x += localInsets.left;
    localRectangle.width -= localInsets.left + localInsets.right;
    localRectangle.y += localInsets.top;
    localRectangle.height -= localInsets.top + localInsets.bottom;
    return localRectangle;
  }

  private static DisplayMode a(GraphicsDevice paramGraphicsDevice, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt3 == -1)
    {
      DisplayMode localDisplayMode1 = a(paramGraphicsDevice, paramInt1, paramInt2, 32, paramInt4);
      if (localDisplayMode1 != null) {
        return localDisplayMode1;
      }

      return a(paramGraphicsDevice, paramInt1, paramInt2, paramGraphicsDevice.getDisplayMode().getBitDepth(), paramInt4);
    }

    int i = paramInt4 != 0 ? 1 : 0;

    Object localObject = null;

    for (DisplayMode localDisplayMode2 : paramGraphicsDevice.getDisplayModes())
    {
      int m = localDisplayMode2.getBitDepth();
      if (m == -1) {
        m = paramInt3;
      }

      if ((localDisplayMode2.getWidth() == paramInt1) && (localDisplayMode2.getHeight() == paramInt2) && (m == paramInt3))
      {
        if ((i == 0) || (paramInt4 == localDisplayMode2.getRefreshRate()))
        {
          if (localObject == null) {
            localObject = localDisplayMode2;
          }
          else
          {
            int n = localObject.getRefreshRate();
            int i1 = localDisplayMode2.getRefreshRate();
            if ((i1 >= 50) && (i1 < n))
              localObject = localDisplayMode2; 
          }
        }
      }
    }
    return localObject;
  }

  public dIu cHI() {
    return new dIu(1024, 768, 32, 0, kDs);
  }

  public Dimension getMinimumSize() {
    return new Dimension(800, 600);
  }

  public int cHJ() {
    return 16;
  }

  public JFrame cHK() {
    return this.kDu;
  }

  private static String a(DisplayMode paramDisplayMode) {
    return "{Mode " + paramDisplayMode.getWidth() + 'x' + paramDisplayMode.getHeight() + 'x' + paramDisplayMode.getBitDepth() + ' ' + paramDisplayMode.getRefreshRate() + "Hz}";
  }
}