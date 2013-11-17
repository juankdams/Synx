public class duq
{
  static final TY lyj = new TY();

  public float a(cSR paramcSR, dFu paramdFu) {
    if (paramcSR == null) {
      return 0.0F;
    }
    lyj.reset();
    if (!paramcSR.isEmpty()) {
      paramcSR.a(new cVg(this, paramdFu));
    }

    return lyj.getValue() / paramcSR.size();
  }
}