import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

public final class dbL
  implements cFh
{
  private static final Logger K = Logger.getLogger(dbL.class);

  private static final dbL kTY = new dbL();
  private final HashMap kTZ;
  private uz UI;
  private final ArrayList kUa = new ArrayList();
  private static final boolean kUb = true;
  private static cmQ kUc = new clJ();

  private dbL()
  {
    this.kTZ = new HashMap(18);
  }

  public static dbL cNv()
  {
    return kTY;
  }

  public void dF(String paramString) {
    if (this.UI != null) {
      this.UI.axl();
    }

    String str = dtb.pY(paramString);
    long l = byn.jp(str);
    this.UI = tq.Bg().b(dHL.lSB.dhZ(), l, paramString, false);
    this.UI.gQ();
  }

  public ciL b(String paramString, dn paramdn) {
    return a(paramString, this.UI, paramdn);
  }

  public ciL oL(String paramString)
  {
    if ((!bB) && (this.UI == null)) throw new AssertionError("Aucune texture par défaut n'est définie !");
    return a(paramString, this.UI);
  }

  public ciL a(String paramString, uz paramuz)
  {
    return a(paramString, paramuz, dn.Tq);
  }

  public ciL a(String paramString, uz paramuz, dn paramdn)
  {
    oM(paramString);
    ciL localciL = new ciL(paramString, paramuz, paramdn);
    this.kTZ.put(paramString, localciL);
    return localciL;
  }

  public void oM(String paramString)
  {
    ciL localciL = (ciL)this.kTZ.remove(paramString);
    if (localciL != null)
      localciL.release();
  }

  public ciL oN(String paramString)
  {
    return (ciL)this.kTZ.get(paramString);
  }

  private static void a(ciL paramciL) {
    if ((!bB) && (paramciL == null)) throw new AssertionError();
    paramciL.clear();
  }

  public void oO(String paramString)
  {
    ciL localciL = oN(paramString);
    if (localciL != null)
      a(localciL);
  }

  public void clear()
  {
    for (ciL localciL : this.kTZ.values())
      a(localciL);
  }

  public final void a(adG paramadG, dIt paramdIt, float paramFloat)
  {
    int i = this.kUa.size();
    if (i == 0) {
      return;
    }

    int j = (int)Math.floor(paramadG.apD());
    float f = 43.0F;
    long l = paramdIt.bpf();

    for (int k = 0; k < i; k++) {
      ciL localciL = (ciL)this.kUa.get(k);

      HighLightEntity localHighLightEntity = localciL.hu(l);
      if (localHighLightEntity != null)
      {
        if (!localciL.hIb.add(l)) {
          paramdIt.b(localHighLightEntity);
        }
        else
        {
          if (localHighLightEntity.bvg() == 0) {
            K.error("problème d'hightlight " + paramdIt.toString());
            localHighLightEntity.biG = true;
            return;
          }

          float[] arrayOfFloat = localciL.ckE();
          GeometryMesh localGeometryMesh = (GeometryMesh)localHighLightEntity.pW(0);
          localGeometryMesh.setColor(arrayOfFloat[0] * 0.5F, arrayOfFloat[1] * 0.5F, arrayOfFloat[2] * 0.5F, arrayOfFloat[3] * paramFloat);

          paramdIt.a(paramadG, localHighLightEntity, 43.0F, localciL.ckF(), j, localciL.ckD(), 0);
          localHighLightEntity.biG = true;
          if ((!bB) && (localHighLightEntity.bpu() < 0)) throw new AssertionError();

          paramadG.b(localHighLightEntity, true); } 
      }
    }
  }

  public void a(adG paramadG, int paramInt) { kUc.h(paramadG);
    this.kUa.clear();
    for (ciL localciL : this.kTZ.values()) {
      localciL.R(kUc);
      if ((localciL.isVisible()) && (!localciL.isEmpty())) {
        localciL.hIb.clear();
        b(localciL);
      }
    } }

  private void b(ciL paramciL)
  {
    int i = this.kUa.size();
    if (i == 0) {
      this.kUa.add(paramciL);
      return;
    }
    if (paramciL.edm >= ((ciL)this.kUa.get(i - 1)).edm) {
      this.kUa.add(paramciL);
      return;
    }
    for (int j = 0; j < i; j++)
      if (paramciL.edm < ((ciL)this.kUa.get(j)).edm) {
        this.kUa.add(j, paramciL);
        break;
      }
  }

  public void b(adG paramadG, float paramFloat1, float paramFloat2)
  {
  }

  public boolean h(long paramLong, String paramString) {
    ciL localciL = oN(paramString);
    if (localciL == null) {
      K.error("le layer " + paramString + " n'exsite pas");
      return false;
    }
    localciL.add(paramLong);
    return true;
  }

  public boolean B(cYk paramcYk) {
    long l = ai(paramcYk);
    for (ciL localciL : this.kTZ.values()) {
      if (localciL.N(l)) {
        return true;
      }
    }
    return false;
  }

  public void i(long paramLong, String paramString) {
    ciL localciL = oN(paramString);
    if (localciL == null) {
      K.error("le layer " + paramString + " n'exsite pas");
      return;
    }
    localciL.fD(paramLong);
  }

  public static long ac(int paramInt1, int paramInt2, int paramInt3) {
    return aUG.B(paramInt1, paramInt2, (short)paramInt3);
  }

  public static long ai(cYk paramcYk) {
    return ac(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public static cYk jw(long paramLong) {
    return aUG.eF(paramLong);
  }
}