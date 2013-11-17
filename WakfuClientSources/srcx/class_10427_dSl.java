import java.util.ArrayList;

class dSl
{
  int aw;
  int aHm;
  final ArrayList moo = new ArrayList();

  dSl(int paramInt) {
    this.aw = paramInt;
    this.aHm = 0;
  }

  boolean k(Runnable paramRunnable) {
    return !this.moo.contains(paramRunnable);
  }

  ArrayList dsR() {
    return this.moo;
  }

  void l(Runnable paramRunnable) {
    if (!this.moo.contains(paramRunnable))
      this.moo.add(paramRunnable);
  }
}