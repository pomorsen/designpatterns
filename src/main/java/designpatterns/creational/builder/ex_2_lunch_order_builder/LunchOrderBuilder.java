package designpatterns.creational.builder.ex_2_lunch_order_builder;

class LunchOrder {
  private String bread;
  private String dressing;
  private String condiments;
  private String meat;

  LunchOrder(String bread, String dressing, String condiments, String meat) {
    this.bread = bread;
    this.dressing = dressing;
    this.condiments = condiments;
    this.meat = meat;
  }

  public static LunchOrderBuilder builder() {
    return new LunchOrderBuilder();
  }

  public String getBread() {
    return this.bread;
  }

  public String getDressing() {
    return this.dressing;
  }

  public String getCondiments() {
    return this.condiments;
  }

  public String getMeat() {
    return this.meat;
  }

  public void setBread(String bread) {
    this.bread = bread;
  }

  public void setDressing(String dressing) {
    this.dressing = dressing;
  }

  public void setCondiments(String condiments) {
    this.condiments = condiments;
  }

  public void setMeat(String meat) {
    this.meat = meat;
  }

  public static class LunchOrderBuilder {
    private String bread;
    private String dressing;
    private String condiments;
    private String meat;

    LunchOrderBuilder() {}

    public LunchOrderBuilder bread(String bread) {
      this.bread = bread;
      return this;
    }

    public LunchOrderBuilder dressing(String dressing) {
      this.dressing = dressing;
      return this;
    }

    public LunchOrderBuilder condiments(String condiments) {
      this.condiments = condiments;
      return this;
    }

    public LunchOrderBuilder meat(String meat) {
      this.meat = meat;
      return this;
    }

    public LunchOrder build() {
      return new LunchOrder(this.bread, this.dressing, this.condiments, this.meat);
    }
  }
}
