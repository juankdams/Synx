public class dlq extends asM
{
  private final boolean liR;
  private final boolean liS;

  public dlq(int paramInt)
  {
    super(paramInt);

    this.liS = dyJ.lFm.BZ(paramInt);
    this.liR = (DA.bIr.eD(this.buP).cPj() != 0);
  }

  public short nU() {
    return 0;
  }

  public boolean isUnknown() {
    return true;
  }

  public boolean aES() {
    return this.liR;
  }

  public boolean aET() {
    return this.liS;
  }
}