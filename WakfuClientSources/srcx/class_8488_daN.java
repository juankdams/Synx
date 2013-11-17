import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class daN
  implements aKd
{
  public void a(bZL parambZL)
  {
    String str1 = b(parambZL);
    BufferedReader localBufferedReader = null;
    try {
      localBufferedReader = new BufferedReader(new InputStreamReader(getInputStream()));
      do {
        System.err.println(str1);
        System.err.flush();
        try {
          String str2 = localBufferedReader.readLine();
          parambZL.kN(str2);
        } catch (IOException localIOException1) {
          throw new cJ("Failed to read input from Console.", localIOException1);
        }
      }
      while (!parambZL.cep());
    } finally {
      if (localBufferedReader != null)
        try {
          localBufferedReader.close();
        } catch (IOException localIOException3) {
          throw new cJ("Failed to close input.", localIOException3);
        }
    }
  }

  protected String b(bZL parambZL)
  {
    String str1 = parambZL.getPrompt();
    String str2 = parambZL.getDefaultValue();
    if ((parambZL instanceof dhK)) {
      StringBuilder localStringBuilder = new StringBuilder(str1).append(" (");
      int i = 1;
      for (String str3 : ((dhK)parambZL).cRr()) {
        if (i == 0) {
          localStringBuilder.append(", ");
        }
        if (str3.equals(str2)) {
          localStringBuilder.append('[');
        }
        localStringBuilder.append(str3);
        if (str3.equals(str2)) {
          localStringBuilder.append(']');
        }
        i = 0;
      }
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }if (str2 != null) {
      return str1 + " [" + str2 + "]";
    }
    return str1;
  }

  protected InputStream getInputStream()
  {
    return ddl.cOu();
  }
}