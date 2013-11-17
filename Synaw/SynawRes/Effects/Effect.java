package Effects;
public class Effect extends aWT  //class_9538_dkF
{
	
  // { v types
  public static final int dFN = -1;
  public static final int lhN = 1000;
  public static final int lhO = 1001;
  public static final int lhP = 1002;
  public static final int lhQ = 1003;
  public static final int lhR = 1004;
  public static final int lhS = 1005;
  public static final int lhT = 1006;
  public static final int lhU = 1007;
  public static final int lhV = 1008;
  public static final int lhW = 1009;
  public static final int lhX = 1010;
  public static final int lhY = 1011;
  public static final int lhZ = 1012;
  public static final int lia = 1013;
  public static final int lib = 1014;
  public static final int lic = 1015;
  public static final int lid = 1016;
  public static final int lie = 1017;
  public static final int lif = 1018;
  public static final int lig = 1029;
  public static final int lih = 1031;
  public static final int lii = 1032;
  public static final int lij = 1033;
  public static final int lik = 1035;
  // ^  types }
  
  private String description;
  private int type;

  public Effect(int paramInt1, doA paramdoA, avY paramavY, int paramInt2, String paramString, cMe paramcMe)
  {
    super(paramInt1, paramdoA, paramavY);
    paramdoA.d(paramInt1);
    paramdoA.a(paramcMe);
    paramdoA.bkd();
    this.description = paramString;
    this.type = paramInt2;
  }

  public String pm() {
    return this.description;
  }

  public int uN() {
    return this.type;
  }

  public boolean At(int paramInt)
  {
    return ((doA)getObject()).aF().cu(paramInt);
  }
}