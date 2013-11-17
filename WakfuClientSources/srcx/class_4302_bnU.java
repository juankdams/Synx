import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class bnU
{
  private Comparator cwp;

  public bnU()
  {
  }

  public bnU(Comparator paramComparator)
  {
    this.cwp = paramComparator;
  }

  public int[] a(ArrayList paramArrayList, boolean paramBoolean)
  {
    Object[] arrayOfObject = paramArrayList.toArray(new Object[paramArrayList.size()]);
    Arrays.sort(arrayOfObject, this.cwp);

    int[] arrayOfInt = new int[paramArrayList.size()];
    int i = 0; for (int j = arrayOfObject.length; i < j; i++) {
      if (paramBoolean)
        arrayOfInt[i] = paramArrayList.indexOf(arrayOfObject[i]);
      else {
        arrayOfInt[(j - i - 1)] = paramArrayList.indexOf(arrayOfObject[i]);
      }
    }

    return arrayOfInt;
  }
}