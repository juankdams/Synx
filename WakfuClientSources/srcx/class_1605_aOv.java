import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public abstract class aOv
  implements cUV
{
  private static final boolean DEBUG = false;
  protected static final Logger K = Logger.getLogger(aOv.class);

  private byte euO = 0;
  private byte euP = 0;
  private float euQ;
  private float cLO;
  private float cLN;
  private float cLM;
  private float cLP;
  private float euR;
  private boolean euS;
  private boolean euT;
  private final String m_name;
  protected dNN euU;
  protected bAw cLJ;
  protected dLQ euV;
  protected int euW = 0;
  protected boolean euX;
  protected byte euY = 0;

  private boolean bur = true;

  private final ArrayList euZ = new ArrayList();
  private final ArrayList eva = new ArrayList();
  private final ArrayList evb = new ArrayList();
  private byte evc;

  protected aOv(String paramString)
  {
    this(paramString, (byte)-1);
  }

  protected aOv(String paramString, byte paramByte) {
    this(paramString, (byte)0, paramByte);
  }

  protected aOv(String paramString, byte paramByte1, byte paramByte2) {
    this.cLN = 1.0F;
    this.cLO = 1.0F;
    this.euQ = 1.0F;
    this.cLM = 1.0F;
    this.euS = false;
    this.euT = false;
    this.m_name = paramString;
    this.euU = null;
    this.cLP = 0.0F;
    this.euY = paramByte1;
    this.evc = paramByte2;
  }

  public boolean no(int paramInt) {
    if (paramInt > this.euO - this.euP) {
      return false;
    }

    this.euP = ((byte)(this.euP + paramInt));

    return true;
  }

  public boolean np(int paramInt) {
    if (this.euP < paramInt) {
      return false;
    }

    this.euP = ((byte)(this.euP - paramInt));

    return true;
  }

  public void a(bIH parambIH) {
    this.eva.add(parambIH);
  }

  public void b(bIH parambIH) {
    this.evb.add(parambIH);
  }

  public byte bfd() {
    return this.euO;
  }

  public boolean bV(byte paramByte)
  {
    if ((!bB) && (paramByte < 0)) throw new AssertionError("Nombre de voix invalide");
    if (paramByte == this.euO) {
      return false;
    }

    if (paramByte > this.euO) {
      if (!this.cLJ.no(paramByte - this.euO)) {
        return false;
      }
    }
    else if (!this.cLJ.np(this.euO - paramByte)) {
      return false;
    }

    this.euO = paramByte;
    return true;
  }

  public byte bfe() {
    return this.evc;
  }

  public byte akN() {
    return this.euY;
  }

  public void bW(byte paramByte) {
    this.euY = paramByte;
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean) {
    this.bur = paramBoolean;
  }

  public dNN bff()
  {
    return this.euU;
  }

  public void a(dNN paramdNN) {
    this.euU = paramdNN;
  }

  public void a(bAw parambAw) {
    this.cLJ = parambAw;
  }

  public bAw bfg() {
    return this.cLJ;
  }

  public final void a(dLQ paramdLQ) {
    this.euV = paramdLQ;
  }

  public final dLQ bfh() {
    if ((!bB) && (this.euV == null)) throw new AssertionError("Il faut d'abord initialiser en  appelant setHelper");
    return this.euV;
  }

  public float alk() {
    return this.cLO;
  }

  public void ai(float paramFloat) {
    this.cLO = paramFloat;
    w(this.cLO);
  }

  public float bfi() {
    return this.euQ;
  }

  public void aT(float paramFloat) {
    this.euQ = paramFloat;
    ai(this.euQ);
  }

  public void aU(float paramFloat) {
    ai(this.euQ * paramFloat);
  }

  public float bfj() {
    return this.cLO / this.euQ;
  }

  public final float alh()
  {
    return this.cLN * this.cLO;
  }

  public final float bfk() {
    return this.cLN;
  }

  public final void ae(float paramFloat)
  {
    if (this.cLN != paramFloat) {
      float f = this.cLN;
      this.cLN = paramFloat;
      d(f, this.cLN);
      w(alk());
    }
  }

  public final void ag(float paramFloat)
  {
    if (this.cLM != paramFloat) {
      e(this.cLM, paramFloat);
      w(alk());
      this.cLM = paramFloat;
    }
  }

  public final float alj() {
    return this.cLM;
  }

  public final boolean bfl()
  {
    return this.euS;
  }

  public final void setMute(boolean paramBoolean)
  {
    c(this.euS, paramBoolean);
    this.euS = paramBoolean;
  }

  public boolean bfm() {
    return (this.bur) && ((!this.euS) || (this.euT));
  }

  public boolean bfn() {
    return this.euT;
  }

  public void dL(boolean paramBoolean) {
    this.euT = paramBoolean;
  }

  public String getName() {
    return this.m_name;
  }

  public abstract Collection rZ();

  public abstract ZG a(blq paramblq, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong);

  public ZG a(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong2)
  {
    if ((this.euV != null) && (bfm())) {
      blq localblq;
      try {
        localblq = this.euV.gL(paramLong1);
      } catch (IOException localIOException) {
        K.error("Impossible de charger le son d'id " + paramLong1);
        return null;
      }

      if (localblq == null) {
        K.error("Impossible de charger le son d'id " + paramLong1);
        return null;
      }

      return a(localblq, paramBoolean1, paramBoolean2, paramBoolean3, paramLong2);
    }
    return null;
  }

  public abstract void a(ZG paramZG);

  public abstract void d(float paramFloat1, float paramFloat2);

  public abstract void w(float paramFloat);

  public abstract void e(float paramFloat1, float paramFloat2);

  public abstract void c(boolean paramBoolean1, boolean paramBoolean2);

  public ZG A(long paramLong1, long paramLong2)
  {
    blq localblq;
    try
    {
      localblq = this.euV.gL(paramLong1);
    } catch (IOException localIOException) {
      K.error("Impossible de préparer le son d'id " + paramLong1, localIOException);
      return null;
    }
    if (localblq == null) {
      K.error("Impossible de préparer le son d'id " + paramLong1);
      return null;
    }

    return a(localblq, paramLong2);
  }

  public ZG a(blq paramblq, long paramLong) {
    if (bfm()) {
      return this.cLJ.a(paramblq, this, paramLong);
    }

    return null;
  }

  public abstract void rY();

  public void K(long paramLong) {
    for (int i = this.eva.size() - 1; i >= 0; i--) {
      this.euZ.add(this.eva.remove(i));
    }

    for (i = this.evb.size() - 1; i >= 0; i--) {
      this.euZ.remove(this.evb.remove(i));
    }

    i = 0; for (int j = this.euZ.size(); i < j; i++) {
      ((bIH)this.euZ.get(i)).a(this, paramLong);
    }

    float f = 0.0F;
    if (this.cLP > 0.0F)
      f = Math.min(this.euR, this.cLN + this.cLP);
    else if (this.cLP < 0.0F)
      f = Math.max(this.euR, this.cLN + this.cLP);
    else {
      return;
    }

    if (f == this.euR) {
      this.cLP = 0.0F;
      this.euR = 0.0F;
    }

    ae(f);
  }

  public void q(float paramFloat1, float paramFloat2) {
    if (paramFloat2 > 0.0F) {
      if (paramFloat1 < 0.0F)
        paramFloat1 = 0.0F;
      else if (paramFloat1 > alj()) {
        ag(paramFloat1);
      }
      this.euR = paramFloat1;
      this.cLP = ((paramFloat1 - alh()) * 10.0F / paramFloat2);
    }
  }

  public abstract void stop();

  public abstract void b(ZG paramZG);

  public void alb()
  {
  }

  public void restart()
  {
  }

  public boolean bk(int paramInt)
  {
    if (this.euW == paramInt) {
      return false;
    }

    this.euW = paramInt;
    return true;
  }

  public boolean bfo() {
    return this.euX;
  }

  public void dM(boolean paramBoolean) {
    this.euX = paramBoolean;
  }
}