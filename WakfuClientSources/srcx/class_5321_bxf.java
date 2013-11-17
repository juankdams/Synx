class bxf
  implements bZs
{
  private boolean first = true;

  bxf(akR paramakR, StringBuilder paramStringBuilder) {  } 
  public boolean f(Object paramObject1, Object paramObject2) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramObject1);
    this.aBU.append("=");
    this.aBU.append(paramObject2);
    return true;
  }
}