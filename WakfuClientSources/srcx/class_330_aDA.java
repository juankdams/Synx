import java.util.ArrayList;
import org.apache.log4j.Logger;

class aDA
  implements dGy
{
  aDA(Nx paramNx, int[] paramArrayOfInt)
  {
  }

  public boolean e(deT paramdeT)
  {
    try
    {
      if (paramdeT.cMv())
        return true;
      int i = paramdeT.getId();
      Object localObject;
      if (Nx.a(this.dYv, this.dYu, i)) {
        aIV localaIV = new aIV(i);
        localaIV.a(new ccW(localaIV, 8));
        localObject = localaIV;
      } else {
        localObject = new dlq(i);
      }

      if (((asM)localObject).aET())
        Nx.a(this.dYv).add(localObject);
      else
        Nx.b(this.dYv).add(localObject);
    } catch (Exception localException) {
      Nx.Re().error("Exception lors de l'initialisation d'un craft id=" + paramdeT.getId(), localException);
    }
    return true;
  }
}