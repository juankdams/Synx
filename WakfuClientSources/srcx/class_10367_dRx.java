public class dRx
{
  private static final dRx mne = new dRx();

  private final cSR mnf = new cSR();
  private final cSR mng = new cSR();

  private dRx() {
    this.mnf.put(111111, new Js(111111, -1, 111111, false));
    this.mnf.put(111112, new Js(111112, -1, 111112, false));
  }

  public static dRx dsw() {
    return mne;
  }

  public Js DN(int paramInt) {
    return (Js)this.mnf.get(paramInt);
  }

  public void a(int paramInt, Js paramJs) {
    if (!this.mng.contains(paramInt)) {
      this.mng.put(paramInt, new adz());
    }
    this.mnf.put(paramJs.getId(), paramJs);
    ((adz)this.mng.get(paramInt)).hL(paramJs.getType());
  }

  public boolean ft(int paramInt1, int paramInt2) {
    if (!this.mng.contains(paramInt1))
      return false;
    return ((adz)this.mng.get(paramInt1)).contains(paramInt2);
  }
}