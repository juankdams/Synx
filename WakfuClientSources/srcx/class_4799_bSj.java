public class bSj
{
  public static final bSj hcO = new bSj();
  private aSw hcP;
  private aWi hcQ;

  public void a(aSw paramaSw, aWi paramaWi)
  {
    this.hcP = paramaSw;
    this.hcQ = paramaWi;
  }

  public bxu y() {
    if (this.hcP != null)
      return this.hcP.y();
    return null;
  }

  public void a(bxu parambxu) {
    if (this.hcQ != null)
      this.hcQ.a(parambxu);
  }

  public void b(bxu parambxu) {
    if (this.hcQ != null)
      this.hcQ.b(parambxu);
  }
}