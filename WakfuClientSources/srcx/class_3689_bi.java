public class bi extends aLA
{
  private String kd;
  private int ke;

  public bi()
  {
    this.ke = 100;
  }

  public final boolean a(bjC parambjC)
  {
    if (bCO.sf(100) > this.ke) {
      return false;
    }
    parambjC.eq(this.kd);
    return true;
  }

  public final void a(byte paramByte, aYQ paramaYQ)
  {
    this.kd = paramaYQ.readString();

    if (paramByte == 2)
      this.ke = paramaYQ.readByte();
  }

  public void a(dSw paramdSw)
  {
    super.a(paramdSw);
    int i = this.ke == 0 ? 1 : 2;
    paramdSw.writeByte((byte)i);
    paramdSw.writeString(this.kd);
    if (i == 2)
      paramdSw.writeByte((byte)this.ke);
  }

  public final cuh en()
  {
    return cuh.ieo;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof bi)) {
      return false;
    }
    bi localbi = (bi)paramObject;

    if (this.ke != localbi.ke)
      return false;
    if (this.kd != null ? !this.kd.equals(localbi.kd) : localbi.kd != null) {
      return false;
    }
    return true;
  }

  public final int hashCode()
  {
    int i = en().bJ();
    i = 31 * i + this.ke;
    i = 31 * i + (this.kd != null ? this.kd.hashCode() : 0);
    return i;
  }
}