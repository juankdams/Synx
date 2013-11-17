import java.io.IOException;
import java.net.Socket;

public class bAs extends dwE
  implements cjq
{
  private String gpo = null;
  private int port = 0;

  public void jw(String paramString)
  {
    this.gpo = paramString;
  }

  public void setPort(int paramInt)
  {
    this.port = paramInt;
  }

  public boolean gh()
  {
    if (this.gpo == null) {
      throw new cJ("No server specified in socket condition");
    }

    if (this.port == 0) {
      throw new cJ("No port specified in socket condition");
    }
    d("Checking for listener at " + this.gpo + ":" + this.port, 3);

    Socket localSocket = null;
    try {
      localSocket = new Socket(this.gpo, this.port);
    } catch (IOException localIOException2) {
      return false;
    } finally {
      if (localSocket != null)
        try {
          localSocket.close();
        }
        catch (IOException localIOException4)
        {
        }
    }
    return true;
  }
}