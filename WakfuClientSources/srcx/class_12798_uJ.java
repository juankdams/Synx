import java.util.ArrayList;

public class uJ extends bbg
{
  private ArrayList biK;

  public uJ(int paramInt)
  {
    this.biK = new ArrayList(paramInt);
  }

  public uJ(uJ paramuJ)
  {
    this.biK = new ArrayList(paramuJ.biK.size());
    this.biK.addAll(paramuJ.biK);
  }

  public final int DK()
  {
    return this.biK.size();
  }

  public final bNa db(int paramInt) {
    return (bNa)this.biK.get(paramInt);
  }

  public final void b(int paramInt, bNa parambNa) {
    try {
      this.biK.set(paramInt, parambNa);
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {
      this.biK.add(paramInt, parambNa);
    }
  }

  public final void d(bNa parambNa) {
    this.biK.add(parambNa);
  }

  protected void DL()
  {
    this.biK.clear();
    this.biK = null;
  }
}