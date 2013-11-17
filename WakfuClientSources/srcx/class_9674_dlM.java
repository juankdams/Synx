import java.util.Arrays;

public class dlM
  implements ajr
{
  protected final djj le;
  protected final bSW lf;

  public dlM(djj paramdjj, bSW parambSW)
  {
    this.le = paramdjj;
    this.lf = parambSW;
    aTS();
  }

  public boolean a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString)
  {
    aHA.debug("addBrodcast(name={},inputMrl={},outputMrl={},enable={},loop={},options={})", new Object[] { paramString1, paramString2, paramString3, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Arrays.toString(paramArrayOfString) });
    return this.le.a(this.lf, paramString1, paramString2, paramString3, paramArrayOfString != null ? paramArrayOfString.length : 0, paramArrayOfString, paramBoolean1 ? 1 : 0, paramBoolean2 ? 1 : 0) == 0;
  }

  public boolean a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String[] paramArrayOfString)
  {
    aHA.debug("addVideoOnDemand(name={},inputMrl={},enable={},mux={},options={})", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean), paramString3, Arrays.toString(paramArrayOfString) });
    return this.le.a(this.lf, paramString1, paramString2, paramArrayOfString != null ? paramArrayOfString.length : 0, paramArrayOfString, paramBoolean ? 1 : 0, paramString3) == 0;
  }

  public boolean eD(String paramString)
  {
    aHA.debug("removeMedia(name={})", new Object[] { paramString });
    return this.le.h(this.lf, paramString) == 0;
  }

  public boolean q(String paramString, boolean paramBoolean)
  {
    aHA.debug("enableMedia(name={},enable={})", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    return this.le.c(this.lf, paramString, paramBoolean ? 1 : 0) == 0;
  }

  public boolean D(String paramString1, String paramString2)
  {
    aHA.debug("setOutput(name={},outputMrl={})", new Object[] { paramString1, paramString2 });
    return this.le.b(this.lf, paramString1, paramString2) == 0;
  }

  public boolean E(String paramString1, String paramString2)
  {
    aHA.debug("setInput(name={},inputMrl={})", new Object[] { paramString1, paramString2 });
    return this.le.c(this.lf, paramString1, paramString2) == 0;
  }

  public boolean F(String paramString1, String paramString2)
  {
    aHA.debug("addInput(name={},inputMrl={})", new Object[] { paramString1, paramString2 });
    return this.le.d(this.lf, paramString1, paramString2) == 0;
  }

  public boolean r(String paramString, boolean paramBoolean)
  {
    aHA.debug("setLoop(name={},loop={})", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    return this.le.d(this.lf, paramString, paramBoolean ? 1 : 0) == 0;
  }

  public boolean G(String paramString1, String paramString2)
  {
    aHA.debug("setMux(name={},mux={})", new Object[] { paramString1, paramString2 });
    return this.le.e(this.lf, paramString1, paramString2) == 0;
  }

  public boolean b(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString)
  {
    aHA.debug("changeMedia(name={},inputMrl={},outputMrl={},enable={},loop={},options={})", new Object[] { paramString1, paramString2, paramString3, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Arrays.toString(paramArrayOfString) });
    return this.le.b(this.lf, paramString1, paramString2, paramString3, paramArrayOfString != null ? paramArrayOfString.length : 0, paramArrayOfString, paramBoolean1 ? 1 : 0, paramBoolean2 ? 1 : 0) == 0;
  }

  public boolean eE(String paramString)
  {
    aHA.debug("play(name={})", new Object[] { paramString });
    return this.le.i(this.lf, paramString) == 0;
  }

  public boolean eF(String paramString)
  {
    aHA.debug("stop(name={})", new Object[] { paramString });
    return this.le.j(this.lf, paramString) == 0;
  }

  public boolean eG(String paramString)
  {
    aHA.debug("pause(name={})", new Object[] { paramString });
    return this.le.k(this.lf, paramString) == 0;
  }

  public boolean b(String paramString, float paramFloat)
  {
    aHA.debug("seek(name={},percentage={})", new Object[] { paramString, Float.valueOf(paramFloat) });
    return this.le.a(this.lf, paramString, paramFloat) == 0;
  }

  public String eH(String paramString)
  {
    aHA.debug("show(name={})", new Object[] { paramString });
    return this.le.l(this.lf, paramString);
  }

  public float j(String paramString, int paramInt)
  {
    aHA.debug("getPosition(name={},instanceId={})", new Object[] { paramString, Integer.valueOf(paramInt) });
    return this.le.e(this.lf, paramString, paramInt);
  }

  public int k(String paramString, int paramInt)
  {
    aHA.debug("getTime(name={},instanceId={})", new Object[] { paramString, Integer.valueOf(paramInt) });
    return this.le.f(this.lf, paramString, paramInt);
  }

  public int l(String paramString, int paramInt)
  {
    aHA.debug("getLength(name={},instanceId={})", new Object[] { paramString, Integer.valueOf(paramInt) });
    return this.le.g(this.lf, paramString, paramInt);
  }

  public int m(String paramString, int paramInt)
  {
    aHA.debug("getRate(name={},instanceId={})", new Object[] { paramString, Integer.valueOf(paramInt) });
    return this.le.h(this.lf, paramString, paramInt);
  }

  public void release()
  {
    aHA.debug("release()", new Object[0]);
    aSA();
  }

  private void aTS() {
    aHA.debug("createInstance()", new Object[0]);
  }

  private void aSA() {
    aHA.debug("destroyInstance()", new Object[0]);
    this.le.k(this.lf);
  }
}