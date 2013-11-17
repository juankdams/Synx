import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;
import java.util.HashMap;
import javax.media.opengl.GL;

public final class Pb
{
  public static final boolean cgt = false;
  public dKi cgu = new bBv(this);
  public int cgv;
  public int bmM;
  public EntitySprite cgw;
  public EntitySprite cgx;
  private static final Pb cgy = new Pb();
  private final HashMap cgz;
  private akR cgA;
  private final ArrayList cgB = new ArrayList();
  private final ArrayList cgC = new ArrayList();
  private final cSR cgD;
  private final cSR cgE;
  private final ArrayList cgF;
  private uz cgG;
  private uz cgH;
  private boolean cgI;
  public GLGeometrySprite cgJ;
  private boolean cgK;
  private String cgL = "transform";
  private String cgM = "gui";
  private int cgN;

  private Pb()
  {
    this.cgz = new HashMap(16);
    this.cgA = new akR(16);
    this.cgD = new cSR();
    this.cgE = new cSR();
    this.cgF = new ArrayList();

    this.cgw = ((EntitySprite)EntitySprite.kYR.bQx());
    this.cgw.mnU = this;
    this.cgJ = ((GLGeometrySprite)GLGeometrySprite.ieZ.bQx());
    this.cgw.a(this.cgJ);
    this.cgw.setMaterial(Material.mwy);
    this.cgw.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    this.cgw.i(1.0F, 0.0F, 0.0F, 1.0F);

    this.cgx = ((EntitySprite)EntitySprite.kYR.bQx());
    this.cgx.mnU = this;
    this.cgx.a((GeometrySprite)GLGeometrySprite.ieZ.bQx());
    this.cgx.setMaterial(Material.mwy);
    this.cgx.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    this.cgx.i(1.0F, 0.0F, 0.0F, 1.0F);
  }

  public static Pb aaU() {
    return cgy;
  }

  public void a(dKi paramdKi) {
    this.cgu = paramdKi;
  }

  public void c(String paramString1, String paramString2, String paramString3) {
    this.cgA.put(paramString1, paramString2);
    bkk localbkk = this.cgu.hb(paramString3);
    localbkk.setName(paramString1);
    this.cgz.put(localbkk.getName(), localbkk);
  }

  public void a(bkk parambkk) {
    this.cgz.put(parambkk.getName(), parambkk);
  }

  public void cX(String paramString) {
    this.cgz.remove(paramString);
  }

  public bkk cY(String paramString) {
    return (bkk)this.cgz.get(paramString);
  }

  public void cZ(String paramString)
  {
    this.cgL = paramString;
  }

  public bkk aaV() {
    return (bkk)this.cgz.get(this.cgL);
  }

  public void da(String paramString) {
    this.cgM = paramString;
  }

  public bkk aaW() {
    return (bkk)this.cgz.get(this.cgM);
  }

  public void aaX() {
    for (bkk localbkk : this.cgz.values())
      localbkk.reset();
  }

  public void aaY()
  {
    this.cgA.b(new bBw(this));

    this.cgA = null;
    nI.a(null);
  }

  public void update(int paramInt)
  {
    this.cgv = paramInt;
    this.bmM += paramInt;

    for (int i = 0; i < this.cgB.size(); i++) {
      ((bmb)this.cgB.get(i)).update(paramInt);
    }

    this.cgE.a(new bBy(this));

    this.cgE.clear();

    this.cgD.a(new bBs(this, paramInt));
  }

  public void bg(boolean paramBoolean)
  {
    this.cgK = paramBoolean;
    aaZ();
  }

  public void a(bmb parambmb) {
    this.cgB.add(parambmb);
    aaZ();
  }

  public void b(bmb parambmb) {
    this.cgB.remove(parambmb);
    aaZ();
  }

  public void a(adQ paramadQ) {
    if ((!bB) && (paramadQ == null)) throw new AssertionError();
    this.cgE.put(paramadQ.getId(), paramadQ);
  }

  public void b(adQ paramadQ) {
    this.cgD.remove(paramadQ.getId());
    this.cgE.remove(paramadQ.getId());
  }

  public adQ gh(int paramInt) {
    adQ localadQ = (adQ)this.cgD.get(paramInt);
    if (localadQ != null) {
      return localadQ;
    }
    return (adQ)this.cgE.get(paramInt);
  }

  public boolean j(bSr parambSr) {
    if ((!parambSr.aJH()) || (this.cgI)) {
      return false;
    }
    return aba();
  }

  private void aaZ() {
    this.cgC.clear();
    for (bmb localbmb : this.cgB)
      if ((this.cgK) || (localbmb.aIr()))
        this.cgC.add(localbmb);
  }

  private boolean aba()
  {
    for (bmb localbmb : this.cgC) {
      if ((localbmb.apR()) && (localbmb.bxa().pZ(localbmb.bxb()))) {
        return true;
      }
    }
    return false;
  }

  public void ai(int paramInt1, int paramInt2) {
    ayc localayc = dHL.lSB.dhZ();
    if (!localayc.aJH()) {
      return;
    }

    abc();

    this.cgG = aj(paramInt1, paramInt2);
    this.cgH = aj(paramInt1, paramInt2);
    if ((this.cgG == null) || (this.cgH == null)) {
      abc();
      this.cgI = true;
    }

    this.cgw.c(paramInt2 / 2.0F, -paramInt1 / 2.0F, paramInt1, paramInt2);
    this.cgx.c(paramInt2 / 2.0F, -paramInt1 / 2.0F, paramInt1, paramInt2);
  }

  public void a(xn paramxn, bSr parambSr) {
    if (!j(parambSr)) {
      paramxn.a(parambSr);
      k(parambSr);
    } else {
      a(paramxn);
    }
  }

  private uz aj(int paramInt1, int paramInt2) {
    int i = this.cgF.size();
    for (int j = 0; j < i; j++) {
      uz localuz = (uz)this.cgF.get(j);
      cSJ localcSJ = localuz.wn(0);
      if ((localcSJ.getWidth() == paramInt1) && (localcSJ.getHeight() == paramInt2) && (!localuz.Du()) && (localuz != this.cgG) && (localuz != this.cgH))
      {
        return localuz;
      }
    }
    return ak(paramInt1, paramInt2);
  }

  public void abb() {
    this.cgD.s(new bBt(this));

    this.cgD.clear();
    this.cgB.clear();
    aaZ();
  }

  private void k(bSr parambSr)
  {
    this.cgD.s(new bBu(this, parambSr));
  }

  private void a(xn paramxn)
  {
    ayc localayc = dHL.lSB.dhZ();
    GL localGL = (GL)localayc.bZk();

    dsZ localdsZ = dsZ.cZe();
    localayc.b(this.cgG);
    ajQ.axf().c(localGL);

    paramxn.a(localayc);
    k(localayc);

    Matrix44 localMatrix44 = localayc.bZj();
    localayc.g(Matrix44.bFe);

    if ((!bB) && (!aba())) throw new AssertionError();

    cSJ localcSJ = this.cgG.wn(0);
    localdsZ.a(localGL, 0, 0, localcSJ.getWidth(), localcSJ.getHeight());

    this.cgw.setMaterial(Material.mwz);
    this.cgJ.a(cnQ.hUU, cnQ.hUT);

    Object localObject = this.cgG;

    for (int i = 0; i < this.cgC.size(); i++)
    {
      uz localuz;
      if (i != this.cgC.size() - 1)
        localuz = localObject == this.cgH ? this.cgG : this.cgH;
      else {
        localuz = null;
      }

      localayc.b(localuz);
      ajQ.axf().c(localGL);

      this.cgw.setTexture((uz)localObject);
      ((bmb)this.cgC.get(i)).c(this.cgw);
      localObject = localuz;

      ajQ.axf().c(localGL);
      this.cgw.a(localayc);
    }

    localayc.g(localMatrix44);
  }

  private uz ak(int paramInt1, int paramInt2)
  {
    ayc localayc = dHL.lSB.dhZ();
    uz localuz = localayc.a(bPg.bVP(), paramInt1, paramInt2, false);
    localuz.c(localayc);
    if (!localuz.gI()) {
      localuz.axl();
      localuz.axl();
      return null;
    }

    localuz.gQ();
    this.cgF.add(localuz);
    return localuz;
  }

  private void abc() {
    int i = this.cgF.size();
    for (int j = 0; j < i; j++) {
      uz localuz = (uz)this.cgF.get(j);
      localuz.axl();
      localuz.axl();
    }
    this.cgF.clear();
  }
}