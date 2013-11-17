import com.ankamagames.framework.script.JavaFunctionLoader;
import com.ankamagames.framework.script.JavaFunctionLoader.CustomJavaFunctionLib;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class dzH
  implements bZs
{
  int i = 0;

  public dzH(JavaFunctionLoader paramJavaFunctionLoader, JavaFunctionLoader.CustomJavaFunctionLib[] paramArrayOfCustomJavaFunctionLib) {  } 
  public boolean g(String paramString, ArrayList paramArrayList) { String[] arrayOfString = new String[paramArrayList.size()];
    int j = 0; for (int k = paramArrayList.size(); j < k; j++) {
      arrayOfString[j] = ((Class)paramArrayList.get(j)).getName();
    }
    Constructor[] arrayOfConstructor = JavaFunctionLoader.e(arrayOfString);
    if (paramString.length() == 0)
      this.lGC[(this.i++)] = new JavaFunctionLoader.CustomJavaFunctionLib(paramString, null, arrayOfConstructor);
    else {
      this.lGC[(this.i++)] = new JavaFunctionLoader.CustomJavaFunctionLib(paramString, arrayOfConstructor, null);
    }
    return true;
  }
}