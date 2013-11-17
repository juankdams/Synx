import java.io.IOException;
import org.apache.log4j.Logger;

class Bp
  implements bPA
{
  Bp(Xv paramXv, dSw paramdSw)
  {
  }

  public boolean a(int paramInt, adz paramadz)
  {
    try
    {
      this.bxn.writeInt(paramInt);
      this.bxn.writeInt(paramadz.size());
      kr localkr = paramadz.apz();
      while (localkr.hasNext())
        this.bxn.writeInt(localkr.next());
    }
    catch (IOException localIOException) {
      Xv.K.error("Exception", localIOException);
      return false;
    }
    return true;
  }
}