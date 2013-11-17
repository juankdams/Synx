import org.apache.log4j.Logger;

public class abd
{
  private static final Logger K = Logger.getLogger(abd.class);

  public static String d(vL paramvL)
  {
    if (paramvL.EO()) {
      return paramvL.getTitle();
    }
    StringBuilder localStringBuilder = new StringBuilder("calendar.events.predefined.title.").append(paramvL.getType()).append('.').append(paramvL.ET());

    return bU.fH().getString(localStringBuilder.toString());
  }

  public static String e(vL paramvL) {
    if (paramvL.EO()) {
      return paramvL.getDescription();
    }
    StringBuilder localStringBuilder = new StringBuilder("calendar.events.predefined.desc.").append(paramvL.getType()).append('.').append(paramvL.ET());

    return bU.fH().getString(localStringBuilder.toString());
  }
}