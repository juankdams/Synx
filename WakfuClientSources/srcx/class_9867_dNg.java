public abstract class dNg
{
  public static final int mdM = 32;
  public static final byte mdN = -1;
  public static final byte mdO = 7;
  public int hY;
  public int hZ;
  public short aOl;

  public abstract boolean I(int paramInt1, int paramInt2);

  public boolean p(int paramInt1, int paramInt2)
  {
    return (paramInt1 >= this.hY) && (paramInt1 < this.hY + app()) && (paramInt2 >= this.hZ) && (paramInt2 < this.hZ + apq());
  }

  protected int app() {
    return 18;
  }

  protected int apq() {
    return 18;
  }

  public abstract int a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, int paramInt3);

  public abstract int a(int paramInt1, int paramInt2, cZc[] paramArrayOfcZc, int paramInt3);

  public void d(aYQ paramaYQ)
  {
    this.hY = (paramaYQ.readShort() * 18);
    this.hZ = (paramaYQ.readShort() * 18);
    this.aOl = paramaYQ.readShort();
  }

  protected final boolean a(int paramInt1, int paramInt2, bep[] paramArrayOfbep)
  {
    if ((!bB) && (paramArrayOfbep == null)) throw new AssertionError();
    if ((!bB) && (paramArrayOfbep.length < 1)) throw new AssertionError("cellPathData array must have a size at least equal to one");
    if ((!bB) && (paramArrayOfbep[0] == null)) throw new AssertionError("cellpathData array seems not to be initialized");
    if ((!bB) && (!p(paramInt1, paramInt2))) throw new AssertionError("The cell (" + paramInt1 + ", " + paramInt2 + ") doesn't belong to the map. Make sure that isInMap(x, y) is true before calling getPathData");
    return true;
  }

  protected final boolean a(int paramInt1, int paramInt2, cZc[] paramArrayOfcZc) {
    if ((!bB) && (paramArrayOfcZc == null)) throw new AssertionError();
    if ((!bB) && (paramArrayOfcZc.length < 1)) throw new AssertionError("cellVisibilityData array must have a size at least equal to one");
    if ((!bB) && (paramArrayOfcZc[0] == null)) throw new AssertionError("cellVisibilityData array seems not to be initialized");
    if ((!bB) && (!p(paramInt1, paramInt2))) throw new AssertionError("The cell (" + paramInt1 + ", " + paramInt2 + ") doesn't belong to the map. Make sure that isInMap(x, y) is true before calling getVisibilityData");
    return true;
  }

  public boolean isEmpty() {
    return false;
  }
}