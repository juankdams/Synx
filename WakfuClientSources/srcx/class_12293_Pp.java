import org.apache.log4j.Logger;

 enum Pp
  implements cTL
{
  private static final Logger K = Logger.getLogger(Pp.class);
  private final String hX;

  private Pp(String arg3)
  {
    Object localObject;
    this.hX = localObject;
  }

  public final void abp() {
    a("MUSIC", "musicPath", new aOv[] { cpT.hZb.cpc(), cpT.hZb.cpe() });

    a("GUI_SFX", "guiSoundPath", new aOv[] { cpT.hZf.cpd() });
    a("AMB2D", "amb2DPath", new aOv[] { cpT.hZc.cpd(), cpT.hZc.cpc(), cpT.hZc.cpe() });

    a("FIGHT_SOUND", "fightSoundPath", new aOv[] { cpT.hZe.cpd(), cpT.hZe.cpe() });

    a("SFX_SOUND", "sfxSoundPath", new aOv[] { cpT.hZh.cpd(), cpT.hZh.cpe() });

    a("VOICES_SOUND", "voicesPath", new aOv[] { cpT.hZg.cpd(), cpT.hZg.cpe() });

    a("FOLEYS_SOUND", "foleysSoundPath", new aOv[] { cpT.hZj.cpd(), cpT.hZj.cpe() });

    a("PARTICLES_SOUND", "particlesSoundPath", new aOv[] { cpT.hZi.cpd(), cpT.hZi.cpe() });
  }

  private void a(String paramString1, String paramString2, aOv[] paramArrayOfaOv)
  {
    try {
      String str = ay.bd().getString(paramString2);
      dLQ localdLQ = dd(str);
      if (localdLQ == null) {
        return;
      }
      for (aOv localaOv : paramArrayOfaOv)
        localaOv.a(localdLQ);
    }
    catch (Exception localException) {
      K.error("impossible d'initialiser " + paramString1, localException);
    }
  }

  protected abstract dLQ dd(String paramString);

  public static Pp de(String paramString) {
    for (Pp localPp : values()) {
      if (localPp.hX.equalsIgnoreCase(paramString)) {
        return localPp;
      }
    }

    return null;
  }
}