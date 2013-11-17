import com.ankamagames.wakfu.client.ui.script.UIFunctionsLibrary;

public class dTv
  implements dGy
{
  public dTv(UIFunctionsLibrary paramUIFunctionsLibrary)
  {
  }

  public boolean execute(String paramString)
  {
    dLE.doY().removeProperty(paramString);
    return true;
  }
}