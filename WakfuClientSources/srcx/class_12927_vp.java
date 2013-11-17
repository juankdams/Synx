public final class vp
{
  public static final short LOCAL = -1;
  public short bju;
  public String m_name;
  public int bjv;

  public final void d(aYQ paramaYQ)
  {
    this.m_name = paramaYQ.readString();

    paramaYQ.readInt();
    this.bjv = byn.jq(this.m_name);
    this.bju = paramaYQ.readShort();
  }

  public final void b(dSw paramdSw) {
    paramdSw.writeString(this.m_name);
    paramdSw.writeInt(this.bjv);
    paramdSw.writeShort(this.bju);
  }
}