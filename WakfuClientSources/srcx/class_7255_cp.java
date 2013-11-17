public class cp
{
  private final cSR RB;

  public cp()
  {
    this.RB = new cSR();
  }

  public boolean a(bXf parambXf)
  {
    this.RB.remove(parambXf.getId());
    return this.RB.isEmpty();
  }

  public boolean a(dPJ paramdPJ)
  {
    bqj[] arrayOfbqj1 = new bqj[this.RB.size()];
    for (bqj localbqj : (bqj[])this.RB.d(arrayOfbqj1)) {
      localbqj.a(paramdPJ);
      if (localbqj.bzs()) {
        this.RB.remove(localbqj.uN());
      }
    }
    return this.RB.isEmpty();
  }

  public void a(bXf parambXf, String paramString, bFB[] paramArrayOfbFB, boolean paramBoolean) {
    this.RB.put(parambXf.getId(), new bqj(this, parambXf, paramString, paramArrayOfbFB, paramBoolean));
  }
}