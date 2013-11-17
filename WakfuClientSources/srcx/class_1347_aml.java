import java.util.zip.ZipException;

public class aml extends ZipException
{
  private final dSK doL;
  private final dPL doM;
  private static final long serialVersionUID = 4430521921766595597L;

  public aml(dSK paramdSK, dPL paramdPL)
  {
    super("unsupported feature " + paramdSK + " used in entry " + paramdPL.getName());

    this.doL = paramdSK;
    this.doM = paramdPL;
  }

  public dSK ayS()
  {
    return this.doL;
  }

  public dPL ayT()
  {
    return this.doM;
  }
}