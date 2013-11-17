import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

public class dhQ extends Kc
{
  public void setColor(bNa parambNa, cke paramcke)
  {
    switch (cwr.ihQ[paramcke.ordinal()]) {
    case 1:
      this.bWt.a(oB.aTQ, parambNa);
      break;
    case 2:
      this.bWt.a(oB.aTO, parambNa);
      break;
    case 3:
      this.bWt.a(oB.aTP, parambNa);
      break;
    case 4:
      this.bWt.a(oB.aTN, parambNa);
      break;
    default:
      if (!bB) throw new AssertionError("We should never end here");
      break;
    }
  }
}