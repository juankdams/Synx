import java.util.Arrays;

public class cNi
{
  public static final float[] ksr = { 0.1F, 0.1F, 0.1F };
  private static final int kss = 1;
  private static final int kst = 2;
  private int cKl;
  private final bjI ksu = new bjI(1, 1.0F);
  private float[] ksv = ksr;

  cNi(aYQ paramaYQ) {
    this.cKl = paramaYQ.readInt();
    if (cFH()) {
      int i = paramaYQ.readShort() & 0xFFFF;
      this.ksu.ensureCapacity(i);
      for (int j = 0; j < i; j++) {
        this.ksu.o(paramaYQ.readInt(), (byte)(paramaYQ.readByte() - -1));
      }
    }
    if (cFI())
      this.ksv = paramaYQ.ow(3);
  }

  cNi()
  {
  }

  void b(dSw paramdSw) {
    paramdSw.writeInt(this.cKl);
    if (cFH()) {
      paramdSw.writeShort((short)this.ksu.size());
      bjJ localbjJ = this.ksu.buW();
      while (localbjJ.hasNext()) {
        localbjJ.fl();
        paramdSw.writeInt(localbjJ.zY());
        paramdSw.writeByte(localbjJ.Gh());
      }
    }
    if (cFI()) {
      paramdSw.writeFloat(this.ksv[0]);
      paramdSw.writeFloat(this.ksv[1]);
      paramdSw.writeFloat(this.ksv[2]);
    }
  }

  private boolean cFH() {
    return (this.cKl & 0x1) != 0;
  }

  private boolean cFI() {
    return (this.cKl & 0x2) == 2;
  }

  int nN(String paramString) {
    return this.ksu.get(paramString.hashCode()) + -1;
  }

  public void a(bEw parambEw) {
    this.cKl |= 1;
    parambEw.a(new bSp(this));
  }

  public float[] gK()
  {
    return this.ksv;
  }

  public void h(float[] paramArrayOfFloat) {
    if ((!bB) && (this.ksv != ksr)) throw new AssertionError();

    if (!Arrays.equals(paramArrayOfFloat, ksr)) {
      this.cKl |= 2;
      this.ksv = paramArrayOfFloat;
    }
  }
}