import java.io.IOException;
import org.apache.log4j.Logger;
import org.eclipse.swt.graphics.ImageData;

public class cIO
{
  public static final Logger K = Logger.getLogger(cIO.class);
  private static final String gAK = ".png";
  private static final String gAL = "BorderTopLeftSimple";
  private static final String gAM = "BorderTop";
  private static final String gAN = "BorderTopRight";
  private static final String gAO = "BorderRight";
  private static final String gAP = "BorderBottomRight";
  private static final String gAQ = "BorderBottom";
  private static final String gAR = "BorderBottomLeft";
  private static final String gAS = "BorderLeft";
  private static final String gAT = "BtnCloseDefault";
  private static final String gAU = "BtnCloseOver";
  private final String gBe;
  public final String gBf;
  private final ImageData iGH;
  private final ImageData iGI;
  private final ImageData iGJ;
  private final ImageData iGK;
  private final ImageData iGL;
  private final ImageData iGM;
  private final ImageData iGN;
  private final ImageData iGO;
  private final ImageData iGP;
  private final ImageData iGQ;

  public cIO(String paramString)
  {
    this(paramString, "", null);
  }

  public cIO(String paramString1, String paramString2, cIO paramcIO) {
    this.gBe = paramString1;
    this.gBf = paramString2;

    this.iGH = a("BorderTopLeftSimple", paramcIO != null ? paramcIO.cDn() : null);
    this.iGI = a("BorderTop", paramcIO != null ? paramcIO.cDm() : null);
    this.iGJ = a("BorderTopRight", paramcIO != null ? paramcIO.cDo() : null);

    this.iGK = a("BorderLeft", paramcIO != null ? paramcIO.cDk() : null);
    this.iGL = a("BorderRight", paramcIO != null ? paramcIO.cDl() : null);

    this.iGM = a("BorderBottomLeft", paramcIO != null ? paramcIO.cDg() : null);
    this.iGN = a("BorderBottom", paramcIO != null ? paramcIO.cDf() : null);
    this.iGO = a("BorderBottomRight", paramcIO != null ? paramcIO.cDh() : null);

    this.iGP = a("BtnCloseDefault", paramcIO != null ? paramcIO.cDi() : null);
    this.iGQ = a("BtnCloseOver", paramcIO != null ? paramcIO.cDj() : null);
  }

  private ImageData a(String paramString, ImageData paramImageData) {
    try {
      String str = this.gBe + paramString + this.gBf + ".png";
      return new ImageData(dtb.pT(str));
    } catch (IOException localIOException) {
      K.error("Skin image not present : " + this.gBe + paramString);
    }return paramImageData;
  }

  public ImageData cDf()
  {
    return this.iGN;
  }

  public ImageData cDg() {
    return this.iGM;
  }

  public ImageData cDh() {
    return this.iGO;
  }

  public ImageData cDi() {
    return this.iGP;
  }

  public ImageData cDj() {
    return this.iGQ;
  }

  public ImageData cDk() {
    return this.iGK;
  }

  public ImageData cDl() {
    return this.iGL;
  }

  public ImageData cDm() {
    return this.iGI;
  }

  public ImageData cDn() {
    return this.iGH;
  }

  public ImageData cDo() {
    return this.iGJ;
  }
}