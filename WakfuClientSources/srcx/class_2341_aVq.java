import org.apache.log4j.Logger;

public class aVq extends cRi
{
  protected long gl()
  {
    bpu localbpu = aiJ();
    if (localbpu == null)
      return 0L;
    return localbpu.CH();
  }

  protected bpu aiJ() {
    if (!Vr.cAl.aiI()) {
      K.error("Doit être placé dans un havre monde!!!");
      return null;
    }
    return Vr.cAl.aiJ();
  }
}