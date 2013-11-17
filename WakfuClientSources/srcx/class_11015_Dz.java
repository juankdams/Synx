import com.ankamagames.wakfu.client.core.script.function.context.SetCharacteristicListenerOn;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaException;

public class Dz
  implements caY
{
  public Dz(SetCharacteristicListenerOn paramSetCharacteristicListenerOn, String paramString, boolean paramBoolean, Rx paramRx)
  {
  }

  public void a(cqm paramcqm)
  {
    try
    {
      SetCharacteristicListenerOn.a(this.bIq).kE(this.bIn);
      if (this.bIo)
        this.bIp.b(this);
    } catch (LuaException localLuaException) {
      SetCharacteristicListenerOn.i().error("Exception levee", localLuaException);
    }
  }
}