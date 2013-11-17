import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class cTy extends dNE
  implements ccR
{
  private final List edz = new ArrayList();

  private final WX kFW = new WX(this);

  private final ExecutorService edB = Executors.newSingleThreadExecutor();
  private Zs kFX;
  private tH kFY;
  private aQy edE;
  private ctQ cJS;
  private int kxJ = bZY.hqD.value();
  private aGC doK;
  private Object kxN;
  private final AtomicBoolean edF = new AtomicBoolean();

  public cTy(djj paramdjj, bSW parambSW)
  {
    super(paramdjj, parambSW);
    aHA.debug("DefaultMediaListPlayer(libvlc={}, instance={})", new Object[] { paramdjj, parambSW });
    aTS();
  }

  public void b(on paramon)
  {
    aHA.debug("addMediaPlayerEventListener(listener={})", new Object[] { paramon });
    this.edz.add(paramon);
  }

  public void c(on paramon)
  {
    aHA.debug("removeMediaPlayerEventListener(listener={})", new Object[] { paramon });
    this.edz.remove(paramon);
  }

  public void uF(int paramInt)
  {
    aHA.debug("enableEvents(eventMask={})", new Object[] { Integer.valueOf(paramInt) });
    this.kxJ = paramInt;
  }

  public void l(ctQ paramctQ)
  {
    aHA.debug("setMediaPlayer(mediaPlayer={})", new Object[] { paramctQ });
    this.cJS = paramctQ;
    this.le.a(this.kFX, paramctQ.csu());
  }

  public void c(aGC paramaGC)
  {
    aHA.debug("setMediaList(mediaList={})", new Object[] { paramaGC });
    this.le.a(this.kFX, paramaGC.aSD());
    this.doK = paramaGC;
  }

  public aGC aTR()
  {
    aHA.debug("getMediaList()", new Object[0]);
    return this.doK;
  }

  public void play()
  {
    aHA.debug("play()", new Object[0]);

    if ((this.cJS instanceof coc)) {
      ((coc)this.cJS).cok();
    }
    this.le.d(this.kFX);
  }

  public void alb()
  {
    aHA.debug("pause()", new Object[0]);
    this.le.e(this.kFX);
  }

  public void stop()
  {
    aHA.debug("stop()", new Object[0]);
    this.le.h(this.kFX);
  }

  public boolean uG(int paramInt)
  {
    aHA.debug("playItem(itemIndex={})", new Object[] { Integer.valueOf(paramInt) });
    if ((this.doK != null) && (paramInt >= 0) && (paramInt < this.doK.size())) {
      return this.le.a(this.kFX, paramInt) == 0;
    }

    throw new IllegalArgumentException("Item index is out of bounds");
  }

  public void cfO()
  {
    aHA.debug("playNext()", new Object[0]);
    this.le.i(this.kFX);
  }

  public void cfP()
  {
    aHA.debug("playPrevious()", new Object[0]);
    this.le.j(this.kFX);
  }

  public boolean isPlaying()
  {
    aHA.debug("isPlaying()", new Object[0]);
    return this.le.f(this.kFX) != 0;
  }

  public void a(vx paramvx)
  {
    aHA.debug("setMode(mode={})", new Object[] { paramvx });
    cCY localcCY;
    switch (dSA.moF[paramvx.ordinal()]) {
    case 1:
      localcCY = cCY.ivE;
      break;
    case 2:
      localcCY = cCY.ivF;
      break;
    case 3:
      localcCY = cCY.ivG;
      break;
    default:
      throw new IllegalArgumentException("Invalid mode " + paramvx);
    }
    this.le.b(this.kFX, localcCY.intValue());
  }

  public String c(jJ paramjJ)
  {
    aHA.debug("mrl(mediaInstance={})", new Object[] { paramjJ });
    return dBU.a(this.le, this.le.h(paramjJ));
  }

  public Object cfQ()
  {
    aHA.debug("userData()", new Object[0]);
    return this.kxN;
  }

  public void aW(Object paramObject)
  {
    aHA.debug("userData(userData={})", new Object[] { paramObject });
    this.kxN = paramObject;
  }

  public final void release()
  {
    aHA.debug("release()", new Object[0]);
    if (this.edF.compareAndSet(false, true))
      aSA();
  }

  private void aTS()
  {
    aHA.debug("createInstance()", new Object[0]);

    this.kFX = this.le.j(this.lf);

    this.kFY = this.le.c(this.kFX);
    aHA.debug("mediaListPlayerEventManager={}", new Object[] { this.kFY });

    aSB();

    b(new cmo(this, null));
  }

  private void aSA()
  {
    aHA.debug("destroyInstance()", new Object[0]);

    aHA.debug("Detach events...", new Object[0]);
    aSC();
    aHA.debug("Events detached.", new Object[0]);

    this.edz.clear();
    if (this.kFX != null) {
      aHA.debug("Release media list player...", new Object[0]);
      this.le.a(this.kFX);
      aHA.debug("Media list player released", new Object[0]);
    }

    aHA.debug("Shut down listeners...", new Object[0]);
    this.edB.shutdown();
    aHA.debug("Listeners shut down.", new Object[0]);
  }

  private void aSB()
  {
    aHA.debug("registerEventListener()", new Object[0]);
    this.edE = new bAt(this, null);
    for (dWm localdWm : dWm.values())
    {
      if ((localdWm.intValue() >= dWm.mwd.intValue()) && (localdWm.intValue() <= dWm.mwe.intValue())) {
        aHA.debug("event={}", new Object[] { localdWm });
        int k = this.le.a(this.kFY, localdWm.intValue(), this.edE, null);
        aHA.debug("result={}", new Object[] { Integer.valueOf(k) });
      }
    }
  }

  private void aSC()
  {
    aHA.debug("deregisterEventListener()", new Object[0]);
    if (this.edE != null) {
      for (dWm localdWm : dWm.values())
      {
        if ((localdWm.intValue() >= dWm.mwd.intValue()) && (localdWm.intValue() <= dWm.mwe.intValue())) {
          aHA.debug("event={}", new Object[] { localdWm });
          this.le.b(this.kFY, localdWm.intValue(), this.edE, null);
        }
      }
      this.edE = null;
    }
  }

  protected void finalize()
  {
    aHA.debug("finalize()", new Object[0]);
    aHA.debug("Media list player has been garbage collected", new Object[0]);
    super.finalize();
  }
}