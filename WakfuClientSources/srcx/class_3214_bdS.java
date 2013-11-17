import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bdS
{
  private static final bdS fqe = new bdS();

  private boolean fqf = true;
  private boolean fqg = true;
  private boolean fqh = true;
  private static final int fqi = 2;
  private static final int fqj = 3;
  private static final int fqk = 8;
  private static final long fql = 900000L;
  private static final int fqm = 4;
  private static final int fqn = 75;
  private static final long fqo = 120000L;
  private static final int fqp = 6;
  private static final long fqq = 5000L;
  private static final int fqr = 10;
  private final LinkedList fqs = new LinkedList();
  private final LinkedList fqt = new LinkedList();
  public static final int fqu = 1;
  public static final int fqv = 2;
  public static final int fqw = 3;
  public static final int fqx = 3;
  private int fqy;
  private int fqz;
  private long fqA;
  private static final String[] fqB = { "nn", "t1", "tien", "mang", "vnd", "té", "fet", "drol", "répon", "kool", "tro", "parl", "toa", "conpran", "mo", "gl", "ak", "chui", "mé", "jé", "tkt", "tou", "comen", "kom", "ogmente", "ji", "esque", "tt", "kelk1", "bi1", "esk", "eske", "doi", "pl1", "nouvo", "veu", "dir", "cose", "gt", "jer", "pr", "serer", "kkn", "tve", "vremen", "vreman", "psk", "osi", "qq1", "orai", "coser", "pe", "tap", "cuncun", "taleur", "p1n", "vé", "kel", "kelle", "kan", "kelkin", "coman", "com", "pt1", "fé", "fére", "coner", "fo", "conner", "tré", "kk1", "ls", "ven", "pren", "sava", "b1", "sui", "gen", "dan", "jvé", "ke", "jen", "mar", "vré", "fon", "pk", "ka", "jpe", "kik", "kkun", "ki", "coné", "conné", "répondé", "r1", "p1", "devi1", "koman", "komen", "tlm", "kess", "koi", "tm", "di", "ss", "mnt", "cmb", "2m1", "ac", "issi", "pq", "pouré", "d1", "langaj", "ds", "é", "c", "selman", "paske", "ané", "ser", "dvu", "dla", "pt", "lé", "propoz", "ms", "t", "g", "sé", "slt", "vs", "ns", "slmt", "alor", "jté", "kon", "dsl", "bjr", "mm", "fair", "fér", "pa", "gg", "jte", "d", "qq", "kelke", "repren", "cetai", "mai", "dacor", "plai", "mci", "esqui", "quan", "desoler", "jecri", "kestion", "ve", "qqn", "vien", "cmt", "cb", "bo", "hom", "fam", "kelkun", "konba", "ske", "francé", "cop1", "copin", "pourkoi", "peti", "stille", "dotre", "kil", "jamé", "grav", "pev", "kompendr", "trouv", "peuv", "att", "achet", "ano", "coif", "coiff", "deu", "plé", "plin", "tjs", "dr1", "jve", "coi", "lon", "fai", "ekipement", "jofre", "kelkechose", "kkchose", "nivo", "cintur", "cinture", "equipemen", "commen", "tar", "pcq", "fallai", "ptin", "fau", "srx", "nou", "vou", "ékip", "vo", "toré", "rep", "qi", "sal", "voi", "kelchose", "jven", "dj", "chu", "qe", "choi", "plu", "médé", "marké", "jaité", "consé", "bocoup", "connaissé", "deg", "dég", "maren", "maran", "vai" };

  private static final Pattern fqC = Pattern.compile(str, 2);
  private static Pattern fqD;

  public static bdS brU()
  {
    return fqe;
  }

  private bdS()
  {
    if (!this.fqf) {
      return;
    }

    for (int i = 0; i < 10; i++) {
      this.fqs.add(new Cs("vide-" + i, Long.valueOf(0L)));
    }

    for (i = 0; i < 10; i++)
      this.fqt.add(new Cs(new czx(null, -1), Long.valueOf(0L)));
  }

  public dId b(czx paramczx)
  {
    return a(paramczx, System.currentTimeMillis());
  }

  public dId a(czx paramczx, long paramLong)
  {
    if (!this.fqf) {
      return dId.lSW;
    }

    if (paramczx == null) {
      return dId.lSV;
    }

    if (this.fqh) {
      dId localdId = c(paramczx, paramLong);
      if (localdId == dId.lSX) {
        b(paramczx, paramLong);
        return localdId;
      }
    }

    b(paramczx, paramLong);
    return dId.lSW;
  }

  public dId ia(String paramString)
  {
    return d(paramString, System.currentTimeMillis());
  }

  public dId d(String paramString, long paramLong)
  {
    if (!this.fqf) {
      return dId.lSW;
    }

    if (paramString == null) {
      return dId.lSV;
    }

    String str = ib(paramString);
    dId localdId;
    if (this.fqh) {
      localdId = f(str, paramLong);
      if (localdId == dId.lSX) {
        e(str, paramLong);
        return localdId;
      }
    }

    if (this.fqg) {
      localdId = g(str, paramLong);
      if ((localdId == dId.lSY) || (localdId == dId.lSZ)) {
        e(str, paramLong);
        return localdId;
      }
    }

    e(str, paramLong);
    return dId.lSW;
  }

  private void e(String paramString, long paramLong)
  {
    Cs localCs = (Cs)this.fqs.removeLast();
    localCs.w(paramString);
    localCs.x(Long.valueOf(paramLong));
    this.fqs.addFirst(localCs);
  }

  private void b(czx paramczx, long paramLong)
  {
    Cs localCs = (Cs)this.fqt.removeLast();
    localCs.w(paramczx);
    localCs.x(Long.valueOf(paramLong));
    this.fqt.addFirst(localCs);
  }

  private dId c(czx paramczx, long paramLong)
  {
    if (((Long)((Cs)this.fqt.get(5)).Lp()).longValue() + 5000L > paramLong) {
      return dId.lSX;
    }

    int i = 0;
    for (Cs localCs : this.fqt) {
      if (((Long)localCs.Lp()).longValue() + 120000L < paramLong) {
        break;
      }
      if (paramczx.c((czx)localCs.getFirst())) {
        i++;
      }
    }
    if (i + 1 >= 4) {
      return dId.lSX;
    }

    return dId.lSW;
  }

  private dId f(String paramString, long paramLong)
  {
    if (((Long)((Cs)this.fqs.get(5)).Lp()).longValue() + 5000L > paramLong) {
      return dId.lSX;
    }

    int i = 0;
    for (Cs localCs : this.fqs) {
      if (((Long)localCs.Lp()).longValue() + 120000L < paramLong) {
        break;
      }
      if (V(paramString, (String)localCs.getFirst()) >= 75) {
        i++;
      }
    }
    if (i + 1 >= 4) {
      return dId.lSX;
    }

    return dId.lSW;
  }

  private dId g(String paramString, long paramLong)
  {
    if (paramLong >= this.fqA + 900000L) {
      this.fqy = 0;
      this.fqz = 0;
    }

    if (ic(paramString) >= 2) {
      this.fqy += 1;
      this.fqz += 1;
      this.fqA = paramLong;

      if (this.fqz >= 8)
        return dId.lSZ;
      if (this.fqy >= 3) {
        this.fqy = 0;
        return dId.lSY;
      }
    }

    return dId.lSW;
  }

  private int V(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {
      return 0;
    }

    int i = cOg.q(paramString1, paramString2);
    return 100 - (int)(i / Math.max(paramString1.length(), paramString2.length()) * 100.0F);
  }

  public String ib(String paramString)
  {
    String str = paramString.toLowerCase();
    str = str.replaceAll("(\\?|\\!|\\,|\\;|\\.|\\/|\\*|\\@|\\#|\\\")", "");
    str = str.replaceAll("(á|à|â|ä|ã)", "a");
    str = str.replaceAll("(è|ê|ë)", "e");
    str = str.replaceAll("(í|ì|ï|î)", "i");
    str = str.replaceAll("(ó|ò|ö|ô)", "o");
    str = str.replaceAll("(ú|ù|ü|û)", "u");
    str = str.replaceAll("(ñ)", "n");
    str = str.replaceAll("(ç)", "c");
    str = str.replaceAll("(-)", " ");
    str = str.replaceAll("(')", "' ");
    str = str.replaceAll("([ ]+)", " ");
    str = str.trim();
    return str;
  }

  private int ic(String paramString)
  {
    if (fqD == null) {
      return -1;
    }

    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString1 = dzp.c(paramString.trim(), ' ');
    for (String str : arrayOfString1) {
      Matcher localMatcher = fqD.matcher(str.trim());
      if ((localMatcher.find()) && (!localArrayList.contains(localMatcher.group().trim()))) {
        localArrayList.add(localMatcher.group().trim());
      }

    }

    return localArrayList.size();
  }

  public static void b(cFI paramcFI) {
    switch (ciV.hIm[paramcFI.ordinal()]) {
    case 1:
      fqD = fqC;
      break;
    default:
      fqD = null;
    }
  }

  private static void i(String paramString, String[] paramArrayOfString)
  {
    int i = 1;

    for (String str1 : paramArrayOfString) {
      int m = 0;
      for (String str2 : paramArrayOfString) {
        if (str2.equalsIgnoreCase(str1)) {
          m++; if (m > 1) {
            i = 0;
            System.out.println("\t! [" + paramString + "] " + "Multiples correspondances : " + str1 + ", " + str2);
          }
        }
      }

      if (str1.matches("((.|\n)*(è|ê|ë|à|â|ä|ì|ï|î|ò|ö|ô|ù|ü|û|\\?|\\!|\\,|\\;|\\.|\\/|\\*|\\@|\\#|\\\")(.|\n)*)")) {
        i = 0;
        System.out.println("\t! [" + paramString + "] " + "Contient des caractères ignorés : " + str1);
      }
    }

    System.out.println("[" + paramString + "] " + "Liste de mots valide : " + (i != 0 ? "OK." : "ERROR."));
  }

  public static void main(String[] paramArrayOfString)
  {
    b(cFI.iAl);
    i("FR", fqB);

    String str1 = "!! Hello les gens comment      tu vas ?! Bien ? Ici, c'est super cool *top méga gèniàl*! On se croirait a \"Saint-Laurent-du-var\"!!";
    System.out.println("-----");
    System.out.println("Phrase       : !! Hello les gens comment      tu vas ?! Bien ? Ici, c'est super cool *top méga gèniàl*! On se croirait a \"Saint-Laurent-du-var\"!!");
    System.out.println("Phrase clean : " + brU().ib("!! Hello les gens comment      tu vas ?! Bien ? Ici, c'est super cool *top méga gèniàl*! On se croirait a \"Saint-Laurent-du-var\"!!"));

    String str2 = brU().ib("Ceci est une phrase test d'une longueur   de 10 mots");
    String str3 = brU().ib("Ceci est une phrase bidon d'une taille de 8 mots");
    System.out.println("-----");
    System.out.println("Phrase 1 : " + str2);
    System.out.println("Phrase 2 : " + str3);
    System.out.println("Compare  : " + brU().V(str2, str3) + "%");

    String str4 = brU().ib("é si tu  é t changes un peu ta phrase, au bout sde 10 il se rend compte que c'est presque la même et t'as pas le droit non plus");
    System.out.println("-----");
    System.out.println("Phrase test SMS : " + brU().ib(str4));
    System.out.println("SMS détecté : " + (brU().ic(str4) >= 2));
    System.out.println("-----");

    String str5 = "19500";
    Pattern localPattern = Pattern.compile("^([^1][0-9]*)$");
    Matcher localMatcher = localPattern.matcher("19500");
    System.out.println("Match " + localMatcher.matches());
  }

  static
  {
    String str = "\\A(";
    for (int i = 0; i < fqB.length; i++) {
      if (i > 0) {
        str = str + "|";
      }
      str = str + fqB[i];
    }
    str = str + ")\\z";
  }
}