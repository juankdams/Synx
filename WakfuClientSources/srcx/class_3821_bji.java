import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class bji extends bHx
{
  private static final Logger K = Logger.getLogger(bji.class);
  public static final String fzt = "videoPlaying";
  public static final String fzu = "videoMuted";
  public static final String fzv = "videoSoundVolumeValue";
  public static final String fzw = "videoSoundVolumeText";
  public static final String fzx = "videoProgressionValue";
  public static final String fzy = "videoCurrentTimeText";
  public static final String fzz = "videoTotalTimeText";
  public static final String fzA = "availableQualities";
  public static final String fzB = "selectedQuality";
  public static final String[] bF = { "videoPlaying", "videoMuted", "videoSoundVolumeValue", "videoSoundVolumeText", "videoProgressionValue", "videoCurrentTimeText", "videoTotalTimeText", "availableQualities", "selectedQuality" };
  private dtz fzC;
  private float fzD;
  private ArrayList fzE = new ArrayList();

  private doN fzF = new dpo(this);
  private tj fzG;
  private czv fyP;

  public bji(ig paramig)
  {
    super(paramig);
    int[] arrayOfInt = ((dMX)paramig).dpL();
    for (int i = 0; i < arrayOfInt.length; i++)
      this.fzE.add(new tj(arrayOfInt[i]));
    Collections.sort(this.fzE, new dpn(this));

    this.fzG = ((tj)this.fzE.get(this.fzE.size() - 1));
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("videoPlaying")) {
      return Boolean.valueOf(buK());
    }
    if (paramString.equals("videoProgressionValue")) {
      if (!this.fzC.isInitialized())
        return Float.valueOf(0.0F);
      return Float.valueOf(this.fzD / (float)this.fzC.getVideoDuration());
    }
    if (paramString.equals("videoCurrentTimeText")) {
      if (!this.fzC.isInitialized())
        return ab(0L);
      return ab(()this.fzD);
    }
    if (paramString.equals("videoTotalTimeText")) {
      if (!this.fzC.isInitialized())
        return ab(0L);
      return ab(this.fzC.getVideoDuration());
    }
    if (paramString.equals("videoSoundVolumeValue")) {
      return Float.valueOf(this.fzC.getVolume());
    }
    if (paramString.equals("videoSoundVolumeText")) {
      return (int)(this.fzC.getVolume() / 1.0F * 100.0F) + "%";
    }
    if (paramString.equals("videoMuted")) {
      return Boolean.valueOf(isMuted());
    }
    if (paramString.equals("availableQualities")) {
      return this.fzE;
    }
    if (paramString.equals("selectedQuality")) {
      return this.fzG;
    }
    return null;
  }

  public boolean buK() {
    return (this.fzC.isInitialized()) && (!this.fzC.isPaused());
  }

  public static String ab(long paramLong)
  {
    paramLong /= 1000L;
    long l1 = paramLong / 60L;
    long l2 = paramLong - 60L * l1;
    return String.format("%d:%s", new Object[] { Long.valueOf(l1), "0" + l2 });
  }

  public void buL() {
    if (!this.fzC.isInitialized()) {
      if (this.fyP != null) {
        this.fyP.setVisible(false);
      }
      buN();

      this.fzC.a(new dpq(this));

      return;
    }
    this.fzC.setPaused(!this.fzC.isPaused());
  }

  public dRq a(dRq paramdRq, bFT parambFT) {
    dRq localdRq = super.a(paramdRq, parambFT);

    dMX localdMX = (dMX)this.gFZ;
    a(localdRq, localdMX);

    bkm localbkm = localdMX.dpJ();
    if (localbkm != null) {
      try {
        this.fyP = new czv();
        URL localURL = localbkm.getFile().toURL();
        dDq localdDq = new dDq(dQU.drS().n(localURL));
        this.fyP.aJ();
        this.fyP.setNonBlocking(true);
        this.fyP.setExpandable(false);
        this.fyP.setPixmap(localdDq);
        this.fyP.rf();
        this.fyP.setSizeToPrefSize();

        cwP localcwP = new cwP();
        localcwP.aJ();
        localcwP.setSize(new Or(100.0F, 100.0F));
        localcwP.setAlign(ajb.dhZ);

        this.fyP.setLayoutData(localcwP);

        localdRq.a(this.fyP);
        localdRq.rV();
      } catch (MalformedURLException localMalformedURLException) {
        K.warn("URL malformée : \"" + localbkm.getFile() + "\"");
      }

    }

    localdRq.rV();
    return localdRq;
  }

  private void a(dRq paramdRq, dMX paramdMX) {
    if (this.fzC != null) {
      this.fzC.beH();
    }
    this.fzC = dtz.checkOut();
    this.fzC.setKeepRatio(false);
    URL localURL = paramdMX.Da(this.fzG.AI());
    if (!bAy.d(localURL)) {
      K.error("Impossible de retrouver la vidéo dans cette qualité " + this.fzG);
      return;
    }
    this.fzC.setVideoPath(localURL.toExternalForm());
    paramdRq.a(this.fzC);
    paramdRq.rV();
    this.fzC.setPrefSize(new Or(paramdMX.pR().width(), paramdMX.pR().height()));
    this.fzC.a(CH.bGF, this.fzF, false);

    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setSize(new Or(paramdMX.pR().width(), paramdMX.pR().height()));
    localcwP.setAlign(ajb.dhZ);
    this.fzC.setLayoutData(localcwP);
  }

  public dtz buM() {
    return this.fzC;
  }

  public void awo() {
    super.awo();
  }

  public void bl(float paramFloat) {
    this.fzC.setVolume(paramFloat);
  }

  public void aN(float paramFloat) {
    this.fzC.aN(paramFloat);
  }

  public void a(dRq paramdRq, int paramInt) {
    boolean bool = buK();
    for (tj localtj : this.fzE)
      if (localtj.AI() == paramInt)
        this.fzG = localtj;
    a(paramdRq, (dMX)this.gFZ);
    if (bool)
      buN();
  }

  private void buN() {
    this.fzC.play();
  }

  public boolean isMuted() {
    return this.fzC.isMuted();
  }

  public void eQ(boolean paramBoolean) {
    this.fzC.hC(paramBoolean);
  }
}