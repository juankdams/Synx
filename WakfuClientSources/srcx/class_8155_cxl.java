import java.util.Date;

public class cxl extends kt
{
  private static final String[] ike = { "Dim.", "Lun.", "Mar.", "Mer.", "Jeu.", "Ven.", "Sam." };

  public cxl(String paramString1, String paramString2, bTd parambTd) {
    super(paramString1, paramString2, parambTd);
  }

  public cxl(String paramString1, String paramString2) {
    super(paramString1, paramString2);
  }

  public String A(boolean paramBoolean) {
    if (!(this.aOd instanceof Long)) {
      return super.A(paramBoolean);
    }
    if (((Long)this.aOd).longValue() <= 0L) {
      return "-";
    }
    Date localDate = new Date(((Long)this.aOd).longValue());
    String str1 = ike[localDate.getDay()] + " " + localDate.getDate() + "/" + (localDate.getMonth() + 1) + " " + (localDate.getYear() + 1900);
    String str2 = (localDate.getHours() < 10 ? "0" + localDate.getHours() : Integer.valueOf(localDate.getHours())) + ":" + (localDate.getMinutes() < 10 ? "0" + localDate.getMinutes() : Integer.valueOf(localDate.getMinutes()));
    return str1 + " à " + str2;
  }
}