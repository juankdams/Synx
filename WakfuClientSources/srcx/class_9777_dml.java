class dml
  implements bhG
{
  private boolean first = true;

  dml(aoL paramaoL, StringBuilder paramStringBuilder) {  } 
  public boolean a(long paramLong, Object paramObject) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramLong);
    this.aBU.append("=");
    this.aBU.append(paramObject);
    return true;
  }
}