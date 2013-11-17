import org.apache.log4j.Logger;

public class apQ
  implements dkU
{
  protected static Logger K = Logger.getLogger(apQ.class);

  private static final apQ dwv = new apQ();
  private final bmE dww = new Gk(0.0F, 0.5F, 0.5F, 1.0F);
  private final bmE dwx = new AM(0.0F, 0.5F, 0.5F, 1.0F);

  public static apQ aBL()
  {
    return dwv;
  }

  public final int a(bUv parambUv)
  {
    return aqh.dxF.aCn() / 2;
  }

  public bmE aBM() {
    return this.dww;
  }

  public bmE aBN() {
    return this.dwx;
  }

  public void d(bUv parambUv) {
    String str = parambUv.ata();

    parambUv.eq("AnimRail-Fin");
  }

  public void a(bUv parambUv, CG paramCG) {
    parambUv.c(paramCG);
  }

  public int aBO() {
    return 560;
  }

  public void a(bUv parambUv, int paramInt, cOo paramcOo) {
  }

  public void a(bUv parambUv, int paramInt) {
    String str = parambUv.ata();

    if (!str.startsWith("AnimRail"))
      parambUv.eq("AnimRail-Debut");
  }

  public void b(bUv parambUv, CG paramCG) {
    parambUv.c(paramCG);
  }

  public boolean e(bUv parambUv) {
    return false;
  }

  public boolean c(bUv parambUv, int paramInt) {
    return false;
  }

  public String aY() {
    return ZV.cME;
  }
}