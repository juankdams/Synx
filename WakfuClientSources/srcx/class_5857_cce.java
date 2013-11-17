public class cce extends dGj
{
  private static final String htu = "DefaultDarkBold14";
  private static final String htv = "chatBubble";
  private static final String htw = "BubbleArrowLeft";
  private static final String htx = "BubbleArrowRight";

  public cce()
  {
    super(null);
  }

  public void b(dcY paramdcY)
  {
    super.b(paramdcY);
    qZ("DefaultDarkBold14");
    a("chatBubble", new Or(12, 20));
    m(paramdcY.isToRight() ? "BubbleArrowLeft" : "BubbleArrowRight", paramdcY.isToRight() ? 15 : -15, 0);
    paramdcY.setXOffset(paramdcY.isToRight() ? -5 : 5);
  }
}