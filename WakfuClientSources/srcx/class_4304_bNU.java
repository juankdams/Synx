import org.apache.log4j.Logger;

public class bNU
{
  private static final Logger K = Logger.getLogger(bNU.class);
  private static final aLA[] gSX = new aLA[0];
  dMA[] gSY;
  aLA[] gSZ;

  static bNU a(bNU parambNU)
  {
    bNU localbNU = new bNU();
    localbNU.gSY = parambNU.gSY;
    localbNU.gSZ = gSX;
    return localbNU;
  }

  public final int c(aYQ paramaYQ, int paramInt)
  {
    int i = paramaYQ.readShort() & 0xFFFF;
    this.gSY = new dMA[i];
    for (int j = 0; j < this.gSY.length; j++) {
      this.gSY[j] = aYK.m(paramaYQ);
    }

    return d(paramaYQ, paramInt);
  }

  protected final int d(aYQ paramaYQ, int paramInt) {
    int i = paramaYQ.readByte() & 0xFF;
    if (i == 0) {
      this.gSZ = gSX;
    } else {
      this.gSZ = new aLA[i];
      for (int j = 0; j < this.gSZ.length; j++) {
        byte b1 = (byte)(paramaYQ.readByte() & 0xFF);
        byte b2 = (byte)(paramaYQ.readByte() & 0xFF);

        cuh localcuh = cuh.dX(b1);
        aLA localaLA = dxo.lDw.dcp().a(localcuh);
        try {
          localaLA.mY(paramInt);
          localaLA.a(b2, paramaYQ);
          this.gSZ[j] = localaLA;
        } catch (Exception localException) {
          K.error("Exception durant le chargement d'une action anm actionId=" + b1 + " parametersCount=" + b2, localException);
        }
      }
    }

    return paramaYQ.readShort() & 0xFFFF;
  }

  public final dMA[] bVo() {
    return this.gSY;
  }
}