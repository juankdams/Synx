public class aBz extends dGj
{
  private static final String dVw = "DefaultDarkBold14";
  private static final String dVx = "chatScreamingBubble";
  private static final String dVy = "BubbleArrowLeft";
  private static final String dVz = "BubbleArrowRight";

  public aBz()
  {
    super(null);
  }

  public void b(dcY paramdcY)
  {
    super.b(paramdcY);
    qZ("DefaultDarkBold14");
    a("chatScreamingBubble", new Or(40, 40));
    m(paramdcY.isToRight() ? "BubbleArrowLeft" : "BubbleArrowRight", paramdcY.isToRight() ? 35 : -35, 3);
    paramdcY.setXOffset(paramdcY.isToRight() ? -5 : 5);
  }
}