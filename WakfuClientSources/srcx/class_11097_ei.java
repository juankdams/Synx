import org.apache.log4j.Logger;

public class ei extends bLe
{
  private final byte[] ays;

  public ei(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.ays = paramArrayOfByte;
  }

  protected void kN()
  {
    arl localarl = (arl)mD();
    if (localarl == null) {
      K.error("Impossible de debuter un nouvezau tour de table, on ne connait pas le combat ");
      return;
    }

    if (Ij()) {
      localarl.aDp().AV();
    }

    bIR.bQl().rU();
  }

  protected void kO()
  {
  }
}