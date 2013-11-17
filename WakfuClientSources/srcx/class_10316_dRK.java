public class dRK
{
  final String m_name;

  public dRK(String paramString, float[] paramArrayOfFloat, uz paramuz, dn paramdn)
  {
    this.m_name = paramString;
    ciL localciL;
    if (paramuz == null)
      localciL = dbL.cNv().b(paramString, paramdn);
    else {
      localciL = dbL.cNv().a(paramString, paramuz, paramdn);
    }
    localciL.g(paramArrayOfFloat);
  }

  public dRK(String paramString, float[] paramArrayOfFloat) {
    this(paramString, paramArrayOfFloat, null, dn.Tq);
  }

  public final void Q(int paramInt1, int paramInt2, short paramShort) {
    dsy().Q(paramInt1, paramInt2, paramShort);
  }

  private ciL dsy() {
    return dbL.cNv().oN(this.m_name);
  }

  public final void clear() {
    dsy().clear();
  }

  public final boolean B(cYk paramcYk) {
    return P(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public final boolean P(int paramInt1, int paramInt2, short paramShort) {
    return dsy().P(paramInt1, paramInt2, paramShort);
  }

  public final void a(String paramString, dn paramdn) {
    uz localuz = rS(paramString);
    dsy().a(localuz, paramdn);
  }

  public final void g(float[] paramArrayOfFloat)
  {
    dsy().g(paramArrayOfFloat);
  }

  public final void R(int paramInt1, int paramInt2, short paramShort) {
    dsy().R(paramInt1, paramInt2, paramShort);
  }

  public static uz rS(String paramString) {
    String str = dtb.pY(paramString);
    return tq.Bg().b(dHL.lSB.dhZ(), byn.jp(str), paramString, false);
  }

  public final void DP(int paramInt) {
    dsy().edm = paramInt;
  }
}