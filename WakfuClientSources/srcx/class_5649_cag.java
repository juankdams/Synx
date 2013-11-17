import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.awt.Dimension;
import java.awt.Insets;

public class cag extends csD
  implements dKW
{
  public static final String TAG = "Particle";
  private int hY;
  private int hZ;
  private aFG hqK;
  private boolean hqL;
  private XulorParticleSystem hqM;
  private EntityGroup bqm;
  private caw hqN;
  private cEh hqO;
  private boolean hqP;
  private float buM;
  private int hqQ;
  private boolean hqR;
  private cEh hqS;
  private String SL;
  private int aQF;
  private float dka;
  private bNa bPm;
  private boolean hqT;
  private int hqU;
  private int hqV;
  public static final int hqW = "alignment".hashCode();
  public static final int hqX = "file".hashCode();
  public static final int hqY = "followBorders".hashCode();
  public static final int hqZ = "level".hashCode();
  public static final int hra = "moveClockWise".hashCode();
  public static final int hrb = "speed".hashCode();
  public static final int hrc = "timeToLive".hashCode();
  public static final int hrd = "useParentScissor".hashCode();
  public static final int dTX = "x".hashCode();
  public static final int dTY = "y".hashCode();
  public static final int hre = "zoom".hashCode();
  public static final int hrf = "turnNumber".hashCode();

  public cag()
  {
    this.hqL = false;
    this.hqP = false;
    this.buM = 200.0F;
    this.hqO = new cEh(0.0F, 0.0F, 0.0F);
    this.hqR = true;
  }

  public final bOu getMesh()
  {
    return null;
  }

  public String getTag()
  {
    return "Particle";
  }

  public final Entity getEntity()
  {
    return null;
  }

  public final void setFile(String paramString) {
    this.SL = paramString;
    setNeedsToPreProcess();
  }

  public final void setLevel(int paramInt) {
    this.aQF = paramInt;
    if (this.SL != null)
      setNeedsToPreProcess();
  }

  private void cex()
  {
    if (this.hqM != null)
      if (this.bPm != null) {
        this.hqM.m(this.bPm.QC() * this.bPm.getAlpha(), this.bPm.QD() * this.bPm.getAlpha(), this.bPm.QE() * this.bPm.getAlpha(), this.bPm.getAlpha());
      }
      else
      {
        this.hqM.m(1.0F, 1.0F, 1.0F, 1.0F);
      }
  }

  public void setModulationColor(bNa parambNa) { this.bPm = parambNa;
    cex(); }

  public bNa getModulationColor()
  {
    return this.bPm;
  }

  public final void setX(int paramInt) {
    this.hY = paramInt;
    this.hqO.setX(this.hY);
  }

  public final void setY(int paramInt) {
    this.hZ = paramInt;
    this.hqO.setY(this.hZ);
  }

  public final void setAlignment(aFG paramaFG) {
    this.hqK = paramaFG;
  }

  public final void setUseParentScissor(boolean paramBoolean) {
    this.hqL = paramBoolean;
    this.hqN.setUseParentScissor(this.hqL);
  }

  public void setFollowBorders(boolean paramBoolean) {
    this.hqP = paramBoolean;
  }

  public float getZoom() {
    return this.dka;
  }

  public void setZoom(float paramFloat) {
    this.dka = paramFloat;

    cxn localcxn = (cxn)this.bqm.dsE().sz(0);
    localcxn.c(this.dka, this.dka, this.dka);
    this.bqm.dsE().bMH();
  }

  public void setSpeed(float paramFloat) {
    this.buM = paramFloat;
  }

  public void setMoveClockWise(boolean paramBoolean) {
    this.hqR = paramBoolean;
  }

  public void setTimeToLive(int paramInt) {
    if (this.hqQ == paramInt) {
      return;
    }
    this.hqQ = paramInt;
    if (this.hqM != null)
      this.hqM.setDuration(paramInt);
  }

  public void setParticleSystem(XulorParticleSystem paramXulorParticleSystem) {
    if (this.hqM != null)
      this.hqM.axl();
    this.hqM = paramXulorParticleSystem;
    if (this.hqM != null) {
      this.hqM.gQ();
      if (this.hqQ > 0)
        this.hqM.setDuration(this.hqQ);
    }
    cex();
  }

  public final boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.hqM != null) {
      if (this.hqM.isAlive())
        this.hqM.ciX();
      this.hqM.axl();
      this.hqM = null;
      this.bqm.removeAllChildren();
    }
    cey();
    cex();
    return bool;
  }

  public final boolean r(int paramInt)
  {
    super.r(paramInt);

    this.bqm.removeAllChildren();

    us(paramInt);
    if ((this.hqM != null) && (this.hqM.bpu() < 0)) {
      beH();
      return false;
    }

    if (this.hqM != null) {
      this.hqM.a(this.bqm);
    }
    if (this.bqm.dsD() == null) {
      EntityGroup localEntityGroup = getParentEntity();
      if (localEntityGroup != null) {
        localEntityGroup.e(this.bqm);
        localEntityGroup.d(this.bqm);
      }
    }

    if ((this.hqM != null) && (this.hqM.bpu() < 0)) {
      beH();
      return false;
    }

    return true;
  }

  public final void b(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    cag localcag = (cag)parambdj;
    localcag.setFile(this.SL);
    localcag.setAlignment(this.hqK);
    localcag.setFollowBorders(this.hqP);
    localcag.setLevel(this.aQF);
    localcag.setMoveClockWise(this.hqR);
    localcag.setSpeed(this.buM);
    localcag.setTimeToLive(this.hqQ);
    localcag.setUseParentScissor(this.hqL);
    localcag.setX(this.hY);
    localcag.setY(this.hZ);
    localcag.setParticleSystem(this.hqM);
    localcag.setTurnNumber(this.hqU);
  }

  public void aJ()
  {
    if ((!bB) && (this.bqm != null)) throw new AssertionError();

    super.aJ();

    this.hqU = -1;
    this.hqV = 0;
    this.hqT = false;
    this.hqQ = -1;
    this.aQF = bDf.gyc;
    setNeedsToPostProcess();
    this.bqm = ((EntityGroup)EntityGroup.ecY.bQy());
    this.bqm.mnU = this;
    this.hqN = new caw();
    this.bqm.a(this.hqN);
    this.bqm.a(this.hqN);
    this.bqm.dsE().a(new cxn());
    this.hqN.setUseParentScissor(this.hqL);

    if (this.hqR)
      this.hqS = new cEh(1.0F, 0.0F, 0.0F);
    else {
      this.hqS = new cEh(-1.0F, 0.0F, 0.0F);
    }
    this.dka = 1.0F;
  }

  public void bc()
  {
    super.bc();

    this.SL = null;

    if ((this.hqM != null) && (this.hqM.isAlive())) {
      this.hqM.ciX();
      this.hqM.axl();
      this.hqM = null;
    }
    EntityGroup localEntityGroup = getParentEntity();
    if (localEntityGroup != null) {
      localEntityGroup.e(this.bqm);
    }

    this.bqm.removeAllChildren();
    this.bqm.axl();

    this.bqm = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == hqW)
      setAlignment(aFG.gr(paramString));
    else if (paramInt == hqX)
      setFile(paramaKN.gL(paramString));
    else if (paramInt == hqY)
      setFollowBorders(bUD.getBoolean(paramString));
    else if (paramInt == hqZ)
      setLevel(bUD.aR(paramString));
    else if (paramInt == hra)
      setMoveClockWise(bUD.getBoolean(paramString));
    else if (paramInt == hrb)
      setSpeed(bUD.getFloat(paramString));
    else if (paramInt == hrc)
      setTimeToLive(bUD.aR(paramString));
    else if (paramInt == hrd)
      setUseParentScissor(bUD.getBoolean(paramString));
    else if (paramInt == dTX)
      setX(bUD.aR(paramString));
    else if (paramInt == dTY)
      setY(bUD.aR(paramString));
    else if (paramInt == hre)
      setZoom(bUD.getFloat(paramString));
    else if (paramInt == hrf)
      setTurnNumber(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == hqW)
      setAlignment((aFG)paramObject);
    else if (paramInt == hqX)
      setFile((String)paramObject);
    else if (paramInt == hqY)
      setFollowBorders(bUD.getBoolean(paramObject));
    else if (paramInt == hqZ)
      setLevel(bUD.aR(paramObject));
    else if (paramInt == hra)
      setMoveClockWise(bUD.getBoolean(paramObject));
    else if (paramInt == hrb)
      setSpeed(bUD.getFloat(paramObject));
    else if (paramInt == hrc)
      setTimeToLive(bUD.aR(paramObject));
    else if (paramInt == hrd)
      setUseParentScissor(bUD.getBoolean(paramObject));
    else if (paramInt == dTX)
      setX(bUD.aR(paramObject));
    else if (paramInt == dTY)
      setY(bUD.aR(paramObject));
    else if (paramInt == hre)
      setZoom(bUD.getFloat(paramObject));
    else if (paramInt == hrf)
      setTurnNumber(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }

  private void cey()
  {
    if ((!bB) && (this.hqM != null)) throw new AssertionError("Particle system is already initialized");
    if (this.SL == null) {
      return;
    }
    String str = cBQ.cxL().ftS + this.SL;
    this.hqM = bHg.bOQ().A(str, this.aQF);
    if (this.hqM != null) {
      if (this.hqQ > 0)
        this.hqM.setDuration(this.hqQ);
      cDz.iwP.c(this.hqM);
    }
  }

  private void us(int paramInt) {
    dOc localdOc = (dOc)getParentOfType(dOc.class);
    if (localdOc == null) {
      return;
    }
    Or localOr = localdOc.getSize();

    if (this.hqP) {
      if (!this.hqT) {
        this.hqO.m((this.hY + this.hqK.iO(localOr.width)) / this.dka, (this.hZ + this.hqK.iP(localOr.height)) / this.dka, 0.0F);
        this.hqT = true;
      }
      O(paramInt, localOr.width, localOr.height);
    } else {
      this.hqO.m((this.hY + this.hqK.iO(localOr.width)) / this.dka, (this.hZ + this.hqK.iP(localOr.height)) / this.dka, 0.0F);
    }

    if (this.hqM != null)
      this.hqM.j(this.hqO.getX(), this.hqO.getY());
  }

  private void O(int paramInt1, int paramInt2, int paramInt3) {
    this.hqO.a(this.buM * paramInt1 / 1000.0F, this.hqS);

    if (this.hqO.getX() > paramInt2) {
      this.hqO.setX(paramInt2);
      if (this.hqO.getY() == 0.0F) {
        this.hqS.m(0.0F, 1.0F, 0.0F);
        a(aFG.eco, false);
      } else {
        this.hqS.m(0.0F, -1.0F, 0.0F);
        a(aFG.eci, true);
      }
    } else if (this.hqO.getX() < 0.0F) {
      this.hqO.setX(0.0F);
      if (this.hqO.getY() == 0.0F) {
        this.hqS.m(0.0F, 1.0F, 0.0F);
        a(aFG.ecm, true);
      } else {
        this.hqS.m(0.0F, -1.0F, 0.0F);
        a(aFG.ecg, false);
      }
    }

    if (this.hqO.getY() > paramInt3) {
      this.hqO.setY(paramInt3);
      if (this.hqO.getX() == 0.0F) {
        this.hqS.m(1.0F, 0.0F, 0.0F);
        a(aFG.ecg, true);
      } else {
        this.hqS.m(-1.0F, 0.0F, 0.0F);
        a(aFG.eci, false);
      }
    } else if (this.hqO.getY() < 0.0F) {
      this.hqO.setY(0.0F);
      if (this.hqO.getX() == 0.0F) {
        this.hqS.m(1.0F, 0.0F, 0.0F);
        a(aFG.ecm, false);
      } else {
        this.hqS.m(-1.0F, 0.0F, 0.0F);
        a(aFG.eco, true);
      }
    }
  }

  private void a(aFG paramaFG, boolean paramBoolean) {
    if (this.hqU < 0)
      return;
    if (paramBoolean != this.hqR) {
      return;
    }
    if (paramaFG != this.hqK) {
      return;
    }
    this.hqV += 1;
    if (this.hqV >= this.hqU)
      this.hqM.ciX();
  }

  public cEh getPosition() {
    return this.hqO;
  }

  private EntityGroup getParentEntity() {
    dOc localdOc = (dOc)getParentOfType(dOc.class);
    return localdOc == null ? null : localdOc.getEntity();
  }

  public void setTurnNumber(int paramInt) {
    this.hqU = paramInt;
  }
}