import java.util.ArrayList;
import java.util.List;

public abstract class bwF
{
  private boolean ghd = false;
  private List aEZ = null;
  protected final bSl bpK;

  public bwF(bSl parambSl)
  {
    this.bpK = parambSl;
  }

  public void a(bKC parambKC)
  {
    if (this.aEZ == null) {
      this.aEZ = new ArrayList();
    }
    this.aEZ.add(parambKC);
  }

  public void b(bKC parambKC)
  {
    if (this.aEZ == null) {
      return;
    }
    this.aEZ.remove(parambKC);
  }

  public boolean isRemovable()
  {
    return this.ghd;
  }

  public void bEk()
  {
    this.ghd = true;

    if (this.aEZ != null)
      for (bKC localbKC : this.aEZ)
        localbKC.a(this);
  }

  public abstract float alz();

  public abstract void cz(int paramInt);
}