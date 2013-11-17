import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

public class bFD
{
  public static final Logger K = Logger.getLogger(bFD.class);
  private static final String gAK = ".png";
  private static final String gAL = "BorderTopLeft";
  private static final String gAM = "BorderTop";
  private static final String gAN = "BorderTopRight";
  private static final String gAO = "BorderRight";
  private static final String gAP = "BorderBottomRight";
  private static final String gAQ = "BorderBottom";
  private static final String gAR = "BorderBottomLeft";
  private static final String gAS = "BorderLeft";
  private static final String gAT = "BtnCloseDefault";
  private static final String gAU = "BtnCloseOver";
  private static final String gAV = "BtnMinimizeDefault";
  private static final String gAW = "BtnMinimizeOver";
  private static final String gAX = "BtnMaximizeDefault";
  private static final String gAY = "BtnMaximizeOver";
  private static final String gAZ = "BtnRestoreDefault";
  private static final String gBa = "BtnRestoreOver";
  private static final String gBb = "TitleBarTop2";
  private static final String gBc = "TitleBarBottom2";
  private static final String gBd = "TitleBarCenter2";
  private final String gBe;
  public final String gBf;
  private final ImageIcon gBg;
  private final Image gBh;
  private final ImageIcon gBi;
  private final Image gBj;
  private final ImageIcon gBk;
  private final Image gBl;
  private final ImageIcon gBm;
  private final Image gBn;
  private final ImageIcon gBo;
  private final Image gBp;
  private final ImageIcon gBq;
  private final Image gBr;
  private final ImageIcon gBs;
  private final Image gBt;
  private final ImageIcon gBu;
  private final Image gBv;
  private final ImageIcon gBw;
  private final Image gBx;
  private final ImageIcon gBy;
  private final Image gBz;
  private final ImageIcon gBA;
  private final Image gBB;
  private final ImageIcon gBC;
  private final ImageIcon gBD;
  private final ImageIcon gBE;
  private final ImageIcon gBF;
  private final ImageIcon gBG;
  private final ImageIcon gBH;
  private final ImageIcon gBI;
  private final ImageIcon gBJ;
  private final Insets aMo;

  public bFD(String paramString)
  {
    this(paramString, "", null);
  }

  public bFD(String paramString1, String paramString2, bFD parambFD) {
    this.gBe = paramString1;
    this.gBf = paramString2;

    this.gBg = a("TitleBarTop2", parambFD != null ? parambFD.bNt() : null);
    this.gBh = this.gBg.getImage();

    this.gBi = a("TitleBarBottom2", parambFD != null ? parambFD.bNv() : null);
    this.gBj = this.gBi.getImage();

    this.gBk = a("TitleBarCenter2", parambFD != null ? parambFD.bNx() : null);
    this.gBl = this.gBk.getImage();

    this.gBm = a("BorderTopLeft", parambFD != null ? parambFD.bNz() : null);
    this.gBn = this.gBm.getImage();

    ImageIcon localImageIcon = a("BorderTop", parambFD != null ? parambFD.bNB() : null);
    if (localImageIcon.getImageLoadStatus() != 8) {
      BufferedImage localBufferedImage = new BufferedImage(1, 18, 1);
      for (j = 0; j < localBufferedImage.getWidth(); j++) {
        k = localBufferedImage.getHeight() - 1;
        localBufferedImage.setRGB(j, 0, 0);
        localBufferedImage.setRGB(j, k, 0);
        for (m = 1; m < k; m++)
          localBufferedImage.setRGB(j, m, 255);
      }
      this.gBo = new ImageIcon(localBufferedImage);
    } else {
      this.gBo = localImageIcon;
    }
    this.gBp = this.gBo.getImage();
    this.gBq = a("BorderTopRight", parambFD != null ? parambFD.bND() : null);
    this.gBr = this.gBq.getImage();

    this.gBs = a("BorderLeft", parambFD != null ? parambFD.bNF() : null);
    this.gBt = this.gBs.getImage();

    this.gBu = a("BorderBottomLeft", parambFD != null ? parambFD.bNH() : null);
    this.gBv = this.gBu.getImage();

    this.gBw = a("BorderBottom", parambFD != null ? parambFD.bNJ() : null);
    this.gBx = this.gBw.getImage();

    this.gBy = a("BorderBottomRight", parambFD != null ? parambFD.bNL() : null);
    this.gBz = this.gBy.getImage();

    this.gBA = a("BorderRight", parambFD != null ? parambFD.bNN() : null);
    this.gBB = this.gBA.getImage();

    this.gBC = a("BtnCloseDefault", parambFD != null ? parambFD.bNP() : null);
    this.gBD = a("BtnCloseOver", parambFD != null ? parambFD.bNQ() : null);

    this.gBE = a("BtnMinimizeDefault", parambFD != null ? parambFD.bNR() : null);
    this.gBF = a("BtnMinimizeOver", parambFD != null ? parambFD.bNS() : null);

    this.gBG = a("BtnMaximizeDefault", parambFD != null ? parambFD.bNT() : null);
    this.gBH = a("BtnMaximizeOver", parambFD != null ? parambFD.bNU() : null);

    this.gBI = a("BtnRestoreDefault", parambFD != null ? parambFD.bNV() : null);
    this.gBJ = a("BtnRestoreOver", parambFD != null ? parambFD.bNW() : null);

    int i = this.gBn.getHeight(null);
    int j = this.gBr.getHeight(null);
    int k = this.gBp.getHeight(null);
    int m = Math.max(Math.max(i, j), k);
    if (i != m)
      K.warn("Skin pbm : top left image height not consistent : " + i + " != " + m);
    if (j != m)
      K.warn("Skin pbm : top right image height not consistent : " + j + " != " + m);
    if (k != m) {
      K.warn("Skin pbm : top image height not consistent : " + k + " != " + m);
    }

    int n = this.gBt.getWidth(null);
    int i1 = this.gBv.getWidth(null);
    int i2 = Math.max(n, i1);
    if (n != i2)
      K.warn("Skin pbm : left image width not consistent : " + n + " != " + i2);
    if (i1 != i2) {
      K.warn("Skin pbm : bottom left image width not consistent : " + i1 + " != " + i2);
    }

    int i3 = this.gBv.getHeight(null);
    int i4 = this.gBx.getHeight(null);
    int i5 = this.gBz.getHeight(null);
    int i6 = Math.max(Math.max(i3, i4), i5);
    if (i3 != i6)
      K.warn("Skin pbm : bottom left image height not consistent : " + i3 + " != " + i6);
    if (i4 != i6)
      K.warn("Skin pbm : bottom image height not consistent : " + i4 + " != " + i6);
    if (i5 != i6) {
      K.warn("Skin pbm : bottom right image height not consistent : " + i5 + " != " + i6);
    }

    int i7 = this.gBB.getWidth(null);
    int i8 = this.gBz.getWidth(null);
    int i9 = Math.max(i7, i8);
    if (i7 != i9)
      K.warn("Skin pbm : right image width not consistent : " + i7 + " != " + i9);
    if (i8 != i9) {
      K.warn("Skin pbm : bottom right image width not consistent : " + i8 + " != " + i9);
    }
    this.aMo = new Insets(m, i2, i6, i9);
  }

  private ImageIcon a(String paramString, ImageIcon paramImageIcon)
  {
    ImageIcon localImageIcon;
    try {
      URL localURL = new URL(this.gBe + paramString + this.gBf + ".png");
      localImageIcon = new ImageIcon(localURL);
    } catch (MalformedURLException localMalformedURLException) {
      localImageIcon = new ImageIcon(this.gBe + paramString + this.gBf + ".png");
    }
    if (localImageIcon.getImageLoadStatus() != 8) {
      if (paramImageIcon != null)
        localImageIcon = paramImageIcon;
      else {
        K.error("Skin image not present : " + this.gBe + paramString);
      }
    }
    return localImageIcon;
  }

  public ImageIcon bNt() {
    return this.gBg;
  }

  public Image bNu() {
    return this.gBh;
  }

  public ImageIcon bNv() {
    return this.gBi;
  }

  public Image bNw() {
    return this.gBj;
  }

  public ImageIcon bNx() {
    return this.gBk;
  }

  public Image bNy() {
    return this.gBl;
  }

  public ImageIcon bNz() {
    return this.gBm;
  }

  public Image bNA() {
    return this.gBn;
  }

  public ImageIcon bNB() {
    return this.gBo;
  }

  public Image bNC() {
    return this.gBp;
  }

  public ImageIcon bND() {
    return this.gBq;
  }

  public Image bNE() {
    return this.gBr;
  }

  public ImageIcon bNF() {
    return this.gBs;
  }

  public Image bNG() {
    return this.gBt;
  }

  public ImageIcon bNH() {
    return this.gBu;
  }

  public Image bNI() {
    return this.gBv;
  }

  public ImageIcon bNJ() {
    return this.gBw;
  }

  public Image bNK() {
    return this.gBx;
  }

  public ImageIcon bNL() {
    return this.gBy;
  }

  public Image bNM() {
    return this.gBz;
  }

  public ImageIcon bNN() {
    return this.gBA;
  }

  public Image bNO() {
    return this.gBB;
  }

  public ImageIcon bNP() {
    return this.gBC;
  }

  public ImageIcon bNQ() {
    return this.gBD;
  }

  public ImageIcon bNR() {
    return this.gBE;
  }

  public ImageIcon bNS() {
    return this.gBF;
  }

  public ImageIcon bNT() {
    return this.gBG;
  }

  public ImageIcon bNU() {
    return this.gBH;
  }

  public ImageIcon bNV() {
    return this.gBI;
  }

  public ImageIcon bNW() {
    return this.gBJ;
  }

  public Insets getBorderInsets() {
    return this.aMo;
  }
}