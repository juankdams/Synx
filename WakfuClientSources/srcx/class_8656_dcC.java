public class dcC
{
  public static final dcC kVG = new aSY();

  private final cIw kVH = new aSX(this);

  private final adz kVI = new adz();
  private final adz kVJ = new adz();
  private final adz kVK = new adz();
  private boolean Vm = true;

  public void nT(int paramInt) {
    this.Vm |= this.kVJ.hL(paramInt);
  }

  public void nU(int paramInt) {
    this.Vm |= this.kVK.hL(paramInt);
  }

  public void zI(int paramInt) {
    this.Vm |= this.kVK.remove(paramInt);
  }

  public void update() {
    if (!this.Vm)
      return;
    this.kVI.clear();

    this.kVJ.g(this.kVH);
    this.kVK.g(this.kVH);
    this.Vm = false;
  }

  public void clear() {
    this.kVI.clear();
    this.kVK.clear();
    this.kVJ.clear();
  }

  boolean contains(int paramInt)
  {
    if ((!bB) && (this.Vm)) throw new AssertionError();
    return (!this.kVI.isEmpty()) && (this.kVI.contains(paramInt));
  }

  void cOc() {
    this.kVJ.clear();
    this.Vm = true;
  }

  public dcC bit() {
    dcC localdcC = new dcC();
    localdcC.kVI.n(this.kVI.toArray());
    localdcC.kVJ.n(this.kVJ.toArray());
    localdcC.kVK.n(this.kVK.toArray());
    localdcC.Vm = this.Vm;
    return localdcC;
  }
}