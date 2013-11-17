import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aPr extends ParseException
{
  private static final String eLr = "Erreur au parse d'une date";
  private static final String eLs = aax.cOH.getChar() + "[" + aax.cOQ + "]";
  private static final String eLt = aax.cOH.getChar() + "[^" + aax.cOQ + "]";
  private final String eLu;
  private final String eLv;

  public aPr(String paramString1, String paramString2)
  {
    super("Erreur au parse d'une date", -1);
    this.eLu = paramString1;
    this.eLv = paramString2;
  }

  public String getFormat() {
    return this.eLu;
  }

  public String bgj() {
    return this.eLv;
  }

  public String getMessage()
  {
    Matcher localMatcher = Pattern.compile(eLt).matcher(this.eLu);
    if (localMatcher.find()) {
      return "Variable " + localMatcher.group() + " inconnue dans le FORMAT [ " + this.eLu + " ]";
    }
    localMatcher = Pattern.compile(eLs + eLs).matcher(this.eLu);
    if (localMatcher.find()) {
      return "Variables " + localMatcher.group() + " sans séparateur dans le FORMAT [ " + this.eLu + " ]";
    }
    if (!Pattern.compile(li.aj(this.eLu)).matcher(this.eLv).matches()) {
      return "DATE [" + this.eLv + "] incompatible avec le FORMAT [ " + this.eLu + " ]";
    }
    return "Parse impossible pour le FORMAT [ " + this.eLu + " ] et la DATE [ " + this.eLv + " ]";
  }
}