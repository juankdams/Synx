import java.util.ArrayList;
import java.util.Comparator;

public enum blX
{
  private final Comparator fDi;
  private final cZW fDj;

  private blX(Comparator arg3, cZW arg4)
  {
    Object localObject1;
    this.fDi = localObject1;
    Object localObject2;
    this.fDj = localObject2;
  }

  public Comparator bwV() {
    return this.fDi;
  }

  public boolean a(long paramLong, ArrayList paramArrayList) {
    return this.fDj.a(paramLong, paramArrayList);
  }
}