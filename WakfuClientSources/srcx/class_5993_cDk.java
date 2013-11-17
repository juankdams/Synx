public class cDk extends fm
{
  public cDk()
  {
    super(cMS.ksf, true, "messageContainer", (short)10000);
  }

  protected void a(boolean paramBoolean, String paramString) {
    cpa localcpa = cBQ.cxL().coO().nf(paramString);
    if (localcpa == null) {
      return;
    }

    a((dOc)localcpa.fi("text"), paramBoolean);
  }

  protected void O(String paramString)
  {
  }
}