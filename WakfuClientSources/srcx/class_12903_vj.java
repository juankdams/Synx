import java.util.Arrays;
import java.util.List;

public class vj extends bik
{
  public byte[] data;

  public vj()
  {
  }

  public vj(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
    c(new dcj(paramArrayOfByte.length));
  }

  public vj(axA paramaxA) {
    super(paramaxA);
    hb();
  }

  protected List aR()
  {
    return Arrays.asList(new String[] { "data" });
  }
}