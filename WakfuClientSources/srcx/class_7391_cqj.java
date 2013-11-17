import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class cqj extends aio
{
  public String[] cg(String paramString)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();

    Jf localJf = null;
    for (Iterator localIterator = avg().iterator(); localIterator.hasNext(); ) {
      localJf = (Jf)localIterator.next();
      if (localJf != null) {
        String[] arrayOfString = localJf.cg(paramString);
        if (arrayOfString != null) {
          for (int i = 0; i < arrayOfString.length; i++) {
            localLinkedHashSet.add(arrayOfString[i]);
          }
        }
      }
    }
    return localLinkedHashSet.size() == 0 ? null : (String[])localLinkedHashSet.toArray(new String[localLinkedHashSet.size()]);
  }
}