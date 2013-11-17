import com.ankamagames.framework.graphics.engine.Anm2.Anm;

public abstract class Lp
  implements Runnable
{
  private final Anm bXW;

  protected Lp(Anm paramAnm)
  {
    this.bXW = paramAnm;
    Anm.a(paramAnm, this);
  }

  public final void remove() {
    Anm.b(this.bXW, this);
  }
}