public class mm extends aLA
{
  private byte aQm;

  public final boolean a(bjC parambjC)
  {
    parambjC.R(this.aQm);
    return false;
  }

  public final void a(byte paramByte, aYQ paramaYQ)
  {
    this.aQm = paramaYQ.readByte();
  }

  public void a(dSw paramdSw)
  {
    super.a(paramdSw);
    paramdSw.writeByte((byte)1);
    paramdSw.writeByte(this.aQm);
  }

  public final cuh en()
  {
    return cuh.iex;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof mm)) {
      return false;
    }
    mm localmm = (mm)paramObject;

    if (this.aQm != localmm.aQm) {
      return false;
    }
    return true;
  }

  public final int hashCode()
  {
    int i = en().bJ();
    i = 31 * i + this.aQm;
    return i;
  }
}