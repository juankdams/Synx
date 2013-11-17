import java.util.Iterator;
import java.util.List;

public final class asE
{
  private static final String bdh = "@(#) $RCSfile: Verifier.java,v $ $Revision: 1.51 $ $Date: 2004/08/31 21:58:55 $ $Name: jdom_1_0 $";

  public static String ft(String paramString)
  {
    String str;
    if ((str = fF(paramString)) != null) {
      return str;
    }

    if (paramString.indexOf(":") != -1) {
      return "Attribute names cannot contain colons";
    }

    if (paramString.equals("xmlns")) {
      return "An Attribute name may not be \"xmlns\"; use the Namespace class to manage namespaces";
    }

    return null;
  }

  public static String fu(String paramString)
  {
    String str = null;
    if ((str = fv(paramString)) != null) {
      return str;
    }

    if (paramString.indexOf("]]>") != -1) {
      return "CDATA cannot internally contain a CDATA ending delimiter (]]>)";
    }

    return null;
  }

  public static String fv(String paramString)
  {
    if (paramString == null) {
      return "A null is not a legal XML value";
    }

    int i = 0; for (int j = paramString.length(); i < j; i++)
    {
      int k = paramString.charAt(i);

      if ((k >= 55296) && (k <= 56319))
      {
        i++;
        if (i < j) {
          int m = paramString.charAt(i);
          if ((m < 56320) || (m > 57343)) {
            return "Illegal Surrogate Pair";
          }

          k = 65536 + (k - 55296) * 1024 + (m - 56320);
        }
        else {
          return "Surrogate Pair Truncated";
        }
      }

      if (!jZ(k))
      {
        return "0x" + Integer.toHexString(k) + 
          " is not a legal XML character";
      }

    }

    return null;
  }

  public static String fw(String paramString)
  {
    String str = null;
    if ((str = fv(paramString)) != null) {
      return str;
    }

    if (paramString.indexOf("--") != -1) {
      return "Comments cannot contain double hyphens (--)";
    }
    if (paramString.startsWith("-")) {
      return "Comment data cannot start with a hyphen.";
    }
    if (paramString.endsWith("-")) {
      return "Comment data cannot end with a hyphen.";
    }

    return null;
  }

  public static String fx(String paramString)
  {
    String str;
    if ((str = fF(paramString)) != null) {
      return str;
    }

    if (paramString.indexOf(":") != -1) {
      return "Element names cannot contain colons";
    }

    return null;
  }

  public static String a(dbr paramdbr, dRW paramdRW)
  {
    bkj localbkj = paramdbr.cNd();
    String str = localbkj.getPrefix();
    if ("".equals(str)) {
      return null;
    }

    return a(localbkj, paramdRW);
  }

  public static String a(bkj parambkj, List paramList)
  {
    if (paramList == null) {
      return null;
    }

    String str = null;
    Iterator localIterator = paramList.iterator();
    while ((str == null) && (localIterator.hasNext())) {
      Object localObject = localIterator.next();
      if ((localObject instanceof dbr)) {
        str = a(parambkj, (dbr)localObject);
      }
      else if ((localObject instanceof dRW)) {
        str = a(parambkj, (dRW)localObject);
      }
      else if ((localObject instanceof bkj)) {
        str = a(parambkj, (bkj)localObject);
        if (str != null) {
          str = str + " with an additional namespace declared by the element";
        }
      }
    }

    return str;
  }

  public static String a(bkj parambkj, dbr paramdbr)
  {
    String str = a(parambkj, 
      paramdbr.cNd());
    if (str != null) {
      str = str + " with an attribute namespace prefix on the element";
    }
    return str;
  }

  public static String a(bkj parambkj, dRW paramdRW)
  {
    String str = a(parambkj, 
      paramdRW.cNd());
    if (str != null) {
      return str + " with the element namespace prefix";
    }

    str = a(parambkj, 
      paramdRW.dsN());
    if (str != null) {
      return str;
    }

    str = a(parambkj, paramdRW.getAttributes());
    if (str != null) {
      return str;
    }

    return null;
  }

  public static String a(bkj parambkj1, bkj parambkj2)
  {
    String str5 = null;
    String str1 = parambkj1.getPrefix();
    String str3 = parambkj1.getURI();
    String str2 = parambkj2.getPrefix();
    String str4 = parambkj2.getURI();
    if ((str1.equals(str2)) && (!str3.equals(str4))) {
      str5 = "The namespace prefix \"" + str1 + "\" collides";
    }
    return str5;
  }

  public static String fy(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return null;
    }

    char c1 = paramString.charAt(0);
    if (o(c1)) {
      return "Namespace prefixes cannot begin with a number";
    }

    if (c1 == '$') {
      return "Namespace prefixes cannot begin with a dollar sign ($)";
    }

    if (c1 == '-') {
      return "Namespace prefixes cannot begin with a hyphen (-)";
    }

    if (c1 == '.') {
      return "Namespace prefixes cannot begin with a period (.)";
    }

    if (paramString.toLowerCase().startsWith("xml")) {
      return "Namespace prefixes cannot begin with \"xml\" in any combination of case";
    }

    int i = 0; for (int j = paramString.length(); i < j; i++) {
      char c2 = paramString.charAt(i);
      if (!s(c2)) {
        return "Namespace prefixes cannot contain the character \"" + 
          c2 + "\"";
      }

    }

    if (paramString.indexOf(":") != -1) {
      return "Namespace prefixes cannot contain colons";
    }

    return null;
  }

  public static String fz(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return null;
    }

    char c = paramString.charAt(0);
    if (Character.isDigit(c)) {
      return "Namespace URIs cannot begin with a number";
    }

    if (c == '$') {
      return "Namespace URIs cannot begin with a dollar sign ($)";
    }

    if (c == '-') {
      return "Namespace URIs cannot begin with a hyphen (-)";
    }

    return null;
  }

  public static String fA(String paramString)
  {
    String str = fv(paramString);

    if ((str == null) && 
      (paramString.indexOf("?>") >= 0)) {
      return "Processing instructions cannot contain the string \"?>\"";
    }

    return str;
  }

  public static String fB(String paramString)
  {
    String str;
    if ((str = fF(paramString)) != null) {
      return str;
    }

    if (paramString.indexOf(":") != -1) {
      return "Processing instruction targets cannot contain colons";
    }

    if (paramString.equalsIgnoreCase("xml")) {
      return 
        "Processing instructions cannot have a target of \"xml\" in any combination of case. (Note that the \"<?xml ... ?>\" declaration at the beginning of a document is not a processing instruction and should not be added as one; it is written automatically during output, e.g. by XMLOutputter.)";
    }

    return null;
  }

  public static String fC(String paramString)
  {
    String str = null;

    if (paramString == null) return null;

    for (int i = 0; i < paramString.length(); i++) {
      char c = paramString.charAt(i);
      if (!u(c)) {
        str = c + " is not a legal character in public IDs";
        break;
      }
    }

    return str;
  }

  public static String fD(String paramString)
  {
    String str = null;

    if (paramString == null) return null;

    if ((paramString.indexOf('\'') != -1) && 
      (paramString.indexOf('"') != -1)) {
      str = 
        "System literals cannot simultaneously contain both single and double quotes.";
    }
    else {
      str = fv(paramString);
    }

    return str;
  }

  public static String fE(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return null;
    }

    for (int i = 0; i < paramString.length(); i++) {
      char c1 = paramString.charAt(i);
      if (!m(c1)) {
        String str = "0x" + Integer.toHexString(c1);
        if (c1 <= '\t') str = "0x0" + Integer.toHexString(c1);
        return "URIs cannot contain " + str;
      }
      if (c1 == '%') {
        try {
          char c2 = paramString.charAt(i + 1);
          char c3 = paramString.charAt(i + 2);
          if ((!l(c2)) || 
            (!l(c3))) {
            return 
              "Percent signs in URIs must be followed by exactly two hexadecimal digits.";
          }
        }
        catch (StringIndexOutOfBoundsException localStringIndexOutOfBoundsException)
        {
          return 
            "Percent signs in URIs must be followed by exactly two hexadecimal digits.";
        }
      }

    }

    return null;
  }

  public static String fF(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0) || 
      (paramString.trim().equals(""))) {
      return "XML names cannot be null or empty";
    }

    char c1 = paramString.charAt(0);
    if (!t(c1)) {
      return "XML names cannot begin with the character \"" + 
        c1 + "\"";
    }

    int i = 1; for (int j = paramString.length(); i < j; i++) {
      char c2 = paramString.charAt(i);
      if (!s(c2)) {
        return "XML names cannot contain the character \"" + c2 + "\"";
      }

    }

    return null;
  }

  public static boolean l(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) return true;
    if ((paramChar >= 'A') && (paramChar <= 'F')) return true;
    if ((paramChar >= 'a') && (paramChar <= 'f')) return true;

    return false;
  }

  public static boolean m(char paramChar)
  {
    if ((paramChar >= 'a') && (paramChar <= 'z')) return true;
    if ((paramChar >= 'A') && (paramChar <= 'Z')) return true;
    if ((paramChar >= '0') && (paramChar <= '9')) return true;
    if (paramChar == '/') return true;
    if (paramChar == '-') return true;
    if (paramChar == '.') return true;
    if (paramChar == '?') return true;
    if (paramChar == ':') return true;
    if (paramChar == '@') return true;
    if (paramChar == '&') return true;
    if (paramChar == '=') return true;
    if (paramChar == '+') return true;
    if (paramChar == '$') return true;
    if (paramChar == ',') return true;
    if (paramChar == '%') return true;

    if (paramChar == '_') return true;
    if (paramChar == '!') return true;
    if (paramChar == '~') return true;
    if (paramChar == '*') return true;
    if (paramChar == '\'') return true;
    if (paramChar == '(') return true;
    if (paramChar == ')') return true;
    return false;
  }

  public static boolean jZ(int paramInt)
  {
    if (paramInt == 10) return true;
    if (paramInt == 13) return true;
    if (paramInt == 9) return true;

    if (paramInt < 32) return false; if (paramInt <= 55295) return true;
    if (paramInt < 57344) return false; if (paramInt <= 65533) return true;
    if (paramInt < 65536) return false; if (paramInt <= 1114111) return true;

    return false;
  }

  public static boolean n(char paramChar)
  {
    if (paramChar < '̀') return false; if (paramChar <= 'ͅ') return true;
    if (paramChar < '͠') return false; if (paramChar <= '͡') return true;
    if (paramChar < '҃') return false; if (paramChar <= '҆') return true;
    if (paramChar < '֑') return false; if (paramChar <= '֡') return true;

    if (paramChar < '֣') return false; if (paramChar <= 'ֹ') return true;
    if (paramChar < 'ֻ') return false; if (paramChar <= 'ֽ') return true;
    if (paramChar == 'ֿ') return true;
    if (paramChar < 'ׁ') return false; if (paramChar <= 'ׂ') return true;

    if (paramChar == 'ׄ') return true;
    if (paramChar < 'ً') return false; if (paramChar <= 'ْ') return true;
    if (paramChar == 'ٰ') return true;
    if (paramChar < 'ۖ') return false; if (paramChar <= 'ۜ') return true;

    if (paramChar < '۝') return false; if (paramChar <= '۟') return true;
    if (paramChar < '۠') return false; if (paramChar <= 'ۤ') return true;
    if (paramChar < 'ۧ') return false; if (paramChar <= 'ۨ') return true;

    if (paramChar < '۪') return false; if (paramChar <= 'ۭ') return true;
    if (paramChar < 'ँ') return false; if (paramChar <= 'ः') return true;
    if (paramChar == '़') return true;
    if (paramChar < 'ा') return false; if (paramChar <= 'ौ') return true;

    if (paramChar == '्') return true;
    if (paramChar < '॑') return false; if (paramChar <= '॔') return true;
    if (paramChar < 'ॢ') return false; if (paramChar <= 'ॣ') return true;
    if (paramChar < 'ঁ') return false; if (paramChar <= 'ঃ') return true;

    if (paramChar == '়') return true;
    if (paramChar == 'া') return true;
    if (paramChar == 'ি') return true;
    if (paramChar < 'ী') return false; if (paramChar <= 'ৄ') return true;
    if (paramChar < 'ে') return false; if (paramChar <= 'ৈ') return true;

    if (paramChar < 'ো') return false; if (paramChar <= '্') return true;
    if (paramChar == 'ৗ') return true;
    if (paramChar < 'ৢ') return false; if (paramChar <= 'ৣ') return true;
    if (paramChar == 'ਂ') return true;
    if (paramChar == '਼') return true;

    if (paramChar == 'ਾ') return true;
    if (paramChar == 'ਿ') return true;
    if (paramChar < 'ੀ') return false; if (paramChar <= 'ੂ') return true;
    if (paramChar < 'ੇ') return false; if (paramChar <= 'ੈ') return true;

    if (paramChar < 'ੋ') return false; if (paramChar <= '੍') return true;
    if (paramChar < 'ੰ') return false; if (paramChar <= 'ੱ') return true;
    if (paramChar < 'ઁ') return false; if (paramChar <= 'ઃ') return true;
    if (paramChar == '઼') return true;

    if (paramChar < 'ા') return false; if (paramChar <= 'ૅ') return true;
    if (paramChar < 'ે') return false; if (paramChar <= 'ૉ') return true;
    if (paramChar < 'ો') return false; if (paramChar <= '્') return true;

    if (paramChar < 'ଁ') return false; if (paramChar <= 'ଃ') return true;
    if (paramChar == '଼') return true;
    if (paramChar < 'ା') return false; if (paramChar <= 'ୃ') return true;
    if (paramChar < 'େ') return false; if (paramChar <= 'ୈ') return true;

    if (paramChar < 'ୋ') return false; if (paramChar <= '୍') return true;
    if (paramChar < 'ୖ') return false; if (paramChar <= 'ୗ') return true;
    if (paramChar < 'ஂ') return false; if (paramChar <= 'ஃ') return true;

    if (paramChar < 'ா') return false; if (paramChar <= 'ூ') return true;
    if (paramChar < 'ெ') return false; if (paramChar <= 'ை') return true;
    if (paramChar < 'ொ') return false; if (paramChar <= '்') return true;
    if (paramChar == 'ௗ') return true;

    if (paramChar < 'ఁ') return false; if (paramChar <= 'ః') return true;
    if (paramChar < 'ా') return false; if (paramChar <= 'ౄ') return true;
    if (paramChar < 'ె') return false; if (paramChar <= 'ై') return true;

    if (paramChar < 'ొ') return false; if (paramChar <= '్') return true;
    if (paramChar < 'ౕ') return false; if (paramChar <= 'ౖ') return true;
    if (paramChar < 'ಂ') return false; if (paramChar <= 'ಃ') return true;

    if (paramChar < 'ಾ') return false; if (paramChar <= 'ೄ') return true;
    if (paramChar < 'ೆ') return false; if (paramChar <= 'ೈ') return true;
    if (paramChar < 'ೊ') return false; if (paramChar <= '್') return true;

    if (paramChar < 'ೕ') return false; if (paramChar <= 'ೖ') return true;
    if (paramChar < 'ം') return false; if (paramChar <= 'ഃ') return true;
    if (paramChar < 'ാ') return false; if (paramChar <= 'ൃ') return true;

    if (paramChar < 'െ') return false; if (paramChar <= 'ൈ') return true;
    if (paramChar < 'ൊ') return false; if (paramChar <= '്') return true;
    if (paramChar == 'ൗ') return true;
    if (paramChar == 'ั') return true;

    if (paramChar < 'ิ') return false; if (paramChar <= 'ฺ') return true;
    if (paramChar < '็') return false; if (paramChar <= '๎') return true;
    if (paramChar == 'ັ') return true;
    if (paramChar < 'ິ') return false; if (paramChar <= 'ູ') return true;

    if (paramChar < 'ົ') return false; if (paramChar <= 'ຼ') return true;
    if (paramChar < '່') return false; if (paramChar <= 'ໍ') return true;
    if (paramChar < '༘') return false; if (paramChar <= '༙') return true;
    if (paramChar == '༵') return true;

    if (paramChar == '༷') return true;
    if (paramChar == '༹') return true;
    if (paramChar == '༾') return true;
    if (paramChar == '༿') return true;
    if (paramChar < 'ཱ') return false; if (paramChar <= '྄') return true;

    if (paramChar < '྆') return false; if (paramChar <= 'ྋ') return true;
    if (paramChar < 'ྐ') return false; if (paramChar <= 'ྕ') return true;
    if (paramChar == 'ྗ') return true;
    if (paramChar < 'ྙ') return false; if (paramChar <= 'ྭ') return true;

    if (paramChar < 'ྱ') return false; if (paramChar <= 'ྷ') return true;
    if (paramChar == 'ྐྵ') return true;
    if (paramChar < '⃐') return false; if (paramChar <= '⃜') return true;
    if (paramChar == '⃡') return true;

    if (paramChar < '〪') return false; if (paramChar <= '〯') return true;
    if (paramChar == '゙') return true;
    if (paramChar == '゚') return true;

    return false;
  }

  public static boolean o(char paramChar)
  {
    if (paramChar < '0') return false; if (paramChar <= '9') return true;
    if (paramChar < '٠') return false; if (paramChar <= '٩') return true;
    if (paramChar < '۰') return false; if (paramChar <= '۹') return true;
    if (paramChar < '०') return false; if (paramChar <= '९') return true;

    if (paramChar < '০') return false; if (paramChar <= '৯') return true;
    if (paramChar < '੦') return false; if (paramChar <= '੯') return true;
    if (paramChar < '૦') return false; if (paramChar <= '૯') return true;

    if (paramChar < '୦') return false; if (paramChar <= '୯') return true;
    if (paramChar < '௧') return false; if (paramChar <= '௯') return true;
    if (paramChar < '౦') return false; if (paramChar <= '౯') return true;

    if (paramChar < '೦') return false; if (paramChar <= '೯') return true;
    if (paramChar < '൦') return false; if (paramChar <= '൯') return true;
    if (paramChar < '๐') return false; if (paramChar <= '๙') return true;

    if (paramChar < '໐') return false; if (paramChar <= '໙') return true;
    if (paramChar < '༠') return false; if (paramChar <= '༩') return true;

    return false;
  }

  public static boolean p(char paramChar)
  {
    if (paramChar < '¶') return false;

    if (paramChar == '·') return true;
    if (paramChar == 'ː') return true;
    if (paramChar == 'ˑ') return true;
    if (paramChar == '·') return true;
    if (paramChar == 'ـ') return true;
    if (paramChar == 'ๆ') return true;
    if (paramChar == 'ໆ') return true;
    if (paramChar == '々') return true;

    if (paramChar < '〱') return false; if (paramChar <= '〵') return true;
    if (paramChar < 'ゝ') return false; if (paramChar <= 'ゞ') return true;
    if (paramChar < 'ー') return false; if (paramChar <= 'ヾ') return true;

    return false;
  }

  public static boolean q(char paramChar)
  {
    if (paramChar < 'A') return false; if (paramChar <= 'Z') return true;
    if (paramChar < 'a') return false; if (paramChar <= 'z') return true;
    if (paramChar < 'À') return false; if (paramChar <= 'Ö') return true;
    if (paramChar < 'Ø') return false; if (paramChar <= 'ö') return true;
    if (paramChar < 'ø') return false; if (paramChar <= 'ÿ') return true;
    if (paramChar < 'Ā') return false; if (paramChar <= 'ı') return true;
    if (paramChar < 'Ĵ') return false; if (paramChar <= 'ľ') return true;
    if (paramChar < 'Ł') return false; if (paramChar <= 'ň') return true;
    if (paramChar < 'Ŋ') return false; if (paramChar <= 'ž') return true;
    if (paramChar < 'ƀ') return false; if (paramChar <= 'ǃ') return true;
    if (paramChar < 'Ǎ') return false; if (paramChar <= 'ǰ') return true;
    if (paramChar < 'Ǵ') return false; if (paramChar <= 'ǵ') return true;
    if (paramChar < 'Ǻ') return false; if (paramChar <= 'ȗ') return true;
    if (paramChar < 'ɐ') return false; if (paramChar <= 'ʨ') return true;
    if (paramChar < 'ʻ') return false; if (paramChar <= 'ˁ') return true;
    if (paramChar == 'Ά') return true;
    if (paramChar < 'Έ') return false; if (paramChar <= 'Ί') return true;
    if (paramChar == 'Ό') return true;
    if (paramChar < 'Ύ') return false; if (paramChar <= 'Ρ') return true;
    if (paramChar < 'Σ') return false; if (paramChar <= 'ώ') return true;
    if (paramChar < 'ϐ') return false; if (paramChar <= 'ϖ') return true;
    if (paramChar == 'Ϛ') return true;
    if (paramChar == 'Ϝ') return true;
    if (paramChar == 'Ϟ') return true;
    if (paramChar == 'Ϡ') return true;
    if (paramChar < 'Ϣ') return false; if (paramChar <= 'ϳ') return true;
    if (paramChar < 'Ё') return false; if (paramChar <= 'Ќ') return true;
    if (paramChar < 'Ў') return false; if (paramChar <= 'я') return true;
    if (paramChar < 'ё') return false; if (paramChar <= 'ќ') return true;
    if (paramChar < 'ў') return false; if (paramChar <= 'ҁ') return true;
    if (paramChar < 'Ґ') return false; if (paramChar <= 'ӄ') return true;
    if (paramChar < 'Ӈ') return false; if (paramChar <= 'ӈ') return true;
    if (paramChar < 'Ӌ') return false; if (paramChar <= 'ӌ') return true;
    if (paramChar < 'Ӑ') return false; if (paramChar <= 'ӫ') return true;
    if (paramChar < 'Ӯ') return false; if (paramChar <= 'ӵ') return true;
    if (paramChar < 'Ӹ') return false; if (paramChar <= 'ӹ') return true;
    if (paramChar < 'Ա') return false; if (paramChar <= 'Ֆ') return true;
    if (paramChar == 'ՙ') return true;
    if (paramChar < 'ա') return false; if (paramChar <= 'ֆ') return true;
    if (paramChar < 'א') return false; if (paramChar <= 'ת') return true;
    if (paramChar < 'װ') return false; if (paramChar <= 'ײ') return true;
    if (paramChar < 'ء') return false; if (paramChar <= 'غ') return true;
    if (paramChar < 'ف') return false; if (paramChar <= 'ي') return true;
    if (paramChar < 'ٱ') return false; if (paramChar <= 'ڷ') return true;
    if (paramChar < 'ں') return false; if (paramChar <= 'ھ') return true;
    if (paramChar < 'ۀ') return false; if (paramChar <= 'ێ') return true;
    if (paramChar < 'ې') return false; if (paramChar <= 'ۓ') return true;
    if (paramChar == 'ە') return true;
    if (paramChar < 'ۥ') return false; if (paramChar <= 'ۦ') return true;
    if (paramChar < 'अ') return false; if (paramChar <= 'ह') return true;
    if (paramChar == 'ऽ') return true;
    if (paramChar < 'क़') return false; if (paramChar <= 'ॡ') return true;
    if (paramChar < 'অ') return false; if (paramChar <= 'ঌ') return true;
    if (paramChar < 'এ') return false; if (paramChar <= 'ঐ') return true;
    if (paramChar < 'ও') return false; if (paramChar <= 'ন') return true;
    if (paramChar < 'প') return false; if (paramChar <= 'র') return true;
    if (paramChar == 'ল') return true;
    if (paramChar < 'শ') return false; if (paramChar <= 'হ') return true;
    if (paramChar < 'ড়') return false; if (paramChar <= 'ঢ়') return true;
    if (paramChar < 'য়') return false; if (paramChar <= 'ৡ') return true;
    if (paramChar < 'ৰ') return false; if (paramChar <= 'ৱ') return true;
    if (paramChar < 'ਅ') return false; if (paramChar <= 'ਊ') return true;
    if (paramChar < 'ਏ') return false; if (paramChar <= 'ਐ') return true;
    if (paramChar < 'ਓ') return false; if (paramChar <= 'ਨ') return true;
    if (paramChar < 'ਪ') return false; if (paramChar <= 'ਰ') return true;
    if (paramChar < 'ਲ') return false; if (paramChar <= 'ਲ਼') return true;
    if (paramChar < 'ਵ') return false; if (paramChar <= 'ਸ਼') return true;
    if (paramChar < 'ਸ') return false; if (paramChar <= 'ਹ') return true;
    if (paramChar < 'ਖ਼') return false; if (paramChar <= 'ੜ') return true;
    if (paramChar == 'ਫ਼') return true;
    if (paramChar < 'ੲ') return false; if (paramChar <= 'ੴ') return true;
    if (paramChar < 'અ') return false; if (paramChar <= 'ઋ') return true;
    if (paramChar == 'ઍ') return true;
    if (paramChar < 'એ') return false; if (paramChar <= 'ઑ') return true;
    if (paramChar < 'ઓ') return false; if (paramChar <= 'ન') return true;
    if (paramChar < 'પ') return false; if (paramChar <= 'ર') return true;
    if (paramChar < 'લ') return false; if (paramChar <= 'ળ') return true;
    if (paramChar < 'વ') return false; if (paramChar <= 'હ') return true;
    if (paramChar == 'ઽ') return true;
    if (paramChar == 'ૠ') return true;
    if (paramChar < 'ଅ') return false; if (paramChar <= 'ଌ') return true;
    if (paramChar < 'ଏ') return false; if (paramChar <= 'ଐ') return true;
    if (paramChar < 'ଓ') return false; if (paramChar <= 'ନ') return true;
    if (paramChar < 'ପ') return false; if (paramChar <= 'ର') return true;
    if (paramChar < 'ଲ') return false; if (paramChar <= 'ଳ') return true;
    if (paramChar < 'ଶ') return false; if (paramChar <= 'ହ') return true;
    if (paramChar == 'ଽ') return true;
    if (paramChar < 'ଡ଼') return false; if (paramChar <= 'ଢ଼') return true;
    if (paramChar < 'ୟ') return false; if (paramChar <= 'ୡ') return true;
    if (paramChar < 'அ') return false; if (paramChar <= 'ஊ') return true;
    if (paramChar < 'எ') return false; if (paramChar <= 'ஐ') return true;
    if (paramChar < 'ஒ') return false; if (paramChar <= 'க') return true;
    if (paramChar < 'ங') return false; if (paramChar <= 'ச') return true;
    if (paramChar == 'ஜ') return true;
    if (paramChar < 'ஞ') return false; if (paramChar <= 'ட') return true;
    if (paramChar < 'ண') return false; if (paramChar <= 'த') return true;
    if (paramChar < 'ந') return false; if (paramChar <= 'ப') return true;
    if (paramChar < 'ம') return false; if (paramChar <= 'வ') return true;
    if (paramChar < 'ஷ') return false; if (paramChar <= 'ஹ') return true;
    if (paramChar < 'అ') return false; if (paramChar <= 'ఌ') return true;
    if (paramChar < 'ఎ') return false; if (paramChar <= 'ఐ') return true;
    if (paramChar < 'ఒ') return false; if (paramChar <= 'న') return true;
    if (paramChar < 'ప') return false; if (paramChar <= 'ళ') return true;
    if (paramChar < 'వ') return false; if (paramChar <= 'హ') return true;
    if (paramChar < 'ౠ') return false; if (paramChar <= 'ౡ') return true;
    if (paramChar < 'ಅ') return false; if (paramChar <= 'ಌ') return true;
    if (paramChar < 'ಎ') return false; if (paramChar <= 'ಐ') return true;
    if (paramChar < 'ಒ') return false; if (paramChar <= 'ನ') return true;
    if (paramChar < 'ಪ') return false; if (paramChar <= 'ಳ') return true;
    if (paramChar < 'ವ') return false; if (paramChar <= 'ಹ') return true;
    if (paramChar == 'ೞ') return true;
    if (paramChar < 'ೠ') return false; if (paramChar <= 'ೡ') return true;
    if (paramChar < 'അ') return false; if (paramChar <= 'ഌ') return true;
    if (paramChar < 'എ') return false; if (paramChar <= 'ഐ') return true;
    if (paramChar < 'ഒ') return false; if (paramChar <= 'ന') return true;
    if (paramChar < 'പ') return false; if (paramChar <= 'ഹ') return true;
    if (paramChar < 'ൠ') return false; if (paramChar <= 'ൡ') return true;
    if (paramChar < 'ก') return false; if (paramChar <= 'ฮ') return true;
    if (paramChar == 'ะ') return true;
    if (paramChar < 'า') return false; if (paramChar <= 'ำ') return true;
    if (paramChar < 'เ') return false; if (paramChar <= 'ๅ') return true;
    if (paramChar < 'ກ') return false; if (paramChar <= 'ຂ') return true;
    if (paramChar == 'ຄ') return true;
    if (paramChar < 'ງ') return false; if (paramChar <= 'ຈ') return true;
    if (paramChar == 'ຊ') return true;
    if (paramChar == 'ຍ') return true;
    if (paramChar < 'ດ') return false; if (paramChar <= 'ທ') return true;
    if (paramChar < 'ນ') return false; if (paramChar <= 'ຟ') return true;
    if (paramChar < 'ມ') return false; if (paramChar <= 'ຣ') return true;
    if (paramChar == 'ລ') return true;
    if (paramChar == 'ວ') return true;
    if (paramChar < 'ສ') return false; if (paramChar <= 'ຫ') return true;
    if (paramChar < 'ອ') return false; if (paramChar <= 'ຮ') return true;
    if (paramChar == 'ະ') return true;
    if (paramChar < 'າ') return false; if (paramChar <= 'ຳ') return true;
    if (paramChar == 'ຽ') return true;
    if (paramChar < 'ເ') return false; if (paramChar <= 'ໄ') return true;
    if (paramChar < 'ཀ') return false; if (paramChar <= 'ཇ') return true;
    if (paramChar < 'ཉ') return false; if (paramChar <= 'ཀྵ') return true;
    if (paramChar < 'Ⴀ') return false; if (paramChar <= 'Ⴥ') return true;
    if (paramChar < 'ა') return false; if (paramChar <= 'ჶ') return true;
    if (paramChar == 'ᄀ') return true;
    if (paramChar < 'ᄂ') return false; if (paramChar <= 'ᄃ') return true;
    if (paramChar < 'ᄅ') return false; if (paramChar <= 'ᄇ') return true;
    if (paramChar == 'ᄉ') return true;
    if (paramChar < 'ᄋ') return false; if (paramChar <= 'ᄌ') return true;
    if (paramChar < 'ᄎ') return false; if (paramChar <= 'ᄒ') return true;
    if (paramChar == 'ᄼ') return true;
    if (paramChar == 'ᄾ') return true;
    if (paramChar == 'ᅀ') return true;
    if (paramChar == 'ᅌ') return true;
    if (paramChar == 'ᅎ') return true;
    if (paramChar == 'ᅐ') return true;
    if (paramChar < 'ᅔ') return false; if (paramChar <= 'ᅕ') return true;
    if (paramChar == 'ᅙ') return true;
    if (paramChar < 'ᅟ') return false; if (paramChar <= 'ᅡ') return true;
    if (paramChar == 'ᅣ') return true;
    if (paramChar == 'ᅥ') return true;
    if (paramChar == 'ᅧ') return true;
    if (paramChar == 'ᅩ') return true;
    if (paramChar < 'ᅭ') return false; if (paramChar <= 'ᅮ') return true;
    if (paramChar < 'ᅲ') return false; if (paramChar <= 'ᅳ') return true;
    if (paramChar == 'ᅵ') return true;
    if (paramChar == 'ᆞ') return true;
    if (paramChar == 'ᆨ') return true;
    if (paramChar == 'ᆫ') return true;
    if (paramChar < 'ᆮ') return false; if (paramChar <= 'ᆯ') return true;
    if (paramChar < 'ᆷ') return false; if (paramChar <= 'ᆸ') return true;
    if (paramChar == 'ᆺ') return true;
    if (paramChar < 'ᆼ') return false; if (paramChar <= 'ᇂ') return true;
    if (paramChar == 'ᇫ') return true;
    if (paramChar == 'ᇰ') return true;
    if (paramChar == 'ᇹ') return true;
    if (paramChar < 'Ḁ') return false; if (paramChar <= 'ẛ') return true;
    if (paramChar < 'Ạ') return false; if (paramChar <= 'ỹ') return true;
    if (paramChar < 'ἀ') return false; if (paramChar <= 'ἕ') return true;
    if (paramChar < 'Ἐ') return false; if (paramChar <= 'Ἕ') return true;
    if (paramChar < 'ἠ') return false; if (paramChar <= 'ὅ') return true;
    if (paramChar < 'Ὀ') return false; if (paramChar <= 'Ὅ') return true;
    if (paramChar < 'ὐ') return false; if (paramChar <= 'ὗ') return true;
    if (paramChar == 'Ὑ') return true;
    if (paramChar == 'Ὓ') return true;
    if (paramChar == 'Ὕ') return true;
    if (paramChar < 'Ὗ') return false; if (paramChar <= 'ώ') return true;
    if (paramChar < 'ᾀ') return false; if (paramChar <= 'ᾴ') return true;
    if (paramChar < 'ᾶ') return false; if (paramChar <= 'ᾼ') return true;
    if (paramChar == 'ι') return true;
    if (paramChar < 'ῂ') return false; if (paramChar <= 'ῄ') return true;
    if (paramChar < 'ῆ') return false; if (paramChar <= 'ῌ') return true;
    if (paramChar < 'ῐ') return false; if (paramChar <= 'ΐ') return true;
    if (paramChar < 'ῖ') return false; if (paramChar <= 'Ί') return true;
    if (paramChar < 'ῠ') return false; if (paramChar <= 'Ῥ') return true;
    if (paramChar < 'ῲ') return false; if (paramChar <= 'ῴ') return true;
    if (paramChar < 'ῶ') return false; if (paramChar <= 'ῼ') return true;
    if (paramChar == 'Ω') return true;
    if (paramChar < 'K') return false; if (paramChar <= 'Å') return true;
    if (paramChar == '℮') return true;
    if (paramChar < 'ↀ') return false; if (paramChar <= 'ↂ') return true;
    if (paramChar == '〇') return true;
    if (paramChar < '〡') return false; if (paramChar <= '〩') return true;
    if (paramChar < 'ぁ') return false; if (paramChar <= 'ゔ') return true;
    if (paramChar < 'ァ') return false; if (paramChar <= 'ヺ') return true;
    if (paramChar < 'ㄅ') return false; if (paramChar <= 'ㄬ') return true;
    if (paramChar < '一') return false; if (paramChar <= 40869) return true;
    if (paramChar < 44032) return false; if (paramChar <= 55203) return true;

    return false;
  }

  public static boolean r(char paramChar)
  {
    return (q(paramChar)) || (o(paramChar));
  }

  public static boolean s(char paramChar)
  {
    return (q(paramChar)) || (o(paramChar)) || (paramChar == '.') || (paramChar == '-') || 
      (paramChar == '_') || (paramChar == ':') || (n(paramChar)) || 
      (p(paramChar));
  }

  public static boolean t(char paramChar)
  {
    return (q(paramChar)) || (paramChar == '_') || (paramChar == ':');
  }

  public static boolean u(char paramChar)
  {
    if ((paramChar >= 'a') && (paramChar <= 'z')) return true;
    if ((paramChar >= '?') && (paramChar <= 'Z')) return true;
    if ((paramChar >= '\'') && (paramChar <= ';')) return true;

    if (paramChar == ' ') return true;
    if (paramChar == '!') return true;
    if (paramChar == '=') return true;
    if (paramChar == '#') return true;
    if (paramChar == '$') return true;
    if (paramChar == '_') return true;
    if (paramChar == '%') return true;
    if (paramChar == '\n') return true;
    if (paramChar == '\r') return true;
    if (paramChar == '\t') return true;

    return false;
  }
}