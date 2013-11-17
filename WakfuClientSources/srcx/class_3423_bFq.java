import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bFq
{
  private static final Logger K = Logger.getLogger(bFq.class);

  public static String bMY() {
    try {
      return ay.bd().getString("shadersPath");
    } catch (bdh localbdh) {
      K.error("", localbdh);
    }
    return "";
  }

  public static int bMZ() {
    dbJ localdbJ = new dbJ(bMY() + "death.cgfx", "death0");
    localdbJ.eS(true);
    a(localdbJ, new coZ(1.0F));
    return localdbJ.getId();
  }

  public static int bNa() {
    dbJ localdbJ = new dbJ(bMY() + "death.cgfx", "death0");
    a(localdbJ, new bhQ(3000));
    return localdbJ.getId();
  }

  public static int bNb() {
    dbJ localdbJ = new dbJ(bMY() + "incarnam.cgfx", "incarnam");
    a(localdbJ, new coZ(1.0F));
    return localdbJ.getId();
  }

  public static int bNc() {
    dbJ localdbJ = new dbJ(bMY() + "bag.cgfx", "bag");
    a(localdbJ, new coZ(1.0F));
    return localdbJ.getId();
  }

  public static int bNd() {
    dbJ localdbJ = new dbJ(bMY() + "zinit.cgfx", "zinit");
    a(localdbJ, new coZ(1.0F));
    return localdbJ.getId();
  }

  public static int bNe() {
    dbJ localdbJ = new dbJ(bMY() + "mine.cgfx", "mine");
    a(localdbJ, new coZ(1.0F));
    return localdbJ.getId();
  }

  public static int bNf() {
    cgR localcgR = new cgR(new cbW[] { new cbW("gStrength", bHf.gFo), new cbW("position", bHf.gFp) });

    bQh localbQh = new bQh(bMY() + "moon_light.cgfx", "moon_light", localcgR, localcgR);

    a(localbQh, new coZ(1.0F));
    return localbQh.getId();
  }

  public static int bNg() {
    cgR localcgR = new cgR(new cbW[] { new cbW("gStrength", bHf.gFo), new cbW("gDistordLow", bHf.gFp), new cbW("gDistordHigh", bHf.gFp) });

    localcgR.setFloat("gStrength", 1.0F);
    bQg localbQg = new bQg(bMY() + "postprocess.cgfx", "shukrute1", localcgR, localcgR);

    a(localbQg, new coZ(1.0F));
    return localbQg.getId();
  }

  public static void a(dbJ paramdbJ, coZ paramcoZ) {
    paramdbJ.a(WakfuClientInstance.awy().Dg().cKV());
    paramdbJ.e(paramcoZ);
    Pb.aaU().a(paramdbJ);
  }

  public static void sB(int paramInt) {
    adQ localadQ = Pb.aaU().gh(paramInt);
    if (localadQ != null)
      localadQ.stop(500);
  }

  public static int bNh()
  {
    cgR localcgR = new cgR(new cbW[] { new cbW("gStrength", bHf.gFo), new cbW("gDistordLow", bHf.gFp), new cbW("gDistordHigh", bHf.gFp), new cbW("camera", bHf.gFq) });

    localcgR.setFloat("gStrength", 1.0F);
    bQj localbQj = new bQj(bMY() + "brume.cgfx", "brume", localcgR, localcgR);

    a(localbQj, new coZ(1.0F));
    return localbQj.getId();
  }

  public static int bNi() {
    cgR localcgR = new cgR(new cbW[] { new cbW("screen_size", bHf.gFp), new cbW("pixel_size", bHf.gFp), new cbW("camera", bHf.gFq) });

    localcgR.a("pixel_size", 10.0F, 10.0F);

    bQi localbQi = new bQi(bMY() + "pixelate.cgfx", "pixelate", localcgR, localcgR);

    a(localbQi, new coZ(1.0F));
    return localbQi.getId();
  }

  public static int c(coZ paramcoZ) {
    cgR localcgR = new cgR(new cbW[] { new cbW("gStrength", bHf.gFo), new cbW("gDistordLow", bHf.gFp), new cbW("gDistordHigh", bHf.gFp), new cbW("camera", bHf.gFq) });

    bQm localbQm = new bQm(bMY() + "blizzard.cgfx", "blizzard", localcgR, paramcoZ, localcgR);

    a(localbQm, paramcoZ);
    return localbQm.getId();
  }

  public static int d(coZ paramcoZ) {
    cgR localcgR = new cgR(new cbW[] { new cbW("gStrength", bHf.gFo), new cbW("gDistordLow", bHf.gFp), new cbW("gDistordHigh", bHf.gFp), new cbW("camera", bHf.gFq) });

    bQk localbQk = new bQk(bMY() + "Gloomy.cgfx", "Gloomy", localcgR, paramcoZ, localcgR);

    a(localbQk, paramcoZ);
    return localbQk.getId();
  }
}