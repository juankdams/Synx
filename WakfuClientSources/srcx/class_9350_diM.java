public class diM
  implements adL
{
  private final dhJ leW;

  public diM(dhJ paramdhJ)
  {
    this.leW = paramdhJ;
  }

  public apX e(aiZ paramaiZ)
  {
    Object localObject = null;
    switch (paramaiZ.type) {
    case 1:
      localObject = new apX();

      break;
    case 2:
      localObject = new amm(this.leW);
    }

    if ((localObject != null) && (((apX)localObject).c(paramaiZ))) {
      return localObject;
    }
    return null;
  }
}