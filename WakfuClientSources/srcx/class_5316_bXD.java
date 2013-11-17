public class bXD
{
  public final int hY;
  public final int hZ;
  public final short aOl;
  public final CG ax;

  public bXD(int paramInt1, int paramInt2, short paramShort, CG paramCG)
  {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.aOl = paramShort;
    this.ax = paramCG;
  }

  bXD(aYQ paramaYQ) {
    this.hY = paramaYQ.readInt();
    this.hZ = paramaYQ.readInt();
    this.aOl = paramaYQ.readShort();
    this.ax = CG.eu(paramaYQ.readByte());
  }

  void b(dSw paramdSw) {
    paramdSw.writeInt(this.hY);
    paramdSw.writeInt(this.hZ);
    paramdSw.writeShort(this.aOl);
    paramdSw.writeByte((byte)this.ax.m_index);
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof bXD)) {
      return false;
    }
    bXD localbXD = (bXD)paramObject;

    if (this.hY != localbXD.hY)
      return false;
    if (this.hZ != localbXD.hZ)
      return false;
    if (this.aOl != localbXD.aOl)
      return false;
    if (this.ax != localbXD.ax) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    int i = this.hY;
    i = 31 * i + this.hZ;
    i = 31 * i + this.aOl;
    i = 31 * i + (this.ax != null ? this.ax.hashCode() : 0);
    return i;
  }
}