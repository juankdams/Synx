import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.material.Material.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.io.IOException;
import org.apache.log4j.Logger;

public class auC extends dOc
  implements dKW
{
  public static final String TAG = "AnimatedElementViewer";
  private static final FB dGX = new cpr();

  private static final FB dGY = new cpo();
  protected bVf dGZ;
  private String dHa;
  private String UV;
  protected float aZs;
  protected float aZt;
  protected float cas;
  private boolean dbJ;
  private int dHb;
  private Material UZ;
  private boolean dHc;
  private aux UR = aux.dGK;
  private aux US = null;
  private dcC UT = dcC.kVG;
  private cnQ dHd = cnQ.hUU;
  private cnQ dHe = cnQ.hUY;
  private boolean dav;
  protected boolean dHf;
  private boolean dHg;
  private boolean dbY;
  private boolean dHh;
  private boolean dHi = false;
  private boolean dHj = false;
  private boolean dHk = false;

  public static final int dHl = "animatedElement".hashCode();
  public static final int dHm = "direction".hashCode();
  public static final int dHn = "filePath".hashCode();
  public static final int dHo = "equipment".hashCode();
  public static final int dHp = "animName".hashCode();
  public static final int dHq = "offsetX".hashCode();
  public static final int dHr = "offsetY".hashCode();
  public static final int dHs = "scale".hashCode();
  public static final int dHt = "useDefaultMaterial".hashCode();
  public static final int dHu = "blendPremult".hashCode();
  public static final int dHv = "forceReloadOnAnimNameChange".hashCode();
  public static final int dHw = "flipHorizontal".hashCode();
  public static final int dHx = "flipVertical".hashCode();

  public auC()
  {
    this.dbY = false;
    this.dav = false;
    this.dHc = true;
  }

  public String getTag()
  {
    return "AnimatedElementViewer";
  }

  public final String getFilePath() {
    return this.dHa;
  }

  public final void setFilePath(String paramString) {
    if (paramString == null) {
      return;
    }

    this.dHa = paramString;

    String str1 = cBQ.cxL().itQ;

    if (str1 == null) {
      return;
    }

    this.dGZ.em(dtb.pY(paramString));
    String str2;
    if ((paramString.startsWith("jar:")) || (paramString.startsWith("file:")))
      str2 = paramString;
    else {
      str2 = str1 + paramString;
    }
    try
    {
      this.dGZ.b(str2, false);
    } catch (IOException localIOException) {
      K.error("Unable to load anm file", localIOException);
    }

    this.dGZ.a(this.dHd, this.dHe);
  }

  public final String getAnimName() {
    return this.UV;
  }

  public final void setAnimName(String paramString) {
    if (paramString != null) {
      this.UV = paramString;
      this.dbJ = true;
    }
  }

  public ahm getAnimatedElement() {
    return this.dGZ;
  }

  public void setAnimatedElement(ahm paramahm) {
    if (this.dGZ == null) {
      return;
    }

    this.dGZ.e(paramahm);
    if (this.dHc) {
      this.dGZ.asU();
    }
    this.dHf = true;

    this.dav = true;
    this.dHg = true;
  }

  public boolean isForceReloadOnAnimNameChange() {
    return this.dHi;
  }

  public void setForceReloadOnAnimNameChange(boolean paramBoolean) {
    this.dHi = paramBoolean;
  }

  public void setFlipVertical(boolean paramBoolean) {
    this.dHk = paramBoolean;
  }

  public void setFlipHorizontal(boolean paramBoolean) {
    this.dHj = paramBoolean;
  }

  public float getOffsetX() {
    return this.aZs;
  }

  public final void setOffsetX(float paramFloat) {
    this.aZs = paramFloat;
    this.dHf = true;
  }

  public final float getOffsetY() {
    return this.aZt;
  }

  public final void setOffsetY(float paramFloat) {
    this.aZt = paramFloat;
    this.dHf = true;
  }

  public float getScale() {
    return this.cas;
  }

  public void setScale(float paramFloat) {
    this.cas = paramFloat;
    this.dHf = true;
  }

  public int getDirection() {
    return this.dHb;
  }

  public void setDirection(int paramInt) {
    this.dHb = paramInt;
    this.dHg = true;
  }

  public final void setMaterial(Material paramMaterial) {
    if (paramMaterial == null) {
      return;
    }
    this.UZ.e(paramMaterial);
    this.dav = true;
  }

  public void setEquipment(dR paramdR) {
    if (paramdR == null) {
      return;
    }

    this.UR = paramdR.ij();
    this.US = paramdR.ik();
    this.UT = paramdR.il();
    this.dbY = true;
  }

  public boolean isAppearanceCompatible(Jg paramJg) {
    return true;
  }

  public boolean isUseDefaultMaterial() {
    return this.dHc;
  }

  public void setUseDefaultMaterial(boolean paramBoolean) {
    this.dHc = paramBoolean;
  }

  public void setUseBlendPremult(boolean paramBoolean) {
    if (paramBoolean)
      this.dHd = cnQ.hUU;
    else {
      this.dHd = cnQ.hUX;
    }
    this.dHh = true;
  }

  public final void bc()
  {
    super.bc();

    if (this.dGZ != null) {
      this.dGZ.dispose();
      this.dGZ = null;
    }

    this.UR = aux.dGK;
    this.UT = dcC.kVG;

    if (this.UZ != null) {
      this.UZ.axl();
      this.UZ = null;
    }
  }

  public final void aJ()
  {
    super.aJ();

    if ((!bB) && (this.dGZ != null)) throw new AssertionError();
    this.dGZ = new bVf(0L);

    this.dHf = true;

    drf localdrf = new drf();
    localdrf.aJ();
    localdrf.setWidget(this);
    a(localdrf);

    setNeedsToPostProcess();

    this.dHd = cnQ.hUU;
    this.dHe = cnQ.hUY;

    this.UZ = ((Material)Material.mwD.bQy());
    this.UZ.e(Material.mwz);
    this.dav = true;
    this.dHc = true;
    this.dHi = false;
    this.dHj = false;
    this.dHk = false;
  }

  public boolean r(int paramInt) {
    super.r(paramInt);

    if (!this.aYZ) {
      return true;
    }

    aGQ();

    if (this.dbJ) {
      this.dGZ.eq(this.UV);
      if (this.dHi) {
        this.dGZ.asZ();
      }
      this.dbJ = false;
    }

    if (this.dHg) {
      this.dGZ.c(CG.eu(this.dHb));
      this.dHg = false;
    }

    if (this.dbY) {
      dR localdR = this.dGZ.aty();
      localdR.a(this.UR, this.US);
      localdR.a(this.UT);
      this.dGZ.asV();

      this.dbY = false;
    }

    if (this.dav) {
      this.dGZ.setMaterial(this.UZ);
      this.dav = false;
    }

    if (this.dHh) {
      this.dGZ.a(this.dHd, this.dHe);
      this.dHh = false;
    }

    this.dGZ.b(null, paramInt);
    return true;
  }

  public final void c(bdj parambdj)
  {
    auC localauC = (auC)parambdj;
    super.c(localauC);
    localauC.setFilePath(this.dHa);
    localauC.setOffsetX(this.aZs);
    localauC.setOffsetY(this.aZt);
    localauC.setScale(this.cas);
    localauC.setDirection(this.dHb);
    localauC.setMaterial(this.UZ);
    localauC.setAnimName(this.UV);
    localauC.setAnimatedElement(this.dGZ);
    localauC.setForceReloadOnAnimNameChange(this.dHi);
    localauC.setFlipHorizontal(this.dHj);
    localauC.setFlipVertical(this.dHk);

    localauC.dHc = this.dHc;
    localauC.setNeedsToPostProcess();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == dHn)
      setFilePath(paramString);
    else if (paramInt == dHp)
      setAnimName(paramString);
    else if (paramInt == dHm)
      setDirection(bUD.aR(paramString));
    else if (paramInt == dHq)
      setOffsetX(bUD.getFloat(paramString));
    else if (paramInt == dHr)
      setOffsetY(bUD.getFloat(paramString));
    else if (paramInt == dHs)
      setScale(bUD.getFloat(paramString));
    else if (paramInt == dHt)
      setUseDefaultMaterial(bUD.getBoolean(paramString));
    else if (paramInt == dHu)
      setUseDefaultMaterial(bUD.getBoolean(paramString));
    else if (paramInt == dHv)
      setForceReloadOnAnimNameChange(bUD.getBoolean(paramString));
    else if (paramInt == dHw)
      setFlipHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == dHx)
      setFlipVertical(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == dHl)
      setAnimatedElement((ahm)paramObject);
    else if (paramInt == dHn)
      setFilePath((String)paramObject);
    else if (paramInt == dHp)
      setAnimName((String)paramObject);
    else if (paramInt == dHm)
      setDirection(bUD.aR(paramObject));
    else if (paramInt == dHq)
      setOffsetX(bUD.getFloat(paramObject));
    else if (paramInt == dHr)
      setOffsetY(bUD.getFloat(paramObject));
    else if (paramInt == dHs)
      setScale(bUD.getFloat(paramObject));
    else if (paramInt == dHo)
      setEquipment((dR)paramObject);
    else if (paramInt == dHt)
      setUseDefaultMaterial(bUD.getBoolean(paramObject));
    else if (paramInt == dHv)
      setForceReloadOnAnimNameChange(bUD.getBoolean(paramObject));
    else if (paramInt == dHw)
      setFlipHorizontal(bUD.getBoolean(paramObject));
    else if (paramInt == dHx)
      setFlipVertical(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }

  protected void rd()
  {
    super.rd();
    Entity localEntity = this.dGZ.getEntity();
    this.bqm.d(localEntity);
    localEntity.a(dGX);
    localEntity.b(dGY);
  }

  protected void aGQ()
  {
    Entity localEntity = this.dGZ.getEntity();
    cxn localcxn = (cxn)localEntity.dsE().sz(0);
    localcxn.b((float)this.haN.getWidth() / 2.0F + this.aZs, (float)this.haN.getHeight() / 2.0F + this.aZt, 0.0F);
    float f = 1.0F;
    if (this.dGZ.aty() != null) {
      f = this.dGZ.aty().getScale();
    }
    localcxn.c(this.cas / f * (this.dHj ? -1.0F : 1.0F), this.cas / f * (this.dHk ? -1.0F : 1.0F), 0.0F);

    localEntity.dsE().bMH();
    this.dHf = false;

    if ((this.UZ != null) && (this.dav)) {
      this.dGZ.setMaterial(this.UZ);
      this.dGZ.asP().d(this.dGZ.asf());
      this.dav = false;
    }
  }

  public void setModulationColor(bNa parambNa) {
    if ((this.dGZ == null) || (parambNa == null)) {
      return;
    }
    Entity3D localEntity3D = this.dGZ.asP();
    if (localEntity3D == null) {
      return;
    }

    float[] arrayOfFloat1 = { 0.0F, 0.0F, 0.0F, 0.0F };
    float[] arrayOfFloat2 = { parambNa.QC() * parambNa.getAlpha(), parambNa.QD() * parambNa.getAlpha(), parambNa.QE() * parambNa.getAlpha(), parambNa.getAlpha() };

    this.UZ.V(arrayOfFloat2);
    this.UZ.aa(arrayOfFloat1);
    this.dGZ.setMaterial(this.UZ);
    localEntity3D.d(this.dGZ.asf());
  }

  public bNa getModulationColor() {
    float[] arrayOfFloat = this.dGZ.asf().dvD();
    return new bNa(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
  }
}