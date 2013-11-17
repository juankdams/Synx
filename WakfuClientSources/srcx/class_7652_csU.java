public class csU extends fm
{
  public static final String icG = "container1";
  public static final String icH = "container2";
  public static final String icI = "image1";
  public static final String icJ = "image2";

  public csU()
  {
    super(cMS.ksg, false, "messageContainerFight", (short)10000);
  }

  protected void a(boolean paramBoolean, String paramString)
  {
    cpa localcpa = cBQ.cxL().coO().nf(paramString);
    if (localcpa == null) {
      return;
    }

    int i = this.aCk;

    this.aCk = (paramBoolean ? 150 : this.aCk);

    a((dOc)localcpa.fi("container1"), paramBoolean);
    a((dOc)localcpa.fi("image1"), paramBoolean);
    a((dOc)localcpa.fi("image2"), paramBoolean);
    a((dOc)localcpa.fi("image3"), paramBoolean);
    a((dOc)localcpa.fi("text"), paramBoolean);

    if (paramBoolean) {
      this.aCk = 10;
    }
    a((dOc)localcpa.fi("animatedElementLeft"), paramBoolean);
    a((dOc)localcpa.fi("animatedElementRight"), paramBoolean);

    this.aCk = i;
  }

  public void a(coS paramcoS)
  {
    super.a(paramcoS);

    cpa localcpa = cBQ.cxL().coO().nf("messageContainerFight");
    if (localcpa == null) {
      return;
    }

    a((auC)localcpa.fi("animatedElementLeft"));
    a((auC)localcpa.fi("animatedElementRight"));
  }

  protected void O(String paramString)
  {
  }
}