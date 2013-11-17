public abstract class bSb
{
  protected byte hcj;
  private final int hck;
  private final int hcl;

  protected bSb(int paramInt1, int paramInt2)
  {
    this.hcl = paramInt1;
    this.hck = paramInt2;
    this.hcj = ((byte)(this.hcl ^ paramInt2));
  }

  protected final void ahr()
  {
    this.hcj = ((byte)(int)(this.hcj + (this.hcl * position() + this.hck)));
  }

  protected abstract long position();
}