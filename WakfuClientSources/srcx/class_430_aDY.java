public class aDY extends dGj
{
  private static final String dZp = "grey";
  private static final String dZq = "chatThinkingBubble";
  private static final String dZr = "BubbleThinkingArrowLeft";
  private static final String dZs = "BubbleThinkingArrowRight";

  public aDY()
  {
    super(null);
  }

  public void b(dcY paramdcY)
  {
    super.b(paramdcY);
    qZ("grey");
    a("chatThinkingBubble", new Or(30, 40));
    m(paramdcY.isToRight() ? "BubbleThinkingArrowLeft" : "BubbleThinkingArrowRight", paramdcY.isToRight() ? 25 : -25, 5);
    paramdcY.setXOffset(paramdcY.isToRight() ? -5 : 5);
  }
}