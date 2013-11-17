import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.sun.opengl.cg.CGcontext;
import com.sun.opengl.cg.CGeffect;
import com.sun.opengl.cg.CGparameter;
import com.sun.opengl.cg.CGtechnique;
import com.sun.opengl.cg.CgGL;
import org.apache.log4j.Logger;

public class nI extends bkk
{
  private static final boolean aRU = true;
  private static final Logger K = Logger.getLogger(nI.class);

  private final hz aRV = new dih(this);

  private static CGcontext aRW = null;
  protected CGeffect aRX;
  private final Xg aRY;
  private static String aRZ = null;

  public nI()
  {
    this.aRY = new Xg(5);
  }

  public void load(String paramString1, String paramString2)
  {
    super.load(paramString1, paramString2);

    if (aRW == null) {
      try {
        aRW = CgGL.cgCreateContext();
      } catch (NoClassDefFoundError localNoClassDefFoundError) {
        K.error("GlEffect not loaded : Cg library not loaded");
        return;
      } catch (UnsatisfiedLinkError localUnsatisfiedLinkError) {
        K.error("GlEffect not loaded : Cg library not found : " + localUnsatisfiedLinkError.getMessage());
        return;
      }
      CgGL.cgGLRegisterStates(aRW);
    }
    byte[] arrayOfByte;
    if (aRZ == null)
    {
      String str1 = dtb.getPath(paramString2) + "/functions.cgfx";
      try
      {
        arrayOfByte = dtb.readFile(str1);
      } catch (Exception localException2) {
        K.error("Unable to read file functions: " + str1);
        return;
      }
      aRZ = new String(arrayOfByte);
    }

    try
    {
      arrayOfByte = dtb.readFile(paramString2);
    } catch (Exception localException1) {
      K.error("Unable to read file " + paramString2);
      return;
    }

    String str2 = new String(arrayOfByte);

    this.aRX = CgGL.cgCreateEffect(aRW, aRZ + str2, null);
    if (this.aRX == null) {
      K.error(CgGL.cgGetLastErrorString(null) + "\n(prendre en compte le nombre de ligne de functions.cgfx)");

      K.error(CgGL.cgGetLastListing(aRW));
    }

    initialize();
  }

  public void reload()
  {
    if (this.aRX != null) {
      CgGL.cgDestroyEffect(this.aRX);
    }
    super.reload();
  }

  public void g(String paramString1, String paramString2)
  {
    super.g(paramString1, paramString2);

    aRW = CgGL.cgCreateContext();
    CgGL.cgGLRegisterStates(aRW);
    this.aRX = CgGL.cgCreateEffect(aRW, paramString2, null);

    initialize();
  }

  public void parse()
  {
    this.aRY.clear();
    CGparameter localCGparameter = CgGL.cgGetFirstEffectParameter(this.aRX);
    do {
      String str = CgGL.cgGetParameterName(localCGparameter);
      if ((str != null) && (str.length() > 0)) {
        this.aRY.put(byn.jo(str), new NT(str, localCGparameter));
      }
      localCGparameter = CgGL.cgGetNextParameter(localCGparameter);
    }while (localCGparameter != null);
  }

  public final void a(bSr parambSr, Entity paramEntity, cgR paramcgR)
  {
    super.a(parambSr, paramEntity, paramcgR);
    if ((!bB) && (parambSr.aJG() != dHL.lSB)) throw new AssertionError("Invalid renderer type");

    if (bvl()) {
      dsZ.cZe().dk(paramcgR.getFloat("gColorScale"));
      paramEntity.p(parambSr);
    } else {
      if (paramcgR != null) {
        a(paramcgR);
      }
      this.fAI.a(parambSr, paramEntity);
    }
  }

  protected final void a(cgR paramcgR)
  {
    if ((!bB) && (paramcgR == null)) throw new AssertionError();
    paramcgR.a(this.aRV);
  }

  public static void a(CGcontext paramCGcontext) {
    aRW = paramCGcontext;
  }

  private int uM()
  {
    int i = 0;
    CGtechnique localCGtechnique = CgGL.cgGetFirstTechnique(this.aRX);
    CgGL.cgGetTechniqueName(localCGtechnique);
    while (localCGtechnique != null) {
      i++;
      localCGtechnique = CgGL.cgGetNextTechnique(localCGtechnique);
    }
    return i;
  }

  private void initialize() {
    this.fAH.clear();
    if (!aNh.eth.bdY()) {
      return;
    }

    this.fAH.aV(uM());

    CGtechnique localCGtechnique = CgGL.cgGetFirstTechnique(this.aRX);
    while (localCGtechnique != null) {
      boolean bool = CgGL.cgValidateTechnique(localCGtechnique);
      GS localGS = new GS(localCGtechnique);
      int i = localGS.bjv;

      String str = "[TECHNIQUE] " + (bool ? "V" : "X") + ' ' + localGS.m_name + " (" + String.format("0x%X", new Object[] { Integer.valueOf(i) }) + ") ";
      if (bool)
        K.info(str);
      else {
        K.warn(str);
      }

      if (bool) {
        this.fAH.put(i, localGS);
      }
      localCGtechnique = CgGL.cgGetNextTechnique(localCGtechnique);
    }
    parse();
  }
}