import java.io.IOException;
import org.apache.log4j.Logger;

final class aHq
  implements bhq
{
  aHq(short paramShort1, short paramShort2)
  {
  }

  public tF t(short paramShort1, short paramShort2)
  {
    try
    {
      cwO.c(this.efa, paramShort1, paramShort2);
      return cwO.b(this.efa, paramShort1, paramShort2, this.efb);
    } catch (IOException localIOException) {
      alf.i().error("Unable to load map (" + paramShort1 + "; " + paramShort2 + ")");
    }return null;
  }
}