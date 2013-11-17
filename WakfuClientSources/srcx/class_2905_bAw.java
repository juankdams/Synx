import com.ankamagames.framework.sound.openAL.LowPassTween;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.EFX10;
import org.lwjgl.openal.OpenALException;

public abstract class bAw extends Thread
  implements aKQ
{
  private static bAw gpq;
  protected static final Logger K = Logger.getLogger(bAw.class);
  protected static final boolean aRN = true;
  protected static final boolean gpr = false;
  protected static final int gps = 131072;
  public static final long gpt = 10L;
  private boolean aKV = false;

  protected static int[] bUC = { 0 };
  protected static int[] bUD = { 0 };

  private int gpu = -1;
  private int gpv = -1;

  private LowPassTween gpw = null;
  private LowPassTween gpx = null;

  private final ArrayList eju = new ArrayList();
  private final Object gpy = new Object();
  protected dNN euU;
  private volatile boolean gpz = false;
  private volatile boolean gpA = false;

  private int gpB = 0;
  private int gpC = 0;
  private int gpD = 0;

  private int gpE = 0;

  protected Xg gpF = new Xg();

  long gpG = 0L;
  int count = 0;

  private static int gpH = 0;
  private static int gpI = 0;

  protected bAw()
  {
    b(this);
  }

  protected static void b(bAw parambAw) {
    gpq = parambAw;
  }

  public static bAw bIJ() {
    return gpq;
  }

  public final boolean bIK() {
    return this.gpz;
  }

  public final dNN bff()
  {
    return this.euU;
  }

  public void a(dNN paramdNN)
  {
    this.euU = paramdNN;
  }

  public void bIL() {
    av(false);
    try {
      join(500L);
    } catch (InterruptedException localInterruptedException) {
      K.debug("Thread interrupted while waiting for SoundManager to stop", localInterruptedException);
    }
    try
    {
      if (AL.isCreated()) {
        K.info("SoundManager thread not closed in maximum time. Destroying AL");
        AL.destroy();
      }
    } catch (OpenALException localOpenALException) {
      K.error("Exception en detruisant OpenAL : ", localOpenALException);
    }
  }

  public final void av(boolean paramBoolean) {
    this.aKV = paramBoolean;
  }

  public final boolean isRunning() {
    return this.aKV;
  }

  public static void check() {
    int i = AL10.alGetError();
    if (i != 0) {
      String str = "unknown error";
      switch (i) {
      case 40961:
        str = "AL_INVALID_NAME";
        break;
      case 40962:
        str = "AL_INVALID_ENUM";
        break;
      case 40963:
        str = "AL_INVALID_VALUE";
        break;
      case 40964:
        str = "AL_INVALID_OPERATION";
        break;
      case 40965:
        str = "AL_OUT_OF_MEMORY";
      }

      throw new OpenALException("OpenAL error : " + str);
    }
  }

  private void bIM()
  {
    IntBuffer localIntBuffer = BufferUtils.createIntBuffer(64);

    for (int i = 0; i < 64; i++) {
      try {
        int m = AL10.alGenSources();
        check();
        localIntBuffer.put(m);
      } catch (Exception localException1) {
        break;
      }
    }

    this.gpB = localIntBuffer.position();
    localIntBuffer.position(0).limit(this.gpB);
    try {
      AL10.alDeleteSources(localIntBuffer);
      check();
    }
    catch (OpenALException localOpenALException1) {
      K.warn("Problème au alDeleteSources.", localOpenALException1);
    }

    if (!ALC10.alcIsExtensionPresent(ALC10.alcGetContextsDevice(ALC10.alcGetCurrentContext()), "ALC_EXT_EFX")) {
      this.gpD = 0;
      this.gpC = 0;
    }
    else {
      localIntBuffer.limit(64);
      for (int j = 0; j < 64; j++) {
        try {
          int n = EFX10.alGenEffects();
          check();
          localIntBuffer.put(n);
        } catch (Exception localException2) {
          break;
        }
      }

      this.gpD = localIntBuffer.position();
      localIntBuffer.position(0).limit(this.gpD);
      try {
        EFX10.alDeleteEffects(localIntBuffer);
        check();
      }
      catch (OpenALException localOpenALException2) {
        K.warn("Problème au alDeleteEffects.", localOpenALException2);
      }

      localIntBuffer.limit(64);
      for (int k = 0; k < 64; k++) {
        try {
          int i1 = EFX10.alGenAuxiliaryEffectSlots();
          check();
          localIntBuffer.put(i1);
        } catch (Exception localException3) {
          break;
        }
      }

      this.gpC = localIntBuffer.position();
      localIntBuffer.position(0).limit(this.gpC);
      try {
        EFX10.alDeleteAuxiliaryEffectSlots(localIntBuffer);
        check();
      }
      catch (OpenALException localOpenALException3) {
        K.warn("Problème au alDeleteAuxiliaryEffectSlots.", localOpenALException3);
      }
    }
  }

  public final synchronized boolean initialize()
  {
    if (!this.gpz) {
      try {
        AL.create();
        bIM();

        AL10.alDistanceModel(53252);

        check();

        this.gpz = true;
      } catch (LWJGLException localLWJGLException) {
        K.warn("Probl?me lors de SoundManager.initialize(). Impossible d'initialiser le SoundManager", localLWJGLException);
        this.gpz = false;
        this.gpA = true;
        return false;
      }
    }
    return (!this.aKV) && (blp());
  }

  public final synchronized void start()
  {
    if ((!this.aKV) && (this.gpz) && (!this.gpA)) {
      setName("SoundManager");
      super.start();
    }

    while (!this.aKV) {
      try {
        Thread.sleep(100L);
      } catch (InterruptedException localInterruptedException) {
        K.error("Interrupted", localInterruptedException);
      }continue;

      if (this.aKV)
        K.error("SoundManager is already running");
      else if (this.gpA)
        K.error("SoundManager failed to initialize");
      else
        K.error("Initialize SoundManager first");
    }
  }

  protected void U(long paramLong)
  {
  }

  public final void rY() {
    synchronized (this.gpy) {
      int i = this.eju.size();
      for (int j = 0; j < i; j++)
        ((aOv)this.eju.get(j)).rY();
    }
  }

  public final void run()
  {
    this.aKV = true;

    K.info("SoundManager running");

    while (this.aKV) {
      try {
        Thread.sleep(10L);
      } catch (InterruptedException localInterruptedException) {
        K.error("Exception", localInterruptedException);
      }

      long l = System.currentTimeMillis();
      try {
        U(l);
      } catch (Throwable localThrowable2) {
        K.error("Exception", localThrowable2);
      }

      synchronized (this.gpy) {
        int j = this.eju.size();
        for (int k = 0; k < j; k++) {
          aOv localaOv = (aOv)this.eju.get(k);
          try {
            if ((!localaOv.bfl()) || (localaOv.bfn()))
              localaOv.K(l);
          }
          catch (Throwable localThrowable4) {
            K.error("Exception", localThrowable4);
          }
        }
      }

      for (int i = this.gpF.size() - 1; i >= 0; i--) {
        try {
          ((cAx)this.gpF.hc(i)).ib(l);
        } catch (Throwable localThrowable3) {
          K.error("Exception", localThrowable3);
        }
      }

    }

    try
    {
      blq();
      AL.destroy();
    }
    catch (Throwable localThrowable1) {
      K.error("Exception", localThrowable1);
    }

    K.info("SoundManager stopped");
  }

  protected abstract boolean blW();

  private doR a(blq paramblq)
  {
    if (blW()) {
      localObject = (crG)cjj.hII.get(paramblq.getDescription());
      if (localObject != null)
      {
        return new bLw((crG)localObject);
      }

      djg localdjg = new djg();
      if (!localdjg.b(paramblq)) {
        return null;
      }
      try
      {
        if (paramblq.length() < 131072L) {
          localObject = new crG(localdjg);
          if (((crG)localObject).initialize())
          {
            cjj.hII.put(paramblq.getDescription(), localObject);

            return new bLw((crG)localObject);
          }
        }
      } catch (IOException localIOException) {
        return null;
      }

      return localdjg;
    }
    Object localObject = new djg();
    ((djg)localObject).b(paramblq);
    return localObject;
  }

  public final ZG a(blq paramblq, aOv paramaOv, long paramLong)
  {
    if (!this.gpz) {
      try {
        paramblq.close();
      } catch (IOException localIOException1) {
        K.error("Problème à la fermeture " + paramblq.getDescription());
      }
      return null;
    }

    doR localdoR = a(paramblq);
    if (localdoR != null) {
      ZG localZG = cFl.cAH().iq(paramLong);

      if (localZG != null)
        try {
          if (localZG.a(this, paramaOv, localdoR)) {
            localdoR.bTv();
            localdoR.gk(true);
            baT.b("Adding " + localZG.als(), paramaOv.bfe());
            return localZG;
          }

          if (localZG.akQ()) {
            cFl.cAH().g(localZG);
          }

          localdoR.close();
          return null;
        }
        catch (Exception localException)
        {
          K.error("Erreur durant l'initialisation de la source : " + paramblq.getDescription());
          if (localZG.akQ()) {
            cFl.cAH().g(localZG);
          }

          localdoR.bTw();
        }
      else K.error("error : source is null"); 
    }
    else
    {
      K.error("Unable to initialize stream from URL : " + paramblq.getDescription());
    }
    try
    {
      paramblq.close();
    } catch (IOException localIOException2) {
      K.error("Problème à la fermeture du stream de " + paramblq.getDescription());
    }
    return null;
  }

  public static void e(ZG paramZG) {
    if (paramZG != null) {
      if (paramZG.isPlaying()) {
        paramZG.stop();
      }

      paramZG.close();
      if (paramZG.akQ())
        cFl.cAH().g(paramZG);
    }
  }

  public boolean no(int paramInt)
  {
    if (paramInt > this.gpB - this.gpE) {
      return false;
    }

    this.gpE += paramInt;

    K.debug("voices in use : " + this.gpE + "/" + this.gpB);

    return true;
  }

  public boolean np(int paramInt) {
    if (this.gpE < paramInt) {
      return false;
    }

    this.gpE -= paramInt;

    K.debug("voices in use : " + this.gpE + "/" + this.gpB);

    return true;
  }

  protected int bIN() {
    return this.gpE;
  }

  public final void b(aOv paramaOv)
  {
    if (paramaOv == null) {
      return;
    }

    synchronized (this.gpy) {
      if (!this.eju.contains(paramaOv)) {
        this.eju.add(paramaOv);
        paramaOv.a(this);
      }
    }
  }

  public final void c(aOv paramaOv)
  {
    if (paramaOv == null) {
      return;
    }
    synchronized (this.gpy) {
      try {
        this.eju.remove(paramaOv);
        paramaOv.stop();
        paramaOv.a(null);
      } catch (Exception localException) {
        K.error("Exception", localException);
      }
    }
  }

  public final aOv jx(String paramString)
  {
    if (paramString == null) {
      return null;
    }

    synchronized (this.gpy) {
      for (aOv localaOv : this.eju) {
        if (localaOv.getName().equals(paramString)) {
          return localaOv;
        }
      }
    }
    return null;
  }

  protected abstract boolean blp();

  protected abstract void blq();

  public static int bIO()
  {
    return bUD[0];
  }

  public abstract caQ a(bgG parambgG, int paramInt1, int paramInt2, int paramInt3);

  public synchronized void rQ(int paramInt)
  {
    if (!isRunning()) {
      return;
    }

    if (!aNh.eth.a(dEX.lOm)) {
      return;
    }

    if (bUD[0] == 0) {
      bUD[0] = EFX10.alGenAuxiliaryEffectSlots();
      check();
    }

    if (bUC[0] == 0) {
      bUC[0] = EFX10.alGenEffects();
      check();
    }

    if (this.gpu == paramInt) {
      return;
    }
    this.gpu = paramInt;

    aEp localaEp = od(this.gpu);

    if (localaEp != null)
      try
      {
        EFX10.alEffecti(bUC[0], 32769, 1);

        check();

        EFX10.alEffectf(bUC[0], 1, localaEp.aQv());

        check();

        EFX10.alEffectf(bUC[0], 3, localaEp.aQw());

        check();

        EFX10.alEffectf(bUC[0], 5, localaEp.aQx());

        check();

        EFX10.alEffectf(bUC[0], 6, localaEp.aQy());

        check();

        EFX10.alEffectf(bUC[0], 9, localaEp.aQz());

        check();

        EFX10.alEffectf(bUC[0], 10, localaEp.aQA());

        check();

        EFX10.alAuxiliaryEffectSloti(bUD[0], 1, bUC[0]);

        check();

        oe(bUD[0]);
      } catch (Exception localException) {
        oe(0);
      }
    else
      oe(0);
  }

  public void rR(int paramInt)
  {
    if (!isRunning()) {
      return;
    }
    if (this.gpv == paramInt) {
      return;
    }

    this.gpv = paramInt;
  }

  public void i(int paramInt, long paramLong)
  {
    if (!aNh.eth.a(dEX.lOn)) {
      return;
    }

    cAx localcAx = (cAx)this.gpF.get(paramInt);
    if (localcAx == null) {
      ajR localajR = of(this.gpv);
      if (localajR == null) {
        return;
      }
      localcAx = new cAx(localajR.alh(), localajR.axg(), paramInt, this, rS(paramInt));
      try {
        localcAx.cxl();
      } catch (OpenALException localOpenALException) {
        return;
      }
      this.gpF.put(paramInt, localcAx);
    }

    localcAx.id(paramLong);
  }

  protected boolean rS(int paramInt) {
    return true;
  }

  public void j(int paramInt, long paramLong) {
    if (!aNh.eth.a(dEX.lOn)) {
      return;
    }

    cAx localcAx = (cAx)this.gpF.get(paramInt);
    if (localcAx != null)
      localcAx.ie(paramLong);
  }

  public void mX(int paramInt)
  {
    cAx localcAx = (cAx)this.gpF.remove(paramInt);
    if (localcAx != null)
      localcAx.cxm();
  }

  public abstract dCo og(int paramInt);

  protected abstract ajR of(int paramInt);

  protected abstract aEp od(int paramInt);

  protected abstract void oe(int paramInt);

  public void ei(boolean paramBoolean)
  {
  }
}