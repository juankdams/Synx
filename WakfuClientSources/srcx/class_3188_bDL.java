import java.util.ArrayList;

final class bDL
  implements cZW
{
  public boolean a(long paramLong, ArrayList paramArrayList)
  {
    if (paramArrayList.size() < 3) {
      return true;
    }
    if (paramLong < ((aEW)paramArrayList.get(paramArrayList.size() - 1)).aRx()) {
      return true;
    }
    return false;
  }
}