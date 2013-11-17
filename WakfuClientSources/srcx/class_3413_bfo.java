import java.util.ArrayList;

final class bfo
  implements bPA
{
  bfo(blx paramblx)
  {
  }

  public boolean a(int paramInt, aCc paramaCc)
  {
    cII localcII = new cII();
    localcII.iGB.bPw = paramInt;
    localcII.iGB.min = paramaCc.getMin();
    localcII.iGB.max = paramaCc.getMax();
    this.fsJ.aRC.VR.add(localcII);
    return true;
  }
}