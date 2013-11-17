import java.util.ArrayList;

class dMP
  implements aZf
{
  private final aUd mdv;

  dMP(aUd paramaUd)
  {
    this.mdv = paramaUd;
  }

  public boolean g(byte paramByte, int paramInt) {
    cfL localcfL = new cfL();
    localcfL.hAH = paramByte;
    localcfL.hAI = paramInt;
    this.mdv.eUI.add(localcfL);
    return true;
  }

  public String toString()
  {
    return "SetOpinion{m_raw=" + this.mdv + '}';
  }
}