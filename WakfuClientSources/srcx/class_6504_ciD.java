public class ciD
{
  private static final String[][] hHH = { { " ", "&nbsp;" }, { "¡", "&iexcl;" }, { "¢", "&cent;" }, { "£", "&pound;" }, { "¤", "&curren;" }, { "¥", "&yen;" }, { "¦", "&brvbar;" }, { "§", "&sect;" }, { "¨", "&uml;" }, { "©", "&copy;" }, { "ª", "&ordf;" }, { "«", "&laquo;" }, { "¬", "&not;" }, { "­", "&shy;" }, { "®", "&reg;" }, { "¯", "&macr;" }, { "°", "&deg;" }, { "±", "&plusmn;" }, { "²", "&sup2;" }, { "³", "&sup3;" }, { "´", "&acute;" }, { "µ", "&micro;" }, { "¶", "&para;" }, { "·", "&middot;" }, { "¸", "&cedil;" }, { "¹", "&sup1;" }, { "º", "&ordm;" }, { "»", "&raquo;" }, { "¼", "&frac14;" }, { "½", "&frac12;" }, { "¾", "&frac34;" }, { "¿", "&iquest;" }, { "À", "&Agrave;" }, { "Á", "&Aacute;" }, { "Â", "&Acirc;" }, { "Ã", "&Atilde;" }, { "Ä", "&Auml;" }, { "Å", "&Aring;" }, { "Æ", "&AElig;" }, { "Ç", "&Ccedil;" }, { "È", "&Egrave;" }, { "É", "&Eacute;" }, { "Ê", "&Ecirc;" }, { "Ë", "&Euml;" }, { "Ì", "&Igrave;" }, { "Í", "&Iacute;" }, { "Î", "&Icirc;" }, { "Ï", "&Iuml;" }, { "Ð", "&ETH;" }, { "Ñ", "&Ntilde;" }, { "Ò", "&Ograve;" }, { "Ó", "&Oacute;" }, { "Ô", "&Ocirc;" }, { "Õ", "&Otilde;" }, { "Ö", "&Ouml;" }, { "×", "&times;" }, { "Ø", "&Oslash;" }, { "Ù", "&Ugrave;" }, { "Ú", "&Uacute;" }, { "Û", "&Ucirc;" }, { "Ü", "&Uuml;" }, { "Ý", "&Yacute;" }, { "Þ", "&THORN;" }, { "ß", "&szlig;" }, { "à", "&agrave;" }, { "á", "&aacute;" }, { "â", "&acirc;" }, { "ã", "&atilde;" }, { "ä", "&auml;" }, { "å", "&aring;" }, { "æ", "&aelig;" }, { "ç", "&ccedil;" }, { "è", "&egrave;" }, { "é", "&eacute;" }, { "ê", "&ecirc;" }, { "ë", "&euml;" }, { "ì", "&igrave;" }, { "í", "&iacute;" }, { "î", "&icirc;" }, { "ï", "&iuml;" }, { "ð", "&eth;" }, { "ñ", "&ntilde;" }, { "ò", "&ograve;" }, { "ó", "&oacute;" }, { "ô", "&ocirc;" }, { "õ", "&otilde;" }, { "ö", "&ouml;" }, { "÷", "&divide;" }, { "ø", "&oslash;" }, { "ù", "&ugrave;" }, { "ú", "&uacute;" }, { "û", "&ucirc;" }, { "ü", "&uuml;" }, { "ý", "&yacute;" }, { "þ", "&thorn;" }, { "ÿ", "&yuml;" } };

  private static final String[][] hHI = a(hHH);

  private static final String[][] hHJ = { { "ƒ", "&fnof;" }, { "Α", "&Alpha;" }, { "Β", "&Beta;" }, { "Γ", "&Gamma;" }, { "Δ", "&Delta;" }, { "Ε", "&Epsilon;" }, { "Ζ", "&Zeta;" }, { "Η", "&Eta;" }, { "Θ", "&Theta;" }, { "Ι", "&Iota;" }, { "Κ", "&Kappa;" }, { "Λ", "&Lambda;" }, { "Μ", "&Mu;" }, { "Ν", "&Nu;" }, { "Ξ", "&Xi;" }, { "Ο", "&Omicron;" }, { "Π", "&Pi;" }, { "Ρ", "&Rho;" }, { "Σ", "&Sigma;" }, { "Τ", "&Tau;" }, { "Υ", "&Upsilon;" }, { "Φ", "&Phi;" }, { "Χ", "&Chi;" }, { "Ψ", "&Psi;" }, { "Ω", "&Omega;" }, { "α", "&alpha;" }, { "β", "&beta;" }, { "γ", "&gamma;" }, { "δ", "&delta;" }, { "ε", "&epsilon;" }, { "ζ", "&zeta;" }, { "η", "&eta;" }, { "θ", "&theta;" }, { "ι", "&iota;" }, { "κ", "&kappa;" }, { "λ", "&lambda;" }, { "μ", "&mu;" }, { "ν", "&nu;" }, { "ξ", "&xi;" }, { "ο", "&omicron;" }, { "π", "&pi;" }, { "ρ", "&rho;" }, { "ς", "&sigmaf;" }, { "σ", "&sigma;" }, { "τ", "&tau;" }, { "υ", "&upsilon;" }, { "φ", "&phi;" }, { "χ", "&chi;" }, { "ψ", "&psi;" }, { "ω", "&omega;" }, { "ϑ", "&thetasym;" }, { "ϒ", "&upsih;" }, { "ϖ", "&piv;" }, { "•", "&bull;" }, { "…", "&hellip;" }, { "′", "&prime;" }, { "″", "&Prime;" }, { "‾", "&oline;" }, { "⁄", "&frasl;" }, { "℘", "&weierp;" }, { "ℑ", "&image;" }, { "ℜ", "&real;" }, { "™", "&trade;" }, { "ℵ", "&alefsym;" }, { "←", "&larr;" }, { "↑", "&uarr;" }, { "→", "&rarr;" }, { "↓", "&darr;" }, { "↔", "&harr;" }, { "↵", "&crarr;" }, { "⇐", "&lArr;" }, { "⇑", "&uArr;" }, { "⇒", "&rArr;" }, { "⇓", "&dArr;" }, { "⇔", "&hArr;" }, { "∀", "&forall;" }, { "∂", "&part;" }, { "∃", "&exist;" }, { "∅", "&empty;" }, { "∇", "&nabla;" }, { "∈", "&isin;" }, { "∉", "&notin;" }, { "∋", "&ni;" }, { "∏", "&prod;" }, { "∑", "&sum;" }, { "−", "&minus;" }, { "∗", "&lowast;" }, { "√", "&radic;" }, { "∝", "&prop;" }, { "∞", "&infin;" }, { "∠", "&ang;" }, { "∧", "&and;" }, { "∨", "&or;" }, { "∩", "&cap;" }, { "∪", "&cup;" }, { "∫", "&int;" }, { "∴", "&there4;" }, { "∼", "&sim;" }, { "≅", "&cong;" }, { "≈", "&asymp;" }, { "≠", "&ne;" }, { "≡", "&equiv;" }, { "≤", "&le;" }, { "≥", "&ge;" }, { "⊂", "&sub;" }, { "⊃", "&sup;" }, { "⊆", "&sube;" }, { "⊇", "&supe;" }, { "⊕", "&oplus;" }, { "⊗", "&otimes;" }, { "⊥", "&perp;" }, { "⋅", "&sdot;" }, { "⌈", "&lceil;" }, { "⌉", "&rceil;" }, { "⌊", "&lfloor;" }, { "⌋", "&rfloor;" }, { "〈", "&lang;" }, { "〉", "&rang;" }, { "◊", "&loz;" }, { "♠", "&spades;" }, { "♣", "&clubs;" }, { "♥", "&hearts;" }, { "♦", "&diams;" }, { "Œ", "&OElig;" }, { "œ", "&oelig;" }, { "Š", "&Scaron;" }, { "š", "&scaron;" }, { "Ÿ", "&Yuml;" }, { "ˆ", "&circ;" }, { "˜", "&tilde;" }, { " ", "&ensp;" }, { " ", "&emsp;" }, { " ", "&thinsp;" }, { "‌", "&zwnj;" }, { "‍", "&zwj;" }, { "‎", "&lrm;" }, { "‏", "&rlm;" }, { "–", "&ndash;" }, { "—", "&mdash;" }, { "‘", "&lsquo;" }, { "’", "&rsquo;" }, { "‚", "&sbquo;" }, { "“", "&ldquo;" }, { "”", "&rdquo;" }, { "„", "&bdquo;" }, { "†", "&dagger;" }, { "‡", "&Dagger;" }, { "‰", "&permil;" }, { "‹", "&lsaquo;" }, { "›", "&rsaquo;" }, { "€", "&euro;" } };

  private static final String[][] hHK = a(hHJ);

  private static final String[][] hHL = { { "\"", "&quot;" }, { "&", "&amp;" }, { "<", "&lt;" }, { ">", "&gt;" } };

  private static final String[][] hHM = a(hHL);

  private static final String[][] hHN = { { "'", "&apos;" } };

  private static final String[][] hHO = a(hHN);

  private static final String[][] hHP = { { "\b", "\\b" }, { "\n", "\\n" }, { "\t", "\\t" }, { "\f", "\\f" }, { "\r", "\\r" } };

  private static final String[][] hHQ = a(hHP);

  public static String[][] cko()
  {
    return (String[][])hHH.clone();
  }

  public static String[][] ckp()
  {
    return (String[][])hHI.clone();
  }

  public static String[][] ckq()
  {
    return (String[][])hHJ.clone();
  }

  public static String[][] ckr()
  {
    return (String[][])hHK.clone();
  }

  public static String[][] cks()
  {
    return (String[][])hHL.clone();
  }

  public static String[][] ckt()
  {
    return (String[][])hHM.clone();
  }

  public static String[][] cku()
  {
    return (String[][])hHN.clone();
  }

  public static String[][] ckv()
  {
    return (String[][])hHO.clone();
  }

  public static String[][] ckw()
  {
    return (String[][])hHP.clone();
  }

  public static String[][] ckx()
  {
    return (String[][])hHQ.clone();
  }

  public static String[][] a(String[][] paramArrayOfString)
  {
    String[][] arrayOfString = new String[paramArrayOfString.length][2];
    for (int i = 0; i < paramArrayOfString.length; i++) {
      arrayOfString[i][0] = paramArrayOfString[i][1];
      arrayOfString[i][1] = paramArrayOfString[i][0];
    }
    return arrayOfString;
  }
}