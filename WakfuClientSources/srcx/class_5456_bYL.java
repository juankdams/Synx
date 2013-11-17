import java.text.DecimalFormat;
import java.text.NumberFormat;

class bYL extends cGj
{
  public static final String hoA = "nationalFunds";
  public static final String hoB = "collectedTaxes";
  public static final String hoC = "totalCost";
  public static final String hoD = "challengeCost";
  public static final String hoE = "climateCost";
  public static final String hoF = "animalCost";
  private dOj ak;

  public bYL(bPE parambPE, dOj paramdOj)
  {
    this.ak = paramdOj;
  }

  public String[] getFields() {
    return new String[0];
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("nationalFunds"))
      return DecimalFormat.getIntegerInstance().format(this.ak.rD()) + " §";
    int i;
    jR localjR;
    if (paramString.equals("collectedTaxes")) {
      i = 0;
      for (localjR = this.ak.dqn().abM(); localjR.hasNext(); ) {
        localjR.fl();
        i += localjR.value();
      }
      return DecimalFormat.getIntegerInstance().format(i) + " §";
    }if (paramString.equals("totalCost")) {
      i = 0;
      for (localjR = this.ak.dqm().abM(); localjR.hasNext(); ) {
        localjR.fl();
        i += localjR.value();
      }
      return DecimalFormat.getIntegerInstance().format(i) + " §";
    }if (paramString.equals("challengeCost")) {
      i = this.ak.dqm().ap(cQn.kBg.xH());
      return DecimalFormat.getIntegerInstance().format(i) + " §";
    }if (paramString.equals("climateCost")) {
      i = this.ak.dqm().ap(cQn.kBi.xH());
      return DecimalFormat.getIntegerInstance().format(i) + " §";
    }if (paramString.equals("animalCost")) {
      i = this.ak.dqm().ap(cQn.kBh.xH());
      return DecimalFormat.getIntegerInstance().format(i) + " §";
    }
    return null;
  }
}