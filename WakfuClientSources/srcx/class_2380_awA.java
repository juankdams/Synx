import java.util.ArrayList;
import java.util.Iterator;

public class awA
{
  public static boolean a(aqm paramaqm, ArrayList paramArrayList)
  {
    Iterator localIterator;
    if ((paramArrayList == null) || (paramArrayList.size() == 0)) {
      for (localIterator = paramaqm.aF().iterator(); localIterator.hasNext(); )
        if (((ec)localIterator.next()).it() == 0)
          return true;
      return false;
    }

    for (ec localec : paramaqm.aF()) {
      int i = 1;
      int j = 1;
      int k = 0;
      for (int m = 0; m < paramArrayList.size(); m = (byte)(m + 1)) {
        if (k > localec.it() - 1) {
          j = 0;
          break;
        }
        int n;
        if ((((dDZ)localec.aC(k)).aNE() == Pq.chx) && 
          (((dKY)paramArrayList.get(m)).aNE() != Pq.chx)) {
          i = 0;
          n = 1;
          for (; m < paramArrayList.size(); m = (byte)(m + 1))
            if ((paramArrayList.get(m) == null) || (((dKY)paramArrayList.get(m)).aNE() != Pq.chv)) {
              n = 0;
              break;
            }
          if (n != 0) {
            if (k != localec.it() - 1) {
              j = 0;
              break;
            }
            return true;
          }
          m = (byte)(m - 1);
          k++;
        }
        else if (((dDZ)localec.aC(k)).aNE() == Pq.chy) {
          i = 0;
          n = 1;
          int i1 = paramArrayList.size();
          for (; m < i1; m = (byte)(m + 1))
            if (((dKY)paramArrayList.get(m)).aNE() != Pq.chu) {
              n = 0;
              break;
            }
          if (n != 0) {
            if (k != localec.it() - 1) {
              j = 0;
              break;
            }
            return true;
          }
          m = (byte)(m - 1);
          k++;
        }
        else if (((dDZ)localec.aC(k)).aNE() == Pq.chA)
        {
          i = 0;
          n = 1;
          for (; m < paramArrayList.size(); m = (byte)(m + 1))
            if (((dKY)paramArrayList.get(m)).aNE() != Pq.chz) {
              n = 0;
              break;
            }
          if (n != 0) {
            if (k != localec.it() - 1) {
              j = 0;
              break;
            }
            return true;
          }
          m = (byte)(m - 1);
          k++;
        }
        else
        {
          if (paramArrayList.get(m) == null) {
            j = 0;
            break;
          }

          if (((dKY)paramArrayList.get(m)).aNE() != ((dDZ)localec.aC(k)).aNE())
          {
            j = 0;
            break;
          }
          k++;
        }
      }
      if ((j != 0) && ((i == 0) || (paramArrayList.size() == localec.it())))
      {
        return true;
      }
    }
    return false;
  }
}