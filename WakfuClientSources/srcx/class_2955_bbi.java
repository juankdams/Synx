import java.nio.ByteBuffer;
import java.util.HashMap;

public class bbi
{
  private int fjl;
  private clK[] fjm;
  private int[] fjn;
  private int[] fjo;
  private int[] fjp;
  private float[] fjq;
  private float[] fjr;
  private float[] fjs;
  private float[] fjt;
  private HashMap fju;

  public int bpw()
  {
    return this.fjl;
  }

  public clK oH(int paramInt) {
    return this.fjm[paramInt];
  }

  public int oI(int paramInt) {
    return this.fjn[paramInt];
  }

  public int oJ(int paramInt) {
    return this.fjo[paramInt];
  }

  public int oK(int paramInt) {
    return this.fjp[paramInt];
  }

  public float oL(int paramInt) {
    return this.fjq[paramInt];
  }

  public float oM(int paramInt) {
    return this.fjr[paramInt];
  }

  public float oN(int paramInt) {
    return this.fjs[paramInt];
  }

  public float oO(int paramInt) {
    return this.fjt[paramInt];
  }

  public float[] b(clK paramclK) {
    return (float[])this.fju.get(paramclK);
  }

  public void aq(ByteBuffer paramByteBuffer)
  {
    this.fjl = (paramByteBuffer.get() & 0xFF);
    if (this.fjl > 0) {
      this.fjm = new clK[this.fjl];
      this.fjn = new int[this.fjl];
      this.fjo = new int[this.fjl];
      this.fjq = new float[this.fjl];
      this.fjs = new float[this.fjl];

      this.fjp = new int[this.fjl];
      this.fjr = new float[this.fjl];
      this.fjt = new float[this.fjl];

      for (int i = 0; i < this.fjl; i++) {
        this.fjm[i] = clK.values()[(paramByteBuffer.get() & 0xFF)];
        this.fjn[i] = paramByteBuffer.get();
        this.fjo[i] = paramByteBuffer.get();
        this.fjq[i] = ((paramByteBuffer.getShort() & 0xFFFF) / 65535.0F);
        this.fjs[i] = ((paramByteBuffer.getShort() & 0xFFFF) / 65535.0F);

        this.fjp[i] = paramByteBuffer.get();
        this.fjr[i] = (paramByteBuffer.getShort() / 32767.0F);
        this.fjt[i] = (paramByteBuffer.getShort() / 32767.0F);
      }

      this.fju = new HashMap();
      i = paramByteBuffer.get() & 0xFF;
      for (int j = 0; j < i; j++) {
        clK localclK = clK.values()[(paramByteBuffer.get() & 0xFF)];
        float f1 = paramByteBuffer.get();
        float f2 = paramByteBuffer.get();
        this.fju.put(localclK, new float[] { f1, f2 });
      }

      j = 2 - i;
      for (int k = 0; k < j; k++) {
        paramByteBuffer.getShort();
        paramByteBuffer.get();
      }
    }
  }

  public void reset()
  {
    this.fjl = 0;
    this.fjm = null;
    this.fjn = null;
    this.fjo = null;
    this.fjp = null;
    this.fjq = null;
    this.fjr = null;
    this.fjs = null;
    this.fjt = null;
    this.fju = null;
  }
}