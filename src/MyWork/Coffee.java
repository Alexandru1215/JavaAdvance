package MyWork;

public enum Coffee {

    LATTE("RISTRETO",12),
    AMERICANO("IRISH",10),
    IRISH("RISTRETO",9);

  private String  coffee;
  private int price;

    Coffee(final String coffee, final int price){
        this.coffee=coffee;
        this.price=price;
    }
    String getValue(){
        return coffee;
    }
    int getPrice(){
        return price;
    }
    void setCoffee(String coffee){
        this.coffee=coffee;
    }
    void setValue(final int price){
        this.price=price;
    }

    public static Coffee getByValue(final String identifier){
        for(Coffee value : Coffee.values()){
            if(identifier.equals(value.getValue())){
                return value;
            }
        }
        return null;
    }
}
