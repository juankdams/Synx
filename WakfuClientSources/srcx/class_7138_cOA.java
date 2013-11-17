import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class cOA
{
  private static final Pattern kxf = Pattern.compile(".+://.*");

  public static boolean om(String paramString)
  {
    return kxf.matcher(paramString).matches();
  }

  public static String on(String paramString)
  {
    aHA.debug("encodeMrl(mrl={})", new Object[] { paramString });

    String str1 = paramString;

    if (oo(paramString)) {
      aHA.debug("MRL contains Unicode characters", new Object[0]);
      try {
        URI localURI = new URI(paramString);
        aHA.debug("uri={}", new Object[] { localURI });
        String str2 = localURI.getScheme();
        aHA.debug("scheme={}", new Object[] { localURI.getScheme() });

        if (str2 == null) {
          aHA.debug("MRL has no scheme, assuming a local file name that should be encoded", new Object[0]);

          str1 = new File(paramString).toURI().toASCIIString().replaceFirst("file:/", "file:///");
        }
        else {
          aHA.debug("Ignoring MRL with scheme '{}'", new Object[] { str2 });
        }
      }
      catch (URISyntaxException localURISyntaxException)
      {
        aHA.debug("Can not obtain a valid URI from the MRL", new Object[0]);
      }
    }
    else {
      aHA.debug("MRL does not contain any Unicode characters", new Object[0]);
    }
    aHA.debug("result={}", new Object[] { str1 });
    return str1;
  }

  private static boolean oo(String paramString)
  {
    boolean bool = false;
    for (int i = 0; i < paramString.length(); i++) {
      if (paramString.charAt(i) >= '') {
        bool = true;
        break;
      }
    }
    return bool;
  }
}