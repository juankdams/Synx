import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.lwjgl.openal.OpenALException;

public class ciB extends aOv
{
  private static final boolean DEBUG = false;
  private static final Logger K = Logger.getLogger(ciB.class);
  public static final byte hHj = 4;
  public static final int hHk = 8000;
  public static final int hHl = 8000;
  private ZG hHm;
  private ZG hHn;
  private ZG hHo;
  private boolean dbs = false;
  private ZG hHp;
  private qx hHq = qx.aXH;
  private qx hHr = qx.aXH;

  private ArrayList hHs = null;
  private boolean hHt;
  private int hHu = 0;
  private int hHv = 0;
  private int hHw = 0;
  private int hHx = 0;
  private int hHy = 0;

  private long hHz = 0L;

  private cQG hHA = null;
  private float hHB = 0.0F;

  private boolean hHC = false;
  private boolean hHD = false;

  public boolean hHE = false;

  private int dms = 8000;
  private int dmt = 8000;

  private final Object hHF = new Object();

  public ciB(String paramString) {
    this(paramString, (byte)-1);
  }

  public ciB(String paramString, byte paramByte) {
    this(paramString, (byte)0, paramByte);
  }

  public ciB(String paramString, byte paramByte1, byte paramByte2) {
    super(paramString, paramByte1, paramByte2);
    dL(true);
    this.hHm = null;
    this.hHn = null;
    this.hHo = null;
  }

  public boolean aEk()
  {
    return this.hHE;
  }

  public void gY(boolean paramBoolean) {
    this.hHE = paramBoolean;
    this.hHw = 0;
    if (aEk())
      this.hHq = qx.aXI;
  }

  public final ZG ckk()
  {
    return this.hHm;
  }

  public final void vp(int paramInt) {
    this.dms = paramInt;
  }

  public final void fm(int paramInt) {
    this.dmt = paramInt;
  }

  public final synchronized ZG a(blq paramblq, float paramFloat) {
    return a(paramblq, paramFloat, false);
  }

  public synchronized void gZ(boolean paramBoolean) {
    if ((this.hHA != null) && (this.hHC != paramBoolean)) {
      this.hHD = true;
    }
    this.hHC = paramBoolean;
  }

  public void rY()
  {
  }

  public final synchronized ZG g(long paramLong, float paramFloat)
  {
    return b(paramLong, paramFloat, false);
  }

  public final synchronized void ha(boolean paramBoolean) {
    if (paramBoolean == this.dbs) {
      return;
    }

    this.dbs = paramBoolean;

    if (this.dbs) {
      this.hHp = this.hHm;
      if (this.hHp != null) {
        this.hHp.q(0.0F, this.dmt);
        this.hHp.bI(true);
      }
      this.hHr = this.hHq;
      this.hHq = qx.aXN;
      this.hHm = null;
    } else {
      if (this.hHp != null) {
        this.hHp.alc();
        if (this.hHr == qx.aXH) {
          this.hHp.q(0.0F, this.dmt);
          this.hHp.bH(true);
        } else {
          f(this.hHp);
        }
      } else if (this.hHm != null) {
        this.hHm.q(0.0F, this.dmt);
        this.hHm.bH(true);
      }
      this.hHq = this.hHr;
      this.hHp = null;
    }
  }

  public synchronized void K(long paramLong)
  {
    super.K(paramLong);
    synchronized (this.hHF) {
      cEi localcEi = cEi.ixN;
      try
      {
        if (this.hHm != null) {
          this.hHm.e(localcEi);
          try {
            switch (this.hHm.cs(paramLong)) {
            case 1:
            case 3:
              bAw.e(this.hHm);
              this.hHm = null;
              if ((this.hHq == qx.aXJ) || (this.hHq == qx.aXK))
              {
                this.hHq = qx.aXL;
              }
              break;
            }
          }
          catch (OpenALException localOpenALException1) {
            K.error("Exception", localOpenALException1);
            bAw.e(this.hHm);
            this.hHm = null;
          }
        }

        if (this.hHn != null) {
          this.hHn.e(localcEi);
          try {
            switch (this.hHn.cs(paramLong)) {
            case 1:
            case 3:
              bAw.e(this.hHn);
              this.hHn = null;
            }
          }
          catch (OpenALException localOpenALException2)
          {
            K.error("Exception", localOpenALException2);
            bAw.e(this.hHn);
            this.hHn = null;
          }
        }

        if (this.hHp != null) {
          this.hHp.e(localcEi);
          try {
            switch (this.hHp.cs(paramLong)) {
            case 1:
            case 3:
              bAw.e(this.hHp);
              this.hHp = null;
            }
          }
          catch (OpenALException localOpenALException3)
          {
            K.error("Exception", localOpenALException3);
            bAw.e(this.hHp);
            this.hHp = null;
          }
        }
      } catch (Exception localException) {
        K.error("Exception", localException);
      }

      if ((this.hHn != null) && (this.hHm == null)) {
        this.hHm = this.hHn;
        this.hHn = null;
      }

      if ((this.hHn == null) && (this.hHo != null)) {
        ZG localZG1 = this.hHo;
        this.hHo = null;
        f(localZG1);
      }
      long l1;
      switch (dgF.lbD[this.hHq.ordinal()]) {
      case 1:
        break;
      case 2:
        this.hHu = 0;
        if (this.hHs != null)
        {
          this.hHA = ((cQG)this.hHs.get(this.hHu));

          l1 = this.hHC ? this.hHA.cHt() : this.hHA.cHs();
          if ((this.hHp != null) && (this.hHp.alt() != l1)) {
            bAw.e(this.hHp);
            this.hHp = null;
            this.dbs = false;
            this.hHr = qx.aXJ;
          }

          ZG localZG2 = b(l1, this.hHA.cHu() / 100.0F, true);

          if ((this.hHA.cHw() == -1) || (localZG2 == null))
            this.hHv = -1;
          else {
            this.hHv = (this.hHA.cHw() * localZG2.alg());
          }
          this.hHw = 0;
          this.hHq = qx.aXJ;
        }break;
      case 3:
        if (!this.hHE) {
          this.hHw = ((int)(this.hHw + (paramLong - this.hHz)));
        }

        if ((this.hHv != -1) && (this.hHw + this.dmt > this.hHv)) {
          if (this.hHm != null) {
            this.hHm.q(0.0F, this.dmt);
            this.hHm.bH(true);
          }
          this.hHq = qx.aXK;
        } else if (this.hHD) {
          l1 = 0L;
          if (this.hHm.alo())
          {
            if (this.hHm != null) {
              l1 = this.hHm.alm();
            }

            long l3 = this.hHC ? this.hHA.cHt() : this.hHA.cHs();

            int j = this.dmt;
            int k = this.dms;
            this.dms = 200;
            this.dmt = 250;
            ZG localZG4 = b(l3, this.hHA.cHu() / 100.0F, true);
            this.dms = k;
            this.dmt = j;
            if (localZG4 != null) {
              localZG4.cu(l1);
            }

            this.hHD = false; } 
        }break;
      case 4:
        break;
      case 5:
        if (this.hHs != null)
        {
          int i = ((cQG)this.hHs.get(this.hHu)).cHv();
          this.hHA = null;
          this.hHq = qx.aXM;
          this.hHx = (i * 1000);
          this.hHy = 0;
        }break;
      case 6:
        if (this.hHs != null)
        {
          this.hHy = ((int)(this.hHy + (paramLong - this.hHz)));

          if (this.hHy > this.hHx) {
            this.hHx = (this.hHy = 0);
            this.hHu += 1;

            if (this.hHu == this.hHs.size()) {
              if (this.hHt) {
                this.hHu = 0;
              } else {
                this.hHs = null;
                this.hHq = qx.aXH;
                break;
              }
            }

            this.hHA = ((cQG)this.hHs.get(this.hHu));
            long l2 = this.hHC ? this.hHA.cHt() : this.hHA.cHs();
            ZG localZG3 = b(l2, this.hHA.cHu() / 100.0F, true);

            if ((this.hHA.cHw() == -1) || (localZG3 == null))
              this.hHv = -1;
            else {
              this.hHv = (this.hHA.cHw() * localZG3.alg());
            }
            this.hHw = 0;
            this.hHq = qx.aXJ; } 
        }break;
      case 7:
        break;
      }

      this.hHz = paramLong;
    }
  }

  public final synchronized void stop()
  {
    synchronized (this.hHF) {
      if (this.hHm != null) {
        bAw.e(this.hHm);
        this.hHm = null;
      }
      if (this.hHn != null) {
        bAw.e(this.hHn);
        this.hHn = null;
      }
      if (this.hHo != null) {
        bAw.e(this.hHo);
        this.hHo = null;
      }
    }
  }

  public final synchronized void b(ZG paramZG) {
    synchronized (this.hHF) {
      if (this.hHm == paramZG) {
        bAw.e(this.hHm);
        this.hHm = null;
      }
      if (this.hHn == paramZG) {
        bAw.e(this.hHn);
        this.hHn = null;
      }
      if (this.hHo == paramZG) {
        bAw.e(this.hHo);
        this.hHo = null;
      }
    }
  }

  public synchronized void alb() {
    synchronized (this.hHF) {
      if (this.hHm != null) {
        this.hHm.stop();
      }
      if (this.hHn != null)
        this.hHn.stop();
    }
  }

  public synchronized void restart()
  {
    synchronized (this.hHF) {
      if (this.hHm != null) {
        try {
          this.hHm.play();
        } catch (Exception localException1) {
          K.warn("Impossible de redémarrer la musique");
        }
      }
      if (this.hHn != null)
        try {
          this.hHn.play();
        } catch (Exception localException2) {
          K.warn("Impossible de redémarrer la musique");
        }
    }
  }

  public boolean bk(int paramInt)
  {
    if (!bB) throw new AssertionError("On peut pas appliquer de reverb sur de la musique");

    return true;
  }

  public Collection rZ()
  {
    if (!bB) throw new AssertionError("Ne doit pas etre appelé");
    return null;
  }

  public ZG a(blq paramblq, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong)
  {
    if (!bB) throw new AssertionError("Ne doit pas être appelé");
    return null;
  }

  public void a(ZG paramZG)
  {
    if (!bB) throw new AssertionError("Ne doit pas être appelé"); 
  }

  public final synchronized void w(float paramFloat)
  {
    float f = alh();
    if (this.hHm != null)
      this.hHm.ai(f);
    if (this.hHn != null)
      this.hHn.ai(f);
    if (this.hHo != null)
      this.hHo.ai(f);
  }

  public final void d(float paramFloat1, float paramFloat2)
  {
  }

  public final void e(float paramFloat1, float paramFloat2)
  {
  }

  public final synchronized void c(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.hHm != null)
      this.hHm.setMute(paramBoolean2);
    if (this.hHn != null)
      this.hHn.setMute(paramBoolean2);
    if (this.hHo != null)
      this.hHo.setMute(paramBoolean2);
  }

  public final qx ckl() {
    return this.hHq;
  }

  public final synchronized void S(ArrayList paramArrayList) {
    b(paramArrayList, false);
  }

  public final synchronized void b(ArrayList paramArrayList, boolean paramBoolean) {
    if (this.hHs == paramArrayList) {
      return;
    }

    this.hHt = paramBoolean;
    qx localqx;
    if (paramArrayList == null)
      localqx = qx.aXH;
    else {
      localqx = qx.aXI;
    }

    if (this.hHq == qx.aXN)
      this.hHr = localqx;
    else {
      this.hHq = localqx;
    }

    if ((this.hHq == qx.aXH) && (this.hHm != null)) {
      this.hHm.q(0.0F, this.dmt);
      this.hHm.bH(true);
    }

    this.hHs = paramArrayList;
  }

  public final synchronized void cb(float paramFloat)
  {
    if (this.hHm != null) {
      this.hHm.q(0.0F, paramFloat);
      this.hHm.bH(true);
    }
    if (this.hHn != null) {
      this.hHn.q(0.0F, paramFloat);
      this.hHn.bH(true);
    }
    if (this.hHp != null) {
      this.hHp.q(0.0F, paramFloat);
      this.hHp.bH(true);
    }

    if (this.hHo != null) {
      bAw.e(this.hHo);
      this.hHo = null;
    }
  }

  public final synchronized void ckm() {
    cb(this.dmt);
  }

  private ZG b(long paramLong, float paramFloat, boolean paramBoolean)
  {
    if (this.euV != null) {
      blq localblq;
      try {
        localblq = this.euV.gL(paramLong);
      } catch (IOException localIOException) {
        K.error("Impossible de charger le son d'id " + paramLong);
        return null;
      }
      if (localblq != null)
        return a(localblq, paramFloat, paramBoolean);
    } else {
      K.error("AudioResourceHelper non spécifié.");
    }
    return null;
  }

  private ZG a(blq paramblq, float paramFloat, boolean paramBoolean)
  {
    synchronized (this.hHF)
    {
      if ((this.hHm != null) && (this.hHm.isPlaying()) && (this.hHm.alh() > 0.0F)) {
        if (this.hHm.akP().getDescription().equals(paramblq.getDescription()))
          return this.hHm;
      } else if ((this.hHn != null) && (this.hHn.isPlaying()) && (this.hHn.alh() > 0.0F) && 
        (this.hHn.akP().getDescription().equals(paramblq.getDescription()))) {
        return this.hHn;
      }

      ZG localZG = a(paramblq, -1L);
      if (localZG != null) {
        localZG.bE(true);
        localZG.ag(paramFloat);
        localZG.ai(alh());
        f(localZG);
        if (!paramBoolean) {
          ckn();
        }
      }
      return localZG;
    }
  }

  private void f(ZG paramZG)
  {
    if (paramZG == null)
      return;
    if (this.hHn == null) {
      if (this.hHm != null) {
        this.hHm.q(0.0F, this.dmt);
        this.hHm.bH(true);
      }
      this.hHn = this.hHm;
      this.hHm = paramZG;
    } else {
      if (this.hHo != null) {
        bAw.e(this.hHo);
      }
      this.hHo = paramZG;

      return;
    }

    paramZG.setMute(bfl());
    try {
      paramZG.ae(0.0F);
      paramZG.play();
      paramZG.q(paramZG.alj(), this.dms);
    } catch (Exception localException) {
      K.error("Exception levée durant le crossfading :", localException);
      bAw.e(paramZG);
      this.hHm = null;
      this.hHo = null;
      this.hHn = null;
    }
  }

  private void ckn() {
    this.hHq = qx.aXH;
    this.hHs = null;
  }
}