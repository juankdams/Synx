public class aqd
{
  public static final String PACKAGE = "wakfu.video";

  public static void play(cSx paramcSx, dtz paramdtz, biy parambiy)
  {
    if ((!paramdtz.isInitialized()) || (paramdtz.isPaused())) {
      parambiy.setText(bU.fH().getString("dialog.video.pause"));
      paramdtz.play();
      paramdtz.setPaused(false);
    } else {
      parambiy.setText(bU.fH().getString("dialog.video.play"));
      paramdtz.setPaused(true);
    }
  }

  public static void updateSlider(diZ paramdiZ, dtz paramdtz, cvx paramcvx) {
    float f1 = (float)paramdtz.getVideoDuration();
    float f2 = (float)((Long)paramdiZ.getValue()).longValue();
    paramcvx.setValue(f2 / f1);
  }

  public static void seek(dMr paramdMr, dtz paramdtz, cvx paramcvx) {
    paramdtz.setPaused(true);
    if (paramdMr.getButton() != 0) {
      float f = paramcvx.getValue();
      paramdtz.aN(f);
      diZ localdiZ = new diZ(paramcvx);
      localdiZ.setValue(Long.valueOf(()(f * (float)paramdtz.getVideoDuration())));
      updateSlider(localdiZ, paramdtz, paramcvx);
      paramdtz.play();
      paramdtz.setPaused(false);
    }
  }
}