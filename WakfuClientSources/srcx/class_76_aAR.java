import org.apache.log4j.Logger;

public class aAR extends BO
  implements asO, bBz
{
  private static Logger K = Logger.getLogger(aAR.class);
  public static final String TAG = "pixmap";
  private dDq bQC;
  private String m_name;
  private ajb dTT = ajb.dhZ;

  private boolean dTU = false;

  private static final aee aOr = new bOO(new cKe(), 10000);

  public static final int dTV = "height".hashCode();
  public static final int dTW = "width".hashCode();
  public static final int dTX = "x".hashCode();
  public static final int dTY = "y".hashCode();
  public static final int cex = "name".hashCode();
  public static final int dTZ = "texture".hashCode();
  public static final int dUa = "position".hashCode();
  public static final int dUb = "rotation".hashCode();
  public static final int dUc = "flipHorizontaly".hashCode();
  public static final int dUd = "flipVerticaly".hashCode();

  public static aAR checkOut()
  {
    aAR localaAR;
    try
    {
      localaAR = (aAR)aOr.Mm();
      localaAR.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localaAR = new aAR();
      localaAR.aJ();
    }
    return localaAR;
  }

  public String getTag()
  {
    return "pixmap";
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public void setX(int paramInt)
  {
    if (this.bQC != null) {
      this.bQC.setX(paramInt);
      setNeedsToPreProcess();
    }
  }

  public int getX() {
    if (this.bQC != null) {
      return this.bQC.getX();
    }
    return 0;
  }

  public void setY(int paramInt)
  {
    if (this.bQC != null) {
      this.bQC.setY(paramInt);
      setNeedsToPreProcess();
    }
  }

  public int getY() {
    if (this.bQC != null) {
      return this.bQC.getY();
    }
    return 0;
  }

  public void setWidth(int paramInt)
  {
    if (this.bQC == null) {
      return;
    }

    this.bQC.setWidth(paramInt);
    this.dTU = true;
    setNeedsToPreProcess();

    this.bQC.kQ(paramInt == -1);
  }

  public int getWidth() {
    if (this.bQC != null) {
      return this.bQC.getWidth();
    }
    return 0;
  }

  public void setHeight(int paramInt)
  {
    if (this.bQC != null) {
      this.bQC.setHeight(paramInt);
      this.dTU = true;
      setNeedsToPreProcess();

      this.bQC.kQ(paramInt == -1);
    }
  }

  public int getHeight() {
    if (this.bQC != null) {
      return this.bQC.getHeight();
    }
    return 0;
  }

  public int getOrientedHeight()
  {
    if (getRotation().bVu()) {
      return getWidth();
    }
    return getHeight();
  }

  public int getOrientedWidth()
  {
    if (getRotation().bVu()) {
      return getHeight();
    }
    return getWidth();
  }

  public void setFlipHorizontaly(boolean paramBoolean)
  {
    if ((this.bQC != null) && (this.bQC.bVX() != paramBoolean)) {
      this.bQC.setFlipHorizontaly(paramBoolean);
      setNeedsToPreProcess();
    }
  }

  public void setFlipVerticaly(boolean paramBoolean) {
    if ((this.bQC != null) && (this.bQC.bVY() != paramBoolean)) {
      this.bQC.setFlipVerticaly(paramBoolean);
      setNeedsToPreProcess();
    }
  }

  public void setRotation(bOo parambOo) {
    if ((this.bQC != null) && (this.bQC.getRotation() != parambOo)) {
      this.bQC.setRotation(parambOo);
      setNeedsToPreProcess();
    }
  }

  public bOo getRotation() {
    if (this.bQC != null) {
      return this.bQC.getRotation();
    }

    return null;
  }

  public void setTexture(uz paramuz) {
    if (this.bQC == null) {
      return;
    }
    if (this.bQC.dfl()) {
      uz localuz = this.bQC.hN();
      if ((paramuz != null) || (localuz != null)) {
        if ((paramuz == null) || (localuz == null)) {
          this.dTU = true;
        } else {
          MD localMD = paramuz.cqv();
          if ((localMD.getX() != this.bQC.dfk()) || (localMD.getY() != this.bQC.dfj()))
          {
            this.dTU = true;
          }
        }
      }
    }
    this.bQC.setTexture(paramuz);
    setNeedsToPreProcess();
  }

  public dDq getPixmap() {
    return this.bQC;
  }

  public void setPixmap(dDq paramdDq) {
    this.bQC = paramdDq;
  }

  public void setPosition(ajb paramajb) {
    this.dTT = paramajb;
  }

  public ajb getPosition() {
    return this.dTT;
  }

  public void setup(dFD paramdFD)
  {
    if ((paramdFD instanceof doT))
      ((doT)paramdFD).setPixmap(this);
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if ((this.bQC != null) && (this.bQC.dfm())) {
      this.bQC.dfn();
    }

    if (this.dTU) {
      doT localdoT = (doT)getParentOfType(doT.class);

      if ((localdoT instanceof czv)) {
        localdoT.setPixmap(this);
      }
      this.dTU = false;
    }

    return bool;
  }

  public void bc()
  {
    super.bc();
    this.dTT = null;
    if (this.bQC != null)
      this.bQC.setTexture(null);
    this.bQC = null;
    this.m_name = null;
  }

  public void aJ()
  {
    if ((!bB) && (this.bQC != null)) throw new AssertionError();

    super.aJ();
    this.bQC = new dDq();
    this.dTT = ajb.dhZ;
    this.dTU = false;
  }

  public void c(bdj parambdj)
  {
    aAR localaAR = (aAR)parambdj;
    super.c(localaAR);
    localaAR.dTT = this.dTT;
    localaAR.setTexture(this.bQC.hN());
    if (!this.bQC.dfl()) {
      localaAR.setHeight(this.bQC.dfj());
      localaAR.setWidth(this.bQC.dfk());
    }
    localaAR.setX(this.bQC.getX());
    localaAR.setY(this.bQC.getY());
    localaAR.setFlipHorizontaly(this.bQC.bVX());
    localaAR.setFlipVerticaly(this.bQC.bVY());
    localaAR.setRotation(this.bQC.getRotation());
    localaAR.setName(this.m_name);
  }

  public void a(dDq paramdDq) {
    this.dTU = true;
    setNeedsToPreProcess();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == dTZ)
      setTexture(paramaKN.gN(paramString));
    else if (paramInt == dTV)
      setHeight(bUD.aR(paramString));
    else if (paramInt == dTW)
      setWidth(bUD.aR(paramString));
    else if (paramInt == dTX)
      setX(bUD.aR(paramString));
    else if (paramInt == dTY)
      setY(bUD.aR(paramString));
    else if (paramInt == dUa)
      setPosition(ajb.eB(paramString));
    else if (paramInt == dUb)
      setRotation(bOo.ke(paramString));
    else if (paramInt == dUc)
      setFlipHorizontaly(bUD.getBoolean(paramString));
    else if (paramInt == dUd)
      setFlipVerticaly(bUD.getBoolean(paramString));
    else if (paramInt == cex)
      setName(paramString);
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == dTZ)
      setTexture((uz)paramObject);
    else if (paramInt == dTV)
      setHeight(bUD.aR(paramObject));
    else if (paramInt == dTW)
      setWidth(bUD.aR(paramObject));
    else if (paramInt == dTX)
      setX(bUD.aR(paramObject));
    else if (paramInt == dTY)
      setY(bUD.aR(paramObject));
    else if (paramInt == dUa)
      setPosition((ajb)paramObject);
    else if (paramInt == dUb)
      setRotation((bOo)paramObject);
    else if (paramInt == dUc)
      setFlipHorizontaly(bUD.getBoolean(paramObject));
    else if (paramInt == dUd)
      setFlipVerticaly(bUD.getBoolean(paramObject));
    else if (paramInt == cex)
      setName((String)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}