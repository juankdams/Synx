import com.ankamagames.framework.graphics.engine.entity.Entity;

public class Wh extends dqC
{
  public static final String TAG = "SwitchingPlainBackground";
  private azL cGc = new azL();

  public static final int aLa = "duration".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof cAf)) {
      this.cGc.d(((cAf)paramaNL).getColor());
    }

    super.a(paramaNL);
  }

  public String getTag()
  {
    return "SwitchingPlainBackground";
  }

  public VJ getMesh()
  {
    return this.cGc;
  }

  public Entity getEntity()
  {
    return null;
  }

  public int getDuration()
  {
    return this.cGc.getDuration();
  }

  public void setDuration(int paramInt)
  {
    this.cGc.setDuration(paramInt);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    Wh localWh = (Wh)parambdj;
    localWh.setDuration(getDuration());
  }

  public void bc()
  {
    super.bc();
    this.cGc.bc();
  }

  public void aJ()
  {
    super.aJ();
    this.cGc.aJ();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == aLa)
      setDuration(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == aLa)
      setDuration(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}