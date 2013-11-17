import org.apache.log4j.Logger;

public final class ckj extends bLe
{
  private byte bml;
  private byte[] bmk;
  private byte[] bmj;
  private long aXW;

  public ckj(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void kN()
  {
    arl localarl = (arl)mD();

    Su localSu = CA.Lv().bj(this.aXW);
    if (localSu == null) {
      K.error("Impossible d'ajouter le joueur " + this.aXW + " au combat " + localarl.getId() + " : ce fighter n'existe pas");
      return;
    }

    if (localSu == byv.bFN().bFO()) {
      return;
    }

    a(localSu, this.bmj, this.bmk);
    localarl.c(localSu, this.bml);

    localSu.aeL().dI(localSu.Fx());
    axB.aIZ(); axB.ae(localSu);
    dmM.cUe().b(localSu, localarl.getId());
    bOJ.aF(localSu);
  }

  private void a(Su paramSu, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2) {
    if (paramSu == null) {
      return;
    }
    paramSu.a((arl)mD(), paramArrayOfByte1, paramArrayOfByte2);
  }

  protected void kO()
  {
  }

  public void as(byte paramByte) {
    this.bml = paramByte;
  }

  public void ar(byte[] paramArrayOfByte) {
    this.bmk = paramArrayOfByte;
  }

  public void as(byte[] paramArrayOfByte) {
    this.bmj = paramArrayOfByte;
  }

  public void X(long paramLong) {
    this.aXW = paramLong;
  }
}