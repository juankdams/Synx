import java.util.ArrayList;

class aIL
{
  private final ArrayList ehA = new ArrayList();
  private final bGg ehB;
  private boolean ehC = false;

  private aIL(azF paramazF, bGg parambGg) {
    this.ehB = parambGg;
  }

  public final void aUL() {
    this.ehB.K(this.ehA);
  }

  public final boolean isActive() {
    return this.ehA.size() > 0;
  }

  public final void clear() {
    this.ehA.clear();
  }

  public final void updateState() {
    if (isActive() == this.ehC) {
      return;
    }
    if (this.ehC)
      this.ehB.stop();
    else {
      this.ehB.start();
    }
    this.ehC = (!this.ehC);
  }

  public final void a(cwG paramcwG) {
    this.ehA.add(paramcwG);
  }
}