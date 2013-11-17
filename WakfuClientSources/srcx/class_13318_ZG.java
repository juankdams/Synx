import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.apache.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.AL11;

public class ZG
  implements aVB, bWU, cUV
{
  public static final int cLl = 0;
  public static final int cLm = 1;
  public static final int cLn = 2;
  public static final int cLo = 3;
  protected static final Logger K = Logger.getLogger(ZG.class);
  protected static final boolean aRN = false;
  protected static final int bt = 65536;
  protected static final int cLp = 2;
  private long cLq;
  protected int cLr = 2;

  protected IntBuffer cLs = BufferUtils.createIntBuffer(2);

  protected IntBuffer cLt = BufferUtils.createIntBuffer(1);

  private final ByteBuffer cLu = BufferUtils.createByteBuffer(65536);
  private int cLv;
  private int cLw;
  private int cLx;
  private boolean cLy = true;
  private int cLz;
  private float[] cLA = new float[3];
  private float cLB = 1.0F;
  private float cLC = 1.0F;
  private float cLD = 3.4028235E+38F;

  private boolean cLE = false;
  private int it = -1;

  private int cLF = 0;
  private int cLG = 0;
  protected volatile doR cLH;
  private volatile boolean cLI = false;
  private bAw cLJ;
  private aOv cLK;
  protected volatile float cLL;
  protected volatile float cLM;
  protected volatile float cLN;
  protected volatile float cLO;
  protected volatile float cLP;
  protected volatile boolean cLQ = false;
  protected volatile boolean cLR = false;
  protected volatile boolean cLS = false;
  protected volatile boolean cLT = false;
  protected volatile boolean cLU = false;
  protected volatile boolean cLV = false;
  protected volatile boolean cLW = false;

  protected volatile long cLX = 0L;

  protected volatile long cLY = 0L;
  private volatile int cLZ;
  private volatile boolean cMa = true;
  private volatile boolean cMb = false;
  private volatile boolean aFg = false;

  private volatile boolean cMc = false;

  public long akM() {
    return this.cLq;
  }

  public void cr(long paramLong) {
    this.cLq = paramLong;
  }

  public byte akN() {
    if (this.cLK != null) {
      return this.cLK.akN();
    }

    return 0;
  }

  public void a(bAw parambAw) {
    this.cLJ = parambAw;
  }

  public aOv akO() {
    return this.cLK;
  }

  public doR akP() {
    return this.cLH;
  }

  public boolean akQ() {
    return this.cLI;
  }

  public void bD(boolean paramBoolean) {
    this.cLI = paramBoolean;
  }

  public boolean akR() {
    return this.cLW;
  }

  public void bE(boolean paramBoolean) {
    this.cLW = paramBoolean;
  }

  public void aJ()
  {
    this.cLV = false;
    this.cLQ = false;
    this.cLR = false;
    this.cLS = false;
    this.cLT = false;
    this.cLP = 0.0F;
    this.cLW = false;
    this.cLL = 0.0F;
    this.cLM = 1.0F;
    this.cLO = 1.0F;
    this.cLN = this.cLM;
    this.cLX = 0L;
    this.cLY = 0L;
    this.cLZ = 1;
    this.cMa = true;
    this.cMb = false;
    float tmp101_100 = (this.cLA[2] = 0.0F); this.cLA[1] = tmp101_100; this.cLA[0] = tmp101_100;
    this.cLB = 1.0F;
    this.cLC = 1.0F;
    this.cLD = 3.4028235E+38F;
    this.aFg = false;
    this.cLF = 0;
    this.cLG = 0;
    this.cLE = false;
    this.it = 0;
  }

  public void bc()
  {
    cleanUp();

    if (this.cLJ != null) {
      this.cLJ.j(this.it, this.cLq);
    }
    this.cLr = 2;
  }

  public synchronized boolean hu(int paramInt) {
    boolean bool = true;
    try {
      this.cLu.clear();
      int i = this.cLH.j(this.cLu, 0);
      int j = i <= 0 ? 1 : 0;
      i = Math.abs(i);

      if (j != 0) {
        if ((this.cLW) || (--this.cLZ > 0))
        {
          this.cLH.reset();
          i += Math.abs(this.cLH.j(this.cLu, i));
        } else {
          bool = false;
        }

      }

      this.cLu.position(0).limit(i);
      AL10.alBufferData(paramInt, this.cLv, this.cLu, this.cLz);

      AL10.alSourceQueueBuffers(this.cLt.get(0), paramInt);
    }
    catch (Exception localException)
    {
      K.error("Exeption levée", localException);
      return false;
    }

    return bool;
  }

  public synchronized boolean akS()
  {
    if (!akT()) {
      return false;
    }

    this.aFg = false;

    if (this.cLF != 0) {
      hv(this.cLF);
    }

    if (this.cLG != 0) {
      hw(this.cLG);
    }

    setMute(this.cLV);
    ah(this.cLL);
    ag(this.cLM);
    ae(this.cLN);

    al(this.cLB);
    aj(this.cLC);
    ak(this.cLD);

    if (this.cLH != null) {
      this.cLH.bTq();
    }

    return true;
  }

  private synchronized boolean akT()
  {
    while (true)
    {
      if (this.cLK.no(this.cLw)) {
        this.cLx = this.cLw;
        this.cLy = true;
        break;
      }if (this.cLJ.no(this.cLw)) {
        this.cLx = this.cLw;
        this.cLy = false;
        break;
      }
      ZG localZG = cFl.cAH().cAJ();
      if (localZG == null) {
        K.debug("Il n'y a aucune source à libérer, mais on n'arrive pas à réserver de voix");
        this.cLx = 0;
        return false;
      }

      if (localZG.akN() > this.cLK.akN()) {
        localZG.ald();
      } else {
        K.debug("Impossible d'assigner suffisament de voix à cette Source.");
        this.cLx = 0;
        return false;
      }

    }

    try
    {
      this.cLs.clear();
      AL10.alGenBuffers(this.cLs);
      bAw.check();
    } catch (Exception localException1) {
      K.warn("Impossible de créer un buffer supplémentaire.", localException1);
      return false;
    }
    try
    {
      this.cLt.clear();
      AL10.alGenSources(this.cLt);
      bAw.check();
    } catch (Exception localException2) {
      K.warn("Impossible de créer une source audio supplémentaire.");
      return false;
    }

    AL10.alSourcei(this.cLt.get(0), 4103, 0);

    AL10.alSourcef(this.cLt.get(0), 4099, 1.0F);

    AL10.alSourcei(this.cLt.get(0), 514, 1);

    return true;
  }

  public synchronized boolean a(bAw parambAw, aOv paramaOv, doR paramdoR) {
    this.cLJ = parambAw;
    this.cLK = paramaOv;

    this.cLH = paramdoR;

    if (this.cLH.bTr() == 1) {
      this.cLw = 1;
      this.cLv = 4353;
    } else {
      this.cLw = 2;
      this.cLv = 4355;
    }

    this.cLz = this.cLH.bTs();

    if (!akT()) {
      return false;
    }

    ag(1.0F);
    ah(0.0F);
    ai(1.0F);
    ae(alj());

    return true;
  }

  public synchronized void hv(int paramInt) {
    this.cLF = paramInt;
    if (this.cLt.get(0) != 0)
      AL11.alSource3i(this.cLt.get(0), 131078, paramInt, 0, 0);
  }

  public synchronized void hw(int paramInt)
  {
    this.cLG = paramInt;
    if (this.cLt.get(0) != 0)
    {
      AL10.alSourcei(this.cLt.get(0), 131077, this.cLE ? this.cLG : 0);
    }
  }

  public synchronized void bF(boolean paramBoolean)
  {
    if (this.cLE == paramBoolean) {
      return;
    }

    this.cLE = paramBoolean;
    if (this.cLE)
      this.cLJ.i(this.it, this.cLq);
    else {
      this.cLJ.j(this.it, this.cLq);
    }
    hw(this.cLG);
  }

  public int ca() {
    return this.it;
  }

  public void hx(int paramInt) {
    if (this.it == paramInt) {
      return;
    }

    this.cLJ.j(this.it, this.cLq);
    this.it = paramInt;
    this.cLJ.i(this.it, this.cLq);
  }

  public synchronized void akU() {
    akV();

    if (this.cLH != null) {
      this.cLH.close();
    }

    this.aFg = true;
  }

  private synchronized void akV()
  {
    if (this.cLt.get(0) != 0) {
      AL10.alSourceStop(this.cLt.get(0));

      akW();
    }

    if (this.cLt.get(0) != 0) {
      this.cLt.position(0);
      AL10.alDeleteSources(this.cLt);
      this.cLt.put(0, 0);

      this.cLt.clear();
    }

    for (int i = 0; i < 2; i++) {
      int j = this.cLs.get(i);
      if (j != 0) {
        this.cLs.position(0);
        AL10.alDeleteBuffers(j);
        this.cLs.put(i, 0);
      }

      this.cLs.clear();
    }

    if (this.cLx != 0) {
      if (this.cLy)
        this.cLK.np(this.cLx);
      else {
        this.cLJ.np(this.cLx);
      }
      this.cLx = 0;
    }

    this.cLT = false;
    this.cLU = false;
    this.cMc = false;
  }

  private synchronized void cleanUp() {
    if (this.cLK == null) {
      return;
    }
    akV();

    if (this.cLH != null) {
      this.cLH.close();
      this.cLH.bTw();
      this.cLH = null;
    }

    this.cLx = 0;
    this.cLV = false;
    this.cLP = 0.0F;
    this.cLN = this.cLM;
    this.cLK = null;
  }

  private synchronized void akW()
  {
    if ((this.cLK == null) || (this.aFg)) {
      return;
    }
    int i = AL10.alGetSourcei(this.cLt.get(0), 4117);

    for (int j = 0; j < i; j++)
      AL10.alSourceUnqueueBuffers(this.cLt.get(0));
  }

  public synchronized void play()
  {
    this.cLT = false;
  }

  public synchronized int cs(long paramLong) {
    if (this.cLK == null) {
      return 1;
    }

    if ((this.cLX > 0L) && (paramLong > this.cLX)) {
      stop();
      return 1;
    }

    if (this.cLT)
    {
      return 1;
    }

    if (this.cMb) {
      return 2;
    }

    int i = 0;
    int j;
    if (!this.cLU)
    {
      for (j = 0; j < this.cLr; j++) {
        hu(this.cLs.get(j));
      }

      this.cMc = true;
      i = 1;
      this.cLU = true;
    } else {
      j = AL10.alGetSourcei(this.cLt.get(0), 4118);

      if (j > 0) {
        if (j > 4) {
          K.error("Processed buffers > 4 : " + j);
          try {
            bAw.check();
          } catch (Exception localException) {
            K.error("Exception ", localException);
          }
        } else {
          for (int k = 0; k < j; k++)
          {
            int m = AL10.alSourceUnqueueBuffers(this.cLt.get(0));

            if (this.cMa)
            {
              this.cMa = hu(m);
              this.cMc = true;
            }

          }

          i = 1;
        }
      }
      else this.cMc = false;

    }

    if ((i != 0) && (!isPlaying())) {
      AL10.alSourcePlay(this.cLt.get(0));
    }

    if ((this.cLY > 0L) && (paramLong > this.cLY)) {
      this.cLP = (this.cLN / (float)(this.cLX - this.cLY));
    }

    if (this.cLP != 0.0F) {
      ae(this.cLN + this.cLP);
    }
    if ((this.cLP < 0.0F) && (this.cLN == this.cLL))
      this.cLP = 0.0F;
    else if ((this.cLP > 0.0F) && (this.cLN == this.cLM)) {
      this.cLP = 0.0F;
    }
    if (((this.cLQ) || (this.cLR) || (this.cLS)) && (this.cLN == this.cLL)) {
      this.cLP = 0.0F;
      if (this.cLQ) {
        stop();
        return 1;
      }if (this.cLR) {
        alb();
        return 2;
      }
      akU();
      return 3;
    }

    return (this.cMa) || (isPlaying()) ? 0 : 1;
  }

  private int akX() {
    if ((this.cLK != null) && (!this.aFg)) {
      int i = AL10.alGetSourcei(this.cLt.get(0), 4112);

      return i;
    }
    return -1;
  }

  public synchronized boolean akY() {
    return this.cLU;
  }

  public synchronized boolean isActive() {
    return this.cMa;
  }

  public synchronized boolean akZ() {
    return this.aFg;
  }

  public synchronized boolean ala() {
    return this.cLK == null;
  }

  public synchronized boolean isPlaying() {
    return akX() == 4114;
  }

  public synchronized void alb() {
    if (this.cMb) {
      return;
    }

    int i = akX();
    if ((i == 4114) || (i == 4113) || (i == 4115))
    {
      if ((this.cLK != null) && (!this.aFg)) {
        AL10.alSourceStop(this.cLt.get(0));
      }

    }

    this.cMb = true;
  }

  public synchronized void alc() {
    this.cMb = false;
  }

  public synchronized void stop() {
    int i = akX();
    if ((i == 4114) || (i == 4113) || (i == 4115))
    {
      if (!this.aFg) {
        AL10.alSourceStop(this.cLt.get(0));
      }

      akW();
    }
    this.cLU = false;
    this.cMa = true;
    if (this.cLH != null)
      this.cLH.reset();
  }

  public synchronized void close() {
    if (this.cLH != null)
      this.cLH.close();
  }

  public synchronized void ald()
  {
    cleanUp();
  }

  public void ac(float paramFloat) {
    float f = alh();
    f *= paramFloat;
    ae(f);
  }

  public void ad(float paramFloat) {
    float f = alh();
    f *= paramFloat;
    af(f);
  }

  public void ale() {
    ae(alh());
  }

  public void alf() {
    af(alh());
  }

  public synchronized void setMute(boolean paramBoolean)
  {
    if (!this.aFg) {
      AL10.alSourcef(this.cLt.get(0), 4106, paramBoolean ? 0.0F : this.cLN * this.cLO);
    }

    this.cLV = paramBoolean;
  }

  public synchronized void ae(float paramFloat)
  {
    this.cLN = Math.min(this.cLM, Math.max(this.cLL, paramFloat));
    if (!this.aFg)
      if (this.cLV)
        AL10.alSourcef(this.cLt.get(0), 4106, 0.0F);
      else
        AL10.alSourcef(this.cLt.get(0), 4106, this.cLN * this.cLO);
  }

  public synchronized void af(float paramFloat)
  {
    paramFloat = Math.min(this.cLM, Math.max(this.cLL, paramFloat));
    if (!this.aFg)
      if (this.cLV)
        AL10.alSourcef(this.cLt.get(0), 4106, 0.0F);
      else
        AL10.alSourcef(this.cLt.get(0), 4106, paramFloat * this.cLO);
  }

  public int alg()
  {
    if (this.cLH != null) {
      return this.cLH.alg();
    }
    return 0;
  }

  public float alh() {
    return this.cLN;
  }

  public void ag(float paramFloat) {
    this.cLM = Math.min(1.0F, Math.max(0.0F, paramFloat));
    if (this.cLM < this.cLL) {
      float f = this.cLM;
      this.cLM = this.cLL;
      this.cLL = f;
    }

    ae(this.cLN);
  }

  public void ah(float paramFloat) {
    this.cLL = Math.min(1.0F, Math.max(0.0F, paramFloat));
    if (this.cLM < this.cLL) {
      float f = this.cLM;
      this.cLM = this.cLL;
      this.cLL = f;
    }
  }

  public float ali() {
    return this.cLL;
  }

  public float alj() {
    return this.cLM;
  }

  public float alk() {
    return this.cLO;
  }

  public void ai(float paramFloat) {
    this.cLO = paramFloat;
    ae(alh());
  }

  public synchronized void aj(float paramFloat) {
    this.cLC = paramFloat;
    if (!this.aFg)
      AL10.alSourcef(this.cLt.get(0), 4128, paramFloat);
  }

  public synchronized void ak(float paramFloat)
  {
    this.cLD = paramFloat;
    if (!this.aFg)
      AL10.alSourcef(this.cLt.get(0), 4131, paramFloat);
  }

  public synchronized void al(float paramFloat)
  {
    this.cLB = paramFloat;
    if (!this.aFg)
      AL10.alSourcef(this.cLt.get(0), 4129, paramFloat);
  }

  public synchronized void e(cEi paramcEi)
  {
    this.cLA[0] = paramcEi.getX();
    this.cLA[1] = paramcEi.getY();
    this.cLA[2] = paramcEi.aCv();

    if (!this.aFg)
      AL10.alSource3f(this.cLt.get(0), 4100, this.cLA[0], this.cLA[1], this.cLA[2]);
  }

  public synchronized void f(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.cLA[0] = paramFloat1;
    this.cLA[1] = paramFloat2;
    this.cLA[2] = paramFloat3;

    if (!this.aFg) {
      AL10.alSource3f(this.cLt.get(0), 4100, this.cLA[0], this.cLA[1], this.cLA[2]);
      try {
        bAw.check();
      } catch (Exception localException) {
        K.error("Exception", localException);
      }
    }
  }

  public long all() {
    if (this.cLH != null) {
      return this.cLH.all();
    }

    return -1L;
  }

  public synchronized int ct(long paramLong) {
    if (this.cLH != null) {
      return this.cLH.ct(paramLong);
    }

    return -1;
  }

  public synchronized long bG(boolean paramBoolean) {
    if ((this.cLH == null) || (this.cLK == null) || (this.aFg)) {
      return -1L;
    }

    long l = this.cLH.alm();

    if (paramBoolean) {
      int i = AL10.alGetSourcei(this.cLt.get(0), 4117);

      return this.cLH.alm() - 65536 / this.cLH.bTt() * i;
    }
    return l;
  }

  public long alm()
  {
    return bG(true);
  }

  public synchronized int cu(long paramLong) {
    if (this.cLH != null) {
      return this.cLH.cu(paramLong);
    }

    return -1;
  }

  public float aln() {
    if (this.cLH == null) {
      return 0.0F;
    }

    return this.cLH.aln();
  }

  public synchronized int am(float paramFloat) {
    if (this.cLH != null) {
      return this.cLH.am(paramFloat);
    }

    return -1;
  }

  public boolean alo() {
    return this.cMc;
  }

  public void an(float paramFloat) {
    this.cLQ = true;
    aq(paramFloat);
  }

  public void ao(float paramFloat) {
    this.cLR = true;
    aq(paramFloat);
  }

  public void ap(float paramFloat) {
    this.cLP = paramFloat;
  }

  public void q(float paramFloat1, float paramFloat2) {
    if (alj() < paramFloat1)
      ag(paramFloat1);
    if (paramFloat2 > 0.0F)
      this.cLP = ((paramFloat1 - alh()) * 10.0F / paramFloat2);
    else
      ae(paramFloat1);
  }

  public void aq(float paramFloat) {
    this.cLP = (-paramFloat);
  }

  public void cv(long paramLong) {
    this.cLX = paramLong;
  }

  public void cw(long paramLong) {
    this.cLY = paramLong;
  }

  public void hy(int paramInt) {
    this.cLZ = paramInt;
  }

  public void bH(boolean paramBoolean) {
    this.cLQ = paramBoolean;
  }

  public void bI(boolean paramBoolean) {
    this.cLR = paramBoolean;
  }

  public void bJ(boolean paramBoolean) {
    this.cLS = paramBoolean;
  }

  public boolean alp() {
    return this.cLQ;
  }

  public boolean alq() {
    return this.cLR;
  }

  public boolean alr() {
    return this.cLS;
  }

  public String getDescription() {
    if (this.cLH == null)
      return null;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("URL : ").append(this.cLH.getDescription());
    return localStringBuilder.toString();
  }

  public String als() {
    if (this.cLH == null) {
      return null;
    }

    return this.cLH.als();
  }

  public long alt() {
    if (this.cLH == null) {
      return -1L;
    }
    return bUD.getLong(this.cLH.als());
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("URL : ").append(this.cLH.getDescription());
    localStringBuilder.append("\n\tSample Rate : ").append(this.cLH.bTs()).append("Hz");
    localStringBuilder.append("\n\tChannels : ").append(this.cLH.bTr());

    return localStringBuilder.toString();
  }
}