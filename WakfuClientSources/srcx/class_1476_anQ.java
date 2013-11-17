import java.util.ArrayList;
import java.util.Collection;

public class anQ extends bxE
  implements fu
{
  public static final String TAG = "Condition";
  private Sj drJ;
  private Object aOd = Boolean.valueOf(true);
  private boolean drK;
  private Object drL = Boolean.valueOf(false);
  private boolean drM;
  private boolean drN;
  private final Collection drO = new ArrayList();
  protected aWj drP;
  public static final int crX = "value".hashCode();
  public static final int drQ = "elseValue".hashCode();
  public static final int drR = "returnOriginalValue".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof Sj))
      setCondition((Sj)paramaNL);
    else if ((paramaNL instanceof anQ)) {
      a((anQ)paramaNL);
    }
    super.a(paramaNL);
  }

  public String getTag()
  {
    return "Condition";
  }

  public Object getResult(Object paramObject) {
    Object localObject1 = (this.drK) || (!this.drN) ? this.aOd : paramObject;
    Object localObject2 = (this.drM) || (!this.drN) ? this.drL : paramObject;

    if (this.drO.isEmpty()) {
      return this.drJ.isValid(paramObject) ? localObject1 : localObject2;
    }

    for (anQ localanQ : this.drO) {
      if (localanQ.drJ.isValid(paramObject)) {
        return localanQ.isComposite() ? localanQ.getResult(paramObject) : localanQ.aOd;
      }
    }

    return localObject2;
  }

  public Sj getCondition() {
    return this.drJ;
  }

  public void setCondition(Sj paramSj) {
    this.drJ = paramSj;
    if (this.drJ != null)
      this.drJ.setConditionParent(this);
  }

  public Object getElseValue()
  {
    return this.drL;
  }

  public void setElseValue(Object paramObject) {
    this.drL = paramObject;
    this.drM = true;
  }

  public void setElseValue(String paramString) {
    this.drL = paramString;
    this.drM = true;
  }

  public Object getValue() {
    return this.aOd;
  }

  public void setValue(Object paramObject) {
    this.aOd = paramObject;
    this.drK = true;
  }

  public void setValue(String paramString) {
    this.aOd = paramString;
    this.drK = true;
  }

  public boolean isReturnOriginalValue() {
    return this.drN;
  }

  public void setReturnOriginalValue(boolean paramBoolean) {
    this.drN = paramBoolean;
  }

  public void bm(boolean paramBoolean) {
    if ((paramBoolean) && (this.drP != null)) {
      this.drP.a(this);
    }
    aAj();
  }

  public void aAj() {
    aNL localaNL;
    do
      localaNL = getParent();
    while (((localaNL instanceof Sj)) || ((localaNL instanceof anQ)));
    if ((localaNL instanceof eR)) {
      eR localeR = (eR)localaNL;
      localeR.getManager().aLp();
    }
  }

  public void setResultProviderParent(aWj paramaWj) {
    this.drP = paramaWj;
  }

  public void a(anQ paramanQ) {
    this.drO.add(paramanQ);
  }

  public boolean isComposite() {
    return !this.drO.isEmpty();
  }

  public void c(bdj parambdj)
  {
    anQ localanQ = (anQ)parambdj;
    super.c(localanQ);
    if (this.drK) {
      localanQ.setValue(this.aOd);
    }
    if (this.drM) {
      localanQ.setElseValue(this.drL);
    }
    localanQ.drN = this.drN;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drQ)
      setElseValue(paramaKN.gL(paramString));
    else if (paramInt == crX)
      setValue(paramaKN.gL(paramString));
    else if (paramInt == drR)
      this.drN = bUD.getBoolean(paramString);
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == drQ)
      setElseValue(paramObject);
    else if (paramInt == crX)
      setValue(paramObject);
    else if (paramInt == drR)
      this.drN = bUD.getBoolean(paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}