import java.util.Arrays;
import java.util.List;

public class SR extends bik
{
  public axA cuw;

  protected List aR()
  {
    return Arrays.asList(new String[] { "sid" });
  }

  public SR()
  {
  }

  public SR(byte[] paramArrayOfByte) {
    super(new dcj(paramArrayOfByte.length));
    sF().write(0L, paramArrayOfByte, 0, paramArrayOfByte.length);
    hb();
  }

  public SR(int paramInt) {
    super(new dcj(paramInt));
  }

  public SR(axA paramaxA) {
    super(paramaxA);
    hb();
  }

  public byte[] getBytes() {
    int i = aZR.fgU.b(this);
    return sF().i(0L, i);
  }
}