import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.imageio.ImageIO;

public abstract class cOS extends dNE
  implements ctQ
{
  private final CopyOnWriteArrayList kxF = new CopyOnWriteArrayList();

  private final cMr kxG = new cMr(this);

  private final ExecutorService edB = Executors.newSingleThreadExecutor();
  private aZo kxH;
  private tH kxI;
  private aQy edE;
  private jJ cTD;
  private int kxJ = a.I.value();
  private String[] edG;
  private cQz kxK;
  private boolean repeat;
  private boolean kxL;
  private int hUO;
  private String kxM;
  private Object kxN;
  private final AtomicBoolean edF = new AtomicBoolean();

  public cOS(djj paramdjj, bSW parambSW)
  {
    super(paramdjj, parambSW);
    aHA.debug("DefaultMediaPlayer(libvlc={}, instance={})", new Object[] { paramdjj, parambSW });
    aTS();
  }

  public void b(bjk parambjk)
  {
    aHA.debug("addMediaPlayerEventListener(listener={})", new Object[] { parambjk });
    this.kxF.add(parambjk);
  }

  public void c(bjk parambjk)
  {
    aHA.debug("removeMediaPlayerEventListener(listener={})", new Object[] { parambjk });
    this.kxF.remove(parambjk);
  }

  public void uF(int paramInt)
  {
    aHA.debug("enableEvents(eventMask={})", new Object[] { Integer.valueOf(paramInt) });
    this.kxJ = paramInt;
  }

  public void k(String[] paramArrayOfString)
  {
    aHA.debug("setStandardMediaOptions(options={})", new Object[] { Arrays.toString(paramArrayOfString) });
    this.edG = paramArrayOfString;
  }

  public boolean j(String paramString, String[] paramArrayOfString)
  {
    aHA.debug("playMedia(mrl={},mediaOptions={})", new Object[] { paramString, Arrays.toString(paramArrayOfString) });

    if (k(paramString, paramArrayOfString))
    {
      play();
      return true;
    }

    return false;
  }

  public boolean k(String paramString, String[] paramArrayOfString)
  {
    aHA.debug("prepareMedia(mrl={},mediaOptions={})", new Object[] { paramString, Arrays.toString(paramArrayOfString) });
    return n(paramString, paramArrayOfString);
  }

  public boolean l(String paramString, String[] paramArrayOfString)
  {
    aHA.debug("startMedia(mrl={}, mediaOptions)", new Object[] { paramString, Arrays.toString(paramArrayOfString) });

    if (k(paramString, paramArrayOfString))
    {
      return new aRG(this).bhV();
    }

    return false;
  }

  public void crm()
  {
    aHA.debug("parseMedia()", new Object[0]);
    if (this.cTD != null) {
      this.le.o(this.cTD);
    }
    else
      throw new IllegalStateException("No media");
  }

  public void crn()
  {
    aHA.debug("requestParseMedia()", new Object[0]);
    if (this.cTD != null) {
      this.le.p(this.cTD);
    }
    else
      throw new IllegalStateException("No media");
  }

  public boolean cro()
  {
    aHA.debug("isMediaParsed()", new Object[0]);
    if (this.cTD != null) {
      return 0 != this.le.q(this.cTD);
    }

    throw new IllegalStateException("No media");
  }

  public bwh crp()
  {
    aHA.debug("getMediaMeta()", new Object[0]);
    return d(this.cTD);
  }

  public bwh d(jJ paramjJ)
  {
    aHA.debug("getMediaMeta(media={})", new Object[] { paramjJ });
    if (paramjJ != null) {
      return new cWr(this.le, paramjJ);
    }

    throw new IllegalStateException("No media");
  }

  public List crq()
  {
    aHA.debug("getSubItemMediaMeta()", new Object[0]);
    return (List)a(new avM(this));
  }

  public void B(String[] paramArrayOfString)
  {
    aHA.debug("addMediaOptions(mediaOptions={})", new Object[] { Arrays.toString(paramArrayOfString) });
    if (this.cTD != null) {
      for (String str : paramArrayOfString) {
        aHA.debug("mediaOption={}", new Object[] { str });
        this.le.a(this.cTD, str);
      }
    }
    else
      throw new IllegalStateException("No media");
  }

  public void hz(boolean paramBoolean)
  {
    aHA.debug("setRepeat(repeat={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.repeat = paramBoolean;
  }

  public boolean crr()
  {
    aHA.debug("getRepeat()", new Object[0]);
    return this.repeat;
  }

  public void hA(boolean paramBoolean)
  {
    aHA.debug("setPlaySubItems(playSubItems={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.kxL = paramBoolean;
  }

  public int crs()
  {
    aHA.debug("subItemCount()", new Object[0]);
    return ((Integer)a(new avt(this))).intValue();
  }

  public int crt()
  {
    return this.hUO;
  }

  public List cru()
  {
    aHA.debug("subItems()", new Object[0]);
    return (List)a(new avu(this));
  }

  public List crv()
  {
    aHA.debug("subItemsMedia()", new Object[0]);
    return (List)a(new avr(this));
  }

  public aGC crw()
  {
    aHA.debug("subItemsMediaList()", new Object[0]);
    aGC localaGC;
    if (this.cTD != null) {
      bEv localbEv = this.le.l(this.cTD);
      localaGC = new aGC(this.le, this.lf, localbEv);
      this.le.b(localbEv);
    }
    else {
      localaGC = null;
    }
    return localaGC;
  }

  public boolean C(String[] paramArrayOfString)
  {
    aHA.debug("playNextSubItem(mediaOptions={})", new Object[] { Arrays.toString(paramArrayOfString) });
    return a(this.hUO + 1, paramArrayOfString);
  }

  public boolean a(int paramInt, String[] paramArrayOfString)
  {
    aHA.debug("playSubItem(index={},mediaOptions={})", new Object[] { Integer.valueOf(paramInt), Arrays.toString(paramArrayOfString) });
    return ((Boolean)a(new avs(this, paramInt, paramArrayOfString))).booleanValue();
  }

  public boolean crx()
  {
    aHA.trace("isPlayable()", new Object[0]);
    return this.le.r(this.kxH) == 1;
  }

  public boolean isPlaying()
  {
    aHA.trace("isPlaying()", new Object[0]);
    return this.le.e(this.kxH) == 1;
  }

  public boolean aPG()
  {
    aHA.trace("isSeekable()", new Object[0]);
    return this.le.A(this.kxH) == 1;
  }

  public boolean cry()
  {
    aHA.trace("canPause()", new Object[0]);
    return this.le.B(this.kxH) == 1;
  }

  public long getLength()
  {
    aHA.trace("getLength()", new Object[0]);
    return this.le.m(this.kxH);
  }

  public long getTime()
  {
    aHA.trace("getTime()", new Object[0]);
    return this.le.n(this.kxH);
  }

  public float getPosition()
  {
    aHA.trace("getPosition()", new Object[0]);
    return this.le.o(this.kxH);
  }

  public float crz()
  {
    aHA.trace("getFps()", new Object[0]);
    return this.le.y(this.kxH);
  }

  public float crA()
  {
    aHA.trace("getRate()", new Object[0]);
    return this.le.w(this.kxH);
  }

  public int crB()
  {
    aHA.trace("getVideoOutputs()", new Object[0]);
    return this.le.z(this.kxH);
  }

  public Dimension crC()
  {
    aHA.debug("getVideoDimension()", new Object[0]);
    if (crB() > 0) {
      cjs localcjs1 = new cjs();
      cjs localcjs2 = new cjs();
      int i = this.le.a(this.kxH, 0, localcjs1, localcjs2);
      if (i == 0) {
        return new Dimension(localcjs1.getValue(), localcjs2.getValue());
      }

      aHA.warn("Video size is not available", new Object[0]);
      return null;
    }

    aHA.warn("Can't get video dimension if no video output has been started", new Object[0]);
    return null;
  }

  public dRg crD()
  {
    aHA.debug("getMediaDetails()", new Object[0]);

    if (isPlaying()) {
      dRg localdRg = new dRg();
      localdRg.DI(crJ());
      localdRg.DJ(crL());
      localdRg.DK(crN());
      localdRg.DL(csd());
      localdRg.N(csj());
      localdRg.O(csk());
      localdRg.P(csl());
      localdRg.Q(csm());
      localdRg.R(cso());
      return localdRg;
    }

    aHA.warn("Can't get media meta data if media is not playing", new Object[0]);
    return null;
  }

  public String crE()
  {
    aHA.debug("getAspectRatio()", new Object[0]);
    return dBU.a(this.le, this.le.I(this.kxH));
  }

  public float getScale()
  {
    aHA.debug("getScale()", new Object[0]);
    return this.le.H(this.kxH);
  }

  public String crF()
  {
    aHA.debug("getCropGeometry()", new Object[0]);
    return dBU.a(this.le, this.le.O(this.kxH));
  }

  public cQz crG()
  {
    aHA.trace("getMediaStatistics()", new Object[0]);
    return e(this.cTD);
  }

  public cQz e(jJ paramjJ)
  {
    aHA.trace("getMediaStatistics(media={})", new Object[] { paramjJ });

    if ((isPlaying()) && (paramjJ != null)) {
      this.le.a(paramjJ, this.kxK);
    }
    return this.kxK;
  }

  public bGj crH()
  {
    aHA.debug("getMediaState()", new Object[0]);
    bGj localbGj = null;
    if (this.cTD != null) {
      localbGj = bGj.sM(this.le.k(this.cTD));
    }
    return localbGj;
  }

  public bGj crI()
  {
    aHA.debug("getMediaPlayerState()", new Object[0]);
    return bGj.sM(this.le.x(this.kxH));
  }

  public int crJ()
  {
    aHA.debug("getTitleCount()", new Object[0]);
    return this.le.t(this.kxH);
  }

  public int crK()
  {
    aHA.debug("getTitle()", new Object[0]);
    return this.le.s(this.kxH);
  }

  public void ws(int paramInt)
  {
    aHA.debug("setTitle(title={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.f(this.kxH, paramInt);
  }

  public int crL()
  {
    aHA.debug("getVideoTrackCount()", new Object[0]);
    return this.le.R(this.kxH);
  }

  public int crM()
  {
    aHA.debug("getVideoTrack()", new Object[0]);
    return this.le.T(this.kxH);
  }

  public int wt(int paramInt)
  {
    aHA.debug("setVideoTrack(track={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.n(this.kxH, paramInt);
    return crM();
  }

  public int crN()
  {
    aHA.debug("getVideoTrackCount()", new Object[0]);
    return this.le.Y(this.kxH);
  }

  public int crO()
  {
    aHA.debug("getAudioTrack()", new Object[0]);
    return this.le.aa(this.kxH);
  }

  public int wu(int paramInt)
  {
    aHA.debug("setAudioTrack(track={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.w(this.kxH, paramInt);
    return crO();
  }

  public void play()
  {
    aHA.debug("play()", new Object[0]);
    cBV();
    this.le.f(this.kxH);
    aHA.debug("after play", new Object[0]);
  }

  public boolean start()
  {
    return new aRG(this).bhV();
  }

  public void stop()
  {
    aHA.debug("stop()", new Object[0]);
    this.le.h(this.kxH);
  }

  public void hB(boolean paramBoolean)
  {
    aHA.debug("setPause(pause={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.le.a(this.kxH, paramBoolean ? 1 : 0);
  }

  public void alb()
  {
    aHA.debug("pause()", new Object[0]);
    this.le.g(this.kxH);
  }

  public void nextFrame()
  {
    aHA.debug("nextFrame()", new Object[0]);
    this.le.C(this.kxH);
  }

  public void hK(long paramLong)
  {
    aHA.debug("skip(delta={})", new Object[] { Long.valueOf(paramLong) });
    long l = getTime();
    aHA.debug("current={}", new Object[] { Long.valueOf(l) });
    if (l != -1L)
      setTime(l + paramLong);
  }

  public void ce(float paramFloat)
  {
    aHA.debug("skipPosition(delta={})", new Object[] { Float.valueOf(paramFloat) });
    float f = getPosition();
    aHA.debug("current={}", new Object[] { Float.valueOf(f) });
    if (f != -1.0F)
      cf(f + paramFloat);
  }

  public void setTime(long paramLong)
  {
    aHA.debug("setTime(time={})", new Object[] { Long.valueOf(paramLong) });
    this.le.b(this.kxH, Math.max(paramLong, 0L));
  }

  public void cf(float paramFloat)
  {
    aHA.debug("setPosition(position={})", new Object[] { Float.valueOf(paramFloat) });
    this.le.a(this.kxH, Math.max(paramFloat, 0.0F));
  }

  public int cg(float paramFloat)
  {
    aHA.debug("setRate(rate={})", new Object[] { Float.valueOf(paramFloat) });
    return this.le.b(this.kxH, paramFloat);
  }

  public void mj(String paramString)
  {
    aHA.debug("setAspectRatio(aspectRatio={})", new Object[] { paramString });
    this.le.a(this.kxH, paramString);
  }

  public void setScale(float paramFloat)
  {
    aHA.debug("setScale(factor={})", new Object[] { Float.valueOf(paramFloat) });
    this.le.c(this.kxH, paramFloat);
  }

  public void mk(String paramString)
  {
    aHA.debug("setCropGeometry(cropGeometry={})", new Object[] { paramString });
    this.le.c(this.kxH, paramString);
  }

  public boolean ml(String paramString)
  {
    aHA.debug("setAudioOutput(output={})", new Object[] { paramString });
    return 0 == this.le.e(this.kxH, paramString);
  }

  public void az(String paramString1, String paramString2)
  {
    aHA.debug("setAudioOutputDevice(output={},outputDeviceId={})", new Object[] { paramString1, paramString2 });
    this.le.a(this.kxH, paramString1, paramString2);
  }

  public void a(aOR paramaOR)
  {
    aHA.debug("setAudioOutputDeviceType(deviceType={})", new Object[0]);
    this.le.t(this.kxH, paramaOR.intValue());
  }

  public aOR crP()
  {
    aHA.debug("getAudioOutputDeviceType()", new Object[0]);
    return aOR.nt(this.le.U(this.kxH));
  }

  public void crQ()
  {
    aHA.debug("mute()", new Object[0]);
    this.le.V(this.kxH);
  }

  public void hC(boolean paramBoolean)
  {
    aHA.debug("mute(mute={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.le.u(this.kxH, paramBoolean ? 1 : 0);
  }

  public boolean bfl()
  {
    aHA.debug("isMute()", new Object[0]);
    return this.le.W(this.kxH) != 0;
  }

  public int crR()
  {
    aHA.debug("getVolume()", new Object[0]);
    return this.le.X(this.kxH);
  }

  public void wv(int paramInt)
  {
    aHA.debug("setVolume(volume={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.v(this.kxH, paramInt);
  }

  public int crS()
  {
    aHA.debug("getAudioChannel()", new Object[0]);
    return this.le.ab(this.kxH);
  }

  public void ww(int paramInt)
  {
    aHA.debug("setAudioChannel(channel={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.x(this.kxH, paramInt);
  }

  public long crT()
  {
    aHA.debug("getAudioDelay()", new Object[0]);
    return this.le.ac(this.kxH);
  }

  public void hL(long paramLong)
  {
    aHA.debug("setAudioDelay(delay={})", new Object[] { Long.valueOf(paramLong) });
    this.le.d(this.kxH, paramLong);
  }

  public int crU()
  {
    aHA.trace("getChapterCount()", new Object[0]);
    return this.le.q(this.kxH);
  }

  public int crV()
  {
    aHA.trace("getChapter()", new Object[0]);
    return this.le.p(this.kxH);
  }

  public void wx(int paramInt)
  {
    aHA.debug("setChapter(chapterNumber={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.d(this.kxH, paramInt);
  }

  public void crW()
  {
    aHA.debug("nextChapter()", new Object[0]);
    this.le.v(this.kxH);
  }

  public void crX()
  {
    aHA.debug("previousChapter()", new Object[0]);
    this.le.u(this.kxH);
  }

  public void crY()
  {
    aHA.debug("menuActivate()", new Object[0]);
    this.le.g(this.kxH, bWL.hiZ.intValue());
  }

  public void crZ()
  {
    aHA.debug("menuUp()", new Object[0]);
    this.le.g(this.kxH, bWL.hja.intValue());
  }

  public void csa()
  {
    aHA.debug("menuDown()", new Object[0]);
    this.le.g(this.kxH, bWL.hjb.intValue());
  }

  public void csb()
  {
    aHA.debug("menuLeft()", new Object[0]);
    this.le.g(this.kxH, bWL.hjc.intValue());
  }

  public void csc()
  {
    aHA.debug("menuRight()", new Object[0]);
    this.le.g(this.kxH, bWL.hjd.intValue());
  }

  public int csd()
  {
    aHA.debug("getSpuCount()", new Object[0]);
    return this.le.K(this.kxH);
  }

  public int cse()
  {
    aHA.debug("getSpu()", new Object[0]);
    return this.le.J(this.kxH);
  }

  public int wy(int paramInt)
  {
    aHA.debug("setSpu(spu={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.k(this.kxH, paramInt);
    return cse();
  }

  public int csf()
  {
    aHA.debug("cycleSpu()", new Object[0]);
    int i = cse();
    int j = csd();
    aHA.debug("spuCount={}", new Object[] { Integer.valueOf(j) });
    if (i >= j) {
      i = 0;
    }
    else {
      i++;
    }
    return wy(i);
  }

  public long csg()
  {
    aHA.debug("getSpuDelay()", new Object[0]);
    return this.le.M(this.kxH);
  }

  public void hM(long paramLong)
  {
    aHA.debug("setSpuDelay(delay={})", new Object[] { Long.valueOf(paramLong) });
    this.le.c(this.kxH, paramLong);
  }

  public void mm(String paramString)
  {
    aHA.debug("setSubTitleFile(subTitleFileName={})", new Object[] { paramString });
    this.le.b(this.kxH, paramString);
  }

  public void P(File paramFile)
  {
    aHA.debug("setSubTitleFile(subTitleFile={})", new Object[] { paramFile });
    mm(paramFile.getAbsolutePath());
  }

  public int csh()
  {
    aHA.debug("getTeletextPage()", new Object[0]);
    return this.le.P(this.kxH);
  }

  public void wz(int paramInt)
  {
    aHA.debug("setTeletextPage(pageNumber={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.m(this.kxH, paramInt);
  }

  public void csi()
  {
    aHA.debug("toggleTeletext()", new Object[0]);
    this.le.Q(this.kxH);
  }

  public List csj()
  {
    aHA.debug("getTitleDescriptions()", new Object[0]);
    Hw localHw = this.le.N(this.kxH);
    return a(localHw);
  }

  public List csk()
  {
    aHA.debug("getVideoDescriptions()", new Object[0]);
    Hw localHw = this.le.S(this.kxH);
    return a(localHw);
  }

  public List csl()
  {
    aHA.debug("getAudioDescriptions()", new Object[0]);
    Hw localHw = this.le.Z(this.kxH);
    return a(localHw);
  }

  public List csm()
  {
    aHA.debug("getSpuDescriptions()", new Object[0]);
    Hw localHw = this.le.L(this.kxH);
    return a(localHw);
  }

  public List wA(int paramInt)
  {
    aHA.debug("getChapterDescriptions(title={})", new Object[] { Integer.valueOf(paramInt) });
    ArrayList localArrayList;
    if ((paramInt >= 0) && (paramInt < crJ())) {
      localArrayList = new ArrayList();
      Hw localHw = this.le.l(this.kxH, paramInt);
      Object localObject = localHw;
      while (localObject != null) {
        localArrayList.add(((Hw)localObject).bPM);
        localObject = ((Hw)localObject).bPN;
      }
      if (localHw != null)
        this.le.l(localHw.sF());
    }
    else
    {
      localArrayList = null;
    }
    return localArrayList;
  }

  public List csn()
  {
    aHA.debug("getChapterDescriptions()", new Object[0]);
    return wA(crK());
  }

  public List cso()
  {
    aHA.debug("getAllChapterDescriptions()", new Object[0]);
    int i = crJ();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(wA(j));
    }
    return localArrayList;
  }

  public List a(mI[] paramArrayOfmI)
  {
    aHA.debug("getTrackInfo(types={})", new Object[] { Arrays.toString(paramArrayOfmI) });
    return a(this.cTD, paramArrayOfmI);
  }

  public List a(jJ paramjJ, mI[] paramArrayOfmI)
  {
    aHA.debug("getTrackInfo(media={},types={})", new Object[] { paramjJ, Arrays.toString(paramArrayOfmI) });
    List localList = null;
    if (paramjJ != null)
    {
      HashSet localHashSet;
      if ((paramArrayOfmI == null) || (paramArrayOfmI.length == 0)) {
        localHashSet = null;
      }
      else {
        localHashSet = new HashSet(paramArrayOfmI.length);
        for (mI localmI : paramArrayOfmI) {
          localHashSet.add(localmI);
        }
      }

      if (caB.ceM().a(caB.hrq)) {
        localList = a(paramjJ, localHashSet);
      }
      else
      {
        localList = b(paramjJ, localHashSet);
      }
    }
    return localList;
  }

  private List a(jJ paramjJ, Set paramSet)
  {
    aHA.debug("newGetTrackInfo(media={},types={})", new Object[] { paramjJ, paramSet });
    cJv localcJv = new cJv();
    int i = this.le.b(paramjJ, localcJv);
    aHA.debug("numberOfTracks={}", new Object[] { Integer.valueOf(i) });
    ArrayList localArrayList = new ArrayList(i);
    if (i > 0) {
      axA[] arrayOfaxA1 = localcJv.cDB().p(0L, i);
      for (axA localaxA : arrayOfaxA1) {
        bnH localbnH = new bnH(localaxA);
        switch (avq.dJX[atG.km(localbnH.fGD).ordinal()]) {
        case 1:
          if ((paramSet == null) || (paramSet.contains(mI.aRc)))
            localArrayList.add(new axc(localbnH.fGB, localbnH.fGC, localbnH.bPL, localbnH.fGE, localbnH.fGF, localbnH.fGH, dBU.a(this.le, localbnH.fGI), dBU.a(this.le, localbnH.fGJ))); break;
        case 2:
          if ((paramSet == null) || (paramSet.contains(mI.aRe))) {
            localbnH.fGG.g(deK.class);
            localbnH.fGG.hb();
            localArrayList.add(new dNa(localbnH.fGB, localbnH.fGC, localbnH.bPL, localbnH.fGE, localbnH.fGF, localbnH.fGH, dBU.a(this.le, localbnH.fGI), dBU.a(this.le, localbnH.fGJ), localbnH.fGG.fGO.eVi, localbnH.fGG.fGO.eVh, localbnH.fGG.fGO.kYE, localbnH.fGG.fGO.kYF, localbnH.fGG.fGO.kYG, localbnH.fGG.fGO.kYH)); } break;
        case 3:
          if ((paramSet == null) || (paramSet.contains(mI.aRd))) {
            localbnH.fGG.g(aOz.class);
            localbnH.fGG.hb();
            localArrayList.add(new bIi(localbnH.fGB, localbnH.fGC, localbnH.bPL, localbnH.fGE, localbnH.fGF, localbnH.fGH, dBU.a(this.le, localbnH.fGI), dBU.a(this.le, localbnH.fGJ), localbnH.fGG.fGN.evi, localbnH.fGG.fGN.evj)); } break;
        case 4:
          if ((paramSet == null) || (paramSet.contains(mI.aRf))) {
            localbnH.fGG.g(aqr.class);
            localbnH.fGG.hb();
            localArrayList.add(new dDG(localbnH.fGB, localbnH.fGC, localbnH.bPL, localbnH.fGE, localbnH.fGF, localbnH.fGH, dBU.a(this.le, localbnH.fGI), dBU.a(this.le, localbnH.fGJ), dBU.a(this.le, localbnH.fGG.fGP.dxT)));
          }

          break;
        }

      }

    }

    return localArrayList;
  }

  private List b(jJ paramjJ, Set paramSet)
  {
    aHA.debug("oldGetTrackInfo(media={},types={})", new Object[] { paramjJ, paramSet });
    cJv localcJv = new cJv();
    int i = this.le.a(paramjJ, localcJv);
    aHA.debug("numberOfTracks={}", new Object[] { Integer.valueOf(i) });
    ArrayList localArrayList = new ArrayList(i);
    if (i > 0) {
      cqQ localcqQ1 = new cqQ(localcJv.cDB());
      cqQ[] arrayOfcqQ1 = (cqQ[])localcqQ1.pS(i);
      for (cqQ localcqQ2 : arrayOfcqQ1) {
        switch (avq.dJX[atG.km(localcqQ2.fGD).ordinal()]) {
        case 1:
          if ((paramSet == null) || (paramSet.contains(mI.aRc)))
            localArrayList.add(new axc(localcqQ2.fGB, 0, localcqQ2.bPL, localcqQ2.fGE, localcqQ2.fGF, 0, null, null)); break;
        case 2:
          if ((paramSet == null) || (paramSet.contains(mI.aRe))) {
            localcqQ2.iaB.g(cPw.class);
            localcqQ2.iaB.hb();
            localArrayList.add(new dNa(localcqQ2.fGB, 0, localcqQ2.bPL, localcqQ2.fGE, localcqQ2.fGF, 0, null, null, localcqQ2.iaB.iaz.eVi, localcqQ2.iaB.iaz.eVh, 0, 0, 0, 0)); } break;
        case 3:
          if ((paramSet == null) || (paramSet.contains(mI.aRd))) {
            localcqQ2.iaB.g(ckN.class);
            localcqQ2.iaB.hb();
            localArrayList.add(new bIi(localcqQ2.fGB, 0, localcqQ2.bPL, localcqQ2.fGE, localcqQ2.fGF, 0, null, null, localcqQ2.iaB.iay.evi, localcqQ2.iaB.iay.evj)); } break;
        case 4:
          if ((paramSet == null) || (paramSet.contains(mI.aRf))) {
            localArrayList.add(new dDG(localcqQ2.fGB, 0, localcqQ2.bPL, localcqQ2.fGE, localcqQ2.fGF, 0, null, null, null));
          }

          break;
        }

      }

    }

    this.le.j(localcJv.cDB());
    return localArrayList;
  }

  public List b(mI[] paramArrayOfmI)
  {
    aHA.debug("getSubItemTrackInfo(types={})", new Object[] { Arrays.toString(paramArrayOfmI) });
    return (List)a(new avp(this));
  }

  private List a(Hw paramHw)
  {
    aHA.debug("getTrackDescriptions()", new Object[0]);
    ArrayList localArrayList = new ArrayList();
    Object localObject = paramHw;
    while (localObject != null) {
      localArrayList.add(new boo(((Hw)localObject).bPL, ((Hw)localObject).bPM));
      localObject = ((Hw)localObject).bPN;
    }
    if (paramHw != null) {
      this.le.l(paramHw.sF());
    }
    return localArrayList;
  }

  public void mn(String paramString)
  {
    aHA.debug("setSnapshotDirectory(snapshotDirectoryName={})", new Object[] { paramString });
    this.kxM = paramString;
  }

  public boolean csp()
  {
    aHA.debug("saveSnapshot()", new Object[0]);
    return dG(0, 0);
  }

  public boolean dG(int paramInt1, int paramInt2)
  {
    aHA.debug("saveSnapshot(width={},height={})", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    File localFile1 = new File(this.kxM == null ? System.getProperty("user.home") : this.kxM);
    File localFile2 = new File(localFile1, "vlcj-snapshot-" + System.currentTimeMillis() + ".png");
    return a(localFile2, paramInt1, paramInt2);
  }

  public boolean Q(File paramFile)
  {
    aHA.debug("saveSnapshot(file={})", new Object[] { paramFile });
    return a(paramFile, 0, 0);
  }

  public boolean a(File paramFile, int paramInt1, int paramInt2)
  {
    aHA.debug("saveSnapshot(file={},width={},height={})", new Object[] { paramFile, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    File localFile = paramFile.getParentFile();
    if (localFile == null) {
      localFile = new File(".");
      aHA.debug("No directory specified for snapshot, snapshot will be saved to {}", new Object[] { localFile.getAbsolutePath() });
    }
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    if (localFile.exists()) {
      boolean bool = this.le.a(this.kxH, 0, paramFile.getAbsolutePath(), paramInt1, paramInt2) == 0;
      aHA.debug("snapshotTaken={}", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }

    throw new RuntimeException("Directory does not exist and could not be created for '" + paramFile.getAbsolutePath() + "'");
  }

  public BufferedImage getSnapshot()
  {
    aHA.debug("getSnapshot()", new Object[0]);
    return dH(0, 0);
  }

  public BufferedImage dH(int paramInt1, int paramInt2)
  {
    aHA.debug("getSnapshot(width={},height={})", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    File localFile = null;
    try {
      localFile = File.createTempFile("vlcj-snapshot-", ".png");
      aHA.debug("file={}", new Object[] { localFile.getAbsolutePath() });
      BufferedImage localBufferedImage;
      boolean bool1;
      if (a(localFile, paramInt1, paramInt2)) {
        return ImageIO.read(localFile);
      }

      return null;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Failed to get snapshot image", localIOException);
    }
    finally {
      if (localFile != null) {
        boolean bool2 = localFile.delete();
        aHA.debug("deleted={}", new Object[] { Boolean.valueOf(bool2) });
      }
    }
  }

  public void hD(boolean paramBoolean)
  {
    aHA.debug("enableLogo(enable={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.le.c(this.kxH, Ih.bQK.intValue(), paramBoolean ? 1 : 0);
  }

  public void wB(int paramInt)
  {
    aHA.debug("setLogoOpacity(opacity={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.c(this.kxH, Ih.bQQ.intValue(), paramInt);
  }

  public void ch(float paramFloat)
  {
    aHA.debug("setLogoOpacity(opacity={})", new Object[] { Float.valueOf(paramFloat) });
    int i = Math.round(paramFloat * 255.0F);
    aHA.debug("opacityValue={}", new Object[] { Integer.valueOf(i) });
    this.le.c(this.kxH, Ih.bQQ.intValue(), i);
  }

  public void dI(int paramInt1, int paramInt2)
  {
    aHA.debug("setLogoLocation(x={},y={})", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.le.c(this.kxH, Ih.bQM.intValue(), paramInt1);
    this.le.c(this.kxH, Ih.bQN.intValue(), paramInt2);
  }

  public void a(cns paramcns)
  {
    aHA.debug("setLogoPosition(position={})", new Object[] { paramcns });
    this.le.c(this.kxH, Ih.bQR.intValue(), paramcns.intValue());
  }

  public void mo(String paramString)
  {
    aHA.debug("setLogoFile(logoFile={})", new Object[] { paramString });
    this.le.b(this.kxH, Ih.bQL.intValue(), paramString);
  }

  public void a(RenderedImage paramRenderedImage)
  {
    aHA.debug("setLogoImage(logoImage={})", new Object[] { paramRenderedImage });
    File localFile = null;
    try
    {
      localFile = File.createTempFile("vlcj-logo-", ".png");
      ImageIO.write(paramRenderedImage, "png", localFile);

      mo(localFile.getAbsolutePath());
    }
    catch (IOException localIOException)
    {
      boolean bool1;
      throw new RuntimeException("Failed to set logo image", localIOException);
    }
    finally {
      if (localFile != null) {
        boolean bool2 = localFile.delete();
        aHA.debug("deleted={}", new Object[] { Boolean.valueOf(bool2) });
      }
    }
  }

  public void hE(boolean paramBoolean)
  {
    aHA.debug("enableMarquee(enable={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.le.b(this.kxH, cSj.kEr.intValue(), paramBoolean ? 1 : 0);
  }

  public void mp(String paramString)
  {
    aHA.debug("setMarqueeText(text={})", new Object[] { paramString });
    this.le.a(this.kxH, cSj.kEs.intValue(), paramString);
  }

  public void c(Color paramColor)
  {
    aHA.debug("setMarqueeColour(colour={})", new Object[] { paramColor });
    wC(paramColor.getRGB() & 0xFFFFFF);
  }

  public void wC(int paramInt)
  {
    aHA.debug("setMarqueeColour(colour={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.b(this.kxH, cSj.kEt.intValue(), paramInt);
  }

  public void wD(int paramInt)
  {
    aHA.debug("setMarqueeOpacity(opacity={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.b(this.kxH, cSj.kEu.intValue(), paramInt);
  }

  public void ci(float paramFloat)
  {
    aHA.debug("setMarqueeOpacity(opacity={})", new Object[] { Float.valueOf(paramFloat) });
    int i = Math.round(paramFloat * 255.0F);
    aHA.debug("opacityValue={}", new Object[] { Integer.valueOf(i) });
    this.le.b(this.kxH, cSj.kEu.intValue(), i);
  }

  public void wE(int paramInt)
  {
    aHA.debug("setMarqueeSize(size={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.b(this.kxH, cSj.kEx.intValue(), paramInt);
  }

  public void wF(int paramInt)
  {
    aHA.debug("setMarqueeTimeout(timeout={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.b(this.kxH, cSj.kEy.intValue(), paramInt);
  }

  public void dJ(int paramInt1, int paramInt2)
  {
    aHA.debug("setMarqueeLocation(x={},y={})", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.le.b(this.kxH, cSj.kEz.intValue(), paramInt1);
    this.le.b(this.kxH, cSj.kEA.intValue(), paramInt2);
  }

  public void a(afm paramafm)
  {
    aHA.debug("setMarqueePosition(position={})", new Object[] { paramafm });
    this.le.b(this.kxH, cSj.kEv.intValue(), paramafm.intValue());
  }

  public void a(bQw parambQw)
  {
    aHA.debug("setDeinterlace(deinterlaceMode={})", new Object[] { parambQw });
    this.le.d(this.kxH, parambQw != null ? parambQw.bXz() : null);
  }

  public void hF(boolean paramBoolean)
  {
    aHA.debug("setAdjustVideo(adjustVideo={})", new Object[] { Boolean.valueOf(paramBoolean) });
    this.le.d(this.kxH, dVn.mug.intValue(), paramBoolean ? 1 : 0);
  }

  public boolean csq()
  {
    aHA.debug("isAdjustVideo()", new Object[0]);
    return this.le.r(this.kxH, dVn.mug.intValue()) == 1;
  }

  public float csr()
  {
    aHA.debug("getContrast()", new Object[0]);
    return this.le.s(this.kxH, dVn.muh.intValue());
  }

  public void cj(float paramFloat)
  {
    aHA.debug("setContrast(contrast={})", new Object[] { Float.valueOf(paramFloat) });
    this.le.a(this.kxH, dVn.muh.intValue(), paramFloat);
  }

  public float getBrightness()
  {
    aHA.debug("getBrightness()", new Object[0]);
    return this.le.s(this.kxH, dVn.mui.intValue());
  }

  public void setBrightness(float paramFloat)
  {
    aHA.debug("setBrightness(brightness={})", new Object[] { Float.valueOf(paramFloat) });
    this.le.a(this.kxH, dVn.mui.intValue(), paramFloat);
  }

  public int css()
  {
    aHA.debug("getHue()", new Object[0]);
    return this.le.r(this.kxH, dVn.muj.intValue());
  }

  public void wG(int paramInt)
  {
    aHA.debug("setHue(hue={})", new Object[] { Integer.valueOf(paramInt) });
    this.le.d(this.kxH, dVn.muj.intValue(), paramInt);
  }

  public float getSaturation()
  {
    aHA.debug("getSaturation()", new Object[0]);
    return this.le.s(this.kxH, dVn.muk.intValue());
  }

  public void setSaturation(float paramFloat)
  {
    aHA.debug("setSaturation(saturation={})", new Object[] { Float.valueOf(paramFloat) });
    this.le.a(this.kxH, dVn.muk.intValue(), paramFloat);
  }

  public float getGamma()
  {
    aHA.debug("getGamma()", new Object[0]);
    return this.le.s(this.kxH, dVn.mul.intValue());
  }

  public void ck(float paramFloat)
  {
    aHA.debug("setGamma(gamma={})", new Object[] { Float.valueOf(paramFloat) });
    this.le.a(this.kxH, dVn.mul.intValue(), paramFloat);
  }

  public void a(Wd paramWd, int paramInt)
  {
    aHA.debug("setVideoTitleDisplay(position={},timeout={})", new Object[] { paramWd, Integer.valueOf(paramInt) });
    if (caB.ceM().a(caB.hrq)) {
      this.le.a(this.kxH, paramWd.intValue(), paramInt);
    }
    else
      throw new RuntimeException("This function requires libvlc 2.1.0 or later");
  }

  public String cst()
  {
    aHA.debug("mrl()", new Object[0]);
    if (this.cTD != null) {
      return dBU.a(this.le, this.le.h(this.cTD));
    }

    throw null;
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
    if (this.edF.compareAndSet(false, true)) {
      aSA();
      cGr();
    }
  }

  public final aZo csu()
  {
    return this.kxH;
  }

  protected void cBV()
  {
  }

  protected void cGr()
  {
  }

  private void aTS()
  {
    aHA.debug("createInstance()", new Object[0]);

    this.kxH = this.le.g(this.lf);
    aHA.debug("mediaPlayerInstance={}", new Object[] { this.kxH });

    this.kxI = this.le.d(this.kxH);
    aHA.debug("mediaPlayerEventManager={}", new Object[] { this.kxI });

    aSB();

    this.kxF.add(new cKp(this, null));
    this.kxF.add(new bZl(this, null));
    this.kxF.add(new cNn(this, null));
  }

  private void aSA()
  {
    aHA.debug("destroyInstance()", new Object[0]);

    aHA.debug("Detach media events...", new Object[0]);
    cnl();
    aHA.debug("Media events detached.", new Object[0]);

    if (this.cTD != null) {
      aHA.debug("Release media...", new Object[0]);
      this.le.g(this.cTD);
      aHA.debug("Media released.", new Object[0]);
    }

    aHA.debug("Detach media player events...", new Object[0]);
    aSC();
    aHA.debug("Media player events detached.", new Object[0]);

    this.kxF.clear();

    if (this.kxH != null) {
      aHA.debug("Release media player...", new Object[0]);
      this.le.a(this.kxH);
      aHA.debug("Media player released.", new Object[0]);
    }

    aHA.debug("Shut down listeners...", new Object[0]);
    this.edB.shutdown();
    aHA.debug("Listeners shut down.", new Object[0]);
  }

  private void aSB()
  {
    aHA.debug("registerEventListener()", new Object[0]);
    this.edE = new dNG(this, null);
    for (dWm localdWm : dWm.values())
      if ((localdWm.intValue() >= dWm.mvB.intValue()) && (localdWm.intValue() <= dWm.mvT.intValue())) {
        aHA.debug("event={}", new Object[] { localdWm });
        int k = this.le.a(this.kxI, localdWm.intValue(), this.edE, null);
        aHA.debug("result={}", new Object[] { Integer.valueOf(k) });
      }
  }

  private void aSC()
  {
    aHA.debug("deregisterEventListener()", new Object[0]);
    if (this.edE != null) {
      for (dWm localdWm : dWm.values()) {
        if ((localdWm.intValue() >= dWm.mvB.intValue()) && (localdWm.intValue() <= dWm.mvT.intValue())) {
          aHA.debug("event={}", new Object[] { localdWm });
          this.le.b(this.kxI, localdWm.intValue(), this.edE, null);
        }
      }
      this.edE = null;
    }
  }

  private void cnk()
  {
    aHA.debug("registerMediaEventListener()", new Object[0]);

    if (this.cTD != null) {
      tH localtH = this.le.m(this.cTD);
      for (dWm localdWm : dWm.values())
        if ((localdWm.intValue() >= dWm.mvv.intValue()) && (localdWm.intValue() <= dWm.mvA.intValue())) {
          aHA.debug("event={}", new Object[] { localdWm });
          int k = this.le.a(localtH, localdWm.intValue(), this.edE, null);
          aHA.debug("result={}", new Object[] { Integer.valueOf(k) });
        }
    }
  }

  private void cnl()
  {
    aHA.debug("deregisterMediaEventListener()", new Object[0]);

    if (this.cTD != null) {
      tH localtH = this.le.m(this.cTD);
      for (dWm localdWm : dWm.values())
        if ((localdWm.intValue() >= dWm.mvv.intValue()) && (localdWm.intValue() <= dWm.mvA.intValue())) {
          aHA.debug("event={}", new Object[] { localdWm });
          this.le.b(localtH, localdWm.intValue(), this.edE, null);
        }
    }
  }

  private void a(bOD parambOD)
  {
    aHA.trace("raiseEvent(mediaPlayerEvent={}", new Object[] { parambOD });
    if (parambOD != null)
      this.edB.submit(new bjT(this, parambOD, null));
  }

  private boolean n(String paramString, String[] paramArrayOfString)
  {
    aHA.debug("setMedia(media={},mediaOptions={})", new Object[] { paramString, Arrays.toString(paramArrayOfString) });

    if (this.cTD != null)
    {
      cnl();

      this.le.g(this.cTD);
      this.cTD = null;
    }

    this.hUO = -1;

    paramString = cOA.on(paramString);

    if (cOA.om(paramString)) {
      aHA.debug("Treating mrl as a location", new Object[0]);
      this.cTD = this.le.b(this.lf, paramString);
    }
    else {
      aHA.debug("Treating mrl as a path", new Object[0]);
      this.cTD = this.le.c(this.lf, paramString);
    }
    aHA.debug("mediaInstance={}", new Object[] { this.cTD });
    if (this.cTD != null)
    {
      String str;
      if (this.edG != null) {
        for (str : this.edG) {
          aHA.debug("standardMediaOption={}", new Object[] { str });
          this.le.a(this.cTD, str);
        }
      }

      if (paramArrayOfString != null) {
        for (str : paramArrayOfString) {
          aHA.debug("mediaOption={}", new Object[] { str });
          this.le.a(this.cTD, str);
        }
      }

      cnk();

      this.le.a(this.kxH, this.cTD);
    }
    else {
      aHA.error("Failed to create native media resource for '{}'", new Object[] { paramString });
    }

    this.kxK = new cQz();
    return this.cTD != null;
  }

  private Object a(apB paramapB)
  {
    aHA.debug("handleSubItems()", new Object[0]);
    bEv localbEv = null;
    try {
      if (this.cTD != null)
      {
        localbEv = this.le.l(this.cTD);
        aHA.debug("subItemList={}", new Object[] { localbEv });
        if (localbEv != null)
        {
          this.le.g(localbEv);
        }

        return paramapB.a(localbEv != null ? this.le.e(localbEv) : 0, localbEv);
      }

      throw new IllegalStateException("No media");
    }
    finally
    {
      if (localbEv != null) {
        this.le.h(localbEv);
        this.le.b(localbEv);
      }
    }
  }
}