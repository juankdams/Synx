import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.log4j.Logger;

public class sV extends cEv
{
  private static final Logger K = Logger.getLogger(sV.class);
  private int bcF;
  private int bcG;
  private int bcH;
  private int bcI;
  private static final aee aOr = new bOO(new ahc());

  public static sV a(dMr paramdMr, aNL paramaNL, CH paramCH, dwn paramdwn, EntitySprite paramEntitySprite)
  {
    sV localsV;
    try
    {
      localsV = (sV)aOr.Mm();
      localsV.fnG = aOr;
    } catch (Exception localException) {
      K.error("Problème au borrowObject.");
      localsV = new sV();
      localsV.aJ();
    }
    localsV.nS(paramdMr.bPg);
    localsV.CW(paramdMr.bPh);
    localsV.setModifiers(paramdMr.kr);
    localsV.setScreenX(paramdMr.kO);
    localsV.setScreenY(paramdMr.kP);
    localsV.iH(paramdMr.cIn());
    localsV.q(paramaNL);
    localsV.b(paramCH);
    localsV.setItemValue(paramdwn);

    localsV.a(paramEntitySprite);
    return localsV;
  }

  public int Ax() {
    return this.bcF;
  }

  public int Ay() {
    return this.bcG;
  }

  public int Az() {
    return this.bcH;
  }

  public int AA() {
    return this.bcI;
  }

  public dwn AB() {
    return (dwn)getItemValue();
  }

  private void a(EntitySprite paramEntitySprite) {
    this.bcF = ((int)paramEntitySprite.bjH());
    this.bcG = ((int)paramEntitySprite.bjI());
    this.bcH = paramEntitySprite.getWidth();
    this.bcI = paramEntitySprite.getHeight();
  }
}