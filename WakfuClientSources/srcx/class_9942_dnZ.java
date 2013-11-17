import com.ankamagames.baseImpl.graphics.script.EffectFunctionsLibrary;
import java.util.HashMap;
import java.util.Map.Entry;

public class dnZ
  implements ddH
{
  private float lol = 0.0F;
  private float lom = 0.0F;

  private bKB lon = new bKB();
  private boolean drG = true;

  public void cz(boolean paramBoolean) {
    this.drG = paramBoolean;
  }

  public void da(float paramFloat) {
    this.lol = paramFloat;
  }

  public void db(float paramFloat) {
    this.lom = paramFloat;
  }

  public void b(Pr paramPr, float paramFloat) {
    this.lon.b(paramPr, paramFloat);
  }

  public void a(long paramLong, bEV parambEV1, bEV parambEV2, rh paramrh, HashMap paramHashMap)
  {
    if (this.drG) {
      parambEV1.set(this.lol);
      parambEV2.set(1.0F);

      adG localadG1 = EffectFunctionsLibrary.cPR().cPS();

      if ((parambEV1.bMS() > 0.0F) && (!paramrh.isRunning())) {
        paramrh.a(localadG1);
      }
      this.lon.a(new Cy(this, paramHashMap));
    }
    else
    {
      float f = 0.0F;

      parambEV1.set(0.0F);
      parambEV1.set(0.0F);

      adG localadG2 = EffectFunctionsLibrary.cPR().cPS();

      if ((parambEV1.bMS() > 0.0F) && (!paramrh.isRunning())) {
        paramrh.a(localadG2);
      }
      for (Map.Entry localEntry : paramHashMap.entrySet()) {
        rh localrh = (rh)localEntry.getValue();
        if (localrh != null)
          localrh.A(0.0F);
      }
    }
  }
}