import java.util.ArrayList;

public abstract class dAU
{
  private ArrayList lIy;
  private ArrayList lIz;

  public final boolean den()
  {
    return this.lIz != null;
  }

  public final int deo() {
    return this.lIz.size();
  }

  public final FA Cm(int paramInt) {
    return (FA)this.lIz.get(paramInt);
  }

  public final boolean dep() {
    return this.lIy != null;
  }

  public final int deq() {
    return this.lIy.size();
  }

  public final FA Cn(int paramInt) {
    return (FA)this.lIy.get(paramInt);
  }

  public final void a(FA paramFA) {
    if (this.lIy == null) {
      this.lIy = new ArrayList(1);
    }
    this.lIy.add(paramFA);
  }

  public final void b(FA paramFA) {
    if (this.lIy == null) {
      return;
    }
    this.lIy.remove(paramFA);
  }

  public final void c(FA paramFA) {
    if (this.lIz == null) {
      this.lIz = new ArrayList();
    }
    this.lIz.add(paramFA);
  }

  public final void d(FA paramFA) {
    if (this.lIz == null) {
      return;
    }
    this.lIz.remove(paramFA);
  }

  protected final void der() {
    if (this.lIy != null) {
      this.lIy.clear();
      this.lIy = null;
    }
    if (this.lIz != null) {
      this.lIz.clear();
      this.lIz = null;
    }
  }
}