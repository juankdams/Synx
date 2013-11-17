import org.apache.log4j.Logger;

final class cnF extends dcW
{
  private static Logger K = Logger.getLogger(cnF.class);

  public boolean a(wp paramwp)
  {
    ckj localckj = new ckj(dqt.cXz(), dPD.mio.bJ(), 0, ((arl)this.kLP).getId());
    localckj.as(paramwp.Fx());
    localckj.ar(paramwp.Fw());
    localckj.as(paramwp.Fv());
    localckj.X(paramwp.AD());
    bnc.bxw().a((arl)this.kLP, localckj);
    bnc.bxw().d(this.kLP);

    return false;
  }

  private void a(Su paramSu, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2) {
    if (paramSu == null) {
      return;
    }
    paramSu.a((arl)this.kLP, paramArrayOfByte1, paramArrayOfByte2);
  }
}