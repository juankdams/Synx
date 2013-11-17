import java.util.Map;
import java.util.Map.Entry;

public class dcr extends cGF
{
  private long kUW;
  private String kUX;
  private String kUY;
  private boolean kUZ;
  private boolean kVa;
  private long kVb;
  private long kVc;
  private byte[][] kVd = new byte[3][];
  private long[] kVe = new long[3];
  private long kVf;
  private long kVg;
  private bGE kVh;
  private int[] gFx = new int[bBc.bJN()];

  protected final cCH kVi = new cDy(this);

  protected final cCH kVj = new cDx(this);

  public dcr()
  {
    this.kVh = new bGE();

    this.kVg = System.currentTimeMillis();
  }

  public boolean cNR()
  {
    return this.kUZ;
  }

  public void iX(boolean paramBoolean) {
    this.kUZ = paramBoolean;
  }

  public long cNS() {
    return this.kVb;
  }

  public void jx(long paramLong) {
    this.kVb = paramLong;
  }

  public long cNT() {
    return this.kVc;
  }

  public void jy(long paramLong) {
    this.kVc = paramLong;
  }

  public final void a(int paramInt, byte[] paramArrayOfByte, long paramLong)
  {
    if ((paramInt < 0) || (paramInt >= 3)) {
      throw new IllegalArgumentException("On ne conserve que 3 dernières IP utilisées");
    }
    this.kVd[paramInt] = paramArrayOfByte;
    this.kVe[paramInt] = paramLong;
  }

  public byte[] zG(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= 3)) {
      throw new IllegalArgumentException("On ne conserve que 3 dernières IP utilisées");
    }
    return this.kVd[paramInt];
  }

  public long zH(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= 3)) {
      throw new IllegalArgumentException("On ne conserve que 3 dernières IP utilisées");
    }
    return this.kVe[paramInt];
  }

  public void b(byte[] paramArrayOfByte, long paramLong)
  {
    if ((paramArrayOfByte[0] == this.kVd[0][0]) && (paramArrayOfByte[1] == this.kVd[0][1]) && (paramArrayOfByte[2] == this.kVd[0][2]) && (paramArrayOfByte[3] == this.kVd[0][3]))
    {
      this.kVe[0] = paramLong;
    } else {
      this.kVd[2] = this.kVd[1];
      this.kVd[1] = this.kVd[0];
      this.kVd[0] = paramArrayOfByte;
      this.kVe[2] = this.kVe[1];
      this.kVe[1] = this.kVe[0];
      this.kVe[0] = paramLong;
    }
  }

  public long cNU() {
    return this.kVf + System.currentTimeMillis() - this.kVg;
  }

  public void jz(long paramLong) {
    this.kVf = paramLong;
  }

  public String cNV() {
    return this.kUX;
  }

  public void oR(String paramString) {
    this.kUX = paramString;
  }

  public String cNW() {
    return this.kUY;
  }

  public void oS(String paramString) {
    this.kUY = paramString;
  }

  public long Ea() {
    return this.kUW;
  }

  public void jA(long paramLong) {
    this.kUW = paramLong;
  }

  public boolean cNX() {
    return this.kVa;
  }

  public void iY(boolean paramBoolean) {
    this.kVa = paramBoolean;
  }

  public int[] bOR() {
    return this.gFx;
  }

  public void C(int[] paramArrayOfInt) {
    this.gFx = paramArrayOfInt;
  }

  public void q(Map paramMap) {
    for (Map.Entry localEntry : paramMap.entrySet()) {
      Rs localRs = Rs.dv((String)localEntry.getKey());
      if (localRs != null)
      {
        this.kVh.a(new iL(localRs, ((Long)localEntry.getValue()).longValue()));
      }
    }
  }

  public bGE cNY() { return this.kVh; }


  public cCH[] tn()
  {
    return new cCH[] { this.kVi, this.kVj };
  }

  public byte[] cNZ() {
    return a(new cCH[] { this.kVi });
  }

  public byte[] cOa() {
    return a(new cCH[] { this.kVj });
  }
}