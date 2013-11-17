import com.ankamagames.wakfu.client.console.command.commonIn.TakeScreenShotCommand;
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;

public final class bxw
  implements dTc
{
  private File dYl;

  private bxw(TakeScreenShotCommand paramTakeScreenShotCommand)
  {
  }

  public File bEU()
  {
    return this.dYl;
  }

  public void bEV() {
    String str1;
    try {
      str1 = this.dYl.getCanonicalPath();
    } catch (IOException localIOException) {
      str1 = this.dYl.getAbsolutePath();
    }
    String str2 = bU.fH().getString("screenshot.took", new Object[] { str1 });
    CM.LV().f(str2, 4);
  }

  public void c(Exception paramException) {
    String str = bU.fH().getString("screenshot.fail");
    CM.LV().f(str, 4);
    TakeScreenShotCommand.an().error("Erreur lors de la prise de screenShot", paramException);
  }
}