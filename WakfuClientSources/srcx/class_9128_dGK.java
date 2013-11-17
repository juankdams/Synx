public class dGK
{
  private static final aLA[] gSX = new aLA[0];
  private static final float[] lRw = new float[0];
  public final float[] dMd;
  public final float[] lRx;
  public final float[] lRy;
  public final aLA[] gSZ;

  public dGK(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, aLA[] paramArrayOfaLA)
  {
    this.dMd = paramArrayOfFloat1;
    this.lRx = paramArrayOfFloat2;
    this.lRy = paramArrayOfFloat3;
    this.gSZ = paramArrayOfaLA;
  }

  public static float[] H(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    if (i == 0)
      return lRw;
    return paramaYQ.ow(i);
  }

  public static aLA[] I(aYQ paramaYQ)
  {
    int i = paramaYQ.readInt();
    if (i == 0)
      return gSX;
    bZg localbZg = dxo.lDw.dcp();
    aLA[] arrayOfaLA = new aLA[i];
    for (int j = 0; j < i; j++) {
      byte b1 = (byte)(paramaYQ.readByte() & 0xFF);
      byte b2 = (byte)(paramaYQ.readByte() & 0xFF);

      arrayOfaLA[j] = localbZg.a(cuh.dX(b1));
      try {
        arrayOfaLA[j].a(b2, paramaYQ);
      }
      catch (Exception localException)
      {
      }
    }
    return arrayOfaLA;
  }

  public static dGK J(aYQ paramaYQ) {
    return new dGK(H(paramaYQ), H(paramaYQ), H(paramaYQ), I(paramaYQ));
  }
}