import java.awt.Canvas;
import java.awt.Toolkit;
import java.security.AccessController;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bS
{
  private static final String ld = "Failed to initialise libvlc.\n\nThis is most often caused either by an invalid vlc option begin passed when creating a MediaPlayerFactory or by libvlc being unable to locate the required plugins.\n\nIf libvlc is unable to locate the required plugins the instructions below may help:\n\nIn the text below <libvlc-path> represents the name of the directory containing \"{0}\" and \"{1}\" and <plugins-path> represents the name of the directory containing the vlc plugins...\n\nFor libvlc to function correctly the vlc plugins must be available, there are a number of different ways to achieve this:\n 1. Make sure the plugins are installed in the \"<libvlc-path>/{2}\" directory, this should be the case with a normal vlc installation.\n 2. Set the VLC_PLUGIN_PATH operating system environment variable to point to \"<plugins-path>\".\n\nMore information may be available in the log, specify -Dvlcj.log=DEBUG on the command-line when starting your application.\n\n";
  protected final djj le;
  protected final bSW lf;
  private boolean lg;

  public bS()
  {
    this(new String[0]);
  }

  public bS(String[] paramArrayOfString)
  {
    this(dna.cUy().pD("2.0.0").cUB(), paramArrayOfString);
  }

  public bS(djj paramdjj)
  {
    this(paramdjj, new String[0]);
  }

  public bS(djj paramdjj, String[] paramArrayOfString)
  {
    aHA.debug("MediaPlayerFactory(libvlc={},libvlcArgs={})", new Object[] { paramdjj, Arrays.toString(paramArrayOfString) });

    aHA.debug("jna.library.path={}", new Object[] { System.getProperty("jna.library.path") });

    if (paramArrayOfString == null) {
      paramArrayOfString = new String[0];
    }

    for (String str2 : paramArrayOfString) {
      if (str2.startsWith("--plugin-path=")) {
        aHA.debug(str2, new Object[0]);
      }

    }

    ??? = System.getProperty("VLC_PLUGIN_PATH");
    if (??? != null) {
      aHA.debug("VLC_PLUGIN_PATH={}", new Object[] { ??? });
    }
    this.le = paramdjj;
    this.lf = paramdjj.b(paramArrayOfString.length, paramArrayOfString);
    aHA.debug("instance={}", new Object[] { this.lf });
    if (this.lf == null) {
      aHA.error("Failed to initialise libvlc", new Object[0]);
      String str1 = MessageFormat.format("Failed to initialise libvlc.\n\nThis is most often caused either by an invalid vlc option begin passed when creating a MediaPlayerFactory or by libvlc being unable to locate the required plugins.\n\nIf libvlc is unable to locate the required plugins the instructions below may help:\n\nIn the text below <libvlc-path> represents the name of the directory containing \"{0}\" and \"{1}\" and <plugins-path> represents the name of the directory containing the vlc plugins...\n\nFor libvlc to function correctly the vlc plugins must be available, there are a number of different ways to achieve this:\n 1. Make sure the plugins are installed in the \"<libvlc-path>/{2}\" directory, this should be the case with a normal vlc installation.\n 2. Set the VLC_PLUGIN_PATH operating system environment variable to point to \"<plugins-path>\".\n\nMore information may be available in the log, specify -Dvlcj.log=DEBUG on the command-line when starting your application.\n\n", new Object[] { cha.ciT(), cha.ciU(), cha.ciV() });
      throw new RuntimeException(str1);
    }
  }

  public bS(List paramList)
  {
    this((String[])paramList.toArray(new String[paramList.size()]));
  }

  public bS(djj paramdjj, List paramList)
  {
    this(paramdjj, (String[])paramList.toArray(new String[paramList.size()]));
  }

  public void release()
  {
    aHA.debug("release()", new Object[0]);
    if (!this.lg) {
      if (this.lf != null) {
        this.le.a(this.lf);
      }
      this.lg = true;
    }
  }

  public void s(String paramString)
  {
    aHA.debug("setUserAgent(userAgent={})", new Object[] { paramString });
    a(paramString, null);
  }

  public void a(String paramString1, String paramString2)
  {
    aHA.debug("setUserAgent(userAgent={},httpUserAgent={})", new Object[] { paramString1, paramString2 });
    this.le.a(this.lf, paramString1, paramString1);
  }

  public void a(String paramString1, String paramString2, String paramString3)
  {
    aHA.debug("setApplicationId(id=" + paramString1 + ",version=" + paramString2 + ",icon=" + paramString3 + ")", new Object[0]);
    this.le.a(this.lf, paramString1, paramString2, paramString3);
  }

  public List fp()
  {
    aHA.debug("getAudioOutputs()", new Object[0]);
    ArrayList localArrayList = new ArrayList();
    bpo localbpo = this.le.h(this.lf);
    if (localbpo != null)
    {
      localbpo.eN(false);
      Object localObject = localbpo;
      while (localObject != null)
      {
        String str1 = dBU.b(this.le, ((bpo)localObject).fJv);
        String str2 = dBU.b(this.le, ((bpo)localObject).fGJ);
        localArrayList.add(new dkS(str1, str2, t(str1)));
        localObject = ((bpo)localObject).fJw;
      }
      this.le.a(localbpo);
    }
    return localArrayList;
  }

  private List t(String paramString)
  {
    aHA.debug("getAudioOutputDevices(outputName={})", new Object[] { paramString });
    ArrayList localArrayList = new ArrayList();
    String str1;
    String str2;
    if (caB.ceM().a(caB.hrq)) {
      aHA.debug("Using new audio device list", new Object[0]);
      cUn localcUn = this.le.f(this.lf, paramString);
      if (localcUn != null)
      {
        localcUn.eN(false);
        Object localObject = localcUn;
        while (localObject != null)
        {
          str1 = dBU.b(this.le, ((cUn)localObject).kGI);
          str2 = dBU.b(this.le, ((cUn)localObject).fGJ);
          localArrayList.add(new bLZ(str1, str2));
          localObject = ((cUn)localObject).kGH;
        }
        this.le.a(localcUn);
      }
    }
    else {
      aHA.debug("Using deprecated audio device count", new Object[0]);
      int i = this.le.e(this.lf, paramString);
      aHA.debug("deviceCount={}", new Object[] { Integer.valueOf(i) });
      for (int j = 0; j < i; j++) {
        str1 = dBU.a(this.le, this.le.b(this.lf, paramString, j));
        str2 = dBU.a(this.le, this.le.a(this.lf, paramString, j));
        localArrayList.add(new bLZ(str1, str2));
      }
    }
    return localArrayList;
  }

  public List fq()
  {
    aHA.debug("getAudioFilters()", new Object[0]);
    daE localdaE = this.le.e(this.lf);

    localdaE.eN(false);
    List localList = a(localdaE);
    this.le.b(localdaE);
    return localList;
  }

  public List fr()
  {
    aHA.debug("getVideoFilters()", new Object[0]);
    daE localdaE = this.le.f(this.lf);

    localdaE.eN(false);
    List localList = a(localdaE);
    this.le.b(localdaE);
    return localList;
  }

  private List a(daE paramdaE)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = paramdaE;
    while (localObject != null) {
      localArrayList.add(new SM(((daE)localObject).bPM, ((daE)localObject).kSr, ((daE)localObject).kSs, ((daE)localObject).kSt));
      localObject = ((daE)localObject).kSu;
    }
    return localArrayList;
  }

  public coc fs()
  {
    aHA.debug("newEmbeddedMediaPlayer()", new Object[0]);
    return a(null);
  }

  public coc a(cto paramcto)
  {
    aHA.debug("newEmbeddedMediaPlayer(fullScreenStrategy={})", new Object[] { paramcto });
    return new cHK(this.le, this.lf, paramcto);
  }

  public bnX a(int paramInt1, int paramInt2, dUC paramdUC)
  {
    aHA.debug("newDirectMediaPlayer(width={},height={},renderCallback={})", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramdUC });
    return a("RV32", paramInt1, paramInt2, paramInt1 * 4, paramdUC);
  }

  public bnX a(String paramString, int paramInt1, int paramInt2, int paramInt3, dUC paramdUC)
  {
    aHA.debug("newDirectMediaPlayer(format={},width={},height={},pitch={},renderCallback={})", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramdUC });
    return new Mx(this.le, this.lf, paramString, paramInt1, paramInt2, paramInt3, paramdUC);
  }

  public bnX a(dQA paramdQA, dUC paramdUC)
  {
    aHA.debug("newDirectMediaPlayer(formatCallback={},renderCallback={})", new Object[] { paramdQA, paramdUC });
    return new Mx(this.le, this.lf, paramdQA, paramdUC);
  }

  public cdU a(String paramString, int paramInt1, int paramInt2, BY paramBY)
  {
    aHA.debug("newDirectAudioPlayer(format={},rate={},channels={},audioCallback={}", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramBY });
    return new Ps(this.le, this.lf, paramString, paramInt1, paramInt2, paramBY);
  }

  public dRL ft()
  {
    aHA.debug("newHeadlessMediaPlayer()", new Object[0]);
    return new bHr(this.le, this.lf);
  }

  public ccR fu()
  {
    aHA.debug("newMediaListPlayer()", new Object[0]);
    return new cTy(this.le, this.lf);
  }

  public con a(Canvas paramCanvas)
  {
    aHA.debug("newVideoSurface(canvas={})", new Object[] { paramCanvas });
    Object localObject;
    if (cha.ciR()) {
      localObject = new aQl();
    }
    else if (cha.bPY()) {
      localObject = new ve();
    }
    else if (cha.bPT()) {
      localObject = new aEH();
    }
    else {
      throw new RuntimeException("Unable to create a media player - failed to detect a supported operating system");
    }
    con localcon = new con(paramCanvas, (dAW)localObject);
    aHA.debug("videoSurface={}", new Object[] { localcon });
    return localcon;
  }

  public aUh k(long paramLong)
  {
    aHA.debug("newVideoSurface(componentId={})", new Object[] { Long.valueOf(paramLong) });
    Object localObject;
    if (cha.ciR()) {
      localObject = new aQl();
    }
    else if (cha.bPY()) {
      localObject = new ve();
    }
    else if (cha.bPT()) {
      localObject = new aEH();
    }
    else {
      throw new RuntimeException("Unable to create a media player - failed to detect a supported operating system");
    }
    aUh localaUh = new aUh(paramLong, (dAW)localObject);
    aHA.debug("videoSurface={}", new Object[] { localaUh });
    return localaUh;
  }

  public aGC fv()
  {
    aHA.debug("newMediaList()", new Object[0]);
    return new aGC(this.le, this.lf);
  }

  public bwh a(String paramString, boolean paramBoolean)
  {
    aHA.debug("getMediaMeta(mediaPath={},parse={})", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    jJ localjJ = this.le.c(this.lf, paramString);
    aHA.debug("media={}", new Object[] { localjJ });
    if (localjJ != null) {
      if (paramBoolean) {
        aHA.debug("Parsing media...", new Object[0]);
        this.le.o(localjJ);
        aHA.debug("Media parsed.", new Object[0]);
      }
      cWr localcWr = new cWr(this.le, localjJ);

      this.le.g(localjJ);
      return localcWr;
    }

    return null;
  }

  public dmk fw()
  {
    aHA.debug("newLog()", new Object[0]);
    if (caB.ceM().a(caB.hrq)) {
      return new dmk(this.le, this.lf);
    }

    aHA.warn("Native log not available on this platform, needs libvlc 2.1.0 or later", new Object[0]);
    return null;
  }

  public aHO u(String paramString)
  {
    aHA.debug("newMediaDiscoverer(name={})", new Object[] { paramString });
    return new aHO(this.le, this.lf, paramString);
  }

  public aHO fx()
  {
    aHA.debug("newAudioMediaDiscoverer()", new Object[0]);
    return u("audio");
  }

  public aHO fy()
  {
    aHA.debug("newVideoMediaDiscoverer()", new Object[0]);
    return u("video");
  }

  public long fz()
  {
    aHA.trace("clock()", new Object[0]);
    return this.le.cSj();
  }

  public ajr fA()
  {
    aHA.trace("newMediaManager()", new Object[0]);
    return new dlM(this.le, this.lf);
  }

  public String fB()
  {
    aHA.debug("version()", new Object[0]);
    return this.le.cSg();
  }

  public String fC()
  {
    aHA.debug("compiler()", new Object[0]);
    return this.le.cSh();
  }

  public String fD()
  {
    aHA.debug("changeset()", new Object[0]);
    return this.le.cSi();
  }

  static
  {
    if (cha.ciR())
    {
      zA localzA = new zA(System.getProperty("java.version"));
      if (localzA.a(new zA("1.7.0"))) {
        aHA.debug("Trying workaround for Java7 on Linux", new Object[0]);
        Toolkit.getDefaultToolkit();
        AccessController.doPrivileged(new aHV());

        aHA.debug("Java7 on Linux workaround complete.", new Object[0]);
      }
    }
  }
}