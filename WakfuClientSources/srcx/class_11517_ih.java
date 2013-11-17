import java.io.IOException;
import java.io.OutputStream;

public class ih extends bPW
{
  public ih(aGK paramaGK, int paramInt1, int paramInt2)
  {
    this(paramaGK, paramInt1, paramInt2);
  }

  public ih(dwE paramdwE, int paramInt1, int paramInt2)
  {
    super(new asr(paramdwE, paramInt1), new asr(paramdwE, paramInt2));
  }

  public void stop()
  {
    super.stop();
    try {
      bXn().close();
      bXo().close();
    }
    catch (IOException localIOException) {
      throw new cJ(localIOException);
    }
  }
}