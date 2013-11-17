public class aJW
{
  public short aDx;
  String m_name;
  int bjv;

  public final void d(aYQ paramaYQ)
  {
    this.aDx = paramaYQ.readShort();
    this.m_name = paramaYQ.readString();

    paramaYQ.readInt();
    this.bjv = byn.jq(this.m_name);
  }
}