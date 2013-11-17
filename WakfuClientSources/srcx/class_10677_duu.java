import java.util.ArrayList;

public class duu extends aNb
{
  protected int aw;

  public duu(TU paramTU, bir parambir)
  {
    this.aw = paramTU.getId();
    int j;
    for (int i = 0; i < paramTU.ahq(); j = (byte)(i + 1)) {
      cLD localcLD = paramTU.gN(i);
      cMu localcMu = parambir.pT(localcLD.getId());
      if (localcMu != null)
        this.esK.add(new afa(localcLD, i, localcMu));
      else {
        this.esK.add(new afa(localcLD, i));
      }
    }
    this.esL = ((Lh)this.esK.get(0));
  }

  protected String getName()
  {
    return bU.fH().b(104, this.aw, new Object[0]);
  }

  protected Or getPrefSize()
  {
    return new Or(200, 120);
  }

  protected int getIdealSizeMaxColumns()
  {
    return 5;
  }

  protected int getIdealSizeMaxRows()
  {
    return 3;
  }

  protected boolean up()
  {
    return false;
  }

  protected boolean uq()
  {
    return false;
  }

  protected boolean ur()
  {
    return false;
  }

  protected dBv us()
  {
    return null;
  }

  public int getSize()
  {
    return this.esK.size();
  }

  public void bJ(int paramInt)
  {
  }

  public void bK(int paramInt)
  {
  }
}