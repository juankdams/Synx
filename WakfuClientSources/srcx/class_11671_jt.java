import java.util.ArrayList;

public class jt extends cGj
{
  public static final String aLh = "description";
  public static final String aLi = "firstRankReward";
  public static final String aLj = "secondRankReward";
  public static final String aLk = "thirdRankReward";
  private final ArrayList aLl = new ArrayList();
  private String aLm;

  public jt(String paramString)
  {
    this.aLm = paramString;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("description"))
      return this.aLm;
    if (paramString.equals("firstRankReward")) {
      if (this.aLl.size() >= 1)
        return this.aLl.get(0);
    }
    else if (paramString.equals("secondRankReward")) {
      if (this.aLl.size() >= 2)
        return this.aLl.get(1);
    }
    else if ((paramString.equals("thirdRankReward")) && 
      (this.aLl.size() >= 3)) {
      return this.aLl.get(2);
    }

    return null;
  }

  public void a(aKo paramaKo) {
    this.aLl.add(paramaKo);
    dLE.doY().a(this, new String[] { "firstRankReward", "secondRankReward", "thirdRankReward" });
  }
}